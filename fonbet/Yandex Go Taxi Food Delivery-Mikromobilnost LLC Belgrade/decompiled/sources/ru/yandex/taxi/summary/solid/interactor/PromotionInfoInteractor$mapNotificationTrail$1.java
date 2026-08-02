package ru.yandex.taxi.summary.solid.interactor;

import defpackage.lvj0;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.summary.solid.interactor.PromotionInfoInteractor", f = "PromotionInfoInteractor.kt", l = {298, 299, IDialogId.DIALOG_PIN_WND_IDD_PASSWORD, lvj0.NOT_MODIFIED}, m = "mapNotificationTrail", v = 2)
/* loaded from: classes6.dex */
final class PromotionInfoInteractor$mapNotificationTrail$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionInfoInteractor$mapNotificationTrail$1(p pVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return p.a(this.this$0, null, false, this);
    }
}
