package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessage;
import com.yandex.messaging.internal.net.socket.XivaInternalMessage;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import java.net.NoRouteToHostException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Objects;
import java.util.UUID;
import javax.net.ssl.SSLException;
import okio.ByteString;
import org.msgpack.core.MessageIntegerOverflowException;
import org.msgpack.core.buffer.MessageBuffer;

/* loaded from: classes15.dex */
public final class xd51 extends ek41 implements w1k0, x08 {
    public ydi0 A;
    public int B;
    public zj41 C;
    public final /* synthetic */ s421 D;
    public final je51 a;
    public final Object b = new Object();
    public final Object c = new Object();
    public final Handler w = new Handler();
    public boolean x;
    public y1k0 y;
    public c18 z;

    public xd51(s421 s421Var, je51 je51Var) {
        this.D = s421Var;
        this.a = je51Var;
    }

    @Override // defpackage.w1k0
    public final void a() {
        z83.g(null, this.w.getLooper(), Looper.myLooper());
        z83.f(this.C, null);
        this.B = 0;
        if (this.A == null && this.a.a()) {
            h();
        }
    }

    @Override // defpackage.ek41
    public final void b(ydi0 ydi0Var, int i, String str) {
        if (ydz.a.a()) {
            ydz.a();
        }
        this.w.post(new z50(this, ydi0Var, i, str));
    }

    @Override // defpackage.ek41
    public final void c(zj41 zj41Var, int i, String str) {
        if (ydz.a.a()) {
            ydz.a();
        }
        ((ydi0) zj41Var).c(i, str);
    }

    @Override // defpackage.x08
    public final void cancel() {
        Handler handler = this.w;
        z83.g(null, handler.getLooper(), Looper.myLooper());
        this.x = true;
        handler.removeCallbacksAndMessages(null);
        y1k0 y1k0Var = this.y;
        if (y1k0Var != null) {
            y1k0Var.close();
        }
        this.y = null;
        zj41 zj41Var = this.C;
        if (zj41Var != null) {
            ((ydi0) zj41Var).a();
        }
        this.C = null;
        c18 c18Var = this.z;
        if (c18Var != null) {
            c18Var.cancel();
        }
        this.z = null;
        ydi0 ydi0Var = this.A;
        if (ydi0Var != null) {
            ydi0Var.a();
        }
        this.A = null;
    }

    @Override // defpackage.ek41
    public final void d(ydi0 ydi0Var, Exception exc, kvj0 kvj0Var) {
        if ((exc instanceof SocketException) && jl40.l(exc.getMessage(), "Socket closed")) {
            return;
        }
        qa2 qa2Var = ydz.a;
        if (qa2Var.a()) {
            Objects.toString(kvj0Var);
            qa2Var.a();
        }
        s421 s421Var = this.D;
        if (kvj0Var != null) {
            ((c370) s421Var.c).b(2, kvj0Var.c, null);
        } else if (exc instanceof UnknownHostException) {
            ((c370) s421Var.c).b(4, "DNS_FAILED", null);
        } else if (exc instanceof SocketTimeoutException) {
            ((c370) s421Var.c).b(6, "TIMEOUT", null);
        } else if (exc instanceof NoRouteToHostException) {
            ((c370) s421Var.c).b(3, "NO_ROUTE", null);
        } else if (exc instanceof SSLException) {
            ((c370) s421Var.c).b(5, "SSL_ERROR", null);
        } else if (!(exc instanceof EOFException)) {
            ((c370) s421Var.c).b(3, "OTHER", null);
        }
        this.w.post(new bo31(7, this, ydi0Var));
    }

    @Override // defpackage.ek41
    public final void e(zj41 zj41Var, String str) {
        if (ydz.a.a()) {
            ydz.a();
        }
        XivaInternalMessage xivaInternalMessage = (XivaInternalMessage) ((Moshi) this.D.x).adapter(XivaInternalMessage.class).fromJson(str);
        String str2 = xivaInternalMessage != null ? xivaInternalMessage.operation : null;
        if (str2 != null) {
            int hashCode = str2.hashCode();
            Handler handler = this.w;
            if (hashCode == -1219769254) {
                if (str2.equals("subscribed")) {
                    handler.post(new bo31(this, zj41Var, xivaInternalMessage));
                }
            } else if (hashCode == 3441010 && str2.equals("ping")) {
                handler.post(new hpo0(27, this, zj41Var, xivaInternalMessage));
            }
        }
    }

