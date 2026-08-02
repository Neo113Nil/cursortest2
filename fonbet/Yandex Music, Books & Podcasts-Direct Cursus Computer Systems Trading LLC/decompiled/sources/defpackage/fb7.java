package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.passport.common.account.a;
import com.yandex.passport.common.core.f;
import com.yandex.passport.common.network.n;
import com.yandex.passport.common.network.p;
import com.yandex.passport.data.models.m;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.l;
import com.yandex.passport.internal.network.client.g;
import com.yandex.passport.internal.ui.SocialApplicationBindActivity;
import com.yandex.passport.internal.ui.autologin.AutoLoginRetryActivity;
import com.yandex.passport.internal.ui.autologin.c;
import com.yandex.passport.internal.ui.domik.a0;
import com.yandex.passport.internal.ui.domik.d;
import com.yandex.passport.internal.ui.domik.s;
import com.yandex.passport.internal.ui.domik.samlsso.e;
import com.yandex.passport.internal.ui.domik.v;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ru.kinopoisk.sdk.easylogin.internal.F4;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

/* loaded from: classes.dex */
public final /* synthetic */ class fb7 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ fb7(pyc pycVar, yop yopVar) {
        this.a = 6;
        this.b = (uif) pycVar;
        this.c = yopVar;
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [pyc, uif] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        ServiceInfo serviceInfo;
        String str;
        int i;
        ComponentName startService;
        boolean z = false;
        String str2 = null;
        switch (this.a) {
            case 0:
                gb7 gb7Var = (gb7) this.b;
                byte[] bArr = (byte[]) this.c;
                return qld.x(bArr, bArr.length, gb7Var.b);
            case 1:
                return F4.a((F4) this.b, (InterfaceC1305z0.a) this.c);
            case 2:
                Context context = (Context) this.b;
                Intent intent = (Intent) this.c;
                kkp v = kkp.v();
                v.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) v.e).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (v) {
                    try {
                        String str3 = (String) v.b;
                        if (str3 != null) {
                            str2 = str3;
                        } else {
                            ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                                    if (str.startsWith(".")) {
                                        v.b = context.getPackageName() + serviceInfo.name;
                                    } else {
                                        v.b = serviceInfo.name;
                                    }
                                    str2 = (String) v.b;
                                }
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            }
                            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                        }
                    } finally {
                    }
                }
                if (str2 != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str2));
                    }
                    intent2.setClassName(context.getPackageName(), str2);
                }
                try {
                    if (v.x(context)) {
                        startService = vq2.K(context, intent2);
                    } else {
                        startService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (startService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i = NetworkRequestException.RESOURCE_NOT_FOUND;
                    } else {
                        i = -1;
                    }
                } catch (IllegalStateException e) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e);
                    i = 402;
                } catch (SecurityException e2) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
                    i = NetworkRequestException.EXPIRED_SIGNATURE;
                }
                return Integer.valueOf(i);
            case 3:
                return LottieAnimationView.c((LottieAnimationView) this.b, (String) this.c);
            case 4:
                return gyg.d((InputStream) this.b, (String) this.c);
            case 5:
                return gyg.h(null, (ZipInputStream) this.b, (String) this.c);
            case 6:
                ?? r0 = (uif) this.b;
                yop yopVar = (yop) this.c;
                try {
                    r0.invoke(yopVar, new bml(1, yopVar, yop.class, "resolve", "resolve$xplat_common_release(Ljava/lang/Object;)V", 0, 25), new bml(1, yopVar, yop.class, "reject", "reject$xplat_common_release(Lcom/yandex/xplat/common/YSError;)V", 0, 26));
                } catch (Throwable th) {
                    th = th;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    yopVar.d(zdg.q(th));
                }
                return Unit.a;
            case 7:
                k5w k5wVar = (k5w) this.b;
                n5w n5wVar = (n5w) this.c;
                t4w t4wVar = n5wVar.a;
                String str4 = n5wVar.c;
                x4w x4wVar = n5wVar.i;
                if (!(k5wVar instanceof i5w)) {
                    if (k5wVar instanceof h5w) {
                        n5wVar.d(((h5w) k5wVar).a);
                    } else {
                        if (!(k5wVar instanceof j5w)) {
                            b6e.s();
                            return null;
                        }
                        int i2 = ((j5w) k5wVar).a;
                        if (Intrinsics.d(t4wVar.y, Boolean.TRUE)) {
                            String str5 = o5w.a;
                            jsg.j().e(str5, "Worker " + t4wVar.c + " was interrupted. Backing off.");
                            n5wVar.b(i2);
                        } else {
                            c4w d = x4wVar.d(str4);
                            if (d == null || d.a()) {
                                String str6 = o5w.a;
                                jsg.j().e(str6, "Status for " + str4 + " is " + d + " ; not doing any work");
                            } else {
                                String str7 = o5w.a;
                                jsg.j().e(str7, "Status for " + str4 + " is " + d + "; not doing any work and rescheduling for later execution");
                                x4wVar.j(c4w.a, str4);
                                x4wVar.k(i2, str4);
                                x4wVar.g(-1L, str4);
                            }
                        }
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
                tcg tcgVar = ((i5w) k5wVar).a;
                c4w d2 = x4wVar.d(str4);
                m4w z2 = n5wVar.h.z();
                z2.getClass();
                up6.F(z2.a, false, true, new srp(str4, 27));
                if (d2 != null) {
                    if (d2 == c4w.b) {
                        String str8 = n5wVar.l;
                        if (tcgVar instanceof scg) {
                            String str9 = o5w.a;
                            jsg.j().k(str9, "Worker result SUCCESS for " + str8);
                            if (t4wVar.c()) {
                                n5wVar.c();
                            } else {
                                x4wVar.j(c4w.c, str4);
                                q97 q97Var = ((scg) tcgVar).a;
                                q97Var.getClass();
                                up6.F(x4wVar.a, false, true, new itv(11, q97Var, str4));
                                n5wVar.f.getClass();
                                long currentTimeMillis = System.currentTimeMillis();
                                rx7 rx7Var = n5wVar.j;
                                for (String str10 : rx7Var.a(str4)) {
                                    if (x4wVar.d(str10) == c4w.e && ((Boolean) up6.F(rx7Var.a, true, false, new wq(str10, 21))).booleanValue()) {
                                        jsg.j().k(o5w.a, "Setting status to enqueued for ".concat(str10));
                                        x4wVar.j(c4w.a, str10);
                                        x4wVar.i(currentTimeMillis, str10);
                                    }
                                }
                            }
                        } else if (tcgVar instanceof rcg) {
                            String str11 = o5w.a;
                            jsg.j().k(str11, "Worker result RETRY for " + str8);
                            n5wVar.b(-256);
                            z = true;
                        } else {
                            String str12 = o5w.a;
                            jsg.j().k(str12, "Worker result FAILURE for " + str8);
                            if (t4wVar.c()) {
                                n5wVar.c();
                            } else {
                                n5wVar.d(tcgVar);
                            }
                        }
                    } else if (!d2.a()) {
                        n5wVar.b(-512);
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 8:
                SocialApplicationBindActivity socialApplicationBindActivity = (SocialApplicationBindActivity) this.b;
                f fVar = (f) this.c;
                g gVar = socialApplicationBindActivity.f;
                String str13 = socialApplicationBindActivity.k;
                String str14 = socialApplicationBindActivity.e;
                a aVar = socialApplicationBindActivity.g.a().e(fVar).d;
                gVar.getClass();
                str13.getClass();
                str14.getClass();
                aVar.getClass();
                n nVar = gVar.b;
                String d3 = aVar.d();
                d3.getClass();
                p pVar = new p((String) nVar.Q().b);
                pVar.J("/1/authz_in_app/entrust_to_account/");
                pVar.S("task_id", str13);
                pVar.S("code_verifier", str14);
                pVar.S("token", d3);
                Boolean bool = (Boolean) gVar.c(pVar.z(), new vlv(1, gVar.d, com.yandex.passport.internal.network.a.class, "parseBindApplicationFinishResponse", "parseBindApplicationFinishResponse(Lokhttp3/Response;)Z", 0, 15));
                bool.getClass();
                return bool;
            case 9:
                AutoLoginRetryActivity autoLoginRetryActivity = (AutoLoginRetryActivity) this.b;
                PassportProcessGlobalComponent passportProcessGlobalComponent = (PassportProcessGlobalComponent) this.c;
                int i3 = AutoLoginRetryActivity.l;
                return new c(passportProcessGlobalComponent.getLoginController(), autoLoginRetryActivity.d, autoLoginRetryActivity.c, passportProcessGlobalComponent.getEventReporter());
            case 10:
                d dVar = (d) this.b;
                m mVar = (m) this.c;
                String str15 = com.yandex.passport.internal.ui.domik.smsauth.a.y;
                dVar.getClass();
                mVar.getClass();
                com.yandex.passport.internal.ui.domik.smsauth.a aVar2 = (com.yandex.passport.internal.ui.domik.smsauth.a) com.yandex.passport.internal.ui.domik.base.a.D(dVar, new com.yandex.passport.internal.ui.authbytrack.a(6));
                Bundle arguments = aVar2.getArguments();
                arguments.getClass();
                arguments.putParcelable("phone_confirmation_result", mVar);
                return aVar2;
            case 11:
                v vVar = (v) this.b;
                String str16 = (String) this.c;
                Parcelable.Creator<d> creator = d.CREATOR;
                d a = s.a(vVar.c);
                str16.getClass();
                e eVar = new e();
                Bundle bundle = new Bundle();
                bundle.putParcelable("track", a);
                bundle.putString("auth_url_param", str16);
                eVar.setArguments(bundle);
                return eVar;
            case 12:
                a0 a0Var = (a0) this.b;
                m mVar2 = (m) this.c;
                String str17 = com.yandex.passport.internal.ui.domik.sms.a.y;
                com.yandex.passport.internal.ui.domik.sms.a aVar3 = (com.yandex.passport.internal.ui.domik.sms.a) com.yandex.passport.internal.ui.domik.base.a.D(a0Var, new com.yandex.passport.internal.ui.authbytrack.a(5));
                Bundle arguments2 = aVar3.getArguments();
                arguments2.getClass();
                arguments2.putParcelable("phone_confirmation_result", mVar2);
                return aVar3;
            default:
                a0 a0Var2 = (a0) this.b;
                l lVar = (l) this.c;
                String str18 = com.yandex.passport.internal.ui.domik.username.a.y;
                a0Var2.getClass();
                com.yandex.passport.internal.ui.domik.username.a aVar4 = (com.yandex.passport.internal.ui.domik.username.a) com.yandex.passport.internal.ui.domik.base.a.D(a0Var2, new com.yandex.passport.internal.ui.authbytrack.a(7));
                aVar4.requireArguments().putBundle("master_account_key", cxb.K(new Pair("master-account", lVar)));
                return aVar4;
        }
    }

    public /* synthetic */ fb7(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
