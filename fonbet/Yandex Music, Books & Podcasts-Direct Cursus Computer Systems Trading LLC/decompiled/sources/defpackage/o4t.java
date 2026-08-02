package defpackage;

import android.os.Process;
import com.yandex.pulse.histogram.ComponentHistograms;

/* loaded from: classes5.dex */
public final class o4t {
    public final lyd a;
    public final lyd b;
    public final int c = Process.myUid();
    public long d;
    public long e;
    public long f;

    public o4t() {
        Object obj = ComponentHistograms.b;
        this.a = xee.B().b("ApplicationReceivedBytes", 0, 10485760, 100);
        this.b = xee.B().b("ApplicationTransmittedBytes", 0, 10485760, 100);
    }
}
