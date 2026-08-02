package defpackage;

import android.os.Parcelable;
import androidx.fragment.app.t;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final class c08 extends ytg {
    public static final Parcelable.Creator<c08> CREATOR = new vn7(2);
    public static ScheduledThreadPoolExecutor c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.ytg
    public final String j() {
        return "device_auth";
    }

    @Override // defpackage.ytg
    public final int n(atg atgVar) {
        t l = i().c.l();
        if (l == null || l.isFinishing()) {
            return 1;
        }
        b08 b08Var = new b08();
        b08Var.show(l.getSupportFragmentManager(), "login_with_facebook");
        b08Var.H(atgVar);
        return 1;
    }
}
