package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class rww implements b8o {
    public final /* synthetic */ vgr a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ tmd c;
    public final /* synthetic */ uww d;

    public rww(uww uwwVar, vgr vgrVar, boolean z, tmd tmdVar) {
        this.d = uwwVar;
        this.a = vgrVar;
        this.b = z;
        this.c = tmdVar;
    }

    @Override // defpackage.b8o
    public final void a(a8o a8oVar) {
        mxw mxwVar;
        Status status = (Status) a8oVar;
        uww uwwVar = this.d;
        ihr a = ihr.a(uwwVar.f);
        String d = a.d("defaultGoogleSignInAccount");
        a.e("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(d)) {
            a.e(ihr.g("googleSignInAccount", d));
            a.e(ihr.g("googleSignInOptions", d));
        }
        if (status.d() && (mxwVar = uwwVar.d) != null && mxwVar.g()) {
            uwwVar.a();
            uwwVar.g();
        }
        this.a.g(status);
        if (this.b) {
            this.c.a();
        }
    }
}
