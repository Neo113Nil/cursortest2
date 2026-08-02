package ru.yandex.taxi.interceptors;

import defpackage.sls;
import defpackage.u2c;
import defpackage.vez0;
import java.lang.annotation.Annotation;

/* loaded from: classes9.dex */
public final /* synthetic */ class a implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return vez0.g("ru.yandex.taxi.interceptors.ClientErrorsInterceptor.Error", ClientErrorsInterceptor$Error.values(), new String[]{"unauthorized", "blocked"}, new Annotation[][]{null, null});
            default:
                u2c u2cVar = d.Companion;
                return ClientErrorsInterceptor$Error.Companion.serializer();
        }
    }
}
