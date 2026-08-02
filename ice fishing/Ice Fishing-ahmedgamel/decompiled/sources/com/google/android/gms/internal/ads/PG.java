package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class PG implements InterfaceC4066vG {

    /* renamed from: a, reason: collision with root package name */
    public static final PG f27534a = new PG();

    /* renamed from: b, reason: collision with root package name */
    public static final C3797qG f27535b = new C3797qG(ZF.class, InterfaceC3795qE.class, C3903sF.J);

    @Override // com.google.android.gms.internal.ads.InterfaceC4066vG
    public final Object a(S0.l lVar, S0.s sVar) {
        C3263gK i;
        List list;
        HashMap hashMap = new HashMap();
        for (int i4 = 0; i4 < ((List) lVar.f2926u).size(); i4++) {
            C3687oE O8 = lVar.O(i4);
            if (O8.f33666b.equals(C3579mE.f32705v)) {
                WC wc = O8.f33665a;
                if (wc instanceof NG) {
                    i = ((NG) wc).i();
                } else {
                    if (!(wc instanceof ZF)) {
                        String name = wc.getClass().getName();
                        String valueOf = String.valueOf(wc.b());
                        throw new GeneralSecurityException(com.IceFishing.LiveIceFishing.k.r(new StringBuilder(name.length() + 59 + valueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", valueOf));
                    }
                    i = ((ZF) wc).i();
                }
                C3903sF c3903sF = new C3903sF(24);
                byte[] bArr = i.f31325a;
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
                list.add(c3903sF);
            }
        }
        if (((HashMap) lVar.f2927v).get(AbstractC2991bG.class) != null) {
            throw new ClassCastException();
        }
        lVar.N();
        return new UG();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4066vG
    public final Class c() {
        return InterfaceC3795qE.class;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4066vG
    public final Class f() {
        return InterfaceC3795qE.class;
    }
}
