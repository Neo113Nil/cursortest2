package com.miteksystems.misnap.camera.frameproducers;

import android.util.Size;
import com.miteksystems.misnap.core.Frame;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements Frame {
    public final Size a;
    public final int c;
    public final byte[] d;
    public final Function0 e;

    public a(Size size, int i, byte[] bArr, Function0 function0) {
        bArr.getClass();
        this.a = size;
        this.c = i;
        this.d = bArr;
        this.e = function0;
    }

    @Override // com.miteksystems.misnap.core.Frame
    public final void close() {
        this.e.invoke();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.c == aVar.c && Intrinsics.areEqual(this.d, aVar.d) && this.e.equals(aVar.e);
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
        return 256;
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
        return this.e.hashCode() + ((Arrays.hashCode(this.d) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.c, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(256, this.a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "TestFrame(imageSize=" + this.a + ", imageFormat=256, rotationDegrees=" + this.c + ", imageBytes=" + Arrays.toString(this.d) + ", closeCallBack=" + this.e + ')';
    }
}
