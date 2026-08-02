package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.live_location;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.live_location.LiveLocationStateHolder", f = "LiveLocationStateHolder.kt", l = {MSException.ERROR_INVALID_PARAMETER, HProv.ALG_SID_KECCAK_256, HProv.PP_DHOID}, m = "checkPermissionAndUpdateState", v = 2)
/* loaded from: classes5.dex */
final class LiveLocationStateHolder$checkPermissionAndUpdateState$1 extends ContinuationImpl {
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveLocationStateHolder$checkPermissionAndUpdateState$1(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return d.b(this.this$0, this);
    }
}
