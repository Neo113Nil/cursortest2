package com.squareup.cash.moneybot.views.message;

import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
import com.fillr.core.analytics.FillrAnalyticsServiceBuilder;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.views.markdown.MoneybotMarkdownKt;
import com.squareup.cash.profile.viewmodels.SponsoredFamilyMember;
import com.squareup.cash.profile.views.notifications.ChannelListViewKt;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class MoneybotMessageUiKt$$ExternalSyntheticLambda15 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ boolean f$3;

    public /* synthetic */ MoneybotMessageUiKt$$ExternalSyntheticLambda15(SimpleTextFieldController simpleTextFieldController, boolean z, boolean z2, FocusRequester focusRequester, int i) {
        this.$r8$classId = 3;
        this.f$1 = simpleTextFieldController;
        this.f$0 = z;
        this.f$3 = z2;
        this.f$2 = focusRequester;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        switch (i) {
            case 0:
                String str = (String) obj4;
                Function0 function0 = (Function0) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    gapComposer.skipToGroupEnd();
                } else if (this.f$0) {
                    gapComposer.startReplaceGroup(505355417);
                    LazyDslKt.MoneybotMessageStreamingText(0, gapComposer, str, function0);
                    gapComposer.end(false);
                } else if (this.f$3) {
                    gapComposer.startReplaceGroup(505532210);
                    TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.standard, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(505721682);
                    MoneybotMarkdownKt.MoneybotMarkdown(0, 1, gapComposer, null, str);
                    gapComposer.end(false);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                AfterpaySearchViewKt.AfterpayAppletHomeLoaded((AfterpayAppletHomeContentViewModel) obj4, (Function1) obj3, this.f$0, this.f$3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ChannelListViewKt.SponsoredAccountCellItem((Function1) obj4, (SponsoredFamilyMember) obj3, this.f$0, this.f$3, (Composer) obj, Updater.updateChangedFlags(3073));
                break;
            default:
                ((Integer) obj2).getClass();
                FillrAnalyticsServiceBuilder.EmailSection((SimpleTextFieldController) obj4, this.f$0, this.f$3, (FocusRequester) obj3, (Composer) obj, Updater.updateChangedFlags(24647));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MoneybotMessageUiKt$$ExternalSyntheticLambda15(Object obj, Object obj2, boolean z, boolean z2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$0 = z;
        this.f$3 = z2;
    }

    public /* synthetic */ MoneybotMessageUiKt$$ExternalSyntheticLambda15(boolean z, String str, Function0 function0, boolean z2) {
        this.$r8$classId = 0;
        this.f$0 = z;
        this.f$1 = str;
        this.f$2 = function0;
        this.f$3 = z2;
    }
}
