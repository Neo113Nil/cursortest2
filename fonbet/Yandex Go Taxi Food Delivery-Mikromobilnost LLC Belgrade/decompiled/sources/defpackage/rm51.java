package defpackage;

import android.content.Context;
import android.os.Build;
import com.yandex.go.splash.AfterSplashType;
import com.yandex.go.splash.BaseSplashView;
import com.yandex.go.splash.data.dto.DynamicSplash;
import com.yandex.go.splash.dynamic.DynamicSplashView;
import com.yandex.go.splash.dynamic.a;
import com.yandex.go.splash.dynamic.c;
import ru.yandex.taxi.widgets.GoSplashView;

/* loaded from: classes9.dex */
public final class rm51 extends oqt0 {
    public final h6r a;

    public rm51(h6r h6rVar) {
        this.a = h6rVar;
    }

    @Override // defpackage.oqt0
    public final AfterSplashType a() {
        return AfterSplashType.WELCOME;
    }

    @Override // defpackage.oqt0
    public final BaseSplashView b(Context context) {
        zzf zzfVar = (zzf) this.a;
        DynamicSplash c = ((c) zzfVar.Ji.get()).c();
        if (c != null) {
            ((lt2) zzfVar.g.get()).getClass();
            return new DynamicSplashView(context, null, 0, c, new sah(), ((hit) zzfVar.z.get()).a, (pav) zzfVar.p3.get(), (a) zzfVar.Li.get(), (qqt0) zzfVar.Ki.get(), 6, null);
        }
        return new GoSplashView(context, (qqt0) zzfVar.Ki.get(), null, 0, 12, null);
    }

    @Override // defpackage.oqt0
    public final boolean c() {
        return Build.VERSION.SDK_INT >= 32;
    }
}
