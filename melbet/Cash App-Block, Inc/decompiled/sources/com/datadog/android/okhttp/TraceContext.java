package com.datadog.android.okhttp;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.util.Log;
import android.view.DragEvent;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatReceiveContentHelper$OnDropApi24Impl;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.ViewCompat;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.datadog.android.okhttp.TraceContext;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.list.ListUnorderedItem;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.limits.viewmodels.LimitItem;
import com.squareup.cash.limits.viewmodels.LimitItemViewModel;
import com.squareup.cash.limits.viewmodels.LimitViewModel;
import com.squareup.cash.limits.viewmodels.LimitsCategoryViewModel$LimitsCategory;
import com.squareup.cash.limits.viewmodels.ProgressViewModel;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda0;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.Tags;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public abstract class TraceContext {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r11v2, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r13v14, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r18v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    public static final void ArcadeLimitsSections(LimitViewModel limitViewModel, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer;
        Modifier.Companion companion;
        BiasAlignment.Horizontal horizontal;
        int i2;
        boolean z;
        Composer composer2;
        Modifier modifier3;
        ?? r1;
        ?? r0;
        Modifier modifier4;
        Modifier modifier5;
        boolean z2;
        BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
        Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
        limitViewModel.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1931023727);
        Applier applier = gapComposer2.applier;
        int i3 = 2;
        int i4 = i | (gapComposer2.changedInstance(limitViewModel) ? 4 : 2) | 48;
        boolean z3 = 1;
        boolean z4 = 0;
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal2, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion2);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            Modifier modifier6 = null;
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
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
            gapComposer2.startReplaceGroup(-960010128);
            boolean z5 = false;
            GapComposer gapComposer3 = gapComposer2;
            for (LimitsCategoryViewModel$LimitsCategory limitsCategoryViewModel$LimitsCategory : limitViewModel.categories) {
                if (limitsCategoryViewModel$LimitsCategory == null) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -1023416740, z4);
                }
                gapComposer3.startReplaceGroup(-1661071234);
                String str = limitsCategoryViewModel$LimitsCategory.categoryHeader;
                if (str == null) {
                    gapComposer3.startReplaceGroup(-1661068786);
                    gapComposer3.end(z4);
                    horizontal = horizontal2;
                    i2 = i3;
                    r0 = z3;
                    r1 = z4;
                    composer2 = gapComposer3;
                    companion = companion2;
                    modifier3 = modifier6;
                    z = z5;
                } else {
                    gapComposer3.startReplaceGroup(-1661068785);
                    if (z5) {
                        gapComposer3.startReplaceGroup(-1475091835);
                        DBUtil.SpacerBetweenSectionLarge(z4, z3, gapComposer3, modifier6);
                        ModalKt.HorizontalDivider(z4, z3, gapComposer3, modifier6);
                        DBUtil.SpacerBetweenSectionLarge(z4, z3, gapComposer3, modifier6);
                        gapComposer3.end(z4);
                    } else {
                        gapComposer3.startReplaceGroup(-1474964022);
                        gapComposer3.end(z4);
                    }
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
                    ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, i3);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal2, gapComposer3, z4);
                    int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m300paddingVpY3zN4$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    TextStyle textStyle = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).sectionTitle;
                    Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, z4);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(z4);
                    }
                    GapComposer gapComposer4 = gapComposer3;
                    boolean z6 = z4;
                    companion = companion2;
                    boolean z7 = z3;
                    horizontal = horizontal2;
                    Modifier modifier7 = modifier6;
                    i2 = 2;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.standard, (Composer) gapComposer4, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    gapComposer4.end(z7);
                    DBUtil.SpacerWithinSectionMedium(z6 ? 1 : 0, z7 ? 1 : 0, gapComposer4, modifier7);
                    gapComposer4.end(z6);
                    z = z6 ? 1 : 0;
                    limitsCategoryViewModel$LimitsCategory = limitsCategoryViewModel$LimitsCategory;
                    r0 = z7;
                    r1 = z6;
                    modifier3 = modifier7;
                    composer2 = gapComposer4;
                }
                boolean z8 = z;
                Modifier modifier8 = modifier3;
                for (LimitItemViewModel limitItemViewModel : limitsCategoryViewModel$LimitsCategory.limits) {
                    if (limitItemViewModel instanceof LimitItemViewModel.StaticLimit) {
                        composer2.startReplaceGroup(-961379529);
                        if (z8) {
                            composer2.startReplaceGroup(-961348126);
                            DBUtil.SpacerBetweenSectionLarge(r1, r0, composer2, modifier8);
                            ModalKt.HorizontalDivider(r1, r0, composer2, modifier8);
                            DBUtil.SpacerBetweenSectionLarge(r1, r0, composer2, modifier8);
                            composer2.end(r1);
                        } else {
                            composer2.startReplaceGroup(-961204937);
                            composer2.end(r1);
                        }
                        StaticLimitsCategorySection((LimitItemViewModel.StaticLimit) limitItemViewModel, modifier8, composer2, r1);
                        composer2.end(r1);
                        modifier4 = modifier8;
                    } else {
                        if (!(limitItemViewModel instanceof LimitItemViewModel.ProgressBarLimit)) {
                            throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer2, 2047199677, (boolean) r1);
                        }
                        composer2.startReplaceGroup(-960961432);
                        LimitItemViewModel.ProgressBarLimit progressBarLimit = (LimitItemViewModel.ProgressBarLimit) limitItemViewModel;
                        String str2 = progressBarLimit.header;
                        List list = progressBarLimit.progressBars;
                        if (list.isEmpty()) {
                            composer2.end(r1);
                            z2 = z8;
                        } else {
                            if (z8) {
                                composer2.startReplaceGroup(-960959262);
                                DBUtil.SpacerBetweenSectionLarge(r1, r0, composer2, modifier8);
                                ModalKt.HorizontalDivider(r1, r0, composer2, modifier8);
                                DBUtil.SpacerBetweenSectionLarge(r1, r0, composer2, modifier8);
                                composer2.end(r1);
                            } else {
                                composer2.startReplaceGroup(-960816073);
                                composer2.end(r1);
                            }
                            if (list.size() == r0) {
                                composer2.startReplaceGroup(-960649200);
                                ProgressViewModel progressViewModel = (ProgressViewModel) CollectionsKt.first(list);
                                if (progressViewModel instanceof ProgressViewModel.SimpleProgress) {
                                    ProgressViewModel.SimpleProgress simpleProgress = (ProgressViewModel.SimpleProgress) progressViewModel;
                                    if (simpleProgress.progress == null) {
                                        composer2.startReplaceGroup(-960496959);
                                        StaticLimitsCategorySection(new LimitItemViewModel.StaticLimit(str2, modifier8, CollectionsKt__CollectionsKt.listOfNotNull(simpleProgress.primaryText)), modifier8, composer2, r1);
                                        Boxes$$ExternalSyntheticOutline1.m((GapComposer) composer2, (boolean) r1, (boolean) r1, (boolean) r1);
                                        z2 = r0;
                                    }
                                }
                                composer2.startReplaceGroup(-960168297);
                                composer2.end(r1);
                                composer2.end(r1);
                            } else {
                                composer2.startReplaceGroup(-960150441);
                                composer2.end(r1);
                            }
                            int i5 = r1;
                            Modifier modifier9 = modifier8;
                            for (Object obj : list) {
                                int i6 = i5 + 1;
                                if (i5 < 0) {
                                    ?? r18 = modifier9;
                                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                                    throw r18;
                                }
                                ProgressViewModel progressViewModel2 = (ProgressViewModel) obj;
                                if (i5 > 0) {
                                    composer2.startReplaceGroup(1125406243);
                                    DBUtil.SpacerWithinSectionMedium(r1, r0, composer2, modifier9);
                                    composer2.end(r1);
                                } else {
                                    composer2.startReplaceGroup(1125472552);
                                    composer2.end(r1);
                                }
                                if (progressViewModel2 instanceof ProgressViewModel.SimpleProgress) {
                                    composer2.startReplaceGroup(1125601605);
                                    Modifier.Companion companion3 = companion;
                                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion3, 1.0f);
                                    BiasAlignment.Horizontal horizontal3 = horizontal;
                                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal3, composer2, r1);
                                    int hashCode3 = Long.hashCode(composer2.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = composer2.currentCompositionLocalScope();
                                    Modifier materializeModifier3 = PlatformKt.materializeModifier(composer2, fillMaxWidth2);
                                    ComposeUiNode.Companion.getClass();
                                    modifier5 = modifier9;
                                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                                    composer2.startReusableNode();
                                    if (composer2.inserting) {
                                        composer2.createNode(layoutNode$Companion$Constructor$13);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Updater.m576setimpl(composer2, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                                    Updater.m576setimpl(composer2, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                    Updater.m576setimpl(composer2, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                                    Updater.m575reconcileimpl(composer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                    Updater.m576setimpl(composer2, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                                    String str3 = str2 == null ? "" : str2;
                                    ProgressViewModel.SimpleProgress simpleProgress2 = (ProgressViewModel.SimpleProgress) progressViewModel2;
                                    String str4 = simpleProgress2.secondaryText;
                                    companion = companion3;
                                    horizontal = horizontal3;
                                    ListUnorderedKt.ListUnordered(Tags.toPersistentList(CollectionsKt__CollectionsJVMKt.listOf(new ListUnorderedItem(str3, null, str4 == null ? "" : str4, null, 10))), (Modifier) null, (ListUnorderedState) null, ListUnorderedProminence.Standard, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, composer2, 3072, 54);
                                    Double d = simpleProgress2.progress;
                                    if (d == null) {
                                        composer2.startReplaceGroup(1508791089);
                                        composer2.end(r1);
                                    } else {
                                        composer2.startReplaceGroup(1508791090);
                                        ProgressBar(d.doubleValue(), simpleProgress2.primaryText, composer2, r1);
                                        composer2.end(r1);
                                    }
                                    composer2.end(r0);
                                    composer2.end(r1);
                                } else {
                                    modifier5 = modifier9;
                                    if (progressViewModel2 instanceof ProgressViewModel.MoneyProgress) {
                                        composer2.startReplaceGroup(1126417804);
                                        ProgressViewModel.MoneyProgress moneyProgress = (ProgressViewModel.MoneyProgress) progressViewModel2;
                                        String str5 = moneyProgress.header;
                                        DetailedProgressBar(str5 != null ? str5 : "", moneyProgress.limitThresholdText, moneyProgress.limitThresholdAmount, moneyProgress.amountUsed, moneyProgress.amountRemaining, moneyProgress.consumedProportion, composer2, 0);
                                        composer2.end(r1);
                                    } else {
                                        if (!(progressViewModel2 instanceof ProgressViewModel.CountProgress)) {
                                            throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer2, -102239054, (boolean) r1);
                                        }
                                        composer2.startReplaceGroup(1127011919);
                                        ProgressViewModel.CountProgress countProgress = (ProgressViewModel.CountProgress) progressViewModel2;
                                        String str6 = countProgress.header;
                                        DetailedProgressBar(str6 != null ? str6 : "", countProgress.limitThresholdText, countProgress.limitThresholdCount, countProgress.countUsed, countProgress.countRemaining, countProgress.consumedProportion, composer2, 0);
                                        composer2.end(r1);
                                    }
                                }
                                i5 = i6;
                                modifier9 = modifier5;
                            }
                            modifier4 = modifier9;
                            composer2.end(r1);
                        }
                        modifier4 = modifier8;
                        modifier8 = modifier4;
                        z8 = z2;
                    }
                    z2 = r0;
                    modifier8 = modifier4;
                    z8 = z2;
                }
                composer2.end(r1);
                z3 = r0;
                z4 = r1;
                gapComposer3 = composer2;
                modifier6 = modifier8;
                i3 = i2;
                horizontal2 = horizontal;
                companion2 = companion;
                z5 = z8;
            }
            GapComposer gapComposer5 = gapComposer3;
            gapComposer5.end(z4);
            gapComposer5.end(z3);
            modifier2 = companion2;
            gapComposer = gapComposer5;
        } else {
            GapComposer gapComposer6 = gapComposer2;
            gapComposer6.skipToGroupEnd();
            modifier2 = modifier;
            gapComposer = gapComposer6;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda0(limitViewModel, modifier2, i, 15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v25 */
    public static final void DetailedProgressBar(final String str, final String str2, final String str3, String str4, String str5, final double d, Composer composer, final int i) {
        GapComposer gapComposer;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        Arrangement$Top$1 arrangement$Top$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        Modifier.Companion companion;
        BiasAlignment.Horizontal horizontal;
        ?? r2;
        ?? r3;
        GapComposer gapComposer2;
        final String str6 = str4;
        final String str7 = str5;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-1856848965);
        Applier applier = gapComposer3.applier;
        int i2 = i | (gapComposer3.changed(str) ? 4 : 2) | (gapComposer3.changed(str2) ? 32 : 16) | (gapComposer3.changed(str3) ? 256 : 128) | (gapComposer3.changed(str6) ? 2048 : 1024) | (gapComposer3.changed(str7) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer3.changed(d) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (gapComposer3.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
            Arrangement$Top$1 arrangement$Top$12 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, gapComposer3, 0);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer3.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$14);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$15);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$16);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$17);
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion2, 1.0f);
            Strings.getSizes(gapComposer3).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth2, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, gapComposer3, 0);
            int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m300paddingVpY3zN4$default);
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$14);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$15);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$16, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$12);
            Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$17);
            if (str.length() > 0) {
                gapComposer3.startReplaceGroup(1209986403);
                int i3 = i2 & 14;
                arrangement$Top$1 = arrangement$Top$12;
                horizontal = horizontal2;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$16;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$17;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$15;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                companion = companion2;
                r2 = 0;
                r3 = 1;
                Room.m1165Text25TpFw(0, 0, 0, 0, i3, 0, 4082, Strings.getColors(gapComposer3).semantic.text.standard, (Composer) gapComposer3, (Modifier) null, Strings.getTypography(gapComposer3).labelMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer2 = gapComposer3;
                DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer2, null);
                gapComposer2.end(false);
            } else {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$17;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$15;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                arrangement$Top$1 = arrangement$Top$12;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$16;
                companion = companion2;
                horizontal = horizontal2;
                r2 = 0;
                r3 = 1;
                gapComposer2 = gapComposer3;
                gapComposer2.startReplaceGroup(1210186291);
                gapComposer2.end(false);
            }
            Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
            Arrangement$Center$1 arrangement$Center$1 = SpacerKt.SpaceBetween;
            BiasAlignment.Vertical vertical = Alignment.Companion.Top;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$Center$1, vertical, gapComposer2, 6);
            int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth3);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$14);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = composeUiNode$Companion$SetModifier$1;
            Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$18);
            GapComposer gapComposer4 = gapComposer2;
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$19 = composeUiNode$Companion$SetModifier$13;
            Room.m1165Text25TpFw(0, 0, 0, 0, (i2 >> 3) & 14, 0, 4082, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer4, (Modifier) null, Strings.getTypography(gapComposer2).bodySmall, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 0, (i2 >> 6) & 14, 0, 4082, Strings.getColors(gapComposer4).semantic.text.standard, (Composer) gapComposer4, (Modifier) null, Strings.getTypography(gapComposer4).bodySmall, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
            gapComposer4.end(r3);
            DBUtil.SpacerWithinSectionSmall(r2, r3, gapComposer4, null);
            gapComposer4.end(r3);
            Strings.getSizes(gapComposer4).getClass();
            Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer4, r2);
            int hashCode4 = Long.hashCode(gapComposer4.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer4.currentCompositionLocalScope();
            Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer4, m300paddingVpY3zN4$default2);
            gapComposer4.startReusableNode();
            if (gapComposer4.inserting) {
                gapComposer4.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer4.useNode();
            }
            Updater.m576setimpl(gapComposer4, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$14);
            Updater.m576setimpl(gapComposer4, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer4, composeUiNode$Companion$SetModifier$19, gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer4, materializeModifier4, composeUiNode$Companion$SetModifier$18);
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 8.0f);
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
            Modifier clip = ClipKt.clip(m277height3ABfNKs, roundedCornerShape);
            long j = Strings.getColors(gapComposer4).semantic.background.subtle;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clip, j, rectangleShapeKt$RectangleShape$1);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, r2);
            int hashCode5 = Long.hashCode(gapComposer4.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer4.currentCompositionLocalScope();
            Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer4, m177backgroundbw27NRU);
            gapComposer4.startReusableNode();
            if (gapComposer4.inserting) {
                gapComposer4.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer4.useNode();
            }
            Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$14);
            Updater.m576setimpl(gapComposer4, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode5, gapComposer4, composeUiNode$Companion$SetModifier$19, gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer4, materializeModifier5, composeUiNode$Companion$SetModifier$18);
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.fillMaxWidth(SizeKt.fillMaxHeight(companion, 1.0f), (float) d), roundedCornerShape), Strings.getColors(gapComposer4).semantic.background.brand, rectangleShapeKt$RectangleShape$1), gapComposer4, 0);
            gapComposer4.end(true);
            Modifier fillMaxWidth4 = SizeKt.fillMaxWidth(companion, 1.0f);
            Strings.getSizes(gapComposer4).getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth4, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$Center$1, vertical, gapComposer4, 6);
            int hashCode6 = Long.hashCode(gapComposer4.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer4.currentCompositionLocalScope();
            Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer4, m302paddingqDBjuR0$default);
            gapComposer4.startReusableNode();
            if (gapComposer4.inserting) {
                gapComposer4.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer4.useNode();
            }
            Updater.m576setimpl(gapComposer4, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$14);
            Updater.m576setimpl(gapComposer4, currentCompositionLocalScope6, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode6, gapComposer4, composeUiNode$Companion$SetModifier$19, gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer4, materializeModifier6, composeUiNode$Companion$SetModifier$18);
            StringBuilder sb = new StringBuilder();
            str6 = str4;
            sb.append(str6);
            sb.append(" used");
            String sb2 = sb.toString();
            TextStyle textStyle = Strings.getTypography(gapComposer4).bodySmall;
            long j2 = Strings.getColors(gapComposer4).semantic.text.subtle;
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j2, (Composer) gapComposer4, rowScopeInstance.weight(1.0f, companion, false), textStyle, (TextLineBalancing) null, sb2, (Map) null, (Function1) null, false);
            str7 = str5;
            Room.m1165Text25TpFw(0, 0, 0, 6, 0, 0, 3824, Strings.getColors(gapComposer4).semantic.text.subtle, (Composer) gapComposer4, rowScopeInstance.weight(1.0f, companion, false), Strings.getTypography(gapComposer4).bodySmall, (TextLineBalancing) null, Recorder$$ExternalSyntheticOutline2.m$1(str7, " remaining"), (Map) null, (Function1) null, false);
            gapComposer = gapComposer4;
            Boxes$$ExternalSyntheticOutline1.m(gapComposer, true, true, true);
        } else {
            gapComposer = gapComposer3;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(str, str2, str3, str6, str7, d, i) { // from class: com.squareup.cash.limits.views.arcade.LimitsCategoryContentKt$$ExternalSyntheticLambda1
                public final /* synthetic */ String f$0;
                public final /* synthetic */ String f$1;
                public final /* synthetic */ String f$2;
                public final /* synthetic */ String f$3;
                public final /* synthetic */ String f$4;
                public final /* synthetic */ double f$5;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    TraceContext.DetailedProgressBar(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void LimitRow(LimitItem limitItem, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(620926007);
        int i2 = i | (gapComposer.changedInstance(limitItem) ? 4 : 2) | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.Top, gapComposer, 6);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, limitItem.label, (Map) null, (Function1) null, false);
            if (limitItem.amount.length() > 0) {
                gapComposer.startReplaceGroup(-1893411229);
                Room.m1165Text25TpFw(0, 0, 0, 6, 0, 0, 3826, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, limitItem.amount, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1893215185);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda0(limitItem, modifier2, i, 17);
        }
    }

    public static final void ProgressBar(final double d, String str, Composer composer, final int i) {
        final String str2;
        boolean z;
        List split$default;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1590403797);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changed(d) ? 4 : 2) | (gapComposer.changed(str) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 8.0f);
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
            Modifier clip = ClipKt.clip(m277height3ABfNKs, roundedCornerShape);
            long j = Strings.getColors(gapComposer).semantic.background.subtle;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clip, j, rectangleShapeKt$RectangleShape$1);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.fillMaxWidth(SizeKt.fillMaxHeight(companion, 1.0f), (float) d), roundedCornerShape), Strings.getColors(gapComposer).semantic.background.brand, rectangleShapeKt$RectangleShape$1), gapComposer, 0);
            gapComposer.end(true);
            if (str != null) {
                gapComposer.startReplaceGroup(-989989923);
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                Strings.getSizes(gapComposer).getClass();
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                gapComposer.startReplaceGroup(-1925621620);
                AnnotatedString.Builder builder = new AnnotatedString.Builder();
                split$default = StringsKt__StringsKt.split$default(str, new String[]{" "}, false, 2, 2, null);
                boolean z2 = false;
                builder.append((String) split$default.get(0));
                String str3 = (String) CollectionsKt.getOrNull(1, split$default);
                if (str3 == null) {
                    gapComposer.startReplaceGroup(1896725707);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1896725708);
                    builder.append(" ");
                    SpanStyle spanStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall.spanStyle;
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    int pushStyle = builder.pushStyle(SpanStyle.m973copyGSF8kmg$default(spanStyle, colors.semantic.text.subtle, null, 0L, JpegConstants.COM_MARKER));
                    try {
                        builder.append(str3);
                        builder.pop(pushStyle);
                        z2 = false;
                        gapComposer.end(false);
                    } catch (Throwable th) {
                        builder.pop(pushStyle);
                        throw th;
                    }
                }
                AnnotatedString annotatedString = builder.toAnnotatedString();
                gapComposer.end(z2);
                Room.m1164Text25TpFw(0, 0, 0, 6, 0, 0, 3824, Strings.getColors(gapComposer).semantic.text.prominent, (Composer) gapComposer, m302paddingqDBjuR0$default, annotatedString, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                gapComposer.end(z2);
                str2 = str;
                z = true;
            } else {
                str2 = str;
                z = true;
                gapComposer.startReplaceGroup(-989691827);
                gapComposer.end(false);
            }
            gapComposer.end(z);
        } else {
            str2 = str;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(d, str2, i) { // from class: com.squareup.cash.limits.views.arcade.LimitsCategoryContentKt$$ExternalSyntheticLambda2
                public final /* synthetic */ double f$0;
                public final /* synthetic */ String f$1;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    TraceContext.ProgressBar(this.f$0, this.f$1, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v7 */
    public static final void StaticLimitsCategorySection(LimitItemViewModel.StaticLimit staticLimit, Modifier modifier, Composer composer, int i) {
        LimitItemViewModel.StaticLimit staticLimit2;
        Modifier modifier2;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        Modifier.Companion companion;
        StaticProvidableCompositionLocal staticProvidableCompositionLocal;
        boolean z;
        ?? r14;
        BiasAlignment.Horizontal horizontal;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        Modifier modifier3;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1002862724);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(staticLimit) ? 4 : 2) | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal2)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal2, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$16);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$17);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$18);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$19 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$19);
            String str = staticLimit.header;
            if (str == null || str.length() == 0) {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$19;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                companion = companion2;
                staticProvidableCompositionLocal = staticProvidableCompositionLocal2;
                z = true;
                r14 = 0;
                horizontal = horizontal2;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$18;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                modifier3 = null;
                gapComposer.startReplaceGroup(-955197680);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-955384114);
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    composeUiNode$Companion$SetModifier$15 = composeUiNode$Companion$SetModifier$16;
                } else {
                    composeUiNode$Companion$SetModifier$15 = composeUiNode$Companion$SetModifier$16;
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                staticProvidableCompositionLocal = staticProvidableCompositionLocal2;
                horizontal = horizontal2;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$19;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                companion = companion2;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$18;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                modifier3 = null;
                z = true;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.standard, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                r14 = 0;
                DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(4.0f, z, new Drop$$ExternalSyntheticBUOutline0(3)), horizontal, gapComposer, r14);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            modifier2 = companion;
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, modifier2);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$14, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$12);
            staticLimit2 = staticLimit;
            List list = staticLimit2.parsedItems;
            if (list == null) {
                gapComposer.startReplaceGroup(-1169632979);
            } else {
                gapComposer.startReplaceGroup(-1169632978);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    LimitRow((LimitItem) it.next(), modifier3, gapComposer, r14);
                }
            }
            gapComposer.end(r14);
            gapComposer.end(z);
            gapComposer.end(z);
        } else {
            staticLimit2 = staticLimit;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda0(staticLimit2, modifier2, i, 16);
        }
    }

    public static boolean maybeHandleDragEventViaPerformReceiveContent(AppCompatEditText appCompatEditText, DragEvent dragEvent) {
        Activity activity;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && ViewCompat.getOnReceiveContentMimeTypes(appCompatEditText) != null) {
            Context context = appCompatEditText.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + appCompatEditText);
                return false;
            }
            if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                return AppCompatReceiveContentHelper$OnDropApi24Impl.onDropForTextView(dragEvent, appCompatEditText, activity);
            }
        }
        return false;
    }

    public static boolean maybeHandleMenuActionViaPerformReceiveContent(AppCompatEditText appCompatEditText, int i) {
        ContentInfoCompat.BuilderCompat builderCompat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || ViewCompat.getOnReceiveContentMimeTypes(appCompatEditText) == null || !(i == 16908322 || i == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) appCompatEditText.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                builderCompat = new ContentInfoCompat.Compat31Impl(primaryClip, 1);
            } else {
                ContentInfoCompat.CompatImpl compatImpl = new ContentInfoCompat.CompatImpl();
                compatImpl.mClip = primaryClip;
                compatImpl.mSource = 1;
                builderCompat = compatImpl;
            }
            builderCompat.setFlags(i != 16908322 ? 1 : 0);
            ViewCompat.performReceiveContent(appCompatEditText, builderCompat.build());
        }
        return true;
    }

    public static int passOneNewline(int i, CharSequence charSequence) {
        char charAt;
        char charAt2;
        while (i < charSequence.length() && ((charAt2 = charSequence.charAt(i)) == ' ' || charAt2 == '\t')) {
            i++;
        }
        if (i < charSequence.length() && charSequence.charAt(i) == '\n') {
            while (true) {
                i++;
                if (i >= charSequence.length() || ((charAt = charSequence.charAt(i)) != ' ' && charAt != '\t')) {
                    break;
                }
            }
        }
        return i;
    }
}
