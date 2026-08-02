package defpackage;

import android.os.SystemClock;
import com.yandex.go.superapp.api.loading_tracker.GlobalLoadingEvent;

/* loaded from: classes14.dex */
public final class rit {
    public final gen a;
    public final gdn b = new gdn();

    public rit(gen genVar) {
        this.a = genVar;
    }

    public final void a(GlobalLoadingEvent globalLoadingEvent) {
        int i = qit.a[globalLoadingEvent.ordinal()];
        gdn gdnVar = this.b;
        if (i == 1) {
            gdnVar.a();
        } else if (i == 2) {
            if (gdnVar.a.containsKey(GlobalLoadingEvent.ROUTING_START)) {
                gdnVar.a();
            }
        } else if (i != 3 && i != 4 && i != 5) {
            w511.b();
            return;
        }
        gen genVar = this.a;
        genVar.getClass();
        gdnVar.a.put(globalLoadingEvent, Long.valueOf(SystemClock.elapsedRealtime() - genVar.a.e()));
    }
}
