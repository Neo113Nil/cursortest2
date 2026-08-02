package defpackage;

import android.app.Application;
import android.os.Handler;
import com.yandex.payment.sdk.ui.preselect.PreselectActivity;

/* loaded from: classes2.dex */
public final class zue0 implements hs31 {
    public final vv90 a;
    public final Handler b;
    public final String c;
    public final t0p w;
    public final rwo x;

    public zue0(Application application, vv90 vv90Var, Handler handler, String str, PreselectActivity.a aVar, rwo rwoVar) {
        this.a = vv90Var;
        this.b = handler;
        this.c = str;
        this.w = aVar;
        this.x = rwoVar;
    }

    @Override // defpackage.hs31
    public final yr31 create(Class cls) {
        if (!cls.equals(rwe0.class)) {
            ny61.r("Unknown view model");
            return null;
        }
        return new rwe0(this.a, this.b, this.c, this.w, this.x);
    }
}
