package com.squareup.cash.moneybot.widgets;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import app.cash.local.views.cart.LocalBrandLocationCartViewKt;
import com.squareup.cash.support.chat.views.transcript.message.ActionBodyViewKt;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class FloatingChatInputKt$$ExternalSyntheticLambda8 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ FloatingChatInputKt$$ExternalSyntheticLambda8(int i, Function0 function0, int i2) {
        this.$r8$classId = 1;
        this.f$2 = i;
        this.f$1 = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$2;
        Function0 function0 = this.f$1;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                UtilsKt.AttachmentButton(function0, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                num.getClass();
                LocalBrandLocationCartViewKt.OpenTabEmptyStateMessageItem(i2, Updater.updateChangedFlags(1), composer, function0);
                break;
            case 2:
                num.getClass();
                ActionBodyViewKt.FailedToLoadContent(Updater.updateChangedFlags(1), i2, composer, function0);
                break;
            default:
                num.intValue();
                ListItemKt.InstitutionUnknownErrorContent(function0, composer, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ FloatingChatInputKt$$ExternalSyntheticLambda8(Function0 function0, int i, int i2) {
        this.$r8$classId = 2;
        this.f$1 = function0;
        this.f$2 = i2;
    }

    public /* synthetic */ FloatingChatInputKt$$ExternalSyntheticLambda8(Function0 function0, int i, int i2, byte b) {
        this.$r8$classId = i2;
        this.f$1 = function0;
        this.f$2 = i;
    }
}
