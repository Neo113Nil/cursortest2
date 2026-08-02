package defpackage;

import java.util.Hashtable;
import java.util.Map;
import org.bouncycastle.cms.CMSAttributeTableGenerationException;
import ru.CryptoPro.AdES.AdESParameters;
import ru.CryptoPro.CAdES.CAdESParameters;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public final class xq61 extends ar61 {
    @Override // defpackage.nx61, defpackage.hv61, defpackage.sw61, defpackage.i87
    public final xc3 b(Map map) {
        JCPLogger.fine("Creating archive timestamp attribute table...");
        Hashtable b = xc3.b(super.b(map).a);
        u2 u2Var = CAdESParameters.id_aa_ets_ATSHashIndex;
        if (!map.containsKey(u2Var) && !map.containsKey(CAdESParameters.id_aa_ets_ATSHashIndexV3)) {
            throw new CMSAttributeTableGenerationException("AtsHashIndex or AtsHashIndexV3 must exist!");
        }
        vc3 vc3Var = (vc3) map.get(u2Var);
        if (vc3Var != null) {
            b.put(u2Var, vc3Var);
        } else {
            u2 u2Var2 = CAdESParameters.id_aa_ets_ATSHashIndexV3;
            b.put(u2Var2, (vc3) map.get(u2Var2));
        }
        return new xc3(b);
    }

    @Override // defpackage.ar61, defpackage.nx61, defpackage.hv61, defpackage.sw61
    public final Integer c() {
        return AdESParameters.TSA_ARCHIVE_TIME_STAMP;
    }
}
