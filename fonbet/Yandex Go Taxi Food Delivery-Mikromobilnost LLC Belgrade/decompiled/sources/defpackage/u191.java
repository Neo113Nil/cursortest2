package defpackage;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import org.webrtc.MediaStreamTrack;
import yads.bk;
import yads.ck;
import yads.ek;
import yads.gn0;
import yads.t31;
import yads.wk2;

/* loaded from: classes7.dex */
public final class u191 extends ja71 implements lf81 {
    public boolean B1;
    public qd81 C1;
    public long H1;
    public boolean N1;
    public boolean T1;
    public boolean V1;
    public cq71 X1;
    public final Context p1;
    public final hn71 v1;
    public final n671 x1;
    public int y1;

    public u191(Context context, ul81 ul81Var, quz quzVar, boolean z, Handler handler, gn0 gn0Var, n671 n671Var) {
        super(1, ul81Var, quzVar, z, 44100.0f);
        this.p1 = context.getApplicationContext();
        this.x1 = n671Var;
        this.v1 = new hn71(26, handler, gn0Var);
        n671Var.o = new sl81(this);
    }

    public static t31 W(quz quzVar, qd81 qd81Var, n671 n671Var) {
        String str = qd81Var.E;
        if (str == null) {
            p481 p481Var = t31.b;
            return wk2.x;
        }
        if (n671Var.a(qd81Var) != 0) {
            List e = o581.e("audio/raw", false, false);
            aq61 aq61Var = e.isEmpty() ? null : (aq61) e.get(0);
            if (aq61Var != null) {
                return t31.n(aq61Var);
            }
        }
        quzVar.getClass();
        List e2 = o581.e(str, false, false);
        String c = o581.c(qd81Var);
        if (c == null) {
            return t31.m(e2);
        }
        List e3 = o581.e(c, false, false);
        p481 p481Var2 = t31.b;
        a181 a181Var = new a181();
        a181Var.e(e2);
        a181Var.e(e3);
        return a181Var.c();
    }

    @Override // defpackage.ja71
    public final boolean A(long j, long j2, ss81 ss81Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, qd81 qd81Var) {
        byteBuffer.getClass();
        if (this.C1 != null && (i2 & 2) != 0) {
            ss81Var.getClass();
            ss81Var.d(false, i);
            return true;
        }
        n671 n671Var = this.x1;
        if (z) {
            if (ss81Var != null) {
                ss81Var.d(false, i);
            }
            this.P0.f += i3;
            n671Var.C = true;
            return true;
        }
        try {
            if (!n671Var.g(j3, byteBuffer, i3)) {
                return false;
            }
            if (ss81Var != null) {
                ss81Var.d(false, i);
            }
            this.P0.e += i3;
            return true;
        } catch (ck e) {
            throw a(e, e.d, e.c, 5001);
        } catch (ek e2) {
            throw a(e2, qd81Var, e2.c, 5002);
        }
    }

    @Override // defpackage.ja71
    public final void D(yh81 yh81Var) {
        if (!this.N1 || yh81Var.c(Integer.MIN_VALUE)) {
            return;
        }
        if (Math.abs(yh81Var.x - this.H1) > 500000) {
            this.H1 = yh81Var.x;
        }
        this.N1 = false;
    }

    @Override // defpackage.ja71
    public final boolean F(qd81 qd81Var) {
        return this.x1.a(qd81Var) != 0;
    }

    @Override // defpackage.ja71
    public final void O() {
        this.x1.C = true;
    }

    @Override // defpackage.ja71
    public final void R() {
        try {
            n671 n671Var = this.x1;
            if (!n671Var.O && n671Var.n() && n671Var.f()) {
                n671Var.o();
                n671Var.O = true;
            }
        } catch (ek e) {
            throw a(e, e.d, e.c, 5002);
        }
    }

    public final int V(qd81 qd81Var, aq61 aq61Var) {
        int i;
        mf81.a.getClass();
        if (!new String(Base64.decode("T01YLmdvb2dsZS5yYXcuZGVjb2Rlcg==", 0), uza.a).equals(aq61Var.a) || (i = rf71.a) >= 24 || (i == 23 && rf71.y(this.p1))) {
            return qd81Var.F;
        }
        return -1;
    }

