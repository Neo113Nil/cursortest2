package R1;

import J1.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class k extends n {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f1761c;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0077, code lost:
    
        if (r1.intValue() >= 9) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0071  */
    static {
        int i2;
        int i3;
        Integer valueOf;
        int i4;
        boolean z2 = true;
        String property = System.getProperty("java.specification.version");
        if (property != null) {
            d.b(10);
            int length = property.length();
            if (length != 0) {
                char charAt = property.charAt(0);
                int i5 = -2147483647;
                if (kotlin.jvm.internal.i.f(charAt, 48) >= 0) {
                    i2 = 0;
                } else if (length != 1) {
                    if (charAt == '+') {
                        i2 = 1;
                        i3 = 0;
                        int i6 = 0;
                        int i7 = -59652323;
                        while (i2 < length) {
                            int digit = Character.digit((int) property.charAt(i2), 10);
                            if (digit >= 0 && ((i6 >= i7 || (i7 == -59652323 && i6 >= (i7 = i5 / 10))) && (i4 = i6 * 10) >= i5 + digit)) {
                                i6 = i4 - digit;
                                i2++;
                            }
                        }
                        valueOf = i3 == 0 ? Integer.valueOf(i6) : Integer.valueOf(-i6);
                        if (valueOf == null) {
                            try {
                                SSLSocket.class.getMethod("getApplicationProtocol", null);
                            } catch (NoSuchMethodException unused) {
                                z2 = false;
                                f1761c = z2;
                            }
                        }
                        f1761c = z2;
                    }
                    if (charAt == '-') {
                        i5 = Integer.MIN_VALUE;
                        i2 = 1;
                    }
                }
                i3 = i2;
                int i62 = 0;
                int i72 = -59652323;
                while (i2 < length) {
                }
                if (i3 == 0) {
                }
                if (valueOf == null) {
                }
                f1761c = z2;
            }
        }
        valueOf = null;
        if (valueOf == null) {
        }
        f1761c = z2;
    }

    @Override // R1.n
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((t) obj) != t.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(i1.k.E(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((t) it.next()).f970a);
        }
        Object[] array = arrayList2.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        sSLParameters.setApplicationProtocols((String[]) array);
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // R1.n
    public final String f(SSLSocket sSLSocket) {
        String applicationProtocol;
        try {
            applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
