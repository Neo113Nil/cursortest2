package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class xf {
    public int a;
    public int b;
    public final vf c;
    public long d;
    public double e;

    public xf(int i, int i2, vf vfVar) {
        float f;
        vfVar.getClass();
        this.a = i;
        this.b = i2;
        this.c = vfVar;
        Long readLong = vfVar.readLong(DataStoreKey.TOKEN_BUCKET_LAST_CALL_AT_MS, 0L);
        this.d = readLong != null ? readLong.longValue() : 0L;
        Float readFloat = vfVar.readFloat(DataStoreKey.TOKEN_BUCKET_CURRENT_TOKEN_COUNT, Float.valueOf(this.a < 1 ? 1 : r5));
        if (readFloat != null) {
            f = readFloat.floatValue();
        }
        this.e = f;
    }

    public static final String b(int i, int i2) {
        return Recorder$$ExternalSyntheticOutline2.m("TokenBucketRateLimiter updated with new capacity: ", i, i2, " and refill rate: ");
    }

    public final long a() {
        double a = a(DateTimeUtils.nowInMillisecondsSystemClock());
        this.e = a;
        this.c.writeData(DataStoreKey.TOKEN_BUCKET_CURRENT_TOKEN_COUNT, Float.valueOf((float) a));
        double d = this.e;
        if (d >= 1.0d) {
            return 0L;
        }
        double d2 = 1.0d - d;
        int i = this.b;
        if (i < 1) {
            i = 1;
        }
        return Math.max(0L, (long) (d2 * i * 1000.0d));
    }

    public final String toString() {
        int i = this.a;
        if (i < 1) {
            i = 1;
        }
        double d = i;
        int i2 = this.b;
        int i3 = i2 >= 1 ? i2 : 1;
        String formatDateFromMillis$default = DateTimeUtils.formatDateFromMillis$default(this.d, null, null, 3, null);
        long j = this.d;
        double a = a(DateTimeUtils.nowInMillisecondsSystemClock());
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("(capacity=", ", refillRate=", d);
        m.append(i3);
        m.append(", lastCallAt='");
        m.append(formatDateFromMillis$default);
        Boxes$$ExternalSyntheticOutline1.m1151m(j, "', lastCallAt raw value='", "', currentTokenCount=", m);
        return NavAction$$ExternalSyntheticOutline0.m(m, a, ")");
    }

    public final double a(long j) {
        double d = this.e;
        double d2 = j - this.d;
        int i = this.b;
        if (i < 1) {
            i = 1;
        }
        return Math.min(((d2 / i) / 1000.0d) + d, this.a >= 1 ? r6 : 1);
    }

    public final void a(int i, int i2) {
        if (i < 1 || i2 < 1) {
            return;
        }
        if (this.a == i && this.b == i2) {
            return;
        }
        this.a = i;
        this.b = i2;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new xf$$ExternalSyntheticLambda0(i, i2, 0), 6, (Object) null);
    }
}
