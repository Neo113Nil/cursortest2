package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lw03;", "", "Companion", "s03", "u03", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class w03 {
    public static final u03 Companion = new u03();
    public static final i3y[] i;
    public final zzs a;
    public final Integer b;
    public final uc4 c;
    public final String d;
    public final List e;
    public final List f;
    public final srx g;
    public final List h;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        i = new i3y[]{null, null, null, null, a.b(lazyThreadSafetyMode, new ly1(21)), a.b(lazyThreadSafetyMode, new ly1(22)), null, a.b(lazyThreadSafetyMode, new ly1(23))};
    }

    public /* synthetic */ w03(int i2, zzs zzsVar, Integer num, uc4 uc4Var, String str, List list, List list2, srx srxVar, List list3) {
        if ((i2 & 1) == 0) {
            this.a = null;
        } else {
            this.a = zzsVar;
        }
        if ((i2 & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = uc4Var;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i2 & 16) == 0) {
            this.e = EmptyList.a;
        } else {
            this.e = list;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = list2;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = srxVar;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w03)) {
            return false;
        }
        w03 w03Var = (w03) obj;
        return jl40.l(this.a, w03Var.a) && jl40.l(this.b, w03Var.b) && jl40.l(this.c, w03Var.c) && jl40.l(this.d, w03Var.d) && jl40.l(this.e, w03Var.e) && jl40.l(this.f, w03Var.f) && jl40.l(this.g, w03Var.g) && jl40.l(this.h, w03Var.h);
    }

    public final int hashCode() {
        zzs zzsVar = this.a;
        int hashCode = (zzsVar == null ? 0 : zzsVar.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        uc4 uc4Var = this.c;
        int hashCode3 = (hashCode2 + (uc4Var == null ? 0 : uc4Var.hashCode())) * 31;
        String str = this.d;
        int c = unr0.c((hashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        List list = this.f;
        int hashCode4 = (c + (list == null ? 0 : list.hashCode())) * 31;
        srx srxVar = this.g;
        int hashCode5 = (hashCode4 + (srxVar == null ? 0 : srxVar.hashCode())) * 31;
        List list2 = this.h;
        return hashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApplicationState(location=");
        sb.append(this.a);
        sb.append(", accuracy=");
        sb.append(this.b);
        sb.append(", bBox=");
        sb.append(this.c);
        sb.append(", zone=");
        sb.append(this.d);
        sb.append(", knownOrders=");
        nnm.w(sb, this.e, ", fields=", this.f, ", languageInfo=");
        sb.append(this.g);
        sb.append(", availablePaymentMethods=");
        sb.append(this.h);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public w03() {
        this(0);
    }

    public w03(zzs zzsVar, Integer num, uc4 uc4Var, String str, List list, ArrayList arrayList, srx srxVar, List list2) {
        this.a = zzsVar;
        this.b = num;
        this.c = uc4Var;
        this.d = str;
        this.e = list;
        this.f = arrayList;
        this.g = srxVar;
        this.h = list2;
    }

    public /* synthetic */ w03(int i2) {
        this(null, null, null, null, EmptyList.a, null, null, null);
    }
}
