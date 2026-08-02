package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ueu {
    public final String a;
    public final String b;

    public ueu(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ueu) {
                ueu ueuVar = (ueu) obj;
                if (Intrinsics.d(this.a, ueuVar.a)) {
                    String str = ueuVar.b;
                    String str2 = this.b;
                    if (str2 != null ? Intrinsics.d(str2, str) : str == null) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return hlr.e("\n            |ViewInfo {\n            |   name = '" + this.a + "',\n            |   sql = '" + this.b + "'\n            |}\n        ");
    }
}
