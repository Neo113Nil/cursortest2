package ru.yandex.taxi.interceptors;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.u2c;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/interceptors/d;", "", "Companion", "ru/yandex/taxi/interceptors/c", "u2c", "go-client-android.libs:network_utils"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class d {
    public static final u2c Companion = new u2c();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new a(1))};
    public final ClientErrorsInterceptor$Error a;

    public /* synthetic */ d(int i, ClientErrorsInterceptor$Error clientErrorsInterceptor$Error) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = clientErrorsInterceptor$Error;
        }
    }

    public d() {
        this.a = null;
    }
}
