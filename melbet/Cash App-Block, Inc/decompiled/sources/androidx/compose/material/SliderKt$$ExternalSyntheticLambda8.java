package androidx.compose.material;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.icu.text.MessageFormat;
import android.text.TextPaint;
import android.view.SurfaceView;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridItemScopeImpl;
import androidx.compose.material.RippleKt;
import androidx.compose.material.RippleNodeFactory;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda18;
import app.cash.molecule.PlatformKt;
import coil3.Extras;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import coil3.size.RealSizeResolver;
import coil3.size.SizeKt;
import coil3.transition.CrossfadeTransition;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.components.Sparkle;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.graphics.swampgl.EngineSurfaceViewTarget;
import com.squareup.cash.graphics.views.effect.GLSurfaceConfig$SurfaceView;
import com.squareup.cash.payments.presenters.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentStickersViewModel;
import com.squareup.cash.payments.viewmodels.Sticker;
import com.squareup.util.MathsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.random.AbstractPlatformRandom;
import kotlin.random.Random;
import kotlin.ranges.ClosedFloatRange;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final /* synthetic */ class SliderKt$$ExternalSyntheticLambda8 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda8(float f, Context context, PersonalizePaymentStickersViewModel personalizePaymentStickersViewModel, Function1 function1) {
        this.$r8$classId = 5;
        this.f$0 = personalizePaymentStickersViewModel;
        this.f$4 = context;
        this.f$2 = f;
        this.f$3 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        double d;
        double nextDouble;
        double d2;
        float f;
        float[] fArr;
        char c;
        char c2;
        int i;
        int i2;
        int i3 = this.$r8$classId;
        float f2 = 2.0f;
        final float f3 = this.f$2;
        char c3 = 0;
        char c4 = 1;
        Object obj2 = this.f$3;
        Object obj3 = this.f$4;
        Object obj4 = this.f$0;
        switch (i3) {
            case 0:
                Function1 function1 = (Function1) obj2;
                Function0 function0 = (Function0) obj3;
                ClosedFloatRange closedFloatRange = (ClosedFloatRange) ((ClosedFloatingPointRange) obj4);
                float coerceIn = RangesKt___RangesKt.coerceIn(((Float) obj).floatValue(), closedFloatRange._start, closedFloatRange._endInclusive);
                if (coerceIn == f3) {
                    z = false;
                } else {
                    function1.invoke(Float.valueOf(coerceIn));
                    if (function0 != null) {
                        function0.invoke();
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj4;
                androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1 = (androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDragScope$1) obj2;
                Ref$FloatRef ref$FloatRef2 = (Ref$FloatRef) obj3;
                AnimationScope animationScope = (AnimationScope) obj;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = animationScope.value$delegate;
                if ((((Number) parcelableSnapshotMutableState.getValue()).floatValue() >= f3 || ref$FloatRef.element <= f3) && (((Number) parcelableSnapshotMutableState.getValue()).floatValue() <= f3 || ref$FloatRef.element >= f3)) {
                    anchoredDraggableState$anchoredDragScope$1.dragTo(((Number) parcelableSnapshotMutableState.getValue()).floatValue(), ((Number) animationScope.getVelocity()).floatValue());
                    ref$FloatRef2.element = ((Number) animationScope.getVelocity()).floatValue();
                    ref$FloatRef.element = ((Number) parcelableSnapshotMutableState.getValue()).floatValue();
                } else {
                    float floatValue = ((Number) parcelableSnapshotMutableState.getValue()).floatValue();
                    float f4 = RecyclerView.DECELERATION_RATE;
                    if (f3 == RecyclerView.DECELERATION_RATE) {
                        f3 = 0.0f;
                    } else if (f3 <= RecyclerView.DECELERATION_RATE ? floatValue >= f3 : floatValue <= f3) {
                        f3 = floatValue;
                    }
                    anchoredDraggableState$anchoredDragScope$1.dragTo(f3, ((Number) animationScope.getVelocity()).floatValue());
                    if (!Float.isNaN(((Number) animationScope.getVelocity()).floatValue())) {
                        f4 = ((Number) animationScope.getVelocity()).floatValue();
                    }
                    ref$FloatRef2.element = f4;
                    ref$FloatRef.element = f3;
                    animationScope.cancelAnimation();
                }
                return Unit.INSTANCE;
            case 2:
                MutableState mutableState = (MutableState) obj4;
                Density density = (Density) obj2;
                Animatable animatable = (Animatable) obj3;
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                if (((List) mutableState.getValue()).isEmpty()) {
                    float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32));
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax));
                    float mo236toPx0680j_4 = density.mo236toPx0680j_4(20.0f) + ((1.0f - f3) * (intBitsToFloat / 2.0f));
                    double mo236toPx0680j_42 = density.mo236toPx0680j_4(-60.0f);
                    double mo236toPx0680j_43 = density.mo236toPx0680j_4(20.0f);
                    double mo236toPx0680j_44 = density.mo236toPx0680j_4(-60.0f);
                    double mo236toPx0680j_45 = density.mo236toPx0680j_4(20.0f);
                    double mo236toPx0680j_46 = density.mo236toPx0680j_4(-40.0f);
                    double mo236toPx0680j_47 = density.mo236toPx0680j_4(40.0f);
                    double mo236toPx0680j_48 = density.mo236toPx0680j_4(20.0f);
                    double mo236toPx0680j_49 = density.mo236toPx0680j_4(70.0f);
                    float mo236toPx0680j_410 = density.mo236toPx0680j_4(60.0f);
                    double d3 = mo236toPx0680j_49;
                    ArrayList arrayList = new ArrayList();
                    double d4 = intBitsToFloat2 / 2.0d;
                    double d5 = ((intBitsToFloat / 2.0d) - d4) + d4;
                    int i4 = 1;
                    int i5 = 0;
                    IntProgressionIterator it = new IntRange(0, ((int) (intBitsToFloat2 / mo236toPx0680j_4)) + 1, 1).iterator();
                    while (it.hasNext) {
                        float nextInt = it.nextInt() * mo236toPx0680j_4;
                        int i6 = i5;
                        float f5 = intBitsToFloat2 - nextInt;
                        float f6 = intBitsToFloat2;
                        float[] fArr2 = new float[i4];
                        fArr2[i6] = intBitsToFloat;
                        int min = ((int) (MathsKt.min(f5, fArr2) / mo236toPx0680j_4)) + i4;
                        float f7 = intBitsToFloat / min;
                        float f8 = (mo236toPx0680j_4 / 2.0f) + nextInt;
                        IntProgressionIterator intProgressionIterator = it;
                        ArrayList arrayList2 = arrayList;
                        IntProgressionIterator it2 = new IntRange(i6, min, 1).iterator();
                        while (it2.hasNext) {
                            IntProgressionIterator intProgressionIterator2 = it2;
                            double nextInt2 = (f7 / 2.0f) + (it2.nextInt() * f7);
                            double d6 = (nextInt2 - d5) / d5;
                            if (d6 > 0.0d) {
                                Random.Default.getClass();
                                d2 = mo236toPx0680j_45;
                                nextDouble = Random.defaultRandom.nextDouble(mo236toPx0680j_42, mo236toPx0680j_43);
                                d = nextInt2;
                            } else {
                                Random.Default.getClass();
                                d = nextInt2;
                                double d7 = mo236toPx0680j_45;
                                nextDouble = Random.defaultRandom.nextDouble(mo236toPx0680j_44, d7);
                                d2 = d7;
                            }
                            double d8 = d + nextDouble;
                            double d9 = mo236toPx0680j_42;
                            double sin = f5 * Math.sin(Math.acos(Math.abs(d6 / (f6 / intBitsToFloat))));
                            Random.Default.getClass();
                            AbstractPlatformRandom abstractPlatformRandom = Random.defaultRandom;
                            double nextDouble2 = abstractPlatformRandom.nextDouble(mo236toPx0680j_46, mo236toPx0680j_47) + (f8 - sin);
                            double d10 = mo236toPx0680j_46;
                            double d11 = mo236toPx0680j_48;
                            double d12 = mo236toPx0680j_47;
                            double d13 = d3;
                            float f9 = f8;
                            float nextDouble3 = (float) abstractPlatformRandom.nextDouble(d11, d13);
                            arrayList2.add(new Sparkle(((float) d8) - (nextDouble3 / 2.0f), (float) nextDouble2, nextDouble3, nextDouble3 * ((float) abstractPlatformRandom.nextDouble(0.1d, 1.9d)), Color.White, MathsKt.min(1.0f, nextDouble3 / mo236toPx0680j_410), (float) abstractPlatformRandom.nextDouble(0.7d, 0.95d), RecyclerView.DECELERATION_RATE, true));
                            it2 = intProgressionIterator2;
                            mo236toPx0680j_42 = d9;
                            mo236toPx0680j_47 = d12;
                            f5 = f5;
                            f8 = f9;
                            mo236toPx0680j_46 = d10;
                            mo236toPx0680j_48 = d11;
                            mo236toPx0680j_45 = d2;
                            d3 = d13;
                        }
                        i5 = 0;
                        intBitsToFloat2 = f6;
                        it = intProgressionIterator;
                        arrayList = arrayList2;
                        i4 = 1;
                    }
                    mutableState.setValue(arrayList);
                } else {
                    for (Sparkle sparkle : (List) mutableState.getValue()) {
                        float f10 = sparkle.lifespan;
                        float f11 = sparkle.x;
                        if (f10 > ((Number) animatable.getValue()).floatValue()) {
                            float f12 = sparkle.width;
                            float f13 = (f12 * 0.5f) + f11;
                            float f14 = sparkle.y;
                            float f15 = sparkle.height;
                            float f16 = (0.5f * f15) + f14;
                            AndroidPath Path = AndroidPath_androidKt.Path();
                            Path.moveTo(f11, f16);
                            Path.cubicTo(f13, f16, f13, f16, f13, sparkle.y);
                            Path.cubicTo(f13, f16, f13, f16, f11 + f12, f16);
                            Path.cubicTo(f13, f16, f13, f16, f13, f14 + f15);
                            Path.cubicTo(f13, f16, f13, f16, sparkle.x, f16);
                            Path.close();
                            DrawScope.m745drawPathLG529CI$default(drawScope, Path, sparkle.color, sparkle.alpha, null, 56);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 3:
                String str = (String) obj4;
                TextPaint textPaint = (TextPaint) obj2;
                State state = (State) obj3;
                LayoutNodeDrawScope layoutNodeDrawScope = (LayoutNodeDrawScope) obj;
                layoutNodeDrawScope.getClass();
                layoutNodeDrawScope.drawContent();
                CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.canvasDrawScope;
                Canvas canvas = canvasDrawScope.drawContext.getCanvas();
                float intBitsToFloat3 = Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() >> 32)) * 1.025f;
                float intBitsToFloat4 = Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) * 1.04f;
                float intBitsToFloat5 = (Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() >> 32)) - intBitsToFloat3) / 2.0f;
                float intBitsToFloat6 = (Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) - intBitsToFloat4) / 2.0f;
                Path path = new Path();
                Path.Direction direction = Path.Direction.CW;
                float f17 = this.f$2;
                path.addRoundRect(intBitsToFloat5, intBitsToFloat6, intBitsToFloat5 + intBitsToFloat3, intBitsToFloat6 + intBitsToFloat4, f17, f17, direction);
                PathMeasure pathMeasure = new PathMeasure(path, true);
                float length = pathMeasure.getLength();
                float[] fArr3 = {RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE};
                float[] fArr4 = {RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE};
                float[] fArr5 = new float[1];
                android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
                float floatValue2 = ((Number) state.getValue()).floatValue() % length;
                int length2 = str.length();
                int i7 = 0;
                while (i7 < length2) {
                    if (pathMeasure.getPosTan(floatValue2 % length, fArr3, fArr4)) {
                        f = f2;
                        fArr = fArr4;
                        c = c3;
                        c2 = c4;
                        float atan2 = (((float) Math.atan2(fArr4[c4], fArr[c3])) * 180.0f) / 3.1415927f;
                        nativeCanvas.save();
                        nativeCanvas.translate(fArr3[c], fArr3[c2]);
                        nativeCanvas.rotate(atan2);
                        int i8 = i7 + 1;
                        textPaint.getTextWidths(str, i7, i8, fArr5);
                        i = length2;
                        i2 = i7;
                        nativeCanvas.drawText(str, i2, i8, (-fArr5[c]) / f, RecyclerView.DECELERATION_RATE, (Paint) textPaint);
                        nativeCanvas.restore();
                    } else {
                        f = f2;
                        fArr = fArr4;
                        c = c3;
                        c2 = c4;
                        i = length2;
                        i2 = i7;
                    }
                    i7 = i2 + 1;
                    textPaint.getTextWidths(str, i2, i7, fArr5);
                    floatValue2 += fArr5[c];
                    if (floatValue2 - (((Number) state.getValue()).floatValue() % length) > length) {
                        return Unit.INSTANCE;
                    }
                    length2 = i;
                    f2 = f;
                    fArr4 = fArr;
                    c4 = c2;
                    c3 = c;
                }
                return Unit.INSTANCE;
            case 4:
                EngineSurfaceViewTarget engineSurfaceViewTarget = (EngineSurfaceViewTarget) obj4;
                Context context = (Context) obj;
                context.getClass();
                SurfaceView surfaceView = new SurfaceView(context);
                surfaceView.getHolder().setFormat(-1);
                surfaceView.getHolder().addCallback(engineSurfaceViewTarget);
                ((MutableState) obj2).setValue(engineSurfaceViewTarget);
                Timber.Forest forest = Timber.Forest;
                forest.tag("SwampGLEffect");
                forest.d("SurfaceView: using=" + f3 + "Hz", new Object[0]);
                ((MutableState) obj3).setValue(Float.valueOf(f3));
                return surfaceView;
            default:
                final PersonalizePaymentStickersViewModel personalizePaymentStickersViewModel = (PersonalizePaymentStickersViewModel) obj4;
                final Context context2 = (Context) obj3;
                final Function1 function12 = (Function1) obj2;
                LazyGridIntervalContent lazyGridIntervalContent = (LazyGridIntervalContent) obj;
                lazyGridIntervalContent.getClass();
                LazyGridIntervalContent.items$default(lazyGridIntervalContent, personalizePaymentStickersViewModel.stickers.size(), new UtilsKt$$ExternalSyntheticLambda0(personalizePaymentStickersViewModel, 16), null, new ComposableLambdaImpl(new Function4() { // from class: com.squareup.cash.payments.views.personalization.PersonalizePaymentStickersViewKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                        int intValue = ((Integer) obj6).intValue();
                        Composer composer = (Composer) obj7;
                        int intValue2 = ((Integer) obj8).intValue();
                        ((LazyGridItemScopeImpl) obj5).getClass();
                        if ((intValue2 & 48) == 0) {
                            intValue2 |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
                        }
                        GapComposer gapComposer = (GapComposer) composer;
                        if (gapComposer.shouldExecute(intValue2 & 1, (intValue2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                            ImageRequest.Builder builder = new ImageRequest.Builder(context2);
                            PersonalizePaymentStickersViewModel personalizePaymentStickersViewModel2 = personalizePaymentStickersViewModel;
                            builder.data = ((Sticker) personalizePaymentStickersViewModel2.stickers.get(intValue)).previewUrl;
                            float f18 = f3;
                            int i9 = (int) f18;
                            builder.sizeResolver = new RealSizeResolver(SizeKt.Size(i9, i9));
                            Extras.Key key = ImageRequests_androidKt.transitionFactoryKey;
                            builder.getExtras().set(ImageRequests_androidKt.transitionFactoryKey, new CrossfadeTransition.Factory(150));
                            AsyncImagePainter m1446rememberAsyncImagePainter19ie5dc = AsyncImageKt.m1446rememberAsyncImagePainter19ie5dc(0, 30, gapComposer, builder.build());
                            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                            Modifier m285size3ABfNKs = androidx.compose.foundation.layout.SizeKt.m285size3ABfNKs(SpacerKt.m298padding3ABfNKs(companion, 8.0f), f18);
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m285size3ABfNKs);
                            ComposeUiNode.Companion.getClass();
                            Function0 function02 = ComposeUiNode.Companion.Constructor;
                            if (gapComposer.applier == null) {
                                Updater.invalidApplier();
                                throw null;
                            }
                            gapComposer.startReusableNode();
                            if (gapComposer.inserting) {
                                gapComposer.createNode(function02);
                            } else {
                                gapComposer.useNode();
                            }
                            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                            if (((AsyncImagePainter.State) Updater.collectAsState(m1446rememberAsyncImagePainter19ie5dc.state, null, gapComposer, 1).getValue()) instanceof AsyncImagePainter.State.Success) {
                                gapComposer.startReplaceGroup(1202679085);
                                String str2 = ((Sticker) personalizePaymentStickersViewModel2.stickers.get(intValue)).accessibilityDescription;
                                if (str2 == null) {
                                    gapComposer.startReplaceGroup(1701369456);
                                    str2 = new MessageFormat(Room.stringResource(gapComposer, R.string.sticker_indexed_content_description)).format(new Object[]{Integer.valueOf(intValue + 1)});
                                    str2.getClass();
                                    gapComposer.end(false);
                                } else {
                                    gapComposer.startReplaceGroup(1701367100);
                                    gapComposer.end(false);
                                }
                                String str3 = str2;
                                Modifier fillMaxSize = androidx.compose.foundation.layout.SizeKt.fillMaxSize(companion, 1.0f);
                                Object rememberedValue = gapComposer.rememberedValue();
                                Object obj9 = Composer.Companion.Empty;
                                if (rememberedValue == obj9) {
                                    rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                                }
                                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
                                RippleNodeFactory m500rippleH2RKhps$default = RippleKt.m500rippleH2RKhps$default(48.0f, 4, 0L, false);
                                String stringResource = Room.stringResource(gapComposer, R.string.add_sticker_on_click_label);
                                Function1 function13 = function12;
                                boolean changed = ((intValue2 & 112) == 32) | gapComposer.changed(function13);
                                Object rememberedValue2 = gapComposer.rememberedValue();
                                if (changed || rememberedValue2 == obj9) {
                                    rememberedValue2 = new TabContentViewKt$$ExternalSyntheticLambda18(intValue, 10, function13);
                                    gapComposer.updateRememberedValue(rememberedValue2);
                                }
                                ImageKt.Image(m1446rememberAsyncImagePainter19ie5dc, str3, ImageKt.m182clickableO2vRcR0$default(fillMaxSize, mutableInteractionSourceImpl, m500rippleH2RKhps$default, false, stringResource, null, (Function0) rememberedValue2, 20), null, ContentScale.Companion.FillBounds, RecyclerView.DECELERATION_RATE, null, gapComposer, 24576, 104);
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(1203555331);
                                ProgressCircularKt.ProgressCircular(6, 0, gapComposer, androidx.compose.foundation.layout.SizeKt.m285size3ABfNKs(companion, 32.0f));
                                gapComposer.end(false);
                            }
                            gapComposer.end(true);
                        } else {
                            gapComposer.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }, true, 751719550), 12);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda8(float f, Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$2 = f;
        this.f$0 = obj;
        this.f$3 = obj2;
        this.f$4 = obj3;
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda8(GLSurfaceConfig$SurfaceView gLSurfaceConfig$SurfaceView, EngineSurfaceViewTarget engineSurfaceViewTarget, float f, MutableState mutableState, MutableState mutableState2) {
        this.$r8$classId = 4;
        this.f$0 = engineSurfaceViewTarget;
        this.f$2 = f;
        this.f$3 = mutableState;
        this.f$4 = mutableState2;
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda8(String str, TextPaint textPaint, float f, InfiniteTransition.TransitionAnimationState transitionAnimationState) {
        this.$r8$classId = 3;
        this.f$0 = str;
        this.f$3 = textPaint;
        this.f$2 = f;
        this.f$4 = transitionAnimationState;
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda8(ClosedFloatingPointRange closedFloatingPointRange, float f, Function1 function1, Function0 function0) {
        this.$r8$classId = 0;
        this.f$0 = closedFloatingPointRange;
        this.f$2 = f;
        this.f$3 = function1;
        this.f$4 = function0;
    }
}
