package defpackage;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* loaded from: classes.dex */
public final class tgg implements xjj {
    public final z6n a;
    public boolean b = false;

    public tgg(dzw dzwVar, z6n z6nVar) {
        this.a = z6nVar;
    }

    @Override // defpackage.xjj
    public final void onChanged(Object obj) {
        this.b = true;
        SignInHubActivity signInHubActivity = (SignInHubActivity) this.a.b;
        signInHubActivity.setResult(signInHubActivity.d, signInHubActivity.e);
        signInHubActivity.finish();
    }

    public final String toString() {
        return this.a.toString();
    }
}
