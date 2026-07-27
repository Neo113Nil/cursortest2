package Q2;

import D.y;
import M2.i;
import M2.j;
import O2.o;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.bumptech.glide.g;
import f3.C4502a;
import m.c1;

/* loaded from: classes.dex */
public final class b extends g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2714b;

    public /* synthetic */ b(int i) {
        this.f2714b = i;
    }

    @Override // com.bumptech.glide.g
    public M2.c A(Context context, Looper looper, c1 c1Var, Object obj, i iVar, j jVar) {
        switch (this.f2714b) {
            case 2:
                c1Var.getClass();
                Integer num = (Integer) c1Var.f39400z;
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
                return new C4502a(context, looper, c1Var, bundle, iVar, jVar);
            case 3:
                throw y.g(obj);
            default:
                return super.A(context, looper, c1Var, obj, iVar, jVar);
        }
    }

    @Override // com.bumptech.glide.g
    public M2.c B(Context context, Looper looper, c1 c1Var, Object obj, i iVar, j jVar) {
        switch (this.f2714b) {
            case 0:
                return new d(context, looper, c1Var, (o) obj, iVar, jVar);
            case 1:
                return new Y2.b(context, looper, 300, c1Var, iVar, jVar);
            default:
                return super.B(context, looper, c1Var, obj, iVar, jVar);
        }
    }
}
