package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.location.Location;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.pager.DefaultPagerState;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScopeImpl;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.Colors;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda34;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.jg$$ExternalSyntheticLambda1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.zacn;
import com.google.android.gms.internal.location.zzbi;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.zzw;
import com.google.android.play.core.splitinstall.internal.zzai;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.genericelements.viewmodels.GenericComponentViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericContainerViewModel;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.util.Strings;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsData;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsPrecisionAuthorization;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsUtilsKt$getLocationAndPrecision$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import okio.Okio;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class zzf {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void SeriesContainerWidget(GenericContainerViewModel.SeriesContainerViewModel seriesContainerViewModel, Modifier modifier, final boolean z, final Function1 function1, Composer composer, int i) {
        Modifier modifier2;
        boolean z2;
        long backgroundColor;
        Modifier then;
        Modifier.Companion companion;
        Modifier.Companion companion2;
        boolean z3;
        boolean z4;
        Modifier wrapContentHeight;
        long m675copywmQWz5c$default;
        int i2;
        GenericContainerViewModel.SeriesContainerViewModel seriesContainerViewModel2 = seriesContainerViewModel;
        seriesContainerViewModel2.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1413303466);
        Applier applier = gapComposer.applier;
        int i3 = ((i & 6) == 0 ? (gapComposer.changedInstance(seriesContainerViewModel2) ? 4 : 2) | i : i) | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        int i4 = i3;
        final int i5 = 1;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
            final ArrayList arrayList = seriesContainerViewModel2.components;
            Pair pair = seriesContainerViewModel2.margins;
            Object obj = pair.second;
            Object obj2 = pair.first;
            int size = arrayList.size();
            int ordinal = seriesContainerViewModel2.scroll.ordinal();
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
            if (ordinal != 0) {
                int i6 = 28;
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (ordinal == 1) {
                    companion2 = companion3;
                    gapComposer.startReplaceGroup(-157804137);
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
                    Modifier m301paddingqDBjuR0 = size == 1 ? SpacerKt.m301paddingqDBjuR0(fillMaxWidth, ((GenericContainerViewModel.ContainerMargin) obj2).value, SeriesContainerWidget$getVerticalSpacing(seriesContainerViewModel), ((GenericContainerViewModel.ContainerMargin) obj).value, SeriesContainerWidget$getVerticalSpacing(seriesContainerViewModel)) : SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, RecyclerView.DECELERATION_RATE, SeriesContainerWidget$getVerticalSpacing(seriesContainerViewModel), 1);
                    boolean changed = gapComposer.changed(size);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new jg$$ExternalSyntheticLambda1(size, i6);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    DefaultPagerState rememberPagerState = PagerStateKt.rememberPagerState(0, (Function0) rememberedValue, gapComposer, 0, 3);
                    PaddingValuesImpl m297PaddingValuesa9UjIt4$default = size != 1 ? SpacerKt.m297PaddingValuesa9UjIt4$default(((GenericContainerViewModel.ContainerMargin) obj2).value, RecyclerView.DECELERATION_RATE, ((GenericContainerViewModel.ContainerMargin) obj).value, RecyclerView.DECELERATION_RATE, 10) : SpacerKt.m295PaddingValuesYgX7TsA$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 3);
                    final int i7 = 0;
                    PagerKt.m328HorizontalPager8jOkeI(rememberPagerState, m301paddingqDBjuR0, m297PaddingValuesa9UjIt4$default, null, 0, 8.0f, null, null, false, null, null, null, Expect_jvmKt.rememberComposableLambda(-1445582476, new Function4() { // from class: com.squareup.cash.genericelements.components.containers.SeriesContainerWidgetKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                            int i8 = i7;
                            ArrayList arrayList2 = arrayList;
                            int intValue = ((Integer) obj4).intValue();
                            Composer composer2 = (Composer) obj5;
                            ((Integer) obj6).getClass();
                            ((PagerScopeImpl) obj3).getClass();
                            switch (i8) {
                                case 0:
                                    ContextUtilsKt.GenericComponentWidget((GenericComponentViewModel) arrayList2.get(intValue), null, z, function1, composer2, 0);
                                    break;
                                default:
                                    ContextUtilsKt.GenericComponentWidget((GenericComponentViewModel) arrayList2.get(intValue), null, z, function1, composer2, 0);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), gapComposer, 196608, 24576, 16344);
                    gapComposer = gapComposer;
                    gapComposer.end(false);
                } else {
                    if (ordinal != 2) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -974938221, false);
                    }
                    gapComposer.startReplaceGroup(-156851259);
                    boolean changed2 = gapComposer.changed(size);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new jg$$ExternalSyntheticLambda1(size, i6);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    DefaultPagerState rememberPagerState2 = PagerStateKt.rememberPagerState(0, (Function0) rememberedValue2, gapComposer, 0, 3);
                    Object[] objArr = size > 1;
                    Modifier m301paddingqDBjuR02 = SpacerKt.m301paddingqDBjuR0(SizeKt.fillMaxWidth(companion3, 1.0f), ((GenericContainerViewModel.ContainerMargin) obj2).value, SeriesContainerWidget$getVerticalSpacing(seriesContainerViewModel2), ((GenericContainerViewModel.ContainerMargin) obj).value, SeriesContainerWidget$getVerticalSpacing(seriesContainerViewModel2));
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), horizontal, gapComposer, 54);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m301paddingqDBjuR02);
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
                    companion2 = companion3;
                    PagerKt.m328HorizontalPager8jOkeI(rememberPagerState2, null, null, null, 0, 8.0f, null, null, false, null, null, null, Expect_jvmKt.rememberComposableLambda(1095148287, new Function4() { // from class: com.squareup.cash.genericelements.components.containers.SeriesContainerWidgetKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                            int i8 = i5;
                            ArrayList arrayList2 = arrayList;
                            int intValue = ((Integer) obj4).intValue();
                            Composer composer2 = (Composer) obj5;
                            ((Integer) obj6).getClass();
                            ((PagerScopeImpl) obj3).getClass();
                            switch (i8) {
                                case 0:
                                    ContextUtilsKt.GenericComponentWidget((GenericComponentViewModel) arrayList2.get(intValue), null, z, function1, composer2, 0);
                                    break;
                                default:
                                    ContextUtilsKt.GenericComponentWidget((GenericComponentViewModel) arrayList2.get(intValue), null, z, function1, composer2, 0);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), gapComposer, 196608, 24576, 16350);
                    gapComposer = gapComposer;
                    if (objArr == true) {
                        gapComposer.startReplaceGroup(-403207326);
                        wrapContentHeight = SizeKt.wrapContentHeight(companion2, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                        z4 = true;
                        RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(horizontal, 1 == true ? 1 : 0)), Alignment.Companion.Top, gapComposer, 6);
                        int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, wrapContentHeight);
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
                        gapComposer.startReplaceGroup(-1588902632);
                        int pageCount = rememberPagerState2.getPageCount();
                        for (int i8 = 0; i8 < pageCount; i8++) {
                            if (((ParcelableSnapshotMutableIntState) rememberPagerState2.scrollPosition.elementTypes).getIntValue() == i8) {
                                gapComposer.startReplaceGroup(151233704);
                                m675copywmQWz5c$default = MooncakeTheme.getColors(gapComposer).secondaryLabel;
                                i2 = 0;
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(151312940);
                                long j = MooncakeTheme.getColors(gapComposer).secondaryLabel;
                                long j2 = ((Color) gapComposer.consume(ContentColorKt.LocalContentColor)).value;
                                if (((Colors) gapComposer.consume(ColorsKt.LocalColors)).isLight()) {
                                    ColorKt.m690luminance8_81llA(j2);
                                } else {
                                    ColorKt.m690luminance8_81llA(j2);
                                }
                                m675copywmQWz5c$default = Color.m675copywmQWz5c$default(0.38f, j, 14);
                                i2 = 0;
                                gapComposer.end(false);
                            }
                            BoxKt.Box(SizeKt.m285size3ABfNKs(ImageKt.m177backgroundbw27NRU(ClipKt.clip(companion2, RoundedCornerShapeKt.CircleShape), m675copywmQWz5c$default, rectangleShapeKt$RectangleShape$1), 8.0f), gapComposer, i2);
                        }
                        z3 = false;
                        Boxes$$ExternalSyntheticOutline1.m(gapComposer, false, true, false);
                    } else {
                        z3 = false;
                        z4 = true;
                        gapComposer.startReplaceGroup(-402623038);
                        gapComposer.end(false);
                    }
                    gapComposer.end(z4);
                    gapComposer.end(z3);
                }
                seriesContainerViewModel2 = seriesContainerViewModel;
                companion = companion2;
            } else {
                Modifier.Companion companion4 = companion3;
                gapComposer.startReplaceGroup(-158350171);
                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion4, 1.0f);
                seriesContainerViewModel2 = seriesContainerViewModel;
                ColorModel colorModel = seriesContainerViewModel2.backgroundColor;
                if (colorModel == null) {
                    gapComposer.startReplaceGroup(-1287445086);
                    gapComposer.end(false);
                    then = null;
                } else {
                    gapComposer.startReplaceGroup(-1287445085);
                    if (z) {
                        gapComposer.startReplaceGroup(-2094955985);
                        Color forTheme = ThemablesKt.forTheme(colorModel, gapComposer);
                        if (forTheme == null) {
                            gapComposer.startReplaceGroup(348064507);
                            com.squareup.cash.arcade.Colors colors = (com.squareup.cash.arcade.Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                            if (colors == null) {
                                z2 = false;
                                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                            } else {
                                z2 = false;
                                gapComposer.startReplaceGroup(-1762997739);
                                gapComposer.end(false);
                            }
                            backgroundColor = colors.semantic.background.f1047app;
                            gapComposer.end(z2);
                        } else {
                            z2 = false;
                            gapComposer.startReplaceGroup(348062771);
                            gapComposer.end(false);
                            backgroundColor = forTheme.value;
                        }
                        gapComposer.end(z2);
                    } else {
                        z2 = false;
                        gapComposer.startReplaceGroup(-2094879911);
                        backgroundColor = zzai.getBackgroundColor(colorModel, gapComposer);
                        gapComposer.end(false);
                    }
                    then = fillMaxWidth2.then(ImageKt.m177backgroundbw27NRU(companion4, backgroundColor, rectangleShapeKt$RectangleShape$1));
                    gapComposer.end(z2);
                }
                if (then != null) {
                    fillMaxWidth2 = then;
                }
                Modifier m301paddingqDBjuR03 = SpacerKt.m301paddingqDBjuR0(fillMaxWidth2, ((GenericContainerViewModel.ContainerMargin) obj2).value, SeriesContainerWidget$getVerticalSpacing(seriesContainerViewModel2), ((GenericContainerViewModel.ContainerMargin) obj).value, SeriesContainerWidget$getVerticalSpacing(seriesContainerViewModel2));
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m301paddingqDBjuR03);
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
                Updater.m576setimpl(gapComposer, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                gapComposer.startReplaceGroup(-750953018);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ContextUtilsKt.GenericComponentWidget((GenericComponentViewModel) it.next(), null, z, function1, gapComposer, i4 & 8064);
                    companion4 = companion4;
                }
                companion = companion4;
                Boxes$$ExternalSyntheticOutline1.m(gapComposer, false, true, false);
            }
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda34(seriesContainerViewModel2, modifier2, z, function1, i, 20);
        }
    }

    public static final float SeriesContainerWidget$getVerticalSpacing(GenericContainerViewModel.SeriesContainerViewModel seriesContainerViewModel) {
        if (Intrinsics.areEqual(seriesContainerViewModel.ignoreVerticalSpacing, Boolean.TRUE)) {
            return RecyclerView.DECELERATION_RATE;
        }
        return 24.0f;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:25|26))(8:27|28|(1:30)(1:43)|31|(1:33)(1:42)|(4:37|(1:14)(1:(1:23)(1:24))|(2:17|18)|21)|38|(1:40)(1:41))|12|(0)(0)|(2:17|18)|21))|45|6|7|(0)(0)|12|(0)(0)|(0)|21) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008e A[Catch: Exception -> 0x00a1, TryCatch #0 {Exception -> 0x00a1, blocks: (B:11:0x0028, B:12:0x0088, B:14:0x008e, B:17:0x009b, B:23:0x0093, B:28:0x0044, B:31:0x0050, B:38:0x0062), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0099 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object getLocationAndPrecision(Context context, ContinuationImpl continuationImpl) {
        GpsUtilsKt$getLocationAndPrecision$1 gpsUtilsKt$getLocationAndPrecision$1;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Location location;
        GpsPrecisionAuthorization gpsPrecisionAuthorization;
        if (continuationImpl instanceof GpsUtilsKt$getLocationAndPrecision$1) {
            gpsUtilsKt$getLocationAndPrecision$1 = (GpsUtilsKt$getLocationAndPrecision$1) continuationImpl;
            int i6 = gpsUtilsKt$getLocationAndPrecision$1.label;
            if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                gpsUtilsKt$getLocationAndPrecision$1.label = i6 - PKIFailureInfo.systemUnavail;
                Object obj = gpsUtilsKt$getLocationAndPrecision$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gpsUtilsKt$getLocationAndPrecision$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    int i7 = LocationServices.$r8$clinit;
                    zzbi zzbiVar = new zzbi(context, null, zzbi.zzb, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
                    i2 = Strings.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0 ? 1 : 0;
                    i3 = Strings.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? 1 : 0;
                    if (i2 == 0 && i3 == 0) {
                        location = null;
                        gpsPrecisionAuthorization = i2 != 0 ? GpsPrecisionAuthorization.PRECISE : i3 != 0 ? GpsPrecisionAuthorization.ROUGH : null;
                        if (location != null && gpsPrecisionAuthorization != null) {
                            return new GpsData(location, gpsPrecisionAuthorization);
                        }
                        return null;
                    }
                    zacn builder = zacn.builder();
                    builder.zaa = com.google.mlkit.vision.text.zzc.zza;
                    builder.zac = 2414;
                    zzw zae = zzbiVar.zae(0, builder.build());
                    zae.getClass();
                    gpsUtilsKt$getLocationAndPrecision$1.I$0 = i2;
                    gpsUtilsKt$getLocationAndPrecision$1.I$1 = i3;
                    gpsUtilsKt$getLocationAndPrecision$1.label = 1;
                    obj = Okio.awaitImpl(zae, null, gpsUtilsKt$getLocationAndPrecision$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    i4 = i2;
                    i5 = i3;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i5 = gpsUtilsKt$getLocationAndPrecision$1.I$1;
                    i4 = gpsUtilsKt$getLocationAndPrecision$1.I$0;
                    SafeTrace.throwOnFailure(obj);
                }
                location = (Location) obj;
                i3 = i5;
                i2 = i4;
                if (i2 != 0) {
                }
                if (location != null) {
                    return new GpsData(location, gpsPrecisionAuthorization);
                }
                return null;
            }
        }
        gpsUtilsKt$getLocationAndPrecision$1 = new GpsUtilsKt$getLocationAndPrecision$1(continuationImpl);
        Object obj2 = gpsUtilsKt$getLocationAndPrecision$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gpsUtilsKt$getLocationAndPrecision$1.label;
        if (i != 0) {
        }
        location = (Location) obj2;
        i3 = i5;
        i2 = i4;
        if (i2 != 0) {
        }
        if (location != null) {
        }
        return null;
    }
}
