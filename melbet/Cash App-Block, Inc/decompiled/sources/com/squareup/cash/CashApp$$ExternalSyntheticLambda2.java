package com.squareup.cash;

import android.content.ClipDescription;
import android.graphics.Bitmap;
import androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$lambda$1$0$$inlined$onDispose$2;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.BorderCache;
import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda1;
import androidx.compose.foundation.BorderModifierNode;
import androidx.compose.foundation.ClickableKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.content.MediaType;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.contextmenu.modifier.AddTextContextMenuDataComponentsWithContextNode;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuModifierKt;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider;
import androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda1;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.CompositionImpl;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.compose.runtime.SingleSubscriptionSnapshotFlowManager;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.Outline$Generic;
import androidx.compose.ui.graphics.Outline$Rectangle;
import androidx.compose.ui.graphics.Outline$Rounded;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.MultiParagraph$$ExternalSyntheticLambda0;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.font.TypefaceRequest;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.datastore.core.SimpleActor;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.DatabaseConfiguration;
import androidx.room.RoomDatabase;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidCursor;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.ComponentRegistry;
import coil3.Extras;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.appmessages.db.InAppNotificationMessage;
import com.squareup.cash.appmessages.db.InAppNotificationMessageQueries$firstMessage$2;
import com.squareup.cash.appmessages.db.InlineMessageQueries$inlineMessagesByPriority$2;
import com.squareup.cash.appmessages.db.PopupMessageQueries$popupMessagesByPriority$2;
import com.squareup.cash.appmessages.db.SheetMessageQueries$sheetMessagesByPriority$2;
import com.squareup.cash.appmessages.db.TooltipMessageQueries$firstMessage$2;
import com.squareup.cash.arcade.components.input.InputFieldKt;
import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.cash.db.StorageLinkQueries$SelectByIdQuery;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.observability.backend.real.WeakThrowableScribe$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.messagingplatformcommon.app.Animation;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageAction;
import com.squareup.protos.cash.messagingplatformcommon.app.Image;
import com.squareup.protos.cash.messagingplatformcommon.app.InlineMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.PopupMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.TooltipMessage;
import com.squareup.protos.cash.messagingplatformcommon.common.MessageType;
import com.squareup.protos.cash.messagingplatformcommon.placements.Placement;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.squareup.wire.GrpcMethod;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import java.util.Collection;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.AsyncTimeout;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final /* synthetic */ class CashApp$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ CashApp$$ExternalSyntheticLambda2(LocalTabContentQueries localTabContentQueries) {
        this.$r8$classId = 24;
        InAppNotificationMessageQueries$firstMessage$2 inAppNotificationMessageQueries$firstMessage$2 = InAppNotificationMessageQueries$firstMessage$2.INSTANCE;
        this.f$0 = localTabContentQueries;
    }

    /* JADX WARN: Code restructure failed: missing block: B:258:0x089b, code lost:
    
        if (r4 != false) goto L270;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:261:0x08b9  */
    /* JADX WARN: Type inference failed for: r3v37, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v38, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v39, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v40, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v57, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v58, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v59, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v70, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v71, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v72, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v73, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v39, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r8v26, types: [byte[], java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Unit onCreate$lambda$3;
        float f;
        int i;
        BlendModeColorFilter blendModeColorFilter;
        AndroidImageBitmap androidImageBitmap;
        Canvas canvas;
        Brush brush;
        CanvasDrawScope canvasDrawScope;
        GrpcMethod grpcMethod;
        float f2;
        float f3;
        long m3999getSizeNHjbRc;
        String str;
        Integer num;
        Instant instant;
        String str2;
        Placement placement;
        String str3;
        TooltipMessage.ArrowPosition arrowPosition;
        String str4;
        AppMessageAction appMessageAction;
        String str5;
        Integer num2;
        Instant instant2;
        int i2 = 10;
        int i3 = 6;
        int i4 = 4;
        int i5 = 2;
        int i6 = 1;
        r3 = true;
        boolean z = true;
        i6 = 1;
        int i7 = 0;
        switch (this.$r8$classId) {
            case 0:
                onCreate$lambda$3 = CashApp.onCreate$lambda$3((CashApp) this.f$0, (CoroutineScope) obj);
                return onCreate$lambda$3;
            case 1:
                return new ReportDrawnKt$ReportDrawnWhen$lambda$1$0$$inlined$onDispose$2((Transition) this.f$0, i6);
            case 2:
                BorderModifierNode borderModifierNode = (BorderModifierNode) this.f$0;
                CacheDrawScope cacheDrawScope = (CacheDrawScope) obj;
                if (cacheDrawScope.getDensity() * borderModifierNode.width < RecyclerView.DECELERATION_RATE || Size.m642getMinDimensionimpl(cacheDrawScope.cacheParams.mo587getSizeNHjbRc()) <= RecyclerView.DECELERATION_RATE) {
                    return cacheDrawScope.onDrawWithContent(new BorderKt$$ExternalSyntheticLambda1(i7));
                }
                final float min = Math.min(Dp.m1037equalsimpl0(borderModifierNode.width, RecyclerView.DECELERATION_RATE) ? 1.0f : (float) Math.ceil(cacheDrawScope.getDensity() * borderModifierNode.width), (float) Math.ceil(Size.m642getMinDimensionimpl(cacheDrawScope.cacheParams.mo587getSizeNHjbRc()) / 2.0f));
                final float f4 = min / 2.0f;
                final long floatToRawIntBits = (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f4) & BodyPartID.bodyIdMax);
                final long floatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (cacheDrawScope.cacheParams.mo587getSizeNHjbRc() >> 32)) - min) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (cacheDrawScope.cacheParams.mo587getSizeNHjbRc() & BodyPartID.bodyIdMax)) - min) & BodyPartID.bodyIdMax);
                float f5 = min * 2.0f;
                boolean z2 = f5 > Size.m642getMinDimensionimpl(cacheDrawScope.cacheParams.mo587getSizeNHjbRc());
                ColorKt mo175createOutlinePq9zytI = borderModifierNode.shape.mo175createOutlinePq9zytI(cacheDrawScope.cacheParams.mo587getSizeNHjbRc(), cacheDrawScope.cacheParams.getLayoutDirection(), cacheDrawScope);
                if (!(mo175createOutlinePq9zytI instanceof Outline$Generic)) {
                    if (!(mo175createOutlinePq9zytI instanceof Outline$Rounded)) {
                        boolean z3 = z2;
                        if (!(mo175createOutlinePq9zytI instanceof Outline$Rectangle)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Brush brush2 = borderModifierNode.brush;
                        if (z3) {
                            floatToRawIntBits = 0;
                        }
                        long j = floatToRawIntBits;
                        if (z3) {
                            floatToRawIntBits2 = cacheDrawScope.cacheParams.mo587getSizeNHjbRc();
                        }
                        return cacheDrawScope.onDrawWithContent(new BorderKt$$ExternalSyntheticLambda0(brush2, j, floatToRawIntBits2, z3 ? Fill.INSTANCE : new Stroke(min, RecyclerView.DECELERATION_RATE, 0, 0, null, 30)));
                    }
                    final Brush brush3 = borderModifierNode.brush;
                    RoundRect roundRect = ((Outline$Rounded) mo175createOutlinePq9zytI).roundRect;
                    if (Strings.isSimple(roundRect)) {
                        final long j2 = roundRect.topLeftCornerRadius;
                        final Stroke stroke = new Stroke(min, RecyclerView.DECELERATION_RATE, 0, 0, null, 30);
                        final boolean z4 = z2;
                        return cacheDrawScope.onDrawWithContent(new Function1() { // from class: androidx.compose.foundation.BorderModifierNode$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                long j3;
                                LayoutNodeDrawScope layoutNodeDrawScope = (LayoutNodeDrawScope) obj2;
                                layoutNodeDrawScope.drawContent();
                                CanvasDrawScope canvasDrawScope2 = layoutNodeDrawScope.canvasDrawScope;
                                boolean z5 = z4;
                                Brush brush4 = brush3;
                                long j4 = j2;
                                if (z5) {
                                    DrawScope.m748drawRoundRectZuiqVtQ$default(layoutNodeDrawScope, brush4, 0L, 0L, j4, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE);
                                } else {
                                    float intBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32));
                                    float f6 = f4;
                                    if (intBitsToFloat < f6) {
                                        float intBitsToFloat2 = Float.intBitsToFloat((int) (canvasDrawScope2.mo753getSizeNHjbRc() >> 32));
                                        float f7 = min;
                                        float f8 = intBitsToFloat2 - f7;
                                        float intBitsToFloat3 = Float.intBitsToFloat((int) (canvasDrawScope2.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) - f7;
                                        GrpcMethod grpcMethod2 = canvasDrawScope2.drawContext;
                                        long m3999getSizeNHjbRc2 = grpcMethod2.m3999getSizeNHjbRc();
                                        grpcMethod2.getCanvas().save();
                                        try {
                                            ((Extras.Key) grpcMethod2.path).m1435clipRectN_I0leg(f7, f7, f8, intBitsToFloat3, 0);
                                            j3 = m3999getSizeNHjbRc2;
                                            try {
                                                DrawScope.m748drawRoundRectZuiqVtQ$default(layoutNodeDrawScope, brush4, 0L, 0L, j4, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE);
                                                Recorder$$ExternalSyntheticOutline2.m(grpcMethod2, j3);
                                            } catch (Throwable th) {
                                                th = th;
                                                Recorder$$ExternalSyntheticOutline2.m(grpcMethod2, j3);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            j3 = m3999getSizeNHjbRc2;
                                        }
                                    } else {
                                        DrawScope.m748drawRoundRectZuiqVtQ$default(layoutNodeDrawScope, brush4, floatToRawIntBits, floatToRawIntBits2, ImageKt.m187shrinkKibmq7A(j4, f6), stroke, EnumC0170g.SDK_ASSET_ICON_INCOME_VALUE);
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    }
                    boolean z5 = z2;
                    if (borderModifierNode.borderCache == null) {
                        borderModifierNode.borderCache = new BorderCache();
                    }
                    BorderCache borderCache = borderModifierNode.borderCache;
                    borderCache.getClass();
                    AndroidPath obtainPath = borderCache.obtainPath();
                    obtainPath.reset();
                    AndroidPath.addRoundRect$default(obtainPath, roundRect);
                    if (!z5) {
                        AndroidPath Path = AndroidPath_androidKt.Path();
                        AndroidPath.addRoundRect$default(Path, new RoundRect(min, min, roundRect.getWidth() - min, roundRect.getHeight() - min, ImageKt.m187shrinkKibmq7A(roundRect.topLeftCornerRadius, min), ImageKt.m187shrinkKibmq7A(roundRect.topRightCornerRadius, min), ImageKt.m187shrinkKibmq7A(roundRect.bottomRightCornerRadius, min), ImageKt.m187shrinkKibmq7A(roundRect.bottomLeftCornerRadius, min)));
                        obtainPath.m665opN5in7k0(obtainPath, Path, 0);
                    }
                    return cacheDrawScope.onDrawWithContent(new Recomposer$$ExternalSyntheticLambda4(i3, obtainPath, brush3));
                }
                Brush brush4 = borderModifierNode.brush;
                Outline$Generic outline$Generic = (Outline$Generic) mo175createOutlinePq9zytI;
                AndroidPath androidPath = outline$Generic.path;
                if (z2) {
                    return cacheDrawScope.onDrawWithContent(new ClickableKt$$ExternalSyntheticLambda0(13, outline$Generic, brush4));
                }
                if (brush4 instanceof SolidColor) {
                    long m675copywmQWz5c$default = Color.m675copywmQWz5c$default(1.0f, ((SolidColor) brush4).value, 14);
                    f = 1.0f;
                    i = 1;
                    blendModeColorFilter = new BlendModeColorFilter(m675copywmQWz5c$default, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(m675copywmQWz5c$default), ColorKt.m693toAndroidBlendModes9anfk8(5)));
                } else {
                    f = 1.0f;
                    i = 0;
                    blendModeColorFilter = null;
                }
                Rect bounds = androidPath.getBounds();
                float f6 = bounds.top;
                float f7 = bounds.left;
                if (borderModifierNode.borderCache == null) {
                    borderModifierNode.borderCache = new BorderCache();
                }
                BorderCache borderCache2 = borderModifierNode.borderCache;
                borderCache2.getClass();
                AndroidPath obtainPath2 = borderCache2.obtainPath();
                obtainPath2.reset();
                AndroidPath.addRect$default(obtainPath2, bounds);
                obtainPath2.m665opN5in7k0(obtainPath2, androidPath, 0);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                long ceil = (((int) Math.ceil(bounds.right - f7)) << 32) | (((int) Math.ceil(bounds.bottom - f6)) & BodyPartID.bodyIdMax);
                BorderCache borderCache3 = borderModifierNode.borderCache;
                borderCache3.getClass();
                androidImageBitmap = borderCache3.imageBitmap;
                canvas = borderCache3.canvas;
                ImageBitmapConfig imageBitmapConfig = androidImageBitmap != null ? new ImageBitmapConfig(androidImageBitmap.m655getConfig_sVssgQ()) : null;
                if (imageBitmapConfig == null || imageBitmapConfig.value != 0) {
                    ImageBitmapConfig imageBitmapConfig2 = androidImageBitmap != null ? new ImageBitmapConfig(androidImageBitmap.m655getConfig_sVssgQ()) : null;
                    if (imageBitmapConfig2 == null || i != imageBitmapConfig2.value) {
                        i6 = 0;
                    }
                }
                try {
                    try {
                        if (androidImageBitmap != null && canvas != null) {
                            float intBitsToFloat = Float.intBitsToFloat((int) (cacheDrawScope.cacheParams.mo587getSizeNHjbRc() >> 32));
                            Bitmap bitmap = androidImageBitmap.bitmap;
                            if (intBitsToFloat <= bitmap.getWidth()) {
                                brush = brush4;
                                int i8 = i6;
                                Canvas canvas2 = canvas;
                                if (Float.intBitsToFloat((int) (cacheDrawScope.cacheParams.mo587getSizeNHjbRc() & BodyPartID.bodyIdMax)) <= bitmap.getHeight()) {
                                }
                                androidImageBitmap = ColorKt.m683ImageBitmapx__hDU$default((int) (ceil >> 32), (int) (ceil & BodyPartID.bodyIdMax), i);
                                borderCache3.imageBitmap = androidImageBitmap;
                                AndroidCanvas Canvas = ColorKt.Canvas(androidImageBitmap);
                                borderCache3.canvas = Canvas;
                                canvas2 = Canvas;
                                canvasDrawScope = borderCache3.canvasDrawScope;
                                if (canvasDrawScope == null) {
                                    canvasDrawScope = new CanvasDrawScope();
                                    borderCache3.canvasDrawScope = canvasDrawScope;
                                }
                                grpcMethod = canvasDrawScope.drawContext;
                                CanvasDrawScope.DrawParams drawParams = canvasDrawScope.drawParams;
                                long m3991toSizeozmzZPI = Countries.m3991toSizeozmzZPI(ceil);
                                LayoutDirection layoutDirection = cacheDrawScope.cacheParams.getLayoutDirection();
                                CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
                                Density density = drawParams.density;
                                LayoutDirection layoutDirection2 = drawParams.layoutDirection;
                                Canvas canvas3 = drawParams.canvas;
                                long j3 = drawParams.size;
                                drawParams.density = cacheDrawScope;
                                drawParams.layoutDirection = layoutDirection;
                                drawParams.canvas = canvas2;
                                drawParams.size = m3991toSizeozmzZPI;
                                AndroidCanvas androidCanvas = (AndroidCanvas) canvas2;
                                androidCanvas.save();
                                DrawScope.m747drawRectnJ9OG0$default(canvasDrawScope2, Color.Black, 0L, m3991toSizeozmzZPI, RecyclerView.DECELERATION_RATE, null, null, 0, 58);
                                f2 = -f7;
                                f3 = -f6;
                                ((Extras.Key) grpcMethod.path).translate(f2, f3);
                                Brush brush5 = brush;
                                DrawScope.m744drawPathGBMwjPU$default(canvasDrawScope2, outline$Generic.path, brush5, RecyclerView.DECELERATION_RATE, new Stroke(f5, RecyclerView.DECELERATION_RATE, 0, 0, null, 30), 52);
                                float intBitsToFloat2 = (Float.intBitsToFloat((int) (canvasDrawScope2.mo753getSizeNHjbRc() >> 32)) + f) / Float.intBitsToFloat((int) (canvasDrawScope2.mo753getSizeNHjbRc() >> 32));
                                float intBitsToFloat3 = (Float.intBitsToFloat((int) (canvasDrawScope2.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) + f) / Float.intBitsToFloat((int) (canvasDrawScope2.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax));
                                long mo752getCenterF1C5BW0 = canvasDrawScope2.mo752getCenterF1C5BW0();
                                AndroidImageBitmap androidImageBitmap2 = androidImageBitmap;
                                m3999getSizeNHjbRc = grpcMethod.m3999getSizeNHjbRc();
                                grpcMethod.getCanvas().save();
                                ((Extras.Key) grpcMethod.path).m1437scale0AR0LA0(intBitsToFloat2, intBitsToFloat3, mo752getCenterF1C5BW0);
                                DrawScope.m744drawPathGBMwjPU$default(canvasDrawScope2, obtainPath2, brush5, RecyclerView.DECELERATION_RATE, null, 28);
                                ((Extras.Key) grpcMethod.path).translate(-f2, -f3);
                                androidCanvas.restore();
                                drawParams.density = density;
                                drawParams.layoutDirection = layoutDirection2;
                                drawParams.canvas = canvas3;
                                drawParams.size = j3;
                                androidImageBitmap2.bitmap.prepareToDraw();
                                ref$ObjectRef.element = androidImageBitmap2;
                                return cacheDrawScope.onDrawWithContent(new MultiParagraph$$ExternalSyntheticLambda0(bounds, ref$ObjectRef, ceil, blendModeColorFilter, 1));
                            }
                        }
                        ((Extras.Key) grpcMethod.path).m1437scale0AR0LA0(intBitsToFloat2, intBitsToFloat3, mo752getCenterF1C5BW0);
                        DrawScope.m744drawPathGBMwjPU$default(canvasDrawScope2, obtainPath2, brush5, RecyclerView.DECELERATION_RATE, null, 28);
                        ((Extras.Key) grpcMethod.path).translate(-f2, -f3);
                        androidCanvas.restore();
                        drawParams.density = density;
                        drawParams.layoutDirection = layoutDirection2;
                        drawParams.canvas = canvas3;
                        drawParams.size = j3;
                        androidImageBitmap2.bitmap.prepareToDraw();
                        ref$ObjectRef.element = androidImageBitmap2;
                        return cacheDrawScope.onDrawWithContent(new MultiParagraph$$ExternalSyntheticLambda0(bounds, ref$ObjectRef, ceil, blendModeColorFilter, 1));
                    } finally {
                        grpcMethod.getCanvas().restore();
                        grpcMethod.m4000setSizeuvyYCjk(m3999getSizeNHjbRc);
                    }
                    Brush brush52 = brush;
                    DrawScope.m744drawPathGBMwjPU$default(canvasDrawScope2, outline$Generic.path, brush52, RecyclerView.DECELERATION_RATE, new Stroke(f5, RecyclerView.DECELERATION_RATE, 0, 0, null, 30), 52);
                    float intBitsToFloat22 = (Float.intBitsToFloat((int) (canvasDrawScope2.mo753getSizeNHjbRc() >> 32)) + f) / Float.intBitsToFloat((int) (canvasDrawScope2.mo753getSizeNHjbRc() >> 32));
                    float intBitsToFloat32 = (Float.intBitsToFloat((int) (canvasDrawScope2.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) + f) / Float.intBitsToFloat((int) (canvasDrawScope2.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax));
                    long mo752getCenterF1C5BW02 = canvasDrawScope2.mo752getCenterF1C5BW0();
                    AndroidImageBitmap androidImageBitmap22 = androidImageBitmap;
                    m3999getSizeNHjbRc = grpcMethod.m3999getSizeNHjbRc();
                    grpcMethod.getCanvas().save();
                } catch (Throwable th) {
                    ((Extras.Key) grpcMethod.path).translate(-f2, -f3);
                    throw th;
                }
                brush = brush4;
                androidImageBitmap = ColorKt.m683ImageBitmapx__hDU$default((int) (ceil >> 32), (int) (ceil & BodyPartID.bodyIdMax), i);
                borderCache3.imageBitmap = androidImageBitmap;
                AndroidCanvas Canvas2 = ColorKt.Canvas(androidImageBitmap);
                borderCache3.canvas = Canvas2;
                canvas2 = Canvas2;
                canvasDrawScope = borderCache3.canvasDrawScope;
                if (canvasDrawScope == null) {
                }
                grpcMethod = canvasDrawScope.drawContext;
                CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.drawParams;
                long m3991toSizeozmzZPI2 = Countries.m3991toSizeozmzZPI(ceil);
                LayoutDirection layoutDirection3 = cacheDrawScope.cacheParams.getLayoutDirection();
                CanvasDrawScope canvasDrawScope22 = canvasDrawScope;
                Density density2 = drawParams2.density;
                LayoutDirection layoutDirection22 = drawParams2.layoutDirection;
                Canvas canvas32 = drawParams2.canvas;
                long j32 = drawParams2.size;
                drawParams2.density = cacheDrawScope;
                drawParams2.layoutDirection = layoutDirection3;
                drawParams2.canvas = canvas2;
                drawParams2.size = m3991toSizeozmzZPI2;
                AndroidCanvas androidCanvas2 = (AndroidCanvas) canvas2;
                androidCanvas2.save();
                DrawScope.m747drawRectnJ9OG0$default(canvasDrawScope22, Color.Black, 0L, m3991toSizeozmzZPI2, RecyclerView.DECELERATION_RATE, null, null, 0, 58);
                f2 = -f7;
                f3 = -f6;
                ((Extras.Key) grpcMethod.path).translate(f2, f3);
                break;
            case 3:
                ScrollState scrollState = (ScrollState) this.f$0;
                float floatValue = ((Float) obj).floatValue();
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = scrollState.value$delegate;
                float intValue = parcelableSnapshotMutableIntState.getIntValue() + floatValue + scrollState.accumulator;
                float coerceIn = RangesKt___RangesKt.coerceIn(intValue, RecyclerView.DECELERATION_RATE, scrollState._maxValueState.getIntValue());
                boolean z6 = intValue == coerceIn;
                float intValue2 = coerceIn - parcelableSnapshotMutableIntState.getIntValue();
                int round = Math.round(intValue2);
                parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() + round);
                scrollState.accumulator = intValue2 - round;
                if (!z6) {
                    floatValue = intValue2;
                }
                return Float.valueOf(floatValue);
            case 4:
                ScrollingLogic scrollingLogic = (ScrollingLogic) this.f$0;
                return new Offset(scrollingLogic.m245performScroll3eAAhYA(scrollingLogic.outerStateScope, ((Offset) obj).packedValue, scrollingLogic.latestScrollSource));
            case 5:
                PaddingValues paddingValues = (PaddingValues) this.f$0;
                InspectorInfo inspectorInfo = (InspectorInfo) obj;
                inspectorInfo.setName("padding");
                inspectorInfo.getProperties().set(paddingValues, "paddingValues");
                return Unit.INSTANCE;
            case 6:
                return new ReportDrawnKt$ReportDrawnWhen$lambda$1$0$$inlined$onDispose$2((TextFieldSelectionState) this.f$0, i5);
            case 7:
                AddTextContextMenuDataComponentsWithContextNode addTextContextMenuDataComponentsWithContextNode = (AddTextContextMenuDataComponentsWithContextNode) this.f$0;
                addTextContextMenuDataComponentsWithContextNode.builder.invoke((TextContextMenuBuilderScope) obj, DepthSortedSetKt.currentValueOf(addTextContextMenuDataComponentsWithContextNode, AndroidCompositionLocals_androidKt.LocalContext));
                return Unit.INSTANCE;
            case 8:
                return new ReportDrawnKt$ReportDrawnWhen$lambda$1$0$$inlined$onDispose$2((BasicTextContextMenuProvider) this.f$0, i4);
            case 9:
                TextFieldCoreModifierNode textFieldCoreModifierNode = (TextFieldCoreModifierNode) this.f$0;
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                Rect rect = (Rect) textFieldCoreModifierNode.textFieldSelectionState.derivedVisibleContentBounds$delegate.getValue();
                if (rect == null) {
                    rect = Rect.Zero;
                }
                LayoutCoordinates textLayoutNodeCoordinates = textFieldCoreModifierNode.textLayoutState.getTextLayoutNodeCoordinates();
                if (textLayoutNodeCoordinates != null) {
                    return TextContextMenuModifierKt.translateRootToDestination(rect, textLayoutNodeCoordinates, layoutCoordinates);
                }
                InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Required value was null.");
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
                return null;
            case 10:
                TextFieldDecoratorModifierNode$$ExternalSyntheticLambda1 textFieldDecoratorModifierNode$$ExternalSyntheticLambda1 = (TextFieldDecoratorModifierNode$$ExternalSyntheticLambda1) this.f$0;
                ClipDescription clipDescription = DragAndDrop_androidKt.toAndroidDragEvent((DragAndDropEvent) obj).getClipDescription();
                Iterable<MediaType> iterable = (Iterable) textFieldDecoratorModifierNode$$ExternalSyntheticLambda1.invoke();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (MediaType mediaType : iterable) {
                        if (!Intrinsics.areEqual(mediaType, MediaType.All) && (clipDescription == null || !clipDescription.hasMimeType(mediaType.getRepresentation()))) {
                        }
                        return Boolean.valueOf(z);
                        break;
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 11:
                ((CompositionImpl) this.f$0).recordReadOf(obj);
                return Unit.INSTANCE;
            case 12:
                Recomposer recomposer = (Recomposer) this.f$0;
                Throwable th2 = (Throwable) obj;
                CancellationException CancellationException = JobKt.CancellationException("Recomposer effect job completed", th2);
                synchronized (recomposer.stateLock) {
                    try {
                        Job job = recomposer.runnerJob;
                        if (job != null) {
                            StateFlowImpl stateFlowImpl = recomposer._state;
                            Recomposer.State state = Recomposer.State.ShuttingDown;
                            stateFlowImpl.getClass();
                            stateFlowImpl.updateState(null, state);
                            job.cancel(CancellationException);
                            recomposer.workContinuation = null;
                            job.invokeOnCompletion(new Recomposer$$ExternalSyntheticLambda4(i2, recomposer, th2));
                        } else {
                            recomposer.closeCause = CancellationException;
                            StateFlowImpl stateFlowImpl2 = recomposer._state;
                            Recomposer.State state2 = Recomposer.State.ShutDown;
                            stateFlowImpl2.getClass();
                            stateFlowImpl2.updateState(null, state2);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return Unit.INSTANCE;
            case 13:
                SingleSubscriptionSnapshotFlowManager singleSubscriptionSnapshotFlowManager = (SingleSubscriptionSnapshotFlowManager) this.f$0;
                SendChannel sendChannel = singleSubscriptionSnapshotFlowManager.subscribedChannel;
                sendChannel.getClass();
                if (!Intrinsics.areEqual(singleSubscriptionSnapshotFlowManager.subscribedChannel, sendChannel)) {
                    PreconditionsKt.throwIllegalStateException("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                MutableScatterSet mutableScatterSet = singleSubscriptionSnapshotFlowManager.workingWatchSet;
                Object obj2 = singleSubscriptionSnapshotFlowManager.workingSoleWatchedObject;
                if (mutableScatterSet != null) {
                    if (obj2 != null) {
                        PreconditionsKt.throwIllegalStateException("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    mutableScatterSet.add(obj);
                } else if (obj2 == null) {
                    singleSubscriptionSnapshotFlowManager.workingSoleWatchedObject = obj;
                } else {
                    MutableScatterSet mutableScatterSet2 = ScatterSetKt.EmptyScatterSet;
                    MutableScatterSet mutableScatterSet3 = new MutableScatterSet();
                    mutableScatterSet3.add(obj2);
                    mutableScatterSet3.add(obj);
                    singleSubscriptionSnapshotFlowManager.workingWatchSet = mutableScatterSet3;
                    singleSubscriptionSnapshotFlowManager.workingSoleWatchedObject = null;
                }
                return Unit.INSTANCE;
            case 14:
                SaveableStateRegistry saveableStateRegistry = ((SaveableStateHolderImpl) this.f$0).parentSaveableStateRegistry;
                return Boolean.valueOf(saveableStateRegistry != null ? saveableStateRegistry.canBeSaved(obj) : true);
            case 15:
                SnapshotStateObserver snapshotStateObserver = (SnapshotStateObserver) this.f$0;
                synchronized (snapshotStateObserver.observedScopeMapsLock) {
                    SnapshotStateObserver.ObservedScopeMap observedScopeMap = snapshotStateObserver.currentMap;
                    observedScopeMap.getClass();
                    Object obj3 = observedScopeMap.currentScope;
                    obj3.getClass();
                    int i9 = observedScopeMap.currentToken;
                    MutableObjectIntMap mutableObjectIntMap = observedScopeMap.currentScopeReads;
                    if (mutableObjectIntMap == null) {
                        mutableObjectIntMap = new MutableObjectIntMap();
                        observedScopeMap.currentScopeReads = mutableObjectIntMap;
                        observedScopeMap.scopeToValues.set(obj3, mutableObjectIntMap);
                    }
                    observedScopeMap.recordRead(obj, i9, obj3, mutableObjectIntMap);
                }
                return Unit.INSTANCE;
            case 16:
                TypefaceRequest typefaceRequest = (TypefaceRequest) obj;
                return ((FontFamilyResolverImpl) this.f$0).resolve(new TypefaceRequest(null, typefaceRequest.fontWeight, typefaceRequest.fontStyle, typefaceRequest.fontSynthesis, typefaceRequest.resourceLoaderCacheKey)).getValue();
            case 17:
                RoomDatabase roomDatabase = (RoomDatabase) this.f$0;
                DatabaseConfiguration databaseConfiguration = (DatabaseConfiguration) obj;
                databaseConfiguration.getClass();
                return roomDatabase.createOpenHelper(databaseConfiguration);
            case 18:
                WeakThrowableScribe$$ExternalSyntheticLambda0 weakThrowableScribe$$ExternalSyntheticLambda0 = (WeakThrowableScribe$$ExternalSyntheticLambda0) this.f$0;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0);
                Long l = androidCursor.getLong(1);
                l.getClass();
                byte[] bytes = androidCursor.getBytes(2);
                bytes.getClass();
                return weakThrowableScribe$$ExternalSyntheticLambda0.invoke(m1431m, l, bytes);
            case 19:
                StorageLinkQueries$SelectByIdQuery storageLinkQueries$SelectByIdQuery = (StorageLinkQueries$SelectByIdQuery) this.f$0;
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindLong(0, Long.valueOf(storageLinkQueries$SelectByIdQuery.id));
                return Unit.INSTANCE;
            case 20:
                WeakThrowableScribe$$ExternalSyntheticLambda0 weakThrowableScribe$$ExternalSyntheticLambda02 = (WeakThrowableScribe$$ExternalSyntheticLambda0) this.f$0;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                String m1431m2 = re$$ExternalSyntheticOutline0.m1431m(androidCursor2, 0);
                Long l2 = androidCursor2.getLong(1);
                l2.getClass();
                byte[] bytes2 = androidCursor2.getBytes(2);
                bytes2.getClass();
                return weakThrowableScribe$$ExternalSyntheticLambda02.invoke(m1431m2, l2, bytes2);
            case 21:
                StorageLinkQueries$SelectByIdQuery storageLinkQueries$SelectByIdQuery2 = (StorageLinkQueries$SelectByIdQuery) this.f$0;
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindLong(0, Long.valueOf(storageLinkQueries$SelectByIdQuery2.id));
                return Unit.INSTANCE;
            case 22:
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.f$0;
                MutableStateFlow mutableStateFlow = (MutableStateFlow) ref$ObjectRef2.element;
                if (mutableStateFlow != null) {
                    ((StateFlowImpl) mutableStateFlow).setValue(obj);
                } else {
                    ref$ObjectRef2.element = FlowKt.MutableStateFlow(obj);
                }
                return Unit.INSTANCE;
            case 23:
                AndroidSqliteDriver.Transaction transaction = (AndroidSqliteDriver.Transaction) this.f$0;
                String str6 = (String) obj;
                str6.getClass();
                transaction.pendingTables.add(str6);
                return Unit.INSTANCE;
            case 24:
                InAppNotificationMessageQueries$firstMessage$2 inAppNotificationMessageQueries$firstMessage$2 = InAppNotificationMessageQueries$firstMessage$2.INSTANCE;
                LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) this.f$0;
                AndroidCursor androidCursor3 = (AndroidCursor) obj;
                String m1431m3 = re$$ExternalSyntheticOutline0.m1431m(androidCursor3, 0);
                String string2 = androidCursor3.getString(1);
                Boolean bool = androidCursor3.getBoolean(2);
                bool.getClass();
                Long l3 = androidCursor3.getLong(3);
                String string3 = androidCursor3.getString(4);
                ?? bytes3 = androidCursor3.getBytes(5);
                AppMessageAction appMessageAction2 = bytes3 != 0 ? (AppMessageAction) ((WireAdapter) ((ComponentRegistry.Builder) localTabContentQueries.local_tab_contentAdapter).interceptors).decode(bytes3) : null;
                ?? bytes4 = androidCursor3.getBytes(6);
                Animation animation = bytes4 != 0 ? (Animation) ((WireAdapter) ((ComponentRegistry.Builder) localTabContentQueries.local_tab_contentAdapter).mappers).decode(bytes4) : null;
                ?? bytes5 = androidCursor3.getBytes(7);
                Image image = bytes5 != 0 ? (Image) ((WireAdapter) ((ComponentRegistry.Builder) localTabContentQueries.local_tab_contentAdapter).keyers).decode(bytes5) : null;
                ?? bytes6 = androidCursor3.getBytes(8);
                Image image2 = bytes6 != 0 ? (Image) ((WireAdapter) ((ComponentRegistry.Builder) localTabContentQueries.local_tab_contentAdapter).lazyFetcherFactories).decode(bytes6) : null;
                ((ComponentRegistry.Builder) localTabContentQueries.local_tab_contentAdapter).getClass();
                Long l4 = androidCursor3.getLong(9);
                l4.getClass();
                Integer valueOf = Integer.valueOf((int) l4.longValue());
                Long l5 = androidCursor3.getLong(10);
                Instant instant3 = l5 != null ? (Instant) ((AsyncTimeout.Companion) ((ComponentRegistry.Builder) localTabContentQueries.local_tab_contentAdapter).lazyDecoderFactories).decode(Long.valueOf(l5.longValue())) : null;
                boolean booleanValue = bool.booleanValue();
                int intValue3 = valueOf.intValue();
                m1431m3.getClass();
                return new InAppNotificationMessage(m1431m3, string2, booleanValue, l3, string3, appMessageAction2, animation, image, image2, intValue3, instant3);
            case 25:
                InlineMessageQueries$inlineMessagesByPriority$2 inlineMessageQueries$inlineMessagesByPriority$2 = InlineMessageQueries$inlineMessagesByPriority$2.INSTANCE;
                Reward$Adapter reward$Adapter = (Reward$Adapter) ((LocalTabContentQueries) this.f$0).local_tab_contentAdapter;
                AndroidCursor androidCursor4 = (AndroidCursor) obj;
                String m1431m4 = re$$ExternalSyntheticOutline0.m1431m(androidCursor4, 0);
                String string4 = androidCursor4.getString(1);
                Boolean bool2 = androidCursor4.getBoolean(2);
                bool2.getClass();
                String string5 = androidCursor4.getString(3);
                InlineMessage.Placement placement2 = string5 != null ? (InlineMessage.Placement) ((EnumColumnAdapter) reward$Adapter.program_detail_rowsAdapter).decode(string5) : null;
                ?? bytes7 = androidCursor4.getBytes(4);
                Image image3 = bytes7 != 0 ? (Image) ((WireAdapter) reward$Adapter.avatarsAdapter).decode(bytes7) : null;
                String string6 = androidCursor4.getString(5);
                String string7 = androidCursor4.getString(6);
                ?? bytes8 = androidCursor4.getBytes(7);
                AppMessageAction appMessageAction3 = bytes8 != 0 ? (AppMessageAction) ((WireAdapter) reward$Adapter.reward_selection_stateAdapter).decode(bytes8) : null;
                ?? bytes9 = androidCursor4.getBytes(8);
                AppMessageAction appMessageAction4 = bytes9 != 0 ? (AppMessageAction) ((WireAdapter) reward$Adapter.boost_detail_bottom_upsellAdapter).decode(bytes9) : null;
                Boolean bool3 = androidCursor4.getBoolean(9);
                bool3.getClass();
                ?? bytes10 = androidCursor4.getBytes(10);
                Animation animation2 = bytes10 != 0 ? (Animation) ((WireAdapter) reward$Adapter.app_linksAdapter).decode(bytes10) : null;
                reward$Adapter.getClass();
                Long l6 = androidCursor4.getLong(11);
                l6.getClass();
                Integer valueOf2 = Integer.valueOf((int) l6.longValue());
                String string8 = androidCursor4.getString(12);
                MessageType messageType = string8 != null ? (MessageType) ((EnumColumnAdapter) reward$Adapter.boost_detail_rowsAdapter).decode(string8) : null;
                Long l7 = androidCursor4.getLong(13);
                return new com.squareup.cash.appmessages.db.InlineMessage(m1431m4, string4, bool2.booleanValue(), placement2, image3, string6, string7, appMessageAction3, appMessageAction4, bool3.booleanValue(), animation2, valueOf2.intValue(), messageType, l7 != null ? (Instant) ((AsyncTimeout.Companion) reward$Adapter.boost_attributesAdapter).decode(Long.valueOf(l7.longValue())) : null);
            case 26:
                PopupMessageQueries$popupMessagesByPriority$2 popupMessageQueries$popupMessagesByPriority$2 = PopupMessageQueries$popupMessagesByPriority$2.INSTANCE;
                Reward$Adapter reward$Adapter2 = (Reward$Adapter) ((LocalTabContentQueries) this.f$0).local_tab_contentAdapter;
                AndroidCursor androidCursor5 = (AndroidCursor) obj;
                String m1431m5 = re$$ExternalSyntheticOutline0.m1431m(androidCursor5, 0);
                String string9 = androidCursor5.getString(1);
                Boolean bool4 = androidCursor5.getBoolean(2);
                bool4.getClass();
                String string10 = androidCursor5.getString(3);
                PopupMessage.Placement placement3 = string10 != null ? (PopupMessage.Placement) ((EnumColumnAdapter) reward$Adapter2.program_detail_rowsAdapter).decode(string10) : null;
                ?? bytes11 = androidCursor5.getBytes(4);
                Image image4 = bytes11 != 0 ? (Image) ((WireAdapter) reward$Adapter2.avatarsAdapter).decode(bytes11) : null;
                String string11 = androidCursor5.getString(5);
                String string12 = androidCursor5.getString(6);
                ?? bytes12 = androidCursor5.getBytes(7);
                AppMessageAction appMessageAction5 = bytes12 != 0 ? (AppMessageAction) ((WireAdapter) reward$Adapter2.reward_selection_stateAdapter).decode(bytes12) : null;
                ?? bytes13 = androidCursor5.getBytes(8);
                AppMessageAction appMessageAction6 = bytes13 != 0 ? (AppMessageAction) ((WireAdapter) reward$Adapter2.boost_detail_bottom_upsellAdapter).decode(bytes13) : null;
                ?? bytes14 = androidCursor5.getBytes(9);
                Animation animation3 = bytes14 != 0 ? (Animation) ((WireAdapter) reward$Adapter2.app_linksAdapter).decode(bytes14) : null;
                AsyncTimeout.Companion companion = (AsyncTimeout.Companion) reward$Adapter2.boost_detail_rowsAdapter;
                Long l8 = androidCursor5.getLong(10);
                l8.getClass();
                Object decode = companion.decode(l8);
                Long l9 = androidCursor5.getLong(11);
                l9.getClass();
                Integer valueOf3 = Integer.valueOf((int) l9.longValue());
                Long l10 = androidCursor5.getLong(12);
                Instant instant4 = l10 != null ? (Instant) ((AsyncTimeout.Companion) reward$Adapter2.boost_attributesAdapter).decode(Long.valueOf(l10.longValue())) : null;
                boolean booleanValue2 = bool4.booleanValue();
                Instant instant5 = (Instant) decode;
                int intValue4 = valueOf3.intValue();
                instant5.getClass();
                return new com.squareup.cash.appmessages.db.PopupMessage(m1431m5, string9, booleanValue2, placement3, image4, string11, string12, appMessageAction5, appMessageAction6, animation3, instant5, intValue4, instant4);
            case 27:
                SheetMessageQueries$sheetMessagesByPriority$2 sheetMessageQueries$sheetMessagesByPriority$2 = SheetMessageQueries$sheetMessagesByPriority$2.INSTANCE;
                LocalTabContentQueries localTabContentQueries2 = (LocalTabContentQueries) this.f$0;
                AndroidCursor androidCursor6 = (AndroidCursor) obj;
                String m1431m6 = re$$ExternalSyntheticOutline0.m1431m(androidCursor6, 0);
                String string13 = androidCursor6.getString(1);
                Boolean bool5 = androidCursor6.getBoolean(2);
                bool5.getClass();
                GrpcMethod grpcMethod2 = (GrpcMethod) localTabContentQueries2.local_tab_contentAdapter;
                Object m = BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor6, 3, (WireAdapter) grpcMethod2.path);
                AsyncTimeout.Companion companion2 = (AsyncTimeout.Companion) grpcMethod2.requestAdapter;
                Long l11 = androidCursor6.getLong(4);
                l11.getClass();
                Object decode2 = companion2.decode(l11);
                String string14 = androidCursor6.getString(5);
                Long l12 = androidCursor6.getLong(6);
                l12.getClass();
                Integer valueOf4 = Integer.valueOf((int) l12.longValue());
                Long l13 = androidCursor6.getLong(7);
                if (l13 != null) {
                    Instant instant6 = (Instant) ((AsyncTimeout.Companion) grpcMethod2.responseAdapter).decode(Long.valueOf(l13.longValue()));
                    str = m1431m6;
                    num = valueOf4;
                    instant = instant6;
                } else {
                    str = m1431m6;
                    num = valueOf4;
                    instant = null;
                }
                return sheetMessageQueries$sheetMessagesByPriority$2.invoke(str, string13, bool5, m, decode2, string14, num, instant);
            case 28:
                TooltipMessageQueries$firstMessage$2 tooltipMessageQueries$firstMessage$2 = TooltipMessageQueries$firstMessage$2.INSTANCE;
                LocalTabContentQueries localTabContentQueries3 = (LocalTabContentQueries) this.f$0;
                AndroidCursor androidCursor7 = (AndroidCursor) obj;
                String m1431m7 = re$$ExternalSyntheticOutline0.m1431m(androidCursor7, 0);
                String string15 = androidCursor7.getString(1);
                Boolean bool6 = androidCursor7.getBoolean(2);
                bool6.getClass();
                String string16 = androidCursor7.getString(3);
                if (string16 != null) {
                    Placement placement4 = (Placement) ((EnumColumnAdapter) ((SimpleActor) localTabContentQueries3.local_tab_contentAdapter).scope).decode(string16);
                    str2 = m1431m7;
                    placement = placement4;
                } else {
                    str2 = m1431m7;
                    placement = null;
                }
                String string17 = androidCursor7.getString(4);
                if (string17 != null) {
                    TooltipMessage.ArrowPosition arrowPosition2 = (TooltipMessage.ArrowPosition) ((EnumColumnAdapter) ((SimpleActor) localTabContentQueries3.local_tab_contentAdapter).consumeMessage).decode(string17);
                    str3 = str2;
                    arrowPosition = arrowPosition2;
                } else {
                    str3 = str2;
                    arrowPosition = null;
                }
                ?? bytes15 = androidCursor7.getBytes(5);
                if (bytes15 != 0) {
                    AppMessageAction appMessageAction7 = (AppMessageAction) ((WireAdapter) ((SimpleActor) localTabContentQueries3.local_tab_contentAdapter).messageQueue).decode(bytes15);
                    str4 = str3;
                    appMessageAction = appMessageAction7;
                } else {
                    str4 = str3;
                    appMessageAction = null;
                }
                ((SimpleActor) localTabContentQueries3.local_tab_contentAdapter).getClass();
                Long l14 = androidCursor7.getLong(6);
                l14.getClass();
                Integer valueOf5 = Integer.valueOf((int) l14.longValue());
                Long l15 = androidCursor7.getLong(7);
                if (l15 != null) {
                    Instant instant7 = (Instant) ((AsyncTimeout.Companion) ((SimpleActor) localTabContentQueries3.local_tab_contentAdapter).remainingMessages).decode(Long.valueOf(l15.longValue()));
                    str5 = str4;
                    num2 = valueOf5;
                    instant2 = instant7;
                } else {
                    str5 = str4;
                    num2 = valueOf5;
                    instant2 = null;
                }
                return tooltipMessageQueries$firstMessage$2.invoke(str5, string15, bool6, placement, arrowPosition, appMessageAction, num2, instant2);
            default:
                KeyboardOptions keyboardOptions = (KeyboardOptions) this.f$0;
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                int i10 = keyboardOptions.capitalization;
                SemanticsPropertyKey semanticsPropertyKey = InputFieldKt.KeyboardCapitalizationSemanticsKey;
                KProperty[] kPropertyArr = InputFieldKt.$$delegatedProperties;
                KProperty kProperty = kPropertyArr[0];
                KeyboardCapitalization keyboardCapitalization = new KeyboardCapitalization(i10);
                semanticsPropertyKey.getClass();
                semanticsPropertyReceiver.set(semanticsPropertyKey, keyboardCapitalization);
                int i11 = keyboardOptions.keyboardType;
                SemanticsPropertyKey semanticsPropertyKey2 = InputFieldKt.KeyboardTypeSemanticsKey;
                KProperty kProperty2 = kPropertyArr[1];
                KeyboardType keyboardType = new KeyboardType(i11);
                semanticsPropertyKey2.getClass();
                semanticsPropertyReceiver.set(semanticsPropertyKey2, keyboardType);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ CashApp$$ExternalSyntheticLambda2(LocalTabContentQueries localTabContentQueries, byte b) {
        this.$r8$classId = 25;
        InlineMessageQueries$inlineMessagesByPriority$2 inlineMessageQueries$inlineMessagesByPriority$2 = InlineMessageQueries$inlineMessagesByPriority$2.INSTANCE;
        this.f$0 = localTabContentQueries;
    }

    public /* synthetic */ CashApp$$ExternalSyntheticLambda2(LocalTabContentQueries localTabContentQueries, char c) {
        this.$r8$classId = 26;
        PopupMessageQueries$popupMessagesByPriority$2 popupMessageQueries$popupMessagesByPriority$2 = PopupMessageQueries$popupMessagesByPriority$2.INSTANCE;
        this.f$0 = localTabContentQueries;
    }

    public /* synthetic */ CashApp$$ExternalSyntheticLambda2(LocalTabContentQueries localTabContentQueries, int i) {
        this.$r8$classId = 27;
        SheetMessageQueries$sheetMessagesByPriority$2 sheetMessageQueries$sheetMessagesByPriority$2 = SheetMessageQueries$sheetMessagesByPriority$2.INSTANCE;
        this.f$0 = localTabContentQueries;
    }

    public /* synthetic */ CashApp$$ExternalSyntheticLambda2(LocalTabContentQueries localTabContentQueries, short s) {
        this.$r8$classId = 28;
        TooltipMessageQueries$firstMessage$2 tooltipMessageQueries$firstMessage$2 = TooltipMessageQueries$firstMessage$2.INSTANCE;
        this.f$0 = localTabContentQueries;
    }

    public /* synthetic */ CashApp$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }
}
