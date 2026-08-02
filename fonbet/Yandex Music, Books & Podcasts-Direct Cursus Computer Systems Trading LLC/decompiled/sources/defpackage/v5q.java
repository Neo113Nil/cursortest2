package defpackage;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class v5q implements d80 {
    public static final String a(v5q v5qVar, cfg cfgVar) {
        long j = cfgVar.d;
        long j2 = cfgVar.e;
        Uri uri = cfgVar.b;
        StringBuilder l = tlm.l(j, "loadDurationMs = ", ", bytesLoaded = ");
        l.append(j2);
        l.append(", uri = ");
        l.append(uri);
        return l.toString();
    }

    @Override // defpackage.d80
    public final void D(c80 c80Var, cfg cfgVar, boh bohVar) {
        ssg.a(2, "SharedPlayerAnalyticsListener", "onLoadCanceled - ".concat(a(this, cfgVar)), null);
    }

    @Override // defpackage.d80
    public final void Z(c80 c80Var, cfg cfgVar, boh bohVar) {
        ssg.a(2, "SharedPlayerAnalyticsListener", "onLoadCompleted - ".concat(a(this, cfgVar)), null);
    }

    @Override // defpackage.d80
    public final void b0(c80 c80Var, int i, long j, long j2) {
        ssg.a(2, "SharedPlayerAnalyticsListener", "onAudioUnderrun - bufferSize = " + i + ", bufferSizeMs = " + j + ", elapsedSinceLastFeedMs = " + j2, null);
    }

    @Override // defpackage.d80
    public final void h0(c80 c80Var, boolean z) {
        k5r.v("onIsLoadingChanged - ", z, 2, "SharedPlayerAnalyticsListener", null);
    }

    @Override // defpackage.d80
    public final void j(c80 c80Var, cfg cfgVar, boh bohVar, IOException iOException, boolean z) {
        iOException.getClass();
        ssg.a(2, "SharedPlayerAnalyticsListener", "onLoadError - wasCancelled = " + z + ", " + a(this, cfgVar), iOException);
    }

    @Override // defpackage.d80
    public final void m(c80 c80Var, cfg cfgVar, boh bohVar) {
        ssg.a(2, "SharedPlayerAnalyticsListener", "onLoadStarted - " + cfgVar.b, null);
    }
}
