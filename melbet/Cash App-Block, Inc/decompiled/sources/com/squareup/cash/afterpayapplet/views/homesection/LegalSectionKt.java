package com.squareup.cash.afterpayapplet.views.homesection;

import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.internal.config.AudioConfigUtil;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.collection.ArrayMap;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconButtonKt$$ExternalSyntheticLambda0;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda3;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda4;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.views.brand.orders.OrderStatusRowKt$$ExternalSyntheticLambda1;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda34;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda1;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.CombinedModifier$$ExternalSyntheticLambda0;
import bo.app.re$$ExternalSyntheticOutline0;
import bo.app.y0$$ExternalSyntheticLambda0;
import coil3.compose.AsyncImageKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabw;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda5;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda9;
import com.squareup.cash.activity.views.SectionHeaderScope$$ExternalSyntheticLambda1;
import com.squareup.cash.activity.views.receipts.ReceiptUiKt$$ExternalSyntheticLambda4;
import com.squareup.cash.afterpayapplet.backend.RetroTransaction;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.RemoteImage;
import com.squareup.cash.afterpayapplet.viewmodels.Tap;
import com.squareup.cash.afterpayapplet.viewmodels.TappableIcon;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt$$ExternalSyntheticLambda16;
import com.squareup.cash.aiedge.MLKitTitleGenerator$prepareModel$1;
import com.squareup.cash.amountchooser.views.AtmPickerGridKt$$ExternalSyntheticLambda4;
import com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda8;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.MotionKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.AlignmentLinesKt;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda10;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.avatar.DiagonalAvatarValues;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.cell.RealCellActivityAccessoryScope;
import com.squareup.cash.arcade.components.list.ListOrderedKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.arcade.treehouse.ButtonBinding$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda4;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda5;
import com.squareup.cash.blockers.views.PasscodeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.earnings.applets.views.EarnerAppletTileKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.viewmodels.api.Section;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.tax.views.TaxToolTipViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import okhttp3.internal.Tags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.savings.ArcadeElement;
import squareup.cash.savings.SavingsElement;
import squareup.cash.ui.arcade.elements.ButtonProminence;

/* loaded from: classes5.dex */
public abstract class LegalSectionKt {

    /* renamed from: lambda$-1637449872, reason: not valid java name */
    public static final ComposableLambdaImpl f135lambda$1637449872 = new ComposableLambdaImpl(new ReceiptUiKt$$ExternalSyntheticLambda4(16), false, -1637449872);
    public static final ComposableLambdaImpl lambda$1207689852 = new ComposableLambdaImpl(new ReceiptUiKt$$ExternalSyntheticLambda4(17), false, 1207689852);

