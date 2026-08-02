package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lyqc0;", "", "Companion", "wqc0", "xqc0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class yqc0 {
    public static final xqc0 Companion = new xqc0();
    public final int a;
    public final Integer b;
    public final int c;

    public /* synthetic */ yqc0(int i, int i2, int i3, Integer num) {
        if ((i & 1) == 0) {
            this.a = 0;
        } else {
            this.a = i2;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqc0)) {
            return false;
        }
        yqc0 yqc0Var = (yqc0) obj;
        return this.a == yqc0Var.a && jl40.l(this.b, yqc0Var.b) && this.c == yqc0Var.c;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return Integer.hashCode(this.c) + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaqueShowParamsDto(showAfter=");
        sb.append(this.a);
        sb.append(", closeAfter=");
        sb.append(this.b);
        sb.append(", ttl=");
        return oyr.m(this.c, Extension.C_BRAKE, sb);
    }

    public yqc0(int i) {
        this.a = 0;
        this.b = null;
        this.c = 0;
    }

    public yqc0() {
        this(0);
    }
}
