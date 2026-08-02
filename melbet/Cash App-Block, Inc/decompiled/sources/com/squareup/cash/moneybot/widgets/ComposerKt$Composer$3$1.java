package com.squareup.cash.moneybot.widgets;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import coil3.size.SizeKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class ComposerKt$Composer$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String $restoreText;
    public final /* synthetic */ MutableState $textState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ComposerKt$Composer$3$1(String str, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$restoreText = str;
        this.$textState$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$textState$delegate;
        String str = this.$restoreText;
        switch (i) {
            case 0:
                return new ComposerKt$Composer$3$1(str, mutableState, continuation, 0);
            case 1:
                return new ComposerKt$Composer$3$1(str, mutableState, continuation, 1);
            default:
                return new ComposerKt$Composer$3$1(str, mutableState, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((ComposerKt$Composer$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$textState$delegate;
        String str = this.$restoreText;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (str != null && str.length() != 0) {
                    int length = str.length();
                    TextFieldValue textFieldValue = new TextFieldValue(str, SizeKt.TextRange(length, length), 4);
                    RoundedCornerShape roundedCornerShape = ComposerKt.ComposerShape;
                    mutableState.setValue(textFieldValue);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(str);
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (str != null && str.length() != 0) {
                    int length2 = str.length();
                    mutableState.setValue(new TextFieldValue(str, SizeKt.TextRange(length2, length2), 4));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
