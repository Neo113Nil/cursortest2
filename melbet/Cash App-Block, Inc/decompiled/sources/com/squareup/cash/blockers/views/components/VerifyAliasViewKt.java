package com.squareup.cash.blockers.views.components;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.viewmodels.InviteFriendsViewModel;
import com.squareup.cash.blockers.viewmodels.VerifyAliasModel;
import com.squareup.cash.blockers.views.GetFlowLoadingViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.views.ReferralCodeViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda14;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda1;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda0;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda3;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda3;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda1;
import com.squareup.cash.scrubbing.AbstractScrubber;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes4.dex */
public abstract class VerifyAliasViewKt {

    /* renamed from: lambda$-1156890761, reason: not valid java name */
    public static final ComposableLambdaImpl f311lambda$1156890761 = new ComposableLambdaImpl(new GetFlowLoadingViewKt$$ExternalSyntheticLambda0(23), false, -1156890761);
    public static final ComposableLambdaImpl lambda$137528086 = new ComposableLambdaImpl(new GetFlowLoadingViewKt$$ExternalSyntheticLambda0(24), false, 137528086);

    /* renamed from: lambda$-1713712096, reason: not valid java name */
    public static final ComposableLambdaImpl f312lambda$1713712096 = new ComposableLambdaImpl(new GetFlowLoadingViewKt$$ExternalSyntheticLambda0(25), false, -1713712096);
    public static final ComposableLambdaImpl lambda$977251327 = new ComposableLambdaImpl(new GetFlowLoadingViewKt$$ExternalSyntheticLambda0(26), false, 977251327);

    /* renamed from: lambda$-563879809, reason: not valid java name */
    public static final ComposableLambdaImpl f315lambda$563879809 = new ComposableLambdaImpl(new GetFlowLoadingViewKt$$ExternalSyntheticLambda0(27), false, -563879809);
    public static final ComposableLambdaImpl lambda$2127083614 = new ComposableLambdaImpl(new GetFlowLoadingViewKt$$ExternalSyntheticLambda0(28), false, 2127083614);
    public static final ComposableLambdaImpl lambda$1482357128 = new ComposableLambdaImpl(new ReferralCodeViewKt$$ExternalSyntheticLambda12(23), false, 1482357128);

    /* renamed from: lambda$-328579437, reason: not valid java name */
    public static final ComposableLambdaImpl f314lambda$328579437 = new ComposableLambdaImpl(new GetFlowLoadingViewKt$$ExternalSyntheticLambda0(29), false, -328579437);

    /* renamed from: lambda$-1836023249, reason: not valid java name */
    public static final ComposableLambdaImpl f313lambda$1836023249 = new ComposableLambdaImpl(new ReferralCodeViewKt$$ExternalSyntheticLambda12(24), false, -1836023249);
    public static final ComposableLambdaImpl lambda$1043950068 = new ComposableLambdaImpl(new ReferralCodeViewKt$$ExternalSyntheticLambda12(25), false, 1043950068);

    /* renamed from: lambda$-1084544483, reason: not valid java name */
    public static final ComposableLambdaImpl f310lambda$1084544483 = new ComposableLambdaImpl(new ReferralCodeViewKt$$ExternalSyntheticLambda12(26), false, -1084544483);

