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
    private static String f16730c = "f";

    /* renamed from: a, reason: collision with root package name */
    final int f16731a;

    /* renamed from: b, reason: collision with root package name */
    final ViewTreeObserver.OnPreDrawListener f16732b;

    /* renamed from: d, reason: collision with root package name */
    private int f16733d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList<View> f16734e;

    /* renamed from: f, reason: collision with root package name */
    private long f16735f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<View, a> f16736g;

    /* renamed from: h, reason: collision with root package name */
    private final b f16737h;
    private d i;

    /* renamed from: j, reason: collision with root package name */
    private final c f16738j;

    /* renamed from: k, reason: collision with root package name */
    private final Handler f16739k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f16740l;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f16742a;

        /* renamed from: b, reason: collision with root package name */
        int f16743b;

        /* renamed from: c, reason: collision with root package name */
        long f16744c;

        /* renamed from: d, reason: collision with root package name */
        View f16745d;

        /* renamed from: e, reason: collision with root package name */
        Integer f16746e;
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static String f16747a = "b";

        /* renamed from: b, reason: collision with root package name */
        private final Rect f16748b;

        /* renamed from: c, reason: collision with root package name */
        private int f16749c;

        public b() {
            this.f16748b = new Rect();
            this.f16749c = 1;
        }

        private static boolean a(long j9, int i) {
            return SystemClock.uptimeMillis() - j9 >= ((long) i);
        }

        public final boolean a(View view, View view2, int i, Integer num) {
            if (view2 != null && view != null) {
                try {
                    if (view.getParent() != null && view2.getWindowVisibility() == 0) {
                        if ((this.f16749c == 1 && !view2.hasWindowFocus()) || !view2.getGlobalVisibleRect(this.f16748b)) {
                            return false;
                        }
                        long height = this.f16748b.height() * this.f16748b.width();
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
                    Log.e(f16747a, "checkVisibilityPercent error: " + th.getMessage());
                    th.printStackTrace();
                }
            }
            return false;
        }

        public b(int i) {
            this.f16748b = new Rect();
            this.f16749c = i;
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
        private final ArrayList<View> f16752c = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<View> f16751b = new ArrayList<>();

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (Map.Entry entry : f.this.f16736g.entrySet()) {
                View view = (View) entry.getKey();
                int i = ((a) entry.getValue()).f16742a;
                int i4 = ((a) entry.getValue()).f16743b;
                Integer num = ((a) entry.getValue()).f16746e;
                View view2 = ((a) entry.getValue()).f16745d;
                if (f.this.f16737h.a(view2, view, i, num)) {
                    this.f16751b.add(view);
                    try {
                        view.getViewTreeObserver().removeOnPreDrawListener(f.this.f16732b);
                    } catch (Throwable unused) {
                    }
                } else if (!f.this.f16737h.a(view2, view, i4, null)) {
                    this.f16752c.add(view);
                }
            }
            if (f.this.i != null) {
                f.this.i.a(this.f16751b);
            }
            this.f16751b.clear();
            this.f16752c.clear();
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
        fVar.f16740l = false;
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
        if (this.f16740l) {
            return;
        }
        this.f16740l = true;
        this.f16739k.postDelayed(this.f16738j, this.f16733d);
    }

    private void a(View view, View view2, int i, Integer num) {
        a(view, view2, i, i, num);
    }

    public f(int i, int i4) {
        this(new WeakHashMap(10), new b(i4), new Handler(Looper.getMainLooper()));
        this.f16733d = i;
    }

    public final void a(View view, View view2, int i, int i4, Integer num) {
        try {
            if (a(view2.getContext(), view2)) {
                a aVar = this.f16736g.get(view2);
                if (aVar == null) {
                    aVar = new a();
                    this.f16736g.put(view2, aVar);
                    c();
                }
                int min = Math.min(i4, i);
                aVar.f16745d = view;
                aVar.f16742a = i;
                aVar.f16743b = min;
                aVar.f16744c = this.f16735f;
                aVar.f16746e = num;
                view2.getViewTreeObserver().addOnPreDrawListener(this.f16732b);
                long j9 = this.f16735f;
                long j10 = 1 + j9;
                this.f16735f = j10;
                if (j10 % 50 == 0) {
                    a(j9 - 49);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private f(Map<View, a> map, b bVar, Handler handler) {
        this.f16733d = 100;
        this.f16731a = 50;
        this.f16735f = 0L;
        this.f16736g = map;
        this.f16737h = bVar;
        this.f16739k = handler;
        this.f16738j = new c();
        this.f16734e = new ArrayList<>(50);
        this.f16732b = new ViewTreeObserver.OnPreDrawListener() { // from class: com.anythink.core.common.v.a.f.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                f.this.c();
                return true;
            }
        };
    }

    private void a(long j9) {
        for (Map.Entry<View, a> entry : this.f16736g.entrySet()) {
            if (entry.getValue().f16744c < j9) {
                this.f16734e.add(entry.getKey());
            }
        }
        Iterator<View> it = this.f16734e.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        this.f16734e.clear();
    }

    public final void a(View view) {
        this.f16736g.remove(view);
    }

    public final void a() {
        this.f16736g.clear();
        this.f16739k.removeMessages(0);
        this.f16740l = false;
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
