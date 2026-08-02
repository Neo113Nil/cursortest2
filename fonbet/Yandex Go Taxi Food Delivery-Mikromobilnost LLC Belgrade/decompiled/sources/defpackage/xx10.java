package defpackage;

import io.flutter.plugins.sharedpreferences.StringListLookupResultType;
import java.nio.ByteBuffer;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public class xx10 extends vzt0 {
    @Override // defpackage.vzt0
    public final Object f(byte b, ByteBuffer byteBuffer) {
        if (b == -127) {
            Long l = (Long) e(byteBuffer);
            if (l != null) {
                int longValue = (int) l.longValue();
                StringListLookupResultType.Companion.getClass();
                for (StringListLookupResultType stringListLookupResultType : StringListLookupResultType.values()) {
                    if (stringListLookupResultType.getRaw() == longValue) {
                        return stringListLookupResultType;
                    }
                }
            }
        } else if (b == -126) {
            Object e = e(byteBuffer);
            List list = e instanceof List ? (List) e : null;
            if (list != null) {
                return new spr0((String) list.get(0), ((Boolean) list.get(1)).booleanValue());
            }
        } else {
            if (b != -125) {
                return super.f(b, byteBuffer);
            }
            Object e2 = e(byteBuffer);
            List list2 = e2 instanceof List ? (List) e2 : null;
            if (list2 != null) {
                return new qtu0((String) list2.get(0), (StringListLookupResultType) list2.get(1));
            }
        }
        return null;
    }

    @Override // defpackage.vzt0
    public final void k(ckn cknVar, Object obj) {
        if (obj instanceof StringListLookupResultType) {
            cknVar.write(HProv.PP_SECURITY_LEVEL);
            k(cknVar, Long.valueOf(((StringListLookupResultType) obj).getRaw()));
        } else if (obj instanceof spr0) {
            cknVar.write(130);
            k(cknVar, ((spr0) obj).a());
        } else {
            if (!(obj instanceof qtu0)) {
                super.k(cknVar, obj);
                return;
            }
            cknVar.write(HProv.PP_FAST_CODE);
            qtu0 qtu0Var = (qtu0) obj;
            k(cknVar, scc.g(qtu0Var.a, qtu0Var.b));
        }
    }
}
