package d7;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import n6.f;
import n6.g;
import p6.d;
import p6.l;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends a.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1717c;

    public /* synthetic */ b(int i10) {
        this.f1717c = i10;
    }

    @Override // a.a
    public n6.a j(Context context, Looper looper, d dVar, Object obj, f fVar, g gVar) {
        switch (this.f1717c) {
            case 0:
                dVar.getClass();
                Integer num = dVar.f5555a;
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
                return new e7.a(context, looper, dVar, bundle, fVar, gVar);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                throw v.f.c(obj);
            default:
                return super.j(context, looper, dVar, obj, fVar, gVar);
        }
    }

    @Override // a.a
    public /* synthetic */ n6.a k(Context context, Looper looper, d dVar, Object obj, f fVar, g gVar) {
        switch (this.f1717c) {
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return new r6.c(context, looper, dVar, (l) obj, fVar, gVar);
            default:
                return super.k(context, looper, dVar, obj, fVar, gVar);
        }
    }
}
