package io.appmetrica.analytics.impl;

import android.os.Bundle;
import defpackage.sls;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class Rd extends Lambda implements sls {
    public final /* synthetic */ Sd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rd(Sd sd) {
        super(0);
        this.a = sd;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        InterfaceC0506le c0856xh;
        Sd sd = this.a;
        C0535me c0535me = sd.f;
        Ga ga = sd.b;
        C0916zj c0916zj = sd.a;
        C0439j5 c0439j5 = sd.c;
        Ih ih = sd.d;
        c0535me.getClass();
        if (FrameworkDetector.isNative()) {
            C0244cb i = Jb.I.i();
            Bundle applicationMetaData = i.d.getApplicationMetaData(i.a);
            if (StringUtils.isNullOrEmpty(applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.plugin_id") : null)) {
                c0856xh = new Bg();
                return c0856xh.a();
            }
        }
        c0856xh = new C0856xh(ga, c0916zj, c0439j5, ih);
        return c0856xh.a();
    }
}
