package ru.yandex.taxi.surge.modal;

import defpackage.b57;
import defpackage.cms;
import defpackage.jl40;
import defpackage.jms;
import defpackage.ovw0;
import defpackage.tje;
import defpackage.wvw0;
import defpackage.zy6;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements b57, jms {
    public final /* synthetic */ wvw0 a;

    public a(wvw0 wvw0Var) {
        this.a = wvw0Var;
    }

    @Override // defpackage.b57
    public final void a(zy6 zy6Var) {
        wvw0 wvw0Var = this.a;
        tje.N(wvw0Var.Jg(), null, null, new SurgeShortcutModalPresenter$onButtonClick$1((ovw0) zy6Var, wvw0Var, null), 3);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof b57) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.a, wvw0.class, "onButtonClick", "onButtonClick(Lru/yandex/taxi/surge/models/domain/SurgeShortcutButtonAction;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
