package io.appmetrica.analytics.impl;

import defpackage.ffp0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class Rf extends Lambda implements tls {
    public final /* synthetic */ Uf a;
    public final /* synthetic */ ffp0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ double e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rf(Uf uf, ffp0 ffp0Var, String str, long j, double d, String str2, String str3) {
        super(1);
        this.a = uf;
        this.b = ffp0Var;
        this.c = str;
        this.d = j;
        this.e = d;
        this.f = str2;
        this.g = str3;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        this.a.a.reportKeyMetric(this.b, this.c, this.d, this.e, this.f, this.g);
        return zy11.a;
    }
}
