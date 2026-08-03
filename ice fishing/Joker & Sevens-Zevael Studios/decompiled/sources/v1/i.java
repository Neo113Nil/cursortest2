package v1;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7080a;

    public long a(long j3, long j6) {
        switch (this.f7080a) {
            case 0:
                float max = Math.max(Float.intBitsToFloat((int) (j6 >> 32)) / Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j6 & 4294967295L)) / Float.intBitsToFloat((int) (j3 & 4294967295L)));
                long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
                int i10 = o0.f7116a;
                return floatToRawIntBits;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) / Float.intBitsToFloat((int) (j3 >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L)) / Float.intBitsToFloat((int) (j3 & 4294967295L));
                long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
                int i11 = o0.f7116a;
                return floatToRawIntBits2;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                float b2 = p0.b(j3, j6);
                long floatToRawIntBits3 = (Float.floatToRawIntBits(b2) << 32) | (Float.floatToRawIntBits(b2) & 4294967295L);
                int i12 = o0.f7116a;
                return floatToRawIntBits3;
            default:
                if (Float.intBitsToFloat((int) (j3 >> 32)) <= Float.intBitsToFloat((int) (j6 >> 32)) && Float.intBitsToFloat((int) (j3 & 4294967295L)) <= Float.intBitsToFloat((int) (j6 & 4294967295L))) {
                    long floatToRawIntBits4 = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
                    int i13 = o0.f7116a;
                    return floatToRawIntBits4;
                }
                float b10 = p0.b(j3, j6);
                long floatToRawIntBits5 = (Float.floatToRawIntBits(b10) << 32) | (Float.floatToRawIntBits(b10) & 4294967295L);
                int i14 = o0.f7116a;
                return floatToRawIntBits5;
        }
    }

    public String toString() {
        switch (this.f7080a) {
            case 4:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
