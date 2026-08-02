package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.yandex.passport.api.h;
import com.yandex.passport.api.impl.b;
import com.yandex.passport.api.y1;
import com.yandex.passport.internal.flags.i;
import com.yandex.passport.internal.impl.t0;
import com.yandex.passport.internal.links.LinksHandlingActivity;
import com.yandex.passport.internal.properties.c;
import com.yandex.passport.internal.properties.e0;
import com.yandex.passport.internal.properties.l;
import com.yandex.passport.internal.push.NotificationsBuilderActivity;
import com.yandex.passport.internal.report.diary.k0;
import com.yandex.passport.internal.ui.SocialApplicationBindActivity;
import com.yandex.passport.internal.ui.SocialBindActivity;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import com.yandex.passport.internal.ui.challenge.changecurrent.SetCurrentAccountActivity;
import com.yandex.passport.internal.ui.challenge.changecurrent.SetCurrentComposeActivity;
import com.yandex.passport.internal.ui.challenge.delete.DeleteAccountActivity;
import com.yandex.passport.internal.ui.challenge.delete.DeleteForeverActivity;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.LogoutBottomSheetActivity;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.LogoutBottomSheetComposeActivity;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import com.yandex.passport.internal.ui.router.LoginRouterActivity;
import com.yandex.passport.internal.ui.router.a0;
import com.yandex.passport.internal.ui.router.b0;
import com.yandex.passport.internal.ui.router.c0;
import com.yandex.passport.internal.ui.router.o;
import com.yandex.passport.internal.ui.router.q;
import com.yandex.passport.internal.ui.router.x;
import com.yandex.passport.internal.ui.router.y;
import com.yandex.passport.internal.ui.router.z;
import com.yandex.passport.internal.ui.sloth.menu.UserMenuActivity;
import com.yandex.passport.internal.ui.social.gimap.MailGIMAPActivity;
import com.yandex.passport.internal.ui.tv.AuthInWebViewActivity;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import com.yandex.plus.core.activity.result.internal.m;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class dxd extends uh {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ dxd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uh
    public final Intent createIntent(Context context, Object obj) {
        Intent A;
        int i = this.a;
        Intent intent = null;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                context.getClass();
                ((Unit) obj).getClass();
                return (Intent) obj2;
            case 1:
                context.getClass();
                return ((t0) obj2).a.i(context, (e0) obj);
            case 2:
                o oVar = (o) obj;
                context.getClass();
                oVar.getClass();
                q qVar = (q) ((jk6) obj2).get();
                qVar.getClass();
                c0 c0Var = oVar.a;
                Bundle bundle = oVar.b;
                qVar.l.getDiaryRecorder().a(new k0(c0Var), bundle, oVar.c);
                i iVar = qVar.k;
                switch (c0Var) {
                    case LOGIN:
                        A = vq2.A(context, LoginRouterActivity.class, cxb.K((Pair[]) Arrays.copyOf(new Pair[0], 0)));
                        intent = A;
                        intent.replaceExtras(bundle);
                        return intent;
                    case SOCIAL_BIND:
                        A = vq2.A(context, SocialBindActivity.class, cxb.K((Pair[]) Arrays.copyOf(new Pair[0], 0)));
                        intent = A;
                        intent.replaceExtras(bundle);
                        return intent;
                    case SOCIAL_APPLICATION_BIND:
                        A = vq2.A(context, SocialApplicationBindActivity.class, cxb.K((Pair[]) Arrays.copyOf(new Pair[0], 0)));
                        intent = A;
                        intent.replaceExtras(bundle);
                        return intent;
                    case AUTHORIZATION_BY_QR:
                        A = vq2.A(context, AuthInWebViewActivity.class, cxb.K((Pair[]) Arrays.copyOf(new Pair[0], 0)));
                        intent = A;
                        intent.replaceExtras(bundle);
                        return intent;
                    case TURBO_APP_AUTH:
                        A = vq2.A(context, AuthSdkActivity.class, cxb.K((Pair[]) Arrays.copyOf(new Pair[0], 0)));
                        intent = A;
                        intent.replaceExtras(bundle);
                        return intent;
                    case CONFIRM_QR_AUTHORIZATION:
                        Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) vwb.O(bundle, Uri.class, "URI") : bundle.getParcelable("URI");
                        if (parcelable == null) {
                            xq0.q("can't get required parcelable URI");
                            return intent;
                        }
                        Intent intent2 = new Intent("android.intent.action.VIEW", (Uri) parcelable);
                        intent2.setComponent(new ComponentName(context, (Class<?>) LinksHandlingActivity.class));
                        intent = intent2;
                        intent.replaceExtras(bundle);
                        return intent;
                    case LOGOUT:
                        A = ((Boolean) iVar.b(com.yandex.passport.internal.flags.o.U)).booleanValue() ? vq2.A(context, LogoutBottomSheetComposeActivity.class, cxb.K((Pair[]) Arrays.copyOf(new Pair[0], 0))) : vq2.A(context, LogoutBottomSheetActivity.class, cxb.K((Pair[]) Arrays.copyOf(new Pair[0], 0)));
                        intent = A;
                        intent.replaceExtras(bundle);
                        return intent;
                    case SET_CURRENT_ACCOUNT:
                        A = ((Boolean) iVar.b(com.yandex.passport.internal.flags.o.T)).booleanValue() ? vq2.A(context, SetCurrentComposeActivity.class, cxb.K((Pair[]) Arrays.copyOf(new Pair[0], 0))) : vq2.A(context, SetCurrentAccountActivity.class, cxb.K((Pair[]) Arrays.copyOf(new Pair[0], 0)));
                        intent = A;
                        intent.replaceExtras(bundle);
                        return intent;
                    case WEB_VIEW:
                        A = vq2.A(context, WebViewActivity.class, cxb.K((Pair[]) Arrays.copyOf(new Pair[0], 0)));
                        intent = A;
                        intent.replaceExtras(bundle);
                        return intent;
                    case NOTIFICATION_BUILDER:
                        A = vq2.A(context, NotificationsBuilderActivity.class, cxb.K((Pair[]) Arrays.copyOf(new Pair[0], 0)));
                        intent = A;
                        intent.replaceExtras(bundle);
                        return intent;
                    case SHOW_USER_MENU:
                        A = vq2.A(context, UserMenuActivity.class, cxb.K((Pair[]) Arrays.copyOf(new Pair[0], 0)));
                        intent = A;
                        intent.replaceExtras(bundle);
                        return intent;
                    case DELETE_ACCOUNT:
                        A = ((Boolean) iVar.b(com.yandex.passport.internal.flags.o.X)).booleanValue() ? vq2.A(context, DeleteAccountActivity.class, cxb.K((Pair[]) Arrays.copyOf(new Pair[0], 0))) : vq2.A(context, DeleteForeverActivity.class, cxb.K((Pair[]) Arrays.copyOf(new Pair[0], 0)));
                        intent = A;
                        intent.replaceExtras(bundle);
                        return intent;
                    default:
                        b6e.s();
                        return intent;
                }
            case 3:
                b0 b0Var = (b0) obj;
                context.getClass();
                b0Var.getClass();
                ((x) ((jk6) obj2).get()).getClass();
                if (b0Var instanceof y) {
                    int i2 = GlobalRouterActivity.i;
                    y1 y1Var = y1.a;
                    com.yandex.passport.api.q qVar2 = h.b;
                    l lVar = ((y) b0Var).a;
                    y1 y1Var2 = lVar.e;
                    y1Var2.getClass();
                    b bVar = lVar.d.a;
                    bVar.getClass();
                    h.b.getClass();
                    Intent d = com.yandex.passport.internal.ui.router.b.d(context, c0.AUTHORIZATION_BY_QR, cxb.K(new Pair("auth_by_qr_properties", new c(y1Var2, com.yandex.passport.api.q.b(bVar).a, false, true, false, null, null, false, null))));
                    d.putExtra("EXTERNAL_EXTRA", false);
                    return d;
                }
                if (!(b0Var instanceof a0)) {
                    if (b0Var instanceof z) {
                        int i3 = BouncerActivity.e;
                        return com.yandex.plus.pay.ui.core.b.k(context, l.a(((z) b0Var).a, null, null, null, 1006632959));
                    }
                    b6e.s();
                    return null;
                }
                a0 a0Var = (a0) b0Var;
                l lVar2 = a0Var.a;
                com.yandex.passport.internal.l lVar3 = a0Var.b;
                int i4 = MailGIMAPActivity.h;
                Intent intent3 = new Intent(context, (Class<?>) MailGIMAPActivity.class);
                intent3.putExtras(lVar2.t());
                if (lVar3 == null) {
                    return intent3;
                }
                intent3.putExtras(cxb.K(new Pair("master-account", lVar3)));
                return intent3;
            default:
                context.getClass();
                obj.getClass();
                uh uhVar = ((m) obj2).l;
                uhVar.getClass();
                return uhVar.createIntent(context, obj);
        }
    }

    @Override // defpackage.uh
    public final Object parseResult(int i, Intent intent) {
        switch (this.a) {
            case 0:
                return new ph(i != -1 ? i != 0 ? new c8o(i, 6) : c8o.g : c8o.h, intent);
            case 1:
                if (intent == null) {
                    return Boolean.valueOf(i == -1);
                }
                if (i == -1) {
                    return Boolean.TRUE;
                }
                return Boolean.valueOf(i == -1);
            case 2:
                return new ph(i != -1 ? i != 0 ? new c8o(i, 6) : c8o.g : c8o.h, intent);
            case 3:
                return new ph(i != -1 ? i != 0 ? new c8o(i, 6) : c8o.g : c8o.h, intent);
            default:
                uh uhVar = ((m) this.b).l;
                if (uhVar != null) {
                    return uhVar.parseResult(i, intent);
                }
                return null;
        }
    }
}
