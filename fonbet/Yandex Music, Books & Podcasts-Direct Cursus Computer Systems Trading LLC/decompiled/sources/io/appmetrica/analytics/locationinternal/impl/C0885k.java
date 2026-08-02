package io.appmetrica.analytics.locationinternal.impl;

import android.telephony.CellInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0885k implements InterfaceC0889l0 {
    public final C0926y a;
    public final C0917v b;

    public C0885k() {
        this(new C0926y(), new C0917v());
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.InterfaceC0889l0
    @NonNull
    public final C0891m a(@NonNull CellInfo cellInfo) {
        C0888l c0888l = new C0888l();
        this.a.a(cellInfo, c0888l);
        Integer num = c0888l.a;
        Integer num2 = c0888l.b;
        Integer num3 = c0888l.c;
        Integer num4 = c0888l.d;
        Integer num5 = c0888l.e;
        String str = c0888l.f;
        String str2 = c0888l.g;
        boolean z = c0888l.h;
        int i = c0888l.i;
        Integer num6 = c0888l.j;
        Long l = c0888l.k;
        Integer num7 = c0888l.l;
        Integer num8 = c0888l.m;
        Integer num9 = c0888l.n;
        Integer num10 = c0888l.o;
        Integer num11 = c0888l.p;
        Integer num12 = c0888l.q;
        Integer num13 = c0888l.r;
        this.b.getClass();
        C0888l c0888l2 = new C0888l();
        c0888l2.i = i;
        if (C0917v.a(num) && num.intValue() != -1) {
            c0888l2.a = num;
        }
        if (C0917v.a(num2)) {
            c0888l2.b = num2;
        }
        if (C0917v.a(num3)) {
            c0888l2.c = num3;
        }
        if (C0917v.a(num4)) {
            c0888l2.d = num4;
        }
        if (C0917v.a(num5)) {
            c0888l2.e = num5;
        }
        if (!TextUtils.isEmpty(str)) {
            c0888l2.f = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            c0888l2.g = str2;
        }
        c0888l2.h = z;
        if (C0917v.a(num6)) {
            c0888l2.j = num6;
        }
        c0888l2.k = l;
        if (C0917v.a(num7)) {
            c0888l2.l = num7;
        }
        if (C0917v.a(num8)) {
            c0888l2.m = num8;
        }
        if (C0917v.a(num10)) {
            c0888l2.o = num10;
        }
        if (C0917v.a(num9)) {
            c0888l2.n = num9;
        }
        if (C0917v.a(num11)) {
            c0888l2.p = num11;
        }
        if (C0917v.a(num12)) {
            c0888l2.q = num12;
        }
        if (C0917v.a(num13)) {
            c0888l2.r = num13;
        }
        return new C0891m(c0888l2);
    }

    public C0885k(C0926y c0926y, C0917v c0917v) {
        this.a = c0926y;
        this.b = c0917v;
    }

    @NonNull
    public final C0917v a() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.InterfaceC0889l0, io.appmetrica.analytics.locationinternal.impl.O
    public final void a(@NonNull C0856c c0856c) {
        this.a.a(c0856c);
    }
}
