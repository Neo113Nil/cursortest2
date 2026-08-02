package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class LinearGradient extends ShaderBrush {
    public final List colors;
    public final long end;
    public final long start;
    public final List stops;

    public LinearGradient(List list, ArrayList arrayList, long j, long j2) {
        this.colors = list;
        this.stops = arrayList;
        this.start = j;
        this.end = j2;
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public final Shader mo671createShaderuvyYCjk(long j) {
        long j2 = this.start;
        int i = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j >> 32);
        }
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & BodyPartID.bodyIdMax);
        if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
            i2 = (int) (j & BodyPartID.bodyIdMax);
        }
        float intBitsToFloat2 = Float.intBitsToFloat(i2);
        long j3 = this.end;
        int i3 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float intBitsToFloat3 = Float.intBitsToFloat(i3);
        int i4 = (int) (j3 & BodyPartID.bodyIdMax);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & BodyPartID.bodyIdMax);
        }
        float intBitsToFloat4 = Float.intBitsToFloat(i4);
        return ShaderKt.m712LinearGradientShaderVjE6UOU((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & BodyPartID.bodyIdMax), this.colors, this.stops);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinearGradient)) {
            return false;
        }
        LinearGradient linearGradient = (LinearGradient) obj;
        return Intrinsics.areEqual(this.colors, linearGradient.colors) && Intrinsics.areEqual(this.stops, linearGradient.stops) && Offset.m622equalsimpl0(this.start, linearGradient.start) && Offset.m622equalsimpl0(this.end, linearGradient.end);
    }

    public final int hashCode() {
        int hashCode = this.colors.hashCode() * 31;
        List list = this.stops;
        return Integer.hashCode(0) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode + (list != null ? list.hashCode() : 0)) * 31, 31, this.start), 31, this.end);
    }

    public final String toString() {
        String str;
        long j = this.start;
        String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) Offset.m628toStringimpl(j)) + ", ";
        } else {
            str = "";
        }
        long j2 = this.end;
        if (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) Offset.m628toStringimpl(j2)) + ", ";
        }
        StringBuilder sb = new StringBuilder("LinearGradient(colors=");
        sb.append(this.colors);
        sb.append(", stops=");
        Recorder$$ExternalSyntheticOutline2.m(", ", str, str2, sb, this.stops);
        sb.append("tileMode=");
        sb.append((Object) TileMode.m713toStringimpl(0));
        sb.append(')');
        return sb.toString();
    }
}
