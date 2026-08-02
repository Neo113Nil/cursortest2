package ru.yandex.taxi.experiments;

import defpackage.mvg;
import defpackage.vn11;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.experiments.PersistentExperimentsImpl", f = "PersistentExperimentsImpl.kt", l = {IDialogId.DIALOG_PIN_WND_IDD_PASSWORD}, m = "persistentExperimentValue", v = 2)
/* loaded from: classes9.dex */
final class PersistentExperimentsImpl$persistentExperimentValue$1<T extends vn11> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersistentExperimentsImpl$persistentExperimentValue$1(p pVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.l(null, this);
    }
}
