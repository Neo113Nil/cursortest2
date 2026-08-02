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
    private static String f17359c = "f";

    /* renamed from: a, reason: collision with root package name */
    final int f17360a;

    /* renamed from: b, reason: collision with root package name */
    final ViewTreeObserver.OnPreDrawListener f17361b;

    /* renamed from: d, reason: collision with root package name */
    private int f17362d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList<View> f17363e;

    /* renamed from: f, reason: collision with root package name */
    private long f17364f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<View, a> f17365g;

    /* renamed from: h, reason: collision with root package name */
    private final b f17366h;
    private d i;

    /* renamed from: j, reason: collision with root package name */
    private final c f17367j;

    /* renamed from: k, reason: collision with root package name */
    private final Handler f17368k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f17369l;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f17371a;

        /* renamed from: b, reason: collision with root package name */
        int f17372b;

        /* renamed from: c, reason: collision with root package name */
        long f17373c;

        /* renamed from: d, reason: collision with root package name */
        View f17374d;

        /* renamed from: e, reason: collision with root package name */
        Integer f17375e;
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static String f17376a = "b";

        /* renamed from: b, reason: collision with root package name */
        private final Rect f17377b;

        /* renamed from: c, reason: collision with root package name */
        private int f17378c;

        public b() {
            this.f17377b = new Rect();
            this.f17378c = 1;
        }

        private static boolean a(long j6, int i) {
            return SystemClock.uptimeMillis() - j6 >= ((long) i);
        }

        public final boolean a(View view, View view2, int i, Integer num) {
            if (view2 != null && view != null) {
                try {
                    if (view.getParent() != null && view2.getWindowVisibility() == 0) {
                        if ((this.f17378c == 1 && !view2.hasWindowFocus()) || !view2.getGlobalVisibleRect(this.f17377b)) {
                            return false;
                        }
                        long height = this.f17377b.height() * this.f17377b.width();
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
                    Log.e(f17376a, "checkVisibilityPercent error: " + th.getMessage());
                    th.printStackTrace();
                }
            }
            return false;
        }

        public b(int i) {
            this.f17377b = new Rect();
            this.f17378c = i;
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
        private final ArrayList<View> f17381c = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<View> f17380b = new ArrayList<>();

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (Map.Entry entry : f.this.f17365g.entrySet()) {
                View view = (View) entry.getKey();
                int i = ((a) entry.getValue()).f17371a;
                int i4 = ((a) entry.getValue()).f17372b;
                Integer num = ((a) entry.getValue()).f17375e;
                View view2 = ((a) entry.getValue()).f17374d;
                if (f.this.f17366h.a(view2, view, i, num)) {
                    this.f17380b.add(view);
                    try {
                        view.getViewTreeObserver().removeOnPreDrawListener(f.this.f17361b);
                    } catch (Throwable unused) {
                    }
                } else if (!f.this.f17366h.a(view2, view, i4, null)) {
                    this.f17381c.add(view);
                }
            }
            if (f.this.i != null) {
                f.this.i.a(this.f17380b);
            }
            this.f17380b.clear();
            this.f17381c.clear();
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
        fVar.f17369l = false;
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
        if (this.f17369l) {
            return;
        }
        this.f17369l = true;
        this.f17368k.postDelayed(this.f17367j, this.f17362d);
    }

    private void a(View view, View view2, int i, Integer num) {
        a(view, view2, i, i, num);
    }

    public f(int i, int i4) {
        this(new WeakHashMap(10), new b(i4), new Handler(Looper.getMainLooper()));
        this.f17362d = i;
    }

    public final void a(View view, View view2, int i, int i4, Integer num) {
        try {
            if (a(view2.getContext(), view2)) {
                a aVar = this.f17365g.get(view2);
                if (aVar == null) {
                    aVar = new a();
                    this.f17365g.put(view2, aVar);
                    c();
                }
                int min = Math.min(i4, i);
                aVar.f17374d = view;
                aVar.f17371a = i;
                aVar.f17372b = min;
                aVar.f17373c = this.f17364f;
                aVar.f17375e = num;
                view2.getViewTreeObserver().addOnPreDrawListener(this.f17361b);
                long j6 = this.f17364f;
                long j9 = 1 + j6;
                this.f17364f = j9;
                if (j9 % 50 == 0) {
                    a(j6 - 49);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private f(Map<View, a> map, b bVar, Handler handler) {
        this.f17362d = 100;
        this.f17360a = 50;
        this.f17364f = 0L;
        this.f17365g = map;
        this.f17366h = bVar;
        this.f17368k = handler;
        this.f17367j = new c();
        this.f17363e = new ArrayList<>(50);
        this.f17361b = new ViewTreeObserver.OnPreDrawListener() { // from class: com.anythink.core.common.v.a.f.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                f.this.c();
                return true;
            }
        };
    }

    private void a(long j6) {
        for (Map.Entry<View, a> entry : this.f17365g.entrySet()) {
            if (entry.getValue().f17373c < j6) {
                this.f17363e.add(entry.getKey());
            }
        }
        Iterator<View> it = this.f17363e.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        this.f17363e.clear();
    }

    public final void a(View view) {
        this.f17365g.remove(view);
    }

    public final void a() {
        this.f17365g.clear();
        this.f17368k.removeMessages(0);
        this.f17369l = false;
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
