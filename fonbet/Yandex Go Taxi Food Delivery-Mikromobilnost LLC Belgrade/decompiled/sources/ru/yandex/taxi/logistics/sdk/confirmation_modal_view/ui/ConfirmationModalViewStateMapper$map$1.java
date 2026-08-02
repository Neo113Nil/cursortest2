package ru.yandex.taxi.logistics.sdk.confirmation_modal_view.ui;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.logistics.sdk.confirmation_modal_view.ui.ConfirmationModalViewStateMapper", f = "ConfirmationModalViewStateMapper.kt", l = {16, 17, 18, 19}, m = PolicyMappingsExtension.MAP, v = 2)
/* loaded from: classes5.dex */
final class ConfirmationModalViewStateMapper$map$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmationModalViewStateMapper$map$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
