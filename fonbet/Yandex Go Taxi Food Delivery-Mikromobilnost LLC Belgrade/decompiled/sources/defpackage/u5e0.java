package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public abstract class u5e0 extends y8 {
    public final dtq0 b;
    public final String a = "type";
    public final SerialDescriptor c = b.Companion.serializer().getDescriptor();

    public u5e0(dtq0 dtq0Var) {
        this.b = dtq0Var;
    }

    @Override // defpackage.y8
    public Object a(sbx sbxVar, b bVar) {
        String a;
        if (!(bVar instanceof c)) {
            return c(sbxVar, bVar, new IllegalArgumentException("JsonObject is expected"));
        }
        c cVar = (c) bVar;
        String str = this.a;
        b bVar2 = (b) cVar.get(str);
        if (bVar2 != null && (a = qcx.n(bVar2).a()) != null) {
            KSerializer select = this.b.select(a);
            if (select == null) {
                return b(sbxVar, a, cVar);
            }
            try {
                return sbxVar.a(select, bVar);
            } catch (Throwable th) {
                return this.c(sbxVar, bVar, th);
            }
        }
        return c(sbxVar, bVar, new SerializationException("Missing required type field \"" + str + "\" (presented fields: " + cVar.a.keySet() + Extension.C_BRAKE));
    }

    public abstract Object b(sbx sbxVar, String str, c cVar);

    public abstract Object c(sbx sbxVar, b bVar, Throwable th);

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.c;
    }
}