    public static final void ContactPermissionExplanation(Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1271009755);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(function1) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            long j = Strings.getColors(gapComposer).semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            TextViewKt.Avatar(AvatarSize.Size64, new AvatarEntry("", Strings.getColors(gapComposer).semantic.background.brand, null, new AvatarImage.LocalIcon(Icons.ContactAdd32, 0L, 6), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), false, gapComposer, 6, 24);
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 12.0f));
            Strings.getSizes(gapComposer).getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer).header, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.contacts_permissions_explanation_title), (Map) null, (Function1) null, false);
            Strings.getSizes(gapComposer).getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 8.0f));
            Strings.getSizes(gapComposer).getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.contacts_permissions_explanation_body), (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer), companion, 16.0f, gapComposer);
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(f311lambda$1156890761, lambda$137528086, null, null, false, false, null, null, null, 0L, gapComposer, 54, 4092);
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(f312lambda$1713712096, lambda$977251327, null, null, false, false, null, null, null, 0L, gapComposer, 54, 4092);
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(f315lambda$563879809, lambda$2127083614, null, null, false, false, null, null, null, 0L, gapComposer, 54, 4092);
            Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer), companion, 16.0f, gapComposer);
            DimensionKt.ButtonCtaGroup(SizeKt.fillMaxWidth(companion, 1.0f), false, null, Expect_jvmKt.rememberComposableLambda(1244542020, new BookletGridKt$$ExternalSyntheticLambda1(10, function1), gapComposer), Expect_jvmKt.rememberComposableLambda(691025251, new BookletGridKt$$ExternalSyntheticLambda1(11, function1), gapComposer), gapComposer, 27654, 6);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda1(function1, i, 8, false);
        }
    }

    public static final void InviteFriends(InviteFriendsViewModel inviteFriendsViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Function1 function12;
        InviteFriendsViewModel inviteFriendsViewModel2;
        Modifier modifier2;
        int i2;
        inviteFriendsViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1656515222);
        Applier applier = gapComposer.applier;
        int i3 = i | (gapComposer.changedInstance(inviteFriendsViewModel) ? 4 : 2);
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i3 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            NavigationType navigationType = NavigationType.CLOSE;
            int i5 = i4 & 112;
            boolean z = i5 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                i2 = i5;
                rememberedValue = new SsnViewKt$$ExternalSyntheticLambda14(24, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            } else {
                i2 = i5;
            }
            int i6 = i2;
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 54, 108);
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(1.0f, ImageKt.verticalScroll$default(companion, ImageKt.rememberScrollState(gapComposer), false, 14), true);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 16.0f));
            inviteFriendsViewModel2 = inviteFriendsViewModel;
            String str = inviteFriendsViewModel2.title;
            if (str == null) {
                str = "";
            }
            String str2 = inviteFriendsViewModel2.subtitle;
            Countries.PageHeader(str, (Modifier) null, f314lambda$328579437, str2 == null ? "" : str2, gapComposer, MLKEMEngine.KyberPolyBytes, 2);
            gapComposer.end(true);
            ButtonProminence buttonProminence = ButtonProminence.SUBTLE;
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f);
            boolean z2 = i6 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                function12 = function1;
                rememberedValue2 = new SsnViewKt$$ExternalSyntheticLambda14(27, function12);
                gapComposer.updateRememberedValue(rememberedValue2);
            } else {
                function12 = function1;
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, fillMaxWidth, buttonProminence, false, false, null, f313lambda$1836023249, gapComposer, 1573248, 56);
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(69254386, new BorrowHomeKt$$ExternalSyntheticLambda0(25, inviteFriendsViewModel2, function12), gapComposer), gapComposer, 24576, 15);
            gapComposer = gapComposer;
            SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 24.0f));
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            function12 = function1;
            inviteFriendsViewModel2 = inviteFriendsViewModel;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda3(inviteFriendsViewModel2, function12, modifier2, i, 4);
        }
    }

    public static final void PrimaryButtonFirst(InviteFriendsViewModel inviteFriendsViewModel, Function1 function1, Composer composer, int i) {
        float f;
        boolean z;
        NeverEqualPolicy neverEqualPolicy;
        int i2;
        Modifier.Companion companion;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1196170875);
        int i3 = (gapComposer.changedInstance(inviteFriendsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        int i4 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            String str = inviteFriendsViewModel.inviteButton;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (str == null || str.length() <= 0) {
                f = 1.0f;
                z = false;
                neverEqualPolicy = neverEqualPolicy2;
                i2 = i3;
                companion = companion2;
                gapComposer.startReplaceGroup(-216762649);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-216953051);
                ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
                boolean z2 = (i3 & 112) == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z2 || rememberedValue == neverEqualPolicy2) {
                    rememberedValue = new BorrowHomeKt$$ExternalSyntheticLambda3(1, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                f = 1.0f;
                neverEqualPolicy = neverEqualPolicy2;
                z = false;
                i2 = i3;
                companion = companion2;
                coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(495268411, new InviteFriendsViewKt$$ExternalSyntheticLambda5(inviteFriendsViewModel, i4), gapComposer), gapComposer, 1573296, 56);
                gapComposer.end(false);
            }
            String str2 = inviteFriendsViewModel.skipButton;
            if (str2 == null || str2.length() <= 0) {
                gapComposer.startReplaceGroup(-216546393);
                gapComposer.end(z);
            } else {
                gapComposer.startReplaceGroup(-216704121);
                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, f);
                boolean z3 = (i2 & 112) == 32 ? true : z;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z3 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new SsnViewKt$$ExternalSyntheticLambda14(25, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, fillMaxWidth2, null, false, false, null, Expect_jvmKt.rememberComposableLambda(-1809125660, new InviteFriendsViewKt$$ExternalSyntheticLambda5(inviteFriendsViewModel, 2), gapComposer), gapComposer, 1572912, 60);
                gapComposer.end(z);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InviteFriendsView$$ExternalSyntheticLambda0(inviteFriendsViewModel, function1, i, 1);
        }
    }

    public static final void SecondaryButtonFirst(InviteFriendsViewModel inviteFriendsViewModel, Function1 function1, Composer composer, int i) {
        float f;
        boolean z;
        NeverEqualPolicy neverEqualPolicy;
        int i2;
        Modifier.Companion companion;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1195251639);
        int i3 = (gapComposer.changedInstance(inviteFriendsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        int i4 = 0;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            String str = inviteFriendsViewModel.skipButton;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (str == null || str.length() <= 0) {
                f = 1.0f;
                z = false;
                neverEqualPolicy = neverEqualPolicy2;
                i2 = i3;
                companion = companion2;
                gapComposer.startReplaceGroup(1832595097);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1832437369);
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
                boolean z2 = (i3 & 112) == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z2 || rememberedValue == neverEqualPolicy2) {
                    rememberedValue = new SsnViewKt$$ExternalSyntheticLambda14(28, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                i2 = i3;
                companion = companion2;
                z = false;
                neverEqualPolicy = neverEqualPolicy2;
                f = 1.0f;
                coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, null, false, false, null, Expect_jvmKt.rememberComposableLambda(-452654071, new InviteFriendsViewKt$$ExternalSyntheticLambda5(inviteFriendsViewModel, i4), gapComposer), gapComposer, 1572912, 60);
                gapComposer.end(false);
            }
            String str2 = inviteFriendsViewModel.inviteButton;
            if (str2 == null || str2.length() <= 0) {
                gapComposer.startReplaceGroup(1832847065);
                gapComposer.end(z);
            } else {
                gapComposer.startReplaceGroup(1832656663);
                ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, f);
                boolean z3 = (i2 & 112) != 32 ? z : true;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z3 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new SsnViewKt$$ExternalSyntheticLambda14(29, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, fillMaxWidth2, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(1227768434, new InviteFriendsViewKt$$ExternalSyntheticLambda5(inviteFriendsViewModel, 4), gapComposer), gapComposer, 1573296, 56);
                gapComposer.end(z);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InviteFriendsView$$ExternalSyntheticLambda0(inviteFriendsViewModel, function1, i, 3);
        }
    }

    public static final void SingleButton(InviteFriendsViewModel inviteFriendsViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1611392857);
        int i2 = (gapComposer.changedInstance(inviteFriendsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String str = inviteFriendsViewModel.inviteButton;
            if (str == null || str.length() <= 0) {
                gapComposer.startReplaceGroup(155477737);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(155287335);
                ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                boolean z = (i2 & 112) == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new SsnViewKt$$ExternalSyntheticLambda14(26, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(1284426521, new InviteFriendsViewKt$$ExternalSyntheticLambda5(inviteFriendsViewModel, 3), gapComposer), gapComposer, 1573296, 56);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InviteFriendsView$$ExternalSyntheticLambda0(inviteFriendsViewModel, function1, i, 2);
        }
    }

    public static final void VerifyAlias(Modifier modifier, Function1 function1, VerifyAliasModel verifyAliasModel, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        ParcelableSnapshotMutableState mutableStateOf$default;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1988004040);
        int i2 = i | 6 | (gapComposer2.changedInstance(function1) ? 32 : 16);
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(verifyAliasModel) ? 256 : 128;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean changed = gapComposer2.changed(verifyAliasModel.clearInput);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                if (verifyAliasModel.clearInput) {
                    mutableStateOf$default = Updater.mutableStateOf$default("");
                } else {
                    Pattern pattern = AbstractScrubber.STRIP_CHARS;
                    String replaceAll = AbstractScrubber.STRIP_CHARS.matcher(verifyAliasModel.verificationCode).replaceAll("");
                    replaceAll.getClass();
                    mutableStateOf$default = Updater.mutableStateOf$default(replaceAll);
                }
                rememberedValue = mutableStateOf$default;
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1926464717, new SwipeToDismissKt$$ExternalSyntheticLambda3(verifyAliasModel, (FocusOwnerImpl) gapComposer2.consume(CompositionLocalsKt.LocalFocusManager), (DelegatingSoftwareKeyboardController) gapComposer2.consume(CompositionLocalsKt.LocalSoftwareKeyboardController), function1, (MutableState) rememberedValue, verifyAliasModel.resendCodeButtonState), gapComposer2), gapComposer, 3072, 7);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda3(modifier2, function1, verifyAliasModel, i, 5);
        }
    }
}
