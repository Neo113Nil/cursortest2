package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes9.dex */
public final class qtl extends y8 {
    public static final qtl a = new qtl();
    public static final KSerializer b;
    public static final SerialDescriptor c;

    static {
        KSerializer serializer = ptl.Companion.serializer();
        b = serializer;
        c = serializer.getDescriptor();
    }

    @Override // defpackage.y8
    public final Object a(sbx sbxVar, b bVar) {
        c cVar = (c) bVar;
        sbxVar.getClass();
        ptl ptlVar = (ptl) sbxVar.a(ptl.Companion.serializer(), bVar);
        n5o w = jx81.w(sbxVar, ptlVar.a.c, (c) cVar.get("card"));
        if (w == null) {
            ny61.g("Required value was null.");
            return null;
        }
        jtl jtlVar = ptlVar.a;
        Map map = jtlVar.a;
        String str = jtlVar.b;
        ntl ntlVar = ptlVar.b;
        return new etl(w, map, str, ntlVar != null ? new dtl(ntlVar.a, ntlVar.b) : null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return c;
    }
}
