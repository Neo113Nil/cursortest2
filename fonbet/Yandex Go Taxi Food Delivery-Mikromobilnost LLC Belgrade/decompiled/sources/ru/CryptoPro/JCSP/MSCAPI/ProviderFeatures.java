package ru.CryptoPro.JCSP.MSCAPI;

import defpackage.cwf0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class ProviderFeatures implements cl_8 {
    public static final ProviderFeature DEFAULT = new cwf0();
    private final int e;
    private final int f;
    private final Map g;

    public ProviderFeatures(HProv hProv) {
        HashMap hashMap = new HashMap();
        this.g = hashMap;
        int a = CAPI.a(hProv);
        this.e = a;
        int b = CAPI.b(hProv);
        this.f = b;
        hashMap.put(2, new KoblitzProviderFeature(a, b, hProv));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a() {
        return false;
    }

    public int build() {
        return this.f;
    }

    public boolean isSupported(int i) {
        return ((ProviderFeature) this.g.getOrDefault(Integer.valueOf(i), DEFAULT)).isSupported();
    }

    public int version() {
        return this.e;
    }
}
