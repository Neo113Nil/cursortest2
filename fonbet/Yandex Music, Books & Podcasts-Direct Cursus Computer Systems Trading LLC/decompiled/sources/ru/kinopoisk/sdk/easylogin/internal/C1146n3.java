package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.b2c;
import defpackage.ghh;
import defpackage.grb;
import defpackage.hq5;
import defpackage.k5r;
import defpackage.lho;
import defpackage.nho;
import defpackage.nx0;
import defpackage.oq5;
import defpackage.ouj;
import defpackage.qx0;
import defpackage.uif;
import defpackage.vci;
import defpackage.wn5;
import defpackage.wp5;
import defpackage.xp5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.n3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1146n3 extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1146n3(String str, int i) {
        super(2);
        this.a = str;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        nx0 g = qx0.g(8);
        String str = this.a;
        int i = this.b;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.a0(693286680);
        nho a = lho.a(g, b2c.k, oq5Var2, 6);
        oq5Var2.a0(-1323940314);
        int i2 = oq5Var2.P;
        androidx.compose.runtime.internal.a l = oq5Var2.l();
        wp5 wp5Var = xp5.T;
        wp5Var.getClass();
        grb grbVar = wp5.b;
        wn5 A = ghh.A(vci.a);
        oq5Var2.d0();
        if (oq5Var2.O) {
            oq5Var2.k(grbVar);
        } else {
            oq5Var2.n0();
        }
        Function2 a2 = Lb.a(wp5Var, oq5Var2, a, oq5Var2, l);
        if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i2))) {
            Mb.a(i2, oq5Var2, i2, a2);
        }
        ouj.z(oq5Var2, 0, A, oq5Var2, 2058660585);
        oq5Var2.a0(-11900949);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= str.length()) {
                break;
            }
            char charAt = str.charAt(i3);
            int i5 = i4 + 1;
            if (i4 != str.length()) {
                z = false;
            }
            C1160o3.a(charAt, (vci) null, z, oq5Var2, 0);
            i3++;
            i4 = i5;
        }
        oq5Var2.p(false);
        int length = i - str.length();
        oq5Var2.a0(-11890301);
        if (length > 0) {
            int i6 = 0;
            while (i6 < length) {
                C1160o3.a(' ', (vci) null, i6 == 0, (hq5) oq5Var2, 6);
                i6++;
            }
        }
        k5r.s(oq5Var2, false, false, true, false);
        oq5Var2.p(false);
        return Unit.a;
    }
}
