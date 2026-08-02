package defpackage;

import kotlin.coroutines.Continuation;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes12.dex */
public final class z8e implements gn50 {
    public final /* synthetic */ wg6 a;

    public z8e(wg6 wg6Var) {
        this.a = wg6Var;
    }

    @Override // defpackage.gn50
    /* renamed from: onPostFling-RZ2iAVY */
    public final Object mo28onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        this.a.c(k631.d(j), k631.d(j2));
        return new k631(j2);
    }

    @Override // defpackage.gn50
    /* renamed from: onPostScroll-DzOQY0M */
    public final long mo29onPostScrollDzOQY0M(long j, long j2, int i) {
        if (i != 1) {
            return 0L;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        wg6 wg6Var = this.a;
        wg6Var.j = intBitsToFloat;
        float b = wg6Var.b(intBitsToFloat2);
        return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(b) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }

    @Override // defpackage.gn50
    /* renamed from: onPreFling-QWom1Mo */
    public final Object mo33onPreFlingQWom1Mo(long j, Continuation continuation) {
        float d = k631.d(j);
        wg6 wg6Var = this.a;
        if (d >= 0.0f) {
            wg6Var.getClass();
        } else if (wg6Var.h.getFloatValue() > rfb1.c(wg6Var)) {
            wg6Var.c(0.0f, d);
            return new k631(j);
        }
        j = 0;
        return new k631(j);
    }

    @Override // defpackage.gn50
    /* renamed from: onPreScroll-OzD1aCk */
    public final long mo34onPreScrollOzD1aCk(long j, int i) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        if (intBitsToFloat >= 0.0f || i != 1) {
            return 0L;
        }
        float b = this.a.b(intBitsToFloat);
        return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(b) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }
}
