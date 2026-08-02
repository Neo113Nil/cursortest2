package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class twj extends rjr {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(d7k d7kVar, byte[] bArr) {
        if (d7kVar.a() < bArr.length) {
            return false;
        }
        int i = d7kVar.b;
        byte[] bArr2 = new byte[bArr.length];
        d7kVar.f(bArr2, 0, bArr.length);
        d7kVar.H(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.rjr
    public final long b(d7k d7kVar) {
        byte[] bArr = d7kVar.a;
        return (this.i * u7g.M(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // defpackage.rjr
    public final boolean c(d7k d7kVar, long j, aqd aqdVar) {
        if (e(d7kVar, o)) {
            byte[] copyOf = Arrays.copyOf(d7kVar.a, d7kVar.c);
            int i = copyOf[9] & 255;
            ArrayList A = u7g.A(copyOf);
            if (((dsc) aqdVar.b) == null) {
                bsc bscVar = new bsc();
                bscVar.l = l5i.p("audio/ogg");
                bscVar.m = l5i.p("audio/opus");
                bscVar.C = i;
                bscVar.D = ScreenMirroringConfig.Audio.SAMPLING_RATE;
                bscVar.p = A;
                aqdVar.b = new dsc(bscVar);
                return true;
            }
        } else {
            if (!e(d7kVar, p)) {
                vq1.B((dsc) aqdVar.b);
                return false;
            }
            vq1.B((dsc) aqdVar.b);
            if (!this.n) {
                this.n = true;
                d7kVar.I(8);
                u2i h0 = szf.h0(yde.w(szf.n0(d7kVar, false, false).a));
                if (h0 != null) {
                    bsc a = ((dsc) aqdVar.b).a();
                    a.k = h0.b(((dsc) aqdVar.b).l);
                    aqdVar.b = new dsc(a);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // defpackage.rjr
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = false;
        }
    }
}
