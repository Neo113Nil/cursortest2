package defpackage;

import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes3.dex */
public final class bju extends ContentObserver {
    public double a;
    public final /* synthetic */ cju b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bju(cju cjuVar, Handler handler) {
        super(handler);
        this.b = cjuVar;
        this.a = -1.0d;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        if (z) {
            return;
        }
        cju cjuVar = this.b;
        AudioManager audioManager = (AudioManager) cjuVar.g.getValue();
        eq4 eq4Var = gx1.a;
        audioManager.getClass();
        Double U = wdg.U(audioManager.getStreamVolume(3), gx1.b(audioManager), gx1.a);
        if (U != null) {
            double doubleValue = U.doubleValue();
            if (this.a != doubleValue) {
                cjuVar.i.a(U);
            }
            this.a = doubleValue;
        }
    }
}
