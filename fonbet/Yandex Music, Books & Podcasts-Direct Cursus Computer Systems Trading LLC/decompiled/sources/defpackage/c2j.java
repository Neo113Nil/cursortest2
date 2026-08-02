package defpackage;

import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class c2j {
    public static final Logger c = Logger.getLogger(c2j.class.getName());
    public final Method a;
    public final Method b;

    public c2j() {
        Method method;
        Method method2 = null;
        try {
            method = NetworkInterface.class.getMethod("isUp", null);
        } catch (Exception unused) {
            method = null;
        }
        this.a = method;
        try {
            method2 = NetworkInterface.class.getMethod("supportsMulticast", null);
        } catch (Exception unused2) {
        }
        this.b = method2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        if (((java.lang.Boolean) r7.invoke(r3, null)).booleanValue() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005e, code lost:
    
        if (((java.lang.Boolean) r7.invoke(r3, null)).booleanValue() == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InetAddress[] a() {
        Logger logger = c;
        HashSet hashSet = new HashSet();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement2 = inetAddresses.nextElement();
                    if (logger.isLoggable(Level.FINEST)) {
                        logger.finest("Found NetworkInterface/InetAddress: " + nextElement + " -- " + nextElement2);
                    }
                    boolean z = false;
                    try {
                        Method method = this.a;
                        if (method != null) {
                        }
                        Method method2 = this.b;
                        if (method2 != null) {
                        }
                        z = true;
                    } catch (Exception unused) {
                    }
                    if (z) {
                        hashSet.add(nextElement2);
                    }
                }
            }
        } catch (SocketException e) {
            logger.warning("Error while fetching network interfaces addresses: " + e);
        }
        return (InetAddress[]) hashSet.toArray(new InetAddress[hashSet.size()]);
    }
}
