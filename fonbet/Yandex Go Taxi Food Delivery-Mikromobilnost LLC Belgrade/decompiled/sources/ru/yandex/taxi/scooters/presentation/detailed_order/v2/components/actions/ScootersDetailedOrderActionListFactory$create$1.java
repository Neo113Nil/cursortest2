package ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.ybsdk.widgets.common.BlendingGradientView;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.ScootersDetailedOrderActionListFactory", f = "ScootersDetailedOrderActionListFactory.kt", l = {105, 111, HProv.PP_INFO, 119, 120, HProv.PP_PASSWD_TERM, HProv.PP_VERSION_EX, 144, 151, 152, BlendingGradientView.BASE_ALPHA, ModuleDescriptor.MODULE_VERSION, MSException.ERROR_BUSY, 176, 183, 184, 185, 187, 202, 208, 215, 216, 217, 220}, m = "create-NKn0DPo", v = 2)
/* loaded from: classes6.dex */
final class ScootersDetailedOrderActionListFactory$create$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDetailedOrderActionListFactory$create$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(0, null, null, null, null, null, null, null, this);
    }
}
