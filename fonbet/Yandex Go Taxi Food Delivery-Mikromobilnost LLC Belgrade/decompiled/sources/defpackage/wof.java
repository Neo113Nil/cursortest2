package defpackage;

import org.altbeacon.beacon.service.scanner.a;

/* loaded from: classes4.dex */
public final class wof implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ wof(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                aVar.s.quit();
                break;
            default:
                aVar.i();
                break;
        }
    }
}
