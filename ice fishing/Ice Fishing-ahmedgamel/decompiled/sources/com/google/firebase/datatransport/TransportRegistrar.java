package com.google.firebase.datatransport;

import S0.f;
import T3.b;
import T3.c;
import T3.j;
import T3.r;
import Y1.e;
import Z1.a;
import android.content.Context;
import androidx.annotation.Keep;
import b2.n;
import com.bumptech.glide.g;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$0(c cVar) {
        n.b((Context) cVar.a(Context.class));
        return n.a().c(a.f4108f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$1(c cVar) {
        n.b((Context) cVar.a(Context.class));
        return n.a().c(a.f4108f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$2(c cVar) {
        n.b((Context) cVar.a(Context.class));
        return n.a().c(a.f4107e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(e.class));
        for (Class cls : new Class[0]) {
            g.g(cls, "Null interface");
            hashSet.add(r.a(cls));
        }
        j a9 = j.a(Context.class);
        if (hashSet.contains(a9.f3192a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(a9);
        b bVar = new b(LIBRARY_NAME, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new D0.n(19), hashSet3);
        T3.a a10 = b.a(new r(V3.a.class, e.class));
        a10.a(j.a(Context.class));
        a10.f3168z = new D0.n(20);
        b b9 = a10.b();
        T3.a a11 = b.a(new r(V3.b.class, e.class));
        a11.a(j.a(Context.class));
        a11.f3168z = new D0.n(21);
        return Arrays.asList(bVar, b9, a11.b(), f.i(LIBRARY_NAME, "18.2.0"));
    }
}
