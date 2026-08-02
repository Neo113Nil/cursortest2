package ru.yandex.taxi.eatskit.internal;

import defpackage.ecn;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.eatskit.dto.ExternalServiceData;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class EatsEvent$Push$1 extends FunctionReferenceImpl implements wls {
    public static final EatsEvent$Push$1 b = new EatsEvent$Push$1(2, 0, ecn.class, "openPush", "openPush(Lru/yandex/taxi/eatskit/dto/ExternalServiceData;)V");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((ecn) obj).g("openPush", (ExternalServiceData) obj2);
        return zy11.a;
    }
}
