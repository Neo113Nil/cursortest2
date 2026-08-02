package com.yandex.plus.home;

import android.content.Context;
import android.webkit.WebSettings;
import com.yandex.plus.home.internal.di.u;
import com.yandex.plus.pay.adapter.internal.c1;
import defpackage.jyr;
import defpackage.r7o;
import defpackage.su4;
import defpackage.t7o;
import defpackage.z7o;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final /* synthetic */ class e implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u b;

    public /* synthetic */ e(u uVar, int i) {
        this.a = i;
        this.b = uVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object t7oVar;
        int i = this.a;
        u uVar = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(com.yandex.plus.core.utils.b.a.a(uVar.a).j());
            case 1:
                return new com.yandex.plus.home.core.navigation.a(uVar.a, uVar.x);
            case 2:
                return new com.yandex.plus.home.core.navigation.b(uVar.a);
            case 3:
                Context context = uVar.a;
                try {
                    r7o r7oVar = z7o.b;
                    t7oVar = WebSettings.getDefaultUserAgent(context);
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                }
                Throwable a = z7o.a(t7oVar);
                if (a != null) {
                    com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.a;
                    String p = su4.p(a, new StringBuilder("getDefaultUserAgent() failed with exception "));
                    jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                    com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.d, bVar, p, a);
                }
                if (t7oVar instanceof t7o) {
                    t7oVar = null;
                }
                String str = (String) t7oVar;
                return str == null ? "Unknown WebView" : str;
            case 4:
                com.yandex.plus.pay.adapter.api.a aVar = uVar.f;
                uVar.w.getClass();
                return new c1(aVar.a, aVar.b);
            case 5:
                return (com.yandex.plus.acquisition.adapter.internal.adapter.a) uVar.y.c.getValue();
            default:
                com.yandex.plus.ui.core.theme.provider.c cVar = uVar.n;
                cVar.getClass();
                cVar.getClass();
                return new com.yandex.plus.core.theme.d(R.style.PlusSDK_Theme_Home_Light, R.style.PlusSDK_Theme_Home_Dark);
        }
    }
}
