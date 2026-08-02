package ru.yandex.taxi.main_screen_custom.domain;

import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import com.yandex.go.shortcuts.dto.response.ObjectOverMap;
import defpackage.byx;
import defpackage.c430;
import defpackage.jl40;
import defpackage.s9f0;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class PromoUpdateInteractor$updatesPromo$2 extends FunctionReferenceImpl implements wls {
    public PromoUpdateInteractor$updatesPromo$2(f fVar) {
        super(2, fVar, f.class, "comparePromo", "comparePromo(Lru/yandex/taxi/main_screen_custom/domain/model/ProductsConfig;Lru/yandex/taxi/main_screen_custom/domain/model/ProductsConfig;)Z", 0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        c430 c430Var;
        c430 c430Var2;
        s9f0 s9f0Var = (s9f0) obj;
        s9f0 s9f0Var2 = (s9f0) obj2;
        ((f) this.receiver).getClass();
        ObjectOverMap c = s9f0Var.c();
        Mode mode = null;
        String a = c != null ? c.getA() : null;
        ObjectOverMap c2 = s9f0Var2.c();
        if (jl40.l(a, c2 != null ? c2.getA() : null) && jl40.l(s9f0Var.d(), s9f0Var2.d())) {
            byx b = s9f0Var.b();
            Screen screen = b != null ? b.a : null;
            byx b2 = s9f0Var2.b();
            if (screen == (b2 != null ? b2.a : null)) {
                byx b3 = s9f0Var.b();
                Mode mode2 = (b3 == null || (c430Var2 = b3.b) == null) ? null : c430Var2.a;
                byx b4 = s9f0Var2.b();
                if (b4 != null && (c430Var = b4.b) != null) {
                    mode = c430Var.a;
                }
                if (mode2 == mode) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
