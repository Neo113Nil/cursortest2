package com.squareup.cash.payments.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import app.cash.local.views.fulfillment.FulfillmentRadioCellKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacn;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.bitcoin.views.applet.sendreceive.BitcoinSendRestrictionViewKt;
import com.squareup.cash.payments.views.personalization.AlphaKt;
import com.squareup.cash.promotionsreferrals.views.PromotionsTitleBarKt;
import com.squareup.cash.support.chat.views.transcript.message.ActionBodyViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class ToViewKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Function0 f$2;

    public /* synthetic */ ToViewKt$$ExternalSyntheticLambda1(Modifier modifier, Function0 function0, String str, int i) {
        this.$r8$classId = 4;
        zzd zzdVar = Icons.Companion;
        this.f$0 = modifier;
        this.f$2 = function0;
        this.f$1 = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier modifier = this.f$0;
        Function0 function0 = this.f$2;
        String str = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                UtilKt.ToView(Updater.updateChangedFlags(1), (Composer) obj, modifier, str, function0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                FulfillmentRadioCellKt.ErrorState(Updater.updateChangedFlags(1), (Composer) obj, modifier, str, function0);
                break;
            case 2:
                ((Integer) obj2).getClass();
                BitcoinSendRestrictionViewKt.Button(Updater.updateChangedFlags(1), (Composer) obj, modifier, str, function0);
                break;
            case 3:
                ((Integer) obj2).getClass();
                zzacn.DisclaimerText(Updater.updateChangedFlags(1), (Composer) obj, modifier, str, function0);
                break;
            case 4:
                zzd zzdVar = Icons.Companion;
                ((Integer) obj2).getClass();
                AlphaKt.ActionButton(Updater.updateChangedFlags(385), (Composer) obj, modifier, str, function0);
                break;
            case 5:
                ((Integer) obj2).getClass();
                PromotionsTitleBarKt.PromotionsTitleBar(Updater.updateChangedFlags(1), (Composer) obj, modifier, str, function0);
                break;
            default:
                ((Integer) obj2).getClass();
                ActionBodyViewKt.SuggestedReplyButton(Updater.updateChangedFlags(385), (Composer) obj, modifier, str, function0);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ToViewKt$$ExternalSyntheticLambda1(Modifier modifier, String str, Function0 function0, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = modifier;
        this.f$1 = str;
        this.f$2 = function0;
    }

    public /* synthetic */ ToViewKt$$ExternalSyntheticLambda1(String str, Modifier modifier, Function0 function0, int i) {
        this.$r8$classId = 3;
        this.f$1 = str;
        this.f$0 = modifier;
        this.f$2 = function0;
    }

    public /* synthetic */ ToViewKt$$ExternalSyntheticLambda1(String str, Function0 function0, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = str;
        this.f$2 = function0;
        this.f$0 = modifier;
    }
}
