package ru.CryptoPro.JCSP.MSCAPI;

import java.util.Date;

/* loaded from: classes4.dex */
public class KoblitzProviderFeature implements ProviderFeature {
    private static final Date a = new Date(HProv.PP_SAME_MEDIA, 9, 28);
    private final boolean b;

    public KoblitzProviderFeature(int i, int i2, Date date) {
        this.b = i > 1280 || (i == 1280 && i2 >= 13333) || (date != null && date.after(a));
    }

    @Override // ru.CryptoPro.JCSP.MSCAPI.ProviderFeature
    public boolean isSupported() {
        return this.b;
    }

    public KoblitzProviderFeature(int i, int i2, HProv hProv) {
        this(i, i2, CAPI.c(hProv));
    }
}
