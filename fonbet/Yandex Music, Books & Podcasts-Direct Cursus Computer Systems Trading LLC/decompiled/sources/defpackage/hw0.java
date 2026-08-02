package defpackage;

import com.connectsdk.device.ConnectableDevice;
import java.util.Map;

/* loaded from: classes3.dex */
public final class hw0 {
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;

    public hw0(String str, String str2, String str3, boolean z) {
        if (str == null) {
            jj4.j(ConnectableDevice.KEY_ID);
            throw null;
        }
        if (str2 == null) {
            jj4.j("name");
            throw null;
        }
        if (str3 == null) {
            jj4.j("version");
            throw null;
        }
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
    }

    public static hw0 a(Map map) {
        if (map == null) {
            jj4.j("info");
            return null;
        }
        return new hw0((String) map.get(ConnectableDevice.KEY_ID), (String) map.get("name"), (String) map.get("version"), ((Boolean) map.get("running")).booleanValue());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hw0)) {
            return false;
        }
        hw0 hw0Var = (hw0) obj;
        String str = hw0Var.a;
        String str2 = this.a;
        if (str2 != null ? !str2.equals(str) : str != null) {
            return false;
        }
        if (this.b != hw0Var.b) {
            return false;
        }
        String str3 = hw0Var.c;
        String str4 = this.c;
        if (str4 != null ? !str4.equals(str3) : str3 != null) {
            return false;
        }
        String str5 = hw0Var.d;
        String str6 = this.d;
        return str6 != null ? str6.equals(str5) : str5 == null;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = ((((str == null ? 43 : str.hashCode()) + 59) * 59) + (this.b ? 79 : 97)) * 59;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 43 : str2.hashCode())) * 59;
        String str3 = this.d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 43);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApplicationInfo(id=");
        sb.append(this.a);
        sb.append(", running=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", version=");
        return su4.o(sb, this.d, ")");
    }
}
