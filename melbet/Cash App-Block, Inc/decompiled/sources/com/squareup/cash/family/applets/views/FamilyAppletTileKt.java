package com.squareup.cash.family.applets.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TooltipKt$animateTooltip$2;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.views.sheet.LocalShortlinkSheetKt$$ExternalSyntheticLambda8;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.memory.RealWeakMemoryCache;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabw;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.agents.applets.views.AgentsAppletTile$$ExternalSyntheticLambda5;
import com.squareup.cash.agents.applets.views.AgentsAppletTileKt$$ExternalSyntheticLambda0;
import com.squareup.cash.agents.applets.views.AgentsAppletTileKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.db.contacts.Recipient$$ExternalSyntheticLambda2;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda1;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda2;
import com.squareup.cash.earnings.views.home.EarningsHomeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.family.applets.viewmodels.Allowance;
import com.squareup.cash.family.applets.viewmodels.AllowanceAppletTileViewEvent$AllowanceAppletOnClickTile;
import com.squareup.cash.family.applets.viewmodels.AllowanceAppletTileViewModel;
import com.squareup.cash.family.applets.viewmodels.ApprovedContactsAppletTileViewModel$Uninstalled;
import com.squareup.cash.family.applets.viewmodels.FamilyAppletTileViewModel;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.family.familyhub.views.FamilyHomeViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.money.applets.common.views.InstalledServiceAppletTileLayoutConfig;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.money.viewmodels.InstalledAppletTileHeaderModel;
import com.squareup.cash.money.viewmodels.InstalledServiceAppletTileContentModel;
import com.squareup.cash.score.applets.views.ScoreAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.Tags;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.slf4j.Marker;

/* loaded from: classes6.dex */
public abstract class FamilyAppletTileKt {

    /* renamed from: lambda$-1666236961, reason: not valid java name */
    public static final ComposableLambdaImpl f401lambda$1666236961 = new ComposableLambdaImpl(new AllowanceViewKt$$ExternalSyntheticLambda3(27), false, -1666236961);

