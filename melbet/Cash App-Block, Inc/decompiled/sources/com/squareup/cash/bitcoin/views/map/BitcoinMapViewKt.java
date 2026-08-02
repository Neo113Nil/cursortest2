package com.squareup.cash.bitcoin.views.map;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.views.brand.orders.OrderStatusRowKt$$ExternalSyntheticLambda1;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda19;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaco;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinLocationFilter;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinLocationViewModel;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinMapErrorViewModel;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinMapOnboardingViewModel;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinMapViewModel;
import com.squareup.cash.bitcoin.views.BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.bitcoin.views.BitcoinUiFactory$$ExternalSyntheticLambda11;
import com.squareup.cash.bitcoin.views.BitcoinUiFactory$$ExternalSyntheticLambda12;
import com.squareup.cash.blockers.presenters.CheckmarkPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.borrow.views.ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.directory_ui.views.SectionKt$$ExternalSyntheticLambda2;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda8;
import com.squareup.cash.maps.views.CashCluster;
import com.squareup.cash.maps.views.ClusterItemKt;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda38;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.support.views.article.ArticleViewKt$$ExternalSyntheticLambda14;
import com.squareup.util.Strings;
import java.util.EnumSet;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import radiography.ViewStateRenderers$$ExternalSyntheticLambda5;

/* loaded from: classes5.dex */
public abstract class BitcoinMapViewKt {
    public static final ComposableLambdaImpl lambda$1128348589 = new ComposableLambdaImpl(new BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0(24), false, 1128348589);

    /* renamed from: lambda$-279862162, reason: not valid java name */
    public static final ComposableLambdaImpl f266lambda$279862162 = new ComposableLambdaImpl(new BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0(25), false, -279862162);

    /* renamed from: lambda$-139192076, reason: not valid java name */
    public static final ComposableLambdaImpl f264lambda$139192076 = new ComposableLambdaImpl(new BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0(26), false, -139192076);

    /* renamed from: lambda$-1728610982, reason: not valid java name */
    public static final ComposableLambdaImpl f265lambda$1728610982 = new ComposableLambdaImpl(new BitcoinLocationViewKt$$ExternalSyntheticLambda5(7), false, -1728610982);
    public static final ComposableLambdaImpl lambda$604426399 = new ComposableLambdaImpl(new BitcoinLocationViewKt$$ExternalSyntheticLambda5(8), false, 604426399);
    public static final ComposableLambdaImpl lambda$1227850913 = new ComposableLambdaImpl(new BitcoinLocationViewKt$$ExternalSyntheticLambda5(9), false, 1227850913);

    /* renamed from: lambda$-1075104440, reason: not valid java name */
    public static final ComposableLambdaImpl f263lambda$1075104440 = new ComposableLambdaImpl(new ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0(1), false, -1075104440);
    public static final ComposableLambdaImpl lambda$1547491831 = new ComposableLambdaImpl(new BitcoinLocationViewKt$$ExternalSyntheticLambda5(10), false, 1547491831);
    public static final ComposableLambdaImpl lambda$135917648 = new ComposableLambdaImpl(new BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0(27), false, 135917648);
    public static final ComposableLambdaImpl lambda$1354197265 = new ComposableLambdaImpl(new BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0(28), false, 1354197265);
    public static final ComposableLambdaImpl lambda$73940375 = new ComposableLambdaImpl(new BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0(29), false, 73940375);
    public static final ComposableLambdaImpl lambda$28804167 = new ComposableLambdaImpl(new BitcoinLocationViewKt$$ExternalSyntheticLambda5(11), false, 28804167);

