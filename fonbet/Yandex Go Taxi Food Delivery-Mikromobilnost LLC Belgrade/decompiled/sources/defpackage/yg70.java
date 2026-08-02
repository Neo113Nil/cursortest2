package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lyg70;", "", "Companion", "xg70", "wg70", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class yg70 {
    public static final xg70 Companion = new xg70();
    public static final i3y[] d = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new kz60(12))};
    public static final yg70 e = new yg70(0);
    public final String a;
    public final String b;
    public final List c;

    public /* synthetic */ yg70(int i, String str, String str2, List list) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = "number";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg70)) {
            return false;
        }
        yg70 yg70Var = (yg70) obj;
        return jl40.l(this.a, yg70Var.a) && jl40.l(this.b, yg70Var.b) && jl40.l(this.c, yg70Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ly3.s(b64.v("OptionsInfoDto(optionCategoryCaption=", this.a, ", optionType=", this.b, ", options="), this.c, Extension.C_BRAKE);
    }

    public yg70() {
        this(0);
    }

    public yg70(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public /* synthetic */ yg70(int i) {
        this("", "number", EmptyList.a);
    }
}
