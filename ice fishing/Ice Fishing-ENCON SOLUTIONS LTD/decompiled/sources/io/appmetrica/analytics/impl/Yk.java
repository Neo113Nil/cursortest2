package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Yk {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0524k2 f5445a;

    public Yk(InterfaceC0524k2 interfaceC0524k2) {
        this.f5445a = interfaceC0524k2;
    }

    public final ArrayList a(Iterable iterable) {
        String str;
        String a2;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            try {
                a2 = this.f5445a.a(str2);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (a2 == null || (str = StringUtils.toHexString(MessageDigest.getInstance("SHA-256").digest(a2.getBytes(z1.a.f8620a)))) == null) {
                PublicLogger.Companion.getAnonymousInstance().info("Input " + str2 + " is not a valid data", new Object[0]);
                str = null;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
