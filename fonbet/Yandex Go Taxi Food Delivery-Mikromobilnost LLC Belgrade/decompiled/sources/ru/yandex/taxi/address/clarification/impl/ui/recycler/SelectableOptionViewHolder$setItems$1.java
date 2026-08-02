package ru.yandex.taxi.address.clarification.impl.ui.recycler;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.address.clarification.impl.ui.recycler.SelectableOptionViewHolder", f = "SelectableOptionViewHolder.kt", l = {Constants.VPN_TRAFFIC, 122, HProv.PP_VERSION_TIMESTAMP, 128}, m = "setItems", v = 2)
/* loaded from: classes5.dex */
final class SelectableOptionViewHolder$setItems$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectableOptionViewHolder$setItems$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.c0(this.this$0, null, this);
    }
}
