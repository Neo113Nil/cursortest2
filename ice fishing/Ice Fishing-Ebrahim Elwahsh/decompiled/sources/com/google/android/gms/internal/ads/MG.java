package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class MG implements AG {

    /* renamed from: a, reason: collision with root package name */
    public static final MG f26318a = new MG();

    @Override // com.google.android.gms.internal.ads.AG
    public final Class a() {
        return YG.class;
    }

    @Override // com.google.android.gms.internal.ads.AG
    public final Object b(C2593Hm c2593Hm, C4164xG c4164xG) {
        C3791qK j9;
        List list;
        C3838rE p6 = c2593Hm.p();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < ((List) c2593Hm.f25417v).size(); i++) {
            C3838rE t9 = c2593Hm.t(i);
            if (t9.f33996b.equals(C3731pE.f33363v)) {
                YG yg = (YG) c4164xG.J(t9);
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
                list.add(yg);
            }
        }
        return new YG();
    }

    @Override // com.google.android.gms.internal.ads.AG
    public final Class d() {
        return YG.class;
    }
}
