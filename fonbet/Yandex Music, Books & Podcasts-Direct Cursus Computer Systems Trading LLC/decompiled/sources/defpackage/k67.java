package defpackage;

import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* loaded from: classes5.dex */
public final class k67 extends ByteArrayInputStream {
    public static final Logger b = Logger.getLogger(k67.class.getName());
    public final HashMap a;

    public k67(byte[] bArr, int i) {
        super(bArr, 0, i);
        this.a = new HashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0103, code lost:
    
        r2 = r0.keySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x010f, code lost:
    
        if (r2.hasNext() == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0111, code lost:
    
        r3 = (java.lang.Integer) r2.next();
        r4.put(r3, ((java.lang.StringBuilder) r0.get(r3)).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0129, code lost:
    
        return r1.toString();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a() {
        int g;
        int i;
        int i2;
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            HashMap hashMap2 = this.a;
            if (z || (g = g()) == 0) {
                break;
            }
            int i3 = g & 192;
            int[] E = ouj.E(4);
            int length = E.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    i = 1;
                    break;
                }
                i = E[i4];
                if (i == 1) {
                    i2 = 128;
                } else if (i == 2) {
                    i2 = 0;
                } else if (i == 3) {
                    i2 = 192;
                } else {
                    if (i != 4) {
                        throw null;
                    }
                    i2 = 64;
                }
                if (i2 == i3) {
                    break;
                }
                i4++;
            }
            int D = ouj.D(i);
            if (D != 1) {
                Logger logger = b;
                if (D == 2) {
                    int g2 = ((g & 63) << 8) | g();
                    String str = (String) hashMap2.get(Integer.valueOf(g2));
                    if (str == null) {
                        logger.severe("bad domain name: possible circular name detected. Bad offset: 0x" + Integer.toHexString(g2) + " at 0x" + Integer.toHexString(((ByteArrayInputStream) this).pos - 2));
                        str = "";
                    }
                    sb.append(str);
                    Iterator it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        ((StringBuilder) it.next()).append(str);
                    }
                    z = true;
                } else if (D != 3) {
                    logger.severe("unsupported dns label type: '" + Integer.toHexString(i3) + "'");
                } else {
                    logger.severe("Extended label are not currently supported.");
                }
            } else {
                int i5 = ((ByteArrayInputStream) this).pos - 1;
                String concat = b(g).concat(".");
                sb.append(concat);
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    ((StringBuilder) it2.next()).append(concat);
                }
                hashMap.put(Integer.valueOf(i5), new StringBuilder(concat));
            }
        }
    }

    public final String b(int i) {
        int i2;
        int g;
        StringBuilder sb = new StringBuilder(i);
        int i3 = 0;
        while (i3 < i) {
            int g2 = g();
            switch (g2 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    i2 = (g2 & 63) << 4;
                    g = g() & 15;
                    break;
                case 12:
                case 13:
                    i2 = (g2 & 31) << 6;
                    g = g() & 63;
                    break;
                case 14:
                    g2 = ((g2 & 15) << 12) | ((g() & 63) << 6) | (g() & 63);
                    i3 += 2;
                    continue;
            }
            g2 = i2 | g;
            i3++;
            sb.append((char) g2);
            i3++;
        }
        return sb.toString();
    }

    public final int g() {
        return read() & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public final int o() {
        return (g() << 8) | g();
    }
}
