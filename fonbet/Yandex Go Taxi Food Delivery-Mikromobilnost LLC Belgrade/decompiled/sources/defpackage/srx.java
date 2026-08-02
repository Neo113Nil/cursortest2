package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lsrx;", "", "Companion", "orx", "qrx", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class srx {
    public static final qrx Companion = new qrx();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new aww(15)), null};
    public final List a;
    public final String b;

    public /* synthetic */ srx(int i, List list, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof srx)) {
            return false;
        }
        srx srxVar = (srx) obj;
        return jl40.l(this.a, srxVar.a) && jl40.l(this.b, srxVar.b);
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return xvz.i("LanguageInfo(mobileNetworks=", ", mapkitLangRegion=", this.b, Extension.C_BRAKE, this.a);
    }

    public srx(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public srx() {
        this(null, null);
    }
}
