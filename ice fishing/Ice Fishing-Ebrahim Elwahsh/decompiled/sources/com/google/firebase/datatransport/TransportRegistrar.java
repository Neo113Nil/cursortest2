package com.google.firebase.datatransport;

import B1.w;
import N3.b;
import N3.c;
import N3.j;
import N3.r;
import W1.e;
import X1.a;
import Z1.o;
import android.content.Context;
import androidx.annotation.Keep;
import com.bumptech.glide.d;
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
        o.b((Context) cVar.a(Context.class));
        return o.a().c(a.f3813f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$1(c cVar) {
        o.b((Context) cVar.a(Context.class));
        return o.a().c(a.f3813f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$2(c cVar) {
        o.b((Context) cVar.a(Context.class));
        return o.a().c(a.f3812e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(e.class));
        for (Class cls : new Class[0]) {
            Z5.c.b(cls, "Null interface");
            hashSet.add(r.a(cls));
        }
        j a9 = j.a(Context.class);
        if (hashSet.contains(a9.f2177a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(a9);
        b bVar = new b(LIBRARY_NAME, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new w(19), hashSet3);
        N3.a a10 = b.a(new r(P3.a.class, e.class));
        a10.b(j.a(Context.class));
        a10.f2153z = new w(20);
        b c4 = a10.c();
        N3.a a11 = b.a(new r(P3.b.class, e.class));
        a11.b(j.a(Context.class));
        a11.f2153z = new w(21);
        return Arrays.asList(bVar, c4, a11.c(), d.g(LIBRARY_NAME, "18.2.0"));
    }
}
