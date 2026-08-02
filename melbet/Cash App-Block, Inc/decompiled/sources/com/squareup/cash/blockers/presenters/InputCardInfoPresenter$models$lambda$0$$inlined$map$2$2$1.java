package com.squareup.cash.blockers.presenters;

import com.squareup.cash.blockers.views.PasscodeViewKt$Passcode$3$1$1$1$2;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class InputCardInfoPresenter$models$lambda$0$$inlined$map$2$2$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PasscodeViewKt$Passcode$3$1$1$1$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputCardInfoPresenter$models$lambda$0$$inlined$map$2$2$1(PasscodeViewKt$Passcode$3$1$1$1$2 passcodeViewKt$Passcode$3$1$1$1$2, Continuation continuation) {
        super(continuation);
        this.this$0 = passcodeViewKt$Passcode$3$1$1$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
