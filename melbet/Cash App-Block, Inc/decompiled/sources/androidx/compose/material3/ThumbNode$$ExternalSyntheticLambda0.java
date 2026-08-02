package androidx.compose.material3;

import android.content.Context;
import android.view.TextureView;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.UpdatableAnimationState;
import androidx.compose.foundation.pager.PagerScrollScopeKt$LazyLayoutScrollScope$1;
import androidx.compose.material.DraggableAnchorsConfig;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.res.ImageResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.core.graphics.Insets;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.local.presenters.LocalCashBalancePresenter;
import coil3.Extras;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.borrow.ui.util.ArcadeThemeKt;
import com.squareup.cash.core.navigationcontainer.UiContainerKt;
import com.squareup.cash.graphics.swampgl.EngineSurfaceTarget;
import com.squareup.cash.paychecks.backend.api.model.EditDistributionConfiguration;
import com.squareup.cash.paychecks.presenters.util.UtilsKt;
import com.squareup.cash.paychecks.screens.CustomAllocationScreen;
import com.squareup.cash.sheet.AnimatedCornerShape;
import com.squareup.cash.sheet.SheetPeekPosition$FixedHeight;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewModel;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel;
import com.squareup.cash.transfers.views.AddMoneyView;
import com.squareup.cash.transfers.views.WithdrawView;
import com.squareup.wire.GrpcMethod;
import com.squareup.wire.MoshiJsonIntegration;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.math.MathKt__MathJVMKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final /* synthetic */ class ThumbNode$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ float f$2;

    public /* synthetic */ ThumbNode$$ExternalSyntheticLambda0(float f, Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$2 = f;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x03fb, code lost:
    
        if (r2 > r0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x03fd, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x03ff, code lost:
    
        r9 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0413, code lost:
    
        if (r2 < r0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00fc, code lost:
    
        if (((com.squareup.cash.transfers.viewmodels.WithdrawViewModel.ViewAmount) r1).instrumentCellViewModel != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00fe, code lost:
    
        r10 = 50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ff, code lost:
    
        r7 = r7 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x010d, code lost:
    
        if (((com.squareup.cash.transfers.viewmodels.WithdrawViewModel.ChangeAmount) r1).hasValidInstrument != false) goto L17;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        float floatValue;
        int i;
        int i2;
        int i3 = this.$r8$classId;
        float f = RecyclerView.DECELERATION_RATE;
        int i4 = 0;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        float f2 = this.f$2;
        switch (i3) {
            case 0:
                Placeable placeable = (Placeable) obj3;
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                Animatable animatable = ((ThumbNode) obj2).offsetAnim;
                if (animatable != null) {
                    f2 = ((Number) animatable.getValue()).floatValue();
                }
                placementScope.placeRelative(placeable, (int) f2, 0, RecyclerView.DECELERATION_RATE);
                return Unit.INSTANCE;
            case 1:
                UpdatableAnimationState updatableAnimationState = (UpdatableAnimationState) obj3;
                Function1 function1 = (Function1) obj2;
                long longValue = ((Long) obj).longValue();
                if (updatableAnimationState.lastFrameTime == Long.MIN_VALUE) {
                    updatableAnimationState.lastFrameTime = longValue;
                }
                float f3 = updatableAnimationState.value;
                AnimationVector1D animationVector1D = new AnimationVector1D(f3);
                AnimationVector1D animationVector1D2 = UpdatableAnimationState.ZeroVector;
                long durationNanos = f2 == RecyclerView.DECELERATION_RATE ? updatableAnimationState.vectorizedSpec.getDurationNanos(new AnimationVector1D(f3), animationVector1D2, updatableAnimationState.lastVelocity) : MathKt__MathJVMKt.roundToLong((longValue - updatableAnimationState.lastFrameTime) / f2);
                float f4 = ((AnimationVector1D) updatableAnimationState.vectorizedSpec.getValueFromNanos(durationNanos, animationVector1D, animationVector1D2, updatableAnimationState.lastVelocity)).value;
                updatableAnimationState.lastVelocity = (AnimationVector1D) updatableAnimationState.vectorizedSpec.getVelocityFromNanos(durationNanos, animationVector1D, animationVector1D2, updatableAnimationState.lastVelocity);
                updatableAnimationState.lastFrameTime = longValue;
                float f5 = updatableAnimationState.value - f4;
                updatableAnimationState.value = f4;
                function1.invoke(Float.valueOf(f5));
                return Unit.INSTANCE;
            case 2:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj3;
                PagerScrollScopeKt$LazyLayoutScrollScope$1 pagerScrollScopeKt$LazyLayoutScrollScope$1 = (PagerScrollScopeKt$LazyLayoutScrollScope$1) obj2;
                AnimationScope animationScope = (AnimationScope) obj;
                if (f2 <= RecyclerView.DECELERATION_RATE) {
                    if (f2 < RecyclerView.DECELERATION_RATE) {
                        floatValue = ((Number) animationScope.value$delegate.getValue()).floatValue();
                        break;
                    }
                } else {
                    floatValue = ((Number) animationScope.value$delegate.getValue()).floatValue();
                    break;
                }
                float f6 = f - ref$FloatRef.element;
                if (f6 != pagerScrollScopeKt$LazyLayoutScrollScope$1.scrollBy(f6) || f != ((Number) animationScope.value$delegate.getValue()).floatValue()) {
                    animationScope.cancelAnimation();
                }
                ref$FloatRef.element += f6;
                return Unit.INSTANCE;
            case 3:
                AndroidImageBitmap androidImageBitmap = (AndroidImageBitmap) obj3;
                BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) obj2;
                LayoutNodeDrawScope layoutNodeDrawScope = (LayoutNodeDrawScope) obj;
                layoutNodeDrawScope.drawContent();
                GrpcMethod grpcMethod = layoutNodeDrawScope.canvasDrawScope.drawContext;
                long m3999getSizeNHjbRc = grpcMethod.m3999getSizeNHjbRc();
                grpcMethod.getCanvas().save();
                try {
                    Extras.Key key = (Extras.Key) grpcMethod.path;
                    key.translate(f2, RecyclerView.DECELERATION_RATE);
                    key.m1436rotateUv8p0NA(0L, 45.0f);
                    DrawScope.m740drawImagegbVJVH8$default(layoutNodeDrawScope, androidImageBitmap, 0L, RecyclerView.DECELERATION_RATE, blendModeColorFilter, 0, 46);
                    Recorder$$ExternalSyntheticOutline2.m(grpcMethod, m3999getSizeNHjbRc);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    Recorder$$ExternalSyntheticOutline2.m(grpcMethod, m3999getSizeNHjbRc);
                    throw th;
                }
            case 4:
                IntSize intSize = (IntSize) obj2;
                DraggableAnchorsConfig draggableAnchorsConfig = (DraggableAnchorsConfig) obj;
                ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Hidden;
                LinkedHashMap linkedHashMap = draggableAnchorsConfig.anchors;
                LinkedHashMap linkedHashMap2 = draggableAnchorsConfig.anchors;
                linkedHashMap.put(modalBottomSheetValue, Float.valueOf(f2));
                float f7 = f2 / 2.0f;
                if (!((ModalBottomSheetState) obj3).isSkipHalfExpanded && ((int) (intSize.packedValue & BodyPartID.bodyIdMax)) > f7) {
                    linkedHashMap2.put(ModalBottomSheetValue.HalfExpanded, Float.valueOf(f7));
                }
                int i5 = (int) (intSize.packedValue & BodyPartID.bodyIdMax);
                if (i5 != 0) {
                    linkedHashMap2.put(ModalBottomSheetValue.Expanded, Float.valueOf(Math.max(RecyclerView.DECELERATION_RATE, f2 - i5)));
                }
                return Unit.INSTANCE;
            case 5:
                AndroidImageBitmap androidImageBitmap2 = (AndroidImageBitmap) obj3;
                LayoutNodeDrawScope layoutNodeDrawScope2 = (LayoutNodeDrawScope) obj;
                layoutNodeDrawScope2.getClass();
                layoutNodeDrawScope2.drawContent();
                CanvasDrawScope canvasDrawScope = layoutNodeDrawScope2.canvasDrawScope;
                long ceil = (((int) Math.ceil(Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() >> 32)))) << 32) | (((int) Math.ceil((Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() >> 32)) / androidImageBitmap2.bitmap.getWidth()) * androidImageBitmap2.bitmap.getHeight())) & BodyPartID.bodyIdMax);
                float floatValue2 = ((Number) ((Animatable) obj2).getValue()).floatValue() * f2;
                ((Extras.Key) canvasDrawScope.drawContext.path).translate(RecyclerView.DECELERATION_RATE, floatValue2);
                try {
                    DrawScope.m739drawImageAZ2fEMs$default(layoutNodeDrawScope2, androidImageBitmap2, 0L, 0L, ceil, RecyclerView.DECELERATION_RATE, null, 12, 0, 750);
                    ((Extras.Key) canvasDrawScope.drawContext.path).translate(-0.0f, -floatValue2);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    ((Extras.Key) canvasDrawScope.drawContext.path).translate(-0.0f, -floatValue2);
                    throw th2;
                }
            case 6:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
                parentLayoutCoordinates.getClass();
                ((Function1) obj2).invoke(UiContainerKt.scaleInsets(Insets.of(0, 0, 0, (((int) (parentLayoutCoordinates.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax)) - ((int) Float.intBitsToFloat((int) (ValueInsets.positionInParent(layoutCoordinates) & BodyPartID.bodyIdMax)))) - ((Density) obj3).mo230roundToPx0680j_4(8.0f)), f2));
                return Unit.INSTANCE;
            case 7:
                Context context = (Context) obj;
                context.getClass();
                TextureView textureView = new TextureView(context);
                textureView.setOpaque(false);
                Timber.Forest forest = Timber.Forest;
                forest.tag("SwampGLEffect");
                forest.d("TextureView: using=" + f2 + "Hz", new Object[0]);
                ((MutableState) obj2).setValue(Float.valueOf(f2));
                textureView.setSurfaceTextureListener((EngineSurfaceTarget) obj3);
                return textureView;
            case 8:
                EditDistributionConfiguration.DestinationUiConfiguration destinationUiConfiguration = (EditDistributionConfiguration.DestinationUiConfiguration) obj3;
                AskedQuestion askedQuestion = (AskedQuestion) obj;
                askedQuestion.getClass();
                return new CustomAllocationScreen(askedQuestion, UtilsKt.getBasisPoints(f2), UtilsKt.getBasisPoints(ImageResources_androidKt.maxAllocationFor(destinationUiConfiguration, ((EditDistributionConfiguration) ((LocalCashBalancePresenter) obj2).service).initialDestinationStates)), ArcadeThemeKt.requireSelectedStateUiElements(destinationUiConfiguration).header, ArcadeThemeKt.requireSelectedStateUiElements(destinationUiConfiguration).customAmountSubtitle, MoshiJsonIntegration.toModel(destinationUiConfiguration.tint));
            case 9:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                reusableGraphicsLayerScope.setAlpha(((Number) ((State) obj3).getValue()).floatValue());
                reusableGraphicsLayerScope.setTranslationY((1.0f - ((Number) ((State) obj2).getValue()).floatValue()) * f2);
                return Unit.INSTANCE;
            case 10:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope2 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope2.getClass();
                reusableGraphicsLayerScope2.setAlpha(((AnimatedCornerShape) obj3).calculateDistanceFractionFromStatusBar((Density) obj2) * f2);
                return Unit.INSTANCE;
            case 11:
                AddMoneyView addMoneyView = (AddMoneyView) obj3;
                Density density = (Density) obj2;
                AddMoneyViewModel addMoneyViewModel = (AddMoneyViewModel) obj;
                addMoneyViewModel.getClass();
                if (((addMoneyViewModel instanceof AddMoneyViewModel.Keypad) && ((AddMoneyViewModel.Keypad) addMoneyViewModel).skipSheetPeekPosition) || !addMoneyViewModel.getAllowSheetExpansion()) {
                    return null;
                }
                int i6 = (int) (((addMoneyView.getContext().getResources().getConfiguration().fontScale - 1.0f) * 8.0f) / 0.08f);
                int i7 = addMoneyViewModel.getRecurringCashInToggle() != null ? 536 : (addMoneyViewModel.getInstrumentCellViewModel() == null && addMoneyViewModel.getPayWithGooglePayLabel() == null) ? 420 : 460;
                float mo233toDpu2uoSUM = density.mo233toDpu2uoSUM(addMoneyView.getContext().getResources().getDisplayMetrics().heightPixels) - 1.0f;
                Dp dp = new Dp((f2 / 2.0f) + i7 + i6);
                Dp dp2 = new Dp(mo233toDpu2uoSUM);
                if (dp.compareTo(dp2) > 0) {
                    dp = dp2;
                }
                return new SheetPeekPosition$FixedHeight(6, dp.value, false);
            case 12:
                WithdrawView withdrawView = (WithdrawView) obj3;
                Density density2 = (Density) obj2;
                WithdrawViewModel withdrawViewModel = (WithdrawViewModel) obj;
                withdrawViewModel.getClass();
                boolean z = withdrawView.multiLinkingButtonsEnabled;
                int i8 = (int) (((withdrawView.getContext().getResources().getConfiguration().fontScale - 1.0f) * 8.0f) / 0.08f);
                if (withdrawViewModel instanceof WithdrawViewModel.ViewAmount) {
                    i2 = z ? 470 : 549;
                    break;
                } else if (withdrawViewModel instanceof WithdrawViewModel.ChangeAmount) {
                    i2 = z ? 470 : 549;
                    break;
                } else {
                    i = withdrawViewModel instanceof WithdrawViewModel.ManagedAccountAmountEntry ? 356 : withdrawViewModel instanceof WithdrawViewModel.ManagedAccountConfirmation ? EnumC0170g.SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE : 534;
                }
                int i9 = i + i8;
                boolean z2 = withdrawViewModel instanceof WithdrawViewModel.ManagedAccountAmountEntry;
                if (!z2 && !(withdrawViewModel instanceof WithdrawViewModel.ManagedAccountConfirmation)) {
                    f2 /= 2.0f;
                }
                float mo233toDpu2uoSUM2 = density2.mo233toDpu2uoSUM(withdrawView.getContext().getResources().getDisplayMetrics().heightPixels) - 1.0f;
                Dp dp3 = new Dp(i9 + f2);
                Dp dp4 = new Dp(mo233toDpu2uoSUM2);
                if (dp3.compareTo(dp4) > 0) {
                    dp3 = dp4;
                }
                return new SheetPeekPosition$FixedHeight(4, dp3.value, z2);
            default:
                State state = (State) obj3;
                Brush brush = (Brush) obj2;
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                float m642getMinDimensionimpl = Size.m642getMinDimensionimpl(drawScope.mo753getSizeNHjbRc());
                float mo236toPx0680j_4 = drawScope.mo236toPx0680j_4(f2);
                float f8 = (m642getMinDimensionimpl / 2.0f) - ((m642getMinDimensionimpl - mo236toPx0680j_4) / 2.0f);
                long floatToRawIntBits = (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f8) & BodyPartID.bodyIdMax);
                GrpcMethod drawContext = drawScope.getDrawContext();
                long m3999getSizeNHjbRc2 = drawContext.m3999getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    Extras.Key key2 = (Extras.Key) drawContext.path;
                    GrpcMethod grpcMethod2 = (GrpcMethod) key2.f61default;
                    key2.m1436rotateUv8p0NA((Float.floatToRawIntBits(Float.intBitsToFloat((int) (grpcMethod2.m3999getSizeNHjbRc() & BodyPartID.bodyIdMax)) / 2.0f) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (grpcMethod2.m3999getSizeNHjbRc() >> 32)) / 2.0f) << 32), ((Number) state.getValue()).floatValue());
                    drawScope.mo724drawArcillE91I(brush, floatToRawIntBits, (Float.floatToRawIntBits(r1) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(r1) << 32), new Stroke(mo236toPx0680j_4, RecyclerView.DECELERATION_RATE, 1, 0, null, 26));
                    Recorder$$ExternalSyntheticOutline2.m(drawContext, m3999getSizeNHjbRc2);
                    return Unit.INSTANCE;
                } catch (Throwable th3) {
                    Recorder$$ExternalSyntheticOutline2.m(drawContext, m3999getSizeNHjbRc2);
                    throw th3;
                }
        }
    }

    public /* synthetic */ ThumbNode$$ExternalSyntheticLambda0(Object obj, float f, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = f;
        this.f$1 = obj2;
    }

    public /* synthetic */ ThumbNode$$ExternalSyntheticLambda0(Object obj, Object obj2, float f, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = f;
    }
}
