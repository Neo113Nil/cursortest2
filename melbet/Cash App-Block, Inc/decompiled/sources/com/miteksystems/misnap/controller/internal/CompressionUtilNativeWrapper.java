package com.miteksystems.misnap.controller.internal;

import android.content.Context;
import android.graphics.Rect;
import android.util.Size;
import com.miteksystems.misnap.controller.AnalysisSettings;
import com.miteksystems.misnap.controller.MiSnapController;
import com.miteksystems.misnap.controller.a.b0;
import com.miteksystems.misnap.controller.a.w;
import com.miteksystems.misnap.core.DateUtil;
import com.miteksystems.misnap.core.ExifUtil;
import com.miteksystems.misnap.core.Frame;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.MibiData;
import com.miteksystems.misnap.core.internal.ContextHelper;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0013J`\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u000bH\u0082 ¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/miteksystems/misnap/controller/internal/CompressionUtilNativeWrapper;", "", "Lcom/miteksystems/misnap/core/Frame;", "frame", "", "quality", "", "isAiBasedRtsEnabled", "", "Landroid/graphics/Rect;", "redactionRects", "", "Lorg/apache/commons/imaging/formats/tiff/taginfos/TagInfo;", "", "metadata", "map", "Lcom/miteksystems/misnap/controller/MiSnapController$Container;", "process", "(Lcom/miteksystems/misnap/core/Frame;IZLjava/util/List;Ljava/util/Map;Ljava/util/Map;)Lcom/miteksystems/misnap/controller/MiSnapController$Container;", "FrameWrapper", "controller_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class CompressionUtilNativeWrapper {
    public final Object a = new Object();

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J1\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\tHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u001a\u0010\u000b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\r\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/miteksystems/misnap/controller/internal/CompressionUtilNativeWrapper$FrameWrapper;", "Lcom/miteksystems/misnap/core/Frame;", "", "close", "Landroid/util/Size;", "component1", "", "component2", "component3", "", "component4", "imageSize", "imageFormat", "rotationDegrees", "imageBytes", "copy", "", "toString", "hashCode", "", "other", "", "equals", "a", "Landroid/util/Size;", "getImageSize", "()Landroid/util/Size;", "b", "I", "getImageFormat", "()I", "c", "getRotationDegrees", "d", "[B", "getImageBytes", "()[B", "<init>", "(Landroid/util/Size;II[B)V", "controller_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class FrameWrapper implements Frame {

        /* renamed from: a, reason: from kotlin metadata */
        public final Size imageSize;

        /* renamed from: b, reason: from kotlin metadata */
        public final int imageFormat;

        /* renamed from: c, reason: from kotlin metadata */
        public final int rotationDegrees;

        /* renamed from: d, reason: from kotlin metadata */
        public final byte[] imageBytes;

        public FrameWrapper(Size size, int i, int i2, byte[] bArr) {
            size.getClass();
            bArr.getClass();
            this.imageSize = size;
            this.imageFormat = i;
            this.rotationDegrees = i2;
            this.imageBytes = bArr;
        }

        public static /* synthetic */ FrameWrapper copy$default(FrameWrapper frameWrapper, Size size, int i, int i2, byte[] bArr, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                size = frameWrapper.getImageSize();
            }
            if ((i3 & 2) != 0) {
                i = frameWrapper.getImageFormat();
            }
            if ((i3 & 4) != 0) {
                i2 = frameWrapper.getRotationDegrees();
            }
            if ((i3 & 8) != 0) {
                bArr = frameWrapper.getImageBytes();
            }
            return frameWrapper.copy(size, i, i2, bArr);
        }

        @Override // com.miteksystems.misnap.core.Frame
        public void close() {
        }

        public final Size component1() {
            return getImageSize();
        }

        public final int component2() {
            return getImageFormat();
        }

        public final int component3() {
            return getRotationDegrees();
        }

        public final byte[] component4() {
            return getImageBytes();
        }

        public final FrameWrapper copy(Size imageSize, int imageFormat, int rotationDegrees, byte[] imageBytes) {
            imageSize.getClass();
            imageBytes.getClass();
            return new FrameWrapper(imageSize, imageFormat, rotationDegrees, imageBytes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FrameWrapper)) {
                return false;
            }
            FrameWrapper frameWrapper = (FrameWrapper) other;
            return Intrinsics.areEqual(getImageSize(), frameWrapper.getImageSize()) && getImageFormat() == frameWrapper.getImageFormat() && getRotationDegrees() == frameWrapper.getRotationDegrees() && Intrinsics.areEqual(getImageBytes(), frameWrapper.getImageBytes());
        }

        @Override // com.miteksystems.misnap.core.Frame
        public Frame.FrameInfo[] getFrameInfos() {
            return Frame.DefaultImpls.getFrameInfos(this);
        }

        @Override // com.miteksystems.misnap.core.Frame
        public byte[] getImageBytes() {
            return this.imageBytes;
        }

        @Override // com.miteksystems.misnap.core.Frame
        public int getImageFormat() {
            return this.imageFormat;
        }

        @Override // com.miteksystems.misnap.core.Frame
        public Size getImageSize() {
            return this.imageSize;
        }

        @Override // com.miteksystems.misnap.core.Frame
        public int getRotationDegrees() {
            return this.rotationDegrees;
        }

        public int hashCode() {
            return Arrays.hashCode(getImageBytes()) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(getRotationDegrees(), JsonLogicResult$Success$$ExternalSyntheticOutline0.m(getImageFormat(), getImageSize().hashCode() * 31, 31), 31);
        }

        public String toString() {
            return "FrameWrapper(imageSize=" + getImageSize() + ", imageFormat=" + getImageFormat() + ", rotationDegrees=" + getRotationDegrees() + ", imageBytes=" + Arrays.toString(getImageBytes()) + ')';
        }
    }

    private final native MiSnapController.Container process(Frame frame, int quality, boolean isAiBasedRtsEnabled, List<Rect> redactionRects, Map<TagInfo, String> metadata, Map<String, ? extends Object> map);

    public final MiSnapController.Container a(Frame frame, MiSnapSettings miSnapSettings, b0 b0Var, Context context) {
        Map<String, ? extends Object> map;
        MiSnapController.Container process;
        frame.getClass();
        miSnapSettings.getClass();
        b0Var.getClass();
        context.getClass();
        synchronized (this.a) {
            try {
                int imageQuality = AnalysisSettings.getImageQuality(miSnapSettings.analysis, miSnapSettings.a);
                boolean shouldEnableAiBasedRts = AnalysisSettings.shouldEnableAiBasedRts(miSnapSettings.analysis, miSnapSettings.a);
                List<Rect> a = w.a(b0Var, miSnapSettings) ? w.a(b0Var) : EmptyList.INSTANCE;
                Map<TagInfo, String> mapOf = MapsKt__MapsKt.mapOf(new Pair(ExifTagConstants.EXIF_TAG_USER_COMMENT, MibiData.toJsonString(context)), new Pair(ExifTagConstants.EXIF_TAG_DATE_TIME_ORIGINAL, DateUtil.getUtcDateFormat("yyyy:MM:dd HH:mm:ss").format(new Date(DateUtil.getUtcCalendar().getTimeInMillis()))), new Pair(ExifUtil.a, "+00:00"));
                synchronized (ContextHelper.a) {
                    map = MapsKt__MapsKt.toMap(ContextHelper.b);
                }
                process = process(frame, imageQuality, shouldEnableAiBasedRts, a, mapOf, map);
            } catch (Throwable th) {
                throw th;
            }
        }
        return process;
    }
}
