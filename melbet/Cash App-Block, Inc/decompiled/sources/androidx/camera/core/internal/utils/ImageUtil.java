package androidx.camera.core.internal.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Build;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.utils.ExifData;
import androidx.camera.core.impl.utils.ExifOutputStream;
import androidx.camera.core.impl.utils.ExifTag;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.tokens.ProgressIndicatorTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.mlkit.vision.text.zzc;
import com.squareup.cash.moneybot.genie.ResolvedStyle;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda8;
import com.squareup.wire.WireEnum;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import xyz.block.genie.expressions.EvalHelpersKt;
import xyz.block.genie.expressions.ExpressionEvaluator;
import xyz.block.genie.state.GenieCompositionLocalsKt;
import xyz.block.genie.state.GenieViewState;
import xyz.block.protos.genie.Expression;

/* loaded from: classes3.dex */
public abstract class ImageUtil {

    public final class CodecFailedException extends Exception {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void ProgressIndicatorView(ComposePlatform.ProgressIndicator progressIndicator, ResolvedStyle resolvedStyle, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        Object failure;
        Throwable th;
        Object obj;
        boolean z;
        long j;
        boolean z2;
        GapComposer gapComposer2;
        GapComposer gapComposer3;
        long j2;
        GapComposer gapComposer4;
        boolean z3;
        Object obj2;
        Color color = resolvedStyle.tint;
        progressIndicator.getClass();
        modifier.getClass();
        GapComposer gapComposer5 = (GapComposer) composer;
        gapComposer5.startRestartGroup(-173414353);
        int i2 = (i & 6) == 0 ? (gapComposer5.changedInstance(progressIndicator) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= gapComposer5.changed(resolvedStyle) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer5.changed(modifier) ? 256 : 128;
        }
        final int i3 = 1;
        if (gapComposer5.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ExpressionEvaluator expressionEvaluator = (ExpressionEvaluator) gapComposer5.consume(GenieCompositionLocalsKt.LocalGenieExpressionEvaluator);
            GenieViewState genieViewState = (GenieViewState) gapComposer5.consume(GenieCompositionLocalsKt.LocalGenieViewState);
            Expression expression = progressIndicator.style;
            if (expression == null) {
                th = null;
                obj = null;
            } else {
                try {
                    Result.Companion companion = Result.Companion;
                    failure = Double.valueOf(expressionEvaluator.evaluate(expression, genieViewState).numericValue());
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th2);
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                Double d = (Double) failure;
                if (d != null) {
                    int doubleValue = (int) d.doubleValue();
                    Object[] objArr = (Enum[]) ComposePlatform.ProgressStyle.class.getEnumConstants();
                    if (objArr != null) {
                        int length = objArr.length;
                        for (int i4 = 0; i4 < length; i4++) {
                            obj = objArr[i4];
                            obj.getClass();
                            th = null;
                            if (((WireEnum) obj).getValue() == doubleValue) {
                                break;
                            }
                        }
                    }
                }
                th = null;
                obj = null;
            }
            ComposePlatform.ProgressStyle progressStyle = (ComposePlatform.ProgressStyle) obj;
            if (progressStyle == null) {
                progressStyle = ComposePlatform.ProgressStyle.PROGRESS_STYLE_LINEAR;
            }
            String evalString = EvalHelpersKt.evalString(expressionEvaluator, genieViewState, progressIndicator.label);
            Double evalDouble = EvalHelpersKt.evalDouble(expressionEvaluator, genieViewState, progressIndicator.value_);
            final Float valueOf = evalDouble != null ? Float.valueOf((float) evalDouble.doubleValue()) : th;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer5, 54);
            int hashCode = Long.hashCode(gapComposer5.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer5.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer5, modifier);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (gapComposer5.applier == null) {
                Updater.invalidApplier();
                throw th;
            }
            gapComposer5.startReusableNode();
            if (gapComposer5.inserting) {
                gapComposer5.createNode(function0);
            } else {
                gapComposer5.useNode();
            }
            Updater.m576setimpl(gapComposer5, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer5, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer5, materializeModifier, ComposeUiNode.Companion.SetModifier);
            int ordinal = progressStyle.ordinal();
            Object obj3 = Composer.Companion.Empty;
            if (ordinal == 0 || ordinal == 1) {
                z = false;
                gapComposer5.startReplaceGroup(1136832327);
                if (color == null) {
                    gapComposer5.startReplaceGroup(590863044);
                    j = ColorSchemeKt.getValue(ProgressIndicatorTokens.ActiveIndicatorColor, gapComposer5);
                    gapComposer5.end(false);
                } else {
                    gapComposer5.startReplaceGroup(590861804);
                    gapComposer5.end(false);
                    j = color.value;
                }
                if (valueOf != 0) {
                    gapComposer5.startReplaceGroup(1136934782);
                    boolean changed = gapComposer5.changed(valueOf);
                    Object rememberedValue = gapComposer5.rememberedValue();
                    Object obj4 = rememberedValue;
                    if (changed || rememberedValue == obj3) {
                        Object obj5 = new Function0() { // from class: com.squareup.cash.moneybot.genie.ProgressIndicatorViewKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                float coerceIn;
                                int i5 = i3;
                                Float f = valueOf;
                                switch (i5) {
                                    case 0:
                                        coerceIn = RangesKt___RangesKt.coerceIn(f.floatValue(), RecyclerView.DECELERATION_RATE, 1.0f);
                                        break;
                                    default:
                                        coerceIn = RangesKt___RangesKt.coerceIn(f.floatValue(), RecyclerView.DECELERATION_RATE, 1.0f);
                                        break;
                                }
                                return Float.valueOf(coerceIn);
                            }
                        };
                        gapComposer5.updateRememberedValue(obj5);
                        obj4 = obj5;
                    }
                    z2 = true;
                    ProgressIndicatorKt.m544LinearProgressIndicatorGJbTh5U((Function0) obj4, null, j, 0L, 0, RecyclerView.DECELERATION_RATE, null, gapComposer5, 0);
                    gapComposer5.end(false);
                } else {
                    z2 = true;
                    gapComposer5.startReplaceGroup(1137045421);
                    ProgressIndicatorKt.m545LinearProgressIndicatorrIrjwxo(null, j, 0L, 0, RecyclerView.DECELERATION_RATE, gapComposer5, 0);
                    gapComposer5.end(false);
                }
                gapComposer5.end(false);
                gapComposer2 = gapComposer5;
            } else {
                if (ordinal != 2) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer5, 590846713, false);
                }
                gapComposer5.startReplaceGroup(1136437697);
                if (color == null) {
                    gapComposer5.startReplaceGroup(590850310);
                    j2 = ColorSchemeKt.getValue(ProgressIndicatorTokens.ActiveIndicatorColor, gapComposer5);
                    gapComposer5.end(false);
                } else {
                    gapComposer5.startReplaceGroup(590849070);
                    gapComposer5.end(false);
                    j2 = color.value;
                }
                if (valueOf != 0) {
                    gapComposer5.startReplaceGroup(1136542012);
                    boolean changed2 = gapComposer5.changed(valueOf);
                    Object rememberedValue2 = gapComposer5.rememberedValue();
                    if (changed2 || rememberedValue2 == obj3) {
                        z3 = false;
                        final boolean z4 = false ? 1 : 0;
                        Object obj6 = new Function0() { // from class: com.squareup.cash.moneybot.genie.ProgressIndicatorViewKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                float coerceIn;
                                int i5 = z4;
                                Float f = valueOf;
                                switch (i5) {
                                    case 0:
                                        coerceIn = RangesKt___RangesKt.coerceIn(f.floatValue(), RecyclerView.DECELERATION_RATE, 1.0f);
                                        break;
                                    default:
                                        coerceIn = RangesKt___RangesKt.coerceIn(f.floatValue(), RecyclerView.DECELERATION_RATE, 1.0f);
                                        break;
                                }
                                return Float.valueOf(coerceIn);
                            }
                        };
                        gapComposer5.updateRememberedValue(obj6);
                        obj2 = obj6;
                    } else {
                        z3 = false;
                        obj2 = rememberedValue2;
                    }
                    long j3 = j2;
                    z2 = true;
                    z = z3;
                    ProgressIndicatorKt.m543CircularProgressIndicatorIyT6zlY((Function0) obj2, null, j3, RecyclerView.DECELERATION_RATE, 0L, 0, RecyclerView.DECELERATION_RATE, gapComposer5, 0);
                    gapComposer5.end(z);
                    gapComposer4 = gapComposer5;
                } else {
                    long j4 = j2;
                    z2 = true;
                    z = false;
                    gapComposer5.startReplaceGroup(1136654635);
                    ProgressIndicatorKt.m542CircularProgressIndicator4lLiAd8(null, j4, RecyclerView.DECELERATION_RATE, 0L, 0, RecyclerView.DECELERATION_RATE, gapComposer5, 0);
                    GapComposer gapComposer6 = gapComposer5;
                    gapComposer6.end(false);
                    gapComposer4 = gapComposer6;
                }
                gapComposer4.end(z);
                gapComposer2 = gapComposer4;
            }
            if (evalString == null) {
                gapComposer2.startReplaceGroup(1137134917);
                gapComposer3 = gapComposer2;
            } else {
                gapComposer2.startReplaceGroup(1137134918);
                TextStyle textStyle = resolvedStyle.textStyle;
                if (textStyle == null) {
                    gapComposer2.startReplaceGroup(-1803734905);
                    textStyle = (TextStyle) gapComposer2.consume(TextKt.LocalTextStyle);
                } else {
                    gapComposer2.startReplaceGroup(-1803735959);
                }
                gapComposer2.end(z);
                GapComposer gapComposer7 = gapComposer2;
                TextKt.m561TextNvy7gAk(evalString, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, textStyle, gapComposer7, 0, 0, 131070);
                gapComposer3 = gapComposer7;
            }
            gapComposer3.end(z);
            gapComposer3.end(z2);
            gapComposer = gapComposer3;
        } else {
            gapComposer5.skipToGroupEnd();
            gapComposer = gapComposer5;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda8(progressIndicator, resolvedStyle, modifier, i, 6);
        }
    }

    public static Bitmap createBitmapFromImageProxy(ImageProxy imageProxy) {
        int format2 = imageProxy.getFormat();
        if (format2 == 1) {
            Bitmap createBitmap = Bitmap.createBitmap(imageProxy.getWidth(), imageProxy.getHeight(), Bitmap.Config.ARGB_8888);
            imageProxy.getPlanes()[0].getBuffer().rewind();
            ImageProcessingUtil.copyByteBufferToBitmap(createBitmap, imageProxy.getPlanes()[0].getBuffer(), imageProxy.getPlanes()[0].getRowStride());
            return createBitmap;
        }
        if (format2 == 35) {
            return ImageProcessingUtil.convertYUVToBitmap(imageProxy);
        }
        if (format2 != 256 && format2 != 4101) {
            Mod$$ExternalSyntheticBUOutline0.m("Incorrect image format of the input image proxy: ", imageProxy.getFormat(), ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
            return null;
        }
        if (!isJpegFormats(imageProxy.getFormat())) {
            a$$ExternalSyntheticBUOutline0.m(imageProxy.getFormat(), "Incorrect image format of the input image proxy: ");
            return null;
        }
        ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
        int capacity = buffer.capacity();
        byte[] bArr = new byte[capacity];
        buffer.rewind();
        buffer.get(bArr);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, capacity, null);
        if (decodeByteArray != null) {
            return decodeByteArray;
        }
        a$$ExternalSyntheticBUOutline0.m("Decode jpeg byte array failed");
        return null;
    }

    public static boolean isJpegFormats(int i) {
        return i == 256 || i == 4101;
    }

    public static SpringSpec urgent$default(zzc zzcVar) {
        return new SpringSpec(0.48f, 600.0f, null);
    }

    public static byte[] yuvImageToJpegByteArray(ImageProxy imageProxy, Rect rect, int i, int i2) {
        if (imageProxy.getFormat() != 35) {
            a$$ExternalSyntheticBUOutline0.m(imageProxy.getFormat(), "Incorrect image format of the input image proxy: ");
            return null;
        }
        ImageProxy.PlaneProxy planeProxy = imageProxy.getPlanes()[0];
        ImageProxy.PlaneProxy planeProxy2 = imageProxy.getPlanes()[1];
        int i3 = 2;
        ImageProxy.PlaneProxy planeProxy3 = imageProxy.getPlanes()[2];
        ByteBuffer buffer = planeProxy.getBuffer();
        ByteBuffer buffer2 = planeProxy2.getBuffer();
        ByteBuffer buffer3 = planeProxy3.getBuffer();
        buffer.rewind();
        buffer2.rewind();
        buffer3.rewind();
        int remaining = buffer.remaining();
        byte[] bArr = new byte[((imageProxy.getHeight() * imageProxy.getWidth()) / 2) + remaining];
        int i4 = 0;
        for (int i5 = 0; i5 < imageProxy.getHeight(); i5++) {
            buffer.get(bArr, i4, imageProxy.getWidth());
            i4 += imageProxy.getWidth();
            buffer.position(Math.min(remaining, planeProxy.getRowStride() + (buffer.position() - imageProxy.getWidth())));
        }
        int height = imageProxy.getHeight() / 2;
        int width = imageProxy.getWidth() / 2;
        int rowStride = planeProxy3.getRowStride();
        int rowStride2 = planeProxy2.getRowStride();
        int pixelStride = planeProxy3.getPixelStride();
        int pixelStride2 = planeProxy2.getPixelStride();
        byte[] bArr2 = new byte[rowStride];
        byte[] bArr3 = new byte[rowStride2];
        int i6 = 0;
        while (i6 < height) {
            int i7 = i3;
            buffer3.get(bArr2, 0, Math.min(rowStride, buffer3.remaining()));
            buffer2.get(bArr3, 0, Math.min(rowStride2, buffer2.remaining()));
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < width; i10++) {
                int i11 = i4 + 1;
                bArr[i4] = bArr2[i8];
                i4 += 2;
                bArr[i11] = bArr3[i9];
                i8 += pixelStride;
                i9 += pixelStride2;
            }
            i6++;
            i3 = i7;
        }
        int i12 = i3;
        YuvImage yuvImage = new YuvImage(bArr, 17, imageProxy.getWidth(), imageProxy.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ExifTag[] exifTagArr = ExifData.EXIF_POINTER_TAGS;
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        final ExifData.Builder builder = new ExifData.Builder();
        String valueOf = String.valueOf(1);
        ArrayList arrayList = builder.mAttributes;
        builder.setAttributeInternal("Orientation", valueOf, arrayList);
        builder.setAttributeInternal("XResolution", "72/1", arrayList);
        builder.setAttributeInternal("YResolution", "72/1", arrayList);
        builder.setAttributeInternal("ResolutionUnit", String.valueOf(i12), arrayList);
        builder.setAttributeInternal("YCbCrPositioning", String.valueOf(1), arrayList);
        builder.setAttributeInternal("Make", Build.MANUFACTURER, arrayList);
        builder.setAttributeInternal("Model", Build.MODEL, arrayList);
        if (imageProxy.getImageInfo() != null) {
            imageProxy.getImageInfo().populateExifData(builder);
        }
        builder.setOrientationDegrees(i2);
        builder.setAttributeInternal("ImageWidth", String.valueOf(imageProxy.getWidth()), arrayList);
        builder.setAttributeInternal("ImageLength", String.valueOf(imageProxy.getHeight()), arrayList);
        ArrayList list = Collections.list(new Enumeration(builder) { // from class: androidx.camera.core.impl.utils.ExifData.Builder.3
            public final Enumeration mMapEnumeration;

            public AnonymousClass3(final Builder builder2) {
                this.mMapEnumeration = Collections.enumeration(builder2.mAttributes);
            }

            @Override // java.util.Enumeration
            public final boolean hasMoreElements() {
                return this.mMapEnumeration.hasMoreElements();
            }

            @Override // java.util.Enumeration
            public final Object nextElement() {
                return new HashMap((Map) this.mMapEnumeration.nextElement());
            }
        });
        if (!((Map) list.get(1)).isEmpty()) {
            builder2.setAttributeIfMissing("ExposureProgram", String.valueOf(0), list);
            builder2.setAttributeIfMissing("ExifVersion", "0230", list);
            builder2.setAttributeIfMissing("ComponentsConfiguration", ExifData.COMPONENTS_CONFIGURATION_YCBCR, list);
            builder2.setAttributeIfMissing("MeteringMode", String.valueOf(0), list);
            builder2.setAttributeIfMissing("LightSource", String.valueOf(0), list);
            builder2.setAttributeIfMissing("FlashpixVersion", "0100", list);
            builder2.setAttributeIfMissing("FocalPlaneResolutionUnit", String.valueOf(i12), list);
            builder2.setAttributeIfMissing("FileSource", String.valueOf(3), list);
            builder2.setAttributeIfMissing("SceneType", String.valueOf(1), list);
            builder2.setAttributeIfMissing("CustomRendered", String.valueOf(0), list);
            builder2.setAttributeIfMissing("SceneCaptureType", String.valueOf(0), list);
            builder2.setAttributeIfMissing("Contrast", String.valueOf(0), list);
            builder2.setAttributeIfMissing("Saturation", String.valueOf(0), list);
            builder2.setAttributeIfMissing("Sharpness", String.valueOf(0), list);
        }
        if (!((Map) list.get(i12)).isEmpty()) {
            builder2.setAttributeIfMissing("GPSVersionID", "2300", list);
            builder2.setAttributeIfMissing("GPSSpeedRef", "K", list);
            builder2.setAttributeIfMissing("GPSTrackRef", "T", list);
            builder2.setAttributeIfMissing("GPSImgDirectionRef", "T", list);
            builder2.setAttributeIfMissing("GPSDestBearingRef", "T", list);
            builder2.setAttributeIfMissing("GPSDestDistanceRef", "K", list);
        }
        if (yuvImage.compressToJpeg(rect == null ? new Rect(0, 0, imageProxy.getWidth(), imageProxy.getHeight()) : rect, i, new ExifOutputStream(byteArrayOutputStream, new ExifData(builder2.mByteOrder, list)))) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new CodecFailedException("YuvImage failed to encode jpeg.");
    }
}
