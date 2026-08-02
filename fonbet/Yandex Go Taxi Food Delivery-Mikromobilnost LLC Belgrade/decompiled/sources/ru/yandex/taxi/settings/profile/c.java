package ru.yandex.taxi.settings.profile;

import defpackage.qn21;
import defpackage.tje;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class c implements vpr {
    public final /* synthetic */ qn21 a;

    public c(qn21 qn21Var) {
        this.a = qn21Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        qn21 qn21Var = this.a;
        tje.N(qn21Var.Jg(), null, null, new UserInfoProfilePresenter$loadCurrentAccount$1(qn21Var, null), 3);
        return zy11.a;
    }
}
