package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class xgg0 {
    public static final xgg0 c = new xgg0("com.yandex.go", "go_android");
    public final String a;
    public final String b;

    public xgg0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xgg0)) {
            return false;
        }
        xgg0 xgg0Var = (xgg0) obj;
        return this.a.equals(xgg0Var.a) && this.b.equals(xgg0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("QuarkApiConfig(appId=", this.a, ", platform=", this.b, Extension.C_BRAKE);
    }
}
