package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class jih extends qih implements fih {
    public final Context j1;
    public final xiu k1;
    public final gk7 l1;
    public final uzg m1;
    public int n1;
    public boolean o1;
    public boolean p1;
    public dsc q1;
    public dsc r1;
    public long s1;
    public boolean t1;
    public boolean u1;
    public boolean v1;
    public int w1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jih(Context context, gih gihVar, rih rihVar, boolean z, Handler handler, fy1 fy1Var, gk7 gk7Var) {
        super(1, gihVar, rihVar, z, 44100.0f);
        uzg uzgVar = dvt.a >= 35 ? new uzg() : null;
        this.j1 = context.getApplicationContext();
        this.l1 = gk7Var;
        this.m1 = uzgVar;
        this.w1 = -1000;
        this.k1 = new xiu(handler, fy1Var);
        gk7Var.r = new qec(13, this);
    }

    @Override // defpackage.at2
    public final void A() {
        this.l1.v();
    }

    @Override // defpackage.qih
    public final int A0(rih rihVar, dsc dscVar) {
        int i;
        mih i2;
        boolean z;
        boolean z2 = true;
        int e = at2.e(1, 0, 0, 0);
        String str = dscVar.n;
        String str2 = dscVar.n;
        if (!l5i.k(str)) {
            return at2.e(0, 0, 0, 0);
        }
        int i3 = dscVar.M;
        boolean z3 = i3 != 0;
        boolean z4 = i3 == 0 || i3 == 2;
        int i4 = 8;
        gk7 gk7Var = this.l1;
        if (!z4 || (z3 && zjh.i() == null)) {
            i = 0;
        } else {
            i = E0(dscVar);
            if (gk7Var.L(dscVar)) {
                return at2.e(4, 8, 32, i);
            }
        }
        if ((!"audio/raw".equals(str2) || gk7Var.L(dscVar)) && gk7Var.L(dvt.J(2, dscVar.D, dscVar.E))) {
            qsn g = str2 == null ? qsn.e : (!gk7Var.L(dscVar) || (i2 = zjh.i()) == null) ? zjh.g(rihVar, dscVar, false, false) : yde.y(i2);
            if (!g.isEmpty()) {
                if (!z4) {
                    return at2.e(2, 0, 0, 0);
                }
                mih mihVar = (mih) g.get(0);
                boolean e2 = mihVar.e(dscVar);
                if (!e2) {
                    for (int i5 = 1; i5 < g.d; i5++) {
                        mih mihVar2 = (mih) g.get(i5);
                        if (mihVar2.e(dscVar)) {
                            z = false;
                            mihVar = mihVar2;
                            break;
                        }
                    }
                }
                z = true;
                z2 = e2;
                int i6 = z2 ? 4 : 3;
                if (z2 && mihVar.g(dscVar)) {
                    i4 = 16;
                }
                return at2.f(i6, i4, 32, mihVar.h ? 64 : 0, z ? 128 : 0, i);
            }
        }
        return e;
    }

    @Override // defpackage.at2
    public final void B() {
        G0();
        this.l1.u();
    }

    public final int E0(dsc dscVar) {
        ix1 j = this.l1.j(dscVar);
        if (!j.a) {
            return 0;
        }
        int i = j.b ? 1536 : RemoteCameraConfig.Mic.BUFFER_SIZE;
        return j.c ? i | 2048 : i;
    }

    public final int F0(mih mihVar, dsc dscVar) {
        int i;
        if (!"OMX.google.raw.decoder".equals(mihVar.a) || (i = dvt.a) >= 24 || (i == 23 && dvt.W(this.j1))) {
            return dscVar.o;
        }
        return -1;
    }

    public final void G0() {
        n();
        long i = this.l1.i();
        if (i != Long.MIN_VALUE) {
            if (!this.t1) {
                i = Math.max(this.s1, i);
            }
            this.s1 = i;
            this.t1 = false;
        }
    }

    @Override // defpackage.qih
    public final tg7 L(mih mihVar, dsc dscVar, dsc dscVar2) {
        tg7 b = mihVar.b(dscVar, dscVar2);
        int i = b.e;
        if (this.F == null && z0(dscVar2)) {
            i |= SQLiteDatabase.OPEN_NOMUTEX;
        }
        if (F0(mihVar, dscVar2) > this.n1) {
            i |= 64;
        }
        int i2 = i;
        return new tg7(mihVar.a, dscVar, dscVar2, i2 != 0 ? 0 : b.d, i2);
    }

    @Override // defpackage.qih
    public final float W(float f, dsc[] dscVarArr) {
        int i = -1;
        for (dsc dscVar : dscVarArr) {
            int i2 = dscVar.E;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // defpackage.qih
    public final ArrayList X(rih rihVar, dsc dscVar, boolean z) {
        mih i;
        return zjh.h(dscVar, dscVar.n == null ? qsn.e : (!this.l1.L(dscVar) || (i = zjh.i()) == null) ? zjh.g(rihVar, dscVar, z, false) : yde.y(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d4, code lost:
    
        if ("AXON 7 mini".equals(r6) == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0113  */
    @Override // defpackage.qih
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final rdk Y(mih mihVar, dsc dscVar, MediaCrypto mediaCrypto, float f) {
        boolean z;
        MediaFormat mediaFormat;
        dsc[] dscVarArr = this.j;
        dscVarArr.getClass();
        int F0 = F0(mihVar, dscVar);
        String str = mihVar.a;
        if (dscVarArr.length != 1) {
            for (dsc dscVar2 : dscVarArr) {
                if (mihVar.b(dscVar, dscVar2).d != 0) {
                    F0 = Math.max(F0, F0(mihVar, dscVar2));
                }
            }
        }
        this.n1 = F0;
        int i = dvt.a;
        if (i < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(Build.MANUFACTURER)) {
            String str2 = Build.DEVICE;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z = true;
                this.o1 = z;
                this.p1 = !str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
                String str3 = mihVar.c;
                int i2 = this.n1;
                mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", str3);
                int i3 = dscVar.D;
                String str4 = dscVar.n;
                mediaFormat.setInteger("channel-count", i3);
                int i4 = dscVar.E;
                mediaFormat.setInteger("sample-rate", i4);
                y1g.a0(mediaFormat, dscVar.q);
                y1g.O(mediaFormat, "max-input-size", i2);
                if (i >= 23) {
                    mediaFormat.setInteger("priority", 0);
                    if (f != -1.0f) {
                        if (i == 23) {
                            String str5 = Build.MODEL;
                            if (!"ZTE B2017G".equals(str5)) {
                            }
                        }
                        mediaFormat.setFloat("operating-rate", f);
                    }
                }
                if (i <= 28 && "audio/ac4".equals(str4)) {
                    mediaFormat.setInteger("ac4-is-sync", 1);
                }
                if (i >= 24) {
                    if (this.l1.k(dvt.J(4, dscVar.D, i4)) == 2) {
                        mediaFormat.setInteger("pcm-encoding", 4);
                    }
                }
                if (i >= 32) {
                    mediaFormat.setInteger("max-output-channel-count", 99);
                }
                if (i >= 35) {
                    mediaFormat.setInteger("importance", Math.max(0, -this.w1));
                }
                this.r1 = ("audio/raw".equals(mihVar.b) || "audio/raw".equals(str4)) ? null : dscVar;
                return new rdk(mihVar, mediaFormat, dscVar, null, mediaCrypto, this.m1, 13);
            }
        }
        z = false;
        this.o1 = z;
        this.p1 = !str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str32 = mihVar.c;
        int i22 = this.n1;
        mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str32);
        int i32 = dscVar.D;
        String str42 = dscVar.n;
        mediaFormat.setInteger("channel-count", i32);
        int i42 = dscVar.E;
        mediaFormat.setInteger("sample-rate", i42);
        y1g.a0(mediaFormat, dscVar.q);
        y1g.O(mediaFormat, "max-input-size", i22);
        if (i >= 23) {
        }
        if (i <= 28) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i >= 24) {
        }
        if (i >= 32) {
        }
        if (i >= 35) {
        }
        this.r1 = ("audio/raw".equals(mihVar.b) || "audio/raw".equals(str42)) ? null : dscVar;
        return new rdk(mihVar, mediaFormat, dscVar, null, mediaCrypto, this.m1, 13);
    }

    @Override // defpackage.qih
    public final void Z(qg7 qg7Var) {
        dsc dscVar;
        if (dvt.a < 29 || (dscVar = qg7Var.g) == null || !Objects.equals(dscVar.n, "audio/opus") || !this.N0) {
            return;
        }
        ByteBuffer byteBuffer = qg7Var.l;
        byteBuffer.getClass();
        dsc dscVar2 = qg7Var.g;
        dscVar2.getClass();
        int i = dscVar2.G;
        if (byteBuffer.remaining() == 8) {
            this.l1.F(i, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // defpackage.at2, defpackage.ogl
    public final void a(int i, Object obj) {
        uzg uzgVar;
        gk7 gk7Var = this.l1;
        if (i == 2) {
            obj.getClass();
            float floatValue = ((Float) obj).floatValue();
            if (gk7Var.O != floatValue) {
                gk7Var.O = floatValue;
                if (gk7Var.q()) {
                    gk7Var.v.setVolume(gk7Var.O);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            dv1 dv1Var = (dv1) obj;
            dv1Var.getClass();
            gk7Var.B(dv1Var);
            return;
        }
        if (i == 6) {
            ag2 ag2Var = (ag2) obj;
            ag2Var.getClass();
            gk7Var.E(ag2Var);
            return;
        }
        if (i == 12) {
            if (dvt.a >= 23) {
                gk7Var.J((AudioDeviceInfo) obj);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.w1 = ((Integer) obj).intValue();
            iih iihVar = this.L;
            if (iihVar != null && dvt.a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.w1));
                iihVar.b(bundle);
                return;
            }
            return;
        }
        if (i == 9) {
            obj.getClass();
            gk7Var.K(((Boolean) obj).booleanValue());
            return;
        }
        if (i != 10) {
            if (i == 11) {
                zrb zrbVar = (zrb) obj;
                zrbVar.getClass();
                this.G = zrbVar;
                return;
            }
            return;
        }
        obj.getClass();
        int intValue = ((Integer) obj).intValue();
        gk7Var.C(intValue);
        if (dvt.a < 35 || (uzgVar = this.m1) == null) {
            return;
        }
        uzgVar.d(intValue);
    }

    @Override // defpackage.qih
    public final void f0(Exception exc) {
        vq1.L("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.k1.h(exc);
    }

    @Override // defpackage.qih
    public final void g0(String str, rdk rdkVar, long j, long j2) {
        xiu xiuVar = this.k1;
        Handler handler = (Handler) xiuVar.b;
        if (handler != null) {
            handler.post(new yx1(xiuVar, str, j, j2, 0));
        }
    }

    @Override // defpackage.qih
    public final void h0(String str) {
        xiu xiuVar = this.k1;
        Handler handler = (Handler) xiuVar.b;
        if (handler != null) {
            handler.post(new qf0(4, xiuVar, str));
        }
    }

    @Override // defpackage.qih
    public final tg7 i0(qdc qdcVar) {
        dsc dscVar = (dsc) qdcVar.c;
        dscVar.getClass();
        this.q1 = dscVar;
        tg7 i0 = super.i0(qdcVar);
        this.k1.u(dscVar, i0);
        return i0;
    }

    @Override // defpackage.qih
    public final void j0(dsc dscVar, MediaFormat mediaFormat) {
        dsc dscVar2 = this.r1;
        int[] iArr = null;
        if (dscVar2 != null) {
            dscVar = dscVar2;
        } else if (this.L != null) {
            mediaFormat.getClass();
            String str = dscVar.n;
            int i = dscVar.D;
            int I = "audio/raw".equals(str) ? dscVar.F : (dvt.a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? dvt.I(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            bsc bscVar = new bsc();
            bscVar.m = l5i.p("audio/raw");
            bscVar.E = I;
            bscVar.F = dscVar.G;
            bscVar.G = dscVar.H;
            bscVar.k = dscVar.l;
            bscVar.a = dscVar.a;
            bscVar.b = dscVar.b;
            bscVar.c = yde.v(dscVar.c);
            bscVar.d = dscVar.d;
            bscVar.e = dscVar.e;
            bscVar.f = dscVar.f;
            bscVar.C = mediaFormat.getInteger("channel-count");
            bscVar.D = mediaFormat.getInteger("sample-rate");
            dscVar = new dsc(bscVar);
            boolean z = this.o1;
            int i2 = dscVar.D;
            if (z && i2 == 6 && i < 6) {
                iArr = new int[i];
                for (int i3 = 0; i3 < i; i3++) {
                    iArr[i3] = i3;
                }
            } else if (this.p1) {
                iArr = szf.a0(i2);
            }
        }
        try {
            int i4 = dvt.a;
            gk7 gk7Var = this.l1;
            if (i4 >= 29) {
                if (this.N0) {
                    gxn gxnVar = this.d;
                    gxnVar.getClass();
                    if (gxnVar.a != 0) {
                        gxn gxnVar2 = this.d;
                        gxnVar2.getClass();
                        gk7Var.G(gxnVar2.a);
                    }
                }
                gk7Var.G(0);
            }
            gk7Var.d(dscVar, iArr);
        } catch (jy1 e) {
            throw h(e, e.a, false, 5001);
        }
    }

    @Override // defpackage.at2
    public final String k() {
        return "MediaCodecAudioRenderer";
    }

    @Override // defpackage.qih
    public final void k0() {
        this.l1.getClass();
    }

    @Override // defpackage.fih
    public final p0l m() {
        return this.l1.C;
    }

    @Override // defpackage.qih
    public final void m0() {
        this.l1.L = true;
    }

    @Override // defpackage.at2
    public final boolean n() {
        return this.a1 && this.l1.r();
    }

    @Override // defpackage.qih, defpackage.at2
    public final boolean p() {
        return this.l1.o() || super.p();
    }

    @Override // defpackage.qih
    public final boolean p0(long j, long j2, iih iihVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, dsc dscVar) {
        int i4;
        int i5;
        byteBuffer.getClass();
        if (this.r1 != null && (i2 & 2) != 0) {
            iihVar.getClass();
            iihVar.k(i);
            return true;
        }
        gk7 gk7Var = this.l1;
        if (z) {
            if (iihVar != null) {
                iihVar.k(i);
            }
            this.e1.f += i3;
            gk7Var.L = true;
            return true;
        }
        try {
            if (!gk7Var.n(byteBuffer, j3, i3)) {
                return false;
            }
            if (iihVar != null) {
                iihVar.k(i);
            }
            this.e1.e += i3;
            return true;
        } catch (ky1 e) {
            dsc dscVar2 = this.q1;
            if (this.N0) {
                gxn gxnVar = this.d;
                gxnVar.getClass();
                if (gxnVar.a != 0) {
                    i5 = 5004;
                    throw h(e, dscVar2, e.b, i5);
                }
            }
            i5 = 5001;
            throw h(e, dscVar2, e.b, i5);
        } catch (ny1 e2) {
            if (this.N0) {
                gxn gxnVar2 = this.d;
                gxnVar2.getClass();
                if (gxnVar2.a != 0) {
                    i4 = 5003;
                    throw h(e2, dscVar, e2.b, i4);
                }
            }
            i4 = ScreenMirroringConfig.Test.pcAudioUdpPort;
            throw h(e2, dscVar, e2.b, i4);
        }
    }

    @Override // defpackage.fih
    public final void r(p0l p0lVar) {
        this.l1.I(p0lVar);
    }

    @Override // defpackage.fih
    public final boolean s() {
        boolean z = this.v1;
        this.v1 = false;
        return z;
    }

    @Override // defpackage.qih
    public final void s0() {
        try {
            this.l1.x();
        } catch (ny1 e) {
            throw h(e, e.c, e.b, this.N0 ? 5003 : ScreenMirroringConfig.Test.pcAudioUdpPort);
        }
    }

    @Override // defpackage.fih
    public final long t() {
        if (this.h == 2) {
            G0();
        }
        return this.s1;
    }

    @Override // defpackage.qih, defpackage.at2
    public final void u() {
        xiu xiuVar = this.k1;
        this.u1 = true;
        this.q1 = null;
        try {
            this.l1.h();
            try {
                super.u();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.u();
                throw th;
            } finally {
            }
        }
    }

    @Override // defpackage.at2
    public final void v(boolean z, boolean z2) {
        ig7 ig7Var = new ig7();
        this.e1 = ig7Var;
        xiu xiuVar = this.k1;
        Handler handler = (Handler) xiuVar.b;
        if (handler != null) {
            handler.post(new xx1(xiuVar, ig7Var, 0));
        }
        gxn gxnVar = this.d;
        gxnVar.getClass();
        boolean z3 = gxnVar.b;
        gk7 gk7Var = this.l1;
        if (z3) {
            gk7Var.g();
        } else if (gk7Var.a0) {
            gk7Var.a0 = false;
            gk7Var.h();
        }
        ndl ndlVar = this.f;
        ndlVar.getClass();
        gk7Var.q = ndlVar;
        dzr dzrVar = this.g;
        dzrVar.getClass();
        gk7Var.g.I = dzrVar;
    }

    @Override // defpackage.qih, defpackage.at2
    public final void w(long j, boolean z) {
        super.w(j, z);
        this.l1.h();
        this.s1 = j;
        this.v1 = false;
        this.t1 = true;
    }

    @Override // defpackage.at2
    public final void x() {
        uzg uzgVar;
        this.l1.z();
        if (dvt.a < 35 || (uzgVar = this.m1) == null) {
            return;
        }
        uzgVar.b();
    }

    @Override // defpackage.at2
    public final void z() {
        gk7 gk7Var = this.l1;
        this.v1 = false;
        try {
            try {
                N();
                r0();
            } finally {
                zqa.w(this.F, null);
                this.F = null;
            }
        } finally {
            if (this.u1) {
                this.u1 = false;
                gk7Var.A();
            }
        }
    }

    @Override // defpackage.qih
    public final boolean z0(dsc dscVar) {
        gxn gxnVar = this.d;
        gxnVar.getClass();
        if (gxnVar.a != 0) {
            int E0 = E0(dscVar);
            if ((E0 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0) {
                gxn gxnVar2 = this.d;
                gxnVar2.getClass();
                if (gxnVar2.a == 2 || (E0 & 1024) != 0) {
                    return true;
                }
                if (dscVar.G == 0 && dscVar.H == 0) {
                    return true;
                }
            }
        }
        return this.l1.L(dscVar);
    }

    @Override // defpackage.at2
    public final fih j() {
        return this;
    }
}
