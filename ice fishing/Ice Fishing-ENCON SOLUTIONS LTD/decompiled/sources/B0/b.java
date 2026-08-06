package B0;

import R1.l;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import n0.InterfaceC0989c;
import n0.g;
import n0.h;
import p0.C1013j;
import r0.C1041c;
import x0.C1065b;

/* loaded from: classes.dex */
public final class b extends l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87i;

    @Override // R1.l
    public InterfaceC0989c b(Context context, Looper looper, Q0.c cVar, Object obj, g gVar, h hVar) {
        switch (this.f87i) {
            case 0:
                cVar.getClass();
                Integer num = (Integer) cVar.f1523f;
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
                return new C0.a(context, looper, cVar, bundle, gVar, hVar);
            case 1:
                C1.a.n(obj);
                throw null;
            default:
                return super.b(context, looper, cVar, obj, gVar, hVar);
        }
    }

    @Override // R1.l
    public InterfaceC0989c c(Context context, Looper looper, Q0.c cVar, Object obj, o0.l lVar, o0.l lVar2) {
        switch (this.f87i) {
            case 2:
                return new C1041c(context, looper, cVar, (C1013j) obj, lVar, lVar2);
            case 3:
                return new C1065b(context, looper, 300, cVar, lVar, lVar2);
            default:
                return super.c(context, looper, cVar, obj, lVar, lVar2);
        }
    }
}
