package com.squareup.cash.moneybot.views.chat;

import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.glance.action.ActionParametersKt;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_genai_prompt.zzie;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.bitcoin.views.applet.education.BitcoinStoriesWidgetViewKt;
import com.squareup.cash.moneybot.views.home.MoneybotHomeViewKt;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda8;
import com.squareup.cash.qrcodes.views.CameraXPreviewKt;
import com.squareup.cash.shopping.settings.views.ErrorDialogKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneybotChatViewKt$$ExternalSyntheticLambda24 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ MoneybotChatViewKt$$ExternalSyntheticLambda24(Modifier modifier, Function1 function1) {
        this.$r8$classId = 4;
        this.f$0 = modifier;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        Modifier modifier = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                Transformations.OverflowMenuAction(Updater.updateChangedFlags(7), composer, modifier, function1);
                break;
            case 1:
                num.getClass();
                BitcoinStoriesWidgetViewKt.ErrorContent(Updater.updateChangedFlags(7), composer, modifier, function1);
                break;
            case 2:
                num.getClass();
                zzie.StoryOverlay(Updater.updateChangedFlags(1), composer, modifier, function1);
                break;
            case 3:
                num.getClass();
                MoneybotHomeViewKt.ChatInputWithOverlay(Updater.updateChangedFlags(7), composer, modifier, function1);
                break;
            case 4:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(modifier, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new OpenSourceKt$$ExternalSyntheticLambda8(19);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    ModalKt.SegmentedControl(1, this.f$1, m300paddingVpY3zN4$default, (Function1) rememberedValue, gapComposer, 3072, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 5:
                num.getClass();
                CameraXPreviewKt.ShareScanToggle(Updater.updateChangedFlags(391), composer, modifier, function1);
                break;
            case 6:
                num.getClass();
                ErrorDialogKt.AddNewAddress(Updater.updateChangedFlags(1), composer, modifier, function1);
                break;
            default:
                num.getClass();
                ActionParametersKt.NonEmptyCartWarningContent(Updater.updateChangedFlags(1), composer, modifier, function1);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MoneybotChatViewKt$$ExternalSyntheticLambda24(Modifier modifier, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = modifier;
        this.f$1 = function1;
    }

    public /* synthetic */ MoneybotChatViewKt$$ExternalSyntheticLambda24(Function1 function1, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = function1;
        this.f$0 = modifier;
    }
}
