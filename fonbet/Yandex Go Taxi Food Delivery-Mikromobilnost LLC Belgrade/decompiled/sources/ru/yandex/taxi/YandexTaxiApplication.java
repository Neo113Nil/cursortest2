package ru.yandex.taxi;

import android.os.Looper;
import defpackage.i2t0;
import defpackage.lt2;
import defpackage.mz40;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.q2t0;
import defpackage.srt;
import defpackage.sy2;
import defpackage.trt;
import defpackage.ty2;
import defpackage.up11;
import defpackage.vk51;
import defpackage.wm51;
import kotlin.Metadata;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/YandexTaxiApplication;", "Lru/yandex/taxi/BaseTaxiApplication;", "<init>", "()V", "Llt2;", "createAppDelegateFactory", "()Llt2;", TariffOrderFlow.ORDER_FLOW_TAXI_KEY}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public class YandexTaxiApplication extends BaseTaxiApplication {
    public YandexTaxiApplication() {
        mz40 C;
        int[] iArr = up11.a;
        up11.d = new wm51();
        oz40 oz40Var = sy2.a;
        Looper myLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        srt srtVar = srt.a;
        if (myLooper == mainLooper) {
            oz40Var.setValue(srtVar);
        } else {
            i2t0 j = q2t0.j();
            mz40 mz40Var = j instanceof mz40 ? (mz40) j : null;
            if (mz40Var == null || (C = mz40Var.C(null, null)) == null) {
                ny61.r("Cannot create a mutable snapshot of an read-only snapshot");
                throw null;
            }
            try {
                i2t0 j2 = C.j();
                try {
                    oz40Var.setValue(srtVar);
                    C.w().g();
                } finally {
                    i2t0.q(j2);
                }
            } finally {
            }
        }
        ty2.a.setValue(trt.a);
    }

    @Override // ru.yandex.taxi.TaxiApplication
    public lt2 createAppDelegateFactory() {
        return vk51.a;
    }
}
