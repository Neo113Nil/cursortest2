package com.squareup.cash.moneybot.views.message;

import androidx.compose.ui.platform.AndroidClipboard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class UserMessageUiKt$$ExternalSyntheticLambda5 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CoroutineScope f$0;
    public final /* synthetic */ AndroidClipboard f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ UserMessageUiKt$$ExternalSyntheticLambda5(CoroutineScope coroutineScope, AndroidClipboard androidClipboard, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = coroutineScope;
        this.f$1 = androidClipboard;
        this.f$2 = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        String str = this.f$2;
        AndroidClipboard androidClipboard = this.f$1;
        CoroutineScope coroutineScope = this.f$0;
        switch (i) {
            case 0:
                JobKt.launch$default(coroutineScope, null, null, new UserMessageUiKt$copyToClipboard$1(androidClipboard, str, null, 0), 3);
                return Unit.INSTANCE;
            default:
                JobKt.launch$default(coroutineScope, null, null, new UserMessageUiKt$copyToClipboard$1(androidClipboard, str, null, 0), 3);
                return Boolean.TRUE;
        }
    }
}
