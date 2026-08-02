package kotlin.time;

import defpackage.s3w;
import defpackage.vng;

/* loaded from: classes11.dex */
public final class b implements s3w {
    public final long a;
    public final int b;

    public b(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override // defpackage.s3w
    public final Instant toInstant() {
        long epochSeconds = Instant.a.getEpochSeconds();
        long j = this.a;
        if (j >= epochSeconds && j <= Instant.b.getEpochSeconds()) {
            return vng.m(this.b, j);
        }
        throw new InstantFormatException("The parsed date is outside the range representable by Instant (Unix epoch second " + j + ')');
    }
}
