package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes9.dex */
public final class r610 {
    public static final List a(leu leuVar, String str) {
        String a = leuVar.a(str);
        if (a == null) {
            return EmptyList.a;
        }
        List Y = evu0.Y(a, new char[]{HexString.CHAR_COMMA}, 0, 6);
        ArrayList arrayList = new ArrayList(tcc.n(Y, 10));
        Iterator it = Y.iterator();
        while (it.hasNext()) {
            arrayList.add(evu0.k0((String) it.next()).toString());
        }
        return arrayList;
    }

    public final KSerializer serializer() {
        return q610.a;
    }
}
