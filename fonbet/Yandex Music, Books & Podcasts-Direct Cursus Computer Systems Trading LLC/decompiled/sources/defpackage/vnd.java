package defpackage;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class vnd implements a8o {
    public final Status a;
    public final GoogleSignInAccount b;

    public vnd(GoogleSignInAccount googleSignInAccount, Status status) {
        this.b = googleSignInAccount;
        this.a = status;
    }

    @Override // defpackage.a8o
    public final Status getStatus() {
        return this.a;
    }
}
