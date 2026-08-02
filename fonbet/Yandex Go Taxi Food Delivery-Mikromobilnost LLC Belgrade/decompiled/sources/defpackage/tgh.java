package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.pager.d;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class tgh implements gn50 {
    public final d a;
    public final Orientation b;

    public tgh(d dVar, Orientation orientation) {
        this.a = dVar;
        this.b = orientation;
    }

    @Override // defpackage.gn50
    /* renamed from: onPostFling-RZ2iAVY */
    public final Object mo28onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        return new k631(this.b == Orientation.Vertical ? k631.b(0.0f, 0.0f, 2, j2) : k631.b(0.0f, 0.0f, 1, j2));
    }

    @Override // defpackage.gn50
    /* renamed from: onPostScroll-DzOQY0M */
    public final long mo29onPostScrollDzOQY0M(long j, long j2, int i) {
        if (i != 2) {
            return 0L;
        }
        if (Float.intBitsToFloat((int) (this.b == Orientation.Horizontal ? j2 >> 32 : _Gost_CryptoPro_PrivateKeyValues.maxDWORD & j2)) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // defpackage.gn50
    /* renamed from: onPreScroll-OzD1aCk */
    public final long mo34onPreScrollOzD1aCk(long j, int i) {
        if (i != 1) {
            return 0L;
        }
        d dVar = this.a;
        if (Math.abs(dVar.l()) <= 1.0E-6d) {
            return 0L;
        }
        Orientation orientation = Orientation.Horizontal;
        Orientation orientation2 = this.b;
        if (Math.abs(Float.intBitsToFloat((int) (orientation2 == orientation ? j >> 32 : j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) <= 0.0f) {
            return 0L;
        }
        s890 n = dVar.n();
        float l = dVar.l() * dVar.p();
        float f = ((n.b + n.c) * (-Math.signum(dVar.l()))) + l;
        if (dVar.l() > 0.0f) {
            l = f;
            f = l;
        }
        float f2 = -dVar.k.c(-y6i0.c(Float.intBitsToFloat((int) (orientation2 == orientation ? j >> 32 : j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), l, f));
        float intBitsToFloat = orientation2 == orientation ? f2 : Float.intBitsToFloat((int) (j >> 32));
        if (orientation2 != Orientation.Vertical) {
            f2 = Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        }
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(f2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }
}
