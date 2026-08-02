package io.appmetrica.analytics.impl;

import defpackage.uza;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import ru.CryptoPro.JCP.JCP;

/* renamed from: io.appmetrica.analytics.impl.wo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0834wo {
    public final Y2 a;

    public C0834wo(Y2 y2) {
        this.a = y2;
    }

    public final ArrayList a(Iterable iterable) {
        String str;
        String a;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            try {
                a = this.a.a(str2);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (a == null || (str = StringUtils.toHexString(MessageDigest.getInstance(JCP.DIGEST_SHA_256).digest(a.getBytes(uza.a)))) == null) {
                PublicLogger.INSTANCE.getAnonymousInstance().info("Input " + str2 + " is not a valid data", new Object[0]);
                str = null;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
