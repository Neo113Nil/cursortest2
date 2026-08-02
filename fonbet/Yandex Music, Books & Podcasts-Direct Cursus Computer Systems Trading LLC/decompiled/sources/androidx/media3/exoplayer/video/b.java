package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import defpackage.aa;
import defpackage.abu;
import defpackage.acu;
import defpackage.akh;
import defpackage.at2;
import defpackage.bsc;
import defpackage.cbu;
import defpackage.ccu;
import defpackage.ckh;
import defpackage.d18;
import defpackage.dbu;
import defpackage.dsc;
import defpackage.dvt;
import defpackage.dxr;
import defpackage.dzr;
import defpackage.e48;
import defpackage.e7o;
import defpackage.gbu;
import defpackage.gih;
import defpackage.gtm;
import defpackage.gvt;
import defpackage.gxn;
import defpackage.hbu;
import defpackage.ho7;
import defpackage.hrb;
import defpackage.ig7;
import defpackage.iih;
import defpackage.kmq;
import defpackage.l5i;
import defpackage.lih;
import defpackage.m78;
import defpackage.mgr;
import defpackage.mih;
import defpackage.n8b;
import defpackage.nih;
import defpackage.nlr;
import defpackage.ois;
import defpackage.pqb;
import defpackage.q85;
import defpackage.qdc;
import defpackage.qg7;
import defpackage.qq4;
import defpackage.qsn;
import defpackage.rcu;
import defpackage.rdk;
import defpackage.rih;
import defpackage.sis;
import defpackage.tcu;
import defpackage.tg7;
import defpackage.tyi;
import defpackage.ude;
import defpackage.unn;
import defpackage.usk;
import defpackage.uvh;
import defpackage.vnn;
import defpackage.vq1;
import defpackage.wvo;
import defpackage.xlr;
import defpackage.xq0;
import defpackage.y1g;
import defpackage.y7l;
import defpackage.yde;
import defpackage.zbu;
import defpackage.zjh;
import defpackage.zqa;
import defpackage.zrb;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public abstract class b extends ho7 implements cbu {
    public static final int[] h2 = {ScreenMirroringConfig.Video.DEFAULT_WIDTH, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean i2;
    public static boolean j2;
    public aa A1;
    public boolean B1;
    public boolean C1;
    public m78 D1;
    public boolean E1;
    public List F1;
    public Surface G1;
    public kmq H1;
    public usk I1;
    public boolean J1;
    public int K1;
    public int L1;
    public long M1;
    public int N1;
    public int O1;
    public int P1;
    public long Q1;
    public int R1;
    public long S1;
    public tcu T1;
    public tcu U1;
    public int V1;
    public boolean W1;
    public int X1;
    public ckh Y1;
    public abu Z1;
    public long a2;
    public long b2;
    public boolean c2;
    public boolean d2;
    public boolean e2;
    public wvo f2;
    public boolean g2;
    public qq4 o1;
    public int p1;
    public nlr q1;
    public final Context r1;
    public final boolean s1;
    public final dxr t1;
    public final int u1;
    public final boolean v1;
    public final dbu w1;
    public final mgr x1;
    public final long y1;
    public final PriorityQueue z1;

    public b(Context context, gih gihVar, rih rihVar, boolean z, Handler handler, ccu ccuVar) {
        super(2, gihVar, rihVar, z, 30.0f);
        this.o1 = qq4.c;
        this.f2 = new wvo(19);
        this.g2 = false;
        Context applicationContext = context.getApplicationContext();
        this.r1 = applicationContext;
        this.u1 = 50;
        this.D1 = null;
        this.t1 = new dxr(handler, ccuVar);
        this.s1 = this.D1 == null;
        this.w1 = new dbu(applicationContext, this, 5000L);
        this.x1 = new mgr();
        this.v1 = "NVIDIA".equals(Build.MANUFACTURER);
        this.H1 = kmq.c;
        this.K1 = 1;
        this.L1 = 0;
        this.T1 = tcu.d;
        this.X1 = 0;
        this.U1 = null;
        this.V1 = -1000;
        this.a2 = -9223372036854775807L;
        this.b2 = -9223372036854775807L;
        this.z1 = new PriorityQueue();
        this.y1 = -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (r3.equals("video/av01") == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int I0(mih mihVar, dsc dscVar) {
        int i = dscVar.u;
        int i3 = dscVar.v;
        if (i != -1 && i3 != -1) {
            String str = dscVar.n;
            str.getClass();
            char c = 1;
            if ("video/dolby-vision".equals(str)) {
                Pair d = zjh.d(dscVar);
                if (d != null) {
                    int intValue = ((Integer) d.first).intValue();
                    if (intValue == 512 || intValue == 1 || intValue == 2) {
                        str = "video/avc";
                    } else if (intValue == 1024) {
                        str = "video/av01";
                    }
                }
                str = "video/hevc";
            }
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
                    return ((i * i3) * 3) / 4;
                case 2:
                    return Math.max(2097152, ((i * i3) * 3) / 4);
                case 4:
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !mihVar.g)))) {
                        return ((dvt.f(i3, 16) * dvt.f(i, 16)) * 768) / 4;
                    }
                    break;
                case 6:
                    return ((i * i3) * 3) / 8;
            }
        }
        return -1;
    }

    public static int K0(mih mihVar, dsc dscVar) {
        int i = dscVar.o;
        List list = dscVar.q;
        if (i == -1) {
            return I0(mihVar, dscVar);
        }
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += ((byte[]) list.get(i4)).length;
        }
        return dscVar.o + i3;
    }

    @Override // defpackage.ho7
    public final int B0(rih rihVar, dsc dscVar) {
        dsc dscVar2;
        boolean z;
        int i = 0;
        if (!l5i.o(dscVar.n)) {
            return at2.e(0, 0, 0, 0);
        }
        boolean z2 = true;
        boolean z3 = dscVar.r != null;
        wvo wvoVar = this.f2;
        Context context = this.r1;
        List E = wvoVar.E(context, rihVar, dscVar, z3, false);
        boolean z4 = z3;
        if (z4 && E.isEmpty()) {
            dscVar2 = dscVar;
            E = this.f2.E(context, rihVar, dscVar2, false, false);
        } else {
            dscVar2 = dscVar;
        }
        if (E.isEmpty()) {
            return at2.e(1, 0, 0, 0);
        }
        int i3 = dscVar2.M;
        if (i3 != 0 && i3 != 2) {
            return at2.e(2, 0, 0, 0);
        }
        mih mihVar = (mih) E.get(0);
        boolean e = mihVar.e(dscVar2);
        if (!e) {
            for (int i4 = 1; i4 < E.size(); i4++) {
                mih mihVar2 = (mih) E.get(i4);
                if (mihVar2.e(dscVar2)) {
                    z = false;
                    mihVar = mihVar2;
                    break;
                }
            }
        }
        z = true;
        z2 = e;
        int i5 = z2 ? 4 : 3;
        int i6 = mihVar.g(dscVar2) ? 16 : 8;
        int i7 = mihVar.h ? 64 : 0;
        int i8 = z ? 128 : 0;
        if (dvt.a >= 26 && "video/dolby-vision".equals(dscVar2.n) && !gvt.k(context)) {
            i8 = 256;
        }
        int i9 = i8;
        if (z2) {
            List E2 = this.f2.E(context, rihVar, dscVar2, z4, true);
            if (!E2.isEmpty()) {
                mih mihVar3 = (mih) zjh.h(dscVar2, E2).get(0);
                if (mihVar3.e(dscVar2) && mihVar3.g(dscVar2)) {
                    i = 32;
                }
            }
        }
        return at2.f(i5, i6, i, i7, i9, 0);
    }

    @Override // defpackage.ho7, defpackage.at2
    public final void C(dsc[] dscVarArr, long j, long j3, uvh uvhVar) {
        super.C(dscVarArr, j, j3, uvhVar);
        if (this.a2 == -9223372036854775807L) {
            this.a2 = j;
        }
        sis sisVar = this.p;
        if (sisVar.p()) {
            this.b2 = -9223372036854775807L;
        } else {
            uvhVar.getClass();
            this.b2 = sisVar.g(uvhVar.a, new ois()).d;
        }
    }

    @Override // defpackage.ho7, defpackage.at2
    public final void E(long j, long j3) {
        m78 m78Var = this.D1;
        if (m78Var != null) {
            try {
                tyi tyiVar = ((y7l) m78Var.e).f;
                tyiVar.getClass();
                try {
                    ((hbu) tyiVar.d).a(j, j3);
                } catch (pqb e) {
                    throw new rcu(e, (dsc) tyiVar.f);
                }
            } catch (rcu e2) {
                throw h(e2, e2.a, false, 7001);
            }
        }
        super.E(j, j3);
    }

    @Override // defpackage.ho7, defpackage.at2
    public final void G(float f, float f2) {
        super.G(f, f2);
        m78 m78Var = this.D1;
        if (m78Var != null) {
            m78Var.L(f);
        } else {
            this.w1.k(f);
        }
    }

    public abstract boolean G0(String str);

    public final nih H0(RuntimeException runtimeException, IllegalStateException illegalStateException) {
        mih mihVar = this.L;
        M(illegalStateException, mihVar);
        return new nih(runtimeException, mihVar, this.o1);
    }

    public final rdk J0() {
        float W;
        if (dvt.a < 23) {
            W = -1.0f;
        } else {
            float f = this.v0;
            dsc[] dscVarArr = this.j;
            dscVarArr.getClass();
            W = W(f, dscVarArr);
        }
        return Y(this.L, this.s, this.X, W > this.z ? W : -1.0f);
    }

    @Override // defpackage.ho7
    public final tg7 L(mih mihVar, dsc dscVar, dsc dscVar2) {
        tg7 b = mihVar.b(dscVar, dscVar2);
        int i = b.e;
        aa aaVar = this.A1;
        aaVar.getClass();
        if (dscVar2.u > aaVar.a || dscVar2.v > aaVar.b) {
            i |= 256;
        }
        if (K0(mihVar, dscVar2) > aaVar.c) {
            i |= 64;
        }
        if (this.e2 && mihVar.a.startsWith("OMX.MTK.VIDEO.DECODER.AVC")) {
            i |= 2;
        }
        if (this.g2) {
            Pair d = zjh.d(dscVar);
            Pair d2 = zjh.d(dscVar2);
            if (d != null && d2 != null) {
                Integer num = (Integer) d.first;
                Integer num2 = (Integer) d2.first;
                Integer num3 = (Integer) d.second;
                Integer num4 = (Integer) d2.second;
                boolean z = num2.intValue() > num.intValue();
                boolean z2 = num4.intValue() > num3.intValue();
                if (z || z2) {
                    i |= 2;
                }
            }
        }
        int i3 = i;
        return new tg7(mihVar.a, dscVar, dscVar2, i3 == 0 ? b.d : 0, i3);
    }

    public final Surface L0(mih mihVar) {
        m78 m78Var = this.D1;
        if (m78Var != null) {
            m78Var.s();
            throw null;
        }
        Surface surface = this.G1;
        if (surface != null) {
            return surface;
        }
        if (dvt.a >= 35 && mihVar.k) {
            return null;
        }
        vq1.A(S0(mihVar));
        usk uskVar = this.I1;
        if (uskVar != null && uskVar.a != mihVar.g && uskVar != null) {
            uskVar.release();
            this.I1 = null;
        }
        if (this.I1 == null) {
            this.I1 = usk.b(this.r1, mihVar.g);
        }
        return this.I1;
    }

    @Override // defpackage.ho7
    public final lih M(IllegalStateException illegalStateException, mih mihVar) {
        if (!(illegalStateException instanceof MediaCodec.CodecException)) {
            return new akh(illegalStateException, mihVar, this.G1);
        }
        MediaCodec.CodecException codecException = (MediaCodec.CodecException) illegalStateException;
        boolean isRecoverable = codecException.isRecoverable();
        boolean isTransient = codecException.isTransient();
        iih iihVar = this.G;
        PersistableBundle h = (iihVar == null || Build.VERSION.SDK_INT < 26) ? null : iihVar.h();
        return h != null ? new n8b(illegalStateException, mihVar, this.G1, isRecoverable, isTransient, h) : new n8b(illegalStateException, mihVar, this.G1, isRecoverable, isTransient);
    }

    public final boolean M0(mih mihVar) {
        if (this.D1 != null) {
            return true;
        }
        Surface surface = this.G1;
        if (surface == null || !surface.isValid()) {
            return (dvt.a >= 35 && mihVar.k) || S0(mihVar);
        }
        return true;
    }

    public final void N0() {
        if (this.N1 > 0) {
            this.g.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.M1;
            int i = this.N1;
            dxr dxrVar = this.t1;
            Handler handler = (Handler) dxrVar.a;
            if (handler != null) {
                handler.post(new zbu(dxrVar, i, j));
            }
            this.N1 = 0;
            this.M1 = elapsedRealtime;
        }
    }

    public final void O0() {
        int i;
        iih iihVar;
        if (!this.W1 || (i = dvt.a) < 23 || (iihVar = this.G) == null) {
            return;
        }
        this.Y1 = new ckh(this, iihVar);
        if (i >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            iihVar.b(bundle);
        }
    }

    public final void P0(iih iihVar, int i, long j) {
        Surface surface;
        Trace.beginSection("renderOutputBuffer");
        iihVar.l(i, j);
        Trace.endSection();
        this.h1.e++;
        this.O1 = 0;
        if (this.D1 == null) {
            tcu tcuVar = this.T1;
            boolean equals = tcuVar.equals(tcu.d);
            dxr dxrVar = this.t1;
            if (!equals && !tcuVar.equals(this.U1)) {
                this.U1 = tcuVar;
                dxrVar.i(tcuVar);
            }
            if (!this.w1.e() || (surface = this.G1) == null) {
                return;
            }
            dxrVar.g(surface);
            this.J1 = true;
        }
    }

    public final void Q0(IllegalStateException illegalStateException) {
        nlr nlrVar = this.q1;
        if (nlrVar != null) {
            nlrVar.X(hrb.e(M(illegalStateException, this.L)));
        }
    }

    public final void R0(Object obj) {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.G1;
        dxr dxrVar = this.t1;
        if (surface2 == surface) {
            if (surface != null) {
                tcu tcuVar = this.U1;
                if (tcuVar != null) {
                    dxrVar.i(tcuVar);
                }
                Surface surface3 = this.G1;
                if (surface3 == null || !this.J1) {
                    return;
                }
                dxrVar.g(surface3);
                return;
            }
            return;
        }
        this.G1 = surface;
        m78 m78Var = this.D1;
        dbu dbuVar = this.w1;
        if (m78Var == null) {
            dbuVar.j(surface);
        }
        this.J1 = false;
        int i = this.h;
        iih iihVar = this.G;
        if (iihVar != null && this.D1 == null) {
            mih mihVar = this.L;
            mihVar.getClass();
            boolean M0 = M0(mihVar);
            int i3 = dvt.a;
            if (i3 < 23 || !M0 || this.B1) {
                s0();
                d0();
            } else {
                Surface L0 = L0(mihVar);
                if (i3 >= 23 && L0 != null) {
                    iihVar.j(L0);
                } else {
                    if (i3 < 35) {
                        e7o.n();
                        return;
                    }
                    iihVar.e();
                }
            }
        }
        if (surface != null) {
            tcu tcuVar2 = this.U1;
            if (tcuVar2 != null) {
                dxrVar.i(tcuVar2);
            }
        } else {
            this.U1 = null;
            m78 m78Var2 = this.D1;
            if (m78Var2 != null) {
                m78Var2.o();
            }
        }
        if (i == 2) {
            m78 m78Var3 = this.D1;
            if (m78Var3 != null) {
                m78Var3.u(true);
            } else {
                dbuVar.c(true);
            }
        }
        O0();
    }

    public final boolean S0(mih mihVar) {
        if (dvt.a < 23 || this.W1 || G0(mihVar.a)) {
            return false;
        }
        return !mihVar.g || usk.a(this.r1);
    }

    public final void T0(iih iihVar, int i) {
        Trace.beginSection("skipVideoBuffer");
        iihVar.k(i);
        Trace.endSection();
        this.h1.f++;
    }

    @Override // defpackage.ho7
    public final int U(qg7 qg7Var) {
        return (dvt.a < 34 || !this.W1 || qg7Var.k >= this.l) ? 0 : 32;
    }

    public final void U0(int i, int i3) {
        ig7 ig7Var = this.h1;
        ig7Var.h += i;
        int i4 = i + i3;
        ig7Var.g += i4;
        this.N1 += i4;
        int i5 = this.O1 + i4;
        this.O1 = i5;
        ig7Var.i = Math.max(i5, ig7Var.i);
        int i6 = this.u1;
        if (i6 <= 0 || this.N1 < i6) {
            return;
        }
        N0();
    }

    @Override // defpackage.ho7
    public final boolean V() {
        return this.W1 && dvt.a < 23;
    }

    public final void V0(long j) {
        ig7 ig7Var = this.h1;
        ig7Var.k += j;
        ig7Var.l++;
        this.Q1 += j;
        this.R1++;
    }

    @Override // defpackage.ho7
    public final float W(float f, dsc[] dscVarArr) {
        float f2 = -1.0f;
        for (dsc dscVar : dscVarArr) {
            float f3 = dscVar.w;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // defpackage.ho7
    public final ArrayList X(rih rihVar, dsc dscVar, boolean z) {
        return zjh.h(dscVar, this.f2.E(this.r1, rihVar, dscVar, z, this.W1));
    }

    @Override // defpackage.ho7
    public final rdk Y(mih mihVar, dsc dscVar, MediaCrypto mediaCrypto, float f) {
        q85 q85Var;
        int i;
        aa aaVar;
        Point point;
        int i3;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i4;
        char c;
        boolean z;
        Pair d;
        int I0;
        String str = mihVar.c;
        dsc[] dscVarArr = this.j;
        dscVarArr.getClass();
        int i5 = dscVar.u;
        float f2 = dscVar.w;
        q85 q85Var2 = dscVar.B;
        int i6 = dscVar.v;
        int K0 = K0(mihVar, dscVar);
        if (dscVarArr.length == 1) {
            if (K0 != -1 && (I0 = I0(mihVar, dscVar)) != -1) {
                K0 = Math.min((int) (K0 * 1.5f), I0);
            }
            aaVar = new aa(i5, i6, K0);
            q85Var = q85Var2;
            i = i6;
        } else {
            int length = dscVarArr.length;
            int i7 = i5;
            int i8 = i6;
            int i9 = 0;
            boolean z2 = false;
            while (i9 < length) {
                dsc dscVar2 = dscVarArr[i9];
                dsc[] dscVarArr2 = dscVarArr;
                if (q85Var2 != null && dscVar2.B == null) {
                    bsc a = dscVar2.a();
                    a.A = q85Var2;
                    dscVar2 = new dsc(a);
                }
                tg7 b = mihVar.b(dscVar, dscVar2);
                int i10 = length;
                int i11 = dscVar2.v;
                if (b.d != 0) {
                    int i12 = dscVar2.u;
                    i4 = i9;
                    c = 65535;
                    z2 |= i12 == -1 || i11 == -1;
                    i7 = Math.max(i7, i12);
                    i8 = Math.max(i8, i11);
                    K0 = Math.max(K0, K0(mihVar, dscVar2));
                } else {
                    i4 = i9;
                    c = 65535;
                }
                length = i10;
                i9 = i4 + 1;
                dscVarArr = dscVarArr2;
            }
            if (z2) {
                vq1.n0("YMediaCodecVideoRendere", "Resolutions unknown. Codec max resolution: " + i7 + "x" + i8);
                boolean z3 = i6 > i5;
                int i13 = z3 ? i6 : i5;
                boolean z4 = z3;
                int i14 = z3 ? i5 : i6;
                float f3 = i14 / i13;
                int i15 = 0;
                while (true) {
                    q85Var = q85Var2;
                    if (i15 >= 9) {
                        break;
                    }
                    int i16 = h2[i15];
                    int i17 = i15;
                    int i18 = (int) (i16 * f3);
                    if (i16 <= i13 || i18 <= i14) {
                        break;
                    }
                    if (!z4) {
                        i18 = i16;
                    }
                    if (!z4) {
                        i16 = i18;
                    }
                    int i19 = i14;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = mihVar.d;
                    if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                        i3 = i13;
                        point = null;
                    } else {
                        int widthAlignment = videoCapabilities.getWidthAlignment();
                        i3 = i13;
                        int heightAlignment = videoCapabilities.getHeightAlignment();
                        point = new Point(dvt.f(i18, widthAlignment) * widthAlignment, dvt.f(i16, heightAlignment) * heightAlignment);
                    }
                    if (point != null) {
                        i = i6;
                        if (mihVar.h(f2, point.x, point.y)) {
                            break;
                        }
                    } else {
                        i = i6;
                    }
                    i15 = i17 + 1;
                    i6 = i;
                    q85Var2 = q85Var;
                    i14 = i19;
                    i13 = i3;
                }
                i = i6;
                point = null;
                if (point != null) {
                    i7 = Math.max(i7, point.x);
                    i8 = Math.max(i8, point.y);
                    bsc a2 = dscVar.a();
                    a2.t = i7;
                    a2.u = i8;
                    K0 = Math.max(K0, I0(mihVar, new dsc(a2)));
                    vq1.n0("YMediaCodecVideoRendere", "Codec max resolution adjusted to: " + i7 + "x" + i8);
                }
            } else {
                q85Var = q85Var2;
                i = i6;
            }
            aaVar = new aa(i7, i8, K0);
        }
        this.A1 = aaVar;
        int i20 = this.W1 ? this.X1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger(CameraProperty.WIDTH, i5);
        mediaFormat.setInteger(CameraProperty.HEIGHT, i);
        y1g.a0(mediaFormat, dscVar.q);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        y1g.O(mediaFormat, "rotation-degrees", dscVar.x);
        y1g.N(mediaFormat, q85Var);
        if ("video/dolby-vision".equals(dscVar.n) && (d = zjh.d(dscVar)) != null) {
            y1g.O(mediaFormat, "profile", ((Integer) d.first).intValue());
        }
        mediaFormat.setInteger("max-width", aaVar.a);
        mediaFormat.setInteger("max-height", aaVar.b);
        y1g.O(mediaFormat, "max-input-size", aaVar.c);
        int i21 = dvt.a;
        if (i21 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (this.v1) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i20 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i20);
        }
        if (i21 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.V1));
        }
        Surface L0 = L0(mihVar);
        if (this.D1 != null && !dvt.U(this.r1)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new rdk(mihVar, mediaFormat, dscVar, L0, mediaCrypto, null, 13);
    }

    @Override // defpackage.ho7
    public final void Z(IllegalStateException illegalStateException) {
        boolean z = illegalStateException instanceof MediaCodec.CodecException;
        if (!z) {
            StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
            if (stackTrace.length <= 0) {
                throw illegalStateException;
            }
            if (!stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                throw illegalStateException;
            }
        }
        int i = vnn.a[this.o1.b.ordinal()];
        if (i == 1) {
            if (this.p1 >= this.o1.a) {
                F0(illegalStateException);
                throw null;
            }
            Log.d("MediaCodecRenderer", "recover attempt by stop_restart made in render", illegalStateException);
            this.p1++;
            Q0(illegalStateException);
            rdk J0 = J0();
            try {
                try {
                    unn unnVar = (unn) this.G;
                    if (unnVar != null) {
                        unnVar.r(J0);
                    }
                    return;
                } catch (RuntimeException e) {
                    throw h(H0(e, illegalStateException), this.s, false, 1000000);
                }
            } finally {
            }
        }
        if (i == 2) {
            if (this.p1 >= this.o1.a) {
                F0(illegalStateException);
                throw null;
            }
            Log.d("MediaCodecRenderer", "recover attempt by reset_restart made in render", illegalStateException);
            this.p1++;
            Q0(illegalStateException);
            rdk J02 = J0();
            try {
                try {
                    unn unnVar2 = (unn) this.G;
                    if (unnVar2 != null) {
                        unnVar2.q(J02);
                    }
                    return;
                } catch (RuntimeException e2) {
                    throw h(H0(e2, illegalStateException), this.s, false, 1000000);
                }
            } finally {
            }
        }
        if (i == 3) {
            if (this.p1 >= this.o1.a || !z) {
                F0(illegalStateException);
                throw null;
            }
            Q0(illegalStateException);
            try {
                try {
                    rdk J03 = J0();
                    unn unnVar3 = (unn) this.G;
                    if (unnVar3 != null && !unnVar3.n((MediaCodec.CodecException) illegalStateException, J03)) {
                        unnVar3.q(J03);
                    }
                    u0();
                    this.p1++;
                    return;
                } catch (RuntimeException e3) {
                    throw h(H0(e3, illegalStateException), this.s, false, 1000000);
                }
            } finally {
            }
        }
        if (i != 4) {
            if (i != 5) {
                return;
            }
            F0(illegalStateException);
            throw null;
        }
        Log.d("MediaCodecRenderer", "reset_release due to error", illegalStateException);
        Q0(illegalStateException);
        try {
            try {
                unn unnVar4 = (unn) this.G;
                if (unnVar4 != null) {
                    unnVar4.reset();
                }
                s0();
                throw h(M(illegalStateException, this.L), this.s, false, 4003);
            } catch (RuntimeException e4) {
                throw h(H0(e4, illegalStateException), this.s, false, 1000000);
            }
        } catch (Throwable th) {
            s0();
            throw th;
        }
    }

    @Override // defpackage.at2, defpackage.ogl
    public final void a(int i, Object obj) {
        if (i == 1) {
            R0(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            abu abuVar = (abu) obj;
            this.Z1 = abuVar;
            m78 m78Var = this.D1;
            if (m78Var != null) {
                m78Var.O(abuVar);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.X1 != intValue) {
                this.X1 = intValue;
                if (this.W1) {
                    s0();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.K1 = intValue2;
            iih iihVar = this.G;
            if (iihVar != null) {
                iihVar.g(intValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.L1 = intValue3;
            m78 m78Var2 = this.D1;
            if (m78Var2 != null) {
                m78Var2.J(intValue3);
                return;
            }
            gbu gbuVar = this.w1.b;
            if (gbuVar.j == intValue3) {
                return;
            }
            gbuVar.j = intValue3;
            gbuVar.d(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            this.F1 = list;
            m78 m78Var3 = this.D1;
            if (m78Var3 != null) {
                m78Var3.N(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            kmq kmqVar = (kmq) obj;
            if (kmqVar.a == 0 || kmqVar.b == 0) {
                return;
            }
            this.H1 = kmqVar;
            m78 m78Var4 = this.D1;
            if (m78Var4 != null) {
                Surface surface = this.G1;
                vq1.B(surface);
                m78Var4.K(surface, kmqVar);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.V1 = ((Integer) obj).intValue();
            iih iihVar2 = this.G;
            if (iihVar2 != null && dvt.a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.V1));
                iihVar2.b(bundle);
                return;
            }
            return;
        }
        if (i == 17) {
            Surface surface2 = this.G1;
            R0(null);
            obj.getClass();
            ((a) obj).N0(surface2);
            return;
        }
        if (i == 11) {
            zrb zrbVar = (zrb) obj;
            zrbVar.getClass();
            this.C0 = zrbVar;
        }
    }

    @Override // defpackage.ho7
    public final void a0(qg7 qg7Var) {
        if (this.C1) {
            ByteBuffer byteBuffer = qg7Var.l;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if ((b == -75 && s == 60 && s2 == 1 && b2 == 4 && b3 == 0) || b3 == 1) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    iih iihVar = this.G;
                    iihVar.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    iihVar.b(bundle);
                }
            }
        }
    }

    @Override // defpackage.cbu
    public final boolean b(long j, long j3) {
        return j < -30000 && j3 > 100000;
    }

    @Override // defpackage.cbu
    public final boolean c(long j, long j3, boolean z, boolean z2) {
        int H;
        long j4 = this.y1;
        if (j4 != -9223372036854775807L) {
            this.d2 = j3 > this.l + 200000 && j < j4;
        }
        if (j >= -500000 || z || (H = H(j3)) == 0) {
            return false;
        }
        ig7 ig7Var = this.h1;
        PriorityQueue priorityQueue = this.z1;
        if (z2) {
            int i = ig7Var.d + H;
            ig7Var.d = i;
            ig7Var.f += this.P1;
            ig7Var.d = priorityQueue.size() + i;
        } else {
            ig7Var.j++;
            U0(priorityQueue.size() + H, this.P1);
        }
        if (S()) {
            d0();
        }
        m78 m78Var = this.D1;
        if (m78Var != null) {
            m78Var.q(false);
        }
        return true;
    }

    @Override // defpackage.cbu
    public final boolean d(long j, boolean z) {
        return j < -30000 && !z;
    }

    @Override // defpackage.ho7
    public final boolean f0(dsc dscVar) {
        m78 m78Var = this.D1;
        if (m78Var == null) {
            return true;
        }
        try {
            m78Var.t(dscVar);
            throw null;
        } catch (rcu e) {
            throw h(e, dscVar, false, 7000);
        }
    }

    @Override // defpackage.ho7
    public final void g0(Exception exc) {
        vq1.L("YMediaCodecVideoRendere", "Video codec error", exc);
        dxr dxrVar = this.t1;
        Handler handler = (Handler) dxrVar.a;
        if (handler != null) {
            handler.post(new xlr(16, dxrVar, exc));
        }
    }

    @Override // defpackage.at2
    public final void i() {
        m78 m78Var = this.D1;
        if (m78Var != null) {
            m78Var.p();
            return;
        }
        dbu dbuVar = this.w1;
        if (dbuVar.e == 0) {
            dbuVar.e = 1;
        }
    }

    @Override // defpackage.ho7
    public final void i0(String str) {
        dxr dxrVar = this.t1;
        Handler handler = (Handler) dxrVar.a;
        if (handler != null) {
            handler.post(new xlr(17, dxrVar, str));
        }
    }

    @Override // defpackage.ho7
    public tg7 j0(qdc qdcVar) {
        tg7 j0 = super.j0(qdcVar);
        dsc dscVar = (dsc) qdcVar.c;
        dscVar.getClass();
        dxr dxrVar = this.t1;
        Handler handler = (Handler) dxrVar.a;
        if (handler != null) {
            handler.post(new gtm(5, dxrVar, dscVar, j0));
        }
        return j0;
    }

    @Override // defpackage.at2
    public final String k() {
        return "YMediaCodecVideoRendere";
    }

    @Override // defpackage.ho7
    public final void k0(dsc dscVar, MediaFormat mediaFormat) {
        int integer;
        int i;
        iih iihVar = this.G;
        if (iihVar != null) {
            iihVar.g(this.K1);
        }
        if (this.W1) {
            i = dscVar.u;
            integer = dscVar.v;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger(CameraProperty.WIDTH);
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger(CameraProperty.HEIGHT);
            i = integer2;
        }
        float f = dscVar.y;
        int i3 = dscVar.x;
        if (i3 == 90 || i3 == 270) {
            f = 1.0f / f;
            int i4 = integer;
            integer = i;
            i = i4;
        }
        this.T1 = new tcu(i, f, integer);
        m78 m78Var = this.D1;
        if (m78Var == null || !this.c2) {
            this.w1.i(dscVar.w);
            this.c2 = false;
            return;
        }
        bsc a = dscVar.a();
        a.t = i;
        a.u = integer;
        a.x = f;
        dsc dscVar2 = new dsc(a);
        List list = this.F1;
        if (list == null) {
            ude udeVar = yde.b;
            list = qsn.e;
        }
        m78Var.x(dscVar2, list);
        throw null;
    }

    @Override // defpackage.ho7
    public final void m0(long j) {
        super.m0(j);
        if (this.W1) {
            return;
        }
        this.P1--;
    }

    @Override // defpackage.at2
    public final boolean n() {
        return this.e1 && this.D1 == null;
    }

    @Override // defpackage.ho7
    public final void n0() {
        m78 m78Var = this.D1;
        if (m78Var != null) {
            m78Var.P();
            this.D1.M(this.i1.b, -this.a2);
        } else {
            this.w1.d(2);
        }
        this.c2 = true;
        O0();
    }

    @Override // defpackage.ho7
    public final void o0(qg7 qg7Var) {
        Surface surface;
        boolean z = this.W1;
        if (!z) {
            this.P1++;
        }
        if (dvt.a >= 23 || !z) {
            return;
        }
        long j = qg7Var.k;
        E0(j);
        tcu tcuVar = this.T1;
        boolean equals = tcuVar.equals(tcu.d);
        dxr dxrVar = this.t1;
        if (!equals && !tcuVar.equals(this.U1)) {
            this.U1 = tcuVar;
            dxrVar.i(tcuVar);
        }
        this.h1.e++;
        if (this.w1.e() && (surface = this.G1) != null) {
            dxrVar.g(surface);
            this.J1 = true;
        }
        m0(j);
    }

    @Override // defpackage.ho7, defpackage.at2
    public final boolean p() {
        boolean p = super.p();
        m78 m78Var = this.D1;
        if (m78Var != null) {
            return ((dbu) ((y7l) m78Var.e).f.b).b(false);
        }
        if (p && (this.G == null || this.W1)) {
            return true;
        }
        return this.w1.b(p);
    }

    @Override // defpackage.ho7
    public final boolean q0(long j, long j3, iih iihVar, ByteBuffer byteBuffer, int i, int i3, int i4, long j4, boolean z, boolean z2, dsc dscVar) {
        iihVar.getClass();
        long j5 = j4 - this.i1.c;
        int i5 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.z1;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j4) {
                break;
            }
            i5++;
            priorityQueue.poll();
        }
        U0(i5, 0);
        m78 m78Var = this.D1;
        if (m78Var == null) {
            int a = this.w1.a(j4, j, j3, this.i1.b, z, z2, this.x1);
            mgr mgrVar = this.x1;
            if (a == 0) {
                this.g.getClass();
                long nanoTime = System.nanoTime();
                abu abuVar = this.Z1;
                if (abuVar != null) {
                    abuVar.b(j5, nanoTime, dscVar, this.I);
                }
                P0(iihVar, i, nanoTime);
                V0(mgrVar.a);
                return true;
            }
            if (a == 1) {
                long j6 = mgrVar.b;
                long j7 = mgrVar.a;
                if (j6 == this.S1) {
                    T0(iihVar, i);
                } else {
                    abu abuVar2 = this.Z1;
                    if (abuVar2 != null) {
                        abuVar2.b(j5, j6, dscVar, this.I);
                    }
                    P0(iihVar, i, j6);
                }
                V0(j7);
                this.S1 = j6;
                return true;
            }
            if (a == 2) {
                Trace.beginSection("dropVideoBuffer");
                iihVar.k(i);
                Trace.endSection();
                U0(0, 1);
                V0(mgrVar.a);
                return true;
            }
            if (a == 3) {
                T0(iihVar, i);
                V0(mgrVar.a);
                return true;
            }
            if (a != 4 && a != 5) {
                xq0.q(String.valueOf(a));
                return false;
            }
        } else {
            if (z && !z2) {
                T0(iihVar, i);
                return true;
            }
            vq1.A(false);
            int i6 = ((y7l) m78Var.e).n;
            if (i6 != -1 && i6 == 0) {
                vq1.B(null);
                throw null;
            }
        }
        return false;
    }

    @Override // defpackage.ho7
    public final void t0() {
        m78 m78Var = this.D1;
        if (m78Var != null) {
            m78Var.P();
        }
    }

    @Override // defpackage.ho7, defpackage.at2
    public final void u() {
        dxr dxrVar = this.t1;
        this.U1 = null;
        this.b2 = -9223372036854775807L;
        m78 m78Var = this.D1;
        if (m78Var != null) {
            m78Var.B();
        } else {
            this.w1.d(0);
        }
        O0();
        this.J1 = false;
        this.Y1 = null;
        try {
            super.u();
        } finally {
            dxrVar.a(this.h1);
            dxrVar.i(tcu.d);
        }
    }

    @Override // defpackage.ho7
    public final void u0() {
        super.u0();
        this.z1.clear();
        this.d2 = false;
        this.P1 = 0;
    }

    @Override // defpackage.at2
    public final void v(boolean z, boolean z2) {
        this.h1 = new ig7();
        gxn gxnVar = this.d;
        gxnVar.getClass();
        boolean z3 = gxnVar.b;
        vq1.A((z3 && this.X1 == 0) ? false : true);
        if (this.W1 != z3) {
            this.W1 = z3;
            s0();
        }
        ig7 ig7Var = this.h1;
        dxr dxrVar = this.t1;
        Handler handler = (Handler) dxrVar.a;
        if (handler != null) {
            handler.post(new acu(dxrVar, ig7Var, 0));
        }
        boolean z4 = this.E1;
        dbu dbuVar = this.w1;
        if (!z4) {
            if (this.F1 != null && this.D1 == null) {
                d18 d18Var = new d18(this.r1, dbuVar);
                dzr dzrVar = this.g;
                dzrVar.getClass();
                d18Var.h = dzrVar;
                y7l d = d18Var.d();
                d.n = 1;
                SparseArray sparseArray = d.d;
                vq1.A(!dvt.k(sparseArray, 0));
                m78 m78Var = new m78(d, d.a);
                d.h.add(m78Var);
                sparseArray.put(0, m78Var);
                this.D1 = m78Var;
            }
            this.E1 = true;
        }
        m78 m78Var2 = this.D1;
        if (m78Var2 == null) {
            dzr dzrVar2 = this.g;
            dzrVar2.getClass();
            dbuVar.l = dzrVar2;
            dbuVar.e = z2 ? 1 : 0;
            return;
        }
        m78Var2.d = e48.a;
        abu abuVar = this.Z1;
        if (abuVar != null) {
            m78Var2.O(abuVar);
        }
        if (this.G1 != null && !this.H1.equals(kmq.c)) {
            this.D1.K(this.G1, this.H1);
        }
        this.D1.J(this.L1);
        this.D1.L(this.Z);
        List list = this.F1;
        if (list != null) {
            this.D1.N(list);
        }
        this.D1.C(z2);
        if (this.C0 != null) {
            this.D1.getClass();
        }
    }

    @Override // defpackage.ho7, defpackage.at2
    public final void w(long j, boolean z) {
        m78 m78Var = this.D1;
        if (m78Var != null) {
            if (!z) {
                m78Var.q(true);
            }
            this.D1.M(this.i1.b, -this.a2);
            this.c2 = true;
        }
        super.w(j, z);
        m78 m78Var2 = this.D1;
        dbu dbuVar = this.w1;
        if (m78Var2 == null) {
            dbuVar.h();
        }
        if (z) {
            m78 m78Var3 = this.D1;
            if (m78Var3 != null) {
                m78Var3.u(false);
            } else {
                dbuVar.c(false);
            }
        }
        O0();
        this.O1 = 0;
    }

    @Override // defpackage.at2
    public final void x() {
        m78 m78Var = this.D1;
        if (m78Var == null || !this.s1) {
            return;
        }
        m78Var.I();
    }

    @Override // defpackage.ho7
    public final boolean y0(qg7 qg7Var) {
        if (!l() && !qg7Var.f(SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING)) {
            long j = this.b2;
            if (j != -9223372036854775807L && j - (qg7Var.k - this.i1.c) > 100000 && !qg7Var.f(1073741824)) {
                boolean z = qg7Var.k < this.l;
                if ((z || this.d2) && !qg7Var.f(268435456) && qg7Var.f(67108864)) {
                    qg7Var.z();
                    if (z) {
                        this.h1.d++;
                        return true;
                    }
                    if (this.d2) {
                        this.z1.add(Long.valueOf(qg7Var.k));
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.at2
    public void z() {
        try {
            try {
                N();
                s0();
            } finally {
                zqa.w(this.v, null);
                this.v = null;
            }
        } finally {
            this.E1 = false;
            this.a2 = -9223372036854775807L;
            usk uskVar = this.I1;
            if (uskVar != null) {
                uskVar.release();
                this.I1 = null;
            }
        }
    }
}