    @Override // defpackage.gy61, defpackage.i071
    public final void a(int i, Object obj) {
        n671 n671Var = this.x1;
        if (i == 2) {
            float floatValue = ((Float) obj).floatValue();
            if (n671Var.F != floatValue) {
                n671Var.F = floatValue;
                if (n671Var.n()) {
                    int i2 = rf71.a;
                    AudioTrack audioTrack = n671Var.r;
                    float f = n671Var.F;
                    if (i2 >= 21) {
                        audioTrack.setVolume(f);
                        return;
                    } else {
                        audioTrack.setStereoVolume(f, f);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i == 3) {
            ws71 ws71Var = (ws71) obj;
            if (n671Var.s.equals(ws71Var)) {
                return;
            }
            n671Var.s = ws71Var;
            if (n671Var.U) {
                return;
            }
            n671Var.i();
            return;
        }
        if (i == 6) {
            zp71 zp71Var = (zp71) obj;
            if (n671Var.T.equals(zp71Var)) {
                return;
            }
            zp71Var.getClass();
            if (n671Var.r != null) {
                n671Var.T.getClass();
            }
            n671Var.T = zp71Var;
            return;
        }
        switch (i) {
            case 9:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                kv71 kv71Var = n671Var.k().a;
                nh61 k = n671Var.k();
                if (!kv71Var.equals(k.a) || booleanValue != k.b) {
                    nh61 nh61Var = new nh61(kv71Var, booleanValue, -9223372036854775807L, -9223372036854775807L);
                    if (!n671Var.n()) {
                        n671Var.u = nh61Var;
                        break;
                    } else {
                        n671Var.t = nh61Var;
                        break;
                    }
                }
                break;
            case 10:
                int intValue = ((Integer) obj).intValue();
                if (n671Var.S != intValue) {
                    n671Var.S = intValue;
                    n671Var.R = intValue != 0;
                    n671Var.i();
                    break;
                }
                break;
            case 11:
                this.X1 = (cq71) obj;
                break;
        }
    }

    @Override // defpackage.gy61
    public final lf81 b() {
        return this;
    }

    @Override // defpackage.gy61
    public final String c() {
        return "MediaCodecAudioRenderer";
    }

    @Override // defpackage.lf81
    public final void e(kv71 kv71Var) {
        n671 n671Var = this.x1;
        n671Var.getClass();
        float f = kv71Var.a;
        int i = rf71.a;
        kv71 kv71Var2 = new kv71(Math.max(0.1f, Math.min(f, 8.0f)), Math.max(0.1f, Math.min(kv71Var.b, 8.0f)));
        boolean z = n671Var.k().b;
        nh61 k = n671Var.k();
        if (kv71Var2.equals(k.a) && z == k.b) {
            return;
        }
        nh61 nh61Var = new nh61(kv71Var2, z, -9223372036854775807L, -9223372036854775807L);
        if (n671Var.n()) {
            n671Var.t = nh61Var;
        } else {
            n671Var.u = nh61Var;
        }
    }

    @Override // defpackage.ja71, defpackage.gy61
    public final boolean f() {
        n671 n671Var = this.x1;
        return (n671Var.n() && n671Var.h.b(n671Var.l())) || super.f();
    }

    @Override // defpackage.gy61
    public final void g() {
        hn71 hn71Var = this.v1;
        this.V1 = true;
        try {
            this.x1.i();
            try {
                this.P = null;
                this.Q0 = -9223372036854775807L;
                this.R0 = -9223372036854775807L;
                this.S0 = 0;
                L();
            } finally {
            }
        } catch (Throwable th) {
            try {
                this.P = null;
                this.Q0 = -9223372036854775807L;
                this.R0 = -9223372036854775807L;
                this.S0 = 0;
                L();
                throw th;
            } finally {
            }
        }
    }

    @Override // defpackage.lf81
    public final kv71 getPlaybackParameters() {
        n671 n671Var = this.x1;
        n671Var.getClass();
        return n671Var.k().a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    @Override // defpackage.gy61
    public final void h() {
        n671 n671Var = this.x1;
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
            if (this.V1) {
                this.V1 = false;
                n671Var.i();
                for (lv81 lv81Var : n671Var.e) {
                    lv81Var.d();
                }
                for (lv81 lv81Var2 : n671Var.f) {
                    lv81Var2.d();
                }
                n671Var.Q = false;
                n671Var.W = false;
            }
        }
    }

    @Override // defpackage.gy61
    public final void i() {
        n671 n671Var = this.x1;
        n671Var.Q = true;
        if (n671Var.n()) {
            qh3 qh3Var = n671Var.h.f;
            qh3Var.getClass();
            qh3Var.a();
            n671Var.r.play();
        }
    }

    @Override // defpackage.gy61
    public final void j() {
        boolean e = e();
        n671 n671Var = this.x1;
        long b = n671Var.b(e);
        if (b != Long.MIN_VALUE) {
            if (!this.T1) {
                b = Math.max(this.H1, b);
            }
            this.H1 = b;
            this.T1 = false;
        }
        n671Var.Q = false;
        if (n671Var.n()) {
            wj71 wj71Var = n671Var.h;
            wj71Var.l = 0L;
            wj71Var.w = 0;
            wj71Var.v = 0;
            wj71Var.m = 0L;
            wj71Var.C = 0L;
            wj71Var.F = 0L;
            wj71Var.k = false;
            if (wj71Var.x == -9223372036854775807L) {
                qh3 qh3Var = wj71Var.f;
                qh3Var.getClass();
                qh3Var.a();
                n671Var.r.pause();
            }
        }
    }

    @Override // defpackage.ja71
    public final float l(float f, qd81[] qd81VarArr) {
        int i = -1;
        for (qd81 qd81Var : qd81VarArr) {
            int i2 = qd81Var.S;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if ((r4.isEmpty() ? null : (defpackage.aq61) r4.get(0)) != null) goto L30;
     */
    @Override // defpackage.ja71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(quz quzVar, qd81 qd81Var) {
        boolean z;
        if (!MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(qd81Var.E))) {
            return gy61.a(0, 0, 0);
        }
        int i = rf71.a >= 21 ? 32 : 0;
        int i2 = qd81Var.Z;
        boolean z2 = true;
        boolean z3 = i2 != 0;
        boolean z4 = i2 == 0 || i2 == 2;
        int i3 = 8;
        n671 n671Var = this.x1;
        if (z4 && n671Var.a(qd81Var) != 0) {
            if (z3) {
                List e = o581.e("audio/raw", false, false);
            }
            return gy61.a(4, 8, i);
        }
        if ("audio/raw".equals(qd81Var.E) && n671Var.a(qd81Var) == 0) {
            return gy61.a(1, 0, 0);
        }
        int i4 = qd81Var.R;
        int i5 = qd81Var.S;
        da81 da81Var = new da81();
        da81Var.k = "audio/raw";
        da81Var.x = i4;
        da81Var.y = i5;
        da81Var.z = 2;
        if (n671Var.a(new qd81(da81Var)) == 0) {
            return gy61.a(1, 0, 0);
        }
        t31 W = W(quzVar, qd81Var, n671Var);
        if (W.isEmpty()) {
            return gy61.a(1, 0, 0);
        }
        if (!z4) {
            return gy61.a(2, 0, 0);
        }
        aq61 aq61Var = (aq61) W.get(0);
        boolean e2 = aq61Var.e(qd81Var);
        if (!e2) {
            for (int i6 = 1; i6 < W.size(); i6++) {
                aq61 aq61Var2 = (aq61) W.get(i6);
                if (aq61Var2.e(qd81Var)) {
                    z = false;
                    aq61Var = aq61Var2;
                    break;
                }
            }
        }
        z = true;
        z2 = e2;
        int i7 = z2 ? 4 : 3;
        if (z2 && aq61Var.f(qd81Var)) {
            i3 = 16;
        }
        return i7 | i3 | i | (aq61Var.g ? 64 : 0) | (z ? 128 : 0);
    }

    @Override // defpackage.ja71
    public final ArrayList n(quz quzVar, qd81 qd81Var) {
        t31 W = W(quzVar, qd81Var, this.x1);
        Pattern pattern = o581.a;
        ArrayList arrayList = new ArrayList(W);
        Collections.sort(arrayList, new oe7(16, new gp51(24, qd81Var)));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0109, code lost:
    
        if (new java.lang.String(android.util.Base64.decode("QVhPTiA3IG1pbmk=", 0), r9).equals(r5) == false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9 A[LOOP:1: B:26:0x00b3->B:28:0x00b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0158  */
    @Override // defpackage.ja71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final si81 o(aq61 aq61Var, qd81 qd81Var, float f) {
        boolean z;
        MediaFormat mediaFormat;
        List list;
        int i;
        qd81[] qd81VarArr = this.i;
        qd81VarArr.getClass();
        int V = V(qd81Var, aq61Var);
        if (qd81VarArr.length != 1) {
            for (qd81 qd81Var2 : qd81VarArr) {
                if (aq61Var.b(qd81Var, qd81Var2).d != 0) {
                    V = Math.max(V, V(qd81Var2, aq61Var));
                }
            }
        }
        this.y1 = V;
        String str = aq61Var.a;
        int i2 = rf71.a;
        if (i2 < 24) {
            byte[] decode = Base64.decode("T01YLlNFQy5hYWMuZGVj", 0);
            Charset charset = uza.a;
            if (new String(decode, charset).equals(str) && new String(Base64.decode("c2Ftc3VuZw==", 0), charset).equals(rf71.c)) {
                String str2 = rf71.b;
                if (str2.startsWith(new String(Base64.decode("emVyb2ZsdGU=", 0), charset)) || str2.startsWith(new String(Base64.decode("aGVyb2x0ZQ==", 0), charset)) || str2.startsWith(new String(Base64.decode("aGVyb3FsdGU=", 0), charset))) {
                    z = true;
                    this.B1 = z;
                    String str3 = aq61Var.c;
                    int i3 = this.y1;
                    mediaFormat = new MediaFormat();
                    mediaFormat.setString("mime", str3);
                    int i4 = qd81Var.R;
                    String str4 = qd81Var.E;
                    int i5 = qd81Var.S;
                    mediaFormat.setInteger("channel-count", i4);
                    mediaFormat.setInteger("sample-rate", i5);
                    list = qd81Var.G;
                    for (i = 0; i < list.size(); i++) {
                        mediaFormat.setByteBuffer(q8a1.c(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
                    }
                    qfa1.b(mediaFormat, "max-input-size", i3);
                    if (i2 >= 23) {
                        mediaFormat.setInteger("priority", 0);
                        if (f != -1.0f) {
                            if (i2 == 23) {
                                byte[] decode2 = Base64.decode("WlRFIEIyMDE3Rw==", 0);
                                Charset charset2 = uza.a;
                                String str5 = new String(decode2, charset2);
                                String str6 = rf71.d;
                                if (!str5.equals(str6)) {
                                }
                            }
                            mediaFormat.setFloat("operating-rate", f);
                        }
                    }
                    if (i2 <= 28 && "audio/ac4".equals(str4)) {
                        mediaFormat.setInteger(new String(Base64.decode("YWM0LWlzLXN5bmM=", 0), uza.a), 1);
                    }
                    if (i2 >= 24) {
                        int i6 = qd81Var.R;
                        da81 da81Var = new da81();
                        da81Var.k = "audio/raw";
                        da81Var.x = i6;
                        da81Var.y = i5;
                        da81Var.z = 4;
                        if (this.x1.a(new qd81(da81Var)) == 2) {
                            mediaFormat.setInteger("pcm-encoding", 4);
                        }
                    }
                    if (i2 >= 32) {
                        mediaFormat.setInteger("max-output-channel-count", 99);
                    }
                    this.C1 = ("audio/raw".equals(aq61Var.b) || "audio/raw".equals(str4)) ? null : qd81Var;
                    return new si81(aq61Var, mediaFormat, qd81Var, null);
                }
            }
        }
        z = false;
        this.B1 = z;
        String str32 = aq61Var.c;
        int i32 = this.y1;
        mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str32);
        int i42 = qd81Var.R;
        String str42 = qd81Var.E;
        int i52 = qd81Var.S;
        mediaFormat.setInteger("channel-count", i42);
        mediaFormat.setInteger("sample-rate", i52);
        list = qd81Var.G;
        while (i < list.size()) {
        }
        qfa1.b(mediaFormat, "max-input-size", i32);
        if (i2 >= 23) {
        }
        if (i2 <= 28) {
            mediaFormat.setInteger(new String(Base64.decode("YWM0LWlzLXN5bmM=", 0), uza.a), 1);
        }
        if (i2 >= 24) {
        }
        if (i2 >= 32) {
        }
        this.C1 = ("audio/raw".equals(aq61Var.b) || "audio/raw".equals(str42)) ? null : qd81Var;
        return new si81(aq61Var, mediaFormat, qd81Var, null);
    }

    @Override // defpackage.ja71
    public final ko81 p(aq61 aq61Var, qd81 qd81Var, qd81 qd81Var2) {
        ko81 b = aq61Var.b(qd81Var, qd81Var2);
        int i = b.e;
        if (V(qd81Var2, aq61Var) > this.y1) {
            i |= 64;
        }
        int i2 = i;
        return new ko81(aq61Var.a, qd81Var, qd81Var2, i2 != 0 ? 0 : b.d, i2);
    }

    @Override // defpackage.ja71
    public final ko81 q(og81 og81Var) {
        ko81 q = super.q(og81Var);
        qd81 qd81Var = og81Var.b;
        hn71 hn71Var = this.v1;
        ((Handler) hn71Var.b).post(new x191(hn71Var, qd81Var, q));
        return q;
    }

    @Override // defpackage.ja71
    public final void u(long j, long j2, String str) {
        hn71 hn71Var = this.v1;
        ((Handler) hn71Var.b).post(new x191(hn71Var, str, j, j2));
    }

    @Override // defpackage.ja71
    public final void w(Exception exc) {
        nba1.c("MediaCodecAudioRenderer", nba1.b("Audio codec error", exc));
        hn71 hn71Var = this.v1;
        ((Handler) hn71Var.b).post(new x191(hn71Var, exc, 7));
    }

    @Override // defpackage.ja71
    public final void x(String str) {
        hn71 hn71Var = this.v1;
        ((Handler) hn71Var.b).post(new x191(hn71Var, str, 5));
    }

    @Override // defpackage.ja71
    public final void y(qd81 qd81Var, MediaFormat mediaFormat) {
        qd81 qd81Var2 = this.C1;
        int[] iArr = null;
        if (qd81Var2 != null) {
            qd81Var = qd81Var2;
        } else if (this.W != null) {
            String str = qd81Var.E;
            int i = qd81Var.R;
            int s = "audio/raw".equals(str) ? qd81Var.T : (rf71.a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? rf71.s(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            da81 da81Var = new da81();
            da81Var.k = "audio/raw";
            da81Var.z = s;
            da81Var.A = qd81Var.U;
            da81Var.B = qd81Var.V;
            da81Var.x = mediaFormat.getInteger("channel-count");
            da81Var.y = mediaFormat.getInteger("sample-rate");
            qd81Var = new qd81(da81Var);
            if (this.B1 && qd81Var.R == 6 && i < 6) {
                iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = i2;
                }
            }
        }
        try {
            this.x1.e(qd81Var, iArr);
        } catch (bk e) {
            throw a(e, e.b, false, 5001);
        }
    }

    @Override // defpackage.ja71, defpackage.gy61
    public final boolean e() {
        if (!this.L0) {
            return false;
        }
        n671 n671Var = this.x1;
        if (!n671Var.n()) {
            return true;
        }
        if (n671Var.O) {
            return (n671Var.n() && n671Var.h.b(n671Var.l())) ? false : true;
        }
        return false;
    }

    @Override // defpackage.ja71, defpackage.gy61
    public final void a(long j, boolean z) {
        super.a(j, z);
        this.x1.i();
        this.H1 = j;
        this.N1 = true;
        this.T1 = true;
    }

    @Override // defpackage.gy61
    public final void a(boolean z) {
        h881 h881Var = new h881();
        this.P0 = h881Var;
        hn71 hn71Var = this.v1;
        ((Handler) hn71Var.b).post(new x191(hn71Var, h881Var, 3));
        v581 v581Var = this.d;
        v581Var.getClass();
        boolean z2 = v581Var.a;
        n671 n671Var = this.x1;
        if (z2) {
            n671Var.getClass();
            if (rf71.a >= 21) {
                if (n671Var.R) {
                    if (!n671Var.U) {
                        n671Var.U = true;
                        n671Var.i();
                    }
                } else {
                    ny61.k();
                    return;
                }
            } else {
                ny61.k();
                return;
            }
        } else if (n671Var.U) {
            n671Var.U = false;
            n671Var.i();
        }
        wl61 wl61Var = this.f;
        wl61Var.getClass();
        n671Var.n = wl61Var;
    }

    @Override // defpackage.lf81
    public final long a() {
        if (this.g == 2) {
            long b = this.x1.b(e());
            if (b != Long.MIN_VALUE) {
                if (!this.T1) {
                    b = Math.max(this.H1, b);
                }
                this.H1 = b;
                this.T1 = false;
            }
        }
        return this.H1;
    }
}
