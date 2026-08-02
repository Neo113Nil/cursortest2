package ru.CryptoPro.pc_0.pc_2;

import defpackage.puu0;
import java.io.Serializable;
import java.security.AccessController;

/* loaded from: classes4.dex */
public class cl_1 implements Serializable {
    public static final boolean a;
    private static final long serialVersionUID;
    private final String d;
    private final String e;
    private final String f = "";

    static {
        try {
            String str = (String) AccessController.doPrivileged(new puu0(13));
            a = str == null || !str.equals("1.0");
        } catch (Exception unused) {
            a = true;
        }
        serialVersionUID = a ? -9120448754896609940L : 4418622981026545151L;
    }

    public cl_1(String str, String str2) {
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof cl_1)) {
            cl_1 cl_1Var = (cl_1) obj;
            if (this.e.equals(cl_1Var.e) && this.d.equals(cl_1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() ^ this.d.hashCode();
    }

    public final String toString() {
        if (this.d.equals("")) {
            return this.e;
        }
        return "{" + this.d + "}" + this.e;
    }
}
