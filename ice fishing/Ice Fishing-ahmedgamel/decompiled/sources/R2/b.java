package R2;

import D.y;
import N2.i;
import N2.j;
import P2.o;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import h3.C4564a;
import m.b1;

/* loaded from: classes.dex */
public final class b extends O3.b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2704c;

    @Override // O3.b
    public N2.c d(Context context, Looper looper, b1 b1Var, Object obj, i iVar, j jVar) {
        switch (this.f2704c) {
            case 2:
                b1Var.getClass();
                Integer num = (Integer) b1Var.f39127z;
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
                return new C4564a(context, looper, b1Var, bundle, iVar, jVar);
            case 3:
                throw y.i(obj);
            default:
                return super.d(context, looper, b1Var, obj, iVar, jVar);
        }
    }

    @Override // O3.b
    public N2.c e(Context context, Looper looper, b1 b1Var, Object obj, i iVar, j jVar) {
        switch (this.f2704c) {
            case 0:
                return new d(context, looper, b1Var, (o) obj, iVar, jVar);
            case 1:
                return new Z2.b(context, looper, 300, b1Var, iVar, jVar);
            default:
                return super.e(context, looper, b1Var, obj, iVar, jVar);
        }
    }
}
