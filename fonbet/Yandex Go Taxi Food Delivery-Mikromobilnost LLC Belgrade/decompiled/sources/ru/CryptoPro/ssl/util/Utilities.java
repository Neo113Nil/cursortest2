package ru.CryptoPro.ssl.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SNIServerName;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.ssl.SSLLogger;

/* loaded from: classes4.dex */
public final class Utilities {
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List addToSNIServerNameList(List list, String str) {
        SNIHostName sNIHostName;
        if (str != null && str.indexOf(46) > 0 && !str.endsWith(Extension.DOT_CHAR) && !IPAddressUtil.isIPv4LiteralAddress(str) && !IPAddressUtil.isIPv6LiteralAddress(str)) {
            try {
                sNIHostName = new SNIHostName(str);
            } catch (IllegalArgumentException unused) {
                SSLLogger.fine(Thread.currentThread().getName() + ", \"" + str + "\" is not a legal HostName for  server name indication");
            }
            if (sNIHostName != null) {
                return list;
            }
            int size = list.size();
            ArrayList arrayList = size != 0 ? new ArrayList(list) : new ArrayList(1);
            int i = 0;
            while (true) {
                if (i >= size) {
                    arrayList.add(sNIHostName);
                    break;
                }
                SNIServerName sNIServerName = (SNIServerName) arrayList.get(i);
                if (sNIServerName.getType() == 0) {
                    arrayList.set(i, sNIHostName);
                    SSLLogger.fine(Thread.currentThread().getName() + ", the previous server name in SNI (" + sNIServerName + ") was replaced with (" + sNIHostName + Extension.C_BRAKE);
                    break;
                }
                i++;
            }
            return Collections.unmodifiableList(arrayList);
        }
        sNIHostName = null;
        if (sNIHostName != null) {
        }
    }
}
