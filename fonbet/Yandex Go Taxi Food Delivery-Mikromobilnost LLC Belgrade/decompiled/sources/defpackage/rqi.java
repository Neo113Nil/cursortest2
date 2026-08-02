package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class rqi implements sqi {
    public final fri a;

    public rqi(fri friVar) {
        this.a = friVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rqi) && this.a.equals(((rqi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UrbanAds(urbanAdsSettings=" + this.a + Extension.C_BRAKE;
    }
}
