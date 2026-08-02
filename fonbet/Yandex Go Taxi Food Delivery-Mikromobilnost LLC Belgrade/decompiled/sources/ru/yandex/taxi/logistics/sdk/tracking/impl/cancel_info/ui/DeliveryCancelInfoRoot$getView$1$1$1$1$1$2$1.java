package ru.yandex.taxi.logistics.sdk.tracking.impl.cancel_info.ui;

import com.yandex.delivery.mapper.model.CancelType;
import defpackage.htg;
import defpackage.sls;
import defpackage.vng;
import defpackage.wwf;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.k;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class DeliveryCancelInfoRoot$getView$1$1$1$1$1$2$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        b bVar = (b) this.receiver;
        htg htgVar = bVar.z;
        htgVar.getClass();
        if (vng.I() - htgVar.a >= 300) {
            CancelType cancelType = bVar.C;
            wwf wwfVar = bVar.y;
            if (cancelType != null) {
                ((k) wwfVar.b).invoke(cancelType);
            }
            wwfVar.close();
        }
        htgVar.a = vng.I();
        return zy11.a;
    }
}
