package com.anythink.basead.ui.f;

import android.view.View;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.w;
import com.anythink.core.common.v.m;
import java.util.Random;

/* loaded from: classes.dex */
public class c {

    /* renamed from: j, reason: collision with root package name */
    public static final int f11573j = -999;

    /* renamed from: a, reason: collision with root package name */
    int f11574a;

    /* renamed from: b, reason: collision with root package name */
    int f11575b;

    /* renamed from: c, reason: collision with root package name */
    int f11576c;

    /* renamed from: d, reason: collision with root package name */
    int f11577d;

    /* renamed from: e, reason: collision with root package name */
    int f11578e;

    /* renamed from: f, reason: collision with root package name */
    int f11579f;

    /* renamed from: g, reason: collision with root package name */
    int f11580g;

    /* renamed from: h, reason: collision with root package name */
    int f11581h;
    public com.anythink.basead.d.a i;

    /* renamed from: k, reason: collision with root package name */
    private long f11582k;

    /* renamed from: l, reason: collision with root package name */
    private long f11583l;

    /* renamed from: m, reason: collision with root package name */
    private w f11584m;

    public c(w wVar) {
        this.f11584m = wVar;
    }

    public static int b(int i, int i4) {
        if (i == 4) {
            return 2;
        }
        switch (i) {
            case 11:
                return (i4 == 15 || i4 == 16 || i4 == 21 || i4 == 48 || i4 == 45 || i4 == 46) ? 1 : 0;
            case 12:
            case 13:
                return 1;
            default:
                return 0;
        }
    }

    private com.anythink.basead.d.a c(View view) {
        c cVar = new c(this.f11584m);
        cVar.b(view);
        return cVar.a(0, 13);
    }

    public final void a(int i, int i4, int i6, int i9) {
        this.f11574a = i;
        this.f11575b = i4;
        this.f11578e = i6;
        this.f11579f = i9;
        this.f11582k = System.currentTimeMillis();
        if (this.f11576c == 0 && this.f11577d == 0 && this.f11580g == 0 && this.f11581h == 0 && this.f11583l == 0) {
            this.f11576c = i;
            this.f11577d = i4;
            this.f11580g = i6;
            this.f11581h = i9;
            this.f11583l = System.currentTimeMillis() + new Random().nextInt(10) + 5;
        }
    }

    public final void b(int i, int i4, int i6, int i9) {
        this.f11576c = i;
        this.f11577d = i4;
        this.f11580g = i6;
        this.f11581h = i9;
        this.f11583l = System.currentTimeMillis();
    }

    private void b(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = 0;
        int i4 = iArr[0];
        int i6 = iArr[1];
        int width = view.getWidth();
        int height = view.getHeight();
        if (width == 0) {
            width = m.j(t.b().g());
            i4 = 0;
        }
        if (height == 0) {
            height = m.k(t.b().g());
        } else {
            i = i6;
        }
        int b9 = b(width);
        int b10 = b(height);
        int i9 = i4 + b9;
        int i10 = i + b10;
        int random = ((int) (Math.random() * 15.0d)) + i9;
        int random2 = ((int) (Math.random() * 15.0d)) + i10;
        a(i9, i10, b9, b10);
        b(random, random2, random - i4, random2 - i);
    }

    public final com.anythink.basead.d.a a(int i) {
        return a(0, i);
    }

    public final com.anythink.basead.d.a a(int i, int i4) {
        com.anythink.basead.d.a aVar = new com.anythink.basead.d.a();
        aVar.f6894a = this.f11574a;
        aVar.f6895b = this.f11575b;
        aVar.f6896c = this.f11576c;
        aVar.f6897d = this.f11577d;
        aVar.f6898e = this.f11578e;
        aVar.f6899f = this.f11579f;
        aVar.f6900g = this.f11580g;
        aVar.f6901h = this.f11581h;
        aVar.f6903k = this.f11582k;
        aVar.f6904l = this.f11583l;
        aVar.f6906n = i;
        aVar.f6907o = i4;
        if (i == 2) {
            aVar.f6905m = com.anythink.core.express.c.a.a().c();
        }
        aVar.f6908p = this.i;
        return aVar;
    }

    private static int b(int i) {
        Random random = new Random();
        if (i <= 0) {
            return 0;
        }
        double d9 = i;
        int i4 = (int) (0.1d * d9);
        return random.nextInt((((int) (d9 * 0.9d)) - i4) + 1) + i4;
    }

    public final com.anythink.basead.d.a a(View view, int i, int i4) {
        w wVar;
        int b9 = b(i, i4);
        if (i == 4 && (wVar = this.f11584m) != null && wVar.ai() == 1) {
            c cVar = new c(this.f11584m);
            cVar.b(view);
            this.i = cVar.a(0, 13);
        }
        if (i == 5 || i == 6 || i == 7) {
            b(view);
            b9 = 0;
        }
        return a(b9, i4);
    }

    public final void a(View view) {
        b(view);
    }
}
