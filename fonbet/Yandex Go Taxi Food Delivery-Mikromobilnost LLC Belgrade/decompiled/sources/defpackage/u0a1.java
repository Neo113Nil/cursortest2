package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.ContextThemeWrapper;
import androidx.core.app.s0;
import com.ybsdk.core.utils.text.d;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.array.DerValue;
import ru.yandex.taxi.logistics.sdk.ui.component.control.a;

/* loaded from: classes11.dex */
public abstract class u0a1 {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public static boolean c;
    public static long d;

    public static final void a(q5n q5nVar, f530 f530Var, sls slsVar, fid fidVar, int i) {
        sls slsVar2;
        bts btsVar;
        f530 f530Var2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(584026515);
        int i2 = (btsVar2.k(q5nVar) ? 4 : 2) | i | 48;
        if ((i & 384) == 0) {
            slsVar2 = slsVar;
            i2 |= btsVar2.e(slsVar2) ? 256 : 128;
        } else {
            slsVar2 = slsVar;
        }
        int i3 = 1;
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            gji0 gji0Var = qke.q;
            long j = ldc.l;
            boolean z = (i2 & 14) == 4;
            Object Q = btsVar2.Q();
            if (z || Q == did.a) {
                Q = new dzm(i3, q5nVar);
                btsVar2.o0(Q);
            }
            c530 c530Var = c530.a;
            btsVar = btsVar2;
            a.b(slsVar2, c530Var, gji0Var, j, 0L, null, null, null, false, null, null, new l27((tls) Q), wwg.S(-954422220, true, new ota(q5nVar), btsVar2), btsVar, ((i2 >> 6) & 14) | 3504, 384, 2032);
            f530Var2 = c530Var;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new etm((Object) q5nVar, f530Var2, (Object) slsVar, i, 4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ff, code lost:
    
        if (r9 > 15) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0103, code lost:
    
        if (r14 == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0106, code lost:
    
        defpackage.ny61.v("SNTP: Zero transmitTime");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long b() {
        byte b2;
        SocketTimeoutException socketTimeoutException;
        byte[] bArr;
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            Object obj = b;
            synchronized (obj) {
            }
            datagramSocket.setSoTimeout(1000);
            synchronized (obj) {
            }
            InetAddress[] allByName = InetAddress.getAllByName("time.android.com");
            int length = allByName.length;
            byte b3 = 0;
            SocketTimeoutException socketTimeoutException2 = null;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                byte[] bArr2 = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr2, 48, allByName[i], HProv.PP_PASSWD_TERM);
                bArr2[b3] = DerValue.tag_GeneralString;
                long currentTimeMillis = System.currentTimeMillis();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (currentTimeMillis == 0) {
                    Arrays.fill(bArr2, 40, 48, b3);
                    b2 = b3;
                    socketTimeoutException = socketTimeoutException2;
                    bArr = bArr2;
                } else {
                    long j = currentTimeMillis / 1000;
                    long j2 = currentTimeMillis - (j * 1000);
                    b2 = b3;
                    socketTimeoutException = socketTimeoutException2;
                    long j3 = j + 2208988800L;
                    bArr = bArr2;
                    bArr[40] = (byte) (j3 >> 24);
                    bArr[41] = (byte) (j3 >> 16);
                    bArr[42] = (byte) (j3 >> 8);
                    bArr[43] = (byte) j3;
                    long j4 = (j2 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j4 >> 24);
                    bArr[45] = (byte) (j4 >> 16);
                    bArr[46] = (byte) (j4 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                }
                datagramSocket.send(datagramPacket);
                byte[] bArr3 = bArr;
                try {
                    datagramSocket.receive(new DatagramPacket(bArr3, 48));
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j5 = (elapsedRealtime2 - elapsedRealtime) + currentTimeMillis;
                    byte b4 = bArr3[b2];
                    byte b5 = (byte) ((b4 >> 6) & 3);
                    byte b6 = (byte) (b4 & 7);
                    int i3 = bArr3[1] & 255;
                    long e = e(24, bArr3);
                    long e2 = e(32, bArr3);
                    long e3 = e(40, bArr3);
                    if (b5 != 3) {
                        if (b6 != 4 && b6 != 5) {
                            ny61.v(oyr.i(b6, "SNTP: Untrusted mode: "));
                        }
                        ny61.v(oyr.i(i3, "SNTP: Untrusted stratum: "));
                    } else {
                        ny61.v("SNTP: Unsynchronized server");
                    }
                    long j6 = (j5 + (((e3 - j5) + (e2 - e)) / 2)) - elapsedRealtime2;
                    datagramSocket.close();
                    return j6;
                } catch (SocketTimeoutException e4) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException2 = e4;
                    } else {
                        SocketTimeoutException socketTimeoutException3 = socketTimeoutException;
                        socketTimeoutException3.addSuppressed(e4);
                        socketTimeoutException2 = socketTimeoutException3;
                    }
                    int i4 = i2 + 1;
                    if (i2 >= 10) {
                        break;
                    }
                    i++;
                    i2 = i4;
                    b3 = b2;
                }
            }
            socketTimeoutException2.getClass();
            throw socketTimeoutException2;
        } finally {
        }
    }

    public static void c(ContextThemeWrapper contextThemeWrapper, List list) {
        s0 s0Var = new s0(contextThemeWrapper);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u1g0 u1g0Var = (u1g0) it.next();
            String str = u1g0Var.a;
            int i = u1g0Var.d;
            Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
            str.getClass();
            AudioAttributes audioAttributes = Notification.AUDIO_ATTRIBUTES_DEFAULT;
            CharSequence a2 = d.a(contextThemeWrapper, u1g0Var.b);
            String str2 = u1g0Var.c;
            NotificationChannel notificationChannel = new NotificationChannel(str, a2, i);
            notificationChannel.setDescription(str2);
            notificationChannel.setGroup(null);
            notificationChannel.setShowBadge(true);
            notificationChannel.setSound(uri, audioAttributes);
            notificationChannel.enableLights(false);
            notificationChannel.setLightColor(0);
            notificationChannel.setVibrationPattern(null);
            notificationChannel.enableVibration(false);
            s0Var.b(notificationChannel);
        }
    }

    public static long d(int i, byte[] bArr) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & HProv.PP_VERSION_TIMESTAMP) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & HProv.PP_VERSION_TIMESTAMP) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & HProv.PP_VERSION_TIMESTAMP) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & HProv.PP_VERSION_TIMESTAMP) + 128;
        }
        return (i2 << 24) + (i3 << 16) + (i4 << 8) + i5;
    }

    public static long e(int i, byte[] bArr) {
        long d2 = d(i, bArr);
        long d3 = d(i + 4, bArr);
        if (d2 == 0 && d3 == 0) {
            return 0L;
        }
        return ((d3 * 1000) / 4294967296L) + ((d2 - 2208988800L) * 1000);
    }

    public static Object f(inj injVar) {
        int i = injVar.c;
        if (i > 0) {
            Object[] objArr = injVar.a;
            Object obj = objArr[0];
            if (obj instanceof String) {
                if (i != 3) {
                    throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"remove\" for string requires 3 arguments but "));
                }
                Object obj2 = objArr[1];
                Object obj3 = objArr[2];
                if (!(obj2 instanceof Long) || !(obj3 instanceof Long)) {
                    throw jason.statham.interpreter.error.a.a("Function \"remove\" is not defined for " + rhb1.e(obj) + Extension.FIX_SPACE + rhb1.e(obj2) + Extension.FIX_SPACE + rhb1.e(obj3));
                }
                Number number = (Number) obj2;
                if (number.longValue() < 0) {
                    throw jason.statham.interpreter.error.a.a("Range start " + obj2 + " is less than zero");
                }
                Number number2 = (Number) obj3;
                String str = (String) obj;
                if (number2.longValue() > str.length()) {
                    throw jason.statham.interpreter.error.a.a("Range end " + obj3 + " is more than string length " + str.length());
                }
                if (number.longValue() <= number2.longValue()) {
                    return evu0.R((int) number.longValue(), (int) number2.longValue(), str).toString();
                }
                throw jason.statham.interpreter.error.a.a("Range start " + obj2 + " is more than end " + obj3);
            }
            if (ym11.g(obj)) {
                if (injVar.c != 2) {
                    throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"remove\" for list requires 2 arguments but "));
                }
                Object obj4 = injVar.a[1];
                if (!ym11.g(obj) || !(obj4 instanceof Long)) {
                    throw jason.statham.interpreter.error.a.a("Function \"remove\" is not defined for " + rhb1.e(obj) + Extension.FIX_SPACE + rhb1.e(obj4));
                }
                List list = (List) obj;
                if (list.size() > 0) {
                    Number number3 = (Number) obj4;
                    if (0 <= number3.longValue() && number3.longValue() < list.size()) {
                        return list.remove((int) number3.longValue());
                    }
                }
                throw oyr.y(obj4, "Function \"remove\" tried remove element out of range at index ");
            }
        }
        throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"remove\" requires 2-3 arguments but "));
    }
}
