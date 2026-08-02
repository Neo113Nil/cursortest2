package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import ru.yandex.quasar.glagol.impl.ConversationImpl;

/* loaded from: classes5.dex */
public final class l67 extends m67 {
    public static final Logger l = Logger.getLogger(l67.class.getName());
    public static final boolean m = true;
    public static final char[] n = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final DatagramPacket h;
    public final long i;
    public final k67 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l67(DatagramPacket datagramPacket) {
        super(0, 0, datagramPacket.getPort() == i67.a);
        Logger logger = l;
        this.h = datagramPacket;
        InetAddress address = datagramPacket.getAddress();
        k67 k67Var = new k67(datagramPacket.getData(), datagramPacket.getLength());
        this.j = k67Var;
        this.i = System.currentTimeMillis();
        this.k = 1460;
        try {
            this.a = k67Var.o();
            int o = k67Var.o();
            this.c = o;
            if (((o & 30720) >> 11) > 0) {
                throw new IOException("Received a message with a non standard operation code. Currently unsupported in the specification.");
            }
            int o2 = k67Var.o();
            int o3 = k67Var.o();
            int o4 = k67Var.o();
            int o5 = k67Var.o();
            if (logger.isLoggable(Level.FINER)) {
                logger.finer("DNSIncoming() questions:" + o2 + " answers:" + o3 + " authorities:" + o4 + " additionals:" + o5);
            }
            if (((o3 + o4 + o5) * 11) + (o2 * 5) > datagramPacket.getLength()) {
                throw new IOException("questions:" + o2 + " answers:" + o3 + " authorities:" + o4 + " additionals:" + o5);
            }
            if (o2 > 0) {
                for (int i = 0; i < o2; i++) {
                    this.d.add(j());
                }
            }
            if (o3 > 0) {
                for (int i2 = 0; i2 < o3; i2++) {
                    w67 i3 = i(address);
                    if (i3 != null) {
                        this.e.add(i3);
                    }
                }
            }
            if (o4 > 0) {
                for (int i4 = 0; i4 < o4; i4++) {
                    w67 i5 = i(address);
                    if (i5 != null) {
                        this.f.add(i5);
                    }
                }
            }
            if (o5 > 0) {
                for (int i6 = 0; i6 < o5; i6++) {
                    w67 i7 = i(address);
                    if (i7 != null) {
                        this.g.add(i7);
                    }
                }
            }
            if (this.j.available() > 0) {
                throw new IOException("Received a message with the wrong length.");
            }
        } catch (Exception e) {
            logger.log(Level.WARNING, "DNSIncoming() dump " + h() + "\n exception ", (Throwable) e);
            IOException iOException = new IOException("DNSIncoming corrupted message");
            iOException.initCause(e);
            throw iOException;
        }
    }

