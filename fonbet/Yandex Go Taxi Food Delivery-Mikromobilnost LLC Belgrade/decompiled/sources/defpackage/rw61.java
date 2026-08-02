package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.external.decode.AdESTAttributeDecoder;
import ru.CryptoPro.CAdES.exception.CAdESException;
import ru.CryptoPro.CAdES.tools.CAdESUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class rw61 extends gv61 implements AdESTAttributeDecoder {
    public final ArrayList y;
    public static final rvr z = new rvr(16);
    public static final rvr A = new rvr(17);

    public rw61(acs0 acs0Var) {
        super(acs0Var);
        this.y = new ArrayList();
    }

    @Override // defpackage.erd0, ru.CryptoPro.AdES.external.decode.AdESAttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESBESAttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESTAttributeDecoder
    public void decode() {
        JCPLogger.subEnter();
        JCPLogger.fine("Decoding CAdES-T structure...");
        super.decode();
        ArrayList arrayList = this.y;
        arrayList.clear();
        h(b490.J3, arrayList);
        Collections.sort(arrayList, z);
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.AdES.external.decode.AdESTAttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESTAttributeParametersDecoder
    public final List getSignatureTimestampTokens() {
        return Collections.unmodifiableList(this.y);
    }

    public final void h(u2 u2Var, ArrayList arrayList) {
        JCPLogger.subEnter();
        JCPLogger.fine("Extracting timestamps...");
        Iterator<vc3> it = CAdESUtility.getAttributes(((acs0) this.b).getUnsignedAttributes(), u2Var).iterator();
        while (it.hasNext()) {
            vc3 next = it.next();
            if (next != null) {
                try {
                    arrayList.add(CAdESUtility.convertAttributeValueToTimestampToken(next));
                } catch (Exception e) {
                    throw new CAdESException(e, IAdESException.ecTimestampInvalid);
                }
            }
        }
        JCPLogger.subExit();
    }
}
