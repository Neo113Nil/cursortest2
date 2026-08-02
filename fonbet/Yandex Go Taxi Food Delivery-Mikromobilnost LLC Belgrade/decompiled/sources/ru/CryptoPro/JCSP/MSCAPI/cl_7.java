package ru.CryptoPro.JCSP.MSCAPI;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class cl_7 implements Serializable {
    public final String a;
    public final int b;

    public cl_7(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof cl_7)) {
            cl_7 cl_7Var = (cl_7) obj;
            if (this.a.equalsIgnoreCase(cl_7Var.a) && this.b == cl_7Var.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }
}
