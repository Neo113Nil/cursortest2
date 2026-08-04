package com.gamericefishpro.space.n9;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {
    public static final AtomicReference b = new AtomicReference();
    public static final AtomicReference c = new AtomicReference();
    public static final AtomicReference d = new AtomicReference();
    public final h1 a;

    public p0(h1 h1Var) {
        this.a = h1Var;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        com.gamericefishpro.space.v8.c0.g(atomicReference);
        com.gamericefishpro.space.v8.c0.b(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + "(" + strArr[i] + ")";
                            strArr3[i] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.b() ? str : g(str, f2.c, f2.a, b);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.b() ? str : g(str, f2.f, f2.e, c);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (this.a.b()) {
            return str.startsWith("_exp_") ? com.gamericefishpro.space.t0.y0.g("experiment_id(", str, ")") : g(str, f2.j, f2.i, d);
        }
        return str;
    }

    public final String d(u uVar) {
        String string;
        h1 h1Var = this.a;
        if (!h1Var.b()) {
            return uVar.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(uVar.i);
        sb.append(",name=");
        sb.append(a(uVar.d));
        sb.append(",params=");
        t tVar = uVar.e;
        if (tVar == null) {
            string = null;
        } else {
            string = !h1Var.b() ? tVar.d.toString() : e(tVar.f());
        }
        sb.append(string);
        return sb.toString();
    }

    public final String e(Bundle bundle) {
        String strF;
        if (bundle == null) {
            return null;
        }
        if (!this.a.b()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(b(str));
            sb.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strF = f(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strF = f((Object[]) obj);
            } else {
                strF = obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sb.append(strF);
        }
        sb.append("}]");
        return sb.toString();
    }

    public final String f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String strE = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (strE != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(strE);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
