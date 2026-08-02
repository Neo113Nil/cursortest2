package io.appmetrica.analytics.locationinternal.impl;

import android.telephony.CellInfo;
import android.text.TextUtils;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.k, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0960k implements InterfaceC0964l0 {
    public final C1001y a;
    public final C0992v b;

    public C0960k() {
        this(new C1001y(), new C0992v());
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.InterfaceC0964l0
    public final C0966m a(CellInfo cellInfo) {
        Integer num;
        C0963l c0963l = new C0963l();
        this.a.a(cellInfo, c0963l);
        Integer num2 = c0963l.a;
        Integer num3 = c0963l.b;
        Integer num4 = c0963l.c;
        Integer num5 = c0963l.d;
        Integer num6 = c0963l.e;
        String str = c0963l.f;
        String str2 = c0963l.g;
        boolean z = c0963l.h;
        int i = c0963l.i;
        Integer num7 = c0963l.j;
        Long l = c0963l.k;
        Integer num8 = c0963l.l;
        Integer num9 = c0963l.m;
        Integer num10 = c0963l.n;
        Integer num11 = c0963l.o;
        Integer num12 = c0963l.p;
        Integer num13 = c0963l.q;
        Integer num14 = c0963l.r;
        this.b.getClass();
        C0963l c0963l2 = new C0963l();
        c0963l2.i = i;
        if (C0992v.a(num2)) {
            num = num14;
            if (num2.intValue() != -1) {
                c0963l2.a = num2;
            }
        } else {
            num = num14;
        }
        if (C0992v.a(num3)) {
            c0963l2.b = num3;
        }
        if (C0992v.a(num4)) {
            c0963l2.c = num4;
        }
        if (C0992v.a(num5)) {
            c0963l2.d = num5;
        }
        if (C0992v.a(num6)) {
            c0963l2.e = num6;
        }
        if (!TextUtils.isEmpty(str)) {
            c0963l2.f = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            c0963l2.g = str2;
        }
        c0963l2.h = z;
        if (C0992v.a(num7)) {
            c0963l2.j = num7;
        }
        c0963l2.k = l;
        if (C0992v.a(num8)) {
            c0963l2.l = num8;
        }
        if (C0992v.a(num9)) {
            c0963l2.m = num9;
        }
        if (C0992v.a(num11)) {
            c0963l2.o = num11;
        }
        if (C0992v.a(num10)) {
            c0963l2.n = num10;
        }
        if (C0992v.a(num12)) {
            c0963l2.p = num12;
        }
        if (C0992v.a(num13)) {
            c0963l2.q = num13;
        }
        if (C0992v.a(num)) {
            c0963l2.r = num;
        }
        return new C0966m(c0963l2);
    }

    public C0960k(C1001y c1001y, C0992v c0992v) {
        this.a = c1001y;
        this.b = c0992v;
    }

    public final C0992v a() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.InterfaceC0964l0, io.appmetrica.analytics.locationinternal.impl.O
    public final void a(C0933c c0933c) {
        this.a.a(c0933c);
    }
}
