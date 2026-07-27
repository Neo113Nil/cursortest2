package com.google.firebase.messaging;

import K3.g;
import N3.c;
import N3.j;
import N3.r;
import W1.e;
import X3.a;
import Z3.d;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import h4.b;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(r rVar, c cVar) {
        g gVar = (g) cVar.a(g.class);
        if (cVar.a(a.class) == null) {
            return new FirebaseMessaging(gVar, cVar.c(b.class), cVar.c(W3.g.class), (d) cVar.a(d.class), cVar.f(rVar), (V3.b) cVar.a(V3.b.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<N3.b> getComponents() {
        r rVar = new r(P3.b.class, e.class);
        N3.a aVar = new N3.a(FirebaseMessaging.class, new Class[0]);
        aVar.f2147n = LIBRARY_NAME;
        aVar.b(j.a(g.class));
        aVar.b(new j(0, 0, a.class));
        aVar.b(new j(0, 1, b.class));
        aVar.b(new j(0, 1, W3.g.class));
        aVar.b(j.a(d.class));
        aVar.b(new j(rVar, 0, 1));
        aVar.b(j.a(V3.b.class));
        aVar.f2153z = new W3.b(rVar, 1);
        if (!(aVar.f2148u == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        aVar.f2148u = 1;
        return Arrays.asList(aVar.c(), com.bumptech.glide.d.g(LIBRARY_NAME, "24.0.0"));
    }
}