    public static final void AllowanceRedesignedVisual(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1067573899);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Icons icons = Icons.RecurringAutomatic24;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            SharedUIKt.m3607ZeroBalanceIconaMcp0Q(icons, colors.semantic.icon.brand, RecyclerView.DECELERATION_RATE, gapComposer, 6, 4);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AllowanceViewKt$$ExternalSyntheticLambda3(i, 26);
        }
    }

    public static final void AvatarStackVisual(List list, AvatarSize avatarSize, int i, Composer composer, int i2) {
        GapComposer gapComposer;
        boolean z;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(484728801);
        Applier applier = gapComposer2.applier;
        int i3 = i2 | (gapComposer2.changedInstance(list) ? 4 : 2) | (gapComposer2.changed(avatarSize.ordinal()) ? 32 : 16) | (gapComposer2.changed(i) ? 256 : 128);
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            RealWeakMemoryCache realWeakMemoryCache = new RealWeakMemoryCache(1);
            gapComposer2.startReplaceGroup(234685960);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned((-avatarSize.size) / 3.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier m1459clippedOutlinewH6b6FI = realWeakMemoryCache.m1459clippedOutlinewH6b6FI(companion, RoundedCornerShapeKt.CircleShape, 3.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m1459clippedOutlinewH6b6FI);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            gapComposer2.startReplaceGroup(1800435658);
            List<StackedAvatarViewModel.Avatar> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (StackedAvatarViewModel.Avatar avatar : list2) {
                GapComposer gapComposer3 = gapComposer2;
                arrayList.add(AvatarsKt.toAvatarEntry(avatar, null, new TooltipKt$animateTooltip$2(avatar, 5), gapComposer3, 8, 1));
                gapComposer2 = gapComposer3;
            }
            gapComposer2.end(false);
            zzabw.HorizontalStackedAvatars(avatarSize, Tags.toImmutableList(arrayList), null, gapComposer2, 0, 4);
            gapComposer = gapComposer2;
            gapComposer.end(true);
            if (i > 0) {
                gapComposer.startReplaceGroup(848170144);
                z = false;
                OverflowBadge(i, avatarSize, realWeakMemoryCache.m1459clippedOutlinewH6b6FI(companion, RoundedCornerShapeKt.CircleShape, 3.0f), gapComposer, 0);
                gapComposer.end(false);
            } else {
                z = false;
                gapComposer.startReplaceGroup(848354904);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            gapComposer.end(z);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AgentsAppletTileKt$$ExternalSyntheticLambda0(list, avatarSize, i, i2, 1);
        }
    }

    public static final void FailureUI(AllowanceAppletTileViewModel.Failure failure, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1483919665);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(failure) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            String str = failure.title;
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new Recipient$$ExternalSyntheticLambda2(18);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SharedUIKt.FailedAppletTile(48, gapComposer, str, (Function0) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalShortlinkSheetKt$$ExternalSyntheticLambda8(failure, i, 13);
        }
    }

    public static final void InstalledUI(final AllowanceAppletTileViewModel.Installed installed, final AppletTile.AppletTileAppearance appletTileAppearance, final Function1 function1, Composer composer, final int i) {
        int i2;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        InstalledServiceAppletTileLayoutConfig installedServiceAppletTileLayoutConfig;
        InstalledServiceAppletTileContentModel installedServiceAppletTileContentModel;
        InstalledServiceAppletTileLayoutConfig installedServiceAppletTileLayoutConfig2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1654128976);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(installed) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(appletTileAppearance) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z = appletTileAppearance.useRedesignedTiles;
            if (z) {
                gapComposer.startReplaceGroup(1996771804);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                InstalledServiceAppletTileLayoutConfig installedServiceAppletTileLayoutConfig3 = new InstalledServiceAppletTileLayoutConfig(16.0f, 8.0f, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelSmall, InstalledServiceAppletTileLayoutConfig.VisualPosition.END, Alignment.Companion.Bottom);
                gapComposer.end(false);
                installedServiceAppletTileLayoutConfig = installedServiceAppletTileLayoutConfig3;
            } else {
                gapComposer.startReplaceGroup(1997139092);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal2)).getClass();
                DefaultSizes.spacing.getClass();
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal2)).getClass();
                InstalledServiceAppletTileLayoutConfig installedServiceAppletTileLayoutConfig4 = new InstalledServiceAppletTileLayoutConfig(8.0f, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, 24);
                gapComposer.end(false);
                installedServiceAppletTileLayoutConfig = installedServiceAppletTileLayoutConfig4;
            }
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z) {
                gapComposer.startReplaceGroup(1997252614);
                Allowance allowance = installed.allowance;
                if (allowance instanceof Allowance.None) {
                    gapComposer.startReplaceGroup(480072156);
                    String str = ((Allowance.None) allowance).title;
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    installedServiceAppletTileContentModel = new InstalledServiceAppletTileContentModel(new InstalledServiceAppletTileContentModel.Emphasis(str, colors.semantic.text.standard, null), null, null, null, 14);
                    gapComposer.end(false);
                    installedServiceAppletTileLayoutConfig2 = installedServiceAppletTileLayoutConfig;
                } else {
                    if (!(allowance instanceof Allowance.Current)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 480070061, false);
                    }
                    gapComposer.startReplaceGroup(480079229);
                    Allowance.Current current = (Allowance.Current) allowance;
                    String str2 = current.formattedAmount;
                    Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    installedServiceAppletTileLayoutConfig2 = installedServiceAppletTileLayoutConfig;
                    InstalledServiceAppletTileContentModel.Emphasis emphasis = new InstalledServiceAppletTileContentModel.Emphasis(str2, colors2.semantic.text.standard, null);
                    String str3 = current.scheduledDescription;
                    if (str3.length() > 0) {
                        StringBuilder sb = new StringBuilder();
                        String valueOf = String.valueOf(str3.charAt(0));
                        valueOf.getClass();
                        String lowerCase = valueOf.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        sb.append((Object) lowerCase);
                        sb.append(str3.substring(1));
                        str3 = sb.toString();
                    }
                    installedServiceAppletTileContentModel = new InstalledServiceAppletTileContentModel(emphasis, null, new InstalledServiceAppletTileContentModel.BriefState.Loaded(str3), null, 10);
                    gapComposer.end(false);
                }
                InstalledAppletTileHeaderModel installedAppletTileHeaderModel = new InstalledAppletTileHeaderModel(installed.title, null, null, 14);
                List listOf = CollectionsKt__CollectionsJVMKt.listOf(installedServiceAppletTileContentModel);
                boolean changedInstance = gapComposer.changedInstance(installed) | ((i2 & 896) == 256);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new Function0() { // from class: com.squareup.cash.family.applets.views.AllowanceAppletTileKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i3 = r3;
                            AllowanceAppletTileViewModel.Installed installed2 = installed;
                            Function1 function12 = function1;
                            switch (i3) {
                                case 0:
                                    function12.invoke(new AllowanceAppletTileViewEvent$AllowanceAppletOnClickTile(installed2.allowance.getUrl()));
                                    break;
                                default:
                                    function12.invoke(new AllowanceAppletTileViewEvent$AllowanceAppletOnClickTile(installed2.allowance.getUrl()));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                SharedUIKt.InstalledServiceAppletTile(installedAppletTileHeaderModel, listOf, (Function0) rememberedValue, true, null, installedServiceAppletTileLayoutConfig2, f401lambda$1666236961, gapComposer, 1576000, 16);
                gapComposer.end(false);
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i3 = 0;
                    function2 = new Function2() { // from class: com.squareup.cash.family.applets.views.AllowanceAppletTileKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = i3;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    FamilyAppletTileKt.InstalledUI(installed, appletTileAppearance, function1, composer2, Updater.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    FamilyAppletTileKt.InstalledUI(installed, appletTileAppearance, function1, composer2, Updater.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            InstalledServiceAppletTileLayoutConfig installedServiceAppletTileLayoutConfig5 = installedServiceAppletTileLayoutConfig;
            gapComposer.startReplaceGroup(1998278962);
            gapComposer.end(false);
            gapComposer.startReplaceGroup(480103971);
            AnnotatedString.Builder builder = new AnnotatedString.Builder();
            Allowance allowance2 = installed.allowance;
            if (allowance2 instanceof Allowance.None) {
                gapComposer.startReplaceGroup(1643904237);
                SpanStyle spanStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).sectionTitle.spanStyle;
                Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                int pushStyle = builder.pushStyle(SpanStyle.m973copyGSF8kmg$default(spanStyle, colors3.semantic.text.subtle, null, 0L, JpegConstants.COM_MARKER));
                try {
                    builder.append(((Allowance.None) allowance2).title);
                    builder.pop(pushStyle);
                    gapComposer.end(false);
                } finally {
                }
            } else {
                if (!(allowance2 instanceof Allowance.Current)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 191574833, false);
                }
                gapComposer.startReplaceGroup(1644186771);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = ArcadeThemeKt.LocalTypography;
                int pushStyle2 = builder.pushStyle(((Typography) gapComposer.consume(staticProvidableCompositionLocal3)).sectionTitle.spanStyle);
                try {
                    builder.append(((Allowance.Current) allowance2).formattedAmount);
                    builder.pop(pushStyle2);
                    SpanStyle spanStyle2 = ((Typography) gapComposer.consume(staticProvidableCompositionLocal3)).sectionTitle.spanStyle;
                    Colors colors4 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    int pushStyle3 = builder.pushStyle(SpanStyle.m973copyGSF8kmg$default(spanStyle2, colors4.semantic.text.subtle, null, 0L, JpegConstants.COM_MARKER));
                    try {
                        builder.append(" " + ((Allowance.Current) allowance2).scheduledDescription);
                        builder.pop(pushStyle3);
                        gapComposer.end(false);
                    } finally {
                    }
                } finally {
                }
            }
            AnnotatedString annotatedString = builder.toAnnotatedString();
            gapComposer.end(false);
            InstalledAppletTileHeaderModel installedAppletTileHeaderModel2 = new InstalledAppletTileHeaderModel(installed.title, null, null, 14);
            List listOf2 = CollectionsKt__CollectionsJVMKt.listOf(new InstalledServiceAppletTileContentModel(null, null, null, Expect_jvmKt.rememberComposableLambda(363805243, new AllowanceAppletTileKt$$ExternalSyntheticLambda8(annotatedString, 0), gapComposer), 7));
            int i4 = (gapComposer.changedInstance(installed) ? 1 : 0) | ((i2 & 896) == 256 ? 1 : 0);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (i4 != 0 || rememberedValue2 == neverEqualPolicy) {
                final int i5 = 1;
                rememberedValue2 = new Function0() { // from class: com.squareup.cash.family.applets.views.AllowanceAppletTileKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i32 = i5;
                        AllowanceAppletTileViewModel.Installed installed2 = installed;
                        Function1 function12 = function1;
                        switch (i32) {
                            case 0:
                                function12.invoke(new AllowanceAppletTileViewEvent$AllowanceAppletOnClickTile(installed2.allowance.getUrl()));
                                break;
                            default:
                                function12.invoke(new AllowanceAppletTileViewEvent$AllowanceAppletOnClickTile(installed2.allowance.getUrl()));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            SharedUIKt.InstalledServiceAppletTile(installedAppletTileHeaderModel2, listOf2, (Function0) rememberedValue2, true, null, installedServiceAppletTileLayoutConfig5, null, gapComposer, 3136, 80);
        } else {
            gapComposer.skipToGroupEnd();
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final int i6 = 1;
            function2 = new Function2() { // from class: com.squareup.cash.family.applets.views.AllowanceAppletTileKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i6;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i42) {
                        case 0:
                            FamilyAppletTileKt.InstalledUI(installed, appletTileAppearance, function1, composer2, Updater.updateChangedFlags(i | 1));
                            break;
                        default:
                            FamilyAppletTileKt.InstalledUI(installed, appletTileAppearance, function1, composer2, Updater.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public static final void LoadingUI(AllowanceAppletTileViewModel.Loading loading, AppletTile.AppletTileAppearance appletTileAppearance, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-663852865);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(loading) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(appletTileAppearance) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String str = loading.title;
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new Recipient$$ExternalSyntheticLambda2(19);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SharedUIKt.m3606LoadingServiceAppletTile942rkJo(str, (Function0) rememberedValue, RecyclerView.DECELERATION_RATE, appletTileAppearance.useRedesignedTiles, gapComposer, 48, 4);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda1(loading, appletTileAppearance, i, 21);
        }
    }

    public static final void OverflowBadge(int i, AvatarSize avatarSize, Modifier modifier, Composer composer, int i2) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1456845874);
        int i3 = i2 | (gapComposer.changed(i) ? 4 : 2) | (gapComposer.changed(avatarSize.ordinal()) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(modifier, avatarSize.size);
            long j = Strings.getColors(gapComposer).surface.money.applet.data.inactive.border;
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ImageKt.m178borderxT4_qwU(m285size3ABfNKs, 1.0f, j, roundedCornerShape), Strings.getColors(gapComposer).surface.money.applet.background, roundedCornerShape);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, Marker.ANY_NON_NULL_MARKER + i, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AgentsAppletTileKt$$ExternalSyntheticLambda1(i, avatarSize, modifier, i2, 1);
        }
    }

    public static final void UI(AllowanceAppletTileViewModel allowanceAppletTileViewModel, AppletTile.AppletTileAppearance appletTileAppearance, ScoreAppletViewsModule$$ExternalSyntheticLambda1 scoreAppletViewsModule$$ExternalSyntheticLambda1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1576327752);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(allowanceAppletTileViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(appletTileAppearance) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(scoreAppletViewsModule$$ExternalSyntheticLambda1) ? 256 : 128;
        }
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (allowanceAppletTileViewModel instanceof AllowanceAppletTileViewModel.Loading) {
            gapComposer.startReplaceGroup(1272491380);
            LoadingUI((AllowanceAppletTileViewModel.Loading) allowanceAppletTileViewModel, appletTileAppearance, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            gapComposer.end(false);
        } else if (allowanceAppletTileViewModel instanceof AllowanceAppletTileViewModel.Installed) {
            gapComposer.startReplaceGroup(1272492959);
            InstalledUI((AllowanceAppletTileViewModel.Installed) allowanceAppletTileViewModel, appletTileAppearance, scoreAppletViewsModule$$ExternalSyntheticLambda1, gapComposer, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            gapComposer.end(false);
        } else if (allowanceAppletTileViewModel instanceof AllowanceAppletTileViewModel.Uninstalled) {
            gapComposer.startReplaceGroup(1272494933);
            UninstalledUI((AllowanceAppletTileViewModel.Uninstalled) allowanceAppletTileViewModel, scoreAppletViewsModule$$ExternalSyntheticLambda1, gapComposer, ((i2 >> 3) & 112) | (i2 & 14));
            gapComposer.end(false);
        } else {
            if (!(allowanceAppletTileViewModel instanceof AllowanceAppletTileViewModel.Failure)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1272490508, false);
            }
            gapComposer.startReplaceGroup(1272496456);
            FailureUI((AllowanceAppletTileViewModel.Failure) allowanceAppletTileViewModel, gapComposer, i2 & 14);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeViewKt$$ExternalSyntheticLambda1(allowanceAppletTileViewModel, appletTileAppearance, scoreAppletViewsModule$$ExternalSyntheticLambda1, i, 13);
        }
    }

    public static final void UninstalledUI(AllowanceAppletTileViewModel.Uninstalled uninstalled, ScoreAppletViewsModule$$ExternalSyntheticLambda1 scoreAppletViewsModule$$ExternalSyntheticLambda1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1524311178);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(uninstalled) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(scoreAppletViewsModule$$ExternalSyntheticLambda1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String str = uninstalled.title;
            boolean z = false;
            String str2 = uninstalled.subtitle;
            if ((i2 & 112) == 32) {
                z = true;
            }
            boolean changedInstance = gapComposer.changedInstance(uninstalled) | z;
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ArcadeModal2Kt$$ExternalSyntheticLambda2(24, scoreAppletViewsModule$$ExternalSyntheticLambda1, uninstalled);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SharedUIKt.AppletTileRowUninstalledContent(2131231083, 0, gapComposer, str, str2, (Function0) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda1(uninstalled, scoreAppletViewsModule$$ExternalSyntheticLambda1, i, 20);
        }
    }

    public static final void UninstalledUI(ApprovedContactsAppletTileViewModel$Uninstalled approvedContactsAppletTileViewModel$Uninstalled, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, Composer composer, int i) {
        TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda12;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-600054189);
        int i2 = (gapComposer.changedInstance(approvedContactsAppletTileViewModel$Uninstalled) ? 4 : 2) | i | (gapComposer.changedInstance(taxesAppletViewsModule$$ExternalSyntheticLambda1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            taxesAppletViewsModule$$ExternalSyntheticLambda12 = taxesAppletViewsModule$$ExternalSyntheticLambda1;
            SharedUIKt.AppletTileRowUninstalledContent(2131231335, (i2 << 6) & 7168, gapComposer, approvedContactsAppletTileViewModel$Uninstalled.title, approvedContactsAppletTileViewModel$Uninstalled.subtitle, taxesAppletViewsModule$$ExternalSyntheticLambda12);
        } else {
            taxesAppletViewsModule$$ExternalSyntheticLambda12 = taxesAppletViewsModule$$ExternalSyntheticLambda1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ApprovedContactsAppletTileKt$$ExternalSyntheticLambda0(approvedContactsAppletTileViewModel$Uninstalled, taxesAppletViewsModule$$ExternalSyntheticLambda12, i, 1);
        }
    }

    public static final void UninstalledUI(FamilyAppletTileViewModel.Uninstalled uninstalled, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, Composer composer, int i) {
        TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda12;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1627188953);
        int i2 = (gapComposer.changedInstance(uninstalled) ? 4 : 2) | i | (gapComposer.changedInstance(taxesAppletViewsModule$$ExternalSyntheticLambda1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            taxesAppletViewsModule$$ExternalSyntheticLambda12 = taxesAppletViewsModule$$ExternalSyntheticLambda1;
            SharedUIKt.AppletTileRowUninstalledContent(2131231483, (i2 << 6) & 7168, gapComposer, uninstalled.title, uninstalled.subtitle, taxesAppletViewsModule$$ExternalSyntheticLambda12);
        } else {
            taxesAppletViewsModule$$ExternalSyntheticLambda12 = taxesAppletViewsModule$$ExternalSyntheticLambda1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AllowanceViewKt$$ExternalSyntheticLambda0(uninstalled, taxesAppletViewsModule$$ExternalSyntheticLambda12, i, 1);
        }
    }

    public static final void UI(ApprovedContactsAppletTileViewModel$Uninstalled approvedContactsAppletTileViewModel$Uninstalled, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2133090969);
        int i2 = (gapComposer.changedInstance(approvedContactsAppletTileViewModel$Uninstalled) ? 4 : 2) | i | (gapComposer.changedInstance(taxesAppletViewsModule$$ExternalSyntheticLambda1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else if (approvedContactsAppletTileViewModel$Uninstalled != null) {
            gapComposer.startReplaceGroup(-1201017372);
            UninstalledUI(approvedContactsAppletTileViewModel$Uninstalled, taxesAppletViewsModule$$ExternalSyntheticLambda1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            gapComposer.end(false);
        } else {
            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1201018515, false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ApprovedContactsAppletTileKt$$ExternalSyntheticLambda0(approvedContactsAppletTileViewModel$Uninstalled, taxesAppletViewsModule$$ExternalSyntheticLambda1, i, 0);
        }
    }

    public static final void InstalledUI(FamilyAppletTileViewModel.Installed installed, AppletTile.AppletTileAppearance appletTileAppearance, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, Composer composer, int i) {
        Pair pair;
        ComposableLambdaImpl composableLambdaImpl;
        ComposableLambdaImpl composableLambdaImpl2;
        InstalledServiceAppletTileContentModel.BriefState briefState;
        List listOf;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-130238509);
        int i2 = i | (gapComposer.changedInstance(installed) ? 4 : 2) | (gapComposer.changed(appletTileAppearance) ? 32 : 16) | (gapComposer.changedInstance(taxesAppletViewsModule$$ExternalSyntheticLambda1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z = appletTileAppearance.useRedesignedTiles;
            if (z) {
                gapComposer.startReplaceGroup(-189179516);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                pair = new Pair(new InstalledServiceAppletTileLayoutConfig(16.0f, RecyclerView.DECELERATION_RATE, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelSmall, InstalledServiceAppletTileLayoutConfig.VisualPosition.END, Alignment.Companion.Bottom), AvatarSize.Size64);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-188832843);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                Pair pair2 = new Pair(new InstalledServiceAppletTileLayoutConfig(8.0f, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, 24), AvatarSize.Size32);
                gapComposer.end(false);
                pair = pair2;
            }
            InstalledServiceAppletTileLayoutConfig installedServiceAppletTileLayoutConfig = (InstalledServiceAppletTileLayoutConfig) pair.first;
            AvatarSize avatarSize = (AvatarSize) pair.second;
            boolean z2 = z && installed.getAvatars().size() > 2;
            List avatars = installed.getAvatars();
            if (z2) {
                avatars = CollectionsKt.take(avatars, 1);
            }
            int size = z2 ? installed.getAvatars().size() - 1 : 0;
            if (z) {
                gapComposer.startReplaceGroup(-1579194326);
                gapComposer.end(false);
                composableLambdaImpl = null;
            } else {
                gapComposer.startReplaceGroup(-1579178081);
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1347083386, new AgentsAppletTile$$ExternalSyntheticLambda5(avatars, avatarSize, size, 1), gapComposer);
                gapComposer.end(false);
                composableLambdaImpl = rememberComposableLambda;
            }
            if (z) {
                gapComposer.startReplaceGroup(-1579029281);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1953387177, new AgentsAppletTileKt$$ExternalSyntheticLambda0(avatars, avatarSize, size), gapComposer);
                gapComposer.end(false);
                composableLambdaImpl2 = rememberComposableLambda2;
            } else {
                gapComposer.startReplaceGroup(-1578946326);
                gapComposer.end(false);
                composableLambdaImpl2 = null;
            }
            if (z && (installed instanceof FamilyAppletTileViewModel.InstalledWithActivity)) {
                gapComposer.startReplaceGroup(-1578750529);
                FamilyAppletTileViewModel.ActivityType activityType = ((FamilyAppletTileViewModel.InstalledWithActivity) installed).activityType;
                if (activityType instanceof FamilyAppletTileViewModel.ActivityType.LastActive) {
                    gapComposer.startReplaceGroup(-707050549);
                    listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new InstalledServiceAppletTileContentModel[]{new InstalledServiceAppletTileContentModel(null, null, new InstalledServiceAppletTileContentModel.BriefState.Loaded(Room.stringResource(gapComposer, R.string.family_applet_last_active_label)), null, 11), new InstalledServiceAppletTileContentModel(null, null, new InstalledServiceAppletTileContentModel.BriefState.Loaded(((FamilyAppletTileViewModel.ActivityType.LastActive) activityType).date), null, 11)});
                    gapComposer.end(false);
                } else if (activityType instanceof FamilyAppletTileViewModel.ActivityType.NoActivity) {
                    gapComposer.startReplaceGroup(-706525099);
                    listOf = CollectionsKt__CollectionsJVMKt.listOf(new InstalledServiceAppletTileContentModel(null, null, new InstalledServiceAppletTileContentModel.BriefState.Loaded(Room.stringResource(gapComposer, R.string.family_applet_no_activity)), null, 11));
                    gapComposer.end(false);
                } else if (activityType instanceof FamilyAppletTileViewModel.ActivityType.DependentNames) {
                    gapComposer.startReplaceGroup(-706223066);
                    gapComposer.end(false);
                    listOf = CollectionsKt__CollectionsJVMKt.listOf(new InstalledServiceAppletTileContentModel(null, null, new InstalledServiceAppletTileContentModel.BriefState.Loaded(((FamilyAppletTileViewModel.ActivityType.DependentNames) activityType).names), null, 11));
                } else {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1362663261, false);
                }
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1578683662);
                gapComposer.end(false);
                if (installed instanceof FamilyAppletTileViewModel.InstalledWithActivity) {
                    briefState = new InstalledServiceAppletTileContentModel.BriefState.Loaded(((FamilyAppletTileViewModel.InstalledWithActivity) installed).description);
                } else {
                    briefState = InstalledServiceAppletTileContentModel.BriefState.Loading.INSTANCE;
                }
                listOf = CollectionsKt__CollectionsJVMKt.listOf(new InstalledServiceAppletTileContentModel(null, null, briefState, composableLambdaImpl, 3));
            }
            SharedUIKt.InstalledServiceAppletTile(new InstalledAppletTileHeaderModel(installed.getTitle(), null, null, 14), listOf, taxesAppletViewsModule$$ExternalSyntheticLambda1, false, null, installedServiceAppletTileLayoutConfig, composableLambdaImpl2, gapComposer, i2 & 896, 24);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EarningsHomeKt$$ExternalSyntheticLambda2(installed, appletTileAppearance, taxesAppletViewsModule$$ExternalSyntheticLambda1, i, 18);
        }
    }
}
