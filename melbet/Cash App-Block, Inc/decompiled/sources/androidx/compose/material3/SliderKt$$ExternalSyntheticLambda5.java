package androidx.compose.material3;

import android.graphics.Bitmap;
import android.widget.LinearLayout;
import androidx.activity.compose.ComposePredictiveBackHandler;
import androidx.camera.camera2.adapter.CaptureResultAdapter;
import androidx.camera.camera2.impl.CapturePipelineImpl;
import androidx.camera.camera2.impl.CapturePipelineImpl$emptyRequestMetadata$1;
import androidx.camera.camera2.impl.CapturePipelineImpl$toCameraCaptureResult$frameInfo$1;
import androidx.camera.camera2.pipe.compat.AndroidFrameMetadata;
import androidx.camera.core.impl.ConvergenceUtils;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.gestures.DraggableAnchorsConfig;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntSize;
import androidx.core.graphics.ColorUtils;
import androidx.lifecycle.compose.LifecycleStartStopEffectScope;
import androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult;
import androidx.recyclerview.widget.RecyclerView;
import coil3.BitmapImage;
import coil3.Image;
import coil3.compose.AsyncImagePainter;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.investing.components.MooncakeMyInvestmentsTileView;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.SheetPosition;
import com.squareup.cash.sheet.UserDismissMode;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.contour.YInt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class SliderKt$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda5(Object obj, boolean z, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$0 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0123, code lost:
    
        if (r0 != r12) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0132, code lost:
    
        r0.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0130, code lost:
    
        if (r0 != r12) goto L64;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Bitmap bitmap;
        int m3810bottomdBGyhoQ;
        int dip;
        int i = this.$r8$classId;
        boolean z = false;
        int i2 = 1;
        Object obj2 = this.f$1;
        boolean z2 = this.f$0;
        switch (i) {
            case 0:
                SliderState sliderState = (SliderState) obj2;
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                if (!z2) {
                    SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                }
                SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, String.valueOf(MathKt__MathJVMKt.roundToInt(sliderState.valueState$delegate.getFloatValue() * 100.0f) / 100.0f));
                semanticsPropertyReceiver.set(SemanticsActions.SetProgress, new AccessibilityAction(null, new SliderKt$$ExternalSyntheticLambda3(sliderState, i2)));
                return Unit.INSTANCE;
            case 1:
                final ComposePredictiveBackHandler composePredictiveBackHandler = (ComposePredictiveBackHandler) obj2;
                final LifecycleStartStopEffectScope lifecycleStartStopEffectScope = (LifecycleStartStopEffectScope) obj;
                composePredictiveBackHandler.setBackEnabled(z2);
                return new LifecycleStopOrDisposeEffectResult(lifecycleStartStopEffectScope, composePredictiveBackHandler) { // from class: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$lambda$3$0$$inlined$onStopOrDispose$1
                    public final /* synthetic */ ComposePredictiveBackHandler $handler$inlined;

                    {
                        this.$handler$inlined = composePredictiveBackHandler;
                    }

                    @Override // androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult
                    public final void runStopOrDisposeEffect() {
                        this.$handler$inlined.setBackEnabled(false);
                    }
                };
            case 2:
                CapturePipelineImpl capturePipelineImpl = (CapturePipelineImpl) obj2;
                AndroidFrameMetadata androidFrameMetadata = (AndroidFrameMetadata) obj;
                androidFrameMetadata.getClass();
                CapturePipelineImpl$toCameraCaptureResult$frameInfo$1 capturePipelineImpl$toCameraCaptureResult$frameInfo$1 = new CapturePipelineImpl$toCameraCaptureResult$frameInfo$1(androidFrameMetadata, capturePipelineImpl);
                CapturePipelineImpl$emptyRequestMetadata$1 capturePipelineImpl$emptyRequestMetadata$1 = capturePipelineImpl.emptyRequestMetadata;
                androidFrameMetadata.captureResult.getFrameNumber();
                return Boolean.valueOf(ConvergenceUtils.is3AConverged(new CaptureResultAdapter(capturePipelineImpl$emptyRequestMetadata$1, capturePipelineImpl$toCameraCaptureResult$frameInfo$1), z2));
            case 3:
                DraggableAnchorsConfig draggableAnchorsConfig = (DraggableAnchorsConfig) obj;
                float f = (int) (((IntSize) obj2).packedValue >> 32);
                draggableAnchorsConfig.at(SwipeToDismissBoxValue.Settled, RecyclerView.DECELERATION_RATE);
                if (z2) {
                    draggableAnchorsConfig.at(SwipeToDismissBoxValue.StartToEnd, f);
                }
                draggableAnchorsConfig.at(SwipeToDismissBoxValue.EndToStart, -f);
                return Unit.INSTANCE;
            case 4:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver2, ((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate) obj2).contentDescription);
                if (z2) {
                    SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver2, true);
                }
                return Unit.INSTANCE;
            case 5:
                Function1 function1 = (Function1) obj2;
                AsyncImagePainter.State.Success success = (AsyncImagePainter.State.Success) obj;
                success.getClass();
                if (z2) {
                    Image image = success.result.image;
                    Bitmap bitmap2 = null;
                    BitmapImage bitmapImage = image instanceof BitmapImage ? (BitmapImage) image : null;
                    if (bitmapImage != null && (bitmap = bitmapImage.bitmap) != null) {
                        try {
                            if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                                Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                                if (copy != null) {
                                    bitmap2 = copy;
                                }
                            } else {
                                bitmap2 = bitmap;
                            }
                            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, 10, 10, true);
                            createScaledBitmap.getClass();
                            int width = createScaledBitmap.getWidth();
                            double d = 0.0d;
                            for (int i3 = 0; i3 < width; i3++) {
                                int height = createScaledBitmap.getHeight();
                                for (int i4 = 0; i4 < height; i4++) {
                                    d += ColorUtils.calculateLuminance(createScaledBitmap.getPixel(i3, i4));
                                }
                            }
                            if (d / (createScaledBitmap.getWidth() * createScaledBitmap.getHeight()) < 0.5d) {
                                z = true;
                                break;
                            }
                        } catch (Exception unused) {
                            if (bitmap2 != null) {
                            }
                        } catch (Throwable th) {
                            if (bitmap2 != null && bitmap2 != bitmap) {
                                bitmap2.recycle();
                            }
                            throw th;
                        }
                    }
                }
                function1.invoke(Boolean.valueOf(z));
                return Unit.INSTANCE;
            case 6:
                MooncakeMyInvestmentsTileView mooncakeMyInvestmentsTileView = (MooncakeMyInvestmentsTileView) obj2;
                LinearLayout linearLayout = mooncakeMyInvestmentsTileView.statsContainer;
                if (linearLayout.getVisibility() == 0) {
                    dip = mooncakeMyInvestmentsTileView.m3810bottomdBGyhoQ(linearLayout);
                    m3810bottomdBGyhoQ = z2 ? mooncakeMyInvestmentsTileView.getDip(0) : mooncakeMyInvestmentsTileView.getDip(8);
                } else {
                    m3810bottomdBGyhoQ = mooncakeMyInvestmentsTileView.m3810bottomdBGyhoQ(mooncakeMyInvestmentsTileView.investedLayout);
                    dip = mooncakeMyInvestmentsTileView.getDip(32);
                }
                return new YInt(dip + m3810bottomdBGyhoQ);
            case 7:
                Animatable animatable = (Animatable) obj2;
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                reusableGraphicsLayerScope.setAlpha(z2 ? RangesKt___RangesKt.coerceIn(1.0f - (((Number) animatable.getValue()).floatValue() * 2.0f), RecyclerView.DECELERATION_RATE, 1.0f) : RangesKt___RangesKt.coerceIn((((Number) animatable.getValue()).floatValue() - 0.5f) * 2.0f, RecyclerView.DECELERATION_RATE, 1.0f));
                return Unit.INSTANCE;
            case 8:
                SheetPosition sheetPosition = (SheetPosition) obj;
                sheetPosition.getClass();
                return new RealSheetState(sheetPosition, (UserDismissMode) obj2, z2);
            default:
                ToolbarTuckTargets toolbarTuckTargets = (ToolbarTuckTargets) obj2;
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                float intBitsToFloat = Float.intBitsToFloat((int) (ValueInsets.findRootCoordinates(layoutCoordinates).localBoundingBoxOf(layoutCoordinates, true).m633getCenterF1C5BW0() >> 32));
                if (z2) {
                    ((ParcelableSnapshotMutableState) toolbarTuckTargets.startCornerCenterX$delegate).setValue(Float.valueOf(intBitsToFloat));
                } else {
                    ((ParcelableSnapshotMutableState) toolbarTuckTargets.endCornerCenterX$delegate).setValue(Float.valueOf(intBitsToFloat));
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda5(boolean z, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = z;
        this.f$1 = obj;
    }
}
