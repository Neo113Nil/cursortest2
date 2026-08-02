package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import org.webrtc.MediaStreamTrack;
import ru.yandex.video.m3.player.impl.utils.MemoryDependsLoadControl;
import yads.bj1;
import yads.gg3;
import yads.gn0;
import yads.lj1;
import yads.ob2;
import yads.pb2;
import yads.sj1;
import yads.t31;
import yads.uj1;
import yads.wk2;

/* loaded from: classes7.dex */
public final class yl81 extends ja71 {
    public static final int[] J5 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean K5;
    public static boolean L5;
    public final int B1;
    public boolean B2;
    public long B3;
    public final boolean C1;
    public long C2;
    public long C3;
    public kb H1;
    public long H2;
    public int H3;
    public ty71 H4;
    public ai61 I5;
    public boolean M4;
    public boolean N1;
    public long N2;
    public int N3;
    public int N4;
    public boolean T1;
    public int T2;
    public int T3;
    public Surface V1;
    public int V2;
    public int V3;
    public pb2 X1;
    public int X2;
    public uj1 X4;
    public final Context p1;
    public boolean p2;
    public final gd71 v1;
    public int v2;
    public long v3;
    public float v4;
    public final a441 x1;
    public boolean x2;
    public final long y1;
    public boolean y2;

