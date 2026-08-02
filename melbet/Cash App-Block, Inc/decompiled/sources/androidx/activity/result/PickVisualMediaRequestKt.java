package androidx.activity.result;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.icu.text.MessageFormat;
import androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia;
import androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.window.Api33Impl;
import androidx.media3.ui.DefaultTimeBar$$ExternalSyntheticLambda1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.local.views.LocalViewFactory$createUi$view$3$1$1$1;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.CombinedModifier$$ExternalSyntheticLambda0;
import app.cash.redwood.yoga.internal.Yoga$$ExternalSyntheticLambda7;
import coil3.compose.internal.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cardcustomizations.stampview.Stamp;
import com.squareup.cardcustomizations.stampview.StampMovingListener;
import com.squareup.cardcustomizations.stampview.StampState;
import com.squareup.cardcustomizations.stampview.StampsKt$$ExternalSyntheticLambda4;
import com.squareup.cardcustomizations.stampview.TransformedStamp;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.AlignmentLinesKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.work.views.you.WorkYouViewKt$$ExternalSyntheticLambda2;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes3.dex */
public abstract class PickVisualMediaRequestKt {
    public static volatile HandlerScheduledExecutorService sInstance;

    public static final void InviteSuccessToast(int i, Composer composer, Modifier modifier, String str, String str2) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(339353669);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed(str2) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.entries;
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f);
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.fillMaxWidth(modifier, 1.0f), m340RoundedCornerShape0680j_4), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape);
            Strings.getSizes(gapComposer).getClass();
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m178borderxT4_qwU(m177backgroundbw27NRU, 1.0f, Strings.getColors(gapComposer).semantic.border.subtle, m340RoundedCornerShape0680j_4), 16.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            HorizontalAlignmentLine horizontalAlignmentLine = AlignmentLinesKt.FirstLineCenter;
            Trace.m1191Iconww6aTOc(Icons.CheckFill24, (String) null, new WithAlignmentLineElement(horizontalAlignmentLine), 0L, gapComposer, 54, 8);
            WithAlignmentLineElement withAlignmentLineElement = new WithAlignmentLineElement(horizontalAlignmentLine);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, withAlignmentLineElement);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            String format2 = new MessageFormat(Room.stringResource(gapComposer, R.string.invitation_success_toast_title)).format(new Object[]{str});
            format2.getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, format2, (Map) null, (Function1) null, false);
            if (str2 == null) {
                gapComposer.startReplaceGroup(-150645981);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-150645980);
                Room.m1165Text25TpFw(2, 1, 0, 0, 1769472 | ((i2 >> 6) & 14), 0, 3986, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WorkYouViewKt$$ExternalSyntheticLambda2(modifier, str, str2, i, 5);
        }
    }

    public static PickVisualMediaRequest PickVisualMediaRequest$default() {
        int maxItems$activity = Api33Impl.getMaxItems$activity();
        Api33Impl.getMaxItems$activity();
        PickVisualMediaRequest pickVisualMediaRequest = new PickVisualMediaRequest();
        pickVisualMediaRequest.mediaType = ActivityResultContracts$PickVisualMedia.ImageAndVideo.INSTANCE;
        Api33Impl.getMaxItems$activity();
        pickVisualMediaRequest.mediaType = ActivityResultContracts$PickVisualMedia.ImageOnly.INSTANCE;
        pickVisualMediaRequest.maxItems = maxItems$activity;
        return pickVisualMediaRequest;
    }

    public static final void Stamp(Modifier modifier, StampState stampState, StampMovingListener stampMovingListener, Composer composer, int i) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = stampState.strokeWidth$delegate;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1121686174);
        int i2 = 4;
        int i3 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changedInstance(stampState) ? 32 : 16) | (gapComposer.changed(stampMovingListener) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            Object obj = rememberedValue;
            if (rememberedValue == neverEqualPolicy) {
                AndroidPaint Paint = ColorKt.Paint();
                Paint.setAntiAlias();
                Paint.m663setStylek9PVt8s(1);
                Paint.m662setStrokeJoinWw9F2mQ(1);
                Paint.m661setStrokeCapBeK7IIE(1);
                Paint.m659setColor8_81llA(((Color) stampState.strokeColor$delegate.getValue()).value);
                Paint.setStrokeWidth(((Number) parcelableSnapshotMutableState.getValue()).floatValue());
                gapComposer.updateRememberedValue(Paint);
                obj = Paint;
            }
            Paint paint = (Paint) obj;
            Object rememberedValue2 = gapComposer.rememberedValue();
            Object obj2 = rememberedValue2;
            if (rememberedValue2 == neverEqualPolicy) {
                AndroidPaint Paint2 = ColorKt.Paint();
                Paint2.setAntiAlias();
                Paint2.m663setStylek9PVt8s(1);
                Paint2.m662setStrokeJoinWw9F2mQ(1);
                Paint2.m661setStrokeCapBeK7IIE(1);
                Paint2.m659setColor8_81llA(((Color) stampState.offClipStrokeColor$delegate.getValue()).value);
                Paint2.setStrokeWidth(((Number) parcelableSnapshotMutableState.getValue()).floatValue());
                gapComposer.updateRememberedValue(Paint2);
                obj2 = Paint2;
            }
            Paint paint2 = (Paint) obj2;
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            boolean changedInstance = gapComposer.changedInstance(stampState) | gapComposer.changed(density);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new CombinedModifier$$ExternalSyntheticLambda0(14, stampState, density);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Modifier onPlaced = RulerKt.onPlaced(modifier, (Function1) rememberedValue3);
            if (((Boolean) stampState.isEnabled$delegate.getValue()).booleanValue()) {
                gapComposer.startReplaceGroup(1309164602);
                Unit unit = Unit.INSTANCE;
                boolean changedInstance2 = gapComposer.changedInstance(stampState) | ((i3 & 896) == 256);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new LocalViewFactory$createUi$view$3$1$1$1(i2, stampState, stampMovingListener);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                onPlaced = SuspendingPointerInputFilterKt.pointerInput(onPlaced, unit, (PointerInputEventHandler) rememberedValue4);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1309912260);
                gapComposer.end(false);
            }
            boolean changedInstance3 = gapComposer.changedInstance(stampState) | gapComposer.changedInstance(paint2) | gapComposer.changedInstance(paint);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new UtilsKt$$ExternalSyntheticLambda0(12, stampState, paint2, paint);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            CanvasKt.Canvas(0, gapComposer, onPlaced, (Function1) rememberedValue5);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Yoga$$ExternalSyntheticLambda7(modifier, stampState, stampMovingListener, i, 12);
        }
    }

    public static final StampState rememberStampState(Function0 function0, Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new StampState(function0 != null ? (List) function0.invoke() : null);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (StampState) rememberedValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00de, code lost:
    
        if (r12 > r4) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void snapBackToAllowedSize(final TransformedStamp transformedStamp, Rect rect, int i, boolean z, Function1 function1) {
        PointF pointF;
        transformedStamp.getClass();
        ValueAnimator valueAnimator = new ValueAnimator();
        RectF bounds = transformedStamp.bounds();
        int i2 = transformedStamp.minHeight;
        Matrix matrix = transformedStamp.transform;
        matrix.getClass();
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float f = fArr[0];
        double abs = f / Math.abs(f);
        float f2 = fArr[0];
        float f3 = fArr[1];
        double sqrt = Math.sqrt((f3 * f3) + (f2 * f2)) * abs;
        float f4 = fArr[4];
        double abs2 = f4 / Math.abs(f4);
        float f5 = fArr[3];
        float f6 = fArr[4];
        final float abs3 = Math.abs(new PointF((float) sqrt, (float) (Math.sqrt((f6 * f6) + (f5 * f5)) * abs2)).x);
        Stamp stamp = transformedStamp.renderedStamp;
        float width = ((RectF) stamp.pathBounds$delegate.getValue()).width();
        Lazy lazy = stamp.pathBounds$delegate;
        if (abs3 > i / Math.max(width, ((RectF) lazy.getValue()).height()) || bounds.height() < i2) {
            if (bounds.height() < i2) {
                i = i2;
            }
            final float max = i / Math.max(((RectF) lazy.getValue()).width(), ((RectF) lazy.getValue()).height());
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.squareup.cardcustomizations.stampview.StampsKt$$ExternalSyntheticLambda3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    valueAnimator2.getClass();
                    float animatedFraction = (valueAnimator2.getAnimatedFraction() * max) + ((1.0f - valueAnimator2.getAnimatedFraction()) * abs3);
                    TransformedStamp transformedStamp2 = transformedStamp;
                    Matrix matrix2 = transformedStamp2.transform;
                    PointF pointF2 = new PointF(animatedFraction, animatedFraction);
                    RectF bounds2 = transformedStamp2.bounds();
                    bounds2.getClass();
                    PointF pointF3 = new PointF(bounds2.centerX(), bounds2.centerY());
                    matrix2.getClass();
                    float[] fArr2 = {(float) (Math.cos(r3) * r6), (float) (Math.sin(r3) * r8), (pointF3.x - r5[0]) + r1, (float) (Math.sin(r3) * r9), (float) (Math.cos(r3) * r1), (pointF3.y - r5[1]) + r2, 0.0f, 0.0f, 0.0f};
                    matrix2.getValues(fArr2);
                    double atan2 = Math.atan2(fArr2[3], fArr2[4]);
                    double d = pointF2.x;
                    double d2 = -pointF2.x;
                    double d3 = pointF2.y;
                    double d4 = pointF2.y;
                    Matrix matrix3 = new Matrix();
                    matrix2.invert(matrix3);
                    float[] fArr3 = {pointF3.x, pointF3.y};
                    matrix3.mapPoints(fArr3);
                    matrix2.setValues(fArr2);
                    matrix2.mapPoints(fArr3);
                    float f7 = fArr2[2];
                    float f8 = fArr2[5];
                    matrix2.setValues(fArr2);
                }
            });
            PointF pointF2 = new PointF(bounds.centerX(), bounds.centerY());
            RectF rectF = new RectF(rect);
            if (rectF.contains(pointF2.x, pointF2.y)) {
                pointF = pointF2;
            } else {
                float f7 = pointF2.x;
                float f8 = pointF2.y;
                float f9 = rectF.left;
                if (f7 >= f9) {
                    f9 = rectF.right;
                }
                f7 = f9;
                float f10 = rectF.top;
                if (f8 < f10) {
                    f8 = f10;
                } else {
                    float f11 = rectF.bottom;
                    if (f8 > f11) {
                        f8 = f11;
                    }
                }
                pointF = new PointF(f7, f8);
            }
            if (!pointF2.equals(pointF) && z) {
                PointF pointF3 = new PointF(pointF.x, pointF.y);
                pointF3.offset(-pointF2.x, -pointF2.y);
                valueAnimator.setFloatValues(new float[0]);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ref$ObjectRef.element = new PointF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
                valueAnimator.addUpdateListener(new StampsKt$$ExternalSyntheticLambda4(0, pointF3, ref$ObjectRef, transformedStamp));
            }
            valueAnimator.addUpdateListener(new DefaultTimeBar$$ExternalSyntheticLambda1(function1, 12));
            valueAnimator.setFloatValues(RecyclerView.DECELERATION_RATE, 1.0f);
            valueAnimator.setDuration(250L);
            valueAnimator.start();
        }
    }

    public static ArrayList splitByPipes(CharSequence charSequence) {
        charSequence.getClass();
        ArrayList arrayList = new ArrayList();
        int length = charSequence.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i2) == '|') {
                int i3 = i2 - 1;
                if (i3 < 0) {
                    i3 = 0;
                }
                if (charSequence.charAt(i3) != '\\') {
                    arrayList.add(charSequence.subSequence(i, i2).toString());
                    i = i2 + 1;
                }
            }
        }
        arrayList.add(charSequence.subSequence(i, charSequence.length()).toString());
        return arrayList;
    }
}
