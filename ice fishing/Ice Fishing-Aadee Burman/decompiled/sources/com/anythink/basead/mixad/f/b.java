package com.anythink.basead.mixad.f;

import android.view.MotionEvent;
import android.view.View;
import java.util.List;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f9563a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static int f9564b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static int f9565c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static int f9566d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static int f9567e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static int f9568f = 5;

    /* renamed from: g, reason: collision with root package name */
    private static final String f9569g = "b";

    /* renamed from: h, reason: collision with root package name */
    private List<View> f9570h;
    private View i;

    /* renamed from: j, reason: collision with root package name */
    private View f9571j;

    /* renamed from: k, reason: collision with root package name */
    private View f9572k;

    /* renamed from: l, reason: collision with root package name */
    private float f9573l;

    /* renamed from: m, reason: collision with root package name */
    private float f9574m;

    /* renamed from: n, reason: collision with root package name */
    private float f9575n;

    /* renamed from: o, reason: collision with root package name */
    private float f9576o;

    /* renamed from: p, reason: collision with root package name */
    private int f9577p;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private List<View> f9578a;

        /* renamed from: b, reason: collision with root package name */
        private View f9579b;

        /* renamed from: c, reason: collision with root package name */
        private View f9580c;

        /* renamed from: d, reason: collision with root package name */
        private View f9581d;

        public final a a(List<View> list) {
            this.f9578a = list;
            return this;
        }

        public final a b(View view) {
            this.f9580c = view;
            return this;
        }

        public final a c(View view) {
            this.f9581d = view;
            return this;
        }

        public final a a(View view) {
            this.f9579b = view;
            return this;
        }

        public final b a() {
            b bVar = new b((byte) 0);
            bVar.f9570h = this.f9578a;
            bVar.i = this.f9579b;
            bVar.f9571j = this.f9580c;
            bVar.f9572k = this.f9581d;
            return bVar;
        }
    }

    public /* synthetic */ b(byte b9) {
        this();
    }

    private b() {
        this.f9577p = f9563a;
    }

    public final void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f9577p = f9568f;
            this.f9574m = (int) motionEvent.getRawX();
            this.f9576o = (int) motionEvent.getRawY();
            this.f9573l = (int) motionEvent.getX();
            this.f9575n = (int) motionEvent.getY();
            return;
        }
        if (action == 1 || action == 3) {
            try {
                float f3 = this.f9574m;
                float f9 = this.f9576o;
                if (a(f3, f9, this.i)) {
                    this.f9577p = f9565c;
                    return;
                }
                if (a(f3, f9, this.f9571j)) {
                    this.f9577p = f9566d;
                    return;
                }
                if (a(f3, f9, this.f9572k)) {
                    this.f9577p = f9567e;
                    return;
                }
                List<View> list = this.f9570h;
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (int i = 0; i < this.f9570h.size(); i++) {
                    if (a(f3, f9, this.f9570h.get(i))) {
                        this.f9577p = f9564b;
                        return;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void a(float f3, float f9) {
        if (a(f3, f9, this.i)) {
            this.f9577p = f9565c;
            return;
        }
        if (a(f3, f9, this.f9571j)) {
            this.f9577p = f9566d;
            return;
        }
        if (a(f3, f9, this.f9572k)) {
            this.f9577p = f9567e;
            return;
        }
        List<View> list = this.f9570h;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (int i = 0; i < this.f9570h.size(); i++) {
            if (a(f3, f9, this.f9570h.get(i))) {
                this.f9577p = f9564b;
                return;
            }
        }
    }

    public final int a() {
        return this.f9577p;
    }

    private static boolean a(float f3, float f9, View view) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        float f10 = iArr[0];
        float f11 = iArr[1];
        return f3 >= f10 && f3 <= ((float) view.getWidth()) + f10 && f9 >= f11 && f9 <= ((float) view.getHeight()) + f11;
    }
}
