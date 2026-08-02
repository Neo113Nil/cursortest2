package defpackage;

import com.connectsdk.service.airplay.PListParser;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class ks3 {
    public static final ks3 h;
    public final ce7 a;
    public final Executor b;
    public final Object[][] c;
    public final List d;
    public final Boolean e;
    public final Integer f;
    public final Integer g;

    static {
        eps epsVar = new eps();
        epsVar.c = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        epsVar.d = Collections.EMPTY_LIST;
        h = new ks3(epsVar);
    }

    public ks3(eps epsVar) {
        this.a = (ce7) epsVar.a;
        this.b = (Executor) epsVar.b;
        this.c = (Object[][]) epsVar.c;
        this.d = (List) epsVar.d;
        this.e = (Boolean) epsVar.e;
        this.f = (Integer) epsVar.f;
        this.g = (Integer) epsVar.g;
    }

    public static eps b(ks3 ks3Var) {
        eps epsVar = new eps();
        epsVar.a = ks3Var.a;
        epsVar.b = ks3Var.b;
        epsVar.c = ks3Var.c;
        epsVar.d = ks3Var.d;
        epsVar.e = ks3Var.e;
        epsVar.f = ks3Var.f;
        epsVar.g = ks3Var.g;
        return epsVar;
    }

    public final Object a(js3 js3Var) {
        o2g.O(js3Var, PListParser.TAG_KEY);
        int i = 0;
        while (true) {
            Object[][] objArr = this.c;
            if (i >= objArr.length) {
                return null;
            }
            if (js3Var.equals(objArr[i][0])) {
                return objArr[i][1];
            }
            i++;
        }
    }

    public final ks3 c(js3 js3Var, Object obj) {
        Object[][] objArr;
        o2g.O(js3Var, PListParser.TAG_KEY);
        eps b = b(this);
        int i = 0;
        while (true) {
            objArr = this.c;
            if (i >= objArr.length) {
                i = -1;
                break;
            }
            if (js3Var.equals(objArr[i][0])) {
                break;
            }
            i++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length + (i == -1 ? 1 : 0), 2);
        b.c = objArr2;
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        Object[][] objArr3 = (Object[][]) b.c;
        if (i == -1) {
            objArr3[objArr.length] = new Object[]{js3Var, obj};
        } else {
            objArr3[i] = new Object[]{js3Var, obj};
        }
        return new ks3(b);
    }

    public final String toString() {
        z0j Y = ezf.Y(this);
        Y.q(this.a, "deadline");
        Y.q(null, "authority");
        Y.q(null, "callCredentials");
        Executor executor = this.b;
        Y.q(executor != null ? executor.getClass() : null, "executor");
        Y.q(null, "compressorName");
        Y.q(Arrays.deepToString(this.c), "customOptions");
        Y.t("waitForReady", Boolean.TRUE.equals(this.e));
        Y.q(this.f, "maxInboundMessageSize");
        Y.q(this.g, "maxOutboundMessageSize");
        Y.q(this.d, "streamTracerFactories");
        return Y.toString();
    }
}
