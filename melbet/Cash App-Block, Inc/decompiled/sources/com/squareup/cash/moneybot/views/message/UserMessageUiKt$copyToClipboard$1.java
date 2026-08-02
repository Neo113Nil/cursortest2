package com.squareup.cash.moneybot.views.message;

import android.content.ClipData;
import androidx.compose.ui.platform.AndroidClipboard;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class UserMessageUiKt$copyToClipboard$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ AndroidClipboard $clipboard;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String $text;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserMessageUiKt$copyToClipboard$1(AndroidClipboard androidClipboard, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$clipboard = androidClipboard;
        this.$text = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new UserMessageUiKt$copyToClipboard$1(this.$clipboard, this.$text, continuation, 0);
            case 1:
                return new UserMessageUiKt$copyToClipboard$1(this.$clipboard, this.$text, continuation, 1);
            default:
                return new UserMessageUiKt$copyToClipboard$1(this.$clipboard, this.$text, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((UserMessageUiKt$copyToClipboard$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        String str = this.$text;
        AndroidClipboard androidClipboard = this.$clipboard;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ClipData newPlainText = ClipData.newPlainText(str, str);
                    newPlainText.getClass();
                    this.label = 1;
                    androidClipboard.androidClipboardManager.getClipboardManager().setPrimaryClip(newPlainText);
                    if (Unit.INSTANCE == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ClipData newPlainText2 = ClipData.newPlainText(str, str);
                    newPlainText2.getClass();
                    this.label = 1;
                    androidClipboard.androidClipboardManager.getClipboardManager().setPrimaryClip(newPlainText2);
                    if (Unit.INSTANCE == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ClipData newPlainText3 = ClipData.newPlainText(str, str);
                    newPlainText3.getClass();
                    this.label = 1;
                    androidClipboard.androidClipboardManager.getClipboardManager().setPrimaryClip(newPlainText3);
                    if (Unit.INSTANCE == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
