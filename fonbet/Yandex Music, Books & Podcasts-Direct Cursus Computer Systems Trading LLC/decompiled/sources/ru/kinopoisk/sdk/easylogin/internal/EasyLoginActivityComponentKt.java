package ru.kinopoisk.sdk.easylogin.internal;

import android.os.Bundle;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.bjt;
import defpackage.cvw;
import defpackage.ern;
import defpackage.fvw;
import defpackage.hn5;
import defpackage.is6;
import defpackage.jfu;
import defpackage.lm4;
import defpackage.nme;
import defpackage.nvw;
import defpackage.p97;
import defpackage.xq0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.di.Injector;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/di/Injector;", "Lru/kinopoisk/sdk/easylogin/internal/EasyLoginActivity;", "target", "", "inject", "(Lru/kinopoisk/sdk/easylogin/internal/di/Injector;Lru/kinopoisk/sdk/easylogin/internal/EasyLoginActivity;)V", "products_android_sdk_easyloginmobile"}, k = 2, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class EasyLoginActivityComponentKt {
    public static final void inject(@NotNull Injector injector, @NotNull EasyLoginActivity easyLoginActivity) {
        injector.getClass();
        easyLoginActivity.getClass();
        WeakHashMap<hn5, cvw> weakHashMap = Injector.c;
        cvw cvwVar = weakHashMap.get(easyLoginActivity);
        if (cvwVar == null) {
            lm4 a = ern.a(EasyLoginActivity.class);
            Bundle extras = easyLoginActivity.getIntent().getExtras();
            p97 p97Var = new p97(1);
            p97Var.a(ern.a(Injector.a.class), new nvw(a, extras));
            nme d = p97Var.d();
            jfu viewModelStore = easyLoginActivity.getViewModelStore();
            is6 defaultViewModelCreationExtras = easyLoginActivity.getDefaultViewModelCreationExtras();
            viewModelStore.getClass();
            defaultViewModelCreationExtras.getClass();
            bjt bjtVar = new bjt(viewModelStore, d, defaultViewModelCreationExtras);
            lm4 a2 = ern.a(Injector.a.class);
            String f = a2.f();
            if (f == null) {
                xq0.x("Local and anonymous classes can not be ViewModels");
                return;
            }
            fvw fvwVar = ((Injector.a) bjtVar.j(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f))).a;
            fvwVar.getClass();
            cvwVar = fvwVar.activityComponentFactory().create(easyLoginActivity);
            weakHashMap.put(easyLoginActivity, cvwVar);
        }
        cvwVar.getClass();
        ((EasyLoginActivityComponent) cvwVar).inject(easyLoginActivity);
    }
}
