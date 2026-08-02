package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.lJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3530lJ implements InterfaceC4066vG {

    /* renamed from: a, reason: collision with root package name */
    public static final C3530lJ f32536a = new C3530lJ();

    /* renamed from: b, reason: collision with root package name */
    public static final C3797qG f32537b = new C3797qG(ZF.class, InterfaceC4064vE.class, C3476kJ.f32189u);

    @Override // com.google.android.gms.internal.ads.InterfaceC4066vG
    public final Object a(S0.l lVar, S0.s sVar) {
        C3263gK i;
        List arrayList;
        HashMap hashMap = new HashMap();
        for (int i4 = 0; i4 < ((List) lVar.f2926u).size(); i4++) {
            C3687oE O8 = lVar.O(i4);
            if (O8.f33666b.equals(C3579mE.f32705v)) {
                InterfaceC4064vE interfaceC4064vE = (InterfaceC4064vE) sVar.d(O8);
                WC wc = O8.f33665a;
                if (wc instanceof AJ) {
                    i = ((AJ) wc).i();
                } else {
                    if (!(wc instanceof ZF)) {
                        String name = wc.getClass().getName();
                        String valueOf = String.valueOf(wc.b());
                        throw new GeneralSecurityException(com.IceFishing.LiveIceFishing.k.r(new StringBuilder(name.length() + 59 + valueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", valueOf));
                    }
                    i = ((ZF) wc).i();
                }
                OJ oj = new OJ(interfaceC4064vE, O8.f33667c);
                byte[] bArr = i.f31325a;
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
        if (((HashMap) lVar.f2927v).get(AbstractC2991bG.class) == null) {
            return new NJ(new C3743pG(hashMap));
        }
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4066vG
    public final Class c() {
        return InterfaceC4064vE.class;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4066vG
    public final Class f() {
        return InterfaceC4064vE.class;
    }
}