    public static String e(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            char[] cArr = n;
            sb.append(cArr[i / 16]);
            sb.append(cArr[i % 16]);
        }
        return sb.toString();
    }

    public final void f(l67 l67Var) {
        if (!d() || (this.c & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 || !l67Var.d()) {
            e7o.e();
            return;
        }
        this.d.addAll(l67Var.d);
        this.e.addAll(l67Var.e);
        this.f.addAll(l67Var.f);
        this.g.addAll(l67Var.g);
    }

    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final l67 clone() {
        l67 l67Var = new l67(this.c, b(), this.b, this.h, this.i);
        l67Var.k = this.k;
        l67Var.d.addAll(this.d);
        l67Var.e.addAll(this.e);
        l67Var.f.addAll(this.f);
        l67Var.g.addAll(this.g);
        return l67Var;
    }

    public final String h() {
        StringBuilder sb = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer(200);
        stringBuffer.append(toString());
        stringBuffer.append(StringUtil.LF);
        for (q67 q67Var : this.d) {
            stringBuffer.append("\tquestion:      ");
            stringBuffer.append(q67Var);
            stringBuffer.append(StringUtil.LF);
        }
        for (w67 w67Var : this.e) {
            stringBuffer.append("\tanswer:        ");
            stringBuffer.append(w67Var);
            stringBuffer.append(StringUtil.LF);
        }
        for (w67 w67Var2 : this.f) {
            stringBuffer.append("\tauthoritative: ");
            stringBuffer.append(w67Var2);
            stringBuffer.append(StringUtil.LF);
        }
        for (w67 w67Var3 : this.g) {
            stringBuffer.append("\tadditional:    ");
            stringBuffer.append(w67Var3);
            stringBuffer.append(StringUtil.LF);
        }
        sb.append(stringBuffer.toString());
        DatagramPacket datagramPacket = this.h;
        int length = datagramPacket.getLength();
        byte[] bArr = new byte[length];
        System.arraycopy(datagramPacket.getData(), 0, bArr, 0, length);
        StringBuilder sb2 = new StringBuilder(ConversationImpl.INCORRECT_TOKEN);
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int min = Math.min(32, length - i);
            if (i < 16) {
                sb2.append(' ');
            }
            if (i < 256) {
                sb2.append(' ');
            }
            if (i < 4096) {
                sb2.append(' ');
            }
            sb2.append(Integer.toHexString(i));
            sb2.append(':');
            int i2 = 0;
            while (i2 < min) {
                if (i2 % 8 == 0) {
                    sb2.append(' ');
                }
                int i3 = i + i2;
                sb2.append(Integer.toHexString((bArr[i3] & 240) >> 4));
                sb2.append(Integer.toHexString(bArr[i3] & 15));
                i2++;
            }
            if (i2 < 32) {
                while (i2 < 32) {
                    if (i2 % 8 == 0) {
                        sb2.append(' ');
                    }
                    sb2.append("  ");
                    i2++;
                }
            }
            sb2.append("    ");
            for (int i4 = 0; i4 < min; i4++) {
                if (i4 % 8 == 0) {
                    sb2.append(' ');
                }
                int i5 = bArr[i + i4] & 255;
                sb2.append((i5 <= 32 || i5 >= 127) ? '.' : (char) i5);
            }
            sb2.append(StringUtil.LF);
            i += 32;
            if (i >= 2048) {
                sb2.append("....\n");
                break;
            }
        }
        sb.append(sb2.toString());
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01bb, code lost:
    
        r22 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01bf, code lost:
    
        r3 = r8[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01c1, code lost:
    
        r10 = r8[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c4, code lost:
    
        r12 = new byte[6];
        r12[0] = r8[2];
        r12[r7] = r8[3];
        r12[2] = r8[4];
        r12[3] = r8[5];
        r12[4] = r8[6];
        r12[5] = r8[7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01e6, code lost:
    
        if (r8.length <= 8) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01e8, code lost:
    
        r2 = new byte[6];
        r2[0] = r8[8];
        r2[r7] = r8[9];
        r2[2] = r8[10];
        r2[3] = r8[11];
        r2[4] = r8[12];
        r2[5] = r8[13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0208, code lost:
    
        r22 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x021c, code lost:
    
        if (r8.length != 18) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x021e, code lost:
    
        r7 = new byte[4];
        r7[0] = r8[14];
        r7[r22] = r8[r19];
        r7[2] = r8[16];
        r7[3] = r8[17];
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x023a, code lost:
    
        if (r8.length != 22) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x023c, code lost:
    
        r4 = new byte[8];
        r4[0] = r8[14];
        r4[r22] = r8[r19];
        r4[2] = r8[16];
        r4[3] = r8[17];
        r4[4] = r8[18];
        r4[5] = r8[19];
        r4[6] = r8[20];
        r4[7] = r8[21];
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0264, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0288, code lost:
    
        if (r6.isLoggable(java.util.logging.Level.FINE) != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x028a, code lost:
    
        r3 = defpackage.dfi.l("Unhandled Owner OPT version: ", r3, r10, " sequence: ", " MAC address: ");
        r3.append(e(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x029b, code lost:
    
        if (r2 != r12) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x029d, code lost:
    
        r2 = " wakeup MAC address: ".concat(e(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02aa, code lost:
    
        r3.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02ad, code lost:
    
        if (r7 != null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02af, code lost:
    
        r2 = " password: ".concat(e(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02bc, code lost:
    
        r3.append(r2);
        r6.fine(r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02ba, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02a8, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0275, code lost:
    
        r6.warning("Malformed OPT answer. Option code: Owner data: ".concat(e(r8)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0233, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x020e, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0211, code lost:
    
        r2 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x020b, code lost:
    
        r22 = r7;
        r2 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0266, code lost:
    
        r22 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0268, code lost:
    
        r2 = null;
        r7 = null;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x026c, code lost:
    
        r22 = r7;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0270, code lost:
    
        r22 = r7;
        r3 = 0;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02c8, code lost:
    
        r22 = r7;
        r2 = java.util.logging.Level.FINE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02d0, code lost:
    
        if (r6.isLoggable(r2) == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02d2, code lost:
    
        r3 = new java.lang.StringBuilder("There was an OPT answer. Option code: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02da, code lost:
    
        if (r12 == 1) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02dd, code lost:
    
        if (r12 == 2) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02e0, code lost:
    
        if (r12 == 3) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02e3, code lost:
    
        if (r12 == 4) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02e6, code lost:
    
        if (r12 == 5) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02e8, code lost:
    
        r4 = "null";
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02f9, code lost:
    
        r3.append(r4);
        r3.append(" data: ");
        r3.append(e(r8));
        r6.log(r2, r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02eb, code lost:
    
        r4 = "Owner";
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02ee, code lost:
    
        r4 = "NSID";
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02f1, code lost:
    
        r4 = "UL";
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02f4, code lost:
    
        r4 = "LLQ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02f7, code lost:
    
        r4 = "Unknown";
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x030e, code lost:
    
        r22 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0313, code lost:
    
        if (r2 < 65001) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0318, code lost:
    
        if (r2 > 65534) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x031a, code lost:
    
        r3 = java.util.logging.Level.FINE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0320, code lost:
    
        if (r6.isLoggable(r3) == false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0322, code lost:
    
        r2 = defpackage.k5r.q(r2, "There was an OPT answer using an experimental/local option code: ", " data: ");
        r2.append(e(r8));
        r6.log(r3, r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0337, code lost:
    
        r3 = java.util.logging.Level.WARNING;
        r2 = defpackage.k5r.q(r2, "There was an OPT answer. Not currently handled. Option code: ", " data: ");
        r2.append(e(r8));
        r6.log(r3, r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0353, code lost:
    
        r6.log(java.util.logging.Level.WARNING, "There was a problem reading the OPT record. Ignoring.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0196, code lost:
    
        if (r1.available() < 2) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0198, code lost:
    
        r3 = r1.o();
        r8 = new byte[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a2, code lost:
    
        if (r1.available() < r3) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a4, code lost:
    
        r8 = new byte[r3];
        r1.read(r8, 0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a9, code lost:
    
        r3 = defpackage.ouj.D(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01af, code lost:
    
        if (r3 == 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b1, code lost:
    
        if (r3 == r7) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b3, code lost:
    
        if (r3 == 2) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b6, code lost:
    
        if (r3 == 3) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b9, code lost:
    
        if (r3 == 4) goto L213;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x034d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0437  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w67 i(InetAddress inetAddress) {
        w67 w67Var;
        w67 w67Var2;
        boolean z;
        int i;
        String str;
        char c;
        int i2;
        int i3;
        int i4;
        k67 k67Var = this.j;
        String a = k67Var.a();
        y67 a2 = y67.a(k67Var.o());
        y67 y67Var = y67.TYPE_IGNORE;
        Logger logger = l;
        if (a2 == y67Var) {
            Level level = Level.SEVERE;
            StringBuilder u = ouj.u("Could not find record type. domain: ", a, StringUtil.LF);
            u.append(h());
            logger.log(level, u.toString());
        }
        int o = k67Var.o();
        y67 y67Var2 = y67.TYPE_OPT;
        x67 a3 = a2 == y67Var2 ? x67.CLASS_UNKNOWN : x67.a(o);
        x67 x67Var = x67.CLASS_UNKNOWN;
        if (a3 == x67Var && a2 != y67Var2) {
            logger.log(Level.SEVERE, "Could not find record class. domain: " + a + " type: " + a2 + StringUtil.LF + h());
        }
        int i5 = 1;
        boolean z2 = (a3 == x67Var || (32768 & o) == 0) ? false : true;
        int o2 = (k67Var.o() << 16) | k67Var.o();
        int o3 = k67Var.o();
        int ordinal = a2.ordinal();
        if (ordinal != 1) {
            if (ordinal == 5) {
                z = z2;
            } else if (ordinal == 16) {
                byte[] bArr = new byte[o3];
                k67Var.read(bArr, 0, o3);
                w67Var = new v67(a, a3, z2, o2, bArr);
            } else if (ordinal == 28) {
                byte[] bArr2 = new byte[o3];
                k67Var.read(bArr2, 0, o3);
                w67Var = new s67(a, y67.TYPE_AAAA, a3, z2, o2, bArr2, 1);
            } else {
                if (ordinal != 33) {
                    if (ordinal == 41) {
                        char c2 = 15;
                        int i6 = (this.c & 15) | ((o2 >> 28) & KotlinVersion.MAX_COMPONENT_VALUE);
                        int[] E = ouj.E(12);
                        int length = E.length;
                        int i7 = 0;
                        while (true) {
                            if (i7 < length) {
                                i = E[i7];
                                switch (i) {
                                    case 1:
                                        i4 = 65535;
                                        break;
                                    case 2:
                                        i4 = 0;
                                        break;
                                    case 3:
                                        i4 = 1;
                                        break;
                                    case 4:
                                        i4 = 2;
                                        break;
                                    case 5:
                                        i4 = 3;
                                        break;
                                    case 6:
                                        i4 = 4;
                                        break;
                                    case 7:
                                        i4 = 5;
                                        break;
                                    case 8:
                                        i4 = 6;
                                        break;
                                    case 9:
                                        i4 = 7;
                                        break;
                                    case 10:
                                        i4 = 8;
                                        break;
                                    case 11:
                                        i4 = 9;
                                        break;
                                    case 12:
                                        i4 = 10;
                                        break;
                                    default:
                                        throw null;
                                }
                                if (i4 != i6) {
                                    i7++;
                                }
                            } else {
                                i = 1;
                            }
                        }
                        int i8 = (16711680 & o2) >> 16;
                        if (i8 == 0) {
                            this.k = o;
                            while (true) {
                                if (k67Var.available() > 0) {
                                    if (k67Var.available() >= 2) {
                                        int o4 = k67Var.o();
                                        int[] E2 = ouj.E(5);
                                        int length2 = E2.length;
                                        int i9 = 0;
                                        while (true) {
                                            if (i9 < length2) {
                                                i2 = E2[i9];
                                                int i10 = 1;
                                                c = c2;
                                                if (i2 != 1) {
                                                    int i11 = 2;
                                                    if (i2 != 2) {
                                                        i10 = 3;
                                                        if (i2 != 3) {
                                                            i11 = 4;
                                                            if (i2 != 4) {
                                                                if (i2 != 5) {
                                                                    throw null;
                                                                }
                                                            }
                                                        }
                                                        i10 = i11;
                                                    }
                                                } else {
                                                    i10 = 65535;
                                                }
                                                if (i10 != o4) {
                                                    i9++;
                                                    c2 = c;
                                                }
                                            } else {
                                                c = c2;
                                                i2 = i5;
                                            }
                                        }
                                    } else {
                                        logger.log(Level.WARNING, "There was a problem reading the OPT record. Ignoring.");
                                    }
                                }
                                c2 = c;
                                i5 = i3;
                            }
                        } else {
                            Level level2 = Level.WARNING;
                            StringBuilder q = k5r.q(i8, "There was an OPT answer. Wrong version number: ", " result code: ");
                            switch (i) {
                                case 1:
                                    str = "Unknown";
                                    break;
                                case 2:
                                    str = "NoError";
                                    break;
                                case 3:
                                    str = "FormErr";
                                    break;
                                case 4:
                                    str = "ServFail";
                                    break;
                                case 5:
                                    str = "NXDomain";
                                    break;
                                case 6:
                                    str = "NotImp";
                                    break;
                                case 7:
                                    str = "Refused";
                                    break;
                                case 8:
                                    str = "YXDomain";
                                    break;
                                case 9:
                                    str = "YXRRSet";
                                    break;
                                case 10:
                                    str = "NXRRSet";
                                    break;
                                case 11:
                                    str = "NotAuth";
                                    break;
                                case 12:
                                    str = "NotZone";
                                    break;
                                default:
                                    str = "null";
                                    break;
                            }
                            q.append(str);
                            logger.log(level2, q.toString());
                        }
                    } else if (ordinal == 12) {
                        z = z2;
                    } else if (ordinal != 13) {
                        if (logger.isLoggable(Level.FINER)) {
                            logger.finer("DNSIncoming() unknown type:" + a2);
                        }
                        k67Var.skip(o3);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(k67Var.b(o3));
                        int indexOf = sb.indexOf(StringUtil.SPACE);
                        String trim = (indexOf > 0 ? sb.substring(0, indexOf) : sb.toString()).trim();
                        String trim2 = (indexOf > 0 ? sb.substring(indexOf + 1) : "").trim();
                        r67 r67Var = new r67(a, y67.TYPE_HINFO, a3, z2, o2);
                        r67Var.n = trim;
                        r67Var.m = trim2;
                        w67Var = r67Var;
                    }
                    w67Var2 = null;
                    if (w67Var2 != null) {
                        w67Var2.j = inetAddress;
                    }
                    return w67Var2;
                }
                w67Var = new u67(a, a3, z2, o2, k67Var.o(), k67Var.o(), k67Var.o(), m ? k67Var.a() : k67Var.b(k67Var.g()));
            }
            x67 x67Var2 = a3;
            String a4 = k67Var.a();
            if (a4.length() <= 0) {
                logger.log(Level.WARNING, "PTR record of class: " + x67Var2 + ", there was a problem reading the service name of the answer for domain:" + a);
                w67Var2 = null;
                if (w67Var2 != null) {
                }
                return w67Var2;
            }
            w67Var = new t67(a, x67Var2, z, o2, a4);
        } else {
            byte[] bArr3 = new byte[o3];
            k67Var.read(bArr3, 0, o3);
            w67Var = new s67(a, y67.TYPE_A, a3, z2, o2, bArr3, 0);
        }
        w67Var2 = w67Var;
        if (w67Var2 != null) {
        }
        return w67Var2;
    }

    public final q67 j() {
        k67 k67Var = this.j;
        String a = k67Var.a();
        y67 a2 = y67.a(k67Var.o());
        if (a2 == y67.TYPE_IGNORE) {
            l.log(Level.SEVERE, "Could not find record type: ".concat(h()));
        }
        int o = k67Var.o();
        x67 a3 = x67.a(o);
        return q67.s(a, a2, a3, (a3 == x67.CLASS_UNKNOWN || (o & SQLiteDatabase.OPEN_NOMUTEX) == 0) ? false : true);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(d() ? "dns[query," : "dns[response,");
        DatagramPacket datagramPacket = this.h;
        if (datagramPacket.getAddress() != null) {
            sb.append(datagramPacket.getAddress().getHostAddress());
        }
        sb.append(':');
        sb.append(datagramPacket.getPort());
        sb.append(", length=");
        sb.append(datagramPacket.getLength());
        sb.append(", id=0x");
        sb.append(Integer.toHexString(b()));
        if (this.c != 0) {
            sb.append(", flags=0x");
            sb.append(Integer.toHexString(this.c));
            if ((this.c & SQLiteDatabase.OPEN_NOMUTEX) != 0) {
                sb.append(":r");
            }
            if ((this.c & 1024) != 0) {
                sb.append(":aa");
            }
            if ((this.c & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0) {
                sb.append(":tc");
            }
        }
        List<q67> list = this.d;
        if (list.size() > 0) {
            sb.append(", questions=");
            sb.append(list.size());
        }
        List<w67> list2 = this.e;
        if (list2.size() > 0) {
            sb.append(", answers=");
            sb.append(list2.size());
        }
        List<w67> list3 = this.f;
        if (list3.size() > 0) {
            sb.append(", authorities=");
            sb.append(list3.size());
        }
        List<w67> list4 = this.g;
        if (list4.size() > 0) {
            sb.append(", additionals=");
            sb.append(list4.size());
        }
        if (list.size() > 0) {
            sb.append("\nquestions:");
            for (q67 q67Var : list) {
                sb.append("\n\t");
                sb.append(q67Var);
            }
        }
        if (list2.size() > 0) {
            sb.append("\nanswers:");
            for (w67 w67Var : list2) {
                sb.append("\n\t");
                sb.append(w67Var);
            }
        }
        if (list3.size() > 0) {
            sb.append("\nauthorities:");
            for (w67 w67Var2 : list3) {
                sb.append("\n\t");
                sb.append(w67Var2);
            }
        }
        if (list4.size() > 0) {
            sb.append("\nadditionals:");
            for (w67 w67Var3 : list4) {
                sb.append("\n\t");
                sb.append(w67Var3);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public l67(int i, int i2, boolean z, DatagramPacket datagramPacket, long j) {
        super(i, i2, z);
        this.h = datagramPacket;
        this.j = new k67(datagramPacket.getData(), datagramPacket.getLength());
        this.i = j;
    }
}
