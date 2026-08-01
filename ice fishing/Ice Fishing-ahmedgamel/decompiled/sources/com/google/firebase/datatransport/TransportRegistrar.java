package com.google.firebase.datatransport;

import B1.x;
import R3.b;
import R3.c;
import R3.j;
import R3.r;
import W1.e;
import X1.a;
import Z1.o;
import android.content.Context;
import androidx.annotation.Keep;
import com.bumptech.glide.h;
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
        return o.a().c(a.f3757f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$1(c cVar) {
        o.b((Context) cVar.a(Context.class));
        return o.a().c(a.f3757f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$2(c cVar) {
        o.b((Context) cVar.a(Context.class));
        return o.a().c(a.f3756e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(e.class));
        for (Class cls : new Class[0]) {
            X2.e.z(cls, "Null interface");
            hashSet.add(r.a(cls));
        }
        j a9 = j.a(Context.class);
        if (hashSet.contains(a9.f2737a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(a9);
        b bVar = new b(LIBRARY_NAME, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new x(19), hashSet3);
        R3.a a10 = b.a(new r(T3.a.class, e.class));
        a10.a(j.a(Context.class));
        a10.f2713z = new x(20);
        b b9 = a10.b();
        R3.a a11 = b.a(new r(T3.b.class, e.class));
        a11.a(j.a(Context.class));
        a11.f2713z = new x(21);
        return Arrays.asList(bVar, b9, a11.b(), h.e(LIBRARY_NAME, "18.2.0"));
    }
}
