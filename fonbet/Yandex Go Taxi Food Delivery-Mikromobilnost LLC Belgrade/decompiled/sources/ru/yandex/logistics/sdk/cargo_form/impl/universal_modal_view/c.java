package ru.yandex.logistics.sdk.cargo_form.impl.universal_modal_view;

import defpackage.bvf0;
import defpackage.c9x0;
import defpackage.czh;
import defpackage.gl;
import defpackage.gzh;
import defpackage.ike;
import defpackage.izh;
import defpackage.jo0;
import defpackage.s030;
import defpackage.st2;
import defpackage.tis0;
import defpackage.tje;
import defpackage.ts11;
import defpackage.v230;
import defpackage.w3i;
import defpackage.x230;
import defpackage.xl10;
import defpackage.zni;
import ru.yandex.logistics.sdk.cargo_form.core.api.models.modal.ModalViewType;
import ru.yandex.logistics.sdk.cargo_form.impl.universal_modal_view.c;
import ru.yandex.taxi.logistics.childrouter.api.ButtonType;
import ru.yandex.taxi.logistics.childrouter.api.ScreenMode;
import ru.yandex.taxi.logistics.childrouter.api.ScreenState;

/* loaded from: classes5.dex */
public final class c {
    public final xl10 a;
    public final gzh b;
    public final w3i c;
    public final x230 d;
    public final com.yandex.delivery.utils.storage.impl.c e;
    public final ike f;

    public c(xl10 xl10Var, gzh gzhVar, w3i w3iVar, x230 x230Var, com.yandex.delivery.utils.storage.impl.c cVar, st2 st2Var) {
        this.a = xl10Var;
        this.b = gzhVar;
        this.c = w3iVar;
        this.d = x230Var;
        this.e = cVar;
        this.f = bvf0.a(st2Var.c);
    }

    public final void a(final c9x0 c9x0Var, final s030 s030Var, final tis0 tis0Var) {
        tje.N(this.f, null, null, new ModalViewRouter$open$1(this, c9x0Var, null), 3);
        czh create = this.b.create();
        ModalViewType modalViewType = (ModalViewType) tis0Var.c;
        boolean z = modalViewType == ModalViewType.OVER_MAP;
        boolean z2 = modalViewType == ModalViewType.OVER_CAMERA;
        zni zniVar = new zni() { // from class: u230
            @Override // defpackage.zni
            public final xni create() {
                c cVar = c.this;
                xl10 xl10Var = cVar.a;
                c9x0 c9x0Var2 = c9x0Var;
                String str = c9x0Var2.a;
                zi8 zi8Var = c9x0Var2.b;
                tis0 tis0Var2 = tis0Var;
                return (xni) ((xvf0) gvb1.b(str, new l030(zi8Var, (ModalViewType) tis0Var2.c, tis0Var2.b), s030Var, cVar.c, (dt20) xl10Var.a).m).get();
            }
        };
        jo0 jo0Var = tis0Var.b ? new jo0(this, c9x0Var, tis0Var, s030Var, 23) : null;
        v230 v230Var = jo0Var != null ? new v230(jo0Var) : null;
        ButtonType buttonType = c9x0Var.c;
        ScreenMode screenMode = (!c9x0Var.b.a() || z) ? ScreenMode.FIXED : ScreenMode.SLIDEABLE;
        ScreenState screenState = z ? ScreenState.OVER_MAP : z2 ? ScreenState.OVER_CAMERA : ScreenState.COMMON;
        boolean z3 = c9x0Var.f;
        ts11 ts11Var = new ts11((z || z2) ? false : true, false, (Integer) tis0Var.w, null, null, 475);
        gl glVar = new gl();
        glVar.a = z;
        glVar.b = s030Var;
        glVar.c = this;
        glVar.w = c9x0Var;
        glVar.x = create;
        czh.a(create, new izh(zniVar, v230Var, buttonType, screenMode, screenState, z, z3, z, ts11Var, glVar, c9x0Var.a, z, new ModalViewRouter$open$5(1, this.d, x230.class, "isOnTop", "isOnTop(Ljava/lang/String;)Z", 0)));
    }
}
