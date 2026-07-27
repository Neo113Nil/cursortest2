package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class PG implements InterfaceC4043vG {

    /* renamed from: a, reason: collision with root package name */
    public static final PG f26751a = new PG();

    /* renamed from: b, reason: collision with root package name */
    public static final C3774qG f26752b = new C3774qG(ZF.class, InterfaceC3772qE.class, C3880sF.J);

    @Override // com.google.android.gms.internal.ads.InterfaceC4043vG
    public final Object a(S0.l lVar, S0.s sVar) {
        C3240gK i;
        List list;
        HashMap hashMap = new HashMap();
        for (int i6 = 0; i6 < ((List) lVar.f2797u).size(); i6++) {
            C3664oE O8 = lVar.O(i6);
            if (O8.f32879b.equals(C3556mE.f31925v)) {
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
                C3880sF c3880sF = new C3880sF(24);
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
                list.add(c3880sF);
            }
        }
        if (((HashMap) lVar.f2798v).get(AbstractC2968bG.class) != null) {
            throw new ClassCastException();
        }
        lVar.N();
        return new UG();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4043vG
    public final Class c() {
        return InterfaceC3772qE.class;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4043vG
    public final Class f() {
        return InterfaceC3772qE.class;
    }
}
