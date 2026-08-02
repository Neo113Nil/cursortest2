package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lxja0;", "", "Companion", "vja0", "wja0", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class xja0 {
    public static final wja0 Companion = new wja0();
    public static final i3y[] f = {null, null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new f9a0(20))};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public /* synthetic */ xja0(int i, String str, String str2, String str3, String str4, List list) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = EmptyList.a;
        } else {
            this.e = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xja0)) {
            return false;
        }
        xja0 xja0Var = (xja0) obj;
        return jl40.l(this.a, xja0Var.a) && jl40.l(this.b, xja0Var.b) && jl40.l(this.c, xja0Var.c) && jl40.l(this.d, xja0Var.d) && jl40.l(this.e, xja0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.e.hashCode() + unr0.b((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("PaymentSelectorScreenDto(screenTitleKey=", this.a, ", screenSubtitleKey=", this.b, ", screenHeaderIconTag=");
        g8e.D(v, this.c, ", buttonTextKey=", this.d, ", listItems=");
        return ly3.s(v, this.e, Extension.C_BRAKE);
    }

    public xja0(int i) {
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = "";
        this.e = EmptyList.a;
    }

    public xja0() {
        this(0);
    }
}