    public static final void AfterpayAppletBannerSection(Modifier modifier, AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.BannerSection bannerSection, Function1 function1, Composer composer, int i) {
        Modifier.Companion companion;
        float f;
        bannerSection.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-141987059);
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(bannerSection) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.startReplaceGroup(989409552);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(m300paddingVpY3zN4$default, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape);
            long j = Strings.getColors(gapComposer).semantic.border.subtle;
            Strings.getSizes(gapComposer).getClass();
            Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(m177backgroundbw27NRU, 1.0f, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
            Tap tap = bannerSection.tapAction;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (tap != null) {
                boolean changedInstance = ((i2 & 896) == 256) | gapComposer.changedInstance(tap);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new RetroSectionKt$$ExternalSyntheticLambda5(function1, tap, 1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                companion = companion2;
                m178borderxT4_qwU = m178borderxT4_qwU.then(ImageKt.m183clickableoSLSa3U$default(companion2, false, null, null, (Function0) rememberedValue, 15));
            } else {
                companion = companion2;
            }
            gapComposer.end(false);
            Strings.getSizes(gapComposer).getClass();
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(m178borderxT4_qwU, 16.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            StackedAvatarViewModel.Avatar avatar = bannerSection.avatar;
            if (avatar == null) {
                gapComposer.startReplaceGroup(-2047216222);
                gapComposer.end(false);
                f = 16.0f;
            } else {
                gapComposer.startReplaceGroup(-2047216221);
                f = 16.0f;
                TextViewKt.Avatar(AvatarSize.Size32, AvatarsKt.toAvatarEntry(avatar, null, null, gapComposer, 8, 3), null, false, gapComposer, 6, 28);
                Strings.getSizes(gapComposer).getClass();
                SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 16.0f));
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).marketingCardTitleSmall, (TextLineBalancing) null, bannerSection.titleText, (Map) null, (Function1) null, false);
            Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer), companion, 4.0f, gapComposer);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, bannerSection.subtitleText, (Map) null, (Function1) null, false);
            String str = bannerSection.buttonText;
            if (str == null) {
                gapComposer.startReplaceGroup(-2046641017);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-2046641016);
                Strings.getSizes(gapComposer).getClass();
                SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, f));
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).buttonCompactUnderline, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InlineAppMessageKt$$ExternalSyntheticLambda8(i, 14, modifier, bannerSection, function1);
        }
    }

    public static final void AvatarTextSection(Modifier modifier, final AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AvatarText avatarText, boolean z, Function1 function1, Composer composer, int i) {
        int i2;
        avatarText.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1149908634);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(avatarText) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            Modifier modifier2 = null;
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
            Tap tap = avatarText.tapAction;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (tap == null) {
                gapComposer.startReplaceGroup(512849231);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(512849232);
                boolean changedInstance = ((i2 & 7168) == 2048) | gapComposer.changedInstance(tap);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new RetroSectionKt$$ExternalSyntheticLambda5(function1, tap, 2);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                modifier2 = ImageKt.m183clickableoSLSa3U$default(companion, false, null, null, (Function0) rememberedValue, 15);
                gapComposer.end(false);
            }
            Modifier modifier3 = modifier2 == null ? companion : modifier2;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, modifier3);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            AvatarSize avatarSize = AvatarSize.Size48;
            gapComposer.startReplaceGroup(-1893102981);
            List list = avatarText.avatars;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AvatarsKt.toAvatarEntry((UiAvatar) it.next(), new AfterpaySearchViewKt$$ExternalSyntheticLambda16(16), gapComposer, 0));
            }
            final int i3 = 0;
            gapComposer.end(false);
            zzabw.HorizontalStackedAvatars(avatarSize, Tags.toPersistentList(arrayList), null, gapComposer, 6, 4);
            final int i4 = 1;
            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(Expect_jvmKt.rememberComposableLambda(-2047773054, new Function2() { // from class: com.squareup.cash.afterpayapplet.views.homesection.AvatarTextSectionKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i3;
                    AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AvatarText avatarText2 = avatarText;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                String str = avatarText2.titleText;
                                TextStyle textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                } else {
                                    gapComposer2.startReplaceGroup(-1762997739);
                                    gapComposer2.end(false);
                                }
                                Room.m1165Text25TpFw(0, 2, 0, 0, 1572864, 0, 4018, colors.semantic.text.prominent, (Composer) gapComposer2, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                String str2 = avatarText2.subtitleText;
                                TextStyle textStyle2 = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                                Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                if (colors2 == null) {
                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1762997739);
                                    gapComposer3.end(false);
                                }
                                Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4018, colors2.semantic.text.subtle, (Composer) gapComposer3, (Modifier) null, textStyle2, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), null, null, false, false, Expect_jvmKt.rememberComposableLambda(1688213180, new Function2() { // from class: com.squareup.cash.afterpayapplet.views.homesection.AvatarTextSectionKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AvatarText avatarText2 = avatarText;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                String str = avatarText2.titleText;
                                TextStyle textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                } else {
                                    gapComposer2.startReplaceGroup(-1762997739);
                                    gapComposer2.end(false);
                                }
                                Room.m1165Text25TpFw(0, 2, 0, 0, 1572864, 0, 4018, colors.semantic.text.prominent, (Composer) gapComposer2, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                String str2 = avatarText2.subtitleText;
                                TextStyle textStyle2 = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                                Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                if (colors2 == null) {
                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1762997739);
                                    gapComposer3.end(false);
                                }
                                Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4018, colors2.semantic.text.subtle, (Composer) gapComposer3, (Modifier) null, textStyle2, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), null, 0L, CellDefaultAccessory.Push.INSTANCE, null, gapComposer, 806879238, 1470);
            gapComposer = gapComposer;
            gapComposer.end(true);
            if (z) {
                gapComposer.startReplaceGroup(513828336);
                HomeSectionDivider(gapComposer, 0);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(513861010);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda34(modifier, avatarText, z, function1, i, 5);
        }
    }

    public static final void CreditSectionHeader(Modifier modifier, AfterpayAppletHomeContentViewModel.HomeSection.AppletCreditLineType appletCreditLineType, String str, String str2, String str3, Function0 function0, Composer composer, int i) {
        Modifier modifier2;
        Modifier.Companion companion;
        Modifier modifier3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-227219293);
        int i2 = i | 6 | (gapComposer.changed(appletCreditLineType == null ? -1 : appletCreditLineType.ordinal()) ? 32 : 16) | (gapComposer.changed(str) ? 256 : 128) | (gapComposer.changed(str2) ? 2048 : 1024) | (gapComposer.changed(str3) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changedInstance(function0) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            ComposableLambdaImpl composableLambdaImpl = null;
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
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (function0 == null) {
                gapComposer.startReplaceGroup(-327710139);
                gapComposer.end(false);
                companion = companion2;
                modifier3 = null;
            } else {
                gapComposer.startReplaceGroup(-327710138);
                boolean changed = gapComposer.changed(function0);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new y0$$ExternalSyntheticLambda0(20, function0);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(companion2, false, null, null, (Function0) rememberedValue, 15);
                companion = companion2;
                gapComposer.end(false);
                modifier3 = m183clickableoSLSa3U$default;
            }
            if (modifier3 == null) {
                modifier3 = companion;
            }
            if (str2 == null) {
                gapComposer.startReplaceGroup(-327455784);
            } else {
                gapComposer.startReplaceGroup(-327455783);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-816581096, new ToastKt$$ExternalSyntheticLambda1(str2, 15), gapComposer);
            }
            gapComposer.end(false);
            ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(661178534, new ToastKt$$ExternalSyntheticLambda1(str, 16), gapComposer);
            boolean z = (i2 & 458752) == 131072;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new y0$$ExternalSyntheticLambda0(21, function0);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            ViewfinderDefaults.SectionHeader(rememberComposableLambda, modifier3, composableLambdaImpl2, (Function0) rememberedValue2, (Function2) null, gapComposer, 6, 16);
            Updater.CompositionLocalProvider(new ProvidedValue[]{ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(Strings.getTypography(gapComposer).bodyMedium), re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer).semantic.text.subtle, ArcadeThemeKt.LocalTextColor), Recorder$$ExternalSyntheticOutline2.m(Strings.getColors(gapComposer).semantic.icon.subtle, ArcadeThemeKt.LocalIconColor)}, Expect_jvmKt.rememberComposableLambda(-1120046419, new AtmPickerGridKt$$ExternalSyntheticLambda4(15, appletCreditLineType, str3), gapComposer), gapComposer, 56);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SwipeToDismissKt$$ExternalSyntheticLambda3(i, 7, modifier2, appletCreditLineType, str, str2, str3, function0);
        }
    }

    public static final void DefaultHeader(AfterpayAppletHomeContentViewModel.HomeSection.CreditSectionHeader.DefaultCreditHeader defaultCreditHeader, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1577929858);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(defaultCreditHeader) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            AfterpayAppletHomeContentViewModel.HomeSection.AppletCreditLineType appletCreditLineType = defaultCreditHeader.appletCreditLineType;
            String str = defaultCreditHeader.titleText;
            boolean z = false;
            String str2 = defaultCreditHeader.actionText;
            String str3 = defaultCreditHeader.subtitleText;
            boolean changedInstance = gapComposer.changedInstance(defaultCreditHeader);
            if ((i2 & 112) == 32) {
                z = true;
            }
            boolean z2 = changedInstance | z;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BankingDialogKt$$ExternalSyntheticLambda5(1, (Object) defaultCreditHeader, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CreditSectionHeader(null, appletCreditLineType, str, str2, str3, (Function0) rememberedValue, gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SectionHeaderScope$$ExternalSyntheticLambda1(defaultCreditHeader, function1, i, 15);
        }
    }

    public static final void FadedCreditSection(AfterpayAppletHomeContentViewModel.HomeSection.CreditSectionHeader.FadedCreditHeader fadedCreditHeader, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2129314221);
        int i2 = (gapComposer.changedInstance(fadedCreditHeader) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ViewfinderDefaults.SectionHeader(Expect_jvmKt.rememberComposableLambda(-1353800518, new FadedCreditHeaderSectionKt$$ExternalSyntheticLambda0(fadedCreditHeader, 0), gapComposer), (Modifier) null, (Function2) null, (Function0) null, Expect_jvmKt.rememberComposableLambda(1718628662, new FadedCreditHeaderSectionKt$$ExternalSyntheticLambda0(fadedCreditHeader, 1), gapComposer), gapComposer, 24582, 14);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FadedCreditHeaderSectionKt$$ExternalSyntheticLambda0(fadedCreditHeader, i, 2);
        }
    }

    public static final void FadedHeader(AfterpayAppletHomeContentViewModel.HomeSection.CreditSectionHeader.FadedCreditHeader fadedCreditHeader, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1068117695);
        int i2 = (gapComposer.changedInstance(fadedCreditHeader) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ViewfinderDefaults.SectionHeader(Expect_jvmKt.rememberComposableLambda(-1912077594, new FadedCreditHeaderSectionKt$$ExternalSyntheticLambda0(fadedCreditHeader, 3), gapComposer), (Modifier) null, (Function2) null, (Function0) null, Expect_jvmKt.rememberComposableLambda(1876590178, new FadedCreditHeaderSectionKt$$ExternalSyntheticLambda0(fadedCreditHeader, 4), gapComposer), gapComposer, 24582, 14);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FadedCreditHeaderSectionKt$$ExternalSyntheticLambda0(fadedCreditHeader, i, 5);
        }
    }

    public static final void HomeSectionDivider(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1736023208);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
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
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            ModalKt.HorizontalDivider(6, 0, gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2));
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ReceiptUiKt$$ExternalSyntheticLambda4(i, 18);
        }
    }

    /* renamed from: HorizontalProgressBar-eopBjH0, reason: not valid java name */
    public static final void m2975HorizontalProgressBareopBjH0(Modifier modifier, long j, long j2, AfterpayAppletHomeContentViewModel.HomeSection.MoneyBarSectionHeader.ProgressBar progressBar, Composer composer, int i) {
        Modifier modifier2;
        progressBar.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-433587181);
        int i2 = i | 6 | (gapComposer.changed(j) ? 32 : 16) | (gapComposer.changed(j2) ? 256 : 128) | (gapComposer.changedInstance(progressBar) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Animatable animatable = (Animatable) rememberedValue;
            if (progressBar.isMoneyBarAnimationEnabled) {
                gapComposer.startReplaceGroup(-2028799245);
                Float valueOf = Float.valueOf(progressBar.progress);
                boolean changedInstance = gapComposer.changedInstance(animatable) | gapComposer.changedInstance(progressBar);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new MLKitTitleGenerator$prepareModel$1(animatable, progressBar, null, 5);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue2);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-2028526321);
                gapComposer.end(false);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 4.0f), 8.0f);
            boolean changedInstance2 = ((i2 & 896) == 256) | ((i2 & 112) == 32) | gapComposer.changedInstance(progressBar) | gapComposer.changedInstance(animatable);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                BorderKt$$ExternalSyntheticLambda0 borderKt$$ExternalSyntheticLambda0 = new BorderKt$$ExternalSyntheticLambda0(j, progressBar, animatable, j2);
                gapComposer.updateRememberedValue(borderKt$$ExternalSyntheticLambda0);
                rememberedValue3 = borderKt$$ExternalSyntheticLambda0;
            }
            CanvasKt.Canvas(0, gapComposer, m277height3ABfNKs, (Function1) rememberedValue3);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TaxToolTipViewKt$$ExternalSyntheticLambda1(modifier2, j, j2, progressBar, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public static final void ImageTextSection(Modifier modifier, AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.ImageText imageText, boolean z, Function1 function1, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Function1 function12;
        Modifier modifier3;
        GapComposer gapComposer;
        ?? r0;
        int i4;
        Modifier modifier4;
        Modifier.Companion companion;
        GapComposer gapComposer2;
        int i5;
        int i6;
        float f;
        imageText.getClass();
        RemoteImage remoteImage = imageText.image;
        function1.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-1328711764);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer3.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer3.changedInstance(imageText) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer3.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer3.changedInstance(function1) ? 2048 : 1024;
        }
        if (gapComposer3.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier modifier5 = i7 != 0 ? companion2 : modifier2;
            boolean z2 = remoteImage != null;
            BiasAlignment.Horizontal horizontal = z2 ? Alignment.Companion.CenterHorizontally : Alignment.Companion.Start;
            int i8 = z2 ? 3 : 5;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier5, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, horizontal, gapComposer3, 0);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer3.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
            if (remoteImage == null) {
                gapComposer3.startReplaceGroup(-579566424);
                gapComposer3.end(false);
                modifier4 = modifier5;
                companion = companion2;
                r0 = 0;
                gapComposer2 = gapComposer3;
                i4 = i3;
            } else {
                RemoteImage.ImageUrl imageUrl = remoteImage.url;
                String str = imageUrl.light;
                gapComposer3.startReplaceGroup(-579566423);
                Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                } else {
                    gapComposer3.startReplaceGroup(-1762997739);
                    gapComposer3.end(false);
                }
                if (!colors.isLight) {
                    String str2 = imageUrl.dark;
                    if (StringsKt.isBlank(str2)) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        str = str2;
                    }
                }
                SpacerKt.Spacer(gapComposer3, SizeKt.m277height3ABfNKs(companion2, 32.0f));
                r0 = 0;
                i4 = i3;
                modifier4 = modifier5;
                companion = companion2;
                AsyncImageKt.m1438AsyncImage10Xjiaw(str, null, SpacerKt.m300paddingVpY3zN4$default(SizeKt.m290width3ABfNKs(companion2, 250.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2), null, null, null, gapComposer3, 432, 2040);
                gapComposer2 = gapComposer3;
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
                gapComposer2.end(false);
            }
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2);
            String str3 = imageText.titleText;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
            int i9 = i4;
            GapComposer gapComposer4 = gapComposer2;
            Room.m1165Text25TpFw(0, 0, 0, i8, 48, 0, 3832, 0L, (Composer) gapComposer4, m300paddingVpY3zN4$default, ((Typography) gapComposer2.consume(staticProvidableCompositionLocal)).hero, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
            String str4 = imageText.subtitleText;
            if (str4 == null) {
                gapComposer4.startReplaceGroup(-578937155);
                gapComposer4.end(r0);
                i5 = i9;
                i6 = 2;
                f = RecyclerView.DECELERATION_RATE;
            } else {
                re$$ExternalSyntheticOutline0.m(gapComposer4, -578937154, companion, 16.0f, gapComposer4);
                Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2);
                TextStyle textStyle = ((Typography) gapComposer4.consume(staticProvidableCompositionLocal)).bodyMedium;
                Colors colors2 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, (boolean) r0);
                } else {
                    gapComposer4.startReplaceGroup(-1762997739);
                    gapComposer4.end(r0);
                }
                i5 = i9;
                i6 = 2;
                f = 0.0f;
                Room.m1165Text25TpFw(0, 0, 0, i8, 48, 0, 3824, colors2.semantic.text.subtle, (Composer) gapComposer4, m300paddingVpY3zN4$default2, textStyle, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                gapComposer4.end(r0);
            }
            AfterpayAppletHomeContentViewModel.HomeSection.ButtonModel buttonModel = imageText.button;
            if (buttonModel == null) {
                gapComposer4.startReplaceGroup(-578608555);
                gapComposer4.end(r0);
                function12 = function1;
            } else {
                re$$ExternalSyntheticOutline0.m(gapComposer4, -578608554, companion, 24.0f, gapComposer4);
                Modifier m300paddingVpY3zN4$default3 = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, f, i6);
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1657798526, new ImageTextSectionKt$$ExternalSyntheticLambda0(buttonModel, r0), gapComposer4);
                ButtonProminence buttonProminence = buttonModel.buttonProminence;
                boolean changedInstance = gapComposer4.changedInstance(buttonModel) | ((i5 & 7168) == 2048 ? true : r0);
                Object rememberedValue = gapComposer4.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    function12 = function1;
                    rememberedValue = new ImageTextSectionKt$$ExternalSyntheticLambda1(function12, buttonModel, r0);
                    gapComposer4.updateRememberedValue(rememberedValue);
                } else {
                    function12 = function1;
                }
                ArcadeElement.Element.ButtonCta(m300paddingVpY3zN4$default3, rememberComposableLambda, buttonProminence, (Function0) rememberedValue, gapComposer4, 54);
                gapComposer4.end(r0);
            }
            if (z) {
                gapComposer4.startReplaceGroup(-578010006);
                HomeSectionDivider(gapComposer4, r0);
                gapComposer4.end(r0);
            } else {
                gapComposer4.startReplaceGroup(-577977332);
                gapComposer4.end(r0);
            }
            gapComposer4.end(true);
            modifier3 = modifier4;
            gapComposer = gapComposer4;
        } else {
            function12 = function1;
            gapComposer3.skipToGroupEnd();
            modifier3 = modifier2;
            gapComposer = gapComposer3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new IconButtonKt$$ExternalSyntheticLambda0(modifier3, (Object) imageText, z, (Object) function12, i, i2, 9);
        }
    }

    public static final void LegalSection(AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.Legal legal, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        int i3;
        Modifier.Companion companion;
        boolean z;
        legal.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1812488702);
        int i4 = (gapComposer2.changedInstance(legal) ? 4 : 2) | i | (gapComposer2.changedInstance(function1) ? 32 : 16);
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion2, 1.0f), 32.0f, RecyclerView.DECELERATION_RATE, 32.0f, 40.0f, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m302paddingqDBjuR0$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            String str = legal.iconId;
            if (str == null) {
                gapComposer2.startReplaceGroup(-1916658345);
                gapComposer2.end(false);
                i2 = -1762997739;
                i3 = -1762997026;
                gapComposer = gapComposer2;
                z = false;
            } else {
                gapComposer2.startReplaceGroup(-1916658344);
                Icons.Companion.getClass();
                Icons icons = zzd.get(str);
                if (icons == null) {
                    gapComposer2.startReplaceGroup(-659320123);
                    gapComposer2.end(false);
                    companion = companion2;
                    i2 = -1762997739;
                    i3 = -1762997026;
                    gapComposer = gapComposer2;
                    z = false;
                } else {
                    gapComposer2.startReplaceGroup(-659320122);
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    long j = colors.semantic.icon.standard;
                    i2 = -1762997739;
                    gapComposer = gapComposer2;
                    i3 = -1762997026;
                    companion = companion2;
                    z = false;
                    Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, j, gapComposer, 48, 4);
                    gapComposer.end(false);
                }
                re$$ExternalSyntheticOutline0.m(companion, 12.0f, gapComposer, z);
            }
            String str2 = legal.legalText;
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
            Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, i3, gapComposer, z);
            } else {
                gapComposer.startReplaceGroup(i2);
                gapComposer.end(z);
            }
            long j2 = colors2.semantic.text.subtle;
            if ((i4 & 112) == 32) {
                z = true;
            }
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SwipeToDismissKt$$ExternalSyntheticLambda4(22, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            gapComposer2 = gapComposer;
            LazyDslKt.m304MarkdownTextpCuZGqc(str2, (Function2) rememberedValue, null, textStyle, j2, null, null, null, 0, 0, 3, gapComposer2, 0, 996);
            gapComposer2.end(true);
        } else {
            gapComposer2.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AtmPickerGridKt$$ExternalSyntheticLambda4(legal, function1, i, 16);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MoneyBarCreditHeaderSection(AfterpayAppletHomeContentViewModel.HomeSection.MoneyBarSectionHeader moneyBarSectionHeader, Modifier modifier, Function1 function1, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        Modifier.Companion companion;
        String str;
        AfterpayAppletHomeContentViewModel.HomeSection.MoneyBarSectionHeader.ProgressBar progressBar;
        boolean z;
        Modifier modifier4;
        ?? r6;
        Modifier modifier5;
        GapComposer gapComposer;
        String format2;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        boolean z2;
        Color m;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        GapComposer gapComposer2;
        AfterpayAppletHomeContentViewModel.HomeSection.MoneyBarSectionHeader moneyBarSectionHeader2 = moneyBarSectionHeader;
        TappableIcon tappableIcon = moneyBarSectionHeader2.infoIcon;
        function1.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(420519515);
        Applier applier = gapComposer3.applier;
        if ((i & 6) == 0) {
            i3 = (gapComposer3.changedInstance(moneyBarSectionHeader2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer3.changed(modifier2) ? 32 : 16;
            if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                i3 |= gapComposer3.changedInstance(function1) ? 256 : 128;
            }
            if (gapComposer3.shouldExecute(i3 & 1, (i3 & 147) == 146)) {
                gapComposer3.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                Modifier modifier6 = i4 != 0 ? companion2 : modifier2;
                String str2 = moneyBarSectionHeader2.progressEndText;
                AfterpayAppletHomeContentViewModel.HomeSection.MoneyBarSectionHeader.ProgressBar progressBar2 = moneyBarSectionHeader2.progressBar;
                boolean z3 = moneyBarSectionHeader2.isEnabled;
                Tap tap = tappableIcon != null ? tappableIcon.tapAction : null;
                Object obj = Composer.Companion.Empty;
                if (tap == null) {
                    gapComposer3.startReplaceGroup(-722510222);
                    gapComposer3.end(false);
                    progressBar = progressBar2;
                    z = z3;
                    gapComposer = gapComposer3;
                    companion = companion2;
                    modifier4 = modifier6;
                    modifier5 = null;
                    str = str2;
                    r6 = 0;
                } else {
                    gapComposer3.startReplaceGroup(-722510221);
                    Tap tap2 = tap;
                    int i5 = i3;
                    GapComposer gapComposer4 = gapComposer3;
                    companion = companion2;
                    str = str2;
                    progressBar = progressBar2;
                    z = z3;
                    RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer4, 0, 15);
                    Object rememberedValue = gapComposer4.rememberedValue();
                    if (rememberedValue == obj) {
                        rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer4);
                    }
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
                    boolean changedInstance = ((i5 & 896) == 256) | gapComposer4.changedInstance(tap2);
                    Object rememberedValue2 = gapComposer4.rememberedValue();
                    if (changedInstance || rememberedValue2 == obj) {
                        rememberedValue2 = new RetroSectionKt$$ExternalSyntheticLambda5(function1, tap2, 3);
                        gapComposer4.updateRememberedValue(rememberedValue2);
                    }
                    Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(modifier6, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, null, null, (Function0) rememberedValue2, 28);
                    modifier4 = modifier6;
                    r6 = 0;
                    gapComposer4.end(false);
                    modifier5 = m182clickableO2vRcR0$default;
                    gapComposer = gapComposer4;
                }
                Modifier modifier7 = modifier5 == null ? modifier4 : modifier5;
                AfterpayAppletHomeContentViewModel.HomeSection.MoneyBarSectionHeader.ProgressBar progressBar3 = progressBar;
                if (progressBar3.progress >= 1.0f) {
                    gapComposer.startReplaceGroup(-722156976);
                    str.getClass();
                    ArrayMap arrayMap = new ArrayMap(1);
                    arrayMap.put("creditLimit", str);
                    format2 = new MessageFormat(Room.stringResource(gapComposer, R.string.money_bar_semantics_full_credit)).format(arrayMap);
                    format2.getClass();
                    gapComposer.end(r6);
                } else {
                    String str3 = str;
                    gapComposer.startReplaceGroup(-722064658);
                    String str4 = moneyBarSectionHeader2.amount;
                    str4.getClass();
                    str3.getClass();
                    ArrayMap arrayMap2 = new ArrayMap(2);
                    arrayMap2.put("creditAmount", str4);
                    arrayMap2.put("creditLimit", str3);
                    format2 = new MessageFormat(Room.stringResource(gapComposer, R.string.money_bar_semantics)).format(arrayMap2);
                    format2.getClass();
                    gapComposer.end(r6);
                }
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier7, 1.0f);
                boolean changedInstance2 = gapComposer.changedInstance(moneyBarSectionHeader2) | gapComposer.changed(format2);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue3 == obj) {
                    rememberedValue3 = new CombinedModifier$$ExternalSyntheticLambda0(26, moneyBarSectionHeader2, format2);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(fillMaxWidth, (Function1) rememberedValue3);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, r6);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, clearAndSetSemantics);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                if (applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$13);
                } else {
                    gapComposer.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$15);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$16);
                Integer valueOf = Integer.valueOf(hashCode);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$17);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$18);
                BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                Arrangement$End$1 arrangement$End$1 = SpacerKt.Start;
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer, 48);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier.Companion companion3 = companion;
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion3);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$13);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$15);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$16);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$17, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$18);
                String str5 = moneyBarSectionHeader2.titleText;
                TextStyle textStyle = Strings.getTypography(gapComposer).sectionTitle;
                long j = Color.Unspecified;
                boolean z4 = z;
                GapComposer gapComposer5 = gapComposer;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, SavingsElement.Element.m4395whenEnabledIv8Zu3U(j, z4, gapComposer), (Composer) gapComposer5, (Modifier) null, textStyle, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                if (tappableIcon == null) {
                    gapComposer5.startReplaceGroup(-207377721);
                    gapComposer5.end(false);
                } else {
                    gapComposer5.startReplaceGroup(-207377720);
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion3, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
                    zzd zzdVar = Icons.Companion;
                    String str6 = tappableIcon.arcadeIconId;
                    zzdVar.getClass();
                    Icons icons = zzd.get(str6);
                    if (icons == null) {
                        icons = Icons.InformationOutline16;
                    }
                    Trace.m1191Iconww6aTOc(icons, (String) null, m302paddingqDBjuR0$default, SavingsElement.Element.m4395whenEnabledIv8Zu3U(Strings.getColors(gapComposer5).semantic.icon.standard, z4, gapComposer5), gapComposer5, 432, 0);
                    gapComposer5.end(false);
                }
                gapComposer5.end(true);
                DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer5, null);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, SavingsElement.Element.m4395whenEnabledIv8Zu3U(j, z4, gapComposer5), (Composer) gapComposer5, (Modifier) null, Strings.getTypography(gapComposer5).header, (TextLineBalancing) null, moneyBarSectionHeader2.amount, (Map) null, (Function1) null, false);
                Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion3, 1.0f), 26.0f);
                RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer5, 48);
                int hashCode3 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer5.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer5, m277height3ABfNKs);
                gapComposer5.startReusableNode();
                if (gapComposer5.inserting) {
                    layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$13;
                    gapComposer5.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$13;
                    gapComposer5.useNode();
                }
                Updater.m576setimpl(gapComposer5, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$15);
                Updater.m576setimpl(gapComposer5, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$16);
                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer5, composeUiNode$Companion$SetModifier$17, gapComposer5, ownerSnapshotObserver$onCommitAffectingLayout$12);
                Updater.m576setimpl(gapComposer5, materializeModifier3, composeUiNode$Companion$SetModifier$18);
                int ordinal = progressBar3.creditLineType.ordinal();
                if (ordinal == 0) {
                    z2 = z4;
                    gapComposer5.startReplaceGroup(1148485007);
                    m = Recorder$$ExternalSyntheticOutline1.m(gapComposer5, false, Strings.getColors(gapComposer5).semantic.text.brand);
                } else if (ordinal != 1) {
                    gapComposer5.startReplaceGroup(1243385107);
                    gapComposer5.end(false);
                    z2 = z4;
                    m = null;
                } else {
                    gapComposer5.startReplaceGroup(1148487087);
                    z2 = z4;
                    m = Recorder$$ExternalSyntheticOutline1.m(gapComposer5, false, Strings.getColors(gapComposer5).semantic.text.brand);
                }
                if (m == null) {
                    gapComposer5.startReplaceGroup(1243420106);
                    gapComposer5.end(false);
                    composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$18;
                    layoutNode$Companion$Constructor$12 = layoutNode$Companion$Constructor$1;
                    composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$15;
                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                    gapComposer2 = gapComposer5;
                    composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                } else {
                    gapComposer5.startReplaceGroup(1243420107);
                    long j2 = m.value;
                    long j3 = Strings.getColors(gapComposer5).semantic.background.standard;
                    AfterpayAppletHomeContentViewModel.HomeSection.MoneyBarSectionHeader.ProgressBar progressBar4 = moneyBarSectionHeader2.progressBar;
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$18;
                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                    composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                    composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                    layoutNode$Companion$Constructor$12 = layoutNode$Companion$Constructor$1;
                    composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$15;
                    m2975HorizontalProgressBareopBjH0(null, j3, j2, progressBar4, gapComposer5, 0);
                    gapComposer2 = gapComposer5;
                    gapComposer2.end(false);
                }
                gapComposer2.end(true);
                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion3, 1.0f);
                RowMeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, vertical, gapComposer2, 54);
                int hashCode4 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth2);
                gapComposer2.startReusableNode();
                if (gapComposer2.inserting) {
                    gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer2.useNode();
                }
                Updater.m576setimpl(gapComposer2, rowMeasurePolicy3, composeUiNode$Companion$SetModifier$14);
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer2, materializeModifier4, composeUiNode$Companion$SetModifier$1);
                moneyBarSectionHeader2 = moneyBarSectionHeader;
                gapComposer3 = gapComposer2;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, SavingsElement.Element.m4395whenEnabledIv8Zu3U(Strings.getColors(gapComposer2).semantic.text.subtle, z2, gapComposer2), (Composer) gapComposer3, (Modifier) null, Strings.getTypography(gapComposer2).bodySmall, (TextLineBalancing) null, moneyBarSectionHeader2.progressStartText, (Map) null, (Function1) null, false);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, SavingsElement.Element.m4395whenEnabledIv8Zu3U(Strings.getColors(gapComposer3).semantic.text.subtle, z2, gapComposer3), (Composer) gapComposer3, (Modifier) null, Strings.getTypography(gapComposer3).bodySmall, (TextLineBalancing) null, moneyBarSectionHeader2.progressEndText, (Map) null, (Function1) null, false);
                gapComposer3.end(true);
                gapComposer3.end(true);
                modifier3 = modifier4;
            }
            endRestartGroup = gapComposer3.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new OrderStatusRowKt$$ExternalSyntheticLambda1(moneyBarSectionHeader2, modifier3, function1, i, i2, 11);
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
        }
        if (gapComposer3.shouldExecute(i3 & 1, (i3 & 147) == 146)) {
        }
        endRestartGroup = gapComposer3.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void MoneyBarCreditSection(AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.MoneyBarSection moneyBarSection, Modifier modifier, boolean z, Function1 function1, Composer composer, int i) {
        moneyBarSection.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(343926314);
        int i2 = i | (gapComposer.changedInstance(moneyBarSection) ? 4 : 2) | (gapComposer.changed(modifier) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128) | (gapComposer.changedInstance(function1) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 >> 3;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            MoneyBarCreditHeaderSection(moneyBarSection.moneyBarSectionHeader, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), function1, gapComposer, (i3 & 896) | 48, 0);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            AfterpayAppletHomeContentViewModel.HomeSection.SectionContent sectionContent = moneyBarSection.content;
            if (sectionContent instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AvatarText) {
                gapComposer.startReplaceGroup(-808541616);
                AvatarTextSection(SpacerKt.m302paddingqDBjuR0$default(companion, 24.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AvatarText) sectionContent, false, function1, gapComposer, (i2 & 7168) | 390);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else if (sectionContent instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.IconText) {
                gapComposer.startReplaceGroup(-808347432);
                IconTextSectionKt.IconTextSection(null, (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.IconText) sectionContent, false, false, function1, gapComposer, ((i2 << 3) & 57344) | 3456, 1);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else if (sectionContent instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.ImageText) {
                gapComposer.startReplaceGroup(-808221851);
                ImageTextSection(null, (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.ImageText) sectionContent, false, function1, gapComposer, (i2 & 7168) | MLKEMEngine.KyberPolyBytes, 1);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else if (sectionContent instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.TextLines) {
                gapComposer.startReplaceGroup(-808117598);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                TextLinesSection(null, (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.TextLines) sectionContent, false, gapComposer, MLKEMEngine.KyberPolyBytes, 1);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-807996605);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            if (z) {
                gapComposer.startReplaceGroup(-1882044838);
                HomeSectionDivider(gapComposer, 0);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1882008909);
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeViewKt$$ExternalSyntheticLambda0(moneyBarSection, modifier, z, function1, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    public static final void PageHeaderSection(Modifier modifier, AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PageHeader pageHeader, boolean z, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        int i2;
        AfterpayAppletHomeContentViewModel.HomeSection.ButtonModel buttonModel;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        boolean z2;
        boolean z3;
        Arrangement$Top$1 arrangement$Top$1;
        BiasAlignment.Horizontal horizontal;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        Tap tap;
        Modifier modifier2;
        ?? r3;
        ?? r0;
        Object obj;
        Arrangement$Top$1 arrangement$Top$12;
        float f;
        int i3;
        float f2;
        GapComposer gapComposer2;
        TextStyle textStyle;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12;
        int i4;
        char c;
        char c2;
        Modifier m183clickableoSLSa3U$default;
        Object obj2;
        int i5;
        com.squareup.cash.arcade.components.button.ButtonProminence buttonProminence;
        GapComposer gapComposer3;
        AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PageHeader pageHeader2 = pageHeader;
        Function1 function12 = function1;
        pageHeader2.getClass();
        function12.getClass();
        GapComposer gapComposer4 = (GapComposer) composer;
        gapComposer4.startRestartGroup(-1141075664);
        Applier applier = gapComposer4.applier;
        int i6 = i | (gapComposer4.changed(modifier) ? 4 : 2) | (gapComposer4.changedInstance(pageHeader2) ? 32 : 16) | (gapComposer4.changed(z) ? 256 : 128) | (gapComposer4.changedInstance(function12) ? 2048 : 1024);
        if (gapComposer4.shouldExecute(i6 & 1, (i6 & 1171) != 1170)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            Arrangement$Top$1 arrangement$Top$13 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$13, horizontal2, gapComposer4, 0);
            int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer4.startReusableNode();
            if (gapComposer4.inserting) {
                gapComposer4.createNode(layoutNode$Companion$Constructor$13);
            } else {
                gapComposer4.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer4, columnMeasurePolicy, composeUiNode$Companion$SetModifier$15);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$16);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer4, valueOf, composeUiNode$Companion$SetModifier$17);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer4, materializeModifier, composeUiNode$Companion$SetModifier$18);
            AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PageHeader.AvatarCarousel avatarCarousel = pageHeader2.avatarCarousel;
            Tap tap2 = pageHeader2.tapAction;
            AfterpayAppletHomeContentViewModel.HomeSection.ButtonModel buttonModel2 = pageHeader2.button;
            if (avatarCarousel == null) {
                gapComposer4.startReplaceGroup(1124964891);
                gapComposer4.end(false);
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                i2 = i6;
                buttonModel = buttonModel2;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$13;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                r3 = 0;
                r0 = 1;
                arrangement$Top$1 = arrangement$Top$13;
                horizontal = horizontal2;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$18;
                tap = tap2;
                modifier2 = null;
            } else {
                ArrayList arrayList = avatarCarousel.avatarItems;
                gapComposer4.startReplaceGroup(1124964892);
                if (arrayList.isEmpty()) {
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                    i2 = i6;
                    buttonModel = buttonModel2;
                    layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$13;
                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                    z2 = false;
                    z3 = true;
                    arrangement$Top$1 = arrangement$Top$13;
                    horizontal = horizontal2;
                    composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                    composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                    composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$18;
                    tap = tap2;
                    modifier2 = null;
                    gapComposer4.startReplaceGroup(802005970);
                    gapComposer4.end(false);
                } else {
                    gapComposer4.startReplaceGroup(801364983);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer4, null);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-214520719, new SetPinViewKt$$ExternalSyntheticLambda4(5, function12), gapComposer4);
                    buttonModel = buttonModel2;
                    i2 = i6;
                    horizontal = horizontal2;
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                    composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                    composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                    composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$18;
                    tap = tap2;
                    layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$13;
                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                    arrangement$Top$1 = arrangement$Top$13;
                    z3 = true;
                    modifier2 = null;
                    z2 = false;
                    Section.Header.m3609FloatingTileRow9QcgTRs(arrayList, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13.0f, 0L, 0.0d, rememberComposableLambda, gapComposer4, 1575936);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer4, null);
                    gapComposer4.end(false);
                }
                gapComposer4.end(z2);
                r0 = z3;
                r3 = z2;
            }
            RemoteImage remoteImage = pageHeader2.image;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (remoteImage == null) {
                gapComposer4.startReplaceGroup(1125745223);
                gapComposer4.end(r3);
                arrangement$Top$12 = arrangement$Top$1;
                f = 0.0f;
                gapComposer2 = gapComposer4;
                i3 = 2;
                f2 = 16.0f;
            } else {
                RemoteImage.ImageUrl imageUrl = remoteImage.url;
                Object obj3 = imageUrl.light;
                gapComposer4.startReplaceGroup(1125745224);
                Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, (boolean) r3);
                } else {
                    gapComposer4.startReplaceGroup(-1762997739);
                    gapComposer4.end(r3);
                }
                if (!colors.isLight) {
                    String str = imageUrl.dark;
                    boolean isBlank = StringsKt.isBlank(str);
                    Object obj4 = str;
                    if (isBlank) {
                        obj4 = modifier2;
                    }
                    if (obj4 != null) {
                        obj = obj4;
                        DBUtil.SpacerWithinSectionSmall(r3, r0, gapComposer4, modifier2);
                        Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(Alignment.Companion.CenterHorizontally, SizeKt.fillMaxWidth(companion, 1.0f));
                        ((DefaultSizes) gapComposer4.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        DefaultSizes.spacing.getClass();
                        arrangement$Top$12 = arrangement$Top$1;
                        f = 0.0f;
                        i3 = 2;
                        f2 = 16.0f;
                        AsyncImageKt.m1438AsyncImage10Xjiaw(obj, null, SpacerKt.m300paddingVpY3zN4$default(m, 16.0f, RecyclerView.DECELERATION_RATE, 2), null, null, null, gapComposer4, 48, 2040);
                        GapComposer gapComposer5 = gapComposer4;
                        DBUtil.SpacerWithinSectionSmall(r3, r0, gapComposer5, modifier2);
                        gapComposer5.end(r3);
                        gapComposer2 = gapComposer5;
                    }
                }
                obj = obj3;
                DBUtil.SpacerWithinSectionSmall(r3, r0, gapComposer4, modifier2);
                Modifier m2 = Request$Priority$EnumUnboxingLocalUtility.m(Alignment.Companion.CenterHorizontally, SizeKt.fillMaxWidth(companion, 1.0f));
                ((DefaultSizes) gapComposer4.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                arrangement$Top$12 = arrangement$Top$1;
                f = 0.0f;
                i3 = 2;
                f2 = 16.0f;
                AsyncImageKt.m1438AsyncImage10Xjiaw(obj, null, SpacerKt.m300paddingVpY3zN4$default(m2, 16.0f, RecyclerView.DECELERATION_RATE, 2), null, null, null, gapComposer4, 48, 2040);
                GapComposer gapComposer52 = gapComposer4;
                DBUtil.SpacerWithinSectionSmall(r3, r0, gapComposer52, modifier2);
                gapComposer52.end(r3);
                gapComposer2 = gapComposer52;
            }
            if (buttonModel != null) {
                gapComposer2.startReplaceGroup(1126317391);
                textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).hero;
                gapComposer2.end(r3);
            } else {
                gapComposer2.startReplaceGroup(1126368231);
                textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).numeralSmall;
                gapComposer2.end(r3);
            }
            TextStyle textStyle2 = textStyle;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, f2, f, i3);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal, gapComposer2, r3);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                layoutNode$Companion$Constructor$12 = layoutNode$Companion$Constructor$1;
                gapComposer2.createNode(layoutNode$Companion$Constructor$12);
            } else {
                layoutNode$Companion$Constructor$12 = layoutNode$Companion$Constructor$1;
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$19 = composeUiNode$Companion$SetModifier$1;
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$19);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$13 = ownerSnapshotObserver$onCommitAffectingLayout$1;
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$13);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            pageHeader2 = pageHeader;
            GapComposer gapComposer6 = gapComposer2;
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = layoutNode$Companion$Constructor$12;
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$110 = composeUiNode$Companion$SetModifier$12;
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$111 = composeUiNode$Companion$SetModifier$13;
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$112 = composeUiNode$Companion$SetModifier$14;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer6, (Modifier) null, textStyle2, (TextLineBalancing) null, pageHeader2.titleText, (Map) null, (Function1) null, false);
            Object obj5 = Composer.Companion.Empty;
            Tap tap3 = tap;
            if (tap3 == null) {
                gapComposer6.startReplaceGroup(-58329830);
                gapComposer6.end(r3);
                m183clickableoSLSa3U$default = modifier2;
                i4 = i2;
                c = 2048;
            } else {
                gapComposer6.startReplaceGroup(-58329829);
                Role role = new Role(r3);
                i4 = i2;
                c = 2048;
                boolean changedInstance = gapComposer6.changedInstance(tap3) | ((i4 & 7168) == 2048 ? r0 : r3);
                Object rememberedValue = gapComposer6.rememberedValue();
                if (changedInstance || rememberedValue == obj5) {
                    c2 = 4;
                    rememberedValue = new RetroSectionKt$$ExternalSyntheticLambda5(function1, tap3, 4);
                    gapComposer6.updateRememberedValue(rememberedValue);
                } else {
                    c2 = 4;
                }
                m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(companion, false, null, role, (Function0) rememberedValue, 11);
                gapComposer6.end(r3);
            }
            if (m183clickableoSLSa3U$default == null) {
                m183clickableoSLSa3U$default = companion;
            }
            String str2 = pageHeader2.subtitleText;
            if (str2 == null) {
                gapComposer6.startReplaceGroup(-58168909);
                gapComposer6.end(r3);
                obj2 = obj5;
                i5 = i4;
            } else {
                gapComposer6.startReplaceGroup(-58168908);
                DBUtil.SpacerWithinSectionSmall(r3, r0, gapComposer6, modifier2);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer6, 48);
                int hashCode3 = Long.hashCode(gapComposer6.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer6.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer6, m183clickableoSLSa3U$default);
                gapComposer6.startReusableNode();
                if (gapComposer6.inserting) {
                    gapComposer6.createNode(layoutNode$Companion$Constructor$14);
                } else {
                    gapComposer6.useNode();
                }
                Updater.m576setimpl(gapComposer6, rowMeasurePolicy, composeUiNode$Companion$SetModifier$19);
                Updater.m576setimpl(gapComposer6, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$110);
                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer6, composeUiNode$Companion$SetModifier$111, gapComposer6, ownerSnapshotObserver$onCommitAffectingLayout$13);
                Updater.m576setimpl(gapComposer6, materializeModifier3, composeUiNode$Companion$SetModifier$112);
                long j = Strings.getColors(gapComposer6).semantic.text.subtle;
                TextStyle textStyle3 = Strings.getTypography(gapComposer6).bodyMedium;
                HorizontalAlignmentLine horizontalAlignmentLine = AlignmentLinesKt.FirstLineCenter;
                obj2 = obj5;
                i5 = i4;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer6, (Modifier) new WithAlignmentLineElement(horizontalAlignmentLine), textStyle3, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                if (tap3 == null) {
                    gapComposer6.startReplaceGroup(1616123624);
                    gapComposer6.end(r3);
                } else {
                    gapComposer6.startReplaceGroup(1616123625);
                    Trace.m1191Iconww6aTOc(Icons.SubtlePush16, (String) null, new WithAlignmentLineElement(horizontalAlignmentLine), 0L, gapComposer6, 54, 8);
                    gapComposer6.end(r3);
                }
                gapComposer6.end(r0);
                gapComposer6.end(r3);
                modifier2 = null;
            }
            DBUtil.SpacerWithinSectionMedium(r3, r0, gapComposer6, modifier2);
            if (buttonModel == null) {
                gapComposer6.startReplaceGroup(-57517227);
                gapComposer6.end(r3);
                function12 = function1;
                gapComposer3 = gapComposer6;
            } else {
                gapComposer6.startReplaceGroup(-57517226);
                AfterpayAppletHomeContentViewModel.HomeSection.ButtonModel buttonModel3 = buttonModel;
                boolean changedInstance2 = gapComposer6.changedInstance(buttonModel3) | ((i5 & 7168) == 2048 ? r0 : r3);
                Object rememberedValue2 = gapComposer6.rememberedValue();
                if (changedInstance2 || rememberedValue2 == obj2) {
                    function12 = function1;
                    rememberedValue2 = new ImageTextSectionKt$$ExternalSyntheticLambda1(function12, buttonModel3, r0);
                    gapComposer6.updateRememberedValue(rememberedValue2);
                } else {
                    function12 = function1;
                }
                Function0 function0 = (Function0) rememberedValue2;
                int i7 = PageHeaderSectionKt$WhenMappings.$EnumSwitchMapping$0[buttonModel3.buttonProminence.ordinal()];
                if (i7 == r0) {
                    buttonProminence = com.squareup.cash.arcade.components.button.ButtonProminence.STANDARD;
                } else if (i7 == 2) {
                    buttonProminence = com.squareup.cash.arcade.components.button.ButtonProminence.PROMINENT;
                } else if (i7 == 3) {
                    buttonProminence = com.squareup.cash.arcade.components.button.ButtonProminence.SUBTLE;
                } else {
                    if (i7 != 4) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    buttonProminence = com.squareup.cash.arcade.components.button.ButtonProminence.STANDARD;
                }
                coil3.size.SizeKt.ButtonCompact(function0, null, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-1351407555, new ImageTextSectionKt$$ExternalSyntheticLambda0(buttonModel3, r0), gapComposer6), gapComposer6, 1572864, 58);
                GapComposer gapComposer7 = gapComposer6;
                gapComposer7.end(r3);
                gapComposer3 = gapComposer7;
            }
            gapComposer3.end(r0);
            if (z) {
                gapComposer3.startReplaceGroup(1128279226);
                HomeSectionDivider(gapComposer3, r3);
                gapComposer3.end(r3);
            } else {
                gapComposer3.startReplaceGroup(1128311900);
                gapComposer3.end(r3);
            }
            gapComposer3.end(r0);
            gapComposer = gapComposer3;
        } else {
            gapComposer4.skipToGroupEnd();
            gapComposer = gapComposer4;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeViewKt$$ExternalSyntheticLambda0(modifier, pageHeader2, z, function12, i, 4);
        }
    }

    public static final void PaymentManagementSection(Modifier modifier, AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PaymentManagement paymentManagement, boolean z, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        Modifier m183clickableoSLSa3U$default;
        paymentManagement.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1743747925);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (gapComposer2.changedInstance(paymentManagement) ? 32 : 16);
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer2.changedInstance(function1) ? 2048 : 1024;
        }
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(function0);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Tap tap = paymentManagement.sectionHeader.tapAction;
            Object obj = Composer.Companion.Empty;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (tap == null) {
                gapComposer2.startReplaceGroup(908163734);
                gapComposer2.end(false);
                m183clickableoSLSa3U$default = null;
            } else {
                gapComposer2.startReplaceGroup(908163735);
                boolean changedInstance = ((i3 & 7168) == 2048) | gapComposer2.changedInstance(tap);
                Object rememberedValue = gapComposer2.rememberedValue();
                if (changedInstance || rememberedValue == obj) {
                    rememberedValue = new RetroSectionKt$$ExternalSyntheticLambda5(function1, tap, 5);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(companion, false, null, null, (Function0) rememberedValue, 15);
                gapComposer2.end(false);
            }
            if (m183clickableoSLSa3U$default == null) {
                m183clickableoSLSa3U$default = companion;
            }
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1990106386, new PaymentManagementSectionKt$$ExternalSyntheticLambda1(paymentManagement, 0), gapComposer2);
            int i4 = i3 & 7168;
            boolean changedInstance2 = gapComposer2.changedInstance(paymentManagement) | (i4 == 2048);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changedInstance2 || rememberedValue2 == obj) {
                rememberedValue2 = new BalanceFeedKt$$ExternalSyntheticLambda5(27, paymentManagement, function1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            gapComposer = gapComposer2;
            ViewfinderDefaults.SectionHeader(rememberComposableLambda, m183clickableoSLSa3U$default, f135lambda$1637449872, (Function0) rememberedValue2, (Function2) null, gapComposer, 390, 16);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            AfterpaySearchViewKt.AfterpayListUnordered(432, gapComposer, Expect_jvmKt.rememberComposableLambda(-1446055760, new BalanceFeedKt$$ExternalSyntheticLambda9(paymentManagement, 18), gapComposer), null, false);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            AfterpayAppletHomeContentViewModel.HomeSection.ButtonModel buttonModel = paymentManagement.paymentButton;
            if (buttonModel == null) {
                gapComposer.startReplaceGroup(910477822);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(910477823);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1133933068, new ImageTextSectionKt$$ExternalSyntheticLambda0(buttonModel, 2), gapComposer);
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2);
                ButtonProminence buttonProminence = buttonModel.buttonProminence;
                boolean changedInstance3 = (i4 == 2048) | gapComposer.changedInstance(buttonModel);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changedInstance3 || rememberedValue3 == obj) {
                    rememberedValue3 = new ImageTextSectionKt$$ExternalSyntheticLambda1(function1, buttonModel, 2);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                ArcadeElement.Element.ButtonCta(m300paddingVpY3zN4$default, rememberComposableLambda2, buttonProminence, (Function0) rememberedValue3, gapComposer, 54);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            if (z) {
                gapComposer.startReplaceGroup(911130187);
                HomeSectionDivider(gapComposer, 0);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(911162861);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda34(modifier, paymentManagement, z, function1, i, 6);
        }
    }

    public static final void RetroAccessory(RealCellActivityAccessoryScope realCellActivityAccessoryScope, RetroTransaction retroTransaction, Function2 function2, Composer composer, int i) {
        int i2;
        RetroTransaction.Button button = retroTransaction.inlineButton;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(256812638);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(realCellActivityAccessoryScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(retroTransaction) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function2) ? 256 : 128;
        }
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (button != null) {
            gapComposer.startReplaceGroup(1357787600);
            if (button == null) {
                gapComposer.startReplaceGroup(1357787599);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1357787600);
                boolean changedInstance = gapComposer.changedInstance(button) | ((i2 & 896) == 256) | gapComposer.changedInstance(retroTransaction);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (changedInstance || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new CopyCodeKt$$ExternalSyntheticLambda4(6, function2, button, retroTransaction);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Function0 function0 = (Function0) rememberedValue;
                boolean changedInstance2 = gapComposer.changedInstance(button);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new RetroCellActivityKt$$ExternalSyntheticLambda9(button, 0);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                realCellActivityAccessoryScope.button(function0, (Function1) rememberedValue2);
                gapComposer.end(false);
            }
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(1357999113);
            realCellActivityAccessoryScope.amount(Expect_jvmKt.rememberComposableLambda(1100264850, new RetroCellActivityKt$$ExternalSyntheticLambda1(retroTransaction, 1), gapComposer));
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CopyCodeKt$$ExternalSyntheticLambda10(realCellActivityAccessoryScope, retroTransaction, function2, i, 3);
        }
    }

    public static final void RetroAvatar(StackedAvatarViewModel stackedAvatarViewModel, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1698593120);
        int i2 = (gapComposer.changed(stackedAvatarViewModel) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            boolean z = stackedAvatarViewModel instanceof StackedAvatarViewModel.Single;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z) {
                gapComposer.startReplaceGroup(-516953216);
                AvatarSize avatarSize = AvatarSize.Size48;
                AvatarEntry avatarEntry = AvatarsKt.toAvatarEntry(((StackedAvatarViewModel.Single) stackedAvatarViewModel).avatar, null, null, gapComposer, 8, 3);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = new MotionKt$$ExternalSyntheticLambda0(18);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                TextViewKt.Avatar(avatarSize, avatarEntry, RippleKt.clickableWithUnboundedRipple(companion, (Function0) rememberedValue, gapComposer), false, gapComposer, 6, 24);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else if (stackedAvatarViewModel instanceof StackedAvatarViewModel.Duo) {
                gapComposer.startReplaceGroup(-516655616);
                DiagonalAvatarValues diagonalAvatarValues = DiagonalAvatarValues.Size48;
                StackedAvatarViewModel.Duo duo = (StackedAvatarViewModel.Duo) stackedAvatarViewModel;
                AvatarEntry avatarEntry2 = AvatarsKt.toAvatarEntry(duo.backAvatar, null, null, gapComposer, 8, 3);
                AvatarEntry avatarEntry3 = AvatarsKt.toAvatarEntry(duo.frontAvatar, null, null, gapComposer, 8, 3);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new MotionKt$$ExternalSyntheticLambda0(19);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                AudioConfigUtil.DiagonalStackedAvatars(diagonalAvatarValues, avatarEntry2, avatarEntry3, RippleKt.clickableWithUnboundedRipple(companion, (Function0) rememberedValue2, gapComposer), gapComposer, 6, 0);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else {
                if (!(stackedAvatarViewModel instanceof StackedAvatarViewModel.Trio)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 260418232, false);
                }
                gapComposer.startReplaceGroup(-516274719);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EarnerAppletTileKt$$ExternalSyntheticLambda0(stackedAvatarViewModel, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v6 */
    public static final void RetroCellActivity(Modifier modifier, List list, Function1 function1, Function2 function2, Function2 function22, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        ComposableLambdaImpl composableLambdaImpl;
        ComposableLambdaImpl composableLambdaImpl2;
        list.getClass();
        function2.getClass();
        function22.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-759506094);
        int i2 = 256;
        int i3 = i | 6 | (gapComposer2.changedInstance(list) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128) | (gapComposer2.changedInstance(function2) ? 2048 : 1024) | (gapComposer2.changedInstance(function22) ? 16384 : PKIFailureInfo.certRevoked);
        boolean z = 0;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer2.startReplaceGroup(-1143459788);
            Iterator it = list.iterator();
            GapComposer gapComposer3 = gapComposer2;
            while (it.hasNext()) {
                RetroTransaction retroTransaction = (RetroTransaction) it.next();
                boolean changedInstance = gapComposer3.changedInstance(retroTransaction) | ((i3 & 896) == i2 ? true : z);
                Object rememberedValue = gapComposer3.rememberedValue();
                Object obj = Composer.Companion.Empty;
                if (changedInstance || rememberedValue == obj) {
                    rememberedValue = new BalanceFeedKt$$ExternalSyntheticLambda5(28, retroTransaction, function1);
                    gapComposer3.updateRememberedValue(rememberedValue);
                }
                Modifier onVisible$default = VisibleKt.onVisible$default(companion, (Function0) rememberedValue);
                if (StringsKt.isBlank(retroTransaction.subtitle)) {
                    gapComposer3.startReplaceGroup(-1493034243);
                    gapComposer3.end(z);
                    composableLambdaImpl = null;
                } else {
                    gapComposer3.startReplaceGroup(-1493269843);
                    composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(1466573821, new RetroCellActivityKt$$ExternalSyntheticLambda1(retroTransaction, z), gapComposer3);
                    gapComposer3.end(z);
                }
                if (StringsKt.isBlank(retroTransaction.tertiaryLabel)) {
                    gapComposer3.startReplaceGroup(-1492696963);
                    gapComposer3.end(z);
                    composableLambdaImpl2 = null;
                } else {
                    gapComposer3.startReplaceGroup(-1492935446);
                    composableLambdaImpl2 = Expect_jvmKt.rememberComposableLambda(-1872280580, new RetroCellActivityKt$$ExternalSyntheticLambda1(retroTransaction, 2), gapComposer3);
                    gapComposer3.end(z);
                }
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-607091539, new BalanceFeedKt$$ExternalSyntheticLambda9(retroTransaction, 19), gapComposer3);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1060500520, new RetroCellActivityKt$$ExternalSyntheticLambda1(retroTransaction, 3), gapComposer3);
                ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-959914490, new BrandSheetViewKt$$ExternalSyntheticLambda1(24, retroTransaction, function22), gapComposer3);
                int i4 = i3;
                boolean changedInstance2 = ((i3 & 7168) == 2048) | gapComposer3.changedInstance(retroTransaction);
                Object rememberedValue2 = gapComposer3.rememberedValue();
                if (changedInstance2 || rememberedValue2 == obj) {
                    rememberedValue2 = new BalanceFeedKt$$ExternalSyntheticLambda5(29, retroTransaction, function2);
                    gapComposer3.updateRememberedValue(rememberedValue2);
                }
                GapComposer gapComposer4 = gapComposer3;
                CellDefaultKt.m3388CellActivity6RhP_wg(rememberComposableLambda, rememberComposableLambda2, rememberComposableLambda3, (Function0) rememberedValue2, onVisible$default, null, composableLambdaImpl, composableLambdaImpl2, false, 0L, gapComposer4, 438, 800);
                z = 0;
                companion = companion;
                gapComposer3 = gapComposer4;
                i3 = i4;
                i2 = 256;
            }
            gapComposer = gapComposer3;
            gapComposer.end(z);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda4(modifier2, (Object) list, (Object) function1, (Object) function2, (Object) function22, i, 4);
        }
    }

    public static final void StandaloneCreditHeaderSection(Modifier modifier, AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.StandaloneCreditSectionHeader standaloneCreditSectionHeader, boolean z, Function1 function1, Composer composer, int i) {
        standaloneCreditSectionHeader.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(898768598);
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(standaloneCreditSectionHeader) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128) | (gapComposer.changedInstance(function1) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
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
            AfterpayAppletHomeContentViewModel.HomeSection.CreditSectionHeader creditSectionHeader = standaloneCreditSectionHeader.header;
            if (creditSectionHeader instanceof AfterpayAppletHomeContentViewModel.HomeSection.CreditSectionHeader.DefaultCreditHeader) {
                gapComposer.startReplaceGroup(934724337);
                DefaultHeader((AfterpayAppletHomeContentViewModel.HomeSection.CreditSectionHeader.DefaultCreditHeader) creditSectionHeader, function1, gapComposer, (i2 >> 6) & 112);
                gapComposer.end(false);
            } else if (creditSectionHeader instanceof AfterpayAppletHomeContentViewModel.HomeSection.MoneyBarSectionHeader) {
                gapComposer.startReplaceGroup(934727038);
                MoneyBarCreditHeaderSection((AfterpayAppletHomeContentViewModel.HomeSection.MoneyBarSectionHeader) creditSectionHeader, null, function1, gapComposer, (i2 >> 3) & 896, 2);
                gapComposer.end(false);
            } else {
                if (!(creditSectionHeader instanceof AfterpayAppletHomeContentViewModel.HomeSection.CreditSectionHeader.FadedCreditHeader)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 934722422, false);
                }
                gapComposer.startReplaceGroup(934729980);
                FadedHeader((AfterpayAppletHomeContentViewModel.HomeSection.CreditSectionHeader.FadedCreditHeader) creditSectionHeader, gapComposer, 0);
                gapComposer.end(false);
            }
            AfterpayAppletHomeContentViewModel.HomeSection.SectionContent sectionContent = standaloneCreditSectionHeader.content;
            if (sectionContent == null) {
                gapComposer.startReplaceGroup(-1088041778);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1088041777);
                DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
                if (sectionContent instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AvatarText) {
                    gapComposer.startReplaceGroup(-2131940362);
                    AvatarTextSection(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, 24.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AvatarText) sectionContent, false, function1, gapComposer, (i2 & 7168) | 390);
                    gapComposer = gapComposer;
                    gapComposer.end(false);
                } else if (sectionContent instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.IconText) {
                    gapComposer.startReplaceGroup(-2131730616);
                    IconTextSectionKt.IconTextSection(null, (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.IconText) sectionContent, false, false, function1, gapComposer, ((i2 << 3) & 57344) | 3456, 1);
                    gapComposer = gapComposer;
                    gapComposer.end(false);
                } else if (sectionContent instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.TextLines) {
                    gapComposer.startReplaceGroup(-2131609716);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                    TextLinesSection(null, (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.TextLines) sectionContent, false, gapComposer, MLKEMEngine.KyberPolyBytes, 1);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-2131480849);
                    gapComposer.end(false);
                }
                gapComposer.end(false);
            }
            if (z) {
                gapComposer.startReplaceGroup(-1087384608);
                HomeSectionDivider(gapComposer, 0);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1087351934);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeViewKt$$ExternalSyntheticLambda0(modifier, standaloneCreditSectionHeader, z, function1, i, 6);
        }
    }

    public static final void StandaloneHeaderSection(Modifier modifier, AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.StandaloneHeader standaloneHeader, boolean z, Function1 function1, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        GapComposer gapComposer;
        Modifier modifier3;
        Modifier m183clickableoSLSa3U$default;
        ComposableLambdaImpl rememberComposableLambda;
        Modifier.Companion companion;
        standaloneHeader.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1687654691);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = (gapComposer2.changed(modifier2) ? 4 : 2) | i;
        }
        int i5 = i3 | (gapComposer2.changedInstance(standaloneHeader) ? 32 : 16);
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i5 |= gapComposer2.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= gapComposer2.changedInstance(function1) ? 2048 : 1024;
        }
        int i6 = i5;
        if (gapComposer2.shouldExecute(i6 & 1, (i6 & 1171) != 1170)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            modifier3 = i4 != 0 ? companion2 : modifier2;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier3, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(function0);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            AfterpayAppletHomeContentViewModel.HomeSection.Header header = standaloneHeader.header;
            Tap tap = header.tapAction;
            if (tap == null) {
                gapComposer2.startReplaceGroup(-733792268);
                gapComposer2.end(false);
                m183clickableoSLSa3U$default = null;
            } else {
                gapComposer2.startReplaceGroup(-733792267);
                boolean changedInstance = ((i6 & 7168) == 2048) | gapComposer2.changedInstance(tap);
                Object rememberedValue = gapComposer2.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new RetroSectionKt$$ExternalSyntheticLambda5(function1, tap, 6);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(companion2, false, null, null, (Function0) rememberedValue, 15);
                gapComposer2.end(false);
            }
            if (m183clickableoSLSa3U$default == null) {
                m183clickableoSLSa3U$default = companion2;
            }
            String str = header.subtitleText;
            if (str == null) {
                gapComposer2.startReplaceGroup(-733453345);
                gapComposer2.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer2.startReplaceGroup(-733453344);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1129130093, new AtmPickerGridKt$$ExternalSyntheticLambda4(17, str, standaloneHeader), gapComposer2);
                gapComposer2.end(false);
            }
            gapComposer = gapComposer2;
            ViewfinderDefaults.SectionHeader(Expect_jvmKt.rememberComposableLambda(-119941338, new ButtonBinding$$ExternalSyntheticLambda2(standaloneHeader, 9), gapComposer2), m183clickableoSLSa3U$default, header.tapAction != null ? lambda$1207689852 : null, (Function0) null, rememberComposableLambda, gapComposer, 6, 8);
            AfterpayAppletHomeContentViewModel.HomeSection.SectionContent sectionContent = standaloneHeader.content;
            if (sectionContent == null) {
                gapComposer.startReplaceGroup(-733124032);
                gapComposer.end(false);
                companion = companion2;
            } else {
                gapComposer.startReplaceGroup(-733124031);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                if (sectionContent instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AvatarText) {
                    gapComposer.startReplaceGroup(-2013127246);
                    companion = companion2;
                    AvatarTextSection(SpacerKt.m302paddingqDBjuR0$default(companion2, 24.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AvatarText) sectionContent, false, function1, gapComposer, (i6 & 7168) | 390);
                    gapComposer.end(false);
                } else {
                    companion = companion2;
                    if (sectionContent instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.IconText) {
                        gapComposer.startReplaceGroup(-2012917500);
                        IconTextSectionKt.IconTextSection(null, (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.IconText) sectionContent, false, false, function1, gapComposer, ((i6 << 3) & 57344) | 3456, 1);
                        gapComposer = gapComposer;
                        gapComposer.end(false);
                    } else if (sectionContent instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.TextLines) {
                        gapComposer.startReplaceGroup(-2012796600);
                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                        TextLinesSection(null, (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.TextLines) sectionContent, false, gapComposer, MLKEMEngine.KyberPolyBytes, 1);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-2012667733);
                        gapComposer.end(false);
                    }
                }
                gapComposer.end(false);
            }
            if (z) {
                gapComposer.startReplaceGroup(-732465901);
                HomeSectionDivider(gapComposer, 0);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-732425105);
                SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 24.0f));
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new IconButtonKt$$ExternalSyntheticLambda0(modifier3, (Object) standaloneHeader, z, (Object) function1, i, i2, 10);
        }
    }

    public static final void TextLinesSection(Modifier modifier, AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.TextLines textLines, boolean z, Composer composer, int i, int i2) {
        int i3;
        textLines.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-353367313);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        }
        int i5 = i3 | (gapComposer.changedInstance(textLines) ? 32 : 16);
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i5 |= gapComposer.changed(z) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 147) != 146)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
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
            ListOrderedKt.ListOrderedSubtle(null, Tags.toImmutableList(textLines.lineItems), gapComposer, 0);
            if (z) {
                gapComposer.startReplaceGroup(-1459805529);
                HomeSectionDivider(gapComposer, 0);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1459772855);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PasscodeKt$$ExternalSyntheticLambda2(modifier2, (Object) textLines, z, i, i2, 1);
        }
    }

    public static final long toColor(AfterpayAppletHomeContentViewModel.HomeSection.Header.SectionDisplayEffect sectionDisplayEffect, GapComposer gapComposer) {
        int ordinal = sectionDisplayEffect.ordinal();
        if (ordinal == 0) {
            gapComposer.startReplaceGroup(-551756201);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.text.standard;
            gapComposer.end(false);
            return j;
        }
        if (ordinal != 1) {
            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -551758904, false);
        }
        gapComposer.startReplaceGroup(-551753545);
        Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
        if (colors2 == null) {
            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
        } else {
            gapComposer.startReplaceGroup(-1762997739);
            gapComposer.end(false);
        }
        long j2 = colors2.semantic.text.disabled;
        gapComposer.end(false);
        return j2;
    }
}
