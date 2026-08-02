package io.appmetrica.analytics.locationinternal.impl;

import defpackage.vfc;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.m, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0966m {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final String f;
    public final String g;
    public final boolean h;
    public final int i;
    public final Integer j;
    public final Long k;
    public final Integer l;
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Integer q;
    public final Integer r;

    public C0966m(C0963l c0963l) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        String str;
        String str2;
        boolean z;
        int i;
        Integer num6;
        Long l;
        Integer num7;
        Integer num8;
        Integer num9;
        Integer num10;
        Integer num11;
        Integer num12;
        Integer num13;
        num = c0963l.a;
        this.a = num;
        num2 = c0963l.b;
        this.b = num2;
        num3 = c0963l.c;
        this.c = num3;
        num4 = c0963l.d;
        this.d = num4;
        num5 = c0963l.e;
        this.e = num5;
        str = c0963l.f;
        this.f = str;
        str2 = c0963l.g;
        this.g = str2;
        z = c0963l.h;
        this.h = z;
        i = c0963l.i;
        this.i = i;
        num6 = c0963l.j;
        this.j = num6;
        l = c0963l.k;
        this.k = l;
        num7 = c0963l.l;
        this.l = num7;
        num8 = c0963l.m;
        this.m = num8;
        num9 = c0963l.n;
        this.n = num9;
        num10 = c0963l.o;
        this.o = num10;
        num11 = c0963l.p;
        this.p = num11;
        num12 = c0963l.q;
        this.q = num12;
        num13 = c0963l.r;
        this.r = num13;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CellDescription{mSignalStrength=");
        sb.append(this.a);
        sb.append(", mMobileCountryCode=");
        sb.append(this.b);
        sb.append(", mMobileNetworkCode=");
        sb.append(this.c);
        sb.append(", mLocationAreaCode=");
        sb.append(this.d);
        sb.append(", mCellId=");
        sb.append(this.e);
        sb.append(", mOperatorName='");
        sb.append(this.f);
        sb.append("', mNetworkType='");
        sb.append(this.g);
        sb.append("', mConnected=");
        sb.append(this.h);
        sb.append(", mCellType=");
        sb.append(this.i);
        sb.append(", mPci=");
        sb.append(this.j);
        sb.append(", mLastVisibleTimeOffset=");
        sb.append(this.k);
        sb.append(", mLteRsrq=");
        sb.append(this.l);
        sb.append(", mLteRssnr=");
        sb.append(this.m);
        sb.append(", mLteRssi=");
        sb.append(this.n);
        sb.append(", mArfcn=");
        sb.append(this.o);
        sb.append(", mLteBandWidth=");
        sb.append(this.p);
        sb.append(", mLteCqi=");
        sb.append(this.q);
        sb.append(", lteTimingAdvance=");
        return vfc.o(sb, this.r, '}');
    }
}
