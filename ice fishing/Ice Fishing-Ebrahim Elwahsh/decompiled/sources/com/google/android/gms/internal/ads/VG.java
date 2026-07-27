package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class VG implements AG {

    /* renamed from: a, reason: collision with root package name */
    public static final VG f28230a = new VG();

    /* renamed from: b, reason: collision with root package name */
    public static final C4002uG f28231b = new C4002uG(C3085dG.class, InterfaceC3946tE.class, DF.f24390I);

    @Override // com.google.android.gms.internal.ads.AG
    public final Class a() {
        return InterfaceC3946tE.class;
    }

    @Override // com.google.android.gms.internal.ads.AG
    public final Object b(C2593Hm c2593Hm, C4164xG c4164xG) {
        C3791qK j9;
        List list;
        HashMap hashMap = new HashMap();
        for (int i = 0; i < ((List) c2593Hm.f25417v).size(); i++) {
            C3838rE t9 = c2593Hm.t(i);
            if (t9.f33996b.equals(C3731pE.f33363v)) {
                XC xc = t9.f33995a;
                if (xc instanceof TG) {
                    j9 = ((TG) xc).j();
                } else {
                    if (!(xc instanceof C3085dG)) {
                        String name = xc.getClass().getName();
                        String valueOf = String.valueOf(xc.b());
                        throw new GeneralSecurityException(com.anythink.basead.b.c.i.q(new StringBuilder(name.length() + 59 + valueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", valueOf));
                    }
                    j9 = ((C3085dG) xc).j();
                }
                DF df = new DF(23);
                byte[] bArr = j9.f33687a;
                if (bArr.length != 0 && bArr.length != 5) {
                    throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
                }
                if (hashMap.containsKey(j9)) {
                    list = (List) hashMap.get(j9);
                } else {
                    ArrayList arrayList = new ArrayList();
                    hashMap.put(j9, arrayList);
                    list = arrayList;
                }
                list.add(df);
            }
        }
        if (((HashMap) c2593Hm.f25416u).get(AbstractC3194fG.class) != null) {
            throw new ClassCastException();
        }
        c2593Hm.p();
        return new C2977bH();
    }

    @Override // com.google.android.gms.internal.ads.AG
    public final Class d() {
        return InterfaceC3946tE.class;
    }
}
