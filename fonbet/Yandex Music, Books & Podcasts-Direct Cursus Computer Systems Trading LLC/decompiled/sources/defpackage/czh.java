package defpackage;

import com.connectsdk.service.NetcastTVService;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class czh {
    public final gw0 a;
    public final String b;
    public final Object c;
    public final un4 d;
    public final byte[] e;

    public czh(gw0 gw0Var, String str, Object obj, un4 un4Var, byte[] bArr) {
        if (str == null) {
            jj4.j(NetcastTVService.UDAP_API_EVENT);
            throw null;
        }
        if (un4Var == null) {
            jj4.j("from");
            throw null;
        }
        this.a = gw0Var;
        this.b = str;
        this.c = obj;
        this.d = un4Var;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof czh)) {
            return false;
        }
        czh czhVar = (czh) obj;
        if (!this.a.equals(czhVar.a)) {
            return false;
        }
        String str = czhVar.b;
        String str2 = this.b;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        Object obj2 = czhVar.c;
        Object obj3 = this.c;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
        } else if (!obj3.equals(obj2)) {
            return false;
        }
        un4 un4Var = czhVar.d;
        un4 un4Var2 = this.d;
        if (un4Var2 == null) {
            if (un4Var != null) {
                return false;
            }
        } else if (!un4Var2.equals(un4Var)) {
            return false;
        }
        return Arrays.equals(this.e, czhVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() + 59) * 59;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 43 : str.hashCode())) * 59;
        Object obj = this.c;
        int hashCode3 = (hashCode2 + (obj == null ? 43 : obj.hashCode())) * 59;
        un4 un4Var = this.d;
        return Arrays.hashCode(this.e) + ((hashCode3 + (un4Var != null ? un4Var.hashCode() : 43)) * 59);
    }

    public final String toString() {
        return "Message(event=" + this.b + ", data=" + this.c + ", from=" + this.d + ")";
    }
}
