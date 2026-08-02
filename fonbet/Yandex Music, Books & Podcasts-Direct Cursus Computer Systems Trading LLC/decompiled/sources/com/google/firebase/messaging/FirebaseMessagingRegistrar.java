package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.aec;
import defpackage.eg0;
import defpackage.ht7;
import defpackage.i9t;
import defpackage.iec;
import defpackage.kec;
import defpackage.kn5;
import defpackage.l1j;
import defpackage.m5n;
import defpackage.nnr;
import defpackage.o9t;
import defpackage.ox7;
import defpackage.sm7;
import defpackage.twd;
import defpackage.vm5;
import defpackage.wxf;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes3.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(m5n m5nVar, kn5 kn5Var) {
        aec aecVar = (aec) kn5Var.b(aec.class);
        if (kn5Var.b(kec.class) == null) {
            return new FirebaseMessaging(aecVar, kn5Var.n(ht7.class), kn5Var.n(twd.class), (iec) kn5Var.b(iec.class), kn5Var.j(m5nVar), (nnr) kn5Var.b(nnr.class));
        }
        l1j.f();
        return null;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<vm5> getComponents() {
        m5n m5nVar = new m5n(i9t.class, o9t.class);
        eg0 b = vm5.b(FirebaseMessaging.class);
        b.c = LIBRARY_NAME;
        b.a(ox7.b(aec.class));
        b.a(new ox7(0, 0, kec.class));
        b.a(new ox7(0, 1, ht7.class));
        b.a(new ox7(0, 1, twd.class));
        b.a(ox7.b(iec.class));
        b.a(new ox7(m5nVar, 0, 1));
        b.a(ox7.b(nnr.class));
        b.f = new sm7(m5nVar, 1);
        b.j(1);
        return Arrays.asList(b.b(), wxf.q(LIBRARY_NAME, "24.0.0"));
    }
}
