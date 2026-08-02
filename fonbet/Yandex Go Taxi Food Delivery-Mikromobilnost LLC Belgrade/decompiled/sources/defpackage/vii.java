package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lvii;", "Lxn11;", "Companion", "uii", "tii", "delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class vii implements xn11 {
    public static final uii Companion = new uii();
    public static final i3y[] g = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new jgi(3)), null, null, null};
    public static final vii h = new vii(0);
    public final boolean b;
    public final List c;
    public final int d;
    public final int e;
    public final int f;

    public /* synthetic */ vii(int i, boolean z, List list, int i2, int i3, int i4) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
        if ((i & 4) == 0) {
            this.d = 1;
        } else {
            this.d = i2;
        }
        if ((i & 8) == 0) {
            this.e = 0;
        } else {
            this.e = i3;
        }
        if ((i & 16) == 0) {
            this.f = 0;
        } else {
            this.f = i4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vii)) {
            return false;
        }
        vii viiVar = (vii) obj;
        return this.b == viiVar.b && jl40.l(this.c, viiVar.c) && this.d == viiVar.d && this.e == viiVar.e && this.f == viiVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + oyr.b(this.e, oyr.b(this.d, unr0.c(Boolean.hashCode(this.b) * 31, 31, this.c), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeliveryPhotocommentExperiment(enabled=");
        sb.append(this.b);
        sb.append(", tariffsWithPhotocomments=");
        sb.append(this.c);
        sb.append(", maxPointPhotocomments=");
        vfc.u(this.d, this.e, ", maxPhotoWidth=", ", maxPhotoHeight=", sb);
        return oyr.m(this.f, Extension.C_BRAKE, sb);
    }

    public vii(int i) {
        this.b = false;
        this.c = EmptyList.a;
        this.d = 1;
        this.e = 0;
        this.f = 0;
    }

    public vii() {
        this(0);
    }
}
