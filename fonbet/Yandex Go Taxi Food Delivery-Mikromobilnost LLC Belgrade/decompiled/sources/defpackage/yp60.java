package defpackage;

import com.google.gson.ToNumberPolicy;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.stream.JsonToken;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class yp60 extends nl11 {
    public static final ln60 c = new ln60(1, ToNumberPolicy.DOUBLE);
    public final u3u a;
    public final sjz0 b;

    public yp60(u3u u3uVar, sjz0 sjz0Var) {
        this.a = u3uVar;
        this.b = sjz0Var;
    }

    public static Serializable b(wdx wdxVar, JsonToken jsonToken) {
        int i = xp60.a[jsonToken.ordinal()];
        if (i == 1) {
            wdxVar.a();
            return new ArrayList();
        }
        if (i != 2) {
            return null;
        }
        wdxVar.c();
        return new LinkedTreeMap();
    }

    public final Serializable a(wdx wdxVar, JsonToken jsonToken) {
        int i = xp60.a[jsonToken.ordinal()];
        if (i == 3) {
            return wdxVar.nextString();
        }
        if (i == 4) {
            return this.b.a(wdxVar);
        }
        if (i == 5) {
            return Boolean.valueOf(wdxVar.nextBoolean());
        }
        if (i == 6) {
            wdxVar.B0();
            return null;
        }
        yci0.k(jsonToken, "Unexpected token: ");
        return null;
    }

    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        JsonToken R = wdxVar.R();
        Object b = b(wdxVar, R);
        if (b == null) {
            return a(wdxVar, R);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (wdxVar.hasNext()) {
                String nextName = b instanceof Map ? wdxVar.nextName() : null;
                JsonToken R2 = wdxVar.R();
                Serializable b2 = b(wdxVar, R2);
                boolean z = b2 != null;
                if (b2 == null) {
                    b2 = a(wdxVar, R2);
                }
                if (b instanceof List) {
                    ((List) b).add(b2);
                } else {
                    ((Map) b).put(nextName, b2);
                }
                if (z) {
                    arrayDeque.addLast(b);
                    b = b2;
                }
            } else {
                if (b instanceof List) {
                    wdxVar.k();
                } else {
                    wdxVar.n();
                }
                if (arrayDeque.isEmpty()) {
                    return b;
                }
                b = arrayDeque.removeLast();
            }
        }
    }

    @Override // defpackage.nl11
    public final void write(afx afxVar, Object obj) {
        if (obj == null) {
            afxVar.w();
            return;
        }
        nl11 f = this.a.f(obj.getClass());
        if (!(f instanceof yp60)) {
            f.write(afxVar, obj);
        } else {
            afxVar.d();
            afxVar.n();
        }
    }
}
