package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;

/* loaded from: classes.dex */
public abstract class izf extends Service implements dzf {
    public final sfm a;

    public izf() {
        sfm sfmVar = new sfm();
        sfmVar.a = new gzf(this);
        sfmVar.b = new Handler();
        this.a = sfmVar;
    }

    @Override // defpackage.dzf
    public final nyf getLifecycle() {
        return (gzf) this.a.a;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        intent.getClass();
        sfm sfmVar = this.a;
        sfmVar.getClass();
        sfmVar.D(kyf.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        sfm sfmVar = this.a;
        sfmVar.getClass();
        sfmVar.D(kyf.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        sfm sfmVar = this.a;
        sfmVar.getClass();
        sfmVar.D(kyf.ON_STOP);
        sfmVar.D(kyf.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        sfm sfmVar = this.a;
        sfmVar.getClass();
        sfmVar.D(kyf.ON_START);
        super.onStart(intent, i);
    }
}
