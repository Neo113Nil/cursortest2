package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.aec;
import defpackage.eg0;
import defpackage.h73;
import defpackage.hec;
import defpackage.iec;
import defpackage.kac;
import defpackage.kn5;
import defpackage.lhp;
import defpackage.m5n;
import defpackage.n;
import defpackage.nj2;
import defpackage.ox7;
import defpackage.rwd;
import defpackage.swd;
import defpackage.vm5;
import defpackage.wxf;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@Keep
/* loaded from: classes3.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static iec lambda$getComponents$0(kn5 kn5Var) {
        return new hec((aec) kn5Var.b(aec.class), kn5Var.n(swd.class), (ExecutorService) kn5Var.k(new m5n(nj2.class, ExecutorService.class)), new lhp((Executor) kn5Var.k(new m5n(h73.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<vm5> getComponents() {
        eg0 b = vm5.b(iec.class);
        b.c = LIBRARY_NAME;
        b.a(ox7.b(aec.class));
        b.a(new ox7(0, 1, swd.class));
        b.a(new ox7(new m5n(nj2.class, ExecutorService.class), 1, 0));
        b.a(new ox7(new m5n(h73.class, Executor.class), 1, 0));
        b.f = new kac(6);
        vm5 b2 = b.b();
        rwd rwdVar = new rwd(0);
        eg0 b3 = vm5.b(rwd.class);
        b3.b = 1;
        b3.f = new n(15, rwdVar);
        return Arrays.asList(b2, b3.b(), wxf.q(LIBRARY_NAME, "18.0.0"));
    }
}
