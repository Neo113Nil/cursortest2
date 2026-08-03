package com.google.firebase.datatransport;

import android.content.Context;
import bc.a0;
import com.google.firebase.components.ComponentRegistrar;
import d6.f;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import l7.b;
import l7.c;
import l7.j;
import l7.r;
import t5.e;
import u5.a;
import w5.i;
import w5.n;
import w5.o;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static e lambda$getComponents$0(c cVar) {
        byte[] bytes;
        o.b((Context) cVar.a(Context.class));
        o a6 = o.a();
        a aVar = a.f6696e;
        a6.getClass();
        Set unmodifiableSet = aVar != null ? Collections.unmodifiableSet(a.f6695d) : Collections.singleton(new t5.c("proto"));
        a5.c a8 = i.a();
        aVar.getClass();
        a8.f262h = "cct";
        String str = aVar.f6697a;
        String str2 = aVar.f6698b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        }
        a8.f261g = bytes;
        return new n(unmodifiableSet, a8.n(), a6);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(e.class));
        for (Class cls : new Class[0]) {
            i7.b.p(cls, "Null interface");
            hashSet.add(r.a(cls));
        }
        j a6 = j.a(Context.class);
        if (hashSet.contains(a6.f4236a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(a6);
        return Arrays.asList(new b(LIBRARY_NAME, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new f(26), hashSet3), a0.g(LIBRARY_NAME, "18.1.7"));
    }
}
