package com.google.firebase.messaging;

import O3.g;
import R3.a;
import R3.c;
import R3.j;
import R3.r;
import W1.e;
import a4.C0434b;
import androidx.annotation.Keep;
import b4.InterfaceC0517a;
import com.bumptech.glide.h;
import com.google.firebase.components.ComponentRegistrar;
import d4.InterfaceC4450d;
import java.util.Arrays;
import java.util.List;
import l4.b;

@Keep
/* loaded from: classes2.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(r rVar, c cVar) {
        g gVar = (g) cVar.a(g.class);
        if (cVar.a(InterfaceC0517a.class) == null) {
            return new FirebaseMessaging(gVar, cVar.b(b.class), cVar.b(a4.g.class), (InterfaceC4450d) cVar.a(InterfaceC4450d.class), cVar.e(rVar), (Z3.b) cVar.a(Z3.b.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<R3.b> getComponents() {
        r rVar = new r(T3.b.class, e.class);
        a aVar = new a(FirebaseMessaging.class, new Class[0]);
        aVar.f2707n = LIBRARY_NAME;
        aVar.a(j.a(g.class));
        aVar.a(new j(0, 0, InterfaceC0517a.class));
        aVar.a(new j(0, 1, b.class));
        aVar.a(new j(0, 1, a4.g.class));
        aVar.a(j.a(InterfaceC4450d.class));
        aVar.a(new j(rVar, 0, 1));
        aVar.a(j.a(Z3.b.class));
        aVar.f2713z = new C0434b(rVar, 1);
        if (!(aVar.f2708u == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        aVar.f2708u = 1;
        return Arrays.asList(aVar.b(), h.e(LIBRARY_NAME, "24.0.0"));
    }
}
