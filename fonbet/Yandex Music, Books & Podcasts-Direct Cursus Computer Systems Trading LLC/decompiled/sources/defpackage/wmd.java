package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class wmd {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public wmd(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final String a() {
        String str = this.d;
        String str2 = this.c;
        String str3 = this.b;
        if ((str3 == null || str3.length() == 0) && ((str2 == null || str2.length() == 0) && (str == null || str.length() == 0))) {
            String str4 = this.a;
            return str4 == null ? "" : str4;
        }
        if (str3 == null) {
            str3 = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str == null) {
            str = "";
        }
        return str3 + StringUtil.SPACE + str2 + StringUtil.SPACE + str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmd)) {
            return false;
        }
        wmd wmdVar = (wmd) obj;
        return Intrinsics.d(this.a, wmdVar.a) && Intrinsics.d(this.b, wmdVar.b) && Intrinsics.d(this.c, wmdVar.c) && Intrinsics.d(this.d, wmdVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return ouj.q(f1d.m("SearchRequest(rawInput=", this.a, ", artist=", this.b, ", album="), this.c, ", title=", this.d, ")");
    }
}
