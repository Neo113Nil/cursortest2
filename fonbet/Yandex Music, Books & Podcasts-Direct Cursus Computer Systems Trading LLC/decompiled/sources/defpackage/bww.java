package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class bww extends i4w {
    public final /* synthetic */ int x;

    public /* synthetic */ bww(int i) {
        this.x = i;
    }

    @Override // defpackage.i4w
    public List I(GoogleSignInOptions googleSignInOptions) {
        switch (this.x) {
            case 7:
                return googleSignInOptions == null ? Collections.EMPTY_LIST : new ArrayList(googleSignInOptions.b);
            default:
                return super.I(googleSignInOptions);
        }
    }

    @Override // defpackage.i4w
    public fo0 p(Context context, Looper looper, rn5 rn5Var, Object obj, rmd rmdVar, smd smdVar) {
        switch (this.x) {
            case 0:
                rn5Var.getClass();
                Integer num = (Integer) rn5Var.h;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new rfq(context, looper, rn5Var, bundle, rmdVar, smdVar);
            case 1:
                return new hyw(context, looper, 39, rn5Var, rmdVar, smdVar, 0);
            case 2:
                throw ouj.g(obj);
            case 3:
            case 5:
            case 6:
            case 8:
            case 15:
            default:
                return super.p(context, looper, rn5Var, obj, rmdVar, smdVar);
            case 4:
                return new gzw(context, looper, rn5Var, (fzw) obj, rmdVar, smdVar);
            case 7:
                return new hzw(context, looper, rn5Var, (GoogleSignInOptions) obj, rmdVar, smdVar);
            case 9:
                nku nkuVar = (nku) obj;
                if (nkuVar == null) {
                    nkuVar = new nku(new jsg());
                }
                return new bnx(context, looper, rn5Var, rmdVar, smdVar, nkuVar.a);
            case 10:
                return new w2x(rn5Var, rmdVar, smdVar, context, looper);
            case 11:
                s54 s54Var = (s54) obj;
                y1g.H(s54Var, "Setting the API options is required.");
                return new jox(context, looper, rn5Var, s54Var.a, 0, s54Var.c, s54Var.d, rmdVar, smdVar);
            case 12:
                s54 s54Var2 = (s54) obj;
                y1g.H(s54Var2, "Setting the API options is required.");
                return new fox(context, looper, rn5Var, s54Var2.a, 0, s54Var2.b, s54Var2.c, rmdVar, smdVar);
            case 13:
                return new nax(rn5Var, rmdVar, smdVar, context, looper);
            case 14:
                return new dix(context, looper, 161, rn5Var, rmdVar, smdVar, 0);
            case 16:
                return new ajx(context, looper, 148, rn5Var, rmdVar, smdVar, 0);
        }
    }

    @Override // defpackage.i4w
    public fo0 q(Context context, Looper looper, rn5 rn5Var, Object obj, rmd rmdVar, smd smdVar) {
        switch (this.x) {
            case 3:
                return new syw(context, looper, rn5Var, (q8s) obj, rmdVar, smdVar);
            case 5:
                return new kzw(rn5Var, rmdVar, smdVar, context, looper);
            case 6:
                return new azw(rn5Var, rmdVar, smdVar, context, looper);
            case 8:
                return new tnx(context, looper, 126, rn5Var, rmdVar, smdVar, 0);
            case 15:
                return new z6x(context, looper, 300, rn5Var, rmdVar, smdVar, 0);
            default:
                return super.q(context, looper, rn5Var, obj, rmdVar, smdVar);
        }
    }
}
