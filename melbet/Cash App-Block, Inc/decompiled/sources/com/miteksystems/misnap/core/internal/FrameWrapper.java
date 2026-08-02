package com.miteksystems.misnap.core.internal;

import android.util.Size;
import com.miteksystems.misnap.core.Frame;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class FrameWrapper implements Frame {
    public final Size a;
    public final int b;
    public final int c;
    public final byte[] d;

    public FrameWrapper(Size size, int i, int i2, byte[] bArr) {
        bArr.getClass();
        this.a = size;
        this.b = i;
        this.c = i2;
        this.d = bArr;
    }

    @Override // com.miteksystems.misnap.core.Frame
    public final void close() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrameWrapper)) {
            return false;
        }
        FrameWrapper frameWrapper = (FrameWrapper) obj;
        return this.a.equals(frameWrapper.a) && this.b == frameWrapper.b && this.c == frameWrapper.c && Intrinsics.areEqual(this.d, frameWrapper.d);
    }

    @Override // com.miteksystems.misnap.core.Frame
    public final Frame.FrameInfo[] getFrameInfos() {
        return Frame.DefaultImpls.getFrameInfos(this);
    }

    @Override // com.miteksystems.misnap.core.Frame
    public final byte[] getImageBytes() {
        return this.d;
    }

    @Override // com.miteksystems.misnap.core.Frame
    public final int getImageFormat() {
        return this.b;
    }

    @Override // com.miteksystems.misnap.core.Frame
    public final Size getImageSize() {
        return this.a;
    }

    @Override // com.miteksystems.misnap.core.Frame
    public final int getRotationDegrees() {
        return this.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.d) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.c, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "FrameWrapper(imageSize=" + this.a + ", imageFormat=" + this.b + ", rotationDegrees=" + this.c + ", imageBytes=" + Arrays.toString(this.d) + ')';
    }
}
