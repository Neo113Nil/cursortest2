package coil3.size;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RenderNode;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.inputmethod.EditorInfo;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.camera.camera2.compat.Api35Compat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ArrayMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$Horizontal;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Vertical;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda17;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Outline$Generic;
import androidx.compose.ui.graphics.Outline$Rectangle;
import androidx.compose.ui.graphics.Outline$Rounded;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerV29;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityImpl;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.os.BundleCompat$Api33Impl;
import androidx.core.os.BundleKt;
import androidx.core.view.WindowCompat$Api30Impl;
import androidx.recyclerview.widget.RecyclerView;
import androidx.sqlite.SQLiteStatement;
import androidx.work.Data;
import androidx.work.impl.model.WorkSpec;
import app.cash.api.ApiResult;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.compose.ChromeConfigKt$$ExternalSyntheticLambda1;
import app.cash.local.screens.app.LocalBrandProfileScreen;
import app.cash.local.screens.app.LocalTabScreen;
import app.cash.local.views.LocalViewFactory;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda34;
import app.cash.local.views.map.LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.Dimension;
import coil3.size.SizeKt;
import coil3.util.AndroidSystemCallbacks;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.zzcc;
import com.google.android.gms.maps.zzaj;
import com.google.firebase.components.Component;
import com.google.firebase.components.CycleDetector$ComponentNode;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.DependencyCycleException;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.firebase.components.Qualified;
import com.squareup.cash.NavigationSideEffects;
import com.squareup.cash.activity.presenters.ActivityTabPresenter;
import com.squareup.cash.activity.presenters.RealActivityItemPresenterFactory;
import com.squareup.cash.arcade.ColorUtilsKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.HapticsKt;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.AlignmentLinesKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.button.ButtonColors;
import com.squareup.cash.arcade.components.button.ButtonKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.button.ButtonKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.button.ButtonValues;
import com.squareup.cash.arcade.components.internal.LocalEnabledStateKt;
import com.squareup.cash.arcade.components.internal.UtilsKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleConfiguration;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.autofillweb.real.RealCashFillJsStore;
import com.squareup.cash.blockers.treehouse.TreehouseFlows;
import com.squareup.cash.borrow.presenters.util.RealLoanFlowStarter$MetroFactory;
import com.squareup.cash.borrow.views.BorrowUiFactory;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.cashapplite.cashin.RealLiteCashInRepo$MetroFactory;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackOrientation;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackParentData;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScopeInstance;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackState;
import com.squareup.cash.composeUi.foundation.layout.SizeMode;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.fillr.real.FillrInitializer;
import com.squareup.cash.gcl.RealGlobalConfigManager;
import com.squareup.cash.investing.presenters.InvestingPresenterFactory;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.knot.backend.real.RealKnotLauncher;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.money.views.MoneyUiFactory;
import com.squareup.cash.observability.types.FeatureError;
import com.squareup.cash.observability.types.MetadataSection$AdditionalInfoSection;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda0;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.tabprovider.real.RealTabProvider;
import com.squareup.cash.ui.BroadwayModule$ProvideBroadwayMetroFactory;
import com.squareup.cash.util.RealDrawerOpener$MetroFactory;
import com.squareup.cash.wallet.presenters.CardSchemePresenter;
import com.squareup.cash.work.session.RealCurrentUserSetter;
import com.squareup.protos.common.countries.Country;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.squareup.util.workmanager.SandboxedCoroutineWorker;
import com.squareup.wire.GrpcMethod;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.KClass;
import okhttp3.Headers;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import timber.log.Timber;

