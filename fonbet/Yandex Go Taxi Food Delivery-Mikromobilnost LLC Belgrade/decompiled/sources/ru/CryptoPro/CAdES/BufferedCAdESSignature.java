package ru.CryptoPro.CAdES;

import defpackage.b97;
import defpackage.bcs0;
import defpackage.ige;
import defpackage.jw61;
import defpackage.md6;
import defpackage.ov61;
import defpackage.u2;
import defpackage.u87;
import java.io.ByteArrayInputStream;
import org.bouncycastle.cms.CMSException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.tools.CACertsUtility;
import ru.CryptoPro.CAdES.exception.CAdESException;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class BufferedCAdESSignature extends AbstractCAdESSignature {
    public BufferedCAdESSignature(byte[] bArr, byte[] bArr2, Integer num) throws CAdESException {
        u87 u87Var;
        JCPLogger.subEnter();
        try {
            if (bArr2 != null) {
                md6 md6Var = new md6(bArr2);
                ige h = b97.h(bArr);
                u87Var = new u87();
                u87Var.c = md6Var;
                u87Var.b = h;
                u87Var.a = u87Var.a();
            } else {
                u87Var = new u87(bArr);
            }
            u2 u2Var = jw61.a;
            a(new ov61(u87Var), null, bArr2 != null, bArr2 != null ? new ByteArrayInputStream(bArr2) : null, num, false, false);
            JCPLogger.subExit();
        } catch (CMSException e) {
            throw new CAdESException(e, IAdESException.ecInternal);
        }
    }

    public static boolean reloadCACerts() {
        return CACertsUtility.reload();
    }

    public static u87 replaceSigners(u87 u87Var, bcs0 bcs0Var) throws CAdESException {
        JCPLogger.fine("%%% Replacing signer store %%%");
        return u87.d(u87Var, bcs0Var);
    }

    public BufferedCAdESSignature(boolean z) throws CAdESException {
        a(null, null, z, null, CAdESParameters.CAdES_Unknown, false, false);
    }

    public BufferedCAdESSignature() throws CAdESException {
        this(false);
    }
}
