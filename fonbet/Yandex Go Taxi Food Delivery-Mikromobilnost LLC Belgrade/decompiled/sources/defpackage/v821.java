package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes11.dex */
public final class v821 {
    public final tls a;

    public v821(tls tlsVar) {
        this.a = tlsVar;
    }

    public final nvu0 a(nvu0 nvu0Var, List list) {
        tls tlsVar = this.a;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            String str = (String) obj;
            try {
                nvu0Var = nvu0Var.get(str);
                if (jl40.l(nvu0Var, bei.Q)) {
                    tlsVar.invoke("Element with path '" + a.X(a.A0(list, i2), "/", null, null, null, 62) + "' is not a structure");
                    return null;
                }
                if (nvu0Var == null) {
                    tlsVar.invoke("Element with path '" + a.X(a.A0(list, i2), "/", null, null, null, 62) + "' is not found");
                    return null;
                }
                i = i2;
            } catch (NumberFormatException unused) {
                tlsVar.invoke("Unable to use '" + str + "' as array index");
                return null;
            }
        }
        return nvu0Var;
    }

    public final ArrayList b(String str) {
        List W;
        W = evu0.W(str, new String[]{"/"}, (r2 & 4) != 0 ? 0 : 2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : W) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        if (str.length() <= 0 || !arrayList.isEmpty()) {
            return arrayList;
        }
        this.a.invoke("Malformed path '" + str + "': all path segments are empty");
        return null;
    }

    public final boolean c(nvu0 nvu0Var, String str, Object obj) {
        tls tlsVar = this.a;
        try {
            nvu0Var.set(str, obj);
            return true;
        } catch (IndexOutOfBoundsException unused) {
            tlsVar.invoke("Position '" + str + "' is out of array bounds");
            return false;
        } catch (NumberFormatException unused2) {
            tlsVar.invoke("Unable to use '" + str + "' as array index");
            return false;
        }
    }
}
