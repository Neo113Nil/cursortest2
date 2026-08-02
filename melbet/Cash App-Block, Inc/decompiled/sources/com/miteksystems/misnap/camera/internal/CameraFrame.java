package com.miteksystems.misnap.camera.internal;

import android.util.Size;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.core.ImageProxy;
import com.miteksystems.misnap.core.Frame;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0080\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b<\u0010=J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000fHÀ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0003J`\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\t2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u001e\u001a\u00020\u0013HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\u0013\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003R\u001a\u0010\u0015\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0016\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u0017\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u001a\u0010\u0018\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u000eR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u0011R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lcom/miteksystems/misnap/camera/internal/CameraFrame;", "Lcom/miteksystems/misnap/core/Frame;", "", "close", "Landroid/util/Size;", "component1", "", "component2", "component3", "", "component4", "", "Lcom/miteksystems/misnap/core/Frame$FrameInfo;", "component5", "()[Lcom/miteksystems/misnap/core/Frame$FrameInfo;", "Landroidx/camera/core/ImageProxy;", "component6$camera_release", "()Landroidx/camera/core/ImageProxy;", "component6", "", "component7", "imageSize", "imageFormat", "rotationDegrees", "imageBytes", "frameInfos", "imageProxy", "metadata", "copy", "(Landroid/util/Size;II[B[Lcom/miteksystems/misnap/core/Frame$FrameInfo;Landroidx/camera/core/ImageProxy;Ljava/lang/String;)Lcom/miteksystems/misnap/camera/internal/CameraFrame;", "toString", "hashCode", "", "other", "", "equals", "a", "Landroid/util/Size;", "getImageSize", "()Landroid/util/Size;", "b", "I", "getImageFormat", "()I", "c", "getRotationDegrees", "d", "[B", "getImageBytes", "()[B", "e", "[Lcom/miteksystems/misnap/core/Frame$FrameInfo;", "getFrameInfos", "f", "Landroidx/camera/core/ImageProxy;", "getImageProxy$camera_release", "g", "Ljava/lang/String;", "getMetadata", "()Ljava/lang/String;", "<init>", "(Landroid/util/Size;II[B[Lcom/miteksystems/misnap/core/Frame$FrameInfo;Landroidx/camera/core/ImageProxy;Ljava/lang/String;)V", "camera_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final /* data */ class CameraFrame implements Frame {

    /* renamed from: a, reason: from kotlin metadata */
    public final Size imageSize;

    /* renamed from: b, reason: from kotlin metadata */
    public final int imageFormat;

    /* renamed from: c, reason: from kotlin metadata */
    public final int rotationDegrees;

    /* renamed from: d, reason: from kotlin metadata */
    public final byte[] imageBytes;

    /* renamed from: e, reason: from kotlin metadata */
    public final Frame.FrameInfo[] frameInfos;

    /* renamed from: f, reason: from kotlin metadata */
    public final /* synthetic */ ImageProxy imageProxy;

    /* renamed from: g, reason: from kotlin metadata */
    public final String metadata;

    public CameraFrame(Size size, int i, int i2, byte[] bArr, Frame.FrameInfo[] frameInfoArr, ImageProxy imageProxy, String str) {
        size.getClass();
        bArr.getClass();
        frameInfoArr.getClass();
        this.imageSize = size;
        this.imageFormat = i;
        this.rotationDegrees = i2;
        this.imageBytes = bArr;
        this.frameInfos = frameInfoArr;
        this.imageProxy = imageProxy;
        this.metadata = str;
    }

    public static /* synthetic */ CameraFrame copy$default(CameraFrame cameraFrame, Size size, int i, int i2, byte[] bArr, Frame.FrameInfo[] frameInfoArr, ImageProxy imageProxy, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            size = cameraFrame.getImageSize();
        }
        if ((i3 & 2) != 0) {
            i = cameraFrame.getImageFormat();
        }
        if ((i3 & 4) != 0) {
            i2 = cameraFrame.getRotationDegrees();
        }
        if ((i3 & 8) != 0) {
            bArr = cameraFrame.getImageBytes();
        }
        if ((i3 & 16) != 0) {
            frameInfoArr = cameraFrame.getFrameInfos();
        }
        if ((i3 & 32) != 0) {
            imageProxy = cameraFrame.imageProxy;
        }
        if ((i3 & 64) != 0) {
            str = cameraFrame.metadata;
        }
        ImageProxy imageProxy2 = imageProxy;
        String str2 = str;
        Frame.FrameInfo[] frameInfoArr2 = frameInfoArr;
        int i4 = i2;
        return cameraFrame.copy(size, i, i4, bArr, frameInfoArr2, imageProxy2, str2);
    }

    @Override // com.miteksystems.misnap.core.Frame
    public void close() {
        ImageProxy imageProxy = this.imageProxy;
        if (imageProxy != null) {
            imageProxy.close();
        }
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

    public final Frame.FrameInfo[] component5() {
        return getFrameInfos();
    }

    /* renamed from: component6$camera_release, reason: from getter */
    public final ImageProxy getImageProxy() {
        return this.imageProxy;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMetadata() {
        return this.metadata;
    }

    public final CameraFrame copy(Size imageSize, int imageFormat, int rotationDegrees, byte[] imageBytes, Frame.FrameInfo[] frameInfos, ImageProxy imageProxy, String metadata) {
        imageSize.getClass();
        imageBytes.getClass();
        frameInfos.getClass();
        return new CameraFrame(imageSize, imageFormat, rotationDegrees, imageBytes, frameInfos, imageProxy, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraFrame)) {
            return false;
        }
        CameraFrame cameraFrame = (CameraFrame) other;
        return Intrinsics.areEqual(getImageSize(), cameraFrame.getImageSize()) && getImageFormat() == cameraFrame.getImageFormat() && getRotationDegrees() == cameraFrame.getRotationDegrees() && Intrinsics.areEqual(getImageBytes(), cameraFrame.getImageBytes()) && Intrinsics.areEqual(getFrameInfos(), cameraFrame.getFrameInfos()) && Intrinsics.areEqual(this.imageProxy, cameraFrame.imageProxy) && Intrinsics.areEqual(this.metadata, cameraFrame.metadata);
    }

    @Override // com.miteksystems.misnap.core.Frame
    public Frame.FrameInfo[] getFrameInfos() {
        return this.frameInfos;
    }

    @Override // com.miteksystems.misnap.core.Frame
    public byte[] getImageBytes() {
        return this.imageBytes;
    }

    @Override // com.miteksystems.misnap.core.Frame
    public int getImageFormat() {
        return this.imageFormat;
    }

    public final ImageProxy getImageProxy$camera_release() {
        return this.imageProxy;
    }

    @Override // com.miteksystems.misnap.core.Frame
    public Size getImageSize() {
        return this.imageSize;
    }

    public final String getMetadata() {
        return this.metadata;
    }

    @Override // com.miteksystems.misnap.core.Frame
    public int getRotationDegrees() {
        return this.rotationDegrees;
    }

    public int hashCode() {
        int hashCode = (Arrays.hashCode(getFrameInfos()) + ((Arrays.hashCode(getImageBytes()) + ((Integer.hashCode(getRotationDegrees()) + ((Integer.hashCode(getImageFormat()) + (getImageSize().hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        ImageProxy imageProxy = this.imageProxy;
        int hashCode2 = (hashCode + (imageProxy == null ? 0 : imageProxy.hashCode())) * 31;
        String str = this.metadata;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CameraFrame(imageSize=");
        sb.append(getImageSize());
        sb.append(", imageFormat=");
        sb.append(getImageFormat());
        sb.append(", rotationDegrees=");
        sb.append(getRotationDegrees());
        sb.append(", imageBytes=");
        sb.append(Arrays.toString(getImageBytes()));
        sb.append(", frameInfos=");
        sb.append(Arrays.toString(getFrameInfos()));
        sb.append(", imageProxy=");
        sb.append(this.imageProxy);
        sb.append(", metadata=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.metadata, ')');
    }

    public /* synthetic */ CameraFrame(Size size, int i, int i2, byte[] bArr, Frame.FrameInfo[] frameInfoArr, ImageProxy imageProxy, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(size, i, i2, bArr, frameInfoArr, (i3 & 32) != 0 ? null : imageProxy, (i3 & 64) != 0 ? null : str);
    }
}
