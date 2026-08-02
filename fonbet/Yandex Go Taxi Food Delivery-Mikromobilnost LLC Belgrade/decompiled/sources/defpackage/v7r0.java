package defpackage;

import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class v7r0 {
    public final String a;
    public final String b;
    public final List c;

    public v7r0(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean a() {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((j59) obj).a, "spoiler_settings_category")) {
                break;
            }
        }
        return obj != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7r0)) {
            return false;
        }
        v7r0 v7r0Var = (v7r0) obj;
        return jl40.l(this.a, v7r0Var.a) && jl40.l(this.b, v7r0Var.b) && this.c.equals(v7r0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return ly3.s(b64.v("SettingsEntity(title=", this.a, ", description=", this.b, ", categories="), this.c, Extension.C_BRAKE);
    }
}
