package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class zfn implements yfn {
    public final xdr a;
    public final yks b;

    public zfn(xdr xdrVar, yks yksVar) {
        this.a = xdrVar;
        this.b = yksVar;
    }

    @Override // defpackage.yfn
    public final void a(tfn tfnVar) {
        Object value = this.a.getValue();
        pgn pgnVar = value instanceof pgn ? (pgn) value : null;
        if (pgnVar == null) {
            ssg.a(6, "RadioPlayAudioEventsReporter", "Track start report for radioItemId=" + tfnVar + " skipped. Radio is in inappropriate state", null);
            return;
        }
        f7u f7uVar = pgnVar.b;
        if (!f7uVar.c.c) {
            ssg.a(3, "RadioPlayAudioEventsReporter", "Track start report for radioItemId=" + tfnVar + " skipped. Radio is not live", null);
            return;
        }
        s7u c = f7uVar.c();
        tfn tfnVar2 = c.b.a;
        if (!tfnVar2.equals(tfnVar)) {
            ssg.a(6, "RadioPlayAudioEventsReporter", "Track start report for radioItemId=" + tfnVar + " skipped. Current state holds itemId=" + tfnVar2, null);
            return;
        }
        String str = pgnVar.a;
        str.getClass();
        tfn tfnVar3 = c.b.a;
        ssg.a(3, "VideoClipRadioFeedbackReporterImpl", "Reporting playback start for itemId=" + tfnVar3, null);
        yks yksVar = this.b;
        ou7 p = x97.p((tf6) yksVar.c, null, null, new lco(tfnVar3, yksVar, str, c, (Continuation) null, 28), 3);
        if (p.X()) {
            return;
        }
        ((ConcurrentLinkedQueue) yksVar.d).offer(p);
        p.R(new wes(16, yksVar, p));
    }
}
