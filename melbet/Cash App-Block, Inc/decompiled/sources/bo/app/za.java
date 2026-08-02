package bo.app;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.braze.support.DateTimeUtils;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class za extends we {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public za() {
        super(new ye(r0), DateTimeUtils.nowInSecondsPrecise(), null, false);
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
    }

    @Override // bo.app.we
    public final Double d() {
        return this.c;
    }

    @Override // bo.app.we
    public final String toString() {
        ye yeVar = this.a;
        double d = this.b;
        Double d2 = this.c;
        boolean z = this.d;
        long c = c();
        StringBuilder sb = new StringBuilder("\nMutableSession(sessionId=");
        sb.append(yeVar);
        sb.append(", startTime=");
        sb.append(d);
        sb.append(", endTime=");
        sb.append(d2);
        sb.append(", isSealed=");
        sb.append(z);
        return Boxes$$ExternalSyntheticOutline1.m(c, ", duration=", ")", sb);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(ye yeVar, double d, Double d2, boolean z) {
        super(yeVar, d, d2, z);
        yeVar.getClass();
    }
}
