package androidx.compose.material3;

import android.graphics.DashPathEffect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPathEffect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final /* synthetic */ class DividerKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ DividerKt$$ExternalSyntheticLambda0(float f, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = f;
        this.f$1 = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        float f = this.f$0;
        switch (i) {
            case 0:
                DrawScope drawScope = (DrawScope) obj;
                drawScope.mo729drawLineNGM6Ib0(this.f$1, (Float.floatToRawIntBits(drawScope.mo236toPx0680j_4(f) / 2.0f) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(drawScope.mo236toPx0680j_4(f) / 2.0f) & BodyPartID.bodyIdMax), (r23 & 8) != 0 ? 0.0f : drawScope.mo236toPx0680j_4(f), (r23 & 16) != 0 ? 0 : 0, (r23 & 32) != 0 ? null : null, (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
                break;
            case 1:
                DrawScope drawScope2 = (DrawScope) obj;
                drawScope2.getClass();
                float intBitsToFloat = Float.intBitsToFloat((int) (drawScope2.mo753getSizeNHjbRc() >> 32)) / 2.0f;
                long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope2.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) / 2.0f) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope2.mo753getSizeNHjbRc() >> 32)) - (f * 2.0f);
                long floatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope2.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) - r6) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat2) << 32);
                AndroidPath Path = AndroidPath_androidKt.Path();
                AndroidPath.addRect$default(Path, DBUtil.m1180Recttz77jQw(0L, drawScope2.mo753getSizeNHjbRc()));
                AndroidPath Path2 = AndroidPath_androidKt.Path();
                Rect m1180Recttz77jQw = DBUtil.m1180Recttz77jQw(Offset.m625minusMKHz9U(floatToRawIntBits, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (floatToRawIntBits2 >> 32)) / 2.0f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (floatToRawIntBits2 & BodyPartID.bodyIdMax)) / 2.0f) & BodyPartID.bodyIdMax)), floatToRawIntBits2);
                float mo236toPx0680j_4 = drawScope2.mo236toPx0680j_4(16.0f);
                long floatToRawIntBits3 = (Float.floatToRawIntBits(mo236toPx0680j_4) << 32) | (Float.floatToRawIntBits(mo236toPx0680j_4) & BodyPartID.bodyIdMax);
                AndroidPath.addRoundRect$default(Path2, Strings.RoundRect(m1180Recttz77jQw.left, m1180Recttz77jQw.top, m1180Recttz77jQw.right, m1180Recttz77jQw.bottom, Float.intBitsToFloat((int) (floatToRawIntBits3 >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits3 & BodyPartID.bodyIdMax))));
                AndroidPath Path3 = AndroidPath_androidKt.Path();
                if (!Path3.m665opN5in7k0(Path, Path2, 0)) {
                    a$$ExternalSyntheticBUOutline0.m$3("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
                    break;
                } else {
                    DrawScope.m745drawPathLG529CI$default(drawScope2, Path3, this.f$1, RecyclerView.DECELERATION_RATE, null, 60);
                    break;
                }
            case 2:
                DrawScope drawScope3 = (DrawScope) obj;
                drawScope3.getClass();
                drawScope3.mo729drawLineNGM6Ib0(this.f$1, (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(drawScope3.mo236toPx0680j_4(f)) & BodyPartID.bodyIdMax), (r23 & 8) != 0 ? 0.0f : drawScope3.mo236toPx0680j_4(2.0f), (r23 & 16) != 0 ? 0 : 0, (r23 & 32) != 0 ? null : new AndroidPathEffect(new DashPathEffect(new float[]{drawScope3.mo236toPx0680j_4(3.0f), drawScope3.mo236toPx0680j_4(3.0f)}, RecyclerView.DECELERATION_RATE)), (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
                break;
            case 3:
                DrawScope drawScope4 = (DrawScope) obj;
                drawScope4.getClass();
                DrawScope.m737drawArcyD3GUKo$default(drawScope4, this.f$1, -90.0f, RangesKt___RangesKt.coerceIn(f, RecyclerView.DECELERATION_RATE, 1.0f) * 360.0f, 0L, 0L, RecyclerView.DECELERATION_RATE, new Stroke(drawScope4.mo236toPx0680j_4(2.0f), RecyclerView.DECELERATION_RATE, 1, 0, null, 26), 880);
                break;
            case 4:
                DrawScope drawScope5 = (DrawScope) obj;
                drawScope5.getClass();
                DrawScope.m747drawRectnJ9OG0$default(drawScope5, this.f$1, 0L, 0L, this.f$0, null, null, 0, 118);
                break;
            case 5:
                DrawScope drawScope6 = (DrawScope) obj;
                drawScope6.getClass();
                long floatToRawIntBits4 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope6.mo752getCenterF1C5BW0() >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope6.mo752getCenterF1C5BW0() & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax);
                float intBitsToFloat3 = Float.intBitsToFloat((int) (drawScope6.mo752getCenterF1C5BW0() >> 32)) * 2.0f;
                float intBitsToFloat4 = Float.intBitsToFloat((int) (drawScope6.mo752getCenterF1C5BW0() & BodyPartID.bodyIdMax));
                long floatToRawIntBits5 = Float.floatToRawIntBits(intBitsToFloat3);
                long floatToRawIntBits6 = Float.floatToRawIntBits(intBitsToFloat4) & BodyPartID.bodyIdMax;
                float f2 = this.f$0;
                float f3 = 2.0f * f2;
                drawScope6.mo729drawLineNGM6Ib0(this.f$1, floatToRawIntBits4, floatToRawIntBits6 | (floatToRawIntBits5 << 32), (r23 & 8) != 0 ? 0.0f : f2, (r23 & 16) != 0 ? 0 : 0, (r23 & 32) != 0 ? null : new AndroidPathEffect(new DashPathEffect(new float[]{f3, f3}, f2)), (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
                break;
            default:
                DrawScope drawScope7 = (DrawScope) obj;
                drawScope7.getClass();
                DrawScope.m747drawRectnJ9OG0$default(drawScope7, this.f$1, 0L, 0L, this.f$0, null, null, 0, 118);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ DividerKt$$ExternalSyntheticLambda0(long j, float f, int i) {
        this.$r8$classId = i;
        this.f$1 = j;
        this.f$0 = f;
    }
}
