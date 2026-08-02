package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.auth.zzbh;
import com.google.android.gms.internal.p000authapi.zbf;

/* loaded from: classes11.dex */
public final class z091 extends ukt {
    public final /* synthetic */ int a0 = 1;
    public final Object b0;

    public z091(Context context, Looper looper, y2c y2cVar, y091 y091Var, wst wstVar, xst xstVar) {
        super(context, looper, 68, y2cVar, wstVar, xstVar);
        y091Var = y091Var == null ? y091.c : y091Var;
        v091 v091Var = new v091();
        v091Var.a = Boolean.FALSE;
        y091 y091Var2 = y091.c;
        y091Var.getClass();
        v091Var.a = Boolean.valueOf(y091Var.a);
        v091Var.b = y091Var.b;
        v091Var.b = r091.a();
        this.b0 = new y091(v091Var);
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface d(IBinder iBinder) {
        switch (this.a0) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                return queryLocalInterface instanceof zbf ? (zbf) queryLocalInterface : new zbf(iBinder);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
                return queryLocalInterface2 instanceof zzbh ? (zzbh) queryLocalInterface2 : new zzbh(iBinder);
        }
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle g() {
        int i = this.a0;
        Object obj = this.b0;
        switch (i) {
            case 0:
                y091 y091Var = (y091) obj;
                y091Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("consumer_package", null);
                bundle.putBoolean("force_save_dialog", y091Var.a);
                bundle.putString("log_session_id", y091Var.b);
                return bundle;
            default:
                return (Bundle) obj;
        }
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.om2
    public final int getMinApkVersion() {
        switch (this.a0) {
            case 0:
                return 12800000;
            default:
                return 12451000;
        }
    }

    @Override // com.google.android.gms.common.internal.a
    public final String j() {
        switch (this.a0) {
            case 0:
                return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
            default:
                return "com.google.android.gms.auth.api.internal.IAuthService";
        }
    }

    @Override // com.google.android.gms.common.internal.a
    public final String k() {
        switch (this.a0) {
            case 0:
                return "com.google.android.gms.auth.api.credentials.service.START";
            default:
                return "com.google.android.gms.auth.service.START";
        }
    }

    @Override // com.google.android.gms.common.internal.a
    public boolean p() {
        switch (this.a0) {
            case 1:
                return true;
            default:
                return super.p();
        }
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.om2
    public boolean requiresSignIn() {
        switch (this.a0) {
            case 1:
                y2c y2cVar = this.W;
                y2cVar.getClass();
                if (TextUtils.isEmpty(null)) {
                    return false;
                }
                if (y2cVar.c.get(dk3.a) == null) {
                    return !y2cVar.a.isEmpty();
                }
                ny61.u();
                return false;
            default:
                return super.requiresSignIn();
        }
    }

    public z091(Context context, Looper looper, y2c y2cVar, t4e t4eVar, yx60 yx60Var) {
        super(context, looper, 16, y2cVar, t4eVar, yx60Var);
        this.b0 = new Bundle();
    }
}
