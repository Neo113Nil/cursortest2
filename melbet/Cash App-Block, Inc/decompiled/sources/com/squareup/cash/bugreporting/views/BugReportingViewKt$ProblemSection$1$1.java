package com.squareup.cash.bugreporting.views;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldState;
import coil3.size.SizeKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class BugReportingViewKt$ProblemSection$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ String $title;
    public final /* synthetic */ TextFieldState $titleTextFieldState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BugReportingViewKt$ProblemSection$1$1(TextFieldState textFieldState, String str, Continuation continuation) {
        super(2, continuation);
        this.$titleTextFieldState = textFieldState;
        this.$title = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        String str = this.$title;
        TextFieldState textFieldState = this.$titleTextFieldState;
        switch (i) {
            case 0:
                return new BugReportingViewKt$ProblemSection$1$1(str, textFieldState, continuation);
            default:
                return new BugReportingViewKt$ProblemSection$1$1(textFieldState, str, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((BugReportingViewKt$ProblemSection$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        String str = this.$title;
        TextFieldState textFieldState = this.$titleTextFieldState;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!str.equals(textFieldState.getValue$foundation().text.toString())) {
                    TextFieldBuffer startEdit = textFieldState.startEdit();
                    try {
                        startEdit.replace(0, startEdit.buffer.length(), str);
                        textFieldState.commitEdit(startEdit);
                    } finally {
                    }
                }
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!Intrinsics.areEqual(textFieldState.getValue$foundation().text.toString(), str)) {
                    TextFieldBuffer startEdit2 = textFieldState.startEdit();
                    try {
                        startEdit2.replace(0, startEdit2.buffer.length(), str);
                        int length = str.length();
                        startEdit2.m379setSelection5zctL8(SizeKt.TextRange(length, length));
                        textFieldState.commitEdit(startEdit2);
                    } finally {
                    }
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BugReportingViewKt$ProblemSection$1$1(String str, TextFieldState textFieldState, Continuation continuation) {
        super(2, continuation);
        this.$title = str;
        this.$titleTextFieldState = textFieldState;
    }
}
