package com.miteksystems.misnap.core.internal;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a¨\u0006!"}, d2 = {"Lcom/miteksystems/misnap/core/internal/DecodedImage;", "", "", "component1", "", "component2", "component3", "component4", "data", "width", "height", "bytesPerPixel", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "[B", "getData", "()[B", "b", "I", "getWidth", "()I", "c", "getHeight", "d", "getBytesPerPixel", "<init>", "([BIII)V", "core_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
final /* data */ class DecodedImage {

    /* renamed from: a, reason: from kotlin metadata */
    public final byte[] data;

    /* renamed from: b, reason: from kotlin metadata */
    public final int width;

    /* renamed from: c, reason: from kotlin metadata */
    public final int height;

    /* renamed from: d, reason: from kotlin metadata */
    public final int bytesPerPixel;

    public DecodedImage(byte[] bArr, int i, int i2, int i3) {
        bArr.getClass();
        this.data = bArr;
        this.width = i;
        this.height = i2;
        this.bytesPerPixel = i3;
    }

    public static /* synthetic */ DecodedImage copy$default(DecodedImage decodedImage, byte[] bArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            bArr = decodedImage.data;
        }
        if ((i4 & 2) != 0) {
            i = decodedImage.width;
        }
        if ((i4 & 4) != 0) {
            i2 = decodedImage.height;
        }
        if ((i4 & 8) != 0) {
            i3 = decodedImage.bytesPerPixel;
        }
        return decodedImage.copy(bArr, i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component3, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component4, reason: from getter */
    public final int getBytesPerPixel() {
        return this.bytesPerPixel;
    }

    public final DecodedImage copy(byte[] data, int width, int height, int bytesPerPixel) {
        data.getClass();
        return new DecodedImage(data, width, height, bytesPerPixel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DecodedImage)) {
            return false;
        }
        DecodedImage decodedImage = (DecodedImage) other;
        return Intrinsics.areEqual(this.data, decodedImage.data) && this.width == decodedImage.width && this.height == decodedImage.height && this.bytesPerPixel == decodedImage.bytesPerPixel;
    }

    public final int getBytesPerPixel() {
        return this.bytesPerPixel;
    }

    public final byte[] getData() {
        return this.data;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Integer.hashCode(this.bytesPerPixel) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.height, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.width, Arrays.hashCode(this.data) * 31, 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DecodedImage(data=");
        sb.append(Arrays.toString(this.data));
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", bytesPerPixel=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.bytesPerPixel, ')');
    }
}
