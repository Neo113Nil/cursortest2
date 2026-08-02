package defpackage;

import android.util.Log;

/* loaded from: classes.dex */
public final /* synthetic */ class xlh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bmh b;

    public /* synthetic */ xlh(bmh bmhVar, int i) {
        this.a = i;
        this.b = bmhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bmh bmhVar = this.b;
                if (((okh) bmhVar.i.b).e.d() == null) {
                    bmhVar.V0();
                    break;
                }
                break;
            default:
                bmh bmhVar2 = this.b;
                fhh fhhVar = new fhh(bmhVar2.a, bmhVar2.c.a.x(), new ime(bmhVar2), bmhVar2.b.c.O0());
                bmhVar2.j = fhhVar;
                Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
                fhhVar.a.b.connect();
                break;
        }
    }
}
