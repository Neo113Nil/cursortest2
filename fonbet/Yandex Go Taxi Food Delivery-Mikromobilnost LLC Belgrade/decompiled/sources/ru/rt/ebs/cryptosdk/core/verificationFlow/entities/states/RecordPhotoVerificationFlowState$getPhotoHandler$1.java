package ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.RecordPhotoVerificationFlowState", f = "RecordPhotoVerificationFlowState.kt", l = {40}, m = "getPhotoHandler")
/* loaded from: classes4.dex */
final class RecordPhotoVerificationFlowState$getPhotoHandler$1 extends ContinuationImpl {
    public h a;
    public /* synthetic */ Object b;
    public final /* synthetic */ h c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordPhotoVerificationFlowState$getPhotoHandler$1(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.m(this);
    }
}
