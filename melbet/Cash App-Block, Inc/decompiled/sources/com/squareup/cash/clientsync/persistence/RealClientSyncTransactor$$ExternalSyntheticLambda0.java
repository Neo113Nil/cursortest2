package com.squareup.cash.clientsync.persistence;

import androidx.compose.ui.text.AnnotatedString;
import app.cash.sqldelight.TransactionWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes6.dex */
public final /* synthetic */ class RealClientSyncTransactor$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ Ref$ObjectRef f$1;

    public /* synthetic */ RealClientSyncTransactor$$ExternalSyntheticLambda0(Ref$ObjectRef ref$ObjectRef, Function1 function1) {
        this.$r8$classId = 2;
        this.f$1 = ref$ObjectRef;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        Ref$ObjectRef ref$ObjectRef = this.f$1;
        switch (i) {
            case 0:
                TransactionWrapper transactionWrapper = (TransactionWrapper) obj;
                transactionWrapper.getClass();
                try {
                    return function1.invoke(transactionWrapper);
                } finally {
                }
            case 1:
                TransactionWrapper transactionWrapper2 = (TransactionWrapper) obj;
                transactionWrapper2.getClass();
                try {
                    function1.invoke(transactionWrapper2);
                    return Unit.INSTANCE;
                } finally {
                }
            default:
                AnnotatedString.Range range = (AnnotatedString.Range) ref$ObjectRef.element;
                if (range != null) {
                    function1.invoke(Integer.valueOf(range.start));
                }
                ref$ObjectRef.element = null;
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ RealClientSyncTransactor$$ExternalSyntheticLambda0(Function1 function1, Ref$ObjectRef ref$ObjectRef, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = ref$ObjectRef;
    }
}
