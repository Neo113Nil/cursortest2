package com.anythink.basead.mixad.f;

import android.view.MotionEvent;
import android.view.View;
import java.util.List;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f9720a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static int f9721b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static int f9722c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static int f9723d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static int f9724e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static int f9725f = 5;

    /* renamed from: g, reason: collision with root package name */
    private static final String f9726g = "b";

    /* renamed from: h, reason: collision with root package name */
    private List<View> f9727h;
    private View i;

    /* renamed from: j, reason: collision with root package name */
    private View f9728j;

    /* renamed from: k, reason: collision with root package name */
    private View f9729k;

    /* renamed from: l, reason: collision with root package name */
    private float f9730l;

    /* renamed from: m, reason: collision with root package name */
    private float f9731m;

    /* renamed from: n, reason: collision with root package name */
    private float f9732n;

    /* renamed from: o, reason: collision with root package name */
    private float f9733o;

    /* renamed from: p, reason: collision with root package name */
    private int f9734p;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private List<View> f9735a;

        /* renamed from: b, reason: collision with root package name */
        private View f9736b;

        /* renamed from: c, reason: collision with root package name */
        private View f9737c;

        /* renamed from: d, reason: collision with root package name */
        private View f9738d;

        public final a a(List<View> list) {
            this.f9735a = list;
            return this;
        }

        public final a b(View view) {
            this.f9737c = view;
            return this;
        }

        public final a c(View view) {
            this.f9738d = view;
            return this;
        }

        public final a a(View view) {
            this.f9736b = view;
            return this;
        }

        public final b a() {
            b bVar = new b((byte) 0);
            bVar.f9727h = this.f9735a;
            bVar.i = this.f9736b;
            bVar.f9728j = this.f9737c;
            bVar.f9729k = this.f9738d;
            return bVar;
        }
    }

    public /* synthetic */ b(byte b9) {
        this();
    }

    private b() {
        this.f9734p = f9720a;
    }

    public final void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f9734p = f9725f;
            this.f9731m = (int) motionEvent.getRawX();
            this.f9733o = (int) motionEvent.getRawY();
            this.f9730l = (int) motionEvent.getX();
            this.f9732n = (int) motionEvent.getY();
            return;
        }
        if (action == 1 || action == 3) {
            try {
                float f6 = this.f9731m;
                float f9 = this.f9733o;
                if (a(f6, f9, this.i)) {
                    this.f9734p = f9722c;
                    return;
                }
                if (a(f6, f9, this.f9728j)) {
                    this.f9734p = f9723d;
                    return;
                }
                if (a(f6, f9, this.f9729k)) {
                    this.f9734p = f9724e;
                    return;
                }
                List<View> list = this.f9727h;
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (int i = 0; i < this.f9727h.size(); i++) {
                    if (a(f6, f9, this.f9727h.get(i))) {
                        this.f9734p = f9721b;
                        return;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void a(float f6, float f9) {
        if (a(f6, f9, this.i)) {
            this.f9734p = f9722c;
            return;
        }
        if (a(f6, f9, this.f9728j)) {
            this.f9734p = f9723d;
            return;
        }
        if (a(f6, f9, this.f9729k)) {
            this.f9734p = f9724e;
            return;
        }
        List<View> list = this.f9727h;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (int i = 0; i < this.f9727h.size(); i++) {
            if (a(f6, f9, this.f9727h.get(i))) {
                this.f9734p = f9721b;
                return;
            }
        }
    }

    public final int a() {
        return this.f9734p;
    }

    private static boolean a(float f6, float f9, View view) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        float f10 = iArr[0];
        float f11 = iArr[1];
        return f6 >= f10 && f6 <= ((float) view.getWidth()) + f10 && f9 >= f11 && f9 <= ((float) view.getHeight()) + f11;
    }
}