/* loaded from: classes.dex */
public abstract class SizeKt {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SizeKt(int i) {
        this.$r8$classId = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AdaptiveStack(Modifier modifier, AdaptiveStackState adaptiveStackState, LayoutDirection layoutDirection, Arrangement$Horizontal arrangement$Horizontal, SizeMode sizeMode, AdaptiveStackOrientation adaptiveStackOrientation, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        AdaptiveStackState adaptiveStackState2;
        int i4;
        Arrangement$Horizontal arrangement$Horizontal2;
        int i5;
        int i6;
        LayoutDirection layoutDirection2;
        SizeMode sizeMode2;
        Modifier modifier3;
        AdaptiveStackState adaptiveStackState3;
        AdaptiveStackOrientation adaptiveStackOrientation2;
        RecomposeScopeImpl endRestartGroup;
        LayoutDirection layoutDirection3;
        SizeMode sizeMode3;
        AdaptiveStackOrientation adaptiveStackOrientation3;
        int i7;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-57499170);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            adaptiveStackState2 = adaptiveStackState;
            i3 |= gapComposer.changed(adaptiveStackState2) ? 32 : 16;
            if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                if ((i2 & 4) == 0) {
                    if (gapComposer.changed(layoutDirection == null ? -1 : layoutDirection.ordinal())) {
                        i7 = 256;
                        i3 |= i7;
                    }
                }
                i7 = 128;
                i3 |= i7;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                arrangement$Horizontal2 = arrangement$Horizontal;
                i3 |= gapComposer.changed(arrangement$Horizontal2) ? 2048 : 1024;
                i5 = i3 | 24576;
                i6 = i2 & 32;
                if (i6 != 0) {
                    i5 = i3 | 221184;
                } else if ((196608 & i) == 0) {
                    i5 |= gapComposer.changed(adaptiveStackOrientation != null ? adaptiveStackOrientation.ordinal() : -1) ? 131072 : 65536;
                }
                if (gapComposer.shouldExecute(i5 & 1, (599187 & i5) != 599186)) {
                    gapComposer.startDefaults();
                    int i10 = i & 1;
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (i10 == 0 || gapComposer.getDefaultsInvalid()) {
                        modifier3 = i8 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                        if (i9 != 0) {
                            Object rememberedValue = gapComposer.rememberedValue();
                            if (rememberedValue == neverEqualPolicy) {
                                rememberedValue = new AdaptiveStackState();
                                gapComposer.updateRememberedValue(rememberedValue);
                            }
                            adaptiveStackState2 = (AdaptiveStackState) rememberedValue;
                        }
                        if ((i2 & 4) != 0) {
                            layoutDirection3 = (LayoutDirection) gapComposer.consume(CompositionLocalsKt.LocalLayoutDirection);
                            i5 &= -897;
                        } else {
                            layoutDirection3 = layoutDirection;
                        }
                        if (i4 != 0) {
                            arrangement$Horizontal2 = SpacerKt.Start;
                        }
                        sizeMode3 = SizeMode.Expand;
                        adaptiveStackOrientation3 = i6 != 0 ? AdaptiveStackOrientation.Auto : adaptiveStackOrientation;
                    } else {
                        gapComposer.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i5 &= -897;
                        }
                        sizeMode3 = sizeMode;
                        adaptiveStackOrientation3 = adaptiveStackOrientation;
                        modifier3 = modifier2;
                        layoutDirection3 = layoutDirection;
                    }
                    gapComposer.endDefaults();
                    boolean z = ((i5 & 112) == 32) | ((i5 & 7168) == 2048) | ((458752 & i5) == 131072) | ((((i5 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && gapComposer.changed(layoutDirection3.ordinal())) || (i5 & MLKEMEngine.KyberPolyBytes) == 256);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (z || rememberedValue2 == neverEqualPolicy) {
                        final LayoutDirection layoutDirection4 = layoutDirection3;
                        final SizeMode sizeMode4 = sizeMode3;
                        final AdaptiveStackOrientation adaptiveStackOrientation4 = adaptiveStackOrientation3;
                        final AdaptiveStackState adaptiveStackState4 = adaptiveStackState2;
                        final Arrangement$Horizontal arrangement$Horizontal3 = arrangement$Horizontal2;
                        rememberedValue2 = new MeasurePolicy() { // from class: com.squareup.cash.composeUi.foundation.layout.AdaptiveStackKt$AdaptiveStack$2$1
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            /* renamed from: measure-3p2s80s */
                            public final MeasureResult mo138measure3p2s80s(MeasureScope measureScope, List list, long j) {
                                int i11;
                                int i12;
                                int[] iArr;
                                Ref$IntRef ref$IntRef;
                                int i13;
                                AdaptiveStackState.MeasureResult measureResult;
                                Ref$IntRef ref$IntRef2;
                                AdaptiveStackState.MeasuredOrientation measuredOrientation;
                                final AdaptiveStackState.MeasureResult measureResult2;
                                final int[] iArr2;
                                final Ref$IntRef ref$IntRef3;
                                int i14;
                                int i15;
                                int i16;
                                int i17;
                                int i18;
                                measureScope.getClass();
                                list.getClass();
                                Arrangement$Horizontal arrangement$Horizontal4 = Arrangement$Horizontal.this;
                                int mo230roundToPx0680j_4 = measureScope.mo230roundToPx0680j_4(arrangement$Horizontal4.mo252getSpacingD9Ej5fM());
                                int size = list.size();
                                AdaptiveStackParentData[] adaptiveStackParentDataArr = new AdaptiveStackParentData[size];
                                for (int i19 = 0; i19 < size; i19++) {
                                    adaptiveStackParentDataArr[i19] = SizeKt.getAdaptiveStackParentData((IntrinsicMeasurable) list.get(i19));
                                }
                                int size2 = list.size();
                                final Placeable[] placeableArr = new Placeable[size2];
                                int m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(j);
                                List list2 = list;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                Iterator it = list2.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(Integer.valueOf(((Measurable) it.next()).maxIntrinsicHeight(m1025getMaxWidthimpl)));
                                }
                                int size3 = list.size();
                                int[] iArr3 = new int[size3];
                                for (int i20 = 0; i20 < size3; i20++) {
                                    iArr3[i20] = 0;
                                }
                                int size4 = list.size();
                                int[] iArr4 = new int[size4];
                                int i21 = 0;
                                for (int i22 = 0; i22 < size4; i22++) {
                                    iArr4[i22] = 0;
                                }
                                Ref$IntRef ref$IntRef4 = new Ref$IntRef();
                                AdaptiveStackState adaptiveStackState5 = adaptiveStackState4;
                                adaptiveStackState5.getClass();
                                ParcelableSnapshotMutableState parcelableSnapshotMutableState = adaptiveStackState5.lastMeasuredOrientation$delegate;
                                AdaptiveStackOrientation adaptiveStackOrientation5 = adaptiveStackOrientation4;
                                adaptiveStackOrientation5.getClass();
                                AdaptiveStackOrientation adaptiveStackOrientation6 = AdaptiveStackOrientation.ForcedVertical;
                                Integer num = null;
                                AdaptiveStackState.MeasureResult measureResult3 = AdaptiveStackState.MeasureResult.PlaceVertically.INSTANCE;
                                if (adaptiveStackOrientation5 == adaptiveStackOrientation6 || (adaptiveStackOrientation5 == AdaptiveStackOrientation.AutoUntilVertical && ((AdaptiveStackState.MeasuredOrientation) parcelableSnapshotMutableState.getValue()) == AdaptiveStackState.MeasuredOrientation.Vertical)) {
                                    i13 = mo230roundToPx0680j_4;
                                    ref$IntRef = ref$IntRef4;
                                    i12 = size2;
                                    measureResult2 = measureResult3;
                                    iArr = iArr3;
                                    i11 = 1;
                                } else {
                                    i11 = 1;
                                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                    for (Iterator it2 = list2.iterator(); it2.hasNext(); it2 = it2) {
                                        arrayList2.add(Integer.valueOf(((IntrinsicMeasurable) it2.next()).maxIntrinsicWidth(Constraints.m1024getMaxHeightimpl(j))));
                                    }
                                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                    Iterator it3 = list2.iterator();
                                    while (it3.hasNext()) {
                                        arrayList3.add(Integer.valueOf(((IntrinsicMeasurable) it3.next()).minIntrinsicHeight(Constraints.m1025getMaxWidthimpl(j))));
                                    }
                                    if (((list.size() - 1) * mo230roundToPx0680j_4) + CollectionsKt.sumOfInt(arrayList2) > Constraints.m1025getMaxWidthimpl(j)) {
                                        i13 = mo230roundToPx0680j_4;
                                        ref$IntRef = ref$IntRef4;
                                        i12 = size2;
                                        measureResult = measureResult3;
                                        iArr = iArr3;
                                    } else {
                                        int[] iArr5 = new int[list.size()];
                                        int[] iArr6 = new int[list.size()];
                                        List list3 = list;
                                        IntProgressionIterator it4 = CollectionsKt__CollectionsKt.getIndices(list3).iterator();
                                        i12 = size2;
                                        iArr = iArr3;
                                        int i23 = 0;
                                        int i24 = 0;
                                        int i25 = 0;
                                        float f = 0.0f;
                                        while (it4.hasNext) {
                                            int nextInt = it4.nextInt();
                                            IntProgressionIterator intProgressionIterator = it4;
                                            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(nextInt);
                                            AdaptiveStackParentData adaptiveStackParentData = SizeKt.getAdaptiveStackParentData((IntrinsicMeasurable) list.get(nextInt));
                                            float f2 = adaptiveStackParentData != null ? adaptiveStackParentData.weight : 0.0f;
                                            if (f2 > RecyclerView.DECELERATION_RATE) {
                                                f += f2;
                                                i23++;
                                                ref$IntRef2 = ref$IntRef4;
                                            } else {
                                                int i26 = i21;
                                                int m1025getMaxWidthimpl2 = (Constraints.m1025getMaxWidthimpl(j) - i24) - intrinsicMeasurable.minIntrinsicWidth(i26);
                                                ref$IntRef2 = ref$IntRef4;
                                                int min = Math.min(mo230roundToPx0680j_4, m1025getMaxWidthimpl2 < 0 ? i26 : m1025getMaxWidthimpl2);
                                                i25 = min;
                                                i24 = intrinsicMeasurable.minIntrinsicWidth(i26) + min + i24;
                                            }
                                            iArr6[nextInt] = i24;
                                            ref$IntRef4 = ref$IntRef2;
                                            it4 = intProgressionIterator;
                                            i21 = 0;
                                        }
                                        ref$IntRef = ref$IntRef4;
                                        int m1027getMinWidthimpl = (((f <= RecyclerView.DECELERATION_RATE || Constraints.m1025getMaxWidthimpl(j) == Integer.MAX_VALUE) ? Constraints.m1027getMinWidthimpl(j) : Constraints.m1025getMaxWidthimpl(j)) - i24) - ((i23 - 1) * mo230roundToPx0680j_4);
                                        if (m1027getMinWidthimpl < 0) {
                                            m1027getMinWidthimpl = 0;
                                        }
                                        float f3 = f > RecyclerView.DECELERATION_RATE ? m1027getMinWidthimpl / f : 0.0f;
                                        if (i23 == 0) {
                                            i24 -= i25;
                                            i13 = mo230roundToPx0680j_4;
                                        } else {
                                            IntProgressionIterator it5 = CollectionsKt__CollectionsKt.getIndices(list3).iterator();
                                            i13 = mo230roundToPx0680j_4;
                                            int i27 = 0;
                                            while (it5.hasNext) {
                                                AdaptiveStackParentData adaptiveStackParentData2 = SizeKt.getAdaptiveStackParentData((IntrinsicMeasurable) list.get(it5.nextInt()));
                                                i27 = MathKt__MathJVMKt.roundToInt((adaptiveStackParentData2 != null ? adaptiveStackParentData2.weight : 0.0f) * f3) + i27;
                                            }
                                            int i28 = m1027getMinWidthimpl - i27;
                                            IntProgressionIterator it6 = CollectionsKt__CollectionsKt.getIndices(list3).iterator();
                                            while (it6.hasNext) {
                                                int nextInt2 = it6.nextInt();
                                                IntProgressionIterator intProgressionIterator2 = it6;
                                                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) list.get(nextInt2);
                                                float f4 = f3;
                                                AdaptiveStackParentData adaptiveStackParentData3 = SizeKt.getAdaptiveStackParentData(intrinsicMeasurable2);
                                                float f5 = adaptiveStackParentData3 != null ? adaptiveStackParentData3.weight : 0.0f;
                                                if (f5 > RecyclerView.DECELERATION_RATE) {
                                                    int signum = Integer.signum(i28);
                                                    int i29 = i28 - signum;
                                                    int max = Math.max(0, MathKt__MathJVMKt.roundToInt(f5 * f4) + signum);
                                                    iArr5[nextInt2] = max;
                                                    if (intrinsicMeasurable2.minIntrinsicHeight(max) > ((Number) arrayList3.get(nextInt2)).intValue()) {
                                                        measureResult = measureResult3;
                                                        break;
                                                    }
                                                    i28 = i29;
                                                } else {
                                                    iArr5[nextInt2] = intrinsicMeasurable2.maxIntrinsicWidth(0);
                                                    i28 = i28;
                                                }
                                                f3 = f4;
                                                it6 = intProgressionIterator2;
                                            }
                                        }
                                        measureResult = new AdaptiveStackState.MeasureResult.PlaceHorizontally(i23, i24, iArr6, iArr5);
                                    }
                                    if (measureResult instanceof AdaptiveStackState.MeasureResult.PlaceHorizontally) {
                                        measuredOrientation = AdaptiveStackState.MeasuredOrientation.Horizontal;
                                    } else {
                                        if (!(measureResult instanceof AdaptiveStackState.MeasureResult.PlaceVertically)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        measuredOrientation = AdaptiveStackState.MeasuredOrientation.Vertical;
                                    }
                                    parcelableSnapshotMutableState.setValue(measuredOrientation);
                                    measureResult2 = measureResult;
                                }
                                if (measureResult2.equals(measureResult3)) {
                                    IntProgressionIterator it7 = CollectionsKt__CollectionsKt.getIndices(list).iterator();
                                    while (it7.hasNext) {
                                        int nextInt3 = it7.nextInt();
                                        Measurable measurable = (Measurable) list.get(nextInt3);
                                        boolean areEqual = Intrinsics.areEqual(RulerKt.getLayoutId(measurable), "dividerId");
                                        SizeMode sizeMode5 = sizeMode4;
                                        if (areEqual) {
                                            int minIntrinsicHeight = measurable.minIntrinsicHeight(0);
                                            int min2 = minIntrinsicHeight > 0 ? Math.min(minIntrinsicHeight, measurable.minIntrinsicWidth(0)) : measurable.minIntrinsicWidth(0);
                                            int ordinal = sizeMode5.ordinal();
                                            if (ordinal == 0) {
                                                i18 = 0;
                                            } else {
                                                if (ordinal != i11) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    return null;
                                                }
                                                i18 = m1025getMaxWidthimpl;
                                            }
                                            placeableArr[nextInt3] = measurable.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j, i18, 0, min2, min2, 2));
                                        } else {
                                            int ordinal2 = sizeMode5.ordinal();
                                            if (ordinal2 == 0) {
                                                i17 = 0;
                                            } else {
                                                if (ordinal2 != 1) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    return null;
                                                }
                                                i17 = m1025getMaxWidthimpl;
                                            }
                                            placeableArr[nextInt3] = measurable.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j, i17, 0, measurable.minIntrinsicHeight(m1025getMaxWidthimpl), measurable.maxIntrinsicHeight(m1025getMaxWidthimpl), 2));
                                        }
                                        i11 = 1;
                                    }
                                    List filterNotNull = ArraysKt___ArraysKt.filterNotNull(placeableArr);
                                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(filterNotNull, 10));
                                    Iterator it8 = filterNotNull.iterator();
                                    while (it8.hasNext()) {
                                        arrayList4.add(Integer.valueOf(((Placeable) it8.next()).height));
                                    }
                                    int[] intArray = CollectionsKt.toIntArray(arrayList4);
                                    (arrangement$Horizontal4 instanceof Arrangement$Vertical ? (Arrangement$Vertical) arrangement$Horizontal4 : new Arrangement$SpacedAligned(arrangement$Horizontal4.mo252getSpacingD9Ej5fM(), true, new Drop$$ExternalSyntheticBUOutline0(3))).arrange(measureScope, (i12 * i13) + ArraysKt___ArraysKt.sum(intArray), intArray, iArr4);
                                    if (list.isEmpty()) {
                                        i16 = 0;
                                    } else {
                                        if (size4 == 0) {
                                            OptionalProvider$$ExternalSyntheticLambda0.m("Array is empty.");
                                            return null;
                                        }
                                        int i30 = iArr4[size4 - 1];
                                        Object last = ArraysKt___ArraysKt.last(placeableArr);
                                        last.getClass();
                                        i16 = i30 + ((Placeable) last).height;
                                    }
                                    iArr2 = iArr4;
                                    ref$IntRef3 = ref$IntRef;
                                    ref$IntRef3.element = i16;
                                } else {
                                    iArr2 = iArr4;
                                    ref$IntRef3 = ref$IntRef;
                                    if (!(measureResult2 instanceof AdaptiveStackState.MeasureResult.PlaceHorizontally)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    IntProgressionIterator it9 = CollectionsKt__CollectionsKt.getIndices(list).iterator();
                                    int i31 = 0;
                                    while (it9.hasNext) {
                                        int nextInt4 = it9.nextInt();
                                        Measurable measurable2 = (Measurable) list.get(nextInt4);
                                        AdaptiveStackParentData adaptiveStackParentData4 = adaptiveStackParentDataArr[nextInt4];
                                        if ((adaptiveStackParentData4 != null ? adaptiveStackParentData4.weight : 0.0f) == RecyclerView.DECELERATION_RATE) {
                                            if (m1025getMaxWidthimpl == Integer.MAX_VALUE) {
                                                i14 = Integer.MAX_VALUE;
                                            } else {
                                                int[] iArr7 = ((AdaptiveStackState.MeasureResult.PlaceHorizontally) measureResult2).fixedSpaces;
                                                int i32 = nextInt4 - 1;
                                                i14 = m1025getMaxWidthimpl - ((i32 < 0 || i32 >= iArr7.length) ? 0 : iArr7[i32]);
                                                if (i14 < 0) {
                                                    i14 = 0;
                                                }
                                            }
                                            placeableArr[nextInt4] = measurable2.mo833measureBRTryo0(Constraints.m1017copyZbe2FdA(0, i14, 0, ((Number) CollectionsKt.maxOrThrow((Iterable) arrayList)).intValue()));
                                        } else {
                                            int i33 = ((AdaptiveStackState.MeasureResult.PlaceHorizontally) measureResult2).childWidths[nextInt4];
                                            if ((adaptiveStackParentData4 != null ? adaptiveStackParentData4.fill : true) && i33 != Integer.MAX_VALUE) {
                                                i15 = i33;
                                                Placeable mo833measureBRTryo0 = measurable2.mo833measureBRTryo0(ConstraintsKt.Constraints(i15, i33, 0, Constraints.m1024getMaxHeightimpl(j)));
                                                i31 += mo833measureBRTryo0.width;
                                                placeableArr[nextInt4] = mo833measureBRTryo0;
                                            }
                                            i15 = 0;
                                            Placeable mo833measureBRTryo02 = measurable2.mo833measureBRTryo0(ConstraintsKt.Constraints(i15, i33, 0, Constraints.m1024getMaxHeightimpl(j)));
                                            i31 += mo833measureBRTryo02.width;
                                            placeableArr[nextInt4] = mo833measureBRTryo02;
                                        }
                                    }
                                    int i34 = ((AdaptiveStackState.MeasureResult.PlaceHorizontally) measureResult2).fixedSpace;
                                    int coerceIn = RangesKt___RangesKt.coerceIn(((r2.weightChildrenCount - 1) * i13) + i31, 0, m1025getMaxWidthimpl - i34) + i34;
                                    if (coerceIn < 0) {
                                        coerceIn = 0;
                                    }
                                    int max2 = Math.max(coerceIn, Constraints.m1027getMinWidthimpl(j));
                                    LayoutDirection layoutDirection5 = measureScope.getLayoutDirection();
                                    LayoutDirection layoutDirection6 = layoutDirection4;
                                    if (layoutDirection6 == layoutDirection5) {
                                        layoutDirection6 = measureScope.getLayoutDirection();
                                    }
                                    int i35 = i12;
                                    ArrayList arrayList5 = new ArrayList(i35);
                                    for (int i36 = 0; i36 < i35; i36++) {
                                        Placeable placeable = placeableArr[i36];
                                        placeable.getClass();
                                        arrayList5.add(Integer.valueOf(placeable.width));
                                    }
                                    Arrangement$Horizontal.this.arrange(measureScope, max2, CollectionsKt.toIntArray(arrayList5), layoutDirection6, iArr);
                                    if (i35 != 0) {
                                        Placeable placeable2 = placeableArr[0];
                                        Integer valueOf = Integer.valueOf(placeable2 != null ? placeable2.height : 0);
                                        int i37 = 1;
                                        int i38 = i35 - 1;
                                        if (1 <= i38) {
                                            while (true) {
                                                Placeable placeable3 = placeableArr[i37];
                                                Integer valueOf2 = Integer.valueOf(placeable3 != null ? placeable3.height : 0);
                                                if (valueOf.compareTo(valueOf2) < 0) {
                                                    valueOf = valueOf2;
                                                }
                                                if (i37 == i38) {
                                                    break;
                                                }
                                                i37++;
                                            }
                                        }
                                        num = valueOf;
                                    }
                                    ref$IntRef3.element = num != null ? num.intValue() : 0;
                                }
                                final int[] iArr8 = iArr;
                                return MeasureScope.layout$default(measureScope, m1025getMaxWidthimpl, ref$IntRef3.element, new Function1() { // from class: com.squareup.cash.composeUi.foundation.layout.AdaptiveStackKt$AdaptiveStack$2$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                                        placementScope.getClass();
                                        Placeable[] placeableArr2 = placeableArr;
                                        int length = placeableArr2.length;
                                        int i39 = 0;
                                        int i40 = 0;
                                        while (i39 < length) {
                                            Placeable placeable4 = placeableArr2[i39];
                                            int i41 = i40 + 1;
                                            AdaptiveStackState.MeasureResult.PlaceVertically placeVertically = AdaptiveStackState.MeasureResult.PlaceVertically.INSTANCE;
                                            AdaptiveStackState.MeasureResult measureResult4 = measureResult2;
                                            if (measureResult4.equals(placeVertically)) {
                                                if (placeable4 != null) {
                                                    placementScope.placeRelative(placeable4, 0, iArr2[i40], RecyclerView.DECELERATION_RATE);
                                                }
                                            } else {
                                                if (!(measureResult4 instanceof AdaptiveStackState.MeasureResult.PlaceHorizontally)) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    return null;
                                                }
                                                if (placeable4 != null) {
                                                    placementScope.placeRelative(placeable4, iArr8[i40], Recorder$$ExternalSyntheticOutline2.m(ref$IntRef3.element - placeable4.height, 2.0f, 1.0f), RecyclerView.DECELERATION_RATE);
                                                }
                                            }
                                            i39++;
                                            i40 = i41;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                });
                            }
                        };
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue2;
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier3);
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
                    Updater.m576setimpl(gapComposer, measurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    composableLambdaImpl.invoke(AdaptiveStackScopeInstance.INSTANCE, (Object) gapComposer, (Object) 54);
                    gapComposer.end(true);
                    sizeMode2 = sizeMode3;
                    layoutDirection2 = layoutDirection3;
                    adaptiveStackState3 = adaptiveStackState2;
                    adaptiveStackOrientation2 = adaptiveStackOrientation3;
                } else {
                    gapComposer.skipToGroupEnd();
                    layoutDirection2 = layoutDirection;
                    sizeMode2 = sizeMode;
                    modifier3 = modifier2;
                    adaptiveStackState3 = adaptiveStackState2;
                    adaptiveStackOrientation2 = adaptiveStackOrientation;
                }
                Arrangement$Horizontal arrangement$Horizontal4 = arrangement$Horizontal2;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new ChromeConfigKt$$ExternalSyntheticLambda1(modifier3, adaptiveStackState3, layoutDirection2, arrangement$Horizontal4, sizeMode2, adaptiveStackOrientation2, composableLambdaImpl, i, i2, 3);
                    return;
                }
                return;
            }
            arrangement$Horizontal2 = arrangement$Horizontal;
            i5 = i3 | 24576;
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            if (gapComposer.shouldExecute(i5 & 1, (599187 & i5) != 599186)) {
            }
            Arrangement$Horizontal arrangement$Horizontal42 = arrangement$Horizontal2;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        adaptiveStackState2 = adaptiveStackState;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        arrangement$Horizontal2 = arrangement$Horizontal;
        i5 = i3 | 24576;
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        if (gapComposer.shouldExecute(i5 & 1, (599187 & i5) != 599186)) {
        }
        Arrangement$Horizontal arrangement$Horizontal422 = arrangement$Horizontal2;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void BaseButton(final ButtonColors buttonColors, final ButtonValues buttonValues, final Function0 function0, final Modifier modifier, final boolean z, final MutableInteractionSourceImpl mutableInteractionSourceImpl, final Function3 function3, Composer composer, final int i) {
        int i2;
        Shape shape;
        ButtonValues.ClipType clipType = buttonValues.clipType;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2036025509);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(buttonColors) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(buttonValues) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(modifier) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(z) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changed(mutableInteractionSourceImpl) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changedInstance(function3) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if (gapComposer.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ArrayMap(1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            final ArrayMap arrayMap = (ArrayMap) rememberedValue;
            long j = z ? buttonColors.textEnabled : buttonColors.textDisabled;
            long j2 = z ? buttonColors.iconEnabled : buttonColors.iconDisabled;
            long j3 = !z ? buttonColors.backgroundDisabled : buttonColors.backgroundEnabled;
            if (clipType instanceof ButtonValues.ClipType.Pill) {
                gapComposer.startReplaceGroup(1884593075);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                Object obj = DefaultSizes.border.entries;
                shape = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f);
                gapComposer.end(false);
            } else if (clipType instanceof ButtonValues.ClipType.RoundedCorners) {
                gapComposer.startReplaceGroup(1884595749);
                gapComposer.end(false);
                shape = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f);
            } else {
                if (!(clipType instanceof ButtonValues.ClipType.Rectangle)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1884591886, false);
                }
                gapComposer.startReplaceGroup(1884597801);
                gapComposer.end(false);
                shape = ColorKt.RectangleShape;
            }
            final long j4 = j3;
            final Shape shape2 = shape;
            Updater.CompositionLocalProvider(new ProvidedValue[]{ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(buttonValues.textStyle), re$$ExternalSyntheticOutline0.m(j, ArcadeThemeKt.LocalTextColor), Recorder$$ExternalSyntheticOutline2.m(j2, ArcadeThemeKt.LocalIconColor), re$$ExternalSyntheticOutline0.m(buttonColors.circularProgress, ProgressCircularKt.LocalCircularProgressColor), RippleKt.LocalRippleConfiguration.defaultProvidedValue$runtime(buttonColors.rippleConfiguration), LocalEnabledStateKt.LocalEnabledState.defaultProvidedValue$runtime(Boolean.valueOf(z))}, Expect_jvmKt.rememberComposableLambda(-1755956197, new Function2() { // from class: com.squareup.cash.arcade.components.button.ButtonKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                        ButtonValues buttonValues2 = ButtonValues.this;
                        float f = buttonValues2.itemSpacing;
                        long j5 = buttonValues2.minSize;
                        Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(f, true, new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(Alignment.Companion.CenterHorizontally, 1));
                        BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                        Modifier m275defaultMinSizeVpY3zN4 = androidx.compose.foundation.layout.SizeKt.m275defaultMinSizeVpY3zN4(modifier, DpSize.m1044getWidthD9Ej5fM(j5), DpSize.m1043getHeightD9Ej5fM(j5));
                        long j6 = j4;
                        Shape shape3 = shape2;
                        Modifier recordVerticalCenter = AlignmentLinesKt.recordVerticalCenter(ClipKt.clip(ImageKt.m177backgroundbw27NRU(m275defaultMinSizeVpY3zN4, j6, shape3), shape3), AlignmentLinesKt.InteractiveCenter, arrayMap);
                        Modifier modifier2 = Modifier.Companion.$$INSTANCE;
                        Function0 function02 = function0;
                        if (function02 != null) {
                            gapComposer2.startReplaceGroup(1011138987);
                            modifier2 = ImageKt.m182clickableO2vRcR0$default(modifier2, mutableInteractionSourceImpl, RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer2, 0, 15), z, null, new Role(0), PlatformKt.withHaptics(function02, ((Haptics) gapComposer2.consume(HapticsKt.LocalHaptics)).input.standard, gapComposer2, 0, 0), 8);
                            gapComposer2.end(false);
                        } else {
                            gapComposer2.startReplaceGroup(1011432929);
                            gapComposer2.end(false);
                        }
                        Modifier padding = SpacerKt.padding(recordVerticalCenter.then(modifier2), buttonValues2.padding);
                        RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, vertical, gapComposer2, 48);
                        int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, padding);
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
                        Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                        function3.invoke(RowScopeInstance.INSTANCE, gapComposer2, 6);
                        gapComposer2.end(true);
                    } else {
                        gapComposer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.arcade.components.button.ButtonKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    SizeKt.BaseButton(ButtonColors.this, buttonValues, function0, modifier, z, mutableInteractionSourceImpl, function3, (Composer) obj2, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Button(Function0 function0, Modifier modifier, ButtonProminence buttonProminence, boolean z, boolean z2, MutableInteractionSourceImpl mutableInteractionSourceImpl, Function3 function3, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        int i6;
        GapComposer gapComposer;
        Modifier modifier3;
        boolean z5;
        boolean z6;
        ButtonProminence buttonProminence2;
        MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        RecomposeScopeImpl endRestartGroup;
        int i7;
        ButtonProminence buttonProminence3;
        MutableInteractionSourceImpl mutableInteractionSourceImpl3;
        boolean z7;
        ButtonValues m1094default;
        int i8;
        function0.getClass();
        function3.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-449213726);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer2.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                i3 |= gapComposer2.changed(buttonProminence == null ? -1 : buttonProminence.ordinal()) ? 256 : 128;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z;
                i3 |= gapComposer2.changed(z3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        z4 = z2;
                        if (gapComposer2.changed(z4)) {
                            i8 = 16384;
                            i3 |= i8;
                        }
                    } else {
                        z4 = z2;
                    }
                    i8 = PKIFailureInfo.certRevoked;
                    i3 |= i8;
                } else {
                    z4 = z2;
                }
                i6 = i3 | 196608;
                if ((1572864 & i) == 0) {
                    i6 |= gapComposer2.changedInstance(function3) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                }
                if (gapComposer2.shouldExecute(i6 & 1, (599187 & i6) != 599186)) {
                    gapComposer2.startDefaults();
                    if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                        Modifier modifier4 = i9 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                        ButtonProminence buttonProminence4 = i4 != 0 ? ButtonProminence.STANDARD : buttonProminence;
                        if (i5 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            i6 &= -57345;
                            z4 = ((Boolean) gapComposer2.consume(LocalEnabledStateKt.LocalEnabledState)).booleanValue();
                        }
                        Object rememberedValue = gapComposer2.rememberedValue();
                        if (rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
                        }
                        Modifier modifier5 = modifier4;
                        i7 = i6;
                        buttonProminence3 = buttonProminence4;
                        modifier2 = modifier5;
                        mutableInteractionSourceImpl3 = (MutableInteractionSourceImpl) rememberedValue;
                        z7 = z4;
                    } else {
                        gapComposer2.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i6 &= -57345;
                        }
                        mutableInteractionSourceImpl3 = mutableInteractionSourceImpl;
                        i7 = i6;
                        z7 = z4;
                        buttonProminence3 = buttonProminence;
                    }
                    gapComposer2.endDefaults();
                    ButtonColors buttonColors = buttonColors(buttonProminence3, z3, gapComposer2);
                    if (buttonProminence3 == ButtonProminence.SUBTLE) {
                        gapComposer2.startReplaceGroup(2097320497);
                        ButtonValues m1094default2 = BundleKt.m1094default(gapComposer2);
                        m1094default = ButtonValues.m3387copy6sb1mg$default(m1094default2, TextStyle.m994copyp1EtxEg$default(m1094default2.textStyle, 0L, 0L, null, null, 0L, null, 0L, TextDecoration.Underline, null, null, 0, 0L, null, null, 0, 16773119), 23);
                    } else {
                        gapComposer2.startReplaceGroup(2097321579);
                        m1094default = BundleKt.m1094default(gapComposer2);
                    }
                    gapComposer2.end(false);
                    gapComposer = gapComposer2;
                    Modifier modifier6 = modifier2;
                    BaseButton(buttonColors, m1094default, function0, modifier6, z7, mutableInteractionSourceImpl3, function3, gapComposer, ((i7 << 6) & 8064) | (57344 & i7) | (458752 & i7) | (i7 & 3670016));
                    buttonProminence2 = buttonProminence3;
                    z5 = z3;
                    modifier3 = modifier6;
                    z6 = z7;
                    mutableInteractionSourceImpl2 = mutableInteractionSourceImpl3;
                } else {
                    gapComposer = gapComposer2;
                    gapComposer.skipToGroupEnd();
                    modifier3 = modifier2;
                    z5 = z3;
                    z6 = z4;
                    buttonProminence2 = buttonProminence;
                    mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new ButtonKt$$ExternalSyntheticLambda1(function0, modifier3, buttonProminence2, z5, z6, mutableInteractionSourceImpl2, function3, i, i2, 0);
                    return;
                }
                return;
            }
            z3 = z;
            if ((i & 24576) == 0) {
            }
            i6 = i3 | 196608;
            if ((1572864 & i) == 0) {
            }
            if (gapComposer2.shouldExecute(i6 & 1, (599187 & i6) != 599186)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        z3 = z;
        if ((i & 24576) == 0) {
        }
        i6 = i3 | 196608;
        if ((1572864 & i) == 0) {
        }
        if (gapComposer2.shouldExecute(i6 & 1, (599187 & i6) != 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ButtonCompact(Function0 function0, Modifier modifier, ButtonProminence buttonProminence, boolean z, boolean z2, MutableInteractionSourceImpl mutableInteractionSourceImpl, Function3 function3, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        int i6;
        GapComposer gapComposer;
        Modifier modifier3;
        boolean z5;
        boolean z6;
        ButtonProminence buttonProminence2;
        MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        RecomposeScopeImpl endRestartGroup;
        int i7;
        ButtonProminence buttonProminence3;
        MutableInteractionSourceImpl mutableInteractionSourceImpl3;
        boolean z7;
        ButtonValues compact;
        int i8;
        function3.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1658399323);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer2.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                i3 |= gapComposer2.changed(buttonProminence == null ? -1 : buttonProminence.ordinal()) ? 256 : 128;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z;
                i3 |= gapComposer2.changed(z3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        z4 = z2;
                        if (gapComposer2.changed(z4)) {
                            i8 = 16384;
                            i3 |= i8;
                        }
                    } else {
                        z4 = z2;
                    }
                    i8 = PKIFailureInfo.certRevoked;
                    i3 |= i8;
                } else {
                    z4 = z2;
                }
                i6 = i3 | 196608;
                if ((1572864 & i) == 0) {
                    i6 |= gapComposer2.changedInstance(function3) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                }
                if (gapComposer2.shouldExecute(i6 & 1, (599187 & i6) != 599186)) {
                    gapComposer2.startDefaults();
                    if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                        Modifier modifier4 = i9 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                        ButtonProminence buttonProminence4 = i4 != 0 ? ButtonProminence.STANDARD : buttonProminence;
                        if (i5 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            i6 &= -57345;
                            z4 = ((Boolean) gapComposer2.consume(LocalEnabledStateKt.LocalEnabledState)).booleanValue();
                        }
                        Object rememberedValue = gapComposer2.rememberedValue();
                        if (rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
                        }
                        Modifier modifier5 = modifier4;
                        i7 = i6;
                        buttonProminence3 = buttonProminence4;
                        modifier2 = modifier5;
                        mutableInteractionSourceImpl3 = (MutableInteractionSourceImpl) rememberedValue;
                        z7 = z4;
                    } else {
                        gapComposer2.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i6 &= -57345;
                        }
                        mutableInteractionSourceImpl3 = mutableInteractionSourceImpl;
                        i7 = i6;
                        z7 = z4;
                        buttonProminence3 = buttonProminence;
                    }
                    gapComposer2.endDefaults();
                    ButtonColors buttonColors = buttonColors(buttonProminence3, z3, gapComposer2);
                    if (buttonProminence3 == ButtonProminence.SUBTLE) {
                        gapComposer2.startReplaceGroup(-288867980);
                        ButtonValues compact2 = BundleKt.compact(gapComposer2);
                        compact = ButtonValues.m3387copy6sb1mg$default(compact2, TextStyle.m994copyp1EtxEg$default(compact2.textStyle, 0L, 0L, null, null, 0L, null, 0L, TextDecoration.Underline, null, null, 0, 0L, null, null, 0, 16773119), 23);
                    } else {
                        gapComposer2.startReplaceGroup(-288866898);
                        compact = BundleKt.compact(gapComposer2);
                    }
                    gapComposer2.end(false);
                    gapComposer = gapComposer2;
                    Modifier modifier6 = modifier2;
                    BaseButton(buttonColors, compact, function0, modifier6, z7, mutableInteractionSourceImpl3, function3, gapComposer, ((i7 << 6) & 8064) | (57344 & i7) | (458752 & i7) | (i7 & 3670016));
                    buttonProminence2 = buttonProminence3;
                    z5 = z3;
                    modifier3 = modifier6;
                    z6 = z7;
                    mutableInteractionSourceImpl2 = mutableInteractionSourceImpl3;
                } else {
                    gapComposer = gapComposer2;
                    gapComposer.skipToGroupEnd();
                    modifier3 = modifier2;
                    z5 = z3;
                    z6 = z4;
                    buttonProminence2 = buttonProminence;
                    mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new ButtonKt$$ExternalSyntheticLambda1(function0, modifier3, buttonProminence2, z5, z6, mutableInteractionSourceImpl2, function3, i, i2, 1);
                    return;
                }
                return;
            }
            z3 = z;
            if ((i & 24576) == 0) {
            }
            i6 = i3 | 196608;
            if ((1572864 & i) == 0) {
            }
            if (gapComposer2.shouldExecute(i6 & 1, (599187 & i6) != 599186)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        z3 = z;
        if ((i & 24576) == 0) {
        }
        i6 = i3 | 196608;
        if ((1572864 & i) == 0) {
        }
        if (gapComposer2.shouldExecute(i6 & 1, (599187 & i6) != 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ButtonCta(final Function0 function0, Modifier modifier, ButtonProminence buttonProminence, boolean z, boolean z2, MutableInteractionSourceImpl mutableInteractionSourceImpl, final Function3 function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        int i6;
        GapComposer gapComposer;
        final Modifier modifier3;
        final boolean z5;
        final boolean z6;
        final ButtonProminence buttonProminence2;
        final MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        RecomposeScopeImpl endRestartGroup;
        int i7;
        ButtonProminence buttonProminence3;
        MutableInteractionSourceImpl mutableInteractionSourceImpl3;
        boolean z7;
        ButtonValues cta;
        int i8;
        function0.getClass();
        function3.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1798396434);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer2.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                i3 |= gapComposer2.changed(buttonProminence == null ? -1 : buttonProminence.ordinal()) ? 256 : 128;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z;
                i3 |= gapComposer2.changed(z3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        z4 = z2;
                        if (gapComposer2.changed(z4)) {
                            i8 = 16384;
                            i3 |= i8;
                        }
                    } else {
                        z4 = z2;
                    }
                    i8 = PKIFailureInfo.certRevoked;
                    i3 |= i8;
                } else {
                    z4 = z2;
                }
                i6 = i3 | 196608;
                if ((1572864 & i) == 0) {
                    i6 |= gapComposer2.changedInstance(function3) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                }
                if (gapComposer2.shouldExecute(i6 & 1, (599187 & i6) != 599186)) {
                    gapComposer2.startDefaults();
                    if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                        Modifier modifier4 = i9 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                        ButtonProminence buttonProminence4 = i4 != 0 ? ButtonProminence.STANDARD : buttonProminence;
                        if (i5 != 0) {
                            z3 = false;
                        }
                        if ((i2 & 16) != 0) {
                            i6 &= -57345;
                            z4 = ((Boolean) gapComposer2.consume(LocalEnabledStateKt.LocalEnabledState)).booleanValue();
                        }
                        Object rememberedValue = gapComposer2.rememberedValue();
                        if (rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
                        }
                        Modifier modifier5 = modifier4;
                        i7 = i6;
                        buttonProminence3 = buttonProminence4;
                        modifier2 = modifier5;
                        mutableInteractionSourceImpl3 = (MutableInteractionSourceImpl) rememberedValue;
                        z7 = z4;
                    } else {
                        gapComposer2.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i6 &= -57345;
                        }
                        mutableInteractionSourceImpl3 = mutableInteractionSourceImpl;
                        i7 = i6;
                        z7 = z4;
                        buttonProminence3 = buttonProminence;
                    }
                    gapComposer2.endDefaults();
                    ButtonColors buttonColors = buttonColors(buttonProminence3, z3, gapComposer2);
                    if (buttonProminence3 == ButtonProminence.SUBTLE) {
                        gapComposer2.startReplaceGroup(1682134525);
                        ButtonValues cta2 = BundleKt.cta(gapComposer2);
                        cta = ButtonValues.m3387copy6sb1mg$default(cta2, TextStyle.m994copyp1EtxEg$default(cta2.textStyle, 0L, 0L, null, null, 0L, null, 0L, TextDecoration.Underline, null, null, 0, 0L, null, null, 0, 16773119), 23);
                    } else {
                        gapComposer2.startReplaceGroup(1682135479);
                        cta = BundleKt.cta(gapComposer2);
                    }
                    gapComposer2.end(false);
                    gapComposer = gapComposer2;
                    Modifier modifier6 = modifier2;
                    BaseButton(buttonColors, cta, function0, modifier6, z7, mutableInteractionSourceImpl3, function3, gapComposer, ((i7 << 6) & 8064) | (57344 & i7) | (458752 & i7) | (i7 & 3670016));
                    buttonProminence2 = buttonProminence3;
                    z5 = z3;
                    modifier3 = modifier6;
                    z6 = z7;
                    mutableInteractionSourceImpl2 = mutableInteractionSourceImpl3;
                } else {
                    gapComposer = gapComposer2;
                    gapComposer.skipToGroupEnd();
                    modifier3 = modifier2;
                    z5 = z3;
                    z6 = z4;
                    buttonProminence2 = buttonProminence;
                    mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new Function2() { // from class: com.squareup.cash.arcade.components.button.ButtonKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            SizeKt.ButtonCta(Function0.this, modifier3, buttonProminence2, z5, z6, mutableInteractionSourceImpl2, function3, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            z3 = z;
            if ((i & 24576) == 0) {
            }
            i6 = i3 | 196608;
            if ((1572864 & i) == 0) {
            }
            if (gapComposer2.shouldExecute(i6 & 1, (599187 & i6) != 599186)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        z3 = z;
        if ((i & 24576) == 0) {
        }
        i6 = i3 | 196608;
        if ((1572864 & i) == 0) {
        }
        if (gapComposer2.shouldExecute(i6 & 1, (599187 & i6) != 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ButtonDropdown(Function0 function0, Modifier modifier, boolean z, MutableInteractionSourceImpl mutableInteractionSourceImpl, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        boolean z2;
        int i4;
        MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        RecomposeScopeImpl endRestartGroup;
        boolean z3;
        Modifier modifier3;
        boolean z4;
        MutableInteractionSourceImpl mutableInteractionSourceImpl3;
        int i5;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-788126771);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 32 : 16;
            if ((i & MLKEMEngine.KyberPolyBytes) != 0) {
                if ((i2 & 4) == 0) {
                    z2 = z;
                    if (gapComposer.changed(z2)) {
                        i5 = 256;
                        i3 |= i5;
                    }
                } else {
                    z2 = z;
                }
                i5 = 128;
                i3 |= i5;
            } else {
                z2 = z;
            }
            i4 = i3 | 3072;
            if ((i & 24576) == 0) {
                i4 |= gapComposer.changedInstance(composableLambdaImpl) ? 16384 : PKIFailureInfo.certRevoked;
            }
            if (gapComposer.shouldExecute(i4 & 1, (i4 & 9363) == 9362)) {
                gapComposer.skipToGroupEnd();
                mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
            } else {
                gapComposer.startDefaults();
                if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                    Modifier modifier4 = i6 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    if ((i2 & 4) != 0) {
                        z3 = ((Boolean) gapComposer.consume(LocalEnabledStateKt.LocalEnabledState)).booleanValue();
                        i4 &= -897;
                    } else {
                        z3 = z2;
                    }
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                    }
                    modifier3 = modifier4;
                    z4 = z3;
                    mutableInteractionSourceImpl3 = (MutableInteractionSourceImpl) rememberedValue;
                } else {
                    gapComposer.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i4 &= -897;
                    }
                    mutableInteractionSourceImpl3 = mutableInteractionSourceImpl;
                    modifier3 = modifier2;
                    z4 = z2;
                }
                gapComposer.endDefaults();
                ButtonValues compact = BundleKt.compact(gapComposer);
                int i7 = i4 << 6;
                BaseButton(Strings.standard(gapComposer), ButtonValues.m3387copy6sb1mg$default(compact, null, 29), function0, modifier3, z4, mutableInteractionSourceImpl3, Expect_jvmKt.rememberComposableLambda(-974636821, new OverlayKt$$ExternalSyntheticLambda0(compact, composableLambdaImpl), gapComposer), gapComposer, (i7 & 896) | 1572864 | (i7 & 7168) | (57344 & i7) | (i7 & 458752));
                modifier2 = modifier3;
                z2 = z4;
                mutableInteractionSourceImpl2 = mutableInteractionSourceImpl3;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0(function0, modifier2, z2, mutableInteractionSourceImpl2, composableLambdaImpl, i, i2);
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & MLKEMEngine.KyberPolyBytes) != 0) {
        }
        i4 = i3 | 3072;
        if ((i & 24576) == 0) {
        }
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 9363) == 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static DensityImpl Density$default() {
        return new DensityImpl(1.0f, 1.0f);
    }

    public static GrpcMethod OneTimeWorkRequestBuilder(Class cls, Pair... pairArr) {
        GrpcMethod grpcMethod = new GrpcMethod(SandboxedCoroutineWorker.class);
        Headers.Builder builder = new Headers.Builder(2);
        builder.add(new Pair("SANDBOXED_WORK_FQCN", cls.getName()));
        builder.addSpread(pairArr);
        ArrayList arrayList = builder.namesAndValues;
        Pair[] pairArr2 = (Pair[]) arrayList.toArray(new Pair[arrayList.size()]);
        Data.Builder builder2 = new Data.Builder();
        for (Pair pair : pairArr2) {
            builder2.put((String) pair.first, pair.second);
        }
        ((WorkSpec) grpcMethod.requestAdapter).input = builder2.build();
        return grpcMethod;
    }

    public static final void PrimaryModalButton(Function0 function0, Modifier modifier, boolean z, MutableInteractionSourceImpl mutableInteractionSourceImpl, Function3 function3, Composer composer, int i) {
        int i2;
        MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        MutableInteractionSourceImpl mutableInteractionSourceImpl3;
        function0.getClass();
        function3.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(59382547);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= gapComposer.changedInstance(function3) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                }
                mutableInteractionSourceImpl3 = (MutableInteractionSourceImpl) rememberedValue;
            } else {
                gapComposer.skipToGroupEnd();
                mutableInteractionSourceImpl3 = mutableInteractionSourceImpl;
            }
            gapComposer.endDefaults();
            long j = Strings.getColors(gapComposer).component.modal.button.primary.text.f198default;
            long j2 = Strings.getColors(gapComposer).component.modal.button.primary.text.disabled;
            long j3 = Color.Transparent;
            BaseButton(new ButtonColors(j, j2, j3, j3, Strings.getColors(gapComposer).semantic.icon.standard, Strings.getColors(gapComposer).semantic.icon.disabled, Strings.getColors(gapComposer).semantic.icon.prominent, (RippleConfiguration) gapComposer.consume(RippleKt.LocalRippleConfiguration)), BundleKt.modal(gapComposer), function0, modifier, z, mutableInteractionSourceImpl3, function3, gapComposer, (i3 << 6) & 4194176);
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl3;
        } else {
            gapComposer.skipToGroupEnd();
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ButtonKt$$ExternalSyntheticLambda3(function0, modifier, z, mutableInteractionSourceImpl2, function3, i, 1);
        }
    }

    public static final void PrimaryModalButtonDestructive(Function0 function0, Modifier modifier, boolean z, MutableInteractionSourceImpl mutableInteractionSourceImpl, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        MutableInteractionSourceImpl mutableInteractionSourceImpl3;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1101689049);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= gapComposer.changedInstance(composableLambdaImpl) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                }
                mutableInteractionSourceImpl3 = (MutableInteractionSourceImpl) rememberedValue;
            } else {
                gapComposer.skipToGroupEnd();
                mutableInteractionSourceImpl3 = mutableInteractionSourceImpl;
            }
            gapComposer.endDefaults();
            long j = Strings.getColors(gapComposer).component.button.destructive.standard.text.f156default;
            long j2 = Strings.getColors(gapComposer).component.button.destructive.standard.text.disabled;
            long j3 = Color.Transparent;
            BaseButton(new ButtonColors(j, j2, j3, j3, Strings.getColors(gapComposer).semantic.icon.standard, Strings.getColors(gapComposer).semantic.icon.disabled, Strings.getColors(gapComposer).semantic.icon.prominent, (RippleConfiguration) gapComposer.consume(RippleKt.LocalRippleConfiguration)), BundleKt.modal(gapComposer), function0, modifier, z, mutableInteractionSourceImpl3, composableLambdaImpl, gapComposer, (i3 << 6) & 4194176);
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl3;
        } else {
            gapComposer.skipToGroupEnd();
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda17(function0, modifier, z, mutableInteractionSourceImpl2, composableLambdaImpl, i);
        }
    }

    public static final void SecondaryModalButton(Function0 function0, Modifier modifier, boolean z, MutableInteractionSourceImpl mutableInteractionSourceImpl, Function3 function3, Composer composer, int i) {
        int i2;
        MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        MutableInteractionSourceImpl mutableInteractionSourceImpl3;
        function0.getClass();
        function3.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(938647685);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= gapComposer.changedInstance(function3) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                }
                mutableInteractionSourceImpl3 = (MutableInteractionSourceImpl) rememberedValue;
            } else {
                gapComposer.skipToGroupEnd();
                mutableInteractionSourceImpl3 = mutableInteractionSourceImpl;
            }
            gapComposer.endDefaults();
            long j = Strings.getColors(gapComposer).component.modal.button.secondary.text.f199default;
            long j2 = Strings.getColors(gapComposer).component.modal.button.secondary.text.disabled;
            long j3 = Color.Transparent;
            BaseButton(new ButtonColors(j, j2, j3, j3, Strings.getColors(gapComposer).semantic.icon.standard, Strings.getColors(gapComposer).semantic.icon.disabled, Strings.getColors(gapComposer).semantic.icon.prominent, (RippleConfiguration) gapComposer.consume(RippleKt.LocalRippleConfiguration)), BundleKt.modal(gapComposer), function0, modifier, z, mutableInteractionSourceImpl3, function3, gapComposer, (i3 << 6) & 4194176);
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl3;
        } else {
            gapComposer.skipToGroupEnd();
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ButtonKt$$ExternalSyntheticLambda3(function0, modifier, z, mutableInteractionSourceImpl2, function3, i, 0);
        }
    }

    public static final Size Size(int i, int i2) {
        DimensionKt.Dimension(i);
        Dimension.Pixels pixels = new Dimension.Pixels(i);
        DimensionKt.Dimension(i2);
        return new Size(pixels, new Dimension.Pixels(i2));
    }

    public static final long TextRange(int i, int i2) {
        if (i < 0 || i2 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        long j = (i2 & BodyPartID.bodyIdMax) | (i << 32);
        int i3 = TextRange.$r8$clinit;
        return j;
    }

    public static final void ToastButton(Function0 function0, boolean z, MutableInteractionSourceImpl mutableInteractionSourceImpl, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        boolean z2;
        MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        int i3;
        boolean z3;
        MutableInteractionSourceImpl mutableInteractionSourceImpl3;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(440976979);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i & 48;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (i4 == 0) {
            i2 |= gapComposer.changed(companion) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= 128;
        }
        int i5 = i2 | 3072;
        if ((i & 24576) == 0) {
            i5 |= gapComposer.changedInstance(composableLambdaImpl) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 9363) != 9362)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                boolean booleanValue = ((Boolean) gapComposer.consume(LocalEnabledStateKt.LocalEnabledState)).booleanValue();
                i3 = i5 & (-897);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                }
                z3 = booleanValue;
                mutableInteractionSourceImpl3 = (MutableInteractionSourceImpl) rememberedValue;
            } else {
                gapComposer.skipToGroupEnd();
                i3 = i5 & (-897);
                z3 = z;
                mutableInteractionSourceImpl3 = mutableInteractionSourceImpl;
            }
            gapComposer.endDefaults();
            BaseButton(new ButtonColors(Strings.getColors(gapComposer).semantic.text.inverse, Strings.getColors(gapComposer).semantic.text.inverse, Strings.getColors(gapComposer).component.toast.button.background.f221default, Strings.getColors(gapComposer).component.toast.button.background.f221default, Strings.getColors(gapComposer).semantic.icon.inverse, Strings.getColors(gapComposer).semantic.icon.inverse, UtilsKt.getProminentInverse(Strings.getColors(gapComposer).semantic.icon, gapComposer), access$getProminentRippleConfig(gapComposer)), new ButtonValues(BundleKt.m1091DpSizeYgX7TsA(52.0f, 64.0f), 8.0f, new PaddingValuesImpl(8.0f, 8.0f, 8.0f, 8.0f), TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).button, 0L, 0L, null, null, 0L, null, 0L, null, null, null, 3, 0L, null, null, 0, 16744447), new ButtonValues.ClipType.RoundedCorners()), function0, companion, z3, mutableInteractionSourceImpl3, composableLambdaImpl, gapComposer, (i3 << 6) & 4194176);
            z2 = z3;
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl3;
        } else {
            gapComposer.skipToGroupEnd();
            z2 = z;
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda34(function0, z2, mutableInteractionSourceImpl2, composableLambdaImpl, i);
        }
    }

    public static final RippleConfiguration access$getProminentRippleConfig(Composer composer) {
        return new RippleConfiguration(Strings.getColors(composer).component.button.prominent.background.ripple, (Strings.getColors(composer).isLight ? ColorUtilsKt.lightAlphas : ColorUtilsKt.darkAlphas).component.buttonProminent);
    }

    public static final void access$handlePeddleResponse(ApiResult apiResult) {
        if (apiResult instanceof ApiResult.Success) {
            Timber.Forest.d("Successfully updated Advertise ID", new Object[0]);
        } else if (apiResult instanceof ApiResult.Failure) {
            Timber.Forest.w("Failed to update Advertise ID", new Object[0]);
        } else {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    public static final Object[] access$insertEntryAtIndex(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        ArraysKt___ArraysJvmKt.copyInto$default(0, i, 6, objArr, objArr2);
        ArraysKt___ArraysJvmKt.copyInto(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Country access$parseCountry(String str) {
        if (str.length() != 2) {
            return null;
        }
        try {
            Locale locale = Locale.US;
            locale.getClass();
            String upperCase = str.toUpperCase(locale);
            upperCase.getClass();
            return Country.valueOf(upperCase);
        } catch (IllegalArgumentException e) {
            Timber.Forest.d("Couldn't parse device country ISO code: ".concat(str), new Object[0], e);
            return null;
        }
    }

    public static final Object[] access$removeEntryAtIndex(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        ArraysKt___ArraysJvmKt.copyInto$default(0, i, 6, objArr, objArr2);
        ArraysKt___ArraysJvmKt.copyInto(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] access$removeNodeAtIndex(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        ArraysKt___ArraysJvmKt.copyInto$default(0, i, 6, objArr, objArr2);
        ArraysKt___ArraysJvmKt.copyInto(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Map addFeaturesFromError(Map map, FeatureError featureError, ReportedError.ErrorReportingTarget errorReportingTarget) {
        Pair pair;
        Pair pair2;
        Map map2;
        List list;
        MetadataSection$AdditionalInfoSection metadataSection$AdditionalInfoSection = MetadataSection$AdditionalInfoSection.INSTANCE;
        map.getClass();
        featureError.getClass();
        if (featureError.getFeatures().isEmpty()) {
            return map;
        }
        int ordinal = errorReportingTarget.ordinal();
        if (ordinal == 0) {
            pair = new Pair((String) metadataSection$AdditionalInfoSection.valueName, MetadataSection$AdditionalInfoSection.FeatureKey.INSTANCE.bugsnagName);
        } else {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                MetadataSection$AdditionalInfoSection.FeatureKey featureKey = MetadataSection$AdditionalInfoSection.FeatureKey.INSTANCE;
                pair2 = new Pair("Additional Info", "Features");
                String str = (String) pair2.first;
                String str2 = (String) pair2.second;
                map2 = (Map) map.get(str);
                if (map2 == null) {
                    map2 = EmptyMap.INSTANCE;
                    map2.getClass();
                }
                Object obj = map2.get(str2);
                list = obj instanceof List ? (List) obj : null;
                if (list == null) {
                    list = EmptyList.INSTANCE;
                }
                return MapsKt__MapsKt.plus(map, new Pair(str, MapsKt__MapsKt.plus(map2, MapsKt__MapsJVMKt.mapOf(new Pair(str2, CollectionsKt.plus((Iterable) ScaleKt.getFeatureNames(featureError), (Collection) list))))));
            }
            pair = new Pair((String) metadataSection$AdditionalInfoSection.valueType, MetadataSection$AdditionalInfoSection.FeatureKey.INSTANCE.datadogName);
        }
        pair2 = pair;
        String str3 = (String) pair2.first;
        String str22 = (String) pair2.second;
        map2 = (Map) map.get(str3);
        if (map2 == null) {
        }
        Object obj2 = map2.get(str22);
        if (obj2 instanceof List) {
        }
        if (list == null) {
        }
        return MapsKt__MapsKt.plus(map, new Pair(str3, MapsKt__MapsKt.plus(map2, MapsKt__MapsJVMKt.mapOf(new Pair(str22, CollectionsKt.plus((Iterable) ScaleKt.getFeatureNames(featureError), (Collection) list))))));
    }

    public static void addInternalUsageAttributionId(Context context, String str) {
        try {
            zzaj zzajVar = new zzaj(context, str);
            if (zzcc.zzc != null) {
                zzcc.zzc.zzk(new ObjectWrapper(context), str);
            } else {
                zzcc.zzd.add(zzajVar);
            }
        } catch (RemoteException e) {
            Log.e("MapsApiSettings", "Failed to add internal usage attribution id.", e);
        }
    }

    public static final ButtonColors buttonColors(ButtonProminence buttonProminence, boolean z, Composer composer) {
        int ordinal = buttonProminence.ordinal();
        if (ordinal == 0) {
            GapComposer gapComposer = (GapComposer) composer;
            if (z) {
                gapComposer.startReplaceGroup(144266367);
                ButtonColors buttonColors = new ButtonColors(Strings.getColors(gapComposer).component.button.destructive.standard.text.f156default, Strings.getColors(gapComposer).component.button.destructive.standard.text.disabled, Strings.getColors(gapComposer).component.button.destructive.standard.background.f154default, Strings.getColors(gapComposer).component.button.destructive.standard.background.disabled, Strings.getColors(gapComposer).component.button.destructive.standard.icon.f155default, Strings.getColors(gapComposer).component.button.destructive.standard.icon.disabled, Strings.getColors(gapComposer).semantic.icon.prominent, (RippleConfiguration) gapComposer.consume(RippleKt.LocalRippleConfiguration));
                gapComposer.end(false);
                return buttonColors;
            }
            gapComposer.startReplaceGroup(144267636);
            ButtonColors standard = Strings.standard(gapComposer);
            gapComposer.end(false);
            return standard;
        }
        if (ordinal == 1) {
            GapComposer gapComposer2 = (GapComposer) composer;
            if (z) {
                gapComposer2.startReplaceGroup(144269504);
                ButtonColors buttonColors2 = new ButtonColors(Strings.getColors(gapComposer2).component.button.destructive.prominent.text.f153default, Strings.getColors(gapComposer2).component.button.destructive.prominent.text.disabled, Strings.getColors(gapComposer2).component.button.destructive.prominent.background.f151default, Strings.getColors(gapComposer2).component.button.destructive.prominent.background.disabled, Strings.getColors(gapComposer2).component.button.destructive.prominent.icon.f152default, Strings.getColors(gapComposer2).component.button.destructive.prominent.icon.disabled, UtilsKt.getProminentInverse(Strings.getColors(gapComposer2).semantic.icon, gapComposer2), access$getProminentRippleConfig(gapComposer2));
                gapComposer2.end(false);
                return buttonColors2;
            }
            gapComposer2.startReplaceGroup(144270805);
            ButtonColors buttonColors3 = new ButtonColors(Strings.getColors(gapComposer2).component.button.prominent.text.f162default, Strings.getColors(gapComposer2).component.button.prominent.text.disabled, Strings.getColors(gapComposer2).component.button.prominent.background.f160default, Strings.getColors(gapComposer2).component.button.prominent.background.disabled, Strings.getColors(gapComposer2).component.button.prominent.icon.f161default, Strings.getColors(gapComposer2).component.button.prominent.icon.disabled, UtilsKt.getProminentInverse(Strings.getColors(gapComposer2).semantic.icon, gapComposer2), access$getProminentRippleConfig(gapComposer2));
            gapComposer2.end(false);
            return buttonColors3;
        }
        if (ordinal != 2) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        GapComposer gapComposer3 = (GapComposer) composer;
        if (z) {
            gapComposer3.startReplaceGroup(144272605);
            long j = Strings.getColors(gapComposer3).component.button.destructive.subtle.text.f159default;
            long j2 = Strings.getColors(gapComposer3).component.button.destructive.subtle.text.disabled;
            long j3 = Color.Transparent;
            ButtonColors buttonColors4 = new ButtonColors(j, j2, j3, j3, Strings.getColors(gapComposer3).component.button.destructive.subtle.icon.f158default, Strings.getColors(gapComposer3).component.button.destructive.subtle.icon.disabled, Strings.getColors(gapComposer3).semantic.icon.prominent, (RippleConfiguration) gapComposer3.consume(RippleKt.LocalRippleConfiguration));
            gapComposer3.end(false);
            return buttonColors4;
        }
        gapComposer3.startReplaceGroup(144273810);
        long j4 = Strings.getColors(gapComposer3).component.button.subtle.text.f168default;
        long j5 = Strings.getColors(gapComposer3).component.button.subtle.text.disabled;
        long j6 = Color.Transparent;
        ButtonColors buttonColors5 = new ButtonColors(j4, j5, j6, j6, Strings.getColors(gapComposer3).component.button.subtle.icon.f167default, Strings.getColors(gapComposer3).component.button.subtle.icon.disabled, Strings.getColors(gapComposer3).semantic.icon.prominent, (RippleConfiguration) gapComposer3.consume(RippleKt.LocalRippleConfiguration));
        gapComposer3.end(false);
        return buttonColors5;
    }

    /* renamed from: coerceIn-8ffj60Q, reason: not valid java name */
    public static final long m1469coerceIn8ffj60Q(int i, long j) {
        int i2 = TextRange.$r8$clinit;
        int i3 = (int) (j >> 32);
        int i4 = i3 < 0 ? 0 : i3;
        if (i4 > i) {
            i4 = i;
        }
        int i5 = (int) (BodyPartID.bodyIdMax & j);
        int i6 = i5 >= 0 ? i5 : 0;
        if (i6 <= i) {
            i = i6;
        }
        return (i4 == i3 && i == i5) ? j : TextRange(i4, i);
    }

    public static final int columnIndexOf(SQLiteStatement sQLiteStatement, String str) {
        sQLiteStatement.getClass();
        int columnCount = sQLiteStatement.getColumnCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount) {
                i2 = -1;
                break;
            }
            if (str.equals(sQLiteStatement.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m('`', "`", str);
        int columnCount2 = sQLiteStatement.getColumnCount();
        while (true) {
            if (i >= columnCount2) {
                i = -1;
                break;
            }
            if (m.equals(sQLiteStatement.getColumnName(i))) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return i;
        }
        return -1;
    }

    public static CardSchemePresenter.MetroFactory create(RealKnotLauncher.MetroFactory metroFactory, DoubleCheck doubleCheck, InstanceFactory instanceFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck3, LambdaProvider lambdaProvider3, LocalViewFactory.MetroFactory metroFactory2, RealBrazeManager.MetroFactory metroFactory3, RealBrazeManager.MetroFactory metroFactory4, LambdaProvider lambdaProvider4, TreehouseFlows.MetroFactory metroFactory5, DoubleCheck doubleCheck4, DoubleCheck doubleCheck5, DoubleCheck doubleCheck6, LambdaProvider lambdaProvider5, DoubleCheck doubleCheck7, DoubleCheck doubleCheck8, DoubleCheck doubleCheck9, DoubleCheck doubleCheck10, DoubleCheck doubleCheck11, DoubleCheck doubleCheck12, DoubleCheck doubleCheck13, DoubleCheck doubleCheck14, DoubleCheck doubleCheck15, Provider provider, DoubleCheck doubleCheck16, MoneyUiFactory.MetroFactory metroFactory6, DoubleCheck doubleCheck17, RealDrawerOpener$MetroFactory realDrawerOpener$MetroFactory, RealDrawerOpener$MetroFactory realDrawerOpener$MetroFactory2, LambdaProvider lambdaProvider6, DoubleCheck doubleCheck18, FillrInitializer.MetroFactory metroFactory7, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4) {
        metroFactory.getClass();
        doubleCheck.getClass();
        lambdaProvider.getClass();
        doubleCheck2.getClass();
        lambdaProvider2.getClass();
        doubleCheck3.getClass();
        lambdaProvider3.getClass();
        metroFactory2.getClass();
        lambdaProvider4.getClass();
        metroFactory5.getClass();
        doubleCheck4.getClass();
        doubleCheck5.getClass();
        doubleCheck6.getClass();
        lambdaProvider5.getClass();
        doubleCheck7.getClass();
        doubleCheck8.getClass();
        doubleCheck9.getClass();
        doubleCheck10.getClass();
        doubleCheck11.getClass();
        doubleCheck12.getClass();
        doubleCheck13.getClass();
        doubleCheck14.getClass();
        doubleCheck15.getClass();
        provider.getClass();
        doubleCheck16.getClass();
        metroFactory6.getClass();
        doubleCheck17.getClass();
        realDrawerOpener$MetroFactory.getClass();
        realDrawerOpener$MetroFactory2.getClass();
        lambdaProvider6.getClass();
        doubleCheck18.getClass();
        metroFactory7.getClass();
        instanceFactory2.getClass();
        instanceFactory4.getClass();
        return new CardSchemePresenter.MetroFactory(metroFactory, doubleCheck, instanceFactory, lambdaProvider, doubleCheck2, lambdaProvider2, doubleCheck3, lambdaProvider3, metroFactory2, metroFactory3, metroFactory4, lambdaProvider4, metroFactory5, doubleCheck4, doubleCheck5, doubleCheck6, lambdaProvider5, doubleCheck7, doubleCheck8, doubleCheck9, doubleCheck10, doubleCheck11, doubleCheck12, doubleCheck13, doubleCheck14, doubleCheck15, provider, doubleCheck16, metroFactory6, doubleCheck17, realDrawerOpener$MetroFactory, realDrawerOpener$MetroFactory2, lambdaProvider6, doubleCheck18, metroFactory7, instanceFactory2, instanceFactory3, instanceFactory4);
    }

    public static byte[] decodeUrlSafeNoPadding(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    public static void detect(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (CycleDetector$ComponentNode cycleDetector$ComponentNode : (Set) it2.next()) {
                        for (Dependency dependency : cycleDetector$ComponentNode.component.dependencies) {
                            if (dependency.injection == 0) {
                                final Qualified qualified = dependency.anInterface;
                                final boolean z = dependency.f1005type == 2;
                                Set<CycleDetector$ComponentNode> set = (Set) hashMap.get(new Object(qualified, z) { // from class: com.google.firebase.components.CycleDetector$Dep
                                    public final Qualified anInterface;
                                    public final boolean set;

                                    {
                                        this.anInterface = qualified;
                                        this.set = z;
                                    }

                                    public final boolean equals(Object obj) {
                                        if (obj instanceof CycleDetector$Dep) {
                                            CycleDetector$Dep cycleDetector$Dep = (CycleDetector$Dep) obj;
                                            if (cycleDetector$Dep.anInterface.equals(this.anInterface) && cycleDetector$Dep.set == this.set) {
                                                return true;
                                            }
                                        }
                                        return false;
                                    }

                                    public final int hashCode() {
                                        return Boolean.valueOf(this.set).hashCode() ^ ((this.anInterface.hashCode() ^ 1000003) * 1000003);
                                    }
                                });
                                if (set != null) {
                                    for (CycleDetector$ComponentNode cycleDetector$ComponentNode2 : set) {
                                        cycleDetector$ComponentNode.dependencies.add(cycleDetector$ComponentNode2);
                                        cycleDetector$ComponentNode2.dependents.add(cycleDetector$ComponentNode);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    CycleDetector$ComponentNode cycleDetector$ComponentNode3 = (CycleDetector$ComponentNode) it4.next();
                    if (cycleDetector$ComponentNode3.dependents.isEmpty()) {
                        hashSet2.add(cycleDetector$ComponentNode3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    CycleDetector$ComponentNode cycleDetector$ComponentNode4 = (CycleDetector$ComponentNode) hashSet2.iterator().next();
                    hashSet2.remove(cycleDetector$ComponentNode4);
                    i++;
                    Iterator it5 = cycleDetector$ComponentNode4.dependencies.iterator();
                    while (it5.hasNext()) {
                        CycleDetector$ComponentNode cycleDetector$ComponentNode5 = (CycleDetector$ComponentNode) it5.next();
                        cycleDetector$ComponentNode5.dependents.remove(cycleDetector$ComponentNode4);
                        if (cycleDetector$ComponentNode5.dependents.isEmpty()) {
                            hashSet2.add(cycleDetector$ComponentNode5);
                        }
                    }
                }
                if (i == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    CycleDetector$ComponentNode cycleDetector$ComponentNode6 = (CycleDetector$ComponentNode) it6.next();
                    if (!cycleDetector$ComponentNode6.dependents.isEmpty() && !cycleDetector$ComponentNode6.dependencies.isEmpty()) {
                        arrayList2.add(cycleDetector$ComponentNode6.component);
                    }
                }
                throw new DependencyCycleException(arrayList2);
            }
            Component component = (Component) it.next();
            CycleDetector$ComponentNode cycleDetector$ComponentNode7 = new CycleDetector$ComponentNode(component);
            for (final Qualified qualified2 : component.providedInterfaces) {
                boolean z2 = component.f1003type == 0;
                final boolean z3 = !z2;
                Object obj = new Object(qualified2, z3) { // from class: com.google.firebase.components.CycleDetector$Dep
                    public final Qualified anInterface;
                    public final boolean set;

                    {
                        this.anInterface = qualified2;
                        this.set = z3;
                    }

                    public final boolean equals(Object obj2) {
                        if (obj2 instanceof CycleDetector$Dep) {
                            CycleDetector$Dep cycleDetector$Dep = (CycleDetector$Dep) obj2;
                            if (cycleDetector$Dep.anInterface.equals(this.anInterface) && cycleDetector$Dep.set == this.set) {
                                return true;
                            }
                        }
                        return false;
                    }

                    public final int hashCode() {
                        return Boolean.valueOf(this.set).hashCode() ^ ((this.anInterface.hashCode() ^ 1000003) * 1000003);
                    }
                };
                if (!hashMap.containsKey(obj)) {
                    hashMap.put(obj, new HashSet());
                }
                Set set2 = (Set) hashMap.get(obj);
                if (!set2.isEmpty() && z2) {
                    OptionalProvider$$ExternalSyntheticLambda0.m$2("Multiple components provide ", qualified2, ".");
                    return;
                }
                set2.add(cycleDetector$ComponentNode7);
            }
        }
    }

    public static final void drawLayer(DrawScope drawScope, GraphicsLayer graphicsLayer) {
        Canvas canvas;
        Object obj;
        boolean z;
        Canvas canvas2;
        boolean z2;
        float f;
        float f2;
        androidx.compose.ui.graphics.Canvas canvas3 = drawScope.getDrawContext().getCanvas();
        GraphicsLayer graphicsLayer2 = (GraphicsLayer) drawScope.getDrawContext().requestAdapter;
        GraphicsLayerV29 graphicsLayerV29 = graphicsLayer.impl;
        GraphicsLayerV29 graphicsLayerV292 = graphicsLayer.impl;
        RenderNode renderNode = graphicsLayerV29.renderNode;
        if (graphicsLayer.isReleased) {
            return;
        }
        graphicsLayer.configureOutlineAndClip();
        if (!renderNode.hasDisplayList()) {
            try {
                graphicsLayer.recordInternal();
            } catch (Throwable unused) {
            }
        }
        boolean z3 = graphicsLayerV292.shadowElevation > RecyclerView.DECELERATION_RATE;
        if (z3) {
            canvas3.enableZ();
        }
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas3);
        boolean isHardwareAccelerated = nativeCanvas.isHardwareAccelerated();
        if (isHardwareAccelerated) {
            canvas = nativeCanvas;
            obj = null;
        } else {
            long j = graphicsLayer.topLeft;
            float f3 = (int) (j >> 32);
            float f4 = (int) (j & BodyPartID.bodyIdMax);
            long j2 = graphicsLayer.size;
            float f5 = ((int) (j2 >> 32)) + f3;
            float f6 = f4 + ((int) (j2 & BodyPartID.bodyIdMax));
            float f7 = graphicsLayerV292.alpha;
            int i = graphicsLayerV29.blendMode;
            if (f7 < 1.0f || i != 3 || graphicsLayerV29.compositingStrategy == 1) {
                AndroidPaint androidPaint = graphicsLayer.softwareLayerPaint;
                if (androidPaint == null) {
                    androidPaint = ColorKt.Paint();
                    graphicsLayer.softwareLayerPaint = androidPaint;
                }
                androidPaint.setAlpha(f7);
                androidPaint.m658setBlendModes9anfk8(i);
                obj = null;
                androidPaint.setColorFilter(null);
                Paint nativePaint = ColorKt.getNativePaint(androidPaint);
                f = f3;
                f2 = f4;
                nativeCanvas.saveLayer(f, f2, f5, f6, nativePaint);
                canvas = nativeCanvas;
            } else {
                nativeCanvas.save();
                f = f3;
                canvas = nativeCanvas;
                f2 = f4;
                obj = null;
            }
            canvas.translate(f, f2);
            Matrix matrix = graphicsLayerV29.matrix;
            if (matrix == null) {
                matrix = new Matrix();
                graphicsLayerV29.matrix = matrix;
            }
            renderNode.getMatrix(matrix);
            canvas.concat(matrix);
        }
        boolean z4 = !isHardwareAccelerated && graphicsLayer.clip;
        if (z4) {
            canvas3.save();
            ColorKt outline = graphicsLayer.getOutline();
            if (outline instanceof Outline$Rectangle) {
                androidx.compose.ui.graphics.Canvas.m672clipRectmtrdDE$default(canvas3, ((Outline$Rectangle) outline).rect);
            } else if (outline instanceof Outline$Rounded) {
                AndroidPath androidPath = graphicsLayer.roundRectClipPath;
                if (androidPath != null) {
                    androidPath.rewind();
                } else {
                    androidPath = AndroidPath_androidKt.Path();
                    graphicsLayer.roundRectClipPath = androidPath;
                }
                AndroidPath.addRoundRect$default(androidPath, ((Outline$Rounded) outline).roundRect);
                canvas3.mo647clipPathmtrdDE(androidPath, 1);
            } else {
                if (!(outline instanceof Outline$Generic)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                canvas3.mo647clipPathmtrdDE(((Outline$Generic) outline).path, 1);
            }
        }
        if (graphicsLayer2 != null) {
            AndroidSystemCallbacks androidSystemCallbacks = graphicsLayer2.childDependenciesTracker;
            if (!androidSystemCallbacks.shutdown) {
                androidx.compose.ui.graphics.InlineClassHelperKt.throwIllegalArgumentException("Only add dependencies during a tracking");
            }
            MutableScatterSet mutableScatterSet = (MutableScatterSet) androidSystemCallbacks.componentCallbacks;
            if (mutableScatterSet != null) {
                mutableScatterSet.add(graphicsLayer);
            } else if (((GraphicsLayer) androidSystemCallbacks.imageLoader) != null) {
                MutableScatterSet mutableScatterSet2 = ScatterSetKt.EmptyScatterSet;
                MutableScatterSet mutableScatterSet3 = new MutableScatterSet();
                GraphicsLayer graphicsLayer3 = (GraphicsLayer) androidSystemCallbacks.imageLoader;
                graphicsLayer3.getClass();
                mutableScatterSet3.add(graphicsLayer3);
                mutableScatterSet3.add(graphicsLayer);
                androidSystemCallbacks.componentCallbacks = mutableScatterSet3;
                androidSystemCallbacks.imageLoader = obj;
            } else {
                androidSystemCallbacks.imageLoader = graphicsLayer;
            }
            MutableScatterSet mutableScatterSet4 = (MutableScatterSet) androidSystemCallbacks.application;
            if (mutableScatterSet4 != null) {
                z2 = !mutableScatterSet4.remove(graphicsLayer);
            } else if (((GraphicsLayer) androidSystemCallbacks.activityCallbacks) != graphicsLayer) {
                z2 = true;
            } else {
                androidSystemCallbacks.activityCallbacks = obj;
                z2 = false;
            }
            if (z2) {
                graphicsLayer.parentLayerUsages++;
            }
        }
        AndroidCanvas androidCanvas = (AndroidCanvas) canvas3;
        if (androidCanvas.internalCanvas.isHardwareAccelerated()) {
            z = z4;
            canvas2 = canvas;
            androidCanvas.internalCanvas.drawRenderNode(renderNode);
        } else {
            CanvasDrawScope canvasDrawScope = graphicsLayer.softwareDrawScope;
            if (canvasDrawScope == null) {
                canvasDrawScope = new CanvasDrawScope();
                graphicsLayer.softwareDrawScope = canvasDrawScope;
            }
            GrpcMethod grpcMethod = canvasDrawScope.drawContext;
            Density density = graphicsLayer.density;
            LayoutDirection layoutDirection = graphicsLayer.layoutDirection;
            long m3991toSizeozmzZPI = Countries.m3991toSizeozmzZPI(graphicsLayer.size);
            Density density2 = grpcMethod.getDensity();
            LayoutDirection layoutDirection2 = grpcMethod.getLayoutDirection();
            androidx.compose.ui.graphics.Canvas canvas4 = grpcMethod.getCanvas();
            canvas2 = canvas;
            long m3999getSizeNHjbRc = grpcMethod.m3999getSizeNHjbRc();
            z = z4;
            GraphicsLayer graphicsLayer4 = (GraphicsLayer) grpcMethod.requestAdapter;
            grpcMethod.setDensity(density);
            grpcMethod.setLayoutDirection(layoutDirection);
            grpcMethod.setCanvas(canvas3);
            grpcMethod.m4000setSizeuvyYCjk(m3991toSizeozmzZPI);
            grpcMethod.requestAdapter = graphicsLayer;
            canvas3.save();
            try {
                graphicsLayer.drawWithChildTracking(canvasDrawScope);
            } finally {
                canvas3.restore();
                grpcMethod.setDensity(density2);
                grpcMethod.setLayoutDirection(layoutDirection2);
                grpcMethod.setCanvas(canvas4);
                grpcMethod.m4000setSizeuvyYCjk(m3999getSizeNHjbRc);
                grpcMethod.requestAdapter = graphicsLayer4;
            }
        }
        if (z) {
            canvas3.restore();
        }
        if (z3) {
            canvas3.disableZ();
        }
        if (isHardwareAccelerated) {
            return;
        }
        canvas2.restore();
    }

    public static String encodeUrlSafeNoPadding(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: finalConstraints-tfFHcEY, reason: not valid java name */
    public static final long m1470finalConstraintstfFHcEY(float f, int i, long j, boolean z) {
        int m1025getMaxWidthimpl = ((z || i == 2 || i == 4 || i == 5) && Constraints.m1021getHasBoundedWidthimpl(j)) ? Constraints.m1025getMaxWidthimpl(j) : Integer.MAX_VALUE;
        if (Constraints.m1027getMinWidthimpl(j) != m1025getMaxWidthimpl) {
            m1025getMaxWidthimpl = RangesKt___RangesKt.coerceIn(BasicTextKt.ceilToIntPx(f), Constraints.m1027getMinWidthimpl(j), m1025getMaxWidthimpl);
        }
        return DimensionKt.m1465fitPrioritizingWidthZbe2FdA(0, m1025getMaxWidthimpl, 0, Constraints.m1024getMaxHeightimpl(j));
    }

    public static final AdaptiveStackParentData getAdaptiveStackParentData(IntrinsicMeasurable intrinsicMeasurable) {
        intrinsicMeasurable.getClass();
        Object parentData = intrinsicMeasurable.getParentData();
        if (parentData instanceof AdaptiveStackParentData) {
            return (AdaptiveStackParentData) parentData;
        }
        return null;
    }

    public static final String getCanonicalName(KClass kClass) {
        if (kClass != null) {
            return kClass.getQualifiedName();
        }
        return null;
    }

    public static final int getColumnIndexOrThrow(SQLiteStatement sQLiteStatement, String str) {
        sQLiteStatement.getClass();
        int columnIndexOf = columnIndexOf(sQLiteStatement, str);
        if (columnIndexOf >= 0) {
            return columnIndexOf;
        }
        int columnCount = sQLiteStatement.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(sQLiteStatement.getColumnName(i));
        }
        Drop$$ExternalSyntheticBUOutline0.m(93, str, "' does not exist. Available columns: [", CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, null, 63), "Column '");
        return 0;
    }

    public static Object getParcelable(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return BundleCompat$Api33Impl.getParcelable(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final int indexSegment(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final boolean isHomeOrProfile(Screen screen) {
        return (screen instanceof LocalTabScreen) || (screen instanceof LocalBrandProfileScreen);
    }

    public static boolean isNotTrailingByte(byte b) {
        return b > -65;
    }

    public static void setInitialSurroundingText(EditorInfo editorInfo, CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            WindowCompat$Api30Impl.setInitialSurroundingSubText(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i >= 30) {
            WindowCompat$Api30Impl.setInitialSurroundingSubText(editorInfo, charSequence);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = charSequence.length();
        if (i4 < 0 || i2 > length) {
            setSurroundingText(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            setSurroundingText(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            setSurroundingText(editorInfo, charSequence, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int min = Math.min(charSequence.length() - i2, i8 - Math.min(i4, (int) (i8 * 0.8d)));
        int min2 = Math.min(i4, i8 - min);
        int i9 = i4 - min2;
        if (Character.isLowSurrogate(charSequence.charAt(i9))) {
            i9++;
            min2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i2 + min) - 1))) {
            min--;
        }
        int i10 = min2 + i7;
        setSurroundingText(editorInfo, i7 != i6 ? TextUtils.concat(charSequence.subSequence(i9, i9 + min2), charSequence.subSequence(i2, min + i2)) : charSequence.subSequence(i9, i10 + min + i9), min2, i10);
    }

    public static void setStylusHandwritingEnabled(EditorInfo editorInfo, boolean z) {
        if (Build.VERSION.SDK_INT >= 35) {
            Api35Compat.setStylusHandwritingEnabled(editorInfo, z);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z);
    }

    public static void setSurroundingText(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    /* renamed from: substring-FDrldGo, reason: not valid java name */
    public static final String m1471substringFDrldGo(long j, CharSequence charSequence) {
        return charSequence.subSequence(TextRange.m990getMinimpl(j), TextRange.m989getMaximpl(j)).toString();
    }

    public abstract Object delegate();

    public String toString() {
        switch (this.$r8$classId) {
            case 17:
                return delegate().toString();
            default:
                return super.toString();
        }
    }

    public static ActivityTabPresenter.MetroFactory create(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, InstanceFactory instanceFactory3, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, RealPasscodeFlowStarter.MetroFactory metroFactory, LambdaProvider lambdaProvider, RealActivityItemPresenterFactory.MetroFactory metroFactory2, DoubleCheck doubleCheck5, DoubleCheck doubleCheck6, DelegateFactory delegateFactory, DoubleCheck doubleCheck7, DoubleCheck doubleCheck8, DoubleCheck doubleCheck9, LambdaProvider lambdaProvider2, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5, InstanceFactory instanceFactory6, DoubleCheck doubleCheck10, RealPasscodeFlowStarter.MetroFactory metroFactory3, RealGlobalConfigManager.MetroFactory metroFactory4, DoubleCheck doubleCheck11, DoubleCheck doubleCheck12, DoubleCheck doubleCheck13, DoubleCheck doubleCheck14, RealFileDownloader.MetroFactory metroFactory5, InstanceFactory instanceFactory7, InstanceFactory instanceFactory8, RealLiteCashInRepo$MetroFactory realLiteCashInRepo$MetroFactory, InstanceFactory instanceFactory9, InstanceFactory instanceFactory10, BroadwayModule$ProvideBroadwayMetroFactory broadwayModule$ProvideBroadwayMetroFactory, FillrInitializer.MetroFactory metroFactory6) {
        instanceFactory.getClass();
        instanceFactory2.getClass();
        doubleCheck.getClass();
        doubleCheck2.getClass();
        instanceFactory3.getClass();
        doubleCheck3.getClass();
        doubleCheck4.getClass();
        metroFactory.getClass();
        lambdaProvider.getClass();
        metroFactory2.getClass();
        doubleCheck5.getClass();
        doubleCheck6.getClass();
        delegateFactory.getClass();
        doubleCheck7.getClass();
        doubleCheck8.getClass();
        doubleCheck9.getClass();
        lambdaProvider2.getClass();
        doubleCheck10.getClass();
        metroFactory3.getClass();
        metroFactory4.getClass();
        doubleCheck11.getClass();
        doubleCheck12.getClass();
        doubleCheck13.getClass();
        doubleCheck14.getClass();
        instanceFactory8.getClass();
        instanceFactory9.getClass();
        instanceFactory10.getClass();
        broadwayModule$ProvideBroadwayMetroFactory.getClass();
        metroFactory6.getClass();
        return new ActivityTabPresenter.MetroFactory(instanceFactory, instanceFactory2, doubleCheck, doubleCheck2, instanceFactory3, doubleCheck3, doubleCheck4, metroFactory, lambdaProvider, metroFactory2, doubleCheck5, doubleCheck6, delegateFactory, doubleCheck7, doubleCheck8, doubleCheck9, lambdaProvider2, instanceFactory4, instanceFactory5, instanceFactory6, doubleCheck10, metroFactory3, metroFactory4, doubleCheck11, doubleCheck12, doubleCheck13, doubleCheck14, metroFactory5, instanceFactory7, instanceFactory8, realLiteCashInRepo$MetroFactory, instanceFactory9, instanceFactory10, broadwayModule$ProvideBroadwayMetroFactory, metroFactory6);
    }

    public static RealBlockersHelper.MetroFactory create(RealBrazeManager.MetroFactory metroFactory, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, RealFileDownloader.MetroFactory metroFactory2, RealTabProvider.MetroFactory metroFactory3, InstanceFactory instanceFactory, DoubleCheck doubleCheck3, LambdaProvider lambdaProvider, Provider provider, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck4, TreehouseFlows.MetroFactory metroFactory4, InstanceFactory instanceFactory2, RealMoneyNavigatorHelper.MetroFactory metroFactory5, LambdaProvider lambdaProvider3, DoubleCheck doubleCheck5, LambdaProvider lambdaProvider4, DelegateFactory delegateFactory, BorrowUiFactory.MetroFactory metroFactory6, LambdaProvider lambdaProvider5, InstanceFactory instanceFactory3, DoubleCheck doubleCheck6) {
        metroFactory.getClass();
        doubleCheck.getClass();
        doubleCheck2.getClass();
        metroFactory2.getClass();
        metroFactory3.getClass();
        doubleCheck3.getClass();
        lambdaProvider.getClass();
        provider.getClass();
        lambdaProvider2.getClass();
        doubleCheck4.getClass();
        metroFactory4.getClass();
        instanceFactory2.getClass();
        metroFactory5.getClass();
        lambdaProvider3.getClass();
        doubleCheck5.getClass();
        lambdaProvider4.getClass();
        delegateFactory.getClass();
        metroFactory6.getClass();
        lambdaProvider5.getClass();
        doubleCheck6.getClass();
        return new RealBlockersHelper.MetroFactory(metroFactory, doubleCheck, doubleCheck2, metroFactory2, metroFactory3, instanceFactory, doubleCheck3, lambdaProvider, provider, lambdaProvider2, doubleCheck4, metroFactory4, instanceFactory2, metroFactory5, lambdaProvider3, doubleCheck5, lambdaProvider4, delegateFactory, metroFactory6, lambdaProvider5, instanceFactory3, doubleCheck6);
    }

    public static InvestingPresenterFactory.MetroFactory create(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5, InstanceFactory instanceFactory6, InstanceFactory instanceFactory7, InstanceFactory instanceFactory8, InstanceFactory instanceFactory9, InstanceFactory instanceFactory10, InstanceFactory instanceFactory11, InstanceFactory instanceFactory12, InstanceFactory instanceFactory13, InstanceFactory instanceFactory14, InstanceFactory instanceFactory15, InstanceFactory instanceFactory16, InstanceFactory instanceFactory17, InstanceFactory instanceFactory18, InstanceFactory instanceFactory19, InstanceFactory instanceFactory20, InstanceFactory instanceFactory21, InstanceFactory instanceFactory22, InstanceFactory instanceFactory23, InstanceFactory instanceFactory24, InstanceFactory instanceFactory25, InstanceFactory instanceFactory26, InstanceFactory instanceFactory27, InstanceFactory instanceFactory28, InstanceFactory instanceFactory29, InstanceFactory instanceFactory30, InstanceFactory instanceFactory31, InstanceFactory instanceFactory32, InstanceFactory instanceFactory33) {
        instanceFactory7.getClass();
        instanceFactory23.getClass();
        return new InvestingPresenterFactory.MetroFactory(instanceFactory, instanceFactory2, instanceFactory3, instanceFactory4, instanceFactory5, instanceFactory6, instanceFactory7, instanceFactory8, instanceFactory9, instanceFactory10, instanceFactory11, instanceFactory12, instanceFactory13, instanceFactory14, instanceFactory15, instanceFactory16, instanceFactory17, instanceFactory18, instanceFactory19, instanceFactory20, instanceFactory21, instanceFactory22, instanceFactory23, instanceFactory24, instanceFactory25, instanceFactory26, instanceFactory27, instanceFactory28, instanceFactory29, instanceFactory30, instanceFactory31, instanceFactory32, instanceFactory33);
    }

    public static ActivityTabPresenter.MetroFactory create(DelegateFactory delegateFactory, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, DoubleCheck doubleCheck5, LambdaProvider lambdaProvider, DoubleCheck doubleCheck6, DoubleCheck doubleCheck7, DoubleCheck doubleCheck8, DoubleCheck doubleCheck9, InstanceFactory instanceFactory, DoubleCheck doubleCheck10, DoubleCheck doubleCheck11, DoubleCheck doubleCheck12, DoubleCheck doubleCheck13, DoubleCheck doubleCheck14, DoubleCheck doubleCheck15, LambdaProvider lambdaProvider2, LambdaProvider lambdaProvider3, RealCurrentUserSetter.MetroFactory metroFactory, InstanceFactory instanceFactory2, DoubleCheck doubleCheck16, DoubleCheck doubleCheck17, RealMessageSigner.MetroFactory metroFactory2, InstanceFactory instanceFactory3, NavigationSideEffects.MetroFactory metroFactory3, DoubleCheck doubleCheck18, RealCashFillJsStore.MetroFactory metroFactory4, RealFileDownloader.MetroFactory metroFactory5, RealCurrentUserSetter.MetroFactory metroFactory6, RealCurrentUserSetter.MetroFactory metroFactory7, LambdaProvider lambdaProvider4, RealKnotLauncher.MetroFactory metroFactory8, RealLoanFlowStarter$MetroFactory realLoanFlowStarter$MetroFactory) {
        delegateFactory.getClass();
        doubleCheck.getClass();
        doubleCheck2.getClass();
        doubleCheck3.getClass();
        doubleCheck4.getClass();
        doubleCheck5.getClass();
        lambdaProvider.getClass();
        doubleCheck6.getClass();
        doubleCheck7.getClass();
        doubleCheck8.getClass();
        doubleCheck9.getClass();
        doubleCheck10.getClass();
        doubleCheck11.getClass();
        doubleCheck12.getClass();
        doubleCheck13.getClass();
        doubleCheck14.getClass();
        doubleCheck15.getClass();
        lambdaProvider2.getClass();
        lambdaProvider3.getClass();
        doubleCheck16.getClass();
        doubleCheck17.getClass();
        metroFactory2.getClass();
        metroFactory3.getClass();
        doubleCheck18.getClass();
        metroFactory4.getClass();
        metroFactory5.getClass();
        lambdaProvider4.getClass();
        metroFactory8.getClass();
        return new ActivityTabPresenter.MetroFactory(delegateFactory, doubleCheck, doubleCheck2, doubleCheck3, doubleCheck4, doubleCheck5, lambdaProvider, doubleCheck6, doubleCheck7, doubleCheck8, doubleCheck9, instanceFactory, doubleCheck10, doubleCheck11, doubleCheck12, doubleCheck13, doubleCheck14, doubleCheck15, lambdaProvider2, lambdaProvider3, metroFactory, instanceFactory2, doubleCheck16, doubleCheck17, metroFactory2, instanceFactory3, metroFactory3, doubleCheck18, metroFactory4, metroFactory5, metroFactory6, metroFactory7, lambdaProvider4, metroFactory8, realLoanFlowStarter$MetroFactory);
    }
}
