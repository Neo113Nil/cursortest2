package com.anythink.core.common.v.a;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class f {

    /* renamed from: c, reason: collision with root package name */
    private static String f16572c = "f";

    /* renamed from: a, reason: collision with root package name */
    final int f16573a;

    /* renamed from: b, reason: collision with root package name */
    final ViewTreeObserver.OnPreDrawListener f16574b;

    /* renamed from: d, reason: collision with root package name */
    private int f16575d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList<View> f16576e;

    /* renamed from: f, reason: collision with root package name */
    private long f16577f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<View, a> f16578g;

    /* renamed from: h, reason: collision with root package name */
    private final b f16579h;
    private d i;

    /* renamed from: j, reason: collision with root package name */
    private final c f16580j;

    /* renamed from: k, reason: collision with root package name */
    private final Handler f16581k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f16582l;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f16584a;

        /* renamed from: b, reason: collision with root package name */
        int f16585b;

        /* renamed from: c, reason: collision with root package name */
        long f16586c;

        /* renamed from: d, reason: collision with root package name */
        View f16587d;

        /* renamed from: e, reason: collision with root package name */
        Integer f16588e;
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static String f16589a = "b";

        /* renamed from: b, reason: collision with root package name */
        private final Rect f16590b;

        /* renamed from: c, reason: collision with root package name */
        private int f16591c;

        public b() {
            this.f16590b = new Rect();
            this.f16591c = 1;
        }

        private static boolean a(long j6, int i) {
            return SystemClock.uptimeMillis() - j6 >= ((long) i);
        }

        public final boolean a(View view, View view2, int i, Integer num) {
            if (view2 != null && view != null) {
                try {
                    if (view.getParent() != null && view2.getWindowVisibility() == 0) {
                        if ((this.f16591c == 1 && !view2.hasWindowFocus()) || !view2.getGlobalVisibleRect(this.f16590b)) {
                            return false;
                        }
                        long height = this.f16590b.height() * this.f16590b.width();
                        long height2 = view2.getHeight() * view2.getWidth();
                        if (height2 <= 0) {
                            return false;
                        }
                        if ((num == null || num.intValue() <= 0 || height >= num.intValue()) && height * 100 >= i * height2) {
                            return view2.isShown();
                        }
                        return false;
                    }
                } catch (Throwable th) {
                    Log.e(f16589a, "checkVisibilityPercent error: " + th.getMessage());
                    th.printStackTrace();
                }
            }
            return false;
        }

        public b(int i) {
            this.f16590b = new Rect();
            this.f16591c = i;
        }

        public static int a(View view) {
            try {
                view.getGlobalVisibleRect(new Rect());
                return (int) ((((r0.height() * r0.width()) * 1.0d) / (view.getHeight() * view.getWidth())) * 100.0d);
            } catch (Throwable unused) {
                return 100;
            }
        }
    }

    public class c implements Runnable {

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList<View> f16594c = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<View> f16593b = new ArrayList<>();

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (Map.Entry entry : f.this.f16578g.entrySet()) {
                View view = (View) entry.getKey();
                int i = ((a) entry.getValue()).f16584a;
                int i6 = ((a) entry.getValue()).f16585b;
                Integer num = ((a) entry.getValue()).f16588e;
                View view2 = ((a) entry.getValue()).f16587d;
                if (f.this.f16579h.a(view2, view, i, num)) {
                    this.f16593b.add(view);
                    try {
                        view.getViewTreeObserver().removeOnPreDrawListener(f.this.f16574b);
                    } catch (Throwable unused) {
                    }
                } else if (!f.this.f16579h.a(view2, view, i6, null)) {
                    this.f16594c.add(view);
                }
            }
            if (f.this.i != null) {
                f.this.i.a(this.f16593b);
            }
            this.f16593b.clear();
            this.f16594c.clear();
            f.d(f.this);
        }
    }

    public interface d {
        void a(List<View> list);
    }

    public f(int i) {
        this(new WeakHashMap(10), new b(i), new Handler(Looper.getMainLooper()));
    }

    public static /* synthetic */ boolean d(f fVar) {
        fVar.f16582l = false;
        return false;
    }

    public final void a(d dVar) {
        this.i = dVar;
    }

    public final void b() {
        a();
        this.i = null;
    }

    public final void c() {
        if (this.f16582l) {
            return;
        }
        this.f16582l = true;
        this.f16581k.postDelayed(this.f16580j, this.f16575d);
    }

    private void a(View view, View view2, int i, Integer num) {
        a(view, view2, i, i, num);
    }

    public f(int i, int i6) {
        this(new WeakHashMap(10), new b(i6), new Handler(Looper.getMainLooper()));
        this.f16575d = i;
    }

    public final void a(View view, View view2, int i, int i6, Integer num) {
        try {
            if (a(view2.getContext(), view2)) {
                a aVar = this.f16578g.get(view2);
                if (aVar == null) {
                    aVar = new a();
                    this.f16578g.put(view2, aVar);
                    c();
                }
                int min = Math.min(i6, i);
                aVar.f16587d = view;
                aVar.f16584a = i;
                aVar.f16585b = min;
                aVar.f16586c = this.f16577f;
                aVar.f16588e = num;
                view2.getViewTreeObserver().addOnPreDrawListener(this.f16574b);
                long j6 = this.f16577f;
                long j9 = 1 + j6;
                this.f16577f = j9;
                if (j9 % 50 == 0) {
                    a(j6 - 49);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private f(Map<View, a> map, b bVar, Handler handler) {
        this.f16575d = 100;
        this.f16573a = 50;
        this.f16577f = 0L;
        this.f16578g = map;
        this.f16579h = bVar;
        this.f16581k = handler;
        this.f16580j = new c();
        this.f16576e = new ArrayList<>(50);
        this.f16574b = new ViewTreeObserver.OnPreDrawListener() { // from class: com.anythink.core.common.v.a.f.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                f.this.c();
                return true;
            }
        };
    }

    private void a(long j6) {
        for (Map.Entry<View, a> entry : this.f16578g.entrySet()) {
            if (entry.getValue().f16586c < j6) {
                this.f16576e.add(entry.getKey());
            }
        }
        Iterator<View> it = this.f16576e.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        this.f16576e.clear();
    }

    public final void a(View view) {
        this.f16578g.remove(view);
    }

    public final void a() {
        this.f16578g.clear();
        this.f16581k.removeMessages(0);
        this.f16582l = false;
    }

    private static boolean a(Context context, View view) {
        View rootView;
        View view2 = null;
        View findViewById = !(context instanceof Activity) ? null : ((Activity) context).getWindow().getDecorView().findViewById(R.id.content);
        if (view != null && (rootView = view.getRootView()) != null && (view2 = rootView.findViewById(R.id.content)) == null) {
            view2 = rootView;
        }
        if (findViewById == null) {
            findViewById = view2;
        }
        return findViewById != null && findViewById.getViewTreeObserver().isAlive();
    }

    private void a(View view, int i, Integer num) {
        a(view, view, i, i, num);
    }
}
