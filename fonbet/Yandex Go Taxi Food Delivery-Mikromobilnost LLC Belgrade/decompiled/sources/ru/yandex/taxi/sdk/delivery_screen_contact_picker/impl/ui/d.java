package ru.yandex.taxi.sdk.delivery_screen_contact_picker.impl.ui;

import defpackage.bj91;
import defpackage.bvf0;
import defpackage.cd0;
import defpackage.dae;
import defpackage.ds31;
import defpackage.efb0;
import defpackage.evu0;
import defpackage.ffx;
import defpackage.gbe;
import defpackage.hbe;
import defpackage.ibe;
import defpackage.nde;
import defpackage.oxh0;
import defpackage.qae;
import defpackage.rae;
import defpackage.s9e;
import defpackage.sae;
import defpackage.teb0;
import defpackage.ti91;
import defpackage.tje;
import defpackage.ueb0;
import defpackage.yr31;
import defpackage.yuj0;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class d extends yr31 {
    public final r0 A;
    public final r0 B;
    public final r0 C;
    public final cd0 D;
    public final n0 E;
    public final n0 F;
    public final rae b;
    public final ru.yandex.taxi.sdk.delivery_screen_contact_picker.impl.a c;
    public final com.yandex.delivery.utils.dialogmanager.impl.b w;
    public final sae x;
    public final r0 y;
    public final r0 z;

    public d(qae qaeVar, rae raeVar, ru.yandex.taxi.sdk.delivery_screen_contact_picker.impl.a aVar, com.yandex.delivery.utils.dialogmanager.impl.b bVar, sae saeVar) {
        ti91 teb0Var;
        String str;
        yuj0 yuj0Var = (yuj0) saeVar.b;
        this.b = raeVar;
        this.c = aVar;
        this.w = bVar;
        this.x = saeVar;
        r0 c = bvf0.c(null);
        this.y = c;
        r0 c2 = bvf0.c(null);
        this.z = c2;
        this.A = c2;
        r0 c3 = bvf0.c(null);
        this.B = c3;
        this.C = c3;
        this.D = new cd0(25, c2, this);
        n0 b = ffx.b(1, 1, BufferOverflow.DROP_OLDEST);
        this.E = b;
        this.F = b;
        String str2 = qaeVar.b;
        c.m(null, new gbe((str2 == null || evu0.J(str2)) ? qaeVar.a ? yuj0Var.a(oxh0.cargoform_contact_picker_sender, new Object[0]) : yuj0Var.a(oxh0.cargoform_contact_picker_recipient, new Object[0]) : str2, qaeVar.c));
        s9e s9eVar = qaeVar.w;
        if (s9eVar != null) {
            String str3 = s9eVar.a;
            str = s9eVar.b;
            teb0Var = (evu0.J(str3) || evu0.J(bj91.m(str))) ? new teb0(yuj0Var.a(oxh0.cargoform_contact_picker_phone_number, new Object[0])) : new ueb0(str3);
        } else {
            teb0Var = new teb0(yuj0Var.a(oxh0.cargoform_contact_picker_enter_phone_or_name, new Object[0]));
            str = "";
        }
        c2.m(null, new ibe(teb0Var, yuj0Var.a(oxh0.cargoform_contact_picker_contacts, new Object[0]), new efb0(str, str.length())));
        X();
        List<s9e> list = qaeVar.x;
        ArrayList arrayList = new ArrayList();
        for (s9e s9eVar2 : list) {
            String str4 = s9eVar2.a;
            dae daeVar = evu0.J(str4) ^ true ? new dae(str4, s9eVar2.b) : null;
            if (daeVar != null) {
                arrayList.add(daeVar);
            }
        }
        r0 r0Var = this.B;
        hbe hbeVar = new hbe(arrayList);
        r0Var.getClass();
        r0Var.m(null, hbeVar);
    }

    public final void W(String str, String str2) {
        s9e s9eVar = new s9e(str, bj91.m(str2));
        rae raeVar = this.b;
        nde ndeVar = raeVar.a;
        ndeVar.h.invoke(raeVar.a(ndeVar.i, s9eVar));
        raeVar.b.dismiss();
    }

    public final void X() {
        tje.N(ds31.a(this), null, null, new ContactPickerViewModel$focusInputField$1(this, null), 3);
    }
}
