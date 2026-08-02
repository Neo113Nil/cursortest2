package ru.CryptoPro.AdES.evidence.ocsp;

import defpackage.bvj0;
import defpackage.bwj0;
import defpackage.er80;
import defpackage.he5;
import defpackage.lr60;
import defpackage.mr60;
import defpackage.nr60;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import ru.CryptoPro.AdES.AbstractFinder;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.AdES.tools.revocation.xades.ResponderIDNoIssuer;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class OCSPFinder extends AbstractFinder<he5> {
    public OCSPFinder(Collection<he5> collection) {
        super(collection);
    }

    public static boolean match(he5 he5Var, nr60 nr60Var, String str) throws AdESException {
        if (nr60Var.a == null) {
            throw new AdESException("Revocation reference is invalid, OCSP identifier is null.", IAdESException.ecFinderWrongOcspRef);
        }
        er80 er80Var = nr60Var.b;
        if (er80Var == null) {
            throw new AdESException("Revocation reference is invalid, OCSP response hash is null.", IAdESException.ecFinderWrongOcspRef);
        }
        try {
            byte[] encoded = he5Var.getEncoded();
            bwj0 bwj0Var = he5Var.a;
            if (!Arrays.equals(AdESUtility.calculateDigest(str, er80Var.m().a.a, encoded), er80Var.n())) {
                return false;
            }
            lr60 lr60Var = nr60Var.a;
            bvj0 bvj0Var = lr60Var.a;
            if (bvj0Var.getKeyHash() != null) {
                if (bwj0Var.c.getKeyHash() == null || bvj0Var.getKeyHash() == null || !Arrays.equals(bwj0Var.c.getKeyHash(), bvj0Var.getKeyHash())) {
                    throw new AdESException("OCSP identifier has inappropriate key hash.", IAdESException.ecFinderWrongOcspRef);
                }
            } else if (!(bvj0Var instanceof ResponderIDNoIssuer) && (bwj0Var.c.getName() == null || bvj0Var.getName() == null || !bwj0Var.c.getName().equals(bvj0Var.getName()))) {
                throw new AdESException("OCSP identifier has inappropriate issuer name.", IAdESException.ecFinderWrongOcspRef);
            }
            try {
                return bwj0Var.w.y().equals(lr60Var.b.y());
            } catch (Exception e) {
                throw new AdESException(e, IAdESException.ecFinderWrongOcspRef);
            }
        } catch (IOException e2) {
            throw new AdESException(e2, IAdESException.ecFinderWrongOcspRef);
        }
    }

    public List<he5> find(mr60 mr60Var) throws AdESException {
        JCPLogger.finer("Looking for OCSP by OCSP list identifier.");
        if (mr60Var == null) {
            throw new AdESException("OcspListID is null. OCSP response can not be found as revocation value.", IAdESException.ecFinderWrongOcspRef);
        }
        ArrayList arrayList = new ArrayList();
        for (T t : this.collection) {
            for (nr60 nr60Var : mr60Var.m()) {
                if (match(t, nr60Var, this.provider)) {
                    arrayList.add(t);
                }
            }
        }
        return arrayList;
    }
}
