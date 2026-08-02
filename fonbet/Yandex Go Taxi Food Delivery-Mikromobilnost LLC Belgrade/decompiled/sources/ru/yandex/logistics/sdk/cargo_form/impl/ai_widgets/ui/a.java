package ru.yandex.logistics.sdk.cargo_form.impl.ai_widgets.ui;

import defpackage.bq1;
import defpackage.cd0;
import defpackage.ha2;
import defpackage.mrj;
import defpackage.ofg;
import defpackage.p3s;
import defpackage.u3s;
import kotlinx.coroutines.flow.e;

/* loaded from: classes5.dex */
public final class a {
    public final bq1 a;
    public final mrj b;
    public final u3s c;
    public final ofg d;

    public a(bq1 bq1Var, mrj mrjVar, u3s u3sVar, ofg ofgVar) {
        this.a = bq1Var;
        this.b = mrjVar;
        this.c = u3sVar;
        this.d = ofgVar;
    }

    public final ha2 a() {
        bq1 bq1Var = this.a;
        return e.n(new cd0(4, ((p3s) bq1Var.a).b("delivery_ai_tools"), bq1Var), this.c.a(), this.d.a(), new AiWidgetsConfigProvider$aiWidgetsConfigFlow$1(this, null));
    }
}
