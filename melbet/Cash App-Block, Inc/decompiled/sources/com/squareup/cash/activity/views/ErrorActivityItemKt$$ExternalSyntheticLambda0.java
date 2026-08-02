package com.squareup.cash.activity.views;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.account.components.accountswitcher.BadgeTitleKt;
import com.squareup.cash.activity.viewmodels.ActivityFeedEntry;
import com.squareup.cash.activity.views.receipts.ReceiptUiKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.genie.TextViewKt;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class ErrorActivityItemKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ErrorActivityItemKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AvatarsKt.ErrorActivityItem((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (!gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (!gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    AvatarSize avatarSize = AvatarSize.Size64;
                    Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                    } else {
                        gapComposer4.startReplaceGroup(-1762997739);
                        gapComposer4.end(false);
                    }
                    TextViewKt.m3613AvatarB_rZmmc(avatarSize, "", colors.semantic.background.danger, (String) null, (Modifier) null, (AvatarImage) new AvatarImage.LocalIcon(Icons.Alert32, 0L, 6), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer4, 199734, 0, 2000);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer5, R.string.account_switcher_new_account), (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer6, R.string.account_switcher_create_personal_account), (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer7, R.string.account_switcher_add_account), (Map) null, (Function1) null, false);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    BiasAlignment biasAlignment = Alignment.Companion.Center;
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                    int hashCode = Long.hashCode(gapComposer8.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer8.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer8, fillMaxSize);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer8.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer8.startReusableNode();
                    if (gapComposer8.inserting) {
                        gapComposer8.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer8.useNode();
                    }
                    Updater.m576setimpl(gapComposer8, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer8, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer8, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer8, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer8, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    ProgressCircularKt.ProgressCircular(0, 1, gapComposer8, null);
                    gapComposer8.end(true);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    ProgressCircularKt.ProgressCircular(0, 1, gapComposer9, null);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                BadgeTitleKt.SwitchAccountLoadingContent((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 11:
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer10, R.string.edit_profile_business_name_title), (Map) null, (Function1) null, false);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer11, R.string.edit_profile_name_title), (Map) null, (Function1) null, false);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) ((Composer) obj);
                gapComposer12.startReplaceGroup(2059109181);
                gapComposer12.end(false);
                return ActivityFeedEntry.EmbeddedFooter.INSTANCE;
            case 14:
                return new Pair((String) obj, (String) obj2);
            case 15:
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer12;
                if (gapComposer13.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    ((DefaultSizes) gapComposer13.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    ProgressCircularKt.ProgressCircular(0, 0, gapComposer13, SizeKt.m285size3ABfNKs(companion, 32.0f));
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer13;
                if (!gapComposer14.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer14;
                if (gapComposer15.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    TextViewKt.Avatar(AvatarSize.Size48, ActivityTabViewKt.createInviteFriendsAvatar(gapComposer15), null, false, gapComposer15, 6, 28);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Composer composer15 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer16 = (GapComposer) composer15;
                if (gapComposer16.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer16, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer16, R.string.inline_message_dismissed_toast_headline), (Map) null, (Function1) null, false);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                Composer composer16 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                GapComposer gapComposer17 = (GapComposer) composer16;
                if (gapComposer17.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer17, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer17, R.string.activity_item_error_dashes), (Map) null, (Function1) null, false);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer17 = (Composer) obj;
                int intValue17 = ((Integer) obj2).intValue();
                GapComposer gapComposer18 = (GapComposer) composer17;
                if (gapComposer18.shouldExecute(intValue17 & 1, (intValue17 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer18, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer18, R.string.activity_item_error_dashes), (Map) null, (Function1) null, false);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                Composer composer18 = (Composer) obj;
                int intValue18 = ((Integer) obj2).intValue();
                GapComposer gapComposer19 = (GapComposer) composer18;
                if (gapComposer19.shouldExecute(intValue18 & 1, (intValue18 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer19, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer19, R.string.activity_item_error_dashes), (Map) null, (Function1) null, false);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer19 = (Composer) obj;
                int intValue19 = ((Integer) obj2).intValue();
                GapComposer gapComposer20 = (GapComposer) composer19;
                if (gapComposer20.shouldExecute(intValue19 & 1, (intValue19 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer20, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer20, R.string.activity_item_error), (Map) null, (Function1) null, false);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                Composer composer20 = (Composer) obj;
                int intValue20 = ((Integer) obj2).intValue();
                GapComposer gapComposer21 = (GapComposer) composer20;
                if (gapComposer21.shouldExecute(intValue20 & 1, (intValue20 & 3) != 2)) {
                    ((DefaultSizes) gapComposer21.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    ProgressCircularKt.ProgressCircular(0, 0, gapComposer21, SizeKt.m285size3ABfNKs(companion, 32.0f));
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                Composer composer21 = (Composer) obj;
                int intValue21 = ((Integer) obj2).intValue();
                GapComposer gapComposer22 = (GapComposer) composer21;
                if (!gapComposer22.shouldExecute(intValue21 & 1, (intValue21 & 3) != 2)) {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                Composer composer22 = (Composer) obj;
                int intValue22 = ((Integer) obj2).intValue();
                GapComposer gapComposer23 = (GapComposer) composer22;
                if (gapComposer23.shouldExecute(intValue22 & 1, (intValue22 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 6, 0, 4094, 0L, (Composer) gapComposer23, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, "Nina Stewart", (Map) null, (Function1) null, false);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                Composer composer23 = (Composer) obj;
                int intValue23 = ((Integer) obj2).intValue();
                GapComposer gapComposer24 = (GapComposer) composer23;
                if (gapComposer24.shouldExecute(intValue23 & 1, (intValue23 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 6, 0, 4094, 0L, (Composer) gapComposer24, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, "+ $25", (Map) null, (Function1) null, false);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                Composer composer24 = (Composer) obj;
                int intValue24 = ((Integer) obj2).intValue();
                GapComposer gapComposer25 = (GapComposer) composer24;
                if (gapComposer25.shouldExecute(intValue24 & 1, (intValue24 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.Location24, (String) null, (Modifier) null, 0L, gapComposer25, 54, 12);
                } else {
                    gapComposer25.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                Composer composer25 = (Composer) obj;
                int intValue25 = ((Integer) obj2).intValue();
                GapComposer gapComposer26 = (GapComposer) composer25;
                if (gapComposer26.shouldExecute(intValue25 & 1, (intValue25 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer26, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer26, R.string.receipt_location_title), (Map) null, (Function1) null, false);
                } else {
                    gapComposer26.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer26 = (Composer) obj;
                int intValue26 = ((Integer) obj2).intValue();
                GapComposer gapComposer27 = (GapComposer) composer26;
                if (gapComposer27.shouldExecute(intValue26 & 1, (intValue26 & 3) != 2)) {
                    ReceiptUiKt.Loading(gapComposer27, 0);
                } else {
                    gapComposer27.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
