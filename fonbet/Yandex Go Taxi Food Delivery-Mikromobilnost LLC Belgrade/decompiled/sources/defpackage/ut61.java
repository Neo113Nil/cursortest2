package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.CAdES.CAdESParameters;
import ru.CryptoPro.CAdES.CAdESType;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public final class ut61 extends sx61 {
    public static final rvr I = new rvr(14);
    public final ArrayList H;

    public ut61(acs0 acs0Var) {
        super(acs0Var);
        this.H = new ArrayList();
    }

    @Override // defpackage.sx61, defpackage.rw61, defpackage.erd0, ru.CryptoPro.AdES.external.decode.AdESAttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESBESAttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESTAttributeDecoder
    public final void decode() {
        JCPLogger.subEnter();
        JCPLogger.fine("Decoding CAdES-A structures...");
        super.decode();
        ArrayList arrayList = new ArrayList();
        u2 u2Var = CAdESParameters.id_aa_ets_archiveTimestampV3;
        JCPLogger.subEnter();
        JCPLogger.fine("Extracting archive-timestamp(s)...");
        h(u2Var, arrayList);
        JCPLogger.subExit();
        ArrayList arrayList2 = this.H;
        arrayList2.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m8z0 m8z0Var = (m8z0) it.next();
            arrayList2.add(new xs61(m8z0Var, CAdESType.isTimeStampEnhanced(m8z0Var) ? 1 : 0));
        }
        Collections.sort(arrayList2, I);
        JCPLogger.subExit();
    }

    public final List j() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            arrayList.add(((xs61) it.next()).a);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
