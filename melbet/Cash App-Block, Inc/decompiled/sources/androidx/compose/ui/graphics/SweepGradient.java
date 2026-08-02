package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.geometry.Offset;
import coil3.size.DimensionKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class SweepGradient extends ShaderBrush {
    public final long center;
    public final List colors;

    public SweepGradient(long j, List list) {
        this.center = j;
        this.colors = list;
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public final Shader mo671createShaderuvyYCjk(long j) {
        long floatToRawIntBits;
        long j2 = this.center;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            floatToRawIntBits = DimensionKt.m1466getCenteruvyYCjk(j);
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            float intBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & BodyPartID.bodyIdMax);
            float intBitsToFloat2 = Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY ? Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) : Float.intBitsToFloat(i2);
            floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        }
        List list = this.colors;
        AndroidShader_androidKt.validateColorStops(list, null);
        return new android.graphics.SweepGradient(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & BodyPartID.bodyIdMax)), AndroidShader_androidKt.makeTransparentColors(list), (float[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SweepGradient)) {
            return false;
        }
        SweepGradient sweepGradient = (SweepGradient) obj;
        return Offset.m622equalsimpl0(this.center, sweepGradient.center) && Intrinsics.areEqual(this.colors, sweepGradient.colors);
    }

    public final int hashCode() {
        return Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.center) * 31, 31, this.colors);
    }

    public final String toString() {
        String str;
        long j = this.center;
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            str = "center=" + ((Object) Offset.m628toStringimpl(j)) + ", ";
        } else {
            str = "";
        }
        return CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("SweepGradient(", str, "colors="), this.colors, ", stops=null)");
    }
}
