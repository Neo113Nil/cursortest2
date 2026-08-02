package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzt;
import io.appmetrica.analytics.rtm.internal.Constants;

/* loaded from: classes11.dex */
public final class wjb1 extends gnb1 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wjb1(int i, int i2, Bundle bundle, int i3) {
        super(i, i2, bundle);
        this.e = i3;
    }

    @Override // defpackage.gnb1
    public final void a(Bundle bundle) {
        int i = this.e;
        atx0 atx0Var = this.b;
        switch (i) {
            case 0:
                if (!bundle.getBoolean("ack", false)) {
                    c(new zzt("Invalid response to one way request", null));
                    break;
                } else {
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        toString();
                    }
                    atx0Var.a(null);
                    break;
                }
            default:
                Bundle bundle2 = bundle.getBundle(Constants.KEY_DATA);
                if (bundle2 == null) {
                    bundle2 = Bundle.EMPTY;
                }
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    toString();
                }
                atx0Var.a(bundle2);
                break;
        }
    }

    @Override // defpackage.gnb1
    public final boolean b() {
        switch (this.e) {
            case 0:
                return true;
            default:
                return false;
        }
    }
}
