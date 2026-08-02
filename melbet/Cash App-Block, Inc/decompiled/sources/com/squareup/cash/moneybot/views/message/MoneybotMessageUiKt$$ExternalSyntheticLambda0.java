package com.squareup.cash.moneybot.views.message;

import androidx.compose.ui.platform.AndroidClipboard;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneybotMessageUiKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ CoroutineScope f$1;
    public final /* synthetic */ Function1 f$2;
    public final /* synthetic */ String f$3;
    public final /* synthetic */ AndroidClipboard f$4;

    public /* synthetic */ MoneybotMessageUiKt$$ExternalSyntheticLambda0(String str, CoroutineScope coroutineScope, Function1 function1, String str2, AndroidClipboard androidClipboard) {
        this.f$0 = str;
        this.f$1 = coroutineScope;
        this.f$2 = function1;
        this.f$3 = str2;
        this.f$4 = androidClipboard;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        String str = this.f$3;
        AndroidClipboard androidClipboard = this.f$4;
        String str2 = this.f$0;
        Function1 function1 = this.f$2;
        CoroutineScope coroutineScope = this.f$1;
        switch (i) {
            case 0:
                if (str2 != null) {
                    JobKt.launch$default(coroutineScope, null, null, new UserMessageUiKt$copyToClipboard$1(androidClipboard, str2, null, 2), 3);
                    function1.invoke(new MoneybotChatViewEvent.QuickActionTap(str, MoneybotChatViewEvent.QuickActionTap.QuickActionType.COPY));
                }
                break;
            default:
                JobKt.launch$default(coroutineScope, null, null, new UserMessageUiKt$copyToClipboard$1(androidClipboard, str, null, 1), 3);
                function1.invoke(new MoneybotChatViewEvent.QuickActionTap(str2, MoneybotChatViewEvent.QuickActionTap.QuickActionType.COPY));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MoneybotMessageUiKt$$ExternalSyntheticLambda0(CoroutineScope coroutineScope, Function1 function1, String str, AndroidClipboard androidClipboard, String str2) {
        this.f$1 = coroutineScope;
        this.f$2 = function1;
        this.f$0 = str;
        this.f$4 = androidClipboard;
        this.f$3 = str2;
    }
}