    public yl81(Context context, ul81 ul81Var, quz quzVar, boolean z, Handler handler, gn0 gn0Var) {
        super(2, ul81Var, quzVar, z, 30.0f);
        this.y1 = 5000L;
        this.B1 = 50;
        Context applicationContext = context.getApplicationContext();
        this.p1 = applicationContext;
        this.v1 = new gd71(applicationContext);
        this.x1 = new a441(18, handler, gn0Var);
        mf81.f.getClass();
        this.C1 = new String(Base64.decode("TlZJRElB", 0), uza.a).equals(rf71.c);
        this.H2 = -9223372036854775807L;
        this.N3 = -1;
        this.T3 = -1;
        this.v4 = -1.0f;
        this.v2 = 1;
        this.N4 = 0;
        this.H4 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x007c, code lost:
    
        if (r3.equals("video/av01") == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int W(qd81 qd81Var, aq61 aq61Var) {
        int i;
        int intValue;
        int i2 = qd81Var.J;
        int i3 = qd81Var.K;
        if (i2 == -1 || i3 == -1) {
            return -1;
        }
        String str = qd81Var.E;
        char c = 1;
        if ("video/dolby-vision".equals(str)) {
            Pair i4 = o581.i(qd81Var);
            str = (i4 == null || !((intValue = ((Integer) i4.first).intValue()) == 512 || intValue == 1 || intValue == 2)) ? "video/hevc" : "video/avc";
        }
        str.getClass();
        int i5 = 4;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662735862:
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 3:
            case 5:
                i = i3 * i2;
                i5 = 2;
                break;
            case 2:
            case 6:
                i = i3 * i2;
                break;
            case 4:
                mf81.f.getClass();
                byte[] decode = Base64.decode("QlJBVklBIDRLIDIwMTU=", 0);
                Charset charset = uza.a;
                String str2 = new String(decode, charset);
                String str3 = rf71.d;
                if (!str2.equals(str3) && (!new String(Base64.decode("QW1hem9u", 0), charset).equals(rf71.c) || (!new String(Base64.decode("S0ZTT1dJ", 0), charset).equals(str3) && (!new String(Base64.decode("QUZUUw==", 0), charset).equals(str3) || !aq61Var.f)))) {
                    i = ((i3 + 15) / 16) * ((i2 + 15) / 16) * 256;
                    i5 = 2;
                    break;
                }
                break;
        }
        return -1;
    }

    public static t31 X(quz quzVar, qd81 qd81Var, boolean z, boolean z2) {
        String str = qd81Var.E;
        if (str == null) {
            p481 p481Var = t31.b;
            return wk2.x;
        }
        quzVar.getClass();
        List e = o581.e(str, z, z2);
        String c = o581.c(qd81Var);
        if (c == null) {
            return t31.m(e);
        }
        List e2 = o581.e(c, z, z2);
        p481 p481Var2 = t31.b;
        a181 a181Var = new a181();
        a181Var.e(e);
        a181Var.e(e2);
        return a181Var.c();
    }

    public static int Y(qd81 qd81Var, aq61 aq61Var) {
        int i = qd81Var.F;
        List list = qd81Var.G;
        if (i == -1) {
            return W(qd81Var, aq61Var);
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((byte[]) list.get(i3)).length;
        }
        return qd81Var.F + i2;
    }

    public static boolean a0(String str) {
        mf81.f.getClass();
        if (str.startsWith(new String(Base64.decode("T01YLmdvb2dsZQ==", 0), uza.a))) {
            return false;
        }
        synchronized (yl81.class) {
            try {
                if (!K5) {
                    L5 = d0();
                    K5 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return L5;
    }

    public static boolean d0() {
        int i = rf71.a;
        if (i <= 28) {
            mf81.f.getClass();
            byte[] decode = Base64.decode("YXF1YW1hbg==", 0);
            Charset charset = uza.a;
            String str = new String(decode, charset);
            String str2 = rf71.b;
            if (str.equals(str2) || new String(Base64.decode("ZGFuZ2Fs", 0), charset).equals(str2) || new String(Base64.decode("ZGFuZ2FsVUhE", 0), charset).equals(str2) || new String(Base64.decode("ZGFuZ2FsRkhE", 0), charset).equals(str2) || new String(Base64.decode("bWFnbm9saWE=", 0), charset).equals(str2) || new String(Base64.decode("bWFjaHVjYQ==", 0), charset).equals(str2) || new String(Base64.decode("b25jZQ==", 0), charset).equals(str2) || new String(Base64.decode("b25lZGF5", 0), charset).equals(str2)) {
                return true;
            }
        }
        if (i <= 27) {
            mf81.f.getClass();
            if (new String(Base64.decode("SFdFTUw=", 0), uza.a).equals(rf71.b)) {
                return true;
            }
        }
        if (i <= 26) {
            mf81.f.getClass();
            byte[] decode2 = Base64.decode("MTYwMQ==", 0);
            Charset charset2 = uza.a;
            String str3 = new String(decode2, charset2);
            String str4 = rf71.b;
            if (str3.equals(str4) || new String(Base64.decode("MTcxMw==", 0), charset2).equals(str4) || new String(Base64.decode("MTcxNA==", 0), charset2).equals(str4) || new String(Base64.decode("NjAxTFY=", 0), charset2).equals(str4) || new String(Base64.decode("NjAyTFY=", 0), charset2).equals(str4) || new String(Base64.decode("QTEwLTcwRg==", 0), charset2).equals(str4) || new String(Base64.decode("QTEwLTcwTA==", 0), charset2).equals(str4) || new String(Base64.decode("QTE2MDE=", 0), charset2).equals(str4) || new String(Base64.decode("QTIwMTZhNDA=", 0), charset2).equals(str4) || new String(Base64.decode("QTcwMDAtYQ==", 0), charset2).equals(str4) || new String(Base64.decode("QTcwMDBwbHVz", 0), charset2).equals(str4) || new String(Base64.decode("QTcwMTBhNDg=", 0), charset2).equals(str4) || new String(Base64.decode("QTcwMjBhNDg=", 0), charset2).equals(str4) || new String(Base64.decode("QXF1YVBvd2VyTQ==", 0), charset2).equals(str4) || new String(Base64.decode("QVNVU19YMDBBRF8y", 0), charset2).equals(str4) || new String(Base64.decode("QXVyYV9Ob3RlXzI=", 0), charset2).equals(str4) || new String(Base64.decode("YjU=", 0), charset2).equals(str4) || new String(Base64.decode("QkxBQ0stMVg=", 0), charset2).equals(str4) || new String(Base64.decode("QlJBVklBX0FUVjI=", 0), charset2).equals(str4) || new String(Base64.decode("QlJBVklBX0FUVjNfNEs=", 0), charset2).equals(str4) || new String(Base64.decode("QzE=", 0), charset2).equals(str4) || new String(Base64.decode("Q29taW9TMQ==", 0), charset2).equals(str4) || new String(Base64.decode("Q1A4Njc2X0kwMg==", 0), charset2).equals(str4) || new String(Base64.decode("Q1BIMTYwOQ==", 0), charset2).equals(str4) || new String(Base64.decode("Q1BIMTcxNQ==", 0), charset2).equals(str4) || new String(Base64.decode("Q1BZODNfSTAw", 0), charset2).equals(str4) || new String(Base64.decode("Y3Yx", 0), charset2).equals(str4) || new String(Base64.decode("Y3Yz", 0), charset2).equals(str4) || new String(Base64.decode("ZGVi", 0), charset2).equals(str4) || new String(Base64.decode("RE0tMDFL", 0), charset2).equals(str4) || new String(Base64.decode("RTU2NDM=", 0), charset2).equals(str4) || new String(Base64.decode("RUxVR0FfQTNfUHJv", 0), charset2).equals(str4) || new String(Base64.decode("RUxVR0FfTm90ZQ==", 0), charset2).equals(str4) || new String(Base64.decode("RUxVR0FfUHJpbQ==", 0), charset2).equals(str4) || new String(Base64.decode("RUxVR0FfUmF5X1g=", 0), charset2).equals(str4) || new String(Base64.decode("RXZlclN0YXJfUw==", 0), charset2).equals(str4) || new String(Base64.decode("RjAxSA==", 0), charset2).equals(str4) || new String(Base64.decode("RjAxSg==", 0), charset2).equals(str4) || new String(Base64.decode("RjAySA==", 0), charset2).equals(str4) || new String(Base64.decode("RjAzSA==", 0), charset2).equals(str4) || new String(Base64.decode("RjA0SA==", 0), charset2).equals(str4) || new String(Base64.decode("RjA0Sg==", 0), charset2).equals(str4) || new String(Base64.decode("RjMxMTE=", 0), charset2).equals(str4) || new String(Base64.decode("RjMxMTM=", 0), charset2).equals(str4) || new String(Base64.decode("RjMxMTY=", 0), charset2).equals(str4) || new String(Base64.decode("RjMyMTE=", 0), charset2).equals(str4) || new String(Base64.decode("RjMyMTM=", 0), charset2).equals(str4) || new String(Base64.decode("RjMyMTU=", 0), charset2).equals(str4) || new String(Base64.decode("RjMzMTE=", 0), charset2).equals(str4) || new String(Base64.decode("Zmxv", 0), charset2).equals(str4) || new String(Base64.decode("ZnVndQ==", 0), charset2).equals(str4) || new String(Base64.decode("R2lPTkVFX0NCTDc1MTM=", 0), charset2).equals(str4) || new String(Base64.decode("R2lPTkVFX0dCTDczMTk=", 0), charset2).equals(str4) || new String(Base64.decode("R0lPTkVFX0dCTDczNjA=", 0), charset2).equals(str4) || new String(Base64.decode("R0lPTkVFX1NXVzE2MDk=", 0), charset2).equals(str4) || new String(Base64.decode("R0lPTkVFX1NXVzE2Mjc=", 0), charset2).equals(str4) || new String(Base64.decode("R0lPTkVFX1NXVzE2MzE=", 0), charset2).equals(str4) || new String(Base64.decode("R0lPTkVFX1dCTDU3MDg=", 0), charset2).equals(str4) || new String(Base64.decode("R0lPTkVFX1dCTDczNjU=", 0), charset2).equals(str4) || new String(Base64.decode("R0lPTkVFX1dCTDc1MTk=", 0), charset2).equals(str4) || new String(Base64.decode("Z3JpZmZpbg==", 0), charset2).equals(str4) || new String(Base64.decode("aHRjX2U1Nm1sX2R0dWw=", 0), charset2).equals(str4) || new String(Base64.decode("aHdBTEUtSA==", 0), charset2).equals(str4) || new String(Base64.decode("SFdCTE4tSA==", 0), charset2).equals(str4) || new String(Base64.decode("SFdDQU0tSA==", 0), charset2).equals(str4) || new String(Base64.decode("SFdWTlMtSA==", 0), charset2).equals(str4) || new String(Base64.decode("SFdXQVMtSA==", 0), charset2).equals(str4) || new String(Base64.decode("aTkwMzE=", 0), charset2).equals(str4) || new String(Base64.decode("aWJhbGw4NzM1Xzk4MDY=", 0), charset2).equals(str4) || new String(Base64.decode("SW5maW5peC1YNTcy", 0), charset2).equals(str4) || new String(Base64.decode("aXJpczYw", 0), charset2).equals(str4) || new String(Base64.decode("aXRlbF9TNDE=", 0), charset2).equals(str4) || new String(Base64.decode("ajJ4bHRlaW5z", 0), charset2).equals(str4) || new String(Base64.decode("Skda", 0), charset2).equals(str4) || new String(Base64.decode("SzUwYTQw", 0), charset2).equals(str4) || new String(Base64.decode("a2F0ZQ==", 0), charset2).equals(str4) || new String(Base64.decode("bDU0NjA=", 0), charset2).equals(str4) || new String(Base64.decode("bGVfeDY=", 0), charset2).equals(str4) || new String(Base64.decode("TFMtNTAxNw==", 0), charset2).equals(str4) || new String(Base64.decode("TTA0", 0), charset2).equals(str4) || new String(Base64.decode("TTVj", 0), charset2).equals(str4) || new String(Base64.decode("bWFubmluZw==", 0), charset2).equals(str4) || new String(Base64.decode("bWFyaW5vX2Y=", 0), charset2).equals(str4) || new String(Base64.decode("TUVJWlVfTTU=", 0), charset2).equals(str4) || new String(Base64.decode("bWg=", 0), charset2).equals(str4) || new String(Base64.decode("bWlkbw==", 0), charset2).equals(str4) || new String(Base64.decode("TVg2", 0), charset2).equals(str4) || new String(Base64.decode("bmFtYXRo", 0), charset2).equals(str4) || new String(Base64.decode("bmlja2xhdXNfZg==", 0), charset2).equals(str4) || new String(Base64.decode("Tlg1NDFK", 0), charset2).equals(str4) || new String(Base64.decode("Tlg1NzNK", 0), charset2).equals(str4) || new String(Base64.decode("T25lUGx1czVU", 0), charset2).equals(str4) || new String(Base64.decode("cDIxMg==", 0), charset2).equals(str4) || new String(Base64.decode("UDY4MQ==", 0), charset2).equals(str4) || new String(Base64.decode("UDg1", 0), charset2).equals(str4) || new String(Base64.decode("cGFjaWZpY3JpbQ==", 0), charset2).equals(str4) || new String(Base64.decode("cGFuZWxsX2Q=", 0), charset2).equals(str4) || new String(Base64.decode("cGFuZWxsX2Rs", 0), charset2).equals(str4) || new String(Base64.decode("cGFuZWxsX2Rz", 0), charset2).equals(str4) || new String(Base64.decode("cGFuZWxsX2R0", 0), charset2).equals(str4) || new String(Base64.decode("UEIyLTY3ME0=", 0), charset2).equals(str4) || new String(Base64.decode("UEdONTI4", 0), charset2).equals(str4) || new String(Base64.decode("UEdONjEw", 0), charset2).equals(str4) || new String(Base64.decode("UEdONjEx", 0), charset2).equals(str4) || new String(Base64.decode("UGhhbnRvbTY=", 0), charset2).equals(str4) || new String(Base64.decode("UGl4aTQtN18zRw==", 0), charset2).equals(str4) || new String(Base64.decode("UGl4aTUtMTBfNEc=", 0), charset2).equals(str4) || new String(Base64.decode("UExF", 0), charset2).equals(str4) || new String(Base64.decode("UFJPN1M=", 0), charset2).equals(str4) || new String(Base64.decode("UTM1MA==", 0), charset2).equals(str4) || new String(Base64.decode("UTQyNjA=", 0), charset2).equals(str4) || new String(Base64.decode("UTQyNw==", 0), charset2).equals(str4) || new String(Base64.decode("UTQzMTA=", 0), charset2).equals(str4) || new String(Base64.decode("UTU=", 0), charset2).equals(str4) || new String(Base64.decode("UU0xNlhFX1U=", 0), charset2).equals(str4) || new String(Base64.decode("UVgx", 0), charset2).equals(str4) || new String(Base64.decode("UkFJSklO", 0), charset2).equals(str4) || new String(Base64.decode("c2FudG9uaQ==", 0), charset2).equals(str4) || new String(Base64.decode("U2xhdGVfUHJv", 0), charset2).equals(str4) || new String(Base64.decode("U1ZQLURUVjE1", 0), charset2).equals(str4) || new String(Base64.decode("czkwNXgwMTg=", 0), charset2).equals(str4) || new String(Base64.decode("dGFpZG9fcm93", 0), charset2).equals(str4) || new String(Base64.decode("VEIzLTczMEY=", 0), charset2).equals(str4) || new String(Base64.decode("VEIzLTczMFg=", 0), charset2).equals(str4) || new String(Base64.decode("VEIzLTg1MEY=", 0), charset2).equals(str4) || new String(Base64.decode("VEIzLTg1ME0=", 0), charset2).equals(str4) || new String(Base64.decode("dGNsX2V1", 0), charset2).equals(str4) || new String(Base64.decode("VjE=", 0), charset2).equals(str4) || new String(Base64.decode("VjIzR0I=", 0), charset2).equals(str4) || new String(Base64.decode("VjU=", 0), charset2).equals(str4) || new String(Base64.decode("dmVybmVlX001", 0), charset2).equals(str4) || new String(Base64.decode("d2F0c29u", 0), charset2).equals(str4) || new String(Base64.decode("d2h5cmVk", 0), charset2).equals(str4) || new String(Base64.decode("d29vZHNfZg==", 0), charset2).equals(str4) || new String(Base64.decode("d29vZHNfZm4=", 0), charset2).equals(str4) || new String(Base64.decode("WDNfSEs=", 0), charset2).equals(str4) || new String(Base64.decode("WEUyWA==", 0), charset2).equals(str4) || new String(Base64.decode("WFQxNjYz", 0), charset2).equals(str4) || new String(Base64.decode("WjEyX1BSTw==", 0), charset2).equals(str4) || new String(Base64.decode("Wjgw", 0), charset2).equals(str4)) {
                return true;
            }
            String str5 = new String(Base64.decode("QUZUQQ==", 0), charset2);
            String str6 = rf71.d;
            if (str5.equals(str6) || new String(Base64.decode("QUZUTg==", 0), charset2).equals(str6) || new String(Base64.decode("SlNOLUwyMQ==", 0), charset2).equals(str6)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x0074, code lost:
    
        if ((r13 == 0 ? false : r8.g[(int) ((r13 - 1) % 15)]) != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0317  */
    @Override // defpackage.ja71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A(long j, long j2, ss81 ss81Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, qd81 qd81Var) {
        long j4;
        long j5;
        int i4;
        int i5;
        boolean z3;
        long j6;
        long j7;
        boolean z4;
        long j8;
        ss81Var.getClass();
        if (this.C2 == -9223372036854775807L) {
            this.C2 = j;
        }
        if (j3 != this.v3) {
            gd71 gd71Var = this.v1;
            j5 = -1;
            long j9 = gd71Var.n;
            if (j9 != -1) {
                gd71Var.p = j9;
                gd71Var.q = gd71Var.o;
            }
            gd71Var.m++;
            h681 h681Var = gd71Var.a;
            long j10 = j3 * 1000;
            j4 = 1000;
            h681Var.a.a(j10);
            if (h681Var.a.b()) {
                h681Var.c = false;
            } else if (h681Var.d != -9223372036854775807L) {
                if (h681Var.c) {
                    h381 h381Var = h681Var.b;
                    j8 = 0;
                    long j11 = h381Var.d;
                } else {
                    j8 = 0;
                }
                h381 h381Var2 = h681Var.b;
                long j12 = j8;
                h381Var2.d = j12;
                h381Var2.e = j12;
                h381Var2.f = j12;
                h381Var2.h = 0;
                Arrays.fill(h381Var2.g, false);
                h681Var.b.a(h681Var.d);
                h681Var.c = true;
                h681Var.b.a(j10);
            }
            if (h681Var.c && h681Var.b.b()) {
                h381 h381Var3 = h681Var.a;
                h681Var.a = h681Var.b;
                h681Var.b = h381Var3;
                h681Var.c = false;
            }
            h681Var.d = j10;
            h681Var.e = h681Var.a.b() ? 0 : h681Var.e + 1;
            gd71Var.b();
            this.v3 = j3;
        } else {
            j4 = 1000;
            j5 = -1;
        }
        long j13 = this.R0;
        long j14 = j3 - j13;
        if (z && !z2) {
            dda1.i("skipVideoBuffer");
            ss81Var.d(false, i);
            dda1.h();
            this.P0.f++;
            return true;
        }
        double d = this.U;
        boolean z5 = this.g == 2;
        long elapsedRealtime = SystemClock.elapsedRealtime() * j4;
        long j15 = (long) ((j3 - j) / d);
        if (z5) {
            j15 -= elapsedRealtime - j2;
        }
        if (this.V1 != this.X1) {
            long j16 = elapsedRealtime - this.B3;
            boolean z6 = this.B2 ? !this.x2 : z5 || this.y2;
            if (this.H2 == -9223372036854775807L && j >= j13 && (z6 || (z5 && j15 < -30000 && j16 > 100000))) {
                long nanoTime = System.nanoTime();
                ai61 ai61Var = this.I5;
                if (ai61Var != null) {
                    ai61Var.a(j14, nanoTime, qd81Var, this.a0);
                }
                if (rf71.a >= 21) {
                    V();
                    dda1.i("releaseOutputBuffer");
                    ss81Var.c(i, nanoTime);
                    dda1.h();
                    this.B3 = SystemClock.elapsedRealtime() * j4;
                    z4 = true;
                    this.P0.e++;
                    this.V2 = 0;
                    this.B2 = true;
                    if (!this.x2) {
                        this.x2 = true;
                        this.x1.a(this.V1);
                        this.p2 = true;
                    }
                } else {
                    z4 = true;
                    V();
                    dda1.i("releaseOutputBuffer");
                    ss81Var.d(true, i);
                    dda1.h();
                    this.B3 = SystemClock.elapsedRealtime() * j4;
                    this.P0.e++;
                    this.V2 = 0;
                    this.B2 = true;
                    if (!this.x2) {
                        this.x2 = true;
                        this.x1.a(this.V1);
                        this.p2 = true;
                    }
                }
                b0(j15);
                return z4;
            }
            if (z5 && j != this.C2) {
                long nanoTime2 = System.nanoTime();
                long j17 = (j15 * j4) + nanoTime2;
                gd71 gd71Var2 = this.v1;
                if (gd71Var2.p != j5 && gd71Var2.a.a.b()) {
                    h681 h681Var2 = gd71Var2.a;
                    if (h681Var2.a.b()) {
                        h381 h381Var4 = h681Var2.a;
                        long j18 = h381Var4.e;
                        j7 = j18 == 0 ? 0L : h381Var4.f / j18;
                    } else {
                        j7 = -9223372036854775807L;
                    }
                    long j19 = gd71Var2.q + ((long) (((gd71Var2.m - gd71Var2.p) * j7) / gd71Var2.i));
                    if (Math.abs(j17 - j19) <= 20000000) {
                        j17 = j19;
                    } else {
                        gd71Var2.m = 0L;
                        long j20 = j5;
                        gd71Var2.p = j20;
                        gd71Var2.n = j20;
                    }
                }
                gd71Var2.n = gd71Var2.m;
                gd71Var2.o = j17;
                gg3 gg3Var = gd71Var2.c;
                if (gg3Var != null && gd71Var2.k != -9223372036854775807L) {
                    long j21 = gg3Var.b;
                    if (j21 != -9223372036854775807L) {
                        long j22 = gd71Var2.k;
                        long j23 = (((j17 - j21) / j22) * j22) + j21;
                        if (j17 <= j23) {
                            j6 = j23 - j22;
                        } else {
                            j6 = j23;
                            j23 += j22;
                        }
                        if (j23 - j17 >= j17 - j6) {
                            j23 = j6;
                        }
                        j17 = j23 - gd71Var2.l;
                    }
                }
                long j24 = j17;
                long j25 = (j24 - nanoTime2) / j4;
                boolean z7 = this.H2 != -9223372036854775807L;
                if (j25 < -500000 && !z2) {
                    dg81 dg81Var = this.h;
                    dg81Var.getClass();
                    int d2 = dg81Var.d(j - this.j);
                    if (d2 != 0) {
                        h881 h881Var = this.P0;
                        if (z7) {
                            h881Var.d += d2;
                            h881Var.f += this.X2;
                        } else {
                            h881Var.j++;
                            int i6 = this.X2;
                            h881Var.h += d2;
                            int i7 = d2 + i6;
                            h881Var.g += i7;
                            this.T2 += i7;
                            int i8 = this.V2 + i7;
                            this.V2 = i8;
                            h881Var.i = Math.max(i8, h881Var.i);
                            int i9 = this.B1;
                            if (i9 > 0 && (i5 = this.T2) >= i9 && i5 > 0) {
                                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                long j26 = elapsedRealtime2 - this.N2;
                                a441 a441Var = this.x1;
                                ((Handler) a441Var.b).post(new r071(a441Var, this.T2, j26));
                                z3 = false;
                                this.T2 = 0;
                                this.N2 = elapsedRealtime2;
                                if (L()) {
                                    return z3;
                                }
                                N();
                                return z3;
                            }
                        }
                        z3 = false;
                        if (L()) {
                        }
                    }
                }
                if (j25 < -30000 && !z2) {
                    if (z7) {
                        dda1.i("skipVideoBuffer");
                        ss81Var.d(false, i);
                        dda1.h();
                        this.P0.f++;
                    } else {
                        dda1.i("dropVideoBuffer");
                        ss81Var.d(false, i);
                        dda1.h();
                        h881 h881Var2 = this.P0;
                        h881Var2.h = h881Var2.h;
                        h881Var2.g++;
                        this.T2++;
                        int i10 = this.V2 + 1;
                        this.V2 = i10;
                        h881Var2.i = Math.max(i10, h881Var2.i);
                        int i11 = this.B1;
                        if (i11 > 0 && (i4 = this.T2) >= i11 && i4 > 0) {
                            long elapsedRealtime3 = SystemClock.elapsedRealtime();
                            long j27 = elapsedRealtime3 - this.N2;
                            a441 a441Var2 = this.x1;
                            ((Handler) a441Var2.b).post(new r071(a441Var2, this.T2, j27));
                            this.T2 = 0;
                            this.N2 = elapsedRealtime3;
                        }
                    }
                    b0(j25);
                    return true;
                }
                if (rf71.a >= 21) {
                    if (j25 < MemoryDependsLoadControl.DEFAULT_MAX_DURATION_MS) {
                        ai61 ai61Var2 = this.I5;
                        if (ai61Var2 != null) {
                            ai61Var2.a(j14, j24, qd81Var, this.a0);
                        }
                        V();
                        dda1.i("releaseOutputBuffer");
                        ss81Var.c(i, j24);
                        dda1.h();
                        this.B3 = SystemClock.elapsedRealtime() * j4;
                        this.P0.e++;
                        this.V2 = 0;
                        this.B2 = true;
                        if (!this.x2) {
                            this.x2 = true;
                            this.x1.a(this.V1);
                            this.p2 = true;
                        }
                        b0(j25);
                        return true;
                    }
                } else if (j25 < 30000) {
                    if (j25 > 11000) {
                        try {
                            Thread.sleep((j25 - 10000) / j4);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            return false;
                        }
                    }
                    ai61 ai61Var3 = this.I5;
                    if (ai61Var3 != null) {
                        ai61Var3.a(j14, j24, qd81Var, this.a0);
                    }
                    V();
                    dda1.i("releaseOutputBuffer");
                    ss81Var.d(true, i);
                    dda1.h();
                    this.B3 = SystemClock.elapsedRealtime() * j4;
                    this.P0.e++;
                    this.V2 = 0;
                    this.B2 = true;
                    if (!this.x2) {
                        this.x2 = true;
                        this.x1.a(this.V1);
                        this.p2 = true;
                    }
                    b0(j25);
                    return true;
                }
            }
        } else if (j15 < -30000) {
            dda1.i("skipVideoBuffer");
            ss81Var.d(false, i);
            dda1.h();
            this.P0.f++;
            b0(j15);
            return true;
        }
        return false;
    }

    @Override // defpackage.ja71
    public final boolean B(aq61 aq61Var) {
        return this.V1 != null || Z(aq61Var);
    }

    @Override // defpackage.ja71
    public final void D(yh81 yh81Var) {
        boolean z = this.M4;
        if (!z) {
            this.X2++;
        }
        if (rf71.a >= 23 || !z) {
            return;
        }
        long j = yh81Var.x;
        C(j);
        V();
        this.P0.e++;
        this.B2 = true;
        if (!this.x2) {
            this.x2 = true;
            this.x1.a(this.V1);
            this.p2 = true;
        }
        t(j);
    }

    @Override // defpackage.ja71
    public final boolean M() {
        return this.M4 && rf71.a < 23;
    }

    @Override // defpackage.ja71
    public final void O() {
        c0();
    }

    @Override // defpackage.ja71
    public final void S() {
        super.S();
        this.X2 = 0;
    }

    public final void V() {
        int i = this.N3;
        if (i == -1 && this.T3 == -1) {
            return;
        }
        ty71 ty71Var = this.H4;
        if (ty71Var != null && ty71Var.a == i && ty71Var.b == this.T3 && ty71Var.c == this.V3 && ty71Var.w == this.v4) {
            return;
        }
        ty71 ty71Var2 = new ty71(i, this.T3, this.V3, this.v4);
        this.H4 = ty71Var2;
        a441 a441Var = this.x1;
        ((Handler) a441Var.b).post(new bo31(21, a441Var, ty71Var2));
    }

    public final boolean Z(aq61 aq61Var) {
        boolean z;
        if (rf71.a >= 23 && !this.M4 && !a0(aq61Var.a)) {
            if (aq61Var.f) {
                Context context = this.p1;
                synchronized (pb2.class) {
                    try {
                        if (!pb2.f) {
                            pb2.e = g8a1.b(context) ? g8a1.d() ? 1 : 2 : 0;
                            pb2.f = true;
                        }
                        z = pb2.e != 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.gy61, defpackage.i071
    public final void a(int i, Object obj) {
        boolean z;
        if (i != 1) {
            if (i == 7) {
                this.I5 = (ai61) obj;
                return;
            }
            if (i == 10) {
                int intValue = ((Integer) obj).intValue();
                if (this.N4 != intValue) {
                    this.N4 = intValue;
                    if (this.M4) {
                        Q();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 4) {
                int intValue2 = ((Integer) obj).intValue();
                this.v2 = intValue2;
                ss81 ss81Var = this.W;
                if (ss81Var != null) {
                    ss81Var.b(intValue2);
                    return;
                }
                return;
            }
            if (i != 5) {
                return;
            }
            gd71 gd71Var = this.v1;
            int intValue3 = ((Integer) obj).intValue();
            if (gd71Var.j == intValue3) {
                return;
            }
            gd71Var.j = intValue3;
            gd71Var.a(true);
            return;
        }
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = surface;
        if (surface == null) {
            pb2 pb2Var = this.X1;
            if (pb2Var != null) {
                surface2 = pb2Var;
            } else {
                aq61 aq61Var = this.f0;
                surface2 = surface;
                if (aq61Var != null) {
                    surface2 = surface;
                    if (Z(aq61Var)) {
                        Context context = this.p1;
                        boolean z2 = aq61Var.f;
                        int i2 = pb2.e;
                        if (z2) {
                            synchronized (pb2.class) {
                                try {
                                    if (!pb2.f) {
                                        pb2.e = g8a1.b(context) ? g8a1.d() ? 1 : 2 : 0;
                                        pb2.f = true;
                                    }
                                    z = pb2.e != 0;
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (!z) {
                                ny61.k();
                                return;
                            }
                        }
                        pb2 a = new ob2().a(z2 ? pb2.e : 0);
                        this.X1 = a;
                        surface2 = a;
                    }
                }
            }
        }
        int i3 = 21;
        if (this.V1 == surface2) {
            if (surface2 == null || surface2 == this.X1) {
                return;
            }
            ty71 ty71Var = this.H4;
            if (ty71Var != null) {
                a441 a441Var = this.x1;
                ((Handler) a441Var.b).post(new bo31(i3, a441Var, ty71Var));
            }
            if (this.p2) {
                this.x1.a(this.V1);
                return;
            }
            return;
        }
        this.V1 = surface2;
        gd71 gd71Var2 = this.v1;
        gd71Var2.getClass();
        Surface surface3 = surface2 instanceof pb2 ? null : surface2;
        Surface surface4 = gd71Var2.e;
        if (surface4 != surface3) {
            if (rf71.a >= 30 && surface4 != null && gd71Var2.j != Integer.MIN_VALUE && gd71Var2.h != 0.0f) {
                gd71Var2.h = 0.0f;
                fm61.a(surface4, 0.0f);
            }
            gd71Var2.e = surface3;
            gd71Var2.a(true);
        }
        this.p2 = false;
        int i4 = this.g;
        ss81 ss81Var2 = this.W;
        if (ss81Var2 != null) {
            if (rf71.a < 23 || surface2 == null || this.N1) {
                Q();
                N();
            } else {
                ss81Var2.p(surface2);
            }
        }
        if (surface2 == null || surface2 == this.X1) {
            this.H4 = null;
            c0();
            return;
        }
        ty71 ty71Var2 = this.H4;
        if (ty71Var2 != null) {
            a441 a441Var2 = this.x1;
            ((Handler) a441Var2.b).post(new bo31(i3, a441Var2, ty71Var2));
        }
        c0();
        if (i4 == 2) {
            this.H2 = this.y1 > 0 ? SystemClock.elapsedRealtime() + this.y1 : -9223372036854775807L;
        }
    }

    public final void b0(long j) {
        h881 h881Var = this.P0;
        h881Var.k += j;
        h881Var.l++;
        this.C3 += j;
        this.H3++;
    }

    @Override // defpackage.gy61
    public final String c() {
        return "MediaCodecVideoRenderer";
    }

    public final void c0() {
        ss81 ss81Var;
        this.x2 = false;
        if (rf71.a < 23 || !this.M4 || (ss81Var = this.W) == null) {
            return;
        }
        this.X4 = new uj1(this, ss81Var);
    }

    @Override // defpackage.ja71, defpackage.gy61
    public final boolean f() {
        pb2 pb2Var;
        if (super.f() && (this.x2 || (((pb2Var = this.X1) != null && this.V1 == pb2Var) || this.W == null || this.M4))) {
            this.H2 = -9223372036854775807L;
            return true;
        }
        if (this.H2 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.H2) {
            return true;
        }
        this.H2 = -9223372036854775807L;
        return false;
    }

    @Override // defpackage.gy61
    public final void g() {
        a441 a441Var = this.x1;
        this.H4 = null;
        c0();
        this.p2 = false;
        this.X4 = null;
        int i = 22;
        try {
            this.P = null;
            this.Q0 = -9223372036854775807L;
            this.R0 = -9223372036854775807L;
            this.S0 = 0;
            L();
            h881 h881Var = this.P0;
            a441Var.getClass();
            synchronized (h881Var) {
            }
            ((Handler) a441Var.b).post(new bo31(i, a441Var, h881Var));
        } catch (Throwable th) {
            h881 h881Var2 = this.P0;
            a441Var.getClass();
            synchronized (h881Var2) {
                ((Handler) a441Var.b).post(new bo31(i, a441Var, h881Var2));
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gy61
    public final void h() {
        try {
            try {
                this.A0 = false;
                this.I.e();
                this.H.e();
                this.z0 = false;
                this.y0 = false;
                Q();
            } finally {
                this.S = null;
            }
        } finally {
            pb2 pb2Var = this.X1;
            if (pb2Var != null) {
                if (this.V1 == pb2Var) {
                    this.V1 = null;
                }
                pb2Var.release();
                this.X1 = null;
            }
        }
    }

    @Override // defpackage.gy61
    public final void i() {
        this.T2 = 0;
        this.N2 = SystemClock.elapsedRealtime();
        this.B3 = SystemClock.elapsedRealtime() * 1000;
        this.C3 = 0L;
        this.H3 = 0;
        gd71 gd71Var = this.v1;
        gd71Var.d = true;
        gd71Var.m = 0L;
        gd71Var.p = -1L;
        gd71Var.n = -1L;
        o071 o071Var = gd71Var.b;
        if (o071Var != null) {
            gg3 gg3Var = gd71Var.c;
            gg3Var.getClass();
            gg3Var.c.sendEmptyMessage(1);
            o071Var.a(new gp51(15, gd71Var));
        }
        gd71Var.a(false);
    }

    @Override // defpackage.gy61
    public final void j() {
        Surface surface;
        this.H2 = -9223372036854775807L;
        int i = this.T2;
        a441 a441Var = this.x1;
        if (i > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ((Handler) a441Var.b).post(new r071(a441Var, this.T2, elapsedRealtime - this.N2));
            this.T2 = 0;
            this.N2 = elapsedRealtime;
        }
        int i2 = this.H3;
        if (i2 != 0) {
            ((Handler) a441Var.b).post(new r071(a441Var, this.C3, i2));
            this.C3 = 0L;
            this.H3 = 0;
        }
        gd71 gd71Var = this.v1;
        gd71Var.d = false;
        o071 o071Var = gd71Var.b;
        if (o071Var != null) {
            o071Var.a();
            gg3 gg3Var = gd71Var.c;
            gg3Var.getClass();
            gg3Var.c.sendEmptyMessage(2);
        }
        if (rf71.a < 30 || (surface = gd71Var.e) == null || gd71Var.j == Integer.MIN_VALUE || gd71Var.h == 0.0f) {
            return;
        }
        gd71Var.h = 0.0f;
        fm61.a(surface, 0.0f);
    }

    @Override // defpackage.ja71
    public final float l(float f, qd81[] qd81VarArr) {
        float f2 = -1.0f;
        for (qd81 qd81Var : qd81VarArr) {
            float f3 = qd81Var.L;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // defpackage.ja71
    public final int m(quz quzVar, qd81 qd81Var) {
        boolean z;
        int i = 0;
        if (!MediaStreamTrack.VIDEO_TRACK_KIND.equals(g681.d(qd81Var.E))) {
            return gy61.a(0, 0, 0);
        }
        boolean z2 = qd81Var.H != null;
        t31 X = X(quzVar, qd81Var, z2, false);
        if (z2 && X.isEmpty()) {
            X = X(quzVar, qd81Var, false, false);
        }
        if (X.isEmpty()) {
            return gy61.a(1, 0, 0);
        }
        int i2 = qd81Var.Z;
        if (i2 != 0 && i2 != 2) {
            return gy61.a(2, 0, 0);
        }
        aq61 aq61Var = (aq61) X.get(0);
        boolean e = aq61Var.e(qd81Var);
        if (!e) {
            for (int i3 = 1; i3 < X.size(); i3++) {
                aq61 aq61Var2 = (aq61) X.get(i3);
                if (aq61Var2.e(qd81Var)) {
                    z = false;
                    e = true;
                    aq61Var = aq61Var2;
                    break;
                }
            }
        }
        z = true;
        int i4 = e ? 4 : 3;
        int i5 = 16;
        int i6 = aq61Var.f(qd81Var) ? 16 : 8;
        int i7 = aq61Var.g ? 64 : 0;
        int i8 = z ? 128 : 0;
        if (e) {
            t31 X2 = X(quzVar, qd81Var, z2, true);
            if (!X2.isEmpty()) {
                Pattern pattern = o581.a;
                ArrayList arrayList = new ArrayList(X2);
                Collections.sort(arrayList, new oe7(i5, new gp51(24, qd81Var)));
                aq61 aq61Var3 = (aq61) arrayList.get(0);
                if (aq61Var3.e(qd81Var) && aq61Var3.f(qd81Var)) {
                    i = 32;
                }
            }
        }
        return i4 | i6 | i | i7 | i8;
    }

    @Override // defpackage.ja71
    public final ArrayList n(quz quzVar, qd81 qd81Var) {
        t31 X = X(quzVar, qd81Var, false, this.M4);
        Pattern pattern = o581.a;
        ArrayList arrayList = new ArrayList(X);
        Collections.sort(arrayList, new oe7(16, new gp51(24, qd81Var)));
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ja71
    public final si81 o(aq61 aq61Var, qd81 qd81Var, float f) {
        si81 si81Var;
        boolean z;
        kb kbVar;
        Point point;
        Point point2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        boolean z2;
        int i;
        int i2;
        int i3;
        Pair i4;
        int W;
        pb2 pb2Var = this.X1;
        si81 si81Var2 = null;
        if (pb2Var != null && pb2Var.b != aq61Var.f) {
            if (this.V1 == pb2Var) {
                this.V1 = null;
            }
            pb2Var.release();
            this.X1 = null;
        }
        String str = aq61Var.c;
        qd81[] qd81VarArr = this.i;
        qd81VarArr.getClass();
        int i5 = qd81Var.J;
        int i6 = qd81Var.K;
        int Y = Y(qd81Var, aq61Var);
        boolean z3 = true;
        if (qd81VarArr.length == 1) {
            if (Y != -1 && (W = W(qd81Var, aq61Var)) != -1) {
                Y = Math.min((int) (Y * 1.5f), W);
            }
            kbVar = new kb(i5, i6, Y);
            si81Var = null;
            z = true;
        } else {
            int length = qd81VarArr.length;
            int i7 = 0;
            boolean z4 = false;
            while (i7 < length) {
                si81 si81Var3 = si81Var2;
                qd81 qd81Var2 = qd81VarArr[i7];
                boolean z5 = z3;
                if (qd81Var.Q != null && qd81Var2.Q == null) {
                    da81 da81Var = new da81(qd81Var2);
                    da81Var.w = qd81Var.Q;
                    qd81Var2 = new qd81(da81Var);
                }
                if (aq61Var.b(qd81Var, qd81Var2).d != 0) {
                    int i8 = qd81Var2.J;
                    z4 |= (i8 == -1 || qd81Var2.K == -1) ? z5 : false;
                    i5 = Math.max(i5, i8);
                    i6 = Math.max(i6, qd81Var2.K);
                    Y = Math.max(Y, Y(qd81Var2, aq61Var));
                }
                i7++;
                si81Var2 = si81Var3;
                z3 = z5;
            }
            si81Var = si81Var2;
            z = z3;
            if (z4) {
                nba1.e();
                int i9 = qd81Var.K;
                int i10 = qd81Var.J;
                boolean z6 = i9 > i10 ? z : false;
                int i11 = z6 ? i9 : i10;
                if (z6) {
                    i9 = i10;
                }
                float f2 = i9 / i11;
                int[] iArr = J5;
                int i12 = 0;
                while (i12 < 9) {
                    int i13 = iArr[i12];
                    int i14 = (int) (i13 * f2);
                    if (i13 <= i11 || i14 <= i9) {
                        break;
                    }
                    int i15 = i9;
                    float f3 = f2;
                    if (rf71.a >= 21) {
                        int i16 = z6 ? i14 : i13;
                        if (!z6) {
                            i13 = i14;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = aq61Var.d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            point2 = si81Var;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            point2 = new Point(widthAlignment * (((i16 + widthAlignment) - 1) / widthAlignment), (((i13 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
                        }
                        Object obj = point2;
                        if (aq61Var.d(point2.x, point2.y, qd81Var.L)) {
                            point = obj;
                            break;
                        }
                        i12++;
                        i9 = i15;
                        f2 = f3;
                    } else {
                        try {
                            int i17 = ((i13 + 15) / 16) * 16;
                            int i18 = ((i14 + 15) / 16) * 16;
                            if (i17 * i18 <= o581.a()) {
                                int i19 = z6 ? i18 : i17;
                                if (!z6) {
                                    i17 = i18;
                                }
                                point = new Point(i19, i17);
                            } else {
                                i12++;
                                i9 = i15;
                                f2 = f3;
                            }
                        } catch (lj1 unused) {
                        }
                    }
                }
                point = si81Var;
                if (point != 0) {
                    i5 = Math.max(i5, point.x);
                    i6 = Math.max(i6, point.y);
                    da81 da81Var2 = new da81(qd81Var);
                    da81Var2.p = i5;
                    da81Var2.q = i6;
                    Y = Math.max(Y, W(new qd81(da81Var2), aq61Var));
                    nba1.e();
                }
            }
            kbVar = new kb(i5, i6, Y);
        }
        this.H1 = kbVar;
        boolean z7 = this.C1;
        int i20 = this.M4 ? this.N4 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", qd81Var.J);
        mediaFormat.setInteger("height", qd81Var.K);
        List list = qd81Var.G;
        for (int i21 = 0; i21 < list.size(); i21++) {
            mediaFormat.setByteBuffer(q8a1.c(i21, "csd-"), ByteBuffer.wrap((byte[]) list.get(i21)));
        }
        float f4 = qd81Var.L;
        if (f4 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f4);
        }
        qfa1.b(mediaFormat, "rotation-degrees", qd81Var.M);
        hw81 hw81Var = qd81Var.Q;
        if (hw81Var != null) {
            qfa1.b(mediaFormat, "color-transfer", hw81Var.c);
            qfa1.b(mediaFormat, "color-standard", hw81Var.a);
            qfa1.b(mediaFormat, "color-range", hw81Var.b);
            byte[] bArr = hw81Var.w;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(qd81Var.E) && (i4 = o581.i(qd81Var)) != null) {
            qfa1.b(mediaFormat, "profile", ((Integer) i4.first).intValue());
        }
        mediaFormat.setInteger("max-width", kbVar.a);
        mediaFormat.setInteger("max-height", kbVar.b);
        qfa1.b(mediaFormat, "max-input-size", kbVar.c);
        if (rf71.a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z7) {
            z2 = z;
            mediaFormat.setInteger("no-post-process", z2 ? 1 : 0);
            i = 0;
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z2 = z;
            i = 0;
        }
        if (i20 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z2);
            mediaFormat.setInteger("audio-session-id", i20);
        }
        if (this.V1 == null) {
            if (!Z(aq61Var)) {
                ny61.k();
                return si81Var;
            }
            if (this.X1 == null) {
                Context context = this.p1;
                boolean z8 = aq61Var.f;
                int i22 = pb2.e;
                if (z8) {
                    synchronized (pb2.class) {
                        try {
                            if (pb2.f) {
                                i2 = 1;
                            } else {
                                pb2.e = g8a1.b(context) ? g8a1.d() ? 1 : 2 : i;
                                i2 = 1;
                                pb2.f = true;
                            }
                            i3 = pb2.e != 0 ? i2 : i;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (i3 == 0) {
                        ny61.k();
                        return si81Var;
                    }
                }
                this.X1 = new ob2().a(z8 ? pb2.e : i);
            }
            this.V1 = this.X1;
        }
        return new si81(aq61Var, mediaFormat, qd81Var, this.V1);
    }

    @Override // defpackage.ja71
    public final ko81 p(aq61 aq61Var, qd81 qd81Var, qd81 qd81Var2) {
        ko81 b = aq61Var.b(qd81Var, qd81Var2);
        int i = b.e;
        int i2 = qd81Var2.J;
        kb kbVar = this.H1;
        if (i2 > kbVar.a || qd81Var2.K > kbVar.b) {
            i |= 256;
        }
        if (Y(qd81Var2, aq61Var) > this.H1.c) {
            i |= 64;
        }
        int i3 = i;
        return new ko81(aq61Var.a, qd81Var, qd81Var2, i3 != 0 ? 0 : b.d, i3);
    }

    @Override // defpackage.ja71
    public final ko81 q(og81 og81Var) {
        ko81 q = super.q(og81Var);
        qd81 qd81Var = og81Var.b;
        a441 a441Var = this.x1;
        ((Handler) a441Var.b).post(new r071(a441Var, qd81Var, q));
        return q;
    }

    @Override // defpackage.ja71
    public final bj1 r(IllegalStateException illegalStateException, aq61 aq61Var) {
        Surface surface = this.V1;
        sj1 sj1Var = new sj1(illegalStateException, aq61Var);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return sj1Var;
    }

    @Override // defpackage.ja71
    public final void t(long j) {
        super.t(j);
        if (this.M4) {
            return;
        }
        this.X2--;
    }

    @Override // defpackage.ja71
    public final void u(long j, long j2, String str) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        a441 a441Var = this.x1;
        ((Handler) a441Var.b).post(new r071(a441Var, str, j, j2));
        this.N1 = a0(str);
        aq61 aq61Var = this.f0;
        aq61Var.getClass();
        boolean z = false;
        if (rf71.a >= 29 && "video/x-vnd.on2.vp9".equals(aq61Var.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = aq61Var.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (codecProfileLevelArr[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.T1 = z;
        if (rf71.a < 23 || !this.M4) {
            return;
        }
        ss81 ss81Var = this.W;
        ss81Var.getClass();
        this.X4 = new uj1(this, ss81Var);
    }

    @Override // defpackage.ja71
    public final void w(Exception exc) {
        nba1.c("MediaCodecVideoRenderer", nba1.b("Video codec error", exc));
        a441 a441Var = this.x1;
        ((Handler) a441Var.b).post(new r071(a441Var, exc, 2));
    }

    @Override // defpackage.ja71
    public final void x(String str) {
        a441 a441Var = this.x1;
        ((Handler) a441Var.b).post(new r071(a441Var, str, 5));
    }

    @Override // defpackage.ja71
    public final void y(qd81 qd81Var, MediaFormat mediaFormat) {
        ss81 ss81Var = this.W;
        if (ss81Var != null) {
            ss81Var.b(this.v2);
        }
        if (this.M4) {
            this.N3 = qd81Var.J;
            this.T3 = qd81Var.K;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.N3 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.T3 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f = qd81Var.N;
        this.v4 = f;
        int i = rf71.a;
        int i2 = qd81Var.M;
        if (i < 21) {
            this.V3 = i2;
        } else if (i2 == 90 || i2 == 270) {
            int i3 = this.N3;
            this.N3 = this.T3;
            this.T3 = i3;
            this.v4 = 1.0f / f;
        }
        float f2 = qd81Var.L;
        gd71 gd71Var = this.v1;
        gd71Var.f = f2;
        h681 h681Var = gd71Var.a;
        h381 h381Var = h681Var.a;
        h381Var.d = 0L;
        h381Var.e = 0L;
        h381Var.f = 0L;
        h381Var.h = 0;
        Arrays.fill(h381Var.g, false);
        h381 h381Var2 = h681Var.b;
        h381Var2.d = 0L;
        h381Var2.e = 0L;
        h381Var2.f = 0L;
        h381Var2.h = 0;
        Arrays.fill(h381Var2.g, false);
        h681Var.c = false;
        h681Var.d = -9223372036854775807L;
        h681Var.e = 0;
        gd71Var.b();
    }

    @Override // defpackage.ja71
    public final void z(yh81 yh81Var) {
        if (this.T1) {
            ByteBuffer byteBuffer = yh81Var.y;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && b3 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    ss81 ss81Var = this.W;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    ss81Var.a(bundle);
                }
            }
        }
    }

    @Override // defpackage.ja71, defpackage.gy61
    public final void a(long j, boolean z) {
        super.a(j, z);
        c0();
        gd71 gd71Var = this.v1;
        gd71Var.m = 0L;
        gd71Var.p = -1L;
        gd71Var.n = -1L;
        this.v3 = -9223372036854775807L;
        this.C2 = -9223372036854775807L;
        this.V2 = 0;
        if (z) {
            long j2 = this.y1;
            this.H2 = j2 > 0 ? SystemClock.elapsedRealtime() + j2 : -9223372036854775807L;
        } else {
            this.H2 = -9223372036854775807L;
        }
    }

    @Override // defpackage.gy61
    public final void a(boolean z) {
        this.P0 = new h881();
        v581 v581Var = this.d;
        v581Var.getClass();
        boolean z2 = v581Var.a;
        if (z2 && this.N4 == 0) {
            ny61.k();
            return;
        }
        if (this.M4 != z2) {
            this.M4 = z2;
            Q();
        }
        h881 h881Var = this.P0;
        a441 a441Var = this.x1;
        ((Handler) a441Var.b).post(new r071(a441Var, h881Var, 4));
        this.y2 = z;
        this.B2 = false;
    }

    @Override // defpackage.ja71, defpackage.gy61
    public final void a(float f, float f2) {
        this.U = f;
        this.V = f2;
        G();
        gd71 gd71Var = this.v1;
        gd71Var.i = f;
        gd71Var.m = 0L;
        gd71Var.p = -1L;
        gd71Var.n = -1L;
        gd71Var.a(false);
    }
}
