package defpackage;

import ru.yandex.video.m3.ott.impl.TrackingEventType;

/* loaded from: classes6.dex */
public final /* synthetic */ class s2t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v2t b;

    public /* synthetic */ s2t(v2t v2tVar, int i) {
        this.a = i;
        this.b = v2tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v2t v2tVar = this.b;
                q2t q2tVar = v2tVar.j;
                v2tVar.e(q2tVar != null ? q2t.a(q2tVar, TrackingEventType.HEARTBEAT, null, null, 14) : null);
                break;
            default:
                q2t q2tVar2 = this.b.j;
                if (q2tVar2 != null) {
                    q2tVar2.i = q2tVar2.d.b();
                    break;
                }
                break;
        }
    }
}
