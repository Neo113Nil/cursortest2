package ru.yandex.taxi.preorder.extraphone;

import com.yandex.go.taxi.order.models.api.preorder.extraphone.ExtraPhoneContact;
import defpackage.b8r;
import defpackage.bre0;
import defpackage.ffx;
import defpackage.tpr;
import defpackage.wiq0;
import defpackage.zy11;
import java.util.HashMap;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes6.dex */
public final class e implements bre0 {
    public final wiq0 a;
    public final b8r b;
    public final HashMap c = new HashMap();
    public final n0 d = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public e(wiq0 wiq0Var, b8r b8rVar) {
        this.a = wiq0Var;
        this.b = b8rVar;
    }

    public final tpr a(String str) {
        return kotlinx.coroutines.flow.e.t(new d(new n(this.d, new ExtraPhoneProvider$contactForTariffFlow$1(2, null)), this, str));
    }

    @Override // defpackage.bre0
    public final void b() {
        this.c.clear();
        this.d.g(zy11.a);
    }

    public final ExtraPhoneContact c(String str) {
        ExtraPhoneContact extraPhoneContact = (ExtraPhoneContact) this.c.get(str);
        return extraPhoneContact == null ? ExtraPhoneContact.c : extraPhoneContact;
    }
}
