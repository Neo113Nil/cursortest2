package com.squareup.cash.score.views;

import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import app.cash.directoryui.viewmodels.DirectoryViewEvent;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.contacts.components.SyncContactsRowKt;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.paychecks.viewmodels.EditDistributionViewEvent;
import com.squareup.cash.paychecks.viewmodels.MultipleAllocationViewEvent;
import com.squareup.cash.paymentpad.views.HomeViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.payments.viewmodels.NearbyPayRequestViewEvent;
import com.squareup.cash.phoneplans.PhonePlansHomeViewEvent;
import com.squareup.cash.phoneplans.PhonePlansHomeViewKt;
import com.squareup.cash.pools.viewmodels.PoolCreateViewEvent;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCardFAQViewEvent;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewEvent;
import com.squareup.cash.profile.views.TaxesPasswordViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewEvent;
import com.squareup.cash.shopping.views.search.ShopMessageKt;
import com.squareup.cash.support.chat.views.ChatExitPromptView;
import com.squareup.cash.support.chat.views.ChatExitPromptViewKt;
import com.squareup.cash.support.chat.views.survey.ChatSurveyKt;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class ScoreHomeKt$$ExternalSyntheticLambda8 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ ScoreHomeKt$$ExternalSyntheticLambda8(int i, int i2, Function1 function1) {
        this.$r8$classId = i2;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                ((String) obj2).getClass();
                function1.invoke(str);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj).getClass();
                function1.invoke(new EditDistributionViewEvent.DragWheel(((Float) obj2).floatValue()));
                return Unit.INSTANCE;
            case 2:
                function1.invoke(new MultipleAllocationViewEvent.DragWheel(((Float) obj2).floatValue(), ((Integer) obj).intValue()));
                return Unit.INSTANCE;
            case 3:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ModalKt.Modal(Modifier.Companion.$$INSTANCE, Room.stringResource(gapComposer, R.string.contact_sync_title), Room.stringResource(gapComposer, R.string.contact_sync_message), Expect_jvmKt.rememberComposableLambda(-1011152818, new MusicViewKt$$ExternalSyntheticLambda7(28, function1), gapComposer), Expect_jvmKt.rememberComposableLambda(-1404151763, new MusicViewKt$$ExternalSyntheticLambda7(29, function1), gapComposer), (Function3) null, gapComposer, 27648, 32);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new HomeViewKt$$ExternalSyntheticLambda8(24, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    SyncContactsRowKt.SyncContactsCard(0, 14, gapComposer2, null, null, null, (Function0) rememberedValue);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                String str2 = (String) obj;
                str2.getClass();
                ((String) obj2).getClass();
                function1.invoke(str2);
                return Unit.INSTANCE;
            case 6:
                ((String) obj).getClass();
                ((String) obj2).getClass();
                function1.invoke(NearbyPayRequestViewEvent.OnViewAllPeopleClicked.INSTANCE);
                return Unit.INSTANCE;
            case 7:
                ((String) obj).getClass();
                ((String) obj2).getClass();
                function1.invoke(NearbyPayRequestViewEvent.OnHelpClicked.INSTANCE);
                return Unit.INSTANCE;
            case 8:
                ((String) obj).getClass();
                ((String) obj2).getClass();
                function1.invoke(PhonePlansHomeViewEvent.HeaderCtaClicked.INSTANCE);
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                PhonePlansHomeViewKt.PhonePlansHomeError(function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 10:
                ((String) obj).getClass();
                ((String) obj2).getClass();
                function1.invoke(PoolCreateViewEvent.TermsOfService.INSTANCE);
                return Unit.INSTANCE;
            case 11:
                String str3 = (String) obj;
                str3.getClass();
                ((String) obj2).getClass();
                function1.invoke(new PrepurchaseCardFAQViewEvent.UrlClicked(str3));
                return Unit.INSTANCE;
            case 12:
                String str4 = (String) obj;
                str4.getClass();
                ((String) obj2).getClass();
                function1.invoke(new PrepurchaseCashCardPlanningViewEvent.OpenLink(str4));
                return Unit.INSTANCE;
            case 13:
                String str5 = (String) obj;
                str5.getClass();
                ((String) obj2).getClass();
                function1.invoke(new PrepurchaseCashCardPlanningViewEvent.OpenLink(str5));
                return Unit.INSTANCE;
            case 14:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    ModalKt.Modal(Modifier.Companion.$$INSTANCE, Room.stringResource(gapComposer3, R.string.personal_info_confirmation_dialog_review_your_info), Room.stringResource(gapComposer3, R.string.personal_info_confirmation_dialog_message), Expect_jvmKt.rememberComposableLambda(-981652288, new TaxesPasswordViewKt$$ExternalSyntheticLambda4(7, function1), gapComposer3), Expect_jvmKt.rememberComposableLambda(1129039071, new TaxesPasswordViewKt$$ExternalSyntheticLambda4(8, function1), gapComposer3), (Function3) null, gapComposer3, 27648, 32);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                String str6 = (String) obj;
                str6.getClass();
                ((String) obj2).getClass();
                function1.invoke(str6);
                return Unit.INSTANCE;
            case 16:
                String str7 = (String) obj;
                str7.getClass();
                ((String) obj2).getClass();
                function1.invoke(new SavingsScreenViewEvent.DisclosureUrlClicked(str7));
                return Unit.INSTANCE;
            case 17:
                String str8 = (String) obj;
                str8.getClass();
                ((String) obj2).getClass();
                function1.invoke(str8);
                return Unit.INSTANCE;
            case 18:
                String str9 = (String) obj;
                str9.getClass();
                ((String) obj2).getClass();
                function1.invoke(str9);
                return Unit.INSTANCE;
            case 19:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(1 & intValue4, (intValue4 & 3) != 2)) {
                    Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                    } else {
                        gapComposer4.startReplaceGroup(-1762997739);
                        gapComposer4.end(false);
                    }
                    SurfaceKt.m554SurfaceT9BRK9s(null, null, colors.semantic.background.f1047app, 0L, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(-645849537, new ScoreHomeKt$$ExternalSyntheticLambda8(function1, r3, 20), gapComposer4), gapComposer4, 12582912, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer5, 48);
                    int hashCode = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer5, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer5.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer5, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    SpacerKt.Spacer(gapComposer5, SizeKt.m277height3ABfNKs(companion, 27.0f));
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer5).semantic.text.standard, (Composer) gapComposer5, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer5).header, (TextLineBalancing) null, Room.stringResource(gapComposer5, R.string.sup_card_details_header), (Map) null, (Function1) null, false);
                    SpacerKt.Spacer(gapComposer5, SizeKt.m277height3ABfNKs(companion, 4.0f));
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer5).semantic.text.subtle, (Composer) gapComposer5, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer5).bodyMedium, (TextLineBalancing) null, Room.stringResource(gapComposer5, R.string.sup_card_details_description), (Map) null, (Function1) null, false);
                    SpacerKt.Spacer(gapComposer5, SizeKt.m277height3ABfNKs(companion, 16.0f));
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-925955641, new TaxesPasswordViewKt$$ExternalSyntheticLambda4(17, function1), gapComposer5), gapComposer5, 24576, 15);
                    gapComposer5.end(true);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                DirectoryViewEvent.DirectoryItemViewEvent directoryItemViewEvent = (DirectoryViewEvent.DirectoryItemViewEvent) obj;
                directoryItemViewEvent.getClass();
                ShopMessageKt.ShopHubResultsList$trackEvent(function1, directoryItemViewEvent, (DirectoryListItem.ItemViewModel) obj2);
                return Unit.INSTANCE;
            case 22:
                DirectoryViewEvent.DirectoryItemViewEvent directoryItemViewEvent2 = (DirectoryViewEvent.DirectoryItemViewEvent) obj;
                DirectoryListItem.ItemViewModel itemViewModel = (DirectoryListItem.ItemViewModel) obj2;
                directoryItemViewEvent2.getClass();
                itemViewModel.getClass();
                ShopMessageKt.ShopHubResultsList$trackEvent(function1, directoryItemViewEvent2, itemViewModel);
                return Unit.INSTANCE;
            case 23:
                DirectoryViewEvent.DirectoryItemViewEvent directoryItemViewEvent3 = (DirectoryViewEvent.DirectoryItemViewEvent) obj;
                DirectoryListItem.ItemViewModel itemViewModel2 = (DirectoryListItem.ItemViewModel) obj2;
                directoryItemViewEvent3.getClass();
                itemViewModel2.getClass();
                ShopMessageKt.ShopHubResultsList$trackEvent(function1, directoryItemViewEvent3, itemViewModel2);
                return Unit.INSTANCE;
            case 24:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                int i2 = ChatExitPromptView.$r8$clinit;
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(1 & intValue6, (intValue6 & 3) != 2)) {
                    ChatExitPromptViewKt.ExitDialog(function1, gapComposer6, 0);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                ChatSurveyKt.Completed(function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 26:
                String str10 = (String) obj;
                str10.getClass();
                ((String) obj2).getClass();
                function1.invoke(str10);
                return Unit.INSTANCE;
            case 27:
                String str11 = (String) obj;
                str11.getClass();
                ((String) obj2).getClass();
                function1.invoke(str11);
                return Unit.INSTANCE;
            case 28:
                String str12 = (String) obj;
                str12.getClass();
                ((String) obj2).getClass();
                function1.invoke(str12);
                return Unit.INSTANCE;
            default:
                String str13 = (String) obj;
                str13.getClass();
                ((String) obj2).getClass();
                function1.invoke(str13);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ScoreHomeKt$$ExternalSyntheticLambda8(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    public /* synthetic */ ScoreHomeKt$$ExternalSyntheticLambda8(Function1 function1, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }
}
