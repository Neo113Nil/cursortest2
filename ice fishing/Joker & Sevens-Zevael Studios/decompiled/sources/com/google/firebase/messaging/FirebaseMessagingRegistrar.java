package com.google.firebase.messaging;

import bc.a0;
import com.google.firebase.components.ComponentRegistrar;
import f8.b;
import i7.g;
import java.util.Arrays;
import java.util.List;
import l7.c;
import l7.j;
import t5.e;
import u7.f;
import v7.a;
import x7.d;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(c cVar) {
        g gVar = (g) cVar.a(g.class);
        if (cVar.a(a.class) == null) {
            return new FirebaseMessaging(gVar, cVar.d(b.class), cVar.d(f.class), (d) cVar.a(d.class), (e) cVar.a(e.class), (t7.b) cVar.a(t7.b.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<l7.b> getComponents() {
        l7.a aVar = new l7.a(FirebaseMessaging.class, new Class[0]);
        aVar.f4208c = LIBRARY_NAME;
        aVar.a(j.a(g.class));
        aVar.a(new j(0, 0, a.class));
        aVar.a(new j(0, 1, b.class));
        aVar.a(new j(0, 1, f.class));
        aVar.a(new j(0, 0, e.class));
        aVar.a(j.a(d.class));
        aVar.a(j.a(t7.b.class));
        aVar.f4212g = new d6.f(4);
        if (!(aVar.f4206a == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        aVar.f4206a = 1;
        return Arrays.asList(aVar.c(), a0.g(LIBRARY_NAME, "23.4.0"));
    }
}
