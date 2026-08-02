package com.anythink.basead.mixad.f;

import android.view.MotionEvent;
import android.view.View;
import java.util.List;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f10349a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static int f10350b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static int f10351c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static int f10352d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static int f10353e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static int f10354f = 5;

    /* renamed from: g, reason: collision with root package name */
    private static final String f10355g = "b";

    /* renamed from: h, reason: collision with root package name */
    private List<View> f10356h;
    private View i;

    /* renamed from: j, reason: collision with root package name */
    private View f10357j;

    /* renamed from: k, reason: collision with root package name */
    private View f10358k;

    /* renamed from: l, reason: collision with root package name */
    private float f10359l;

    /* renamed from: m, reason: collision with root package name */
    private float f10360m;

    /* renamed from: n, reason: collision with root package name */
    private float f10361n;

    /* renamed from: o, reason: collision with root package name */
    private float f10362o;

    /* renamed from: p, reason: collision with root package name */
    private int f10363p;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private List<View> f10364a;

        /* renamed from: b, reason: collision with root package name */
        private View f10365b;

        /* renamed from: c, reason: collision with root package name */
        private View f10366c;

        /* renamed from: d, reason: collision with root package name */
        private View f10367d;

        public final a a(List<View> list) {
            this.f10364a = list;
            return this;
        }

        public final a b(View view) {
            this.f10366c = view;
            return this;
        }

        public final a c(View view) {
            this.f10367d = view;
            return this;
        }

        public final a a(View view) {
            this.f10365b = view;
            return this;
        }

        public final b a() {
            b bVar = new b((byte) 0);
            bVar.f10356h = this.f10364a;
            bVar.i = this.f10365b;
            bVar.f10357j = this.f10366c;
            bVar.f10358k = this.f10367d;
            return bVar;
        }
    }

    public /* synthetic */ b(byte b9) {
        this();
    }

    private b() {
        this.f10363p = f10349a;
    }

    public final void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f10363p = f10354f;
            this.f10360m = (int) motionEvent.getRawX();
            this.f10362o = (int) motionEvent.getRawY();
            this.f10359l = (int) motionEvent.getX();
            this.f10361n = (int) motionEvent.getY();
            return;
        }
        if (action == 1 || action == 3) {
            try {
                float f2 = this.f10360m;
                float f9 = this.f10362o;
                if (a(f2, f9, this.i)) {
                    this.f10363p = f10351c;
                    return;
                }
                if (a(f2, f9, this.f10357j)) {
                    this.f10363p = f10352d;
                    return;
                }
                if (a(f2, f9, this.f10358k)) {
                    this.f10363p = f10353e;
                    return;
                }
                List<View> list = this.f10356h;
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (int i = 0; i < this.f10356h.size(); i++) {
                    if (a(f2, f9, this.f10356h.get(i))) {
                        this.f10363p = f10350b;
                        return;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void a(float f2, float f9) {
        if (a(f2, f9, this.i)) {
            this.f10363p = f10351c;
            return;
        }
        if (a(f2, f9, this.f10357j)) {
            this.f10363p = f10352d;
            return;
        }
        if (a(f2, f9, this.f10358k)) {
            this.f10363p = f10353e;
            return;
        }
        List<View> list = this.f10356h;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (int i = 0; i < this.f10356h.size(); i++) {
            if (a(f2, f9, this.f10356h.get(i))) {
                this.f10363p = f10350b;
                return;
            }
        }
    }

    public final int a() {
        return this.f10363p;
    }

    private static boolean a(float f2, float f9, View view) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        float f10 = iArr[0];
        float f11 = iArr[1];
        return f2 >= f10 && f2 <= ((float) view.getWidth()) + f10 && f9 >= f11 && f9 <= ((float) view.getHeight()) + f11;
    }
}
