package com.squareup.cash.account.presenters.documents;

import com.squareup.cash.work.views.ScheduleCalendarKt$ScheduleCalendar$2$3$1$invokeSuspend$$inlined$map$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class AccountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$3$2$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ScheduleCalendarKt$ScheduleCalendar$2$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$3$2$1(ScheduleCalendarKt$ScheduleCalendar$2$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2 anonymousClass2, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
