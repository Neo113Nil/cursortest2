package io.appmetrica.analytics.networkquality.impl;

import defpackage.bsq0;
import defpackage.ymp0;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.networkquality.internal.NetworkQualityConfigWrapper;
import java.util.concurrent.TimeUnit;
import kotlin.random.Random;

/* loaded from: classes9.dex */
public final class n {
    public final ServiceContext a;
    public final r b;
    public final o c;
    public final Random d;
    public f e;
    public boolean f;
    public final Runnable g = new ymp0(21, this);

    public n(ServiceContext serviceContext, r rVar, o oVar, Random random) {
        this.a = serviceContext;
        this.b = rVar;
        this.c = oVar;
        this.d = random;
    }

    public static final void a(NetworkQualityConfigWrapper networkQualityConfigWrapper, n nVar) {
        f fVar = networkQualityConfigWrapper.getRu.cprocsp.ACSP.tools.config.ConfigConstants.CONFIG java.lang.String();
        nVar.e = fVar;
        if (!nVar.f && fVar.a) {
            nVar.f = true;
            nVar.a.getExecutorProvider().getModuleExecutor().executeDelayed(nVar.g, nVar.d.c(fVar.b + 1), TimeUnit.SECONDS);
        }
    }

    public final void a(NetworkQualityConfigWrapper networkQualityConfigWrapper) {
        this.a.getExecutorProvider().getModuleExecutor().execute(new bsq0(11, networkQualityConfigWrapper, this));
    }

    public static final void a(n nVar) {
        f fVar = nVar.e;
        if (fVar == null) {
            return;
        }
        if (!fVar.a) {
            nVar.f = false;
        } else {
            nVar.b.a(fVar, nVar.a.getExecutorProvider().getModuleExecutor(), new m(nVar));
        }
    }
}
