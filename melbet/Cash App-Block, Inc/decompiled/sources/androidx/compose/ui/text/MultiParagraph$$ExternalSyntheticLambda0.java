package androidx.compose.ui.text;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.MutableScatterSet;
import androidx.compose.material.pullrefresh.ArrowValues;
import androidx.compose.material.pullrefresh.PullRefreshIndicatorKt;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.scrollcapture.RelativeScroller;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.local.db.Local_tab_content;
import app.cash.sqldelight.driver.android.AndroidStatement;
import coil3.Extras;
import coil3.size.DimensionKt;
import coil3.size.SizeKt;
import com.google.android.material.resources.MaterialAttributes;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.db2.contacts.Alias$Adapter;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.offers.db.OffersItemTokenType;
import com.squareup.protos.cash.cashsuggest.api.ShopInfoResponse;
import com.squareup.wire.GrpcMethod;
import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureStateEventData;
import dev.chrisbanes.haze.HazeEffectNode;
import dev.chrisbanes.haze.HazeEffectNodeKt;
import dev.chrisbanes.haze.HazeKt;
import dev.chrisbanes.haze.HazeTint;
import dev.chrisbanes.haze.PaintKt;
import dev.chrisbanes.haze.Pool;
import dev.chrisbanes.haze.RenderEffect_androidKt;
import dev.chrisbanes.haze.RenderScriptBlurEffect;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.RangesKt___RangesKt;
import okio.ForwardingFileSystem$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final /* synthetic */ class MultiParagraph$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ long f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ MultiParagraph$$ExternalSyntheticLambda0(long j, Ref$FloatRef ref$FloatRef, RenderScriptBlurEffect renderScriptBlurEffect, Context context) {
        this.$r8$classId = 6;
        this.f$0 = j;
        this.f$3 = ref$FloatRef;
        this.f$1 = renderScriptBlurEffect;
        this.f$2 = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        AndroidParagraph androidParagraph;
        boolean z;
        AndroidParagraph androidParagraph2;
        float f;
        float f2;
        CanvasDrawScope canvasDrawScope;
        AndroidImageBitmap androidImageBitmap;
        int i = this.$r8$classId;
        long j2 = this.f$0;
        Object obj2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$3;
        switch (i) {
            case 0:
                float[] fArr = (float[]) obj3;
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj2;
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj4;
                ParagraphInfo paragraphInfo = (ParagraphInfo) obj;
                int i2 = paragraphInfo.startIndex;
                AndroidParagraph androidParagraph3 = paragraphInfo.paragraph;
                int i3 = paragraphInfo.endIndex;
                int m990getMinimpl = i2 > TextRange.m990getMinimpl(j2) ? paragraphInfo.startIndex : TextRange.m990getMinimpl(j2);
                if (i3 >= TextRange.m989getMaximpl(j2)) {
                    i3 = TextRange.m989getMaximpl(j2);
                }
                long TextRange = SizeKt.TextRange(paragraphInfo.toLocalIndex(m990getMinimpl), paragraphInfo.toLocalIndex(i3));
                int i4 = ref$IntRef.element;
                TextLayout textLayout = androidParagraph3.layout;
                int m990getMinimpl2 = TextRange.m990getMinimpl(TextRange);
                int m989getMaximpl = TextRange.m989getMaximpl(TextRange);
                Layout layout = textLayout.layout;
                int length = layout.getText().length();
                if (m990getMinimpl2 < 0) {
                    InlineClassHelperKt.throwIllegalArgumentException("startOffset must be > 0");
                }
                if (m990getMinimpl2 >= length) {
                    InlineClassHelperKt.throwIllegalArgumentException("startOffset must be less than text length");
                }
                if (m989getMaximpl <= m990getMinimpl2) {
                    InlineClassHelperKt.throwIllegalArgumentException("endOffset must be greater than startOffset");
                }
                if (m989getMaximpl > length) {
                    InlineClassHelperKt.throwIllegalArgumentException("endOffset must be smaller or equal to text length");
                }
                if (fArr.length - i4 < (m989getMaximpl - m990getMinimpl2) * 4) {
                    InlineClassHelperKt.throwIllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(m990getMinimpl2);
                int lineForOffset2 = layout.getLineForOffset(m989getMaximpl - 1);
                RelativeScroller relativeScroller = new RelativeScroller(textLayout);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        int lineEnd = textLayout.getLineEnd(lineForOffset);
                        int max = Math.max(m990getMinimpl2, lineStart);
                        int min = Math.min(m989getMaximpl, lineEnd);
                        float lineTop = textLayout.getLineTop(lineForOffset);
                        float lineBottom = textLayout.getLineBottom(lineForOffset);
                        j = TextRange;
                        boolean z2 = layout.getParagraphDirection(lineForOffset) == 1;
                        while (max < min) {
                            boolean isRtlCharAt = layout.isRtlCharAt(max);
                            if (!z2 || isRtlCharAt) {
                                z = z2;
                                if (z && isRtlCharAt) {
                                    float f3 = relativeScroller.get(max, false, false, false);
                                    androidParagraph2 = androidParagraph3;
                                    f = relativeScroller.get(max + 1, true, true, false);
                                    f2 = f3;
                                } else {
                                    androidParagraph2 = androidParagraph3;
                                    if (z || !isRtlCharAt) {
                                        f = relativeScroller.get(max, false, false, false);
                                        f2 = relativeScroller.get(max + 1, true, true, false);
                                    } else {
                                        f2 = relativeScroller.get(max, false, false, true);
                                        f = relativeScroller.get(max + 1, true, true, true);
                                    }
                                }
                                fArr[i4] = f;
                                fArr[i4 + 1] = lineTop;
                                fArr[i4 + 2] = f2;
                                fArr[i4 + 3] = lineBottom;
                                i4 += 4;
                                max++;
                                z2 = z;
                                androidParagraph3 = androidParagraph2;
                            } else {
                                z = z2;
                                f = relativeScroller.get(max, false, false, true);
                                androidParagraph2 = androidParagraph3;
                                f2 = relativeScroller.get(max + 1, true, true, true);
                            }
                            fArr[i4] = f;
                            fArr[i4 + 1] = lineTop;
                            fArr[i4 + 2] = f2;
                            fArr[i4 + 3] = lineBottom;
                            i4 += 4;
                            max++;
                            z2 = z;
                            androidParagraph3 = androidParagraph2;
                        }
                        androidParagraph = androidParagraph3;
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            androidParagraph3 = androidParagraph;
                            TextRange = j;
                        }
                    }
                } else {
                    j = TextRange;
                    androidParagraph = androidParagraph3;
                }
                int m988getLengthimpl = (TextRange.m988getLengthimpl(j) * 4) + ref$IntRef.element;
                for (int i5 = ref$IntRef.element; i5 < m988getLengthimpl; i5 += 4) {
                    int i6 = i5 + 1;
                    float f4 = fArr[i6];
                    float f5 = ref$FloatRef.element;
                    fArr[i6] = f4 + f5;
                    int i7 = i5 + 3;
                    fArr[i7] = fArr[i7] + f5;
                }
                ref$IntRef.element = m988getLengthimpl;
                ref$FloatRef.element = androidParagraph.getHeight() + ref$FloatRef.element;
                return Unit.INSTANCE;
            case 1:
                Rect rect = (Rect) obj3;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj2;
                long j3 = this.f$0;
                ColorFilter colorFilter = (ColorFilter) obj4;
                LayoutNodeDrawScope layoutNodeDrawScope = (LayoutNodeDrawScope) obj;
                layoutNodeDrawScope.drawContent();
                float f6 = rect.left;
                float f7 = rect.top;
                CanvasDrawScope canvasDrawScope2 = layoutNodeDrawScope.canvasDrawScope;
                ((Extras.Key) canvasDrawScope2.drawContext.path).translate(f6, f7);
                try {
                    androidImageBitmap = (AndroidImageBitmap) ref$ObjectRef.element;
                    canvasDrawScope = canvasDrawScope2;
                } catch (Throwable th) {
                    th = th;
                    canvasDrawScope = canvasDrawScope2;
                }
                try {
                    DrawScope.m739drawImageAZ2fEMs$default(layoutNodeDrawScope, androidImageBitmap, j3, 0L, 0L, RecyclerView.DECELERATION_RATE, colorFilter, 0, 0, 890);
                    ((Extras.Key) canvasDrawScope.drawContext.path).translate(-f6, -f7);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    ((Extras.Key) canvasDrawScope.drawContext.path).translate(-f6, -f7);
                    throw th;
                }
            case 2:
                PullRefreshState pullRefreshState = (PullRefreshState) obj3;
                State state = (State) obj2;
                long j4 = this.f$0;
                AndroidPath androidPath = (AndroidPath) obj4;
                DrawScope drawScope = (DrawScope) obj;
                float adjustedDistancePulled = pullRefreshState.getAdjustedDistancePulled() / pullRefreshState._threshold$delegate.getFloatValue();
                float min2 = Math.min(1.0f, adjustedDistancePulled) - 0.4f;
                float f8 = RecyclerView.DECELERATION_RATE;
                float max2 = (Math.max(min2, RecyclerView.DECELERATION_RATE) * 5.0f) / 3.0f;
                float abs = Math.abs(adjustedDistancePulled) - 1.0f;
                if (abs >= RecyclerView.DECELERATION_RATE) {
                    f8 = abs;
                }
                if (f8 > 2.0f) {
                    f8 = 2.0f;
                }
                float pow = (((0.4f * max2) - 0.25f) + (f8 - (((float) Math.pow(f8, 2.0d)) / 4.0f))) * 0.5f;
                float f9 = pow * 360.0f;
                float f10 = ((0.8f * max2) + pow) * 360.0f;
                float min3 = Math.min(1.0f, max2);
                ArrowValues arrowValues = new ArrowValues();
                arrowValues.endAngle = f10;
                arrowValues.scale = min3;
                float floatValue = ((Number) state.getValue()).floatValue();
                long mo752getCenterF1C5BW0 = drawScope.mo752getCenterF1C5BW0();
                GrpcMethod drawContext = drawScope.getDrawContext();
                long m3999getSizeNHjbRc = drawContext.m3999getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    ((Extras.Key) drawContext.path).m1436rotateUv8p0NA(mo752getCenterF1C5BW0, pow);
                    float mo236toPx0680j_4 = drawScope.mo236toPx0680j_4(PullRefreshIndicatorKt.ArcRadius);
                    float f11 = PullRefreshIndicatorKt.StrokeWidth;
                    float mo236toPx0680j_42 = (drawScope.mo236toPx0680j_4(f11) / 2.0f) + mo236toPx0680j_4;
                    Rect rect2 = new Rect(Float.intBitsToFloat((int) (DimensionKt.m1466getCenteruvyYCjk(drawScope.mo753getSizeNHjbRc()) >> 32)) - mo236toPx0680j_42, Float.intBitsToFloat((int) (DimensionKt.m1466getCenteruvyYCjk(drawScope.mo753getSizeNHjbRc()) & BodyPartID.bodyIdMax)) - mo236toPx0680j_42, Float.intBitsToFloat((int) (DimensionKt.m1466getCenteruvyYCjk(drawScope.mo753getSizeNHjbRc()) >> 32)) + mo236toPx0680j_42, Float.intBitsToFloat((int) (DimensionKt.m1466getCenteruvyYCjk(drawScope.mo753getSizeNHjbRc()) & BodyPartID.bodyIdMax)) + mo236toPx0680j_42);
                    DrawScope.m737drawArcyD3GUKo$default(drawScope, j4, f9, f10 - f9, rect2.m636getTopLeftF1C5BW0(), rect2.m634getSizeNHjbRc(), floatValue, new Stroke(drawScope.mo236toPx0680j_4(f11), RecyclerView.DECELERATION_RATE, 2, 0, null, 26), 768);
                    PullRefreshIndicatorKt.m512drawArrowBx497Mc(drawScope, androidPath, rect2, j4, floatValue, arrowValues);
                    Recorder$$ExternalSyntheticOutline2.m(drawContext, m3999getSizeNHjbRc);
                    return Unit.INSTANCE;
                } catch (Throwable th3) {
                    Recorder$$ExternalSyntheticOutline2.m(drawContext, m3999getSizeNHjbRc);
                    throw th3;
                }
            case 3:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindString(0, (String) obj3);
                androidStatement.bindString(1, (String) ((Alias$Adapter) ((GpsConfigQueries) obj2).gpsConfigAdapter).sync_stateAdapter.encode((OffersItemTokenType) obj4));
                androidStatement.bindLong(2, Long.valueOf(j2));
                return Unit.INSTANCE;
            case 4:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindLong(0, (Long) obj3);
                androidStatement2.bindLong(1, Long.valueOf(j2));
                androidStatement2.bindBytes(2, (byte[]) ((Local_tab_content.Adapter) ((GpsConfigQueries) obj2).gpsConfigAdapter).responseAdapter.encode((ShopInfoResponse) obj4));
                return Unit.INSTANCE;
            case 5:
                SelfieStepStateManager selfieStepStateManager = (SelfieStepStateManager) obj3;
                SelfieWorkflow.Input input = (SelfieWorkflow.Input) obj2;
                SelfieState.WaitForCameraFeed waitForCameraFeed = (SelfieState.WaitForCameraFeed) obj4;
                CameraProperties cameraProperties = (CameraProperties) obj;
                cameraProperties.getClass();
                VideoCaptureMethod videoCaptureMethod = selfieStepStateManager.videoCaptureMethod(input);
                TrackingEventsLogger trackingEventsLogger = selfieStepStateManager.trackingEventsLogger;
                SubtreeManager subtreeManager = (SubtreeManager) selfieStepStateManager.lastChild;
                VideoCaptureMethod videoCaptureMethod2 = VideoCaptureMethod.Stream;
                long j5 = this.f$0;
                if (videoCaptureMethod == videoCaptureMethod2) {
                    TrackingEventsLogger.DefaultImpls.logSelfieCaptureStateEvent$default(trackingEventsLogger, new SelfieCaptureStateEventData(SelfieCaptureState.LOADING, "webrtc", null, null, 8, null), false, 2, null);
                    subtreeManager.updateState(new SelfieState.WaitForWebRtcSetup(input.videoCaptureConfig.webRtcJwt, cameraProperties, j5, MaterialAttributes.createBackState(subtreeManager, false), waitForCameraFeed.posesNeeded, input.poseConfigs, true, waitForCameraFeed.cameraFacingMode, waitForCameraFeed.isFlashEnabled));
                } else {
                    if (subtreeManager.getState() instanceof SelfieState.WaitForCameraFeed) {
                        SelfieCaptureState selfieCaptureState = SelfieCaptureState.IDLE;
                        Selfie.Pose pose = (Selfie.Pose) CollectionsKt.firstOrNull(waitForCameraFeed.posesNeeded);
                        TrackingEventsLogger.DefaultImpls.logSelfieCaptureStateEvent$default(trackingEventsLogger, new SelfieCaptureStateEventData(selfieCaptureState, null, pose != null ? pose.name() : null, null, 8, null), false, 2, null);
                    }
                    Selfie.Pose pose2 = (Selfie.Pose) CollectionsKt.first(waitForCameraFeed.posesNeeded);
                    Selfie.Pose pose3 = Selfie.Pose.Center;
                    List list = waitForCameraFeed.posesNeeded;
                    subtreeManager.updateState(pose2 == pose3 ? new SelfieState.StartCapture(null, RecyclerView.DECELERATION_RATE, null, list, null, System.currentTimeMillis(), j5, cameraProperties, MaterialAttributes.createBackState(subtreeManager, false), input.poseConfigs, waitForCameraFeed.cameraFacingMode, waitForCameraFeed.isFlashEnabled, EnumC0170g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE) : new SelfieState.ShowPoseHint(EmptyList.INSTANCE, list, true, cameraProperties, j5, MaterialAttributes.createBackState(subtreeManager, false), input.poseConfigs, waitForCameraFeed.cameraFacingMode, waitForCameraFeed.isFlashEnabled));
                }
                return Unit.INSTANCE;
            default:
                Ref$FloatRef ref$FloatRef2 = (Ref$FloatRef) obj4;
                RenderScriptBlurEffect renderScriptBlurEffect = (RenderScriptBlurEffect) obj3;
                Context context = (Context) obj2;
                DrawScope drawScope2 = (DrawScope) obj;
                drawScope2.getClass();
                long j6 = this.f$0;
                long j7 = j6 ^ (-9223372034707292160L);
                long m645times7Ah8Wj8 = Size.m645times7Ah8Wj8(drawScope2.mo753getSizeNHjbRc(), ref$FloatRef2.element);
                HazeEffectNode hazeEffectNode = renderScriptBlurEffect.node;
                Lazy lazy = HazeEffectNodeKt.renderEffectCache$delegate;
                HazeKt.m4111drawScaledContentLF441nw(drawScope2, j7, m645times7Ah8Wj8, hazeEffectNode.blurredEdgeTreatment != null, new ForwardingFileSystem$$ExternalSyntheticLambda0(renderScriptBlurEffect, 16));
                long mo753getSizeNHjbRc = drawScope2.mo753getSizeNHjbRc();
                float max3 = Math.max(Float.intBitsToFloat((int) (j6 >> 32)), RecyclerView.DECELERATION_RATE) * 2.0f;
                float max4 = Math.max(Float.intBitsToFloat((int) (j6 & BodyPartID.bodyIdMax)), RecyclerView.DECELERATION_RATE) * 2.0f;
                long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (mo753getSizeNHjbRc >> 32)) + max3) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (mo753getSizeNHjbRc & BodyPartID.bodyIdMax)) + max4) & BodyPartID.bodyIdMax);
                float resolveNoiseFactor = HazeEffectNodeKt.resolveNoiseFactor(hazeEffectNode);
                if (resolveNoiseFactor > RecyclerView.DECELERATION_RATE) {
                    if (((((j7 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) != 0 || Offset.m622equalsimpl0(j7, 0L)) {
                        Pool pool = PaintKt.PaintPool;
                        Paint orCreate = PaintKt.getOrCreate(pool);
                        MutableScatterSet mutableScatterSet = (MutableScatterSet) pool.pool;
                        try {
                            AndroidPaint androidPaint = (AndroidPaint) orCreate;
                            androidPaint.setAntiAlias();
                            androidPaint.setAlpha(RangesKt___RangesKt.coerceIn(resolveNoiseFactor, RecyclerView.DECELERATION_RATE, 1.0f));
                            Bitmap noiseTexture = RenderEffect_androidKt.getNoiseTexture(context);
                            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                            BitmapShader bitmapShader = new BitmapShader(noiseTexture, tileMode, tileMode);
                            float f12 = ref$FloatRef2.element;
                            if (f12 <= RecyclerView.DECELERATION_RATE) {
                                f12 = 1.0f;
                            }
                            if (Math.abs(f12 - 1.0f) >= 0.001f) {
                                Matrix matrix = new Matrix();
                                float f13 = 1.0f / f12;
                                matrix.setScale(f13, f13);
                                bitmapShader.setLocalMatrix(matrix);
                            }
                            androidPaint.setShader(bitmapShader);
                            androidPaint.m658setBlendModes9anfk8(9);
                            Canvas canvas = drawScope2.getDrawContext().getCanvas();
                            Rect m1180Recttz77jQw = DBUtil.m1180Recttz77jQw(0L, floatToRawIntBits);
                            canvas.drawRect(m1180Recttz77jQw.left, m1180Recttz77jQw.top, m1180Recttz77jQw.right, m1180Recttz77jQw.bottom, orCreate);
                            ((AndroidPaint) orCreate).internalPaint.reset();
                            if (mutableScatterSet._size < 3) {
                                mutableScatterSet.plusAssign(orCreate);
                            }
                        } catch (Throwable th4) {
                            ((AndroidPaint) orCreate).internalPaint.reset();
                            if (mutableScatterSet._size < 3) {
                                mutableScatterSet.plusAssign(orCreate);
                            }
                            throw th4;
                        }
                    } else {
                        float intBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j7 & BodyPartID.bodyIdMax));
                        ((Extras.Key) drawScope2.getDrawContext().path).translate(intBitsToFloat, intBitsToFloat2);
                        try {
                            Pool pool2 = PaintKt.PaintPool;
                            Paint orCreate2 = PaintKt.getOrCreate(pool2);
                            try {
                                AndroidPaint androidPaint2 = (AndroidPaint) orCreate2;
                                androidPaint2.setAntiAlias();
                                androidPaint2.setAlpha(RangesKt___RangesKt.coerceIn(resolveNoiseFactor, RecyclerView.DECELERATION_RATE, 1.0f));
                                Bitmap noiseTexture2 = RenderEffect_androidKt.getNoiseTexture(context);
                                Shader.TileMode tileMode2 = Shader.TileMode.REPEAT;
                                BitmapShader bitmapShader2 = new BitmapShader(noiseTexture2, tileMode2, tileMode2);
                                float f14 = ref$FloatRef2.element;
                                if (f14 <= RecyclerView.DECELERATION_RATE) {
                                    f14 = 1.0f;
                                }
                                if (Math.abs(f14 - 1.0f) >= 0.001f) {
                                    Matrix matrix2 = new Matrix();
                                    float f15 = 1.0f / f14;
                                    matrix2.setScale(f15, f15);
                                    bitmapShader2.setLocalMatrix(matrix2);
                                }
                                androidPaint2.setShader(bitmapShader2);
                                androidPaint2.m658setBlendModes9anfk8(9);
                                Canvas canvas2 = drawScope2.getDrawContext().getCanvas();
                                Rect m1180Recttz77jQw2 = DBUtil.m1180Recttz77jQw(0L, floatToRawIntBits);
                                canvas2.drawRect(m1180Recttz77jQw2.left, m1180Recttz77jQw2.top, m1180Recttz77jQw2.right, m1180Recttz77jQw2.bottom, orCreate2);
                                ((AndroidPaint) orCreate2).internalPaint.reset();
                                MutableScatterSet mutableScatterSet2 = (MutableScatterSet) pool2.pool;
                                if (mutableScatterSet2._size < 3) {
                                    mutableScatterSet2.plusAssign(orCreate2);
                                }
                                ((Extras.Key) drawScope2.getDrawContext().path).translate(-intBitsToFloat, -intBitsToFloat2);
                            } catch (Throwable th5) {
                                ((AndroidPaint) orCreate2).internalPaint.reset();
                                MutableScatterSet mutableScatterSet3 = (MutableScatterSet) pool2.pool;
                                if (mutableScatterSet3._size < 3) {
                                    mutableScatterSet3.plusAssign(orCreate2);
                                }
                                throw th5;
                            }
                        } finally {
                        }
                    }
                }
                if (((((j7 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) != 0 || Offset.m622equalsimpl0(j7, 0L)) {
                    Iterator it = HazeEffectNodeKt.resolveTints(hazeEffectNode).iterator();
                    while (it.hasNext()) {
                        HazeKt.m4112drawScrimDBWKusU(drawScope2, (HazeTint) it.next(), hazeEffectNode, j6, floatToRawIntBits);
                    }
                } else {
                    ((Extras.Key) drawScope2.getDrawContext().path).translate(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & BodyPartID.bodyIdMax)));
                    try {
                        Iterator it2 = HazeEffectNodeKt.resolveTints(hazeEffectNode).iterator();
                        while (it2.hasNext()) {
                            long j8 = j6;
                            HazeEffectNode hazeEffectNode2 = hazeEffectNode;
                            long j9 = floatToRawIntBits;
                            HazeKt.m4112drawScrimDBWKusU(drawScope2, (HazeTint) it2.next(), hazeEffectNode2, j8, j9);
                            hazeEffectNode = hazeEffectNode2;
                            j6 = j8;
                            floatToRawIntBits = j9;
                        }
                    } finally {
                    }
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ MultiParagraph$$ExternalSyntheticLambda0(long j, float[] fArr, Ref$IntRef ref$IntRef, Ref$FloatRef ref$FloatRef) {
        this.$r8$classId = 0;
        this.f$0 = j;
        this.f$1 = fArr;
        this.f$2 = ref$IntRef;
        this.f$3 = ref$FloatRef;
    }

    public /* synthetic */ MultiParagraph$$ExternalSyntheticLambda0(Long l, long j, GpsConfigQueries gpsConfigQueries, ShopInfoResponse shopInfoResponse) {
        this.$r8$classId = 4;
        this.f$1 = l;
        this.f$0 = j;
        this.f$2 = gpsConfigQueries;
        this.f$3 = shopInfoResponse;
    }

    public /* synthetic */ MultiParagraph$$ExternalSyntheticLambda0(Object obj, Object obj2, long j, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$0 = j;
        this.f$3 = obj3;
    }

    public /* synthetic */ MultiParagraph$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, long j, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$0 = j;
    }
}
