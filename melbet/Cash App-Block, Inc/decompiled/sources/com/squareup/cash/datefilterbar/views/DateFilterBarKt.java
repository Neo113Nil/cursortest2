package com.squareup.cash.datefilterbar.views;

import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListMeasureResult;
import androidx.compose.foundation.lazy.LazyListMeasuredItem;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.LazyWindowInfo;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.unit.DpSize;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.datefilterbar.viewmodels.DateFilterBarViewModel;
import com.squareup.cash.earnings.views.home.EarningsHomeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.money.views.MoneyTabUIKt$MoneyTabLoaded$4$2$1;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public abstract class DateFilterBarKt {
    public static final DateTimeFormatter monthSelectedFormatter;
    public static final DateTimeFormatter monthUnselectedFormatter;
    public static final DateTimeFormatter yearFormatter;

    static {
        Locale locale = Locale.US;
        monthSelectedFormatter = DateTimeFormatter.ofPattern("MMMM yyyy", locale);
        monthUnselectedFormatter = DateTimeFormatter.ofPattern("MMM", locale);
        yearFormatter = DateTimeFormatter.ofPattern("yyyy", locale);
    }

    public static final void DateFilterBar(DateFilterBarViewModel dateFilterBarViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        dateFilterBarViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1317374926);
        int i2 = i | (gapComposer.changedInstance(dateFilterBarViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            int i3 = 3;
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, gapComposer);
            boolean changed = gapComposer.changed(dateFilterBarViewModel);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(dateFilterBarViewModel.startingIndex);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Integer num = (Integer) mutableState.getValue();
            boolean changed2 = gapComposer.changed(mutableState) | gapComposer.changed(rememberLazyListState);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new MoneyTabUIKt$MoneyTabLoaded$4$2$1(rememberLazyListState, mutableState, null, i3);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(num, dateFilterBarViewModel, (Function2) rememberedValue2, gapComposer);
            PaddingValuesImpl m295PaddingValuesYgX7TsA$default = SpacerKt.m295PaddingValuesYgX7TsA$default(DpSize.m1044getWidthD9Ej5fM(((LazyWindowInfo) ((WindowInfo) gapComposer.consume(CompositionLocalsKt.LocalWindowInfo))).m938getContainerDpSizeMYxV2XQ()) / 2.0f, RecyclerView.DECELERATION_RATE, 2);
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(8.0f, false, new StreamSharing$$ExternalSyntheticLambda1(Alignment.Companion.CenterHorizontally, 18));
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1), 1.0f);
            boolean changedInstance = gapComposer.changedInstance(dateFilterBarViewModel) | gapComposer.changed(mutableState) | ((i2 & 112) == 32);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new CaptureCheckFaceKt$$ExternalSyntheticLambda11(dateFilterBarViewModel, mutableState, function1, 25);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            LazyDslKt.LazyRow(fillMaxWidth, rememberLazyListState, m295PaddingValuesYgX7TsA$default, arrangement$SpacedAligned, vertical, null, false, null, (Function1) rememberedValue3, gapComposer, 221184, 456);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EarningsHomeKt$$ExternalSyntheticLambda2(modifier2, (Object) dateFilterBarViewModel, function1, i, 5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        if (r7.animateScrollToItem(r8, r9, r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        if (r7.scrollToItem(r8, 0, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$animateScrollToItemCenter(LazyListState lazyListState, int i, ContinuationImpl continuationImpl) {
        DateFilterBarKt$animateScrollToItemCenter$1 dateFilterBarKt$animateScrollToItemCenter$1;
        int i2;
        Integer itemCenterOffset;
        if (continuationImpl instanceof DateFilterBarKt$animateScrollToItemCenter$1) {
            dateFilterBarKt$animateScrollToItemCenter$1 = (DateFilterBarKt$animateScrollToItemCenter$1) continuationImpl;
            int i3 = dateFilterBarKt$animateScrollToItemCenter$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                dateFilterBarKt$animateScrollToItemCenter$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = dateFilterBarKt$animateScrollToItemCenter$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = dateFilterBarKt$animateScrollToItemCenter$1.label;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    itemCenterOffset = itemCenterOffset(i, lazyListState.getLayoutInfo());
                    if (itemCenterOffset == null) {
                        dateFilterBarKt$animateScrollToItemCenter$1.L$0 = lazyListState;
                        dateFilterBarKt$animateScrollToItemCenter$1.I$0 = i;
                        dateFilterBarKt$animateScrollToItemCenter$1.label = 1;
                    }
                    int intValue = itemCenterOffset.intValue();
                    dateFilterBarKt$animateScrollToItemCenter$1.L$0 = null;
                    dateFilterBarKt$animateScrollToItemCenter$1.I$0 = i;
                    dateFilterBarKt$animateScrollToItemCenter$1.label = 2;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = dateFilterBarKt$animateScrollToItemCenter$1.I$0;
                    lazyListState = dateFilterBarKt$animateScrollToItemCenter$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                itemCenterOffset = itemCenterOffset(i, lazyListState.getLayoutInfo());
                if (itemCenterOffset == null) {
                    itemCenterOffset = new Integer(0);
                }
                int intValue2 = itemCenterOffset.intValue();
                dateFilterBarKt$animateScrollToItemCenter$1.L$0 = null;
                dateFilterBarKt$animateScrollToItemCenter$1.I$0 = i;
                dateFilterBarKt$animateScrollToItemCenter$1.label = 2;
            }
        }
        dateFilterBarKt$animateScrollToItemCenter$1 = new DateFilterBarKt$animateScrollToItemCenter$1(continuationImpl);
        Object obj2 = dateFilterBarKt$animateScrollToItemCenter$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = dateFilterBarKt$animateScrollToItemCenter$1.label;
        if (i2 != 0) {
        }
        itemCenterOffset = itemCenterOffset(i, lazyListState.getLayoutInfo());
        if (itemCenterOffset == null) {
        }
        int intValue22 = itemCenterOffset.intValue();
        dateFilterBarKt$animateScrollToItemCenter$1.L$0 = null;
        dateFilterBarKt$animateScrollToItemCenter$1.I$0 = i;
        dateFilterBarKt$animateScrollToItemCenter$1.label = 2;
    }

    public static final Integer itemCenterOffset(int i, LazyListMeasureResult lazyListMeasureResult) {
        Object obj;
        Iterator it = lazyListMeasureResult.visibleItemsInfo.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((LazyListMeasuredItem) obj).index == i) {
                break;
            }
        }
        LazyListMeasuredItem lazyListMeasuredItem = (LazyListMeasuredItem) obj;
        if (lazyListMeasuredItem == null) {
            return null;
        }
        return Integer.valueOf(lazyListMeasuredItem.size / 2);
    }
}
