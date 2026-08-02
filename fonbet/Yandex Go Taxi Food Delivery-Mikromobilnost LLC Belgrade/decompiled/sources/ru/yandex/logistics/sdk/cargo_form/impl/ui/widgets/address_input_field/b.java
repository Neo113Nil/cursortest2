package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.address_input_field;

import defpackage.hwy0;
import defpackage.m7;
import defpackage.p6s;
import defpackage.sae;
import defpackage.tpr;
import defpackage.u3s;
import defpackage.vv0;
import kotlinx.coroutines.flow.e;

/* loaded from: classes5.dex */
public final class b extends m7 {
    public final p6s b;
    public final hwy0 c;
    public final a d;
    public final sae e;
    public final vv0 f;

    public b(u3s u3sVar, p6s p6sVar, hwy0 hwy0Var, a aVar, sae saeVar, vv0 vv0Var) {
        super(u3sVar);
        this.b = p6sVar;
        this.c = hwy0Var;
        this.d = aVar;
        this.e = saeVar;
        this.f = vv0Var;
    }

    @Override // defpackage.m7
    public final String c() {
        return "address-input-field";
    }

    @Override // defpackage.m7
    public final tpr d(String str) {
        return e.m(this.c.b, b(str), this.b.e(), e.d(this.f.a), new AddressInputFieldStateHolder$getWidgets$1(this, null));
    }
}
