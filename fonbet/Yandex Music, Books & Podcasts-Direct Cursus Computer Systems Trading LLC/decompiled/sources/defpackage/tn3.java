package defpackage;

import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.connectsdk.etc.helper.HttpMessage;
import com.yandex.passport.internal.analytics.j;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.entities.s;
import com.yandex.passport.internal.ui.SocialBindActivity;
import com.yandex.passport.internal.ui.base.d;
import com.yandex.passport.internal.ui.base.h;
import com.yandex.passport.internal.ui.c;
import com.yandex.passport.internal.ui.domik.a0;
import com.yandex.passport.internal.ui.social.gimap.MailGIMAPActivity;
import com.yandex.passport.internal.ui.social.gimap.i;
import com.yandex.passport.internal.ui.social.gimap.p;
import com.yandex.passport.internal.ui.social.gimap.q;
import com.yandex.plus.core.network.api.utils.a;
import com.yandex.plus.pay.ui.core.b;
import io.appmetrica.analytics.impl.C0;
import io.appmetrica.analytics.impl.Y;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Callable;
import ru.kinopoisk.sdk.easylogin.internal.T0;

/* loaded from: classes5.dex */
public final /* synthetic */ class tn3 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tn3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ac, code lost:
    
        if (r0.j.c() != false) goto L66;
     */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        p pVar;
        boolean z = false;
        int i = 3;
        int i2 = 1;
        switch (this.a) {
            case 0:
                return ((C0) this.b).p();
            case 1:
                gp6 gp6Var = ((kp6) this.b).g;
                gp6Var.getClass();
                osh.x();
                nnk nnkVar = gp6Var.c;
                jac jacVar = (jac) nnkVar.b;
                String str = (String) nnkVar.a;
                jacVar.getClass();
                if (!new File((File) jacVar.c, str).exists()) {
                    if (gp6Var.e() != null) {
                        break;
                    }
                    return Boolean.valueOf(z);
                }
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                }
                jac jacVar2 = (jac) nnkVar.b;
                jacVar2.getClass();
                new File((File) jacVar2.c, str).delete();
                z = true;
                return Boolean.valueOf(z);
            case 2:
                hgp hgpVar = (hgp) ((y8p) this.b).c;
                jpc jpcVar = (jpc) hgpVar.a;
                fsp fspVar = (fsp) hgpVar.c;
                String str2 = jpcVar.b;
                osh.y();
                try {
                    HashMap c = jpc.c(fspVar);
                    vx6 vx6Var = new vx6(str2, c);
                    vx6Var.F(HttpMessage.USER_AGENT, "Crashlytics Android SDK/19.4.4");
                    vx6Var.F("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    jpc.b(vx6Var, fspVar);
                    String concat = "Requesting settings from ".concat(str2);
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", concat, null);
                    }
                    String str3 = "Settings query params were: " + c;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str3, null);
                    }
                    return jpcVar.d(vx6Var.B());
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "Settings request failed.", e);
                    return null;
                }
            case 3:
                return T0.e((T0) this.b);
            case 4:
                return Y.e((Y) this.b);
            case 5:
                return (h) this.b;
            case 6:
                return (Bitmap) this.b;
            case 7:
                c cVar = (c) this.b;
                String e2 = cVar.b.e();
                if (e2.equals(cVar.getPackageName())) {
                    return null;
                }
                PackageManager packageManager = cVar.getPackageManager();
                byte[] bArr = s.c;
                s B = a.B(packageManager, e2);
                if (B.d()) {
                    return null;
                }
                boolean d = com.yandex.passport.common.util.a.d(cVar);
                s q = a.q(cVar.getPackageManager(), cVar.getPackageName());
                if (B.c() || d) {
                    byte[] b = B.b();
                    b.getClass();
                    if (Arrays.equals(q.b(), b)) {
                        return null;
                    }
                }
                o0 o0Var = cVar.c;
                String encodeToString = Base64.encodeToString(B.b(), 2);
                encodeToString.getClass();
                o0Var.getClass();
                xy0 xy0Var = new xy0(0);
                xy0Var.put("package", e2);
                xy0Var.put("fingerprint", encodeToString);
                o0Var.a.b(j.l, xy0Var);
                return e2;
            case 8:
                SocialBindActivity socialBindActivity = (SocialBindActivity) this.b;
                return socialBindActivity.e.a().e(b.K(socialBindActivity.d.c));
            case 9:
                d dVar = (d) this.b;
                return dVar.x(dVar.h);
            case 10:
                return (com.yandex.passport.internal.ui.domik.phone_number.a) com.yandex.passport.internal.ui.domik.base.a.D((a0) this.b, new com.yandex.passport.internal.ui.authbytrack.a(i));
            case 11:
                return (com.yandex.passport.internal.ui.domik.extaction.a) com.yandex.passport.internal.ui.domik.base.a.D((com.yandex.passport.internal.ui.domik.d) this.b, new com.yandex.passport.internal.ui.authbytrack.a(i2));
            case 12:
                q qVar = ((MailGIMAPActivity) this.b).f;
                synchronized (qVar) {
                    pVar = qVar.u;
                }
                String str4 = pVar.a;
                com.yandex.passport.internal.ui.social.gimap.j jVar = new com.yandex.passport.internal.ui.social.gimap.j();
                Bundle bundle = new Bundle();
                if (str4 != null) {
                    bundle.putSerializable("current_state", i.b);
                }
                jVar.setArguments(bundle);
                return jVar;
            default:
                return ((com.yandex.passport.internal.util.d) this.b).a();
        }
    }
}
