package io.appmetrica.analytics.impl;

import defpackage.ffp0;
import defpackage.tls;
import defpackage.zy11;
import java.util.Map;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class Tf extends Lambda implements tls {
    public final /* synthetic */ Uf a;
    public final /* synthetic */ ffp0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ double d;
    public final /* synthetic */ Map e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tf(Uf uf, ffp0 ffp0Var, String str, double d, Map map, String str2) {
        super(1);
        this.a = uf;
        this.b = ffp0Var;
        this.c = str;
        this.d = d;
        this.e = map;
        this.f = str2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        this.a.a.reportTotalScoreStartupSpecific(this.b, this.c, this.d, this.e, this.f);
        return zy11.a;
    }
}
