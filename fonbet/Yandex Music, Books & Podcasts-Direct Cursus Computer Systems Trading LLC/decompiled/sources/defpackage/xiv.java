package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class xiv implements bjv {
    public final jjv a;
    public final String b;
    public final String c;
    public final lt d;
    public final ArrayList e;
    public final int f;

    public xiv(jjv jjvVar, String str, String str2, lt ltVar, ArrayList arrayList) {
        String str3;
        Integer b0;
        this.a = jjvVar;
        this.b = str;
        this.c = str2;
        this.d = ltVar;
        this.e = arrayList;
        if (StringsKt.toIntOrNull(str) == null) {
            dfi.r("Unexpected feedbackId: " + str + " for Album " + ltVar + StringUtil.SPACE + str2, "WheelItem");
        }
        u9b u9bVar = ltVar.e;
        this.f = (u9bVar == null || (str3 = u9bVar.b) == null || (b0 = y2x.b0(str3)) == null) ? -10716261 : b0.intValue();
    }

    @Override // defpackage.bjv
    public final jjv a() {
        return this.a;
    }

    @Override // defpackage.bjv
    public final int b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xiv)) {
            return false;
        }
        xiv xivVar = (xiv) obj;
        return this.a.equals(xivVar.a) && this.b.equals(xivVar.b) && Intrinsics.d(this.c, xivVar.c) && this.d.equals(xivVar.d) && this.e.equals(xivVar.e);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Album(style=");
        sb.append(this.a);
        sb.append(", feedbackId=");
        sb.append(this.b);
        sb.append(", descriptionWheelItem=");
        sb.append(this.c);
        sb.append(", album=");
        sb.append(this.d);
        sb.append(", artist=");
        return vz1.t(sb, this.e, ")");
    }
}
