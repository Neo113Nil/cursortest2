package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.cxf;
import defpackage.eg0;
import defpackage.i9t;
import defpackage.kn5;
import defpackage.m5n;
import defpackage.o9t;
import defpackage.ox7;
import defpackage.t9t;
import defpackage.vm5;
import defpackage.vn3;
import defpackage.wvs;
import defpackage.wxf;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes3.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o9t lambda$getComponents$0(kn5 kn5Var) {
        t9t.b((Context) kn5Var.b(Context.class));
        return t9t.a().c(vn3.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o9t lambda$getComponents$1(kn5 kn5Var) {
        t9t.b((Context) kn5Var.b(Context.class));
        return t9t.a().c(vn3.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o9t lambda$getComponents$2(kn5 kn5Var) {
        t9t.b((Context) kn5Var.b(Context.class));
        return t9t.a().c(vn3.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public List<vm5> getComponents() {
        eg0 b = vm5.b(o9t.class);
        b.c = LIBRARY_NAME;
        b.a(ox7.b(Context.class));
        b.f = new wvs(10);
        vm5 b2 = b.b();
        eg0 a = vm5.a(new m5n(cxf.class, o9t.class));
        a.a(ox7.b(Context.class));
        a.f = new wvs(11);
        vm5 b3 = a.b();
        eg0 a2 = vm5.a(new m5n(i9t.class, o9t.class));
        a2.a(ox7.b(Context.class));
        a2.f = new wvs(12);
        return Arrays.asList(b2, b3, a2.b(), wxf.q(LIBRARY_NAME, "19.0.0"));
    }
}
