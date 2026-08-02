package io.appmetrica.analytics.impl;

import defpackage.ffp0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes13.dex */
public final class Qf extends Lambda implements tls {
    public final /* synthetic */ Uf a;
    public final /* synthetic */ ffp0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qf(Uf uf, ffp0 ffp0Var, String str, long j, String str2, String str3) {
        super(1);
        this.a = uf;
        this.b = ffp0Var;
        this.c = str;
        this.d = j;
        this.e = str2;
        this.f = str3;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        this.a.a.reportAdditionalMetric(this.b, this.c, this.d, this.e, this.f);
        return zy11.a;
    }
}
