package ru.yandex.taxi.ui.form.constructor;

import defpackage.bvf0;
import defpackage.i3y;
import defpackage.lcj0;
import defpackage.lqi0;
import defpackage.vbj0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class a {
    public final lcj0 a;
    public final vbj0 b;
    public final i3y c = kotlin.a.b(LazyThreadSafetyMode.NONE, new lqi0(28));
    public final r0 d = bvf0.c(kotlin.collections.a.J0(b()));

    public a(lcj0 lcj0Var, vbj0 vbj0Var) {
        this.a = lcj0Var;
        this.b = vbj0Var;
    }

    public final n a() {
        return new n(e.d(this.d), new RequirementAddressFormUiConstructor$contentFlow$1(this, null));
    }

    public final List b() {
        return (List) this.c.getValue();
    }
}