    public static final void BitcoinLocationCluster(CashCluster cashCluster, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-193379185);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer.changed(cashCluster) : gapComposer.changedInstance(cashCluster) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 44.0f), RoundedCornerShapeKt.CircleShape), Strings.getColors(gapComposer).semantic.background.inverse, ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.inverse, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, String.valueOf(cashCluster.items.size()), (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda19(cashCluster, i, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v4, types: [com.squareup.cash.arcade.components.avatar.AvatarImage$Remote$Image] */
    public static final void BitcoinLocationContent(BitcoinLocationViewModel bitcoinLocationViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        AvatarSize avatarSize;
        long j;
        AvatarImage.LocalIcon localIcon;
        long j2;
        BiasAlignment.Horizontal horizontal;
        boolean z;
        boolean z2;
        Function1 function12 = function1;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(309555047);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(bitcoinLocationViewModel) ? 4 : 2) | (gapComposer.changedInstance(function12) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(modifier, 1.0f), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape);
            BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal2, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            AvatarOverlay.LocalIcon localIcon2 = null;
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
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f, false), ImageKt.rememberScrollState(gapComposer), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal2, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
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
            AvatarImage.LocalIcon localIcon3 = new AvatarImage.LocalIcon(Icons.LogoBtc32, Strings.getColors(gapComposer).semantic.icon.standard, 4);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
            AvatarSize avatarSize2 = AvatarSize.Size64;
            long j3 = Strings.getColors(gapComposer).semantic.background.standard;
            String str = bitcoinLocationViewModel.iconUrl;
            EnumSet enumSet = bitcoinLocationViewModel.paymentMethods;
            if (str != null) {
                avatarSize = avatarSize2;
                j = j3;
                localIcon = new AvatarImage.Remote.Image(str, false, localIcon3, 0L, new BitcoinLocationViewKt$$ExternalSyntheticLambda5(0), 58);
            } else {
                avatarSize = avatarSize2;
                j = j3;
                localIcon = localIcon3;
            }
            if (bitcoinLocationViewModel.isSquareSeller) {
                gapComposer.startReplaceGroup(-180728650);
                horizontal = horizontal2;
                j2 = j;
                AvatarOverlay.LocalIcon localIcon4 = new AvatarOverlay.LocalIcon(Icons.LogoSquare16, Strings.getColors(gapComposer).semantic.background.inverse, Strings.getColors(gapComposer).semantic.icon.inverse, true);
                z = false;
                gapComposer.end(false);
                localIcon2 = localIcon4;
            } else {
                j2 = j;
                horizontal = horizontal2;
                z = false;
                gapComposer.startReplaceGroup(-180470575);
                gapComposer.end(false);
            }
            boolean z3 = z;
            BiasAlignment.Horizontal horizontal3 = horizontal;
            TextViewKt.m3613AvatarB_rZmmc(avatarSize, "", j2, (String) null, m302paddingqDBjuR0$default, (AvatarImage) localIcon, (Function2) null, (AvatarOverlay) localIcon2, false, 0L, (Composer) gapComposer, 3126, 0, 1856);
            gapComposer = gapComposer;
            String str2 = bitcoinLocationViewModel.name;
            Strings.getSizes(gapComposer).getClass();
            Strings.getSizes(gapComposer).getClass();
            Strings.getSizes(gapComposer).getClass();
            Room.m1165Text25TpFw(0, 0, 0, 5, 0, 0, 3824, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, 16.0f, 8.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8), Strings.getTypography(gapComposer).pageTitle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            String str3 = bitcoinLocationViewModel.address;
            if (str3 == null) {
                gapComposer.startReplaceGroup(-179988185);
                gapComposer.end(z3);
            } else {
                gapComposer.startReplaceGroup(-179988184);
                Strings.getSizes(gapComposer).getClass();
                Strings.getSizes(gapComposer).getClass();
                Strings.getSizes(gapComposer).getClass();
                Room.m1165Text25TpFw(0, 0, 0, 5, 0, 0, 3824, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, 16.0f, 4.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                gapComposer.end(z3);
            }
            Strings.getSizes(gapComposer).getClass();
            SpacerKt.Spacer(gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7));
            String str4 = bitcoinLocationViewModel.description;
            if (str4 == null) {
                gapComposer.startReplaceGroup(-179431673);
                gapComposer.end(z3);
            } else {
                gapComposer.startReplaceGroup(-179431672);
                Strings.getSizes(gapComposer).getClass();
                ExpandableText(0, 0, gapComposer, SpacerKt.m298padding3ABfNKs(companion, 16.0f), str4, bitcoinLocationViewModel.descriptionInitiallyExpanded);
                gapComposer.end(z3);
            }
            if (enumSet.isEmpty()) {
                z2 = true;
                gapComposer.startReplaceGroup(-178585713);
                gapComposer.end(z3);
            } else {
                gapComposer.startReplaceGroup(-179145015);
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                Strings.getSizes(gapComposer).getClass();
                Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7);
                ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal3, gapComposer, z3 ? 1 : 0);
                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default2);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                if (enumSet.contains(BitcoinLocationViewModel.PaymentMethod.LIGHTNING)) {
                    gapComposer.startReplaceGroup(-1593159181);
                    CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(lambda$1128348589, f266lambda$279862162, SizeKt.fillMaxWidth(companion, 1.0f), null, false, false, f264lambda$139192076, null, null, 0L, gapComposer, 12583350, 3960);
                    gapComposer = gapComposer;
                    gapComposer.end(z3);
                } else {
                    gapComposer.startReplaceGroup(-1592798434);
                    gapComposer.end(z3);
                }
                z2 = true;
                gapComposer.end(true);
                gapComposer.end(z3);
            }
            gapComposer.end(z2);
            function12 = function1;
            DimensionKt.ButtonCtaGroup(null, false, ButtonCtaGroupOrientation.AUTOMATIC, null, Expect_jvmKt.rememberComposableLambda(-490095393, new BitcoinLocationViewKt$$ExternalSyntheticLambda4(function12, bitcoinLocationViewModel), gapComposer), gapComposer, 24960, 11);
            gapComposer.end(z2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinMapViewKt$$ExternalSyntheticLambda0(modifier, (Object) bitcoinLocationViewModel, function12, i, 18);
        }
    }

    public static final void BitcoinLocationFilterSheet(BitcoinLocationFilter bitcoinLocationFilter, Function1 function1, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        MutableState mutableState;
        Function1 function12 = function1;
        bitcoinLocationFilter.getClass();
        function12.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1298585708);
        int i4 = i | (gapComposer.changedInstance(bitcoinLocationFilter) ? 4 : 2);
        if ((i & 48) == 0) {
            i4 |= gapComposer.changedInstance(function12) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | MLKEMEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (gapComposer.changed(modifier2) ? 256 : 128);
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier modifier4 = i5 != 0 ? companion : modifier2;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(bitcoinLocationFilter);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState2 = (MutableState) rememberedValue;
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(modifier4, 1.0f), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape), ImageKt.rememberScrollState(gapComposer), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
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
            String stringResource = Room.stringResource(gapComposer, R.string.bitcoin_location_filter_title);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Strings.getSizes(gapComposer).getClass();
            Strings.getSizes(gapComposer).getClass();
            Modifier modifier5 = modifier4;
            int i6 = i3;
            Room.m1165Text25TpFw(0, 0, 0, 5, 0, 0, 3824, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 4.0f, 2), Strings.getTypography(gapComposer).pageTitle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
            String stringResource2 = Room.stringResource(gapComposer, R.string.bitcoin_location_filter_subtitle);
            Strings.getSizes(gapComposer).getClass();
            Strings.getSizes(gapComposer).getClass();
            Strings.getSizes(gapComposer).getClass();
            Room.m1165Text25TpFw(0, 0, 0, 5, 0, 0, 3824, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 8.0f, 2), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, stringResource2, (Map) null, (Function1) null, false);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, 7);
            CellDefaultAccessory.Toggle toggle = new CellDefaultAccessory.Toggle(((BitcoinLocationFilter) mutableState2.getValue()).squareSellersOnly);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                mutableState = mutableState2;
                rememberedValue2 = new TabContentViewKt$$ExternalSyntheticLambda1(21, mutableState);
                gapComposer.updateRememberedValue(rememberedValue2);
            } else {
                mutableState = mutableState2;
            }
            MutableState mutableState3 = mutableState;
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(lambda$135917648, lambda$1354197265, m302paddingqDBjuR0$default, (Function0) rememberedValue2, false, false, lambda$73940375, null, toggle, 0L, gapComposer, 12586038, 3440);
            String stringResource3 = Room.stringResource(gapComposer, R.string.bitcoin_location_filter_disclaimer);
            Strings.getSizes(gapComposer).getClass();
            Strings.getSizes(gapComposer).getClass();
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, SpacerKt.m299paddingVpY3zN4(companion, 16.0f, 8.0f), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, stringResource3, (Map) null, (Function1) null, false);
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(fillMaxWidth2, 16.0f);
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            boolean z = (i6 & 112) == 32;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z || rememberedValue3 == neverEqualPolicy) {
                function12 = function1;
                rememberedValue3 = new CashtagViewKt$$ExternalSyntheticLambda13(function12, mutableState3, 5);
                gapComposer.updateRememberedValue(rememberedValue3);
            } else {
                function12 = function1;
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue3, m298padding3ABfNKs, buttonProminence, false, false, null, lambda$28804167, gapComposer, 1573248, 56);
            gapComposer = gapComposer;
            gapComposer.end(true);
            modifier3 = modifier5;
        } else {
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OrderStatusRowKt$$ExternalSyntheticLambda1(bitcoinLocationFilter, function12, modifier3, i, i2, 20);
        }
    }

    public static final void BitcoinLocationMarker(boolean z, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1081158694);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ClusterItemKt.ClusterItem(z ? R.string.bitcoin_map_marker_square_seller_content_description : R.string.bitcoin_map_marker_content_description, Expect_jvmKt.rememberComposableLambda(693921028, new MoneyTabUIKt$$ExternalSyntheticLambda38(z, 3), gapComposer), gapComposer, 48);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ViewStateRenderers$$ExternalSyntheticLambda5(i, 6, z);
        }
    }

    public static final void BitcoinLocationView(BitcoinLocationViewModel bitcoinLocationViewModel, Function1 function1, Composer composer, int i) {
        bitcoinLocationViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(578248220);
        int i2 = (gapComposer.changedInstance(bitcoinLocationViewModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-435032985, new BitcoinUiFactory$$ExternalSyntheticLambda11(function1, bitcoinLocationViewModel), gapComposer), gapComposer, 3072, 7);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BitcoinLocationViewKt$$ExternalSyntheticLambda1(0, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckmarkPresenter$$ExternalSyntheticLambda0(bitcoinLocationViewModel, function1, i, 9);
        }
    }

    public static final void BitcoinMapErrorDialog(BitcoinMapErrorViewModel bitcoinMapErrorViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        bitcoinMapErrorViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1567885183);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(bitcoinMapErrorViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-933467754, new BitcoinUiFactory$$ExternalSyntheticLambda12(bitcoinMapErrorViewModel, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SetPinViewKt$$ExternalSyntheticLambda3((Object) bitcoinMapErrorViewModel, function1, (Object) modifier2, i, 13);
        }
    }

    public static final void BitcoinMapOnboardingView(BitcoinMapOnboardingViewModel bitcoinMapOnboardingViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        bitcoinMapOnboardingViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1353132676);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(bitcoinMapOnboardingViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else if (bitcoinMapOnboardingViewModel instanceof BitcoinMapOnboardingViewModel.Loading) {
            gapComposer.startReplaceGroup(1387680409);
            gapComposer.end(false);
        } else {
            if (!(bitcoinMapOnboardingViewModel instanceof BitcoinMapOnboardingViewModel.Loaded)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1014593447, false);
            }
            gapComposer.startReplaceGroup(1387775579);
            LoadedBitcoinMapOnboardingView(i2 & 112, gapComposer, function1, ((BitcoinMapOnboardingViewModel.Loaded) bitcoinMapOnboardingViewModel).canPayUsingLightning);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckmarkPresenter$$ExternalSyntheticLambda0(bitcoinMapOnboardingViewModel, function1, i, 10);
        }
    }

    public static final void BitcoinMapView(BitcoinMapViewModel bitcoinMapViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        bitcoinMapViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1438473630);
        int i2 = i | (gapComposer.changedInstance(bitcoinMapViewModel) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(525108461, new BitcoinMapViewKt$$ExternalSyntheticLambda0(function1, bitcoinMapViewModel, mutableState), gapComposer), gapComposer, 3072, 7);
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                gapComposer.startReplaceGroup(1618314314);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new TabContentViewKt$$ExternalSyntheticLambda1(22, mutableState);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                SheetKt.Sheet((Function0) rememberedValue2, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(1856294982, new SectionKt$$ExternalSyntheticLambda2(6, bitcoinMapViewModel, function1, mutableState), gapComposer), gapComposer, 100663302, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1618704480);
                gapComposer.end(false);
            }
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SetPinViewKt$$ExternalSyntheticLambda3((Object) bitcoinMapViewModel, function1, (Object) modifier2, i, 14);
        }
    }

    public static final void ExpandableText(int i, int i2, Composer composer, Modifier modifier, String str, boolean z) {
        int i3;
        MutableState mutableState;
        MutableState mutableState2;
        TextStyle textStyle;
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-628676704);
        int i4 = i2 | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(modifier) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128) | 3072;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState3 = (MutableState) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == obj) {
                rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState4 = (MutableState) rememberedValue2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == obj) {
                rememberedValue3 = Updater.mutableStateOf$default(null);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState5 = (MutableState) rememberedValue3;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == obj) {
                rememberedValue4 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState6 = (MutableState) rememberedValue4;
            String stringResource = Room.stringResource(gapComposer, R.string.bitcoin_location_description_see_more);
            String stringResource2 = Room.stringResource(gapComposer, R.string.bitcoin_location_description_see_less);
            TextLinkStyles textLinkStyles = new TextLinkStyles(new SpanStyle(Strings.getColors(gapComposer).semantic.text.standard, 0L, FontWeight.Medium, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Underline, (Shadow) null, 61434), (SpanStyle) null, (SpanStyle) null, 14);
            int i5 = i4 & 14;
            boolean changed = (i5 == 4) | gapComposer.changed(stringResource2) | gapComposer.changed(textLinkStyles);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changed || rememberedValue5 == obj) {
                AnnotatedString.Builder builder = new AnnotatedString.Builder();
                builder.append(str + " ");
                mutableState = mutableState3;
                mutableState2 = mutableState5;
                int pushLink = builder.pushLink(new LinkAnnotation.Clickable("expand_collapse", textLinkStyles, new BitcoinLocationViewKt$$ExternalSyntheticLambda8(0, mutableState)));
                try {
                    builder.append(stringResource2);
                    builder.pop(pushLink);
                    rememberedValue5 = builder.toAnnotatedString();
                    gapComposer.updateRememberedValue(rememberedValue5);
                } catch (Throwable th) {
                    builder.pop(pushLink);
                    throw th;
                }
            } else {
                mutableState = mutableState3;
                mutableState2 = mutableState5;
            }
            AnnotatedString annotatedString = (AnnotatedString) rememberedValue5;
            if (!((Boolean) mutableState.getValue()).booleanValue() || !((Boolean) mutableState4.getValue()).booleanValue()) {
                if (((AnnotatedString) mutableState2.getValue()) != null) {
                    annotatedString = (AnnotatedString) mutableState2.getValue();
                    annotatedString.getClass();
                } else {
                    annotatedString = new AnnotatedString(str);
                }
            }
            AnnotatedString annotatedString2 = annotatedString;
            int i6 = (((Boolean) mutableState.getValue()).booleanValue() || ((Boolean) mutableState6.getValue()).booleanValue()) ? Integer.MAX_VALUE : 2;
            Modifier animateContentSize$default = AnimatedContentKt.animateContentSize$default(modifier, null, 3);
            boolean z2 = i5 == 4;
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (z2 || rememberedValue6 == obj) {
                rememberedValue6 = new BadgeKt$$ExternalSyntheticLambda3(str, 11);
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            Modifier semantics = SemanticsModifierKt.semantics(animateContentSize$default, false, (Function1) rememberedValue6);
            TextStyle textStyle2 = Strings.getTypography(gapComposer).bodyMedium;
            long j2 = Strings.getColors(gapComposer).semantic.text.standard;
            boolean changed2 = gapComposer.changed(stringResource) | (i5 == 4) | gapComposer.changed(textLinkStyles) | ((i4 & 896) == 256);
            Object rememberedValue7 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue7 == obj) {
                textStyle = textStyle2;
                j = j2;
                rememberedValue7 = new InviteContactsBodyKt$$ExternalSyntheticLambda8(stringResource, str, z, mutableState6, textLinkStyles, mutableState, mutableState2, mutableState4);
                gapComposer.updateRememberedValue(rememberedValue7);
            } else {
                textStyle = textStyle2;
                j = j2;
            }
            zzaco.m2013ClickableTextJZIOrgw(annotatedString2, semantics, textStyle, j, (Function1) rememberedValue7, i6, 0, null, null, gapComposer, 0, 6, 960);
            i3 = 2;
        } else {
            gapComposer.skipToGroupEnd();
            i3 = i;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinLocationViewKt$$ExternalSyntheticLambda11(str, modifier, z, i3, i2);
        }
    }

    public static final void LoadedBitcoinMapOnboardingView(int i, Composer composer, Function1 function1, boolean z) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(471378142);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            ArcadeThemeKt.ArcadeTheme(DimensionKt.m1468withTint4WTKRHQ(colors, colors.semantic.service.bitcoinBackground), null, null, Expect_jvmKt.rememberComposableLambda(-115497677, new BitcoinMapOnboardingViewKt$$ExternalSyntheticLambda1(z, function1, 0), gapComposer), gapComposer, 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArticleViewKt$$ExternalSyntheticLambda14(z, function1, i);
        }
    }
}
