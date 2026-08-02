package ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.ui.smart_camera_entry_point.slime;

import androidx.compose.runtime.f;
import defpackage.id00;
import defpackage.ny61;
import defpackage.qls0;
import defpackage.qxi;
import defpackage.sb2;
import defpackage.sls;
import defpackage.tig0;
import defpackage.tx40;
import defpackage.ukr0;
import defpackage.y6i0;
import defpackage.yps0;
import defpackage.zeb1;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.ui.smart_camera_entry_point.slime.c;

/* loaded from: classes5.dex */
public final class c {
    public static final tig0 i = zeb1.c(new qls0(2), new ukr0(24));
    public yps0 a;
    public final androidx.compose.animation.core.a b = id00.a(0.0f);
    public final tx40 c;
    public float d;
    public float e;
    public final tx40 f;
    public final qxi g;
    public final qxi h;

    public c(float f) {
        tx40 f2 = f.f(f);
        this.c = f2;
        this.d = f;
        this.f = f2;
        final int i2 = 0;
        this.g = f.d(new sls(this) { // from class: aqs0
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                c cVar = this.b;
                switch (i3) {
                    case 0:
                        return new z5w(m810.b(cVar.f.getFloatValue() - cVar.a.a.b) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                    default:
                        float c = 1.0f - (cVar.c() / 0.2f);
                        if (c < 0.0f) {
                            c = 0.0f;
                        }
                        return Float.valueOf(c);
                }
            }
        });
        final int i3 = 1;
        this.h = f.d(new sls(this) { // from class: aqs0
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i32 = i3;
                c cVar = this.b;
                switch (i32) {
                    case 0:
                        return new z5w(m810.b(cVar.f.getFloatValue() - cVar.a.a.b) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                    default:
                        float c = 1.0f - (cVar.c() / 0.2f);
                        if (c < 0.0f) {
                            c = 0.0f;
                        }
                        return Float.valueOf(c);
                }
            }
        });
    }

    public final Object a(float f, ContinuationImpl continuationImpl) {
        Object d = androidx.compose.animation.core.a.d(this.b, new Float(f), sb2.G(0.5f, 0.0f, 6, null), null, null, continuationImpl, 12);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, long j2, ContinuationImpl continuationImpl) {
        SlimeState$drag$1 slimeState$drag$1;
        int i2;
        if (continuationImpl instanceof SlimeState$drag$1) {
            slimeState$drag$1 = (SlimeState$drag$1) continuationImpl;
            int i3 = slimeState$drag$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                slimeState$drag$1.label = i3 - Integer.MIN_VALUE;
                Object obj = slimeState$drag$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = slimeState$drag$1.label;
                zy11 zy11Var = zy11.a;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    yps0 yps0Var = this.a;
                    float f = yps0Var.b - yps0Var.d;
                    if (f <= 0.0f) {
                        return zy11Var;
                    }
                    float c = y6i0.c(Float.intBitsToFloat((int) (j2 >> 32)) / f, 0.0f, 1.0f);
                    Float f2 = new Float(c);
                    slimeState$drag$1.J$0 = j;
                    slimeState$drag$1.J$1 = j2;
                    slimeState$drag$1.F$0 = f;
                    slimeState$drag$1.F$1 = c;
                    slimeState$drag$1.label = 1;
                    if (this.b.f(f2, slimeState$drag$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = slimeState$drag$1.J$0;
                    kotlin.b.b(obj);
                }
                this.c.setFloatValue(y6i0.c(this.d + (Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - this.e), ((Number) this.a.f.getValue()).floatValue(), ((Number) this.a.g.getValue()).floatValue()));
                return zy11Var;
            }
        }
        slimeState$drag$1 = new SlimeState$drag$1(this, continuationImpl);
        Object obj2 = slimeState$drag$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = slimeState$drag$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i2 != 0) {
        }
        this.c.setFloatValue(y6i0.c(this.d + (Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - this.e), ((Number) this.a.f.getValue()).floatValue(), ((Number) this.a.g.getValue()).floatValue()));
        return zy11Var2;
    }

    public final float c() {
        return ((Number) this.b.e()).floatValue();
    }
}
