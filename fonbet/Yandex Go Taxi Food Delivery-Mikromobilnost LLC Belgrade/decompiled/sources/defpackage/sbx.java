package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;
import kotlinx.serialization.json.internal.WriteMode;

/* loaded from: classes9.dex */
public abstract class sbx implements itu0 {
    public static final rbx d = new rbx(new ccx(0), itq0.a);
    public final ccx a;
    public final kf5 b;
    public final iyi c = new iyi();

    public sbx(ccx ccxVar, kf5 kf5Var) {
        this.a = ccxVar;
        this.b = kf5Var;
    }

    public final Object a(myi myiVar, b bVar) {
        Decoder sdxVar;
        String str = null;
        if (bVar instanceof c) {
            sdxVar = new kex(this, (c) bVar, str, 12);
        } else if (bVar instanceof a) {
            sdxVar = new mex(this, (a) bVar);
        } else {
            if (!(bVar instanceof adx) && !bVar.equals(JsonNull.INSTANCE)) {
                w511.b();
                return null;
            }
            sdxVar = new sdx(this, (d) bVar, null);
        }
        return sdxVar.B(myiVar);
    }

    public final Object b(myi myiVar, String str) {
        ltu0 d2 = ffx.d(this, str);
        Object B = new kotlinx.serialization.json.internal.c(this, WriteMode.OBJ, d2, myiVar.getDescriptor(), null).B(myiVar);
        d2.o();
        return B;
    }

    public final String c(Object obj, KSerializer kSerializer) {
        iex iexVar = new iex();
        try {
            s8o.k(this, iexVar, kSerializer, obj);
            return iexVar.toString();
        } finally {
            ui9.c.a(iexVar.a);
        }
    }

    public final b d(String str) {
        return (b) b(rcx.a, str);
    }
}
