package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class rh1 extends ContentObserver {
    public final /* synthetic */ n8 GWasM1elztuh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh1(n8 n8Var, Handler handler) {
        super(handler);
        this.GWasM1elztuh = n8Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.GWasM1elztuh.mE4lRynR(kc1.GWasM1elztuh);
    }
}
