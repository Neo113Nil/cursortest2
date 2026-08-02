package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.horizontal_stack;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.horizontal_stack.HorizontalStackMapper", f = "HorizontalStackMapper.kt", l = {61, 72, HProv.ALG_SID_SHA3_256, HProv.ALG_SID_NO_HASH}, m = "mapHorizontalStackWidget", v = 2)
/* loaded from: classes5.dex */
final class HorizontalStackMapper$mapHorizontalStackWidget$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalStackMapper$mapHorizontalStackWidget$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, false, null, null, this);
    }
}
