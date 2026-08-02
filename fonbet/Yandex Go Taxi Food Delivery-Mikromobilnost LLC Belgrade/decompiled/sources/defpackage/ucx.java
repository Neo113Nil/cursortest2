package defpackage;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.a;
import com.google.gson.internal.c;
import com.google.gson.stream.JsonToken;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes11.dex */
public class ucx extends nl11 {
    public static final ucx a = new ucx();

    private ucx() {
    }

    public static pcx a(wdx wdxVar, JsonToken jsonToken) {
        int i = tcx.a[jsonToken.ordinal()];
        if (i == 3) {
            return new rdx(wdxVar.nextString());
        }
        if (i == 4) {
            return new rdx(new LazilyParsedNumber(wdxVar.nextString()));
        }
        if (i == 5) {
            return new rdx(Boolean.valueOf(wdxVar.nextBoolean()));
        }
        if (i == 6) {
            wdxVar.B0();
            return fdx.a;
        }
        yci0.k(jsonToken, "Unexpected token: ");
        return null;
    }

    public static pcx b(wdx wdxVar, JsonToken jsonToken) {
        int i = tcx.a[jsonToken.ordinal()];
        if (i == 1) {
            wdxVar.a();
            return new wbx();
        }
        if (i != 2) {
            return null;
        }
        wdxVar.c();
        return new jdx();
    }

    public static void c(pcx pcxVar, afx afxVar) {
        if (pcxVar == null || (pcxVar instanceof fdx)) {
            afxVar.w();
            return;
        }
        if (pcxVar instanceof rdx) {
            rdx rdxVar = (rdx) pcxVar;
            Serializable serializable = rdxVar.a;
            if (serializable instanceof Number) {
                afxVar.U(rdxVar.e());
                return;
            } else if (serializable instanceof Boolean) {
                afxVar.Z(rdxVar.b());
                return;
            } else {
                afxVar.W(rdxVar.f());
                return;
            }
        }
        boolean z = pcxVar instanceof wbx;
        if (z) {
            afxVar.c();
            if (!z) {
                yci0.k(pcxVar, "Not a JSON Array: ");
                return;
            }
            Iterator it = ((wbx) pcxVar).a.iterator();
            while (it.hasNext()) {
                c((pcx) it.next(), afxVar);
            }
            afxVar.k();
            return;
        }
        boolean z2 = pcxVar instanceof jdx;
        if (!z2) {
            vg10.g(pcxVar.getClass(), "Couldn't write ");
            return;
        }
        afxVar.d();
        if (!z2) {
            yci0.k(pcxVar, "Not a JSON Object: ");
            return;
        }
        Iterator it2 = ((a) ((jdx) pcxVar).a.entrySet()).iterator();
        while (((c) it2).hasNext()) {
            aqy a2 = ((zpy) it2).a();
            afxVar.o((String) a2.getKey());
            c((pcx) a2.getValue(), afxVar);
        }
        afxVar.n();
    }

    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        if (wdxVar instanceof rex) {
            rex rexVar = (rex) wdxVar;
            JsonToken R = rexVar.R();
            if (R == JsonToken.NAME || R == JsonToken.END_ARRAY || R == JsonToken.END_OBJECT || R == JsonToken.END_DOCUMENT) {
                vg10.p("Unexpected ", R, " when reading a JsonElement.");
                return null;
            }
            pcx pcxVar = (pcx) rexVar.v0();
            rexVar.skipValue();
            return pcxVar;
        }
        JsonToken R2 = wdxVar.R();
        pcx b = b(wdxVar, R2);
        if (b == null) {
            return a(wdxVar, R2);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (wdxVar.hasNext()) {
                String nextName = b instanceof jdx ? wdxVar.nextName() : null;
                JsonToken R3 = wdxVar.R();
                pcx b2 = b(wdxVar, R3);
                boolean z = b2 != null;
                if (b2 == null) {
                    b2 = a(wdxVar, R3);
                }
                if (b instanceof wbx) {
                    ((wbx) b).a.add(b2 == null ? fdx.a : b2);
                } else {
                    ((jdx) b).a.put(nextName, b2 == null ? fdx.a : b2);
                }
                if (z) {
                    arrayDeque.addLast(b);
                    b = b2;
                }
            } else {
                if (b instanceof wbx) {
                    wdxVar.k();
                } else {
                    wdxVar.n();
                }
                if (arrayDeque.isEmpty()) {
                    return b;
                }
                b = (pcx) arrayDeque.removeLast();
            }
        }
    }

    @Override // defpackage.nl11
    public final /* bridge */ /* synthetic */ void write(afx afxVar, Object obj) {
        c((pcx) obj, afxVar);
    }
}
