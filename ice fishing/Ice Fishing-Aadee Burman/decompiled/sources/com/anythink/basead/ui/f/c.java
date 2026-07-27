package com.anythink.basead.ui.f;

import android.view.View;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.w;
import com.anythink.core.common.v.m;
import java.util.Random;

/* loaded from: classes.dex */
public class c {

    /* renamed from: j, reason: collision with root package name */
    public static final int f10787j = -999;

    /* renamed from: a, reason: collision with root package name */
    int f10788a;

    /* renamed from: b, reason: collision with root package name */
    int f10789b;

    /* renamed from: c, reason: collision with root package name */
    int f10790c;

    /* renamed from: d, reason: collision with root package name */
    int f10791d;

    /* renamed from: e, reason: collision with root package name */
    int f10792e;

    /* renamed from: f, reason: collision with root package name */
    int f10793f;

    /* renamed from: g, reason: collision with root package name */
    int f10794g;

    /* renamed from: h, reason: collision with root package name */
    int f10795h;
    public com.anythink.basead.d.a i;

    /* renamed from: k, reason: collision with root package name */
    private long f10796k;

    /* renamed from: l, reason: collision with root package name */
    private long f10797l;

    /* renamed from: m, reason: collision with root package name */
    private w f10798m;

    public c(w wVar) {
        this.f10798m = wVar;
    }

    public static int b(int i, int i6) {
        if (i == 4) {
            return 2;
        }
        switch (i) {
            case 11:
                return (i6 == 15 || i6 == 16 || i6 == 21 || i6 == 48 || i6 == 45 || i6 == 46) ? 1 : 0;
            case 12:
            case 13:
                return 1;
            default:
                return 0;
        }
    }

    private com.anythink.basead.d.a c(View view) {
        c cVar = new c(this.f10798m);
        cVar.b(view);
        return cVar.a(0, 13);
    }

    public final void a(int i, int i6, int i9, int i10) {
        this.f10788a = i;
        this.f10789b = i6;
        this.f10792e = i9;
        this.f10793f = i10;
        this.f10796k = System.currentTimeMillis();
        if (this.f10790c == 0 && this.f10791d == 0 && this.f10794g == 0 && this.f10795h == 0 && this.f10797l == 0) {
            this.f10790c = i;
            this.f10791d = i6;
            this.f10794g = i9;
            this.f10795h = i10;
            this.f10797l = System.currentTimeMillis() + new Random().nextInt(10) + 5;
        }
    }

    public final void b(int i, int i6, int i9, int i10) {
        this.f10790c = i;
        this.f10791d = i6;
        this.f10794g = i9;
        this.f10795h = i10;
        this.f10797l = System.currentTimeMillis();
    }

    private void b(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = 0;
        int i6 = iArr[0];
        int i9 = iArr[1];
        int width = view.getWidth();
        int height = view.getHeight();
        if (width == 0) {
            width = m.j(t.b().g());
            i6 = 0;
        }
        if (height == 0) {
            height = m.k(t.b().g());
        } else {
            i = i9;
        }
        int b9 = b(width);
        int b10 = b(height);
        int i10 = i6 + b9;
        int i11 = i + b10;
        int random = ((int) (Math.random() * 15.0d)) + i10;
        int random2 = ((int) (Math.random() * 15.0d)) + i11;
        a(i10, i11, b9, b10);
        b(random, random2, random - i6, random2 - i);
    }

    public final com.anythink.basead.d.a a(int i) {
        return a(0, i);
    }

    public final com.anythink.basead.d.a a(int i, int i6) {
        com.anythink.basead.d.a aVar = new com.anythink.basead.d.a();
        aVar.f6108a = this.f10788a;
        aVar.f6109b = this.f10789b;
        aVar.f6110c = this.f10790c;
        aVar.f6111d = this.f10791d;
        aVar.f6112e = this.f10792e;
        aVar.f6113f = this.f10793f;
        aVar.f6114g = this.f10794g;
        aVar.f6115h = this.f10795h;
        aVar.f6117k = this.f10796k;
        aVar.f6118l = this.f10797l;
        aVar.f6120n = i;
        aVar.f6121o = i6;
        if (i == 2) {
            aVar.f6119m = com.anythink.core.express.c.a.a().c();
        }
        aVar.f6122p = this.i;
        return aVar;
    }

    private static int b(int i) {
        Random random = new Random();
        if (i <= 0) {
            return 0;
        }
        double d2 = i;
        int i6 = (int) (0.1d * d2);
        return random.nextInt((((int) (d2 * 0.9d)) - i6) + 1) + i6;
    }

    public final com.anythink.basead.d.a a(View view, int i, int i6) {
        w wVar;
        int b9 = b(i, i6);
        if (i == 4 && (wVar = this.f10798m) != null && wVar.ai() == 1) {
            c cVar = new c(this.f10798m);
            cVar.b(view);
            this.i = cVar.a(0, 13);
        }
        if (i == 5 || i == 6 || i == 7) {
            b(view);
            b9 = 0;
        }
        return a(b9, i6);
    }

    public final void a(View view) {
        b(view);
    }
}