    @Override // defpackage.ek41
    public final void f(ByteString byteString) {
        ie51 ie51Var;
        ie51 ie51Var2;
        qa2 qa2Var = ydz.a;
        if (qa2Var.a()) {
            byteString.a();
            ydz.a();
        }
        je51 je51Var = this.a;
        je51Var.getClass();
        if (byteString.h() == 0) {
            return;
        }
        byte[] v = byteString.v();
        int length = v.length - 1;
        bv10 bv10Var = cv10.c;
        bv10Var.getClass();
        MessageBuffer g = MessageBuffer.g(1, length, v);
        q43 q43Var = new q43();
        q43Var.c = g;
        if (g == null) {
            q43Var.b = true;
        } else {
            q43Var.b = false;
        }
        zw10 zw10Var = new zw10(q43Var, bv10Var);
        byte m = byteString.m(0);
        if (m == 1) {
            zw10Var.w();
            byte readByte = zw10Var.readByte();
            if (!zu10.a(readByte)) {
                switch (readByte) {
                    case -52:
                        if (zw10Var.readByte() < 0) {
                            throw new MessageIntegerOverflowException(BigInteger.valueOf(r15 & 255));
                        }
                        break;
                    case -51:
                        short readShort = zw10Var.readShort();
                        if (readShort < 0 || readShort > 127) {
                            throw new MessageIntegerOverflowException(BigInteger.valueOf(readShort & 65535));
                        }
                    case -50:
                        int readInt = zw10Var.readInt();
                        if (readInt < 0 || readInt > 127) {
                            throw zw10.e(readInt);
                        }
                    case -49:
                        long readLong = zw10Var.readLong();
                        if (readLong < 0 || readLong > 127) {
                            throw zw10.k(readLong);
                        }
                        break;
                    case -48:
                        zw10Var.readByte();
                        break;
                    case -47:
                        short readShort2 = zw10Var.readShort();
                        if (readShort2 < -128 || readShort2 > 127) {
                            throw new MessageIntegerOverflowException(BigInteger.valueOf(readShort2));
                        }
                    case -46:
                        int readInt2 = zw10Var.readInt();
                        if (readInt2 < -128 || readInt2 > 127) {
                            throw new MessageIntegerOverflowException(BigInteger.valueOf(readInt2));
                        }
                    case -45:
                        long readLong2 = zw10Var.readLong();
                        if (readLong2 < -128 || readLong2 > 127) {
                            throw new MessageIntegerOverflowException(BigInteger.valueOf(readLong2));
                        }
                        break;
                    default:
                        throw zw10.v(readByte, "Integer");
                }
            }
            int B = zw10Var.B();
            String D = zw10Var.D();
            int i = ((int) (zw10Var.B + zw10Var.A)) + 1;
            synchronized (je51Var.d) {
                ie51Var2 = (ie51) je51Var.d.b(B);
            }
            if (ie51Var2 == null) {
                if (qa2Var.a()) {
                    ydz.a();
                    return;
                }
                return;
            }
            yp6 yp6Var = new yp6();
            yp6Var.write(v, i, v.length - i);
            try {
                je51Var.c.post(new hpo0(28, je51Var, ie51Var2, ie51Var2.a(yp6Var)));
                return;
            } catch (Exception e) {
                je51Var.j.d.b(7, "INVALID", null);
                je51Var.j.c.reportError("xiva DATA frame parse failed for path ".concat(D), e);
                return;
            }
        }
        if (m != 2) {
            if (m != 3) {
                if (qa2Var.a()) {
                    byteString.m(0);
                    ydz.a();
                    return;
                }
                return;
            }
            zw10Var.w();
            zw10Var.D();
            String D2 = zw10Var.D();
            String D3 = zw10Var.D();
            String D4 = zw10Var.D();
            int i2 = ((int) (zw10Var.B + zw10Var.A)) + 1;
            yp6 yp6Var2 = new yp6();
            yp6Var2.write(v, i2, v.length - i2);
            try {
                ServerMessage h = je51Var.a.h(D2, D3, yp6Var2);
                if (h != null) {
                    je51Var.c.post(new bo31(je51Var, D2, D3, h));
                    return;
                } else {
                    je51Var.j.d.b(7, "OTHER", null);
                    return;
                }
            } catch (IOException e2) {
                je51Var.j.d.b(7, "OTHER", null);
                if (ydz.a.a()) {
                    StringBuilder v2 = b64.v("Push processing failed service = ", D2, " event = ", D3, " transitId = ");
                    v2.append(D4);
                    ydz.c("Xiva", v2.toString(), e2);
                    return;
                }
                return;
            }
        }
        zw10Var.w();
        int B2 = zw10Var.B();
        byte readByte2 = zw10Var.readByte();
        if (!zu10.a(readByte2)) {
            switch (readByte2) {
                case -52:
                    zw10Var.readByte();
                    break;
                case -51:
                    if (zw10Var.readShort() < 0) {
                        throw new MessageIntegerOverflowException(BigInteger.valueOf(r1 & 65535));
                    }
                    break;
                case -50:
                    int readInt3 = zw10Var.readInt();
                    if (readInt3 < 0 || readInt3 > 32767) {
                        throw zw10.e(readInt3);
                    }
                case -49:
                    long readLong3 = zw10Var.readLong();
                    if (readLong3 < 0 || readLong3 > 32767) {
                        throw zw10.k(readLong3);
                    }
                    break;
                case -48:
                    zw10Var.readByte();
                    break;
                case -47:
                    zw10Var.readShort();
                    break;
                case -46:
                    int readInt4 = zw10Var.readInt();
                    if (readInt4 < -32768 || readInt4 > 32767) {
                        throw new MessageIntegerOverflowException(BigInteger.valueOf(readInt4));
                    }
                case -45:
                    long readLong4 = zw10Var.readLong();
                    if (readLong4 < -32768 || readLong4 > 32767) {
                        throw new MessageIntegerOverflowException(BigInteger.valueOf(readLong4));
                    }
                    break;
                default:
                    throw zw10.v(readByte2, "Integer");
            }
        }
        je51Var.j.d.b(2, "PROXYSTATUS", null);
        synchronized (je51Var.d) {
            ie51Var = (ie51) je51Var.d.b(B2);
        }
        if (ie51Var == null) {
            if (qa2Var.a()) {
                ydz.a();
            }
        } else {
            if (qa2Var.a()) {
                ydz.a();
            }
            je51Var.c.post(new bo31(9, je51Var, ie51Var));
        }
    }

