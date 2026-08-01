package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.lJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3507lJ implements InterfaceC4043vG {

    /* renamed from: a, reason: collision with root package name */
    public static final C3507lJ f31756a = new C3507lJ();

    /* renamed from: b, reason: collision with root package name */
    public static final C3774qG f31757b = new C3774qG(ZF.class, InterfaceC4041vE.class, C3453kJ.f31410u);

    @Override // com.google.android.gms.internal.ads.InterfaceC4043vG
    public final Object a(S0.l lVar, S0.s sVar) {
        C3240gK i;
        List arrayList;
        HashMap hashMap = new HashMap();
        for (int i6 = 0; i6 < ((List) lVar.f2797u).size(); i6++) {
            C3664oE O8 = lVar.O(i6);
            if (O8.f32879b.equals(C3556mE.f31925v)) {
                InterfaceC4041vE interfaceC4041vE = (InterfaceC4041vE) sVar.d(O8);
                WC wc = O8.f32878a;
                if (wc instanceof AJ) {
                    i = ((AJ) wc).i();
                } else {
                    if (!(wc instanceof ZF)) {
                        String name = wc.getClass().getName();
                        String valueOf = String.valueOf(wc.b());
                        throw new GeneralSecurityException(com.anythink.basead.exoplayer.f.f.o(new StringBuilder(name.length() + 59 + valueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", valueOf));
                    }
                    i = ((ZF) wc).i();
                }
                OJ oj = new OJ(interfaceC4041vE, O8.f32880c);
                byte[] bArr = i.f30559a;
                if (bArr.length != 0 && bArr.length != 5) {
                    throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
                }
                if (hashMap.containsKey(i)) {
                    arrayList = (List) hashMap.get(i);
                } else {
                    arrayList = new ArrayList();
                    hashMap.put(i, arrayList);
                }
                arrayList.add(oj);
            }
        }
        if (((HashMap) lVar.f2798v).get(AbstractC2968bG.class) == null) {
            return new NJ(new C3720pG(hashMap));
        }
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4043vG
    public final Class c() {
        return InterfaceC4041vE.class;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4043vG
    public final Class f() {
        return InterfaceC4041vE.class;
    }
}
