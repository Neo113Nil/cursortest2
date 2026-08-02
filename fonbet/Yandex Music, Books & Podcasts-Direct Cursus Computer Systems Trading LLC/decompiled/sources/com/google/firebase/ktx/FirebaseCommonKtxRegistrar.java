package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.e3s;
import defpackage.eg0;
import defpackage.ehv;
import defpackage.h1b;
import defpackage.h73;
import defpackage.kjn;
import defpackage.m5n;
import defpackage.nj2;
import defpackage.ox7;
import defpackage.ozf;
import defpackage.pht;
import defpackage.u75;
import defpackage.vm5;
import defpackage.vx7;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlinx.coroutines.a;
import org.jetbrains.annotations.NotNull;

@vx7
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lvm5;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<vm5> getComponents() {
        eg0 a = vm5.a(new m5n(nj2.class, a.class));
        a.a(new ox7(new m5n(nj2.class, Executor.class), 1, 0));
        a.f = h1b.b;
        vm5 b = a.b();
        eg0 a2 = vm5.a(new m5n(ozf.class, a.class));
        a2.a(new ox7(new m5n(ozf.class, Executor.class), 1, 0));
        a2.f = kjn.c;
        vm5 b2 = a2.b();
        eg0 a3 = vm5.a(new m5n(h73.class, a.class));
        a3.a(new ox7(new m5n(h73.class, Executor.class), 1, 0));
        a3.f = e3s.d;
        vm5 b3 = a3.b();
        eg0 a4 = vm5.a(new m5n(pht.class, a.class));
        a4.a(new ox7(new m5n(pht.class, Executor.class), 1, 0));
        a4.f = ehv.c;
        return u75.h(b, b2, b3, a4.b());
    }
}