    @Override // defpackage.ek41
    public final void g(kvj0 kvj0Var) {
        if (ydz.a.a()) {
            kvj0Var.y.a("Y-Context");
            ydz.a();
        }
    }

    public final void h() {
        String str;
        String string;
        c18 c18Var;
        z83.f(this.A, null);
        z83.f(this.C, null);
        if (this.z != null) {
            return;
        }
        e331 e331Var = new e331(23, this, this.D);
        je51 je51Var = this.a;
        z83.g(null, je51Var.c.getLooper(), Looper.myLooper());
        c820 c820Var = je51Var.a;
        zjy0 zjy0Var = new zjy0(22, je51Var, je51Var.j, e331Var);
        fn6 fn6Var = c820Var.G;
        z83.g(null, c820Var.w.getLooper(), Looper.myLooper());
        z83.c(null, c820Var.F);
        bn3 bn3Var = c820Var.D;
        if (bn3Var == null) {
            c18Var = wfz.z;
        } else {
            wl3 wl3Var = c820Var.C;
            if (wl3Var == null || (str = Long.valueOf(wl3Var.b).toString()) == null) {
                str = ((ml21) fn6Var.d).a;
            }
            if (!bn3Var.l() || c820Var.E) {
                de51 de51Var = (de51) fn6Var.h;
                k200 k200Var = new k200(26, zjy0Var);
                z83.g(null, de51Var.d, Looper.myLooper());
                SharedPreferences sharedPreferences = de51Var.a;
                String string2 = sharedPreferences.getString("xiva_secret_user", null);
                ne51 ne51Var = (string2 == null || (string = sharedPreferences.getString("xiva_secret_sign", null)) == null) ? null : new ne51(string2, string, sharedPreferences.getLong("xiva_secret_ts", 0L));
                if (ne51Var != null && ne51Var.a.equals(str)) {
                    long j = ne51Var.c;
                    de51Var.b.getClass();
                    if (j > System.currentTimeMillis() / 1000) {
                        k200Var.invoke(ne51Var);
                    }
                }
                de51Var.e.b(k200Var);
                if (de51Var.f == null) {
                    mj31 mj31Var = de51Var.c;
                    e331 e331Var2 = new e331(24, de51Var, str);
                    yo3 yo3Var = (yo3) mj31Var.b;
                    String uuid = UUID.randomUUID().toString();
                    exj0 exj0Var = new exj0(mj31Var, str, e331Var2);
                    new cfu();
                    de51Var.f = yo3Var.a(uuid, exj0Var);
                }
                c18Var = new c18(0, new hh31(19, de51Var, k200Var));
            } else {
                zjy0Var.invoke(new me51(str, bn3Var.k()));
            }
            c18Var = null;
        }
        this.z = c18Var;
        z83.h(null, (c18Var == null && this.A == null) ? false : true);
    }
}
