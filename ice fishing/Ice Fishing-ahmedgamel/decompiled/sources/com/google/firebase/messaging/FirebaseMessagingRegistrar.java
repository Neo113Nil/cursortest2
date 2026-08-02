package com.google.firebase.messaging;

import Q3.g;
import S0.f;
import T3.a;
import T3.c;
import T3.j;
import T3.r;
import Y1.e;
import androidx.annotation.Keep;
import b4.InterfaceC0525b;
import c4.C0551b;
import com.google.firebase.components.ComponentRegistrar;
import d4.InterfaceC4462a;
import f4.d;
import java.util.Arrays;
import java.util.List;
import n4.b;

@Keep
/* loaded from: classes2.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(r rVar, c cVar) {
        g gVar = (g) cVar.a(g.class);
        if (cVar.a(InterfaceC4462a.class) == null) {
            return new FirebaseMessaging(gVar, cVar.e(b.class), cVar.e(c4.g.class), (d) cVar.a(d.class), cVar.c(rVar), (InterfaceC0525b) cVar.a(InterfaceC0525b.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<T3.b> getComponents() {
        r rVar = new r(V3.b.class, e.class);
        a aVar = new a(FirebaseMessaging.class, new Class[0]);
        aVar.f3162n = LIBRARY_NAME;
        aVar.a(j.a(g.class));
        aVar.a(new j(0, 0, InterfaceC4462a.class));
        aVar.a(new j(0, 1, b.class));
        aVar.a(new j(0, 1, c4.g.class));
        aVar.a(j.a(d.class));
        aVar.a(new j(rVar, 0, 1));
        aVar.a(j.a(InterfaceC0525b.class));
        aVar.f3168z = new C0551b(rVar, 1);
        if (!(aVar.f3163u == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        aVar.f3163u = 1;
        return Arrays.asList(aVar.b(), f.i(LIBRARY_NAME, "24.0.0"));
    }
}
