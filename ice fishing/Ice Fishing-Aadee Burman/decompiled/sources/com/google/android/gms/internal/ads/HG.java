package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class HG implements InterfaceC4043vG {

    /* renamed from: a, reason: collision with root package name */
    public static final HG f25250a = new HG();

    @Override // com.google.android.gms.internal.ads.InterfaceC4043vG
    public final Object a(S0.l lVar, S0.s sVar) {
        C3240gK i;
        List list;
        C3664oE N8 = lVar.N();
        HashMap hashMap = new HashMap();
        for (int i6 = 0; i6 < ((List) lVar.f2797u).size(); i6++) {
            C3664oE O8 = lVar.O(i6);
            if (O8.f32879b.equals(C3556mE.f31925v)) {
                SG sg = (SG) sVar.d(O8);
                WC wc = O8.f32878a;
                if (wc instanceof NG) {
                    i = ((NG) wc).i();
                } else {
                    if (!(wc instanceof ZF)) {
                        String name = wc.getClass().getName();
                        String valueOf = String.valueOf(wc.b());
                        throw new GeneralSecurityException(com.anythink.basead.exoplayer.f.f.o(new StringBuilder(name.length() + 59 + valueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", valueOf));
                    }
                    i = ((ZF) wc).i();
                }
                byte[] bArr = i.f30559a;
                if (bArr.length != 0 && bArr.length != 5) {
                    throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
                }
                if (hashMap.containsKey(i)) {
                    list = (List) hashMap.get(i);
                } else {
                    ArrayList arrayList = new ArrayList();
                    hashMap.put(i, arrayList);
                    list = arrayList;
                }
                list.add(sg);
            }
        }
        return new SG();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4043vG
    public final Class c() {
        return SG.class;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4043vG
    public final Class f() {
        return SG.class;
    }
}
