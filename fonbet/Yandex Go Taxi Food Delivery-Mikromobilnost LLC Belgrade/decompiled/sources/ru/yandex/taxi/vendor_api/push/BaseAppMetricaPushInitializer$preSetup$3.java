package ru.yandex.taxi.vendor_api.push;

import androidx.core.app.v;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class BaseAppMetricaPushInitializer$preSetup$3 extends FunctionReferenceImpl implements wls {
    public static final BaseAppMetricaPushInitializer$preSetup$3 b = new BaseAppMetricaPushInitializer$preSetup$3(2, 0, v.class, "setSmallIcon", "setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        v vVar = (v) obj;
        vVar.K.icon = ((Number) obj2).intValue();
        return vVar;
    }
}
