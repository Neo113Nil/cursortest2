package T2;

import D.x;
import P2.i;
import P2.j;
import R2.o;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.bumptech.glide.g;
import j3.C4612a;
import m.c1;

/* loaded from: classes.dex */
public final class b extends g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3159a;

    public /* synthetic */ b(int i) {
        this.f3159a = i;
    }

    @Override // com.bumptech.glide.g
    public P2.c b(Context context, Looper looper, c1 c1Var, Object obj, i iVar, j jVar) {
        switch (this.f3159a) {
            case 2:
                c1Var.getClass();
                Integer num = (Integer) c1Var.f39198z;
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
                return new C4612a(context, looper, c1Var, bundle, iVar, jVar);
            case 3:
                throw x.h(obj);
            default:
                return super.b(context, looper, c1Var, obj, iVar, jVar);
        }
    }

    @Override // com.bumptech.glide.g
    public P2.c c(Context context, Looper looper, c1 c1Var, Object obj, i iVar, j jVar) {
        switch (this.f3159a) {
            case 0:
                return new d(context, looper, c1Var, (o) obj, iVar, jVar);
            case 1:
                return new b3.b(context, looper, 300, c1Var, iVar, jVar);
            default:
                return super.c(context, looper, c1Var, obj, iVar, jVar);
        }
    }
}
