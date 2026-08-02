package defpackage;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* loaded from: classes10.dex */
public final class wyy implements pq60 {
    public final sl81 a;
    public boolean b = false;

    public wyy(t091 t091Var, sl81 sl81Var) {
        this.a = sl81Var;
    }

    @Override // defpackage.pq60
    public final void a(Object obj) {
        int i;
        Intent intent;
        this.b = true;
        SignInHubActivity signInHubActivity = (SignInHubActivity) this.a.a;
        i = signInHubActivity.zbe;
        intent = signInHubActivity.zbf;
        signInHubActivity.setResult(i, intent);
        signInHubActivity.finish();
    }

    public final String toString() {
        return this.a.toString();
    }
}
