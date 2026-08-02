package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class gzw extends a {
    public final fzw E;

    public gzw(Context context, Looper looper, rn5 rn5Var, fzw fzwVar, rmd rmdVar, smd smdVar) {
        super(context, looper, 68, rn5Var, rmdVar, smdVar, 0);
        fzwVar = fzwVar == null ? fzw.c : fzwVar;
        dxr dxrVar = new dxr();
        dxrVar.a = Boolean.FALSE;
        fzw fzwVar2 = fzw.c;
        fzwVar.getClass();
        dxrVar.a = Boolean.valueOf(fzwVar.a);
        dxrVar.b = fzwVar.b;
        dxrVar.b = bzw.a();
        this.E = new fzw(dxrVar);
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.fo0
    public final int k() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof izw ? (izw) queryLocalInterface : new izw(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 1);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle r() {
        fzw fzwVar = this.E;
        fzwVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", fzwVar.a);
        bundle.putString("log_session_id", fzwVar.b);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String t() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String u() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
