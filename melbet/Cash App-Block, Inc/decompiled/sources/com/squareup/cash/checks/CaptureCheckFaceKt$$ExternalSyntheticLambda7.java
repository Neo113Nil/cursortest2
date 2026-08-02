package com.squareup.cash.checks;

import android.content.Context;
import android.graphics.BitmapFactory;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.Constraints;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.sqldelight.driver.android.AndroidStatement;
import coil3.Extras;
import com.squareup.cash.checks.CaptureCheckFaceViewModel;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.ReactionConfig;
import com.squareup.cash.deposits.physical.view.barcode.PaperMoneyDepositBarcodeAndLogoView;
import com.squareup.cash.deposits.physical.viewmodels.barcode.PaperMoneyDepositBarcodeViewModel;
import com.squareup.cash.shopping.views.search.ShopHubResultsListKt$$ExternalSyntheticLambda21;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.workflow1.WorkflowAction;
import com.withpersona.sdk2.camera.selfie.SelfieError;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflowUtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class CaptureCheckFaceKt$$ExternalSyntheticLambda7 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ long f$2;

    public /* synthetic */ CaptureCheckFaceKt$$ExternalSyntheticLambda7(long j, Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$2 = j;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list;
        int i = this.$r8$classId;
        float f = RecyclerView.DECELERATION_RATE;
        long j = BodyPartID.bodyIdMax;
        long j2 = this.f$2;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                CaptureCheckFaceViewModel.Loaded.FinalFrame finalFrame = (CaptureCheckFaceViewModel.Loaded.FinalFrame) obj3;
                BitmapFactory.Options options = (BitmapFactory.Options) obj2;
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                int i2 = options.outWidth;
                int i3 = options.outHeight;
                if (finalFrame.orientation != CaptureCheckFaceViewModel.Loaded.FinalFrame.Orientation.LANDSCAPE) {
                    list = EmptyList.INSTANCE;
                } else {
                    Iterable iterable = finalFrame.fourCorners;
                    if (iterable == null) {
                        iterable = EmptyList.INSTANCE;
                    }
                    Iterable<CaptureCheckFaceViewModel.Loaded.FinalFrame.Point> iterable2 = iterable;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
                    for (CaptureCheckFaceViewModel.Loaded.FinalFrame.Point point : iterable2) {
                        arrayList.add(new CaptureCheckFaceViewModel.Loaded.FinalFrame.Point((int) ((finalFrame.miSnapViewWidth / i2) * point.x), (int) ((finalFrame.miSnapViewHeight / i3) * point.y)));
                    }
                    list = arrayList;
                }
                list.getClass();
                float mo236toPx0680j_4 = drawScope.mo236toPx0680j_4(4.0f);
                AndroidPath Path = AndroidPath_androidKt.Path();
                if (!list.isEmpty()) {
                    Path.moveTo(((CaptureCheckFaceViewModel.Loaded.FinalFrame.Point) list.get(0)).x, ((CaptureCheckFaceViewModel.Loaded.FinalFrame.Point) list.get(0)).y);
                    int size = list.size();
                    for (int i4 = 1; i4 < size; i4++) {
                        Path.lineTo(((CaptureCheckFaceViewModel.Loaded.FinalFrame.Point) list.get(i4)).x, ((CaptureCheckFaceViewModel.Loaded.FinalFrame.Point) list.get(i4)).y);
                    }
                    Path.close();
                }
                DrawScope.m745drawPathLG529CI$default(drawScope, Path, this.f$2, RecyclerView.DECELERATION_RATE, new Stroke(mo236toPx0680j_4, RecyclerView.DECELERATION_RATE, 0, 0, null, 30), 52);
                return Unit.INSTANCE;
            case 1:
                Function2 function2 = (Function2) obj2;
                TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
                textLayoutResult.getClass();
                ((MutableState) obj3).setValue(textLayoutResult);
                if (function2 != null) {
                    function2.invoke(textLayoutResult, new Color(j2));
                }
                return Unit.INSTANCE;
            case 2:
                ArrayList arrayList2 = (ArrayList) obj2;
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                placementScope.getClass();
                int i5 = 0;
                for (Object obj4 : (ArrayList) obj3) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    Placeable placeable = (Placeable) obj4;
                    placementScope.place(placeable, RangesKt___RangesKt.coerceIn((int) (((Number) arrayList2.get(i5)).floatValue() - (placeable.width / 2.0f)), 0, Constraints.m1025getMaxWidthimpl(j2) - placeable.width), 0, RecyclerView.DECELERATION_RATE);
                    i5 = i6;
                }
                return Unit.INSTANCE;
            case 3:
                List list2 = (List) obj3;
                InstrumentQueries instrumentQueries = (InstrumentQueries) obj2;
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindLong(0, Long.valueOf(j2));
                androidStatement.bindBytes(1, list2 != null ? (byte[]) ((ReactionConfig.Adapter) instrumentQueries.instrumentAdapter).extendedReactionsAdapter.encode(list2) : null);
                return Unit.INSTANCE;
            case 4:
                Context context = (Context) obj;
                context.getClass();
                PaperMoneyDepositBarcodeAndLogoView paperMoneyDepositBarcodeAndLogoView = new PaperMoneyDepositBarcodeAndLogoView(context, ColorKt.m694toArgb8_81llA(j2));
                paperMoneyDepositBarcodeAndLogoView.setModel((PaperMoneyDepositBarcodeViewModel) obj3);
                paperMoneyDepositBarcodeAndLogoView.setEventReceiver(new ShopHubResultsListKt$$ExternalSyntheticLambda21(6, (Function1) obj2));
                return paperMoneyDepositBarcodeAndLogoView;
            case 5:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindLong(0, Long.valueOf(j2));
                androidStatement2.bindLong(1, (Long) obj3);
                androidStatement2.bindString(2, (String) obj2);
                return Unit.INSTANCE;
            case 6:
                SnapshotStateMap snapshotStateMap = (SnapshotStateMap) obj2;
                DrawScope drawScope2 = (DrawScope) obj;
                drawScope2.getClass();
                float mo236toPx0680j_42 = drawScope2.mo236toPx0680j_4(28.0f) / 2.0f;
                float mo236toPx0680j_43 = drawScope2.mo236toPx0680j_4(16.0f) / 2.0f;
                float mo236toPx0680j_44 = drawScope2.mo236toPx0680j_4(4.0f);
                float mo236toPx0680j_45 = drawScope2.mo236toPx0680j_4(2.0f) / 2.0f;
                Iterator it = CollectionsKt.windowed$default(CollectionsKt__CollectionsKt.getIndices(((FormBlocker.Element.TimelineCardListElement) obj3).items), 2, 0, 6).iterator();
                while (it.hasNext()) {
                    List list3 = (List) it.next();
                    int intValue = ((Number) list3.get(0)).intValue();
                    int intValue2 = ((Number) list3.get(1)).intValue();
                    Float f2 = (Float) snapshotStateMap.get(Integer.valueOf(intValue));
                    if (f2 != null) {
                        float floatValue = f2.floatValue();
                        Float f3 = (Float) snapshotStateMap.get(Integer.valueOf(intValue2));
                        if (f3 != null) {
                            if (((f3.floatValue() - mo236toPx0680j_43) - mo236toPx0680j_44) - ((floatValue + mo236toPx0680j_43) + mo236toPx0680j_44) > f) {
                                int i7 = 0;
                                while (i7 < 4) {
                                    long j3 = j;
                                    DrawScope.m738drawCircleVaOC9Bg$default(drawScope2, this.f$2, mo236toPx0680j_45, (Float.floatToRawIntBits(mo236toPx0680j_42) << 32) | (Float.floatToRawIntBits((((i7 + 1.0f) / 5.0f) * r4) + r6) & j3), null, 0, 120);
                                    i7++;
                                    it = it;
                                    j = j3;
                                }
                            }
                        }
                    }
                    it = it;
                    drawScope2 = drawScope2;
                    j = j;
                    f = RecyclerView.DECELERATION_RATE;
                }
                return Unit.INSTANCE;
            case 7:
                Painter painter = (Painter) obj2;
                LayoutNodeDrawScope layoutNodeDrawScope = (LayoutNodeDrawScope) obj;
                layoutNodeDrawScope.getClass();
                layoutNodeDrawScope.drawContent();
                CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.canvasDrawScope;
                if (((CardSchemeViewModel.Module.HeroCardDetails) obj3).showPrepurchaseContourText) {
                    float intBitsToFloat = Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() >> 32)) * 1.065f;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) * 1.1f;
                    float intBitsToFloat3 = (Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() >> 32)) - intBitsToFloat) / 2.0f;
                    float intBitsToFloat4 = (Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) - intBitsToFloat2) / 2.0f;
                    ((Extras.Key) canvasDrawScope.drawContext.path).translate(intBitsToFloat3, intBitsToFloat4);
                    try {
                        Painter.m761drawx_KDEd0$default(painter, layoutNodeDrawScope, (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax), RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j2, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j2), ColorKt.m693toAndroidBlendModes9anfk8(5))), 2, null);
                    } finally {
                        ((Extras.Key) canvasDrawScope.drawContext.path).translate(-intBitsToFloat3, -intBitsToFloat4);
                    }
                }
                return Unit.INSTANCE;
            default:
                SelfieState.CountdownToCapture countdownToCapture = (SelfieState.CountdownToCapture) obj3;
                SelfieWorkflow.Input input = (SelfieWorkflow.Input) obj2;
                WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                Object obj5 = updater.state;
                SelfieState.CountdownToCapture countdownToCapture2 = obj5 instanceof SelfieState.CountdownToCapture ? (SelfieState.CountdownToCapture) obj5 : null;
                if (countdownToCapture2 == null) {
                    return Unit.INSTANCE;
                }
                int i8 = countdownToCapture2.countDown;
                if (i8 <= 1 || j2 <= 0) {
                    List list4 = countdownToCapture2.selfies;
                    SelfieError selfieError = countdownToCapture2.selfieError;
                    List list5 = countdownToCapture2.posesNeeded;
                    updater.state = new SelfieState.Capture(countdownToCapture.poseScore, 8256, countdownToCapture2.startCaptureTimestamp, countdownToCapture.startSelfieTimestamp, countdownToCapture.cameraFacingMode, countdownToCapture2.cameraProperties, countdownToCapture.brightnessInfo, selfieError, input.poseConfigs, SelfieWorkflowUtilsKt.createBackState(updater, false), list4, list5, false, countdownToCapture.isFlashEnabled);
                } else {
                    updater.state = SelfieState.CountdownToCapture.copy$default(countdownToCapture2, i8 - 1, countdownToCapture2.selfieError, false, 16380);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ CaptureCheckFaceKt$$ExternalSyntheticLambda7(Object obj, Object obj2, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = j;
    }
}
