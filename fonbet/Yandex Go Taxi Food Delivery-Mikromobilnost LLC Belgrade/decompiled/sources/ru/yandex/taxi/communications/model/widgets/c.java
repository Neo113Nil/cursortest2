package ru.yandex.taxi.communications.model.widgets;

import com.adjust.sdk.Constants;
import defpackage.f9;
import defpackage.lb7;
import defpackage.qoi0;
import defpackage.xqt;
import java.util.Arrays;
import java.util.List;
import ru.yandex.taxi.communications.model.widgets.ActionButton;

/* loaded from: classes5.dex */
public final class c extends xqt {
    public static final c e = new c();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, m0.INSTANCE.serializer(), qoi0.a(m0.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("web_view", n0.INSTANCE.serializer(), qoi0.a(n0.class)), new f9(Constants.DEEPLINK, ActionButton.d.Companion.serializer(), qoi0.a(ActionButton.d.class)), new f9("apply_promocode", ActionButton.a.Companion.serializer(), qoi0.a(ActionButton.a.class)), new f9("add_promocode", d.INSTANCE.serializer(), qoi0.a(d.class)), new f9("request_totw_with_key_and_value", ActionButton.k.Companion.serializer(), qoi0.a(ActionButton.k.class)), new f9("pick_contact_for_totw", ActionButton.j.Companion.serializer(), qoi0.a(ActionButton.j.class)), new f9("modal_view", ActionButton.h.Companion.serializer(), qoi0.a(ActionButton.h.class)), new f9("lootbox", ActionButton.g.Companion.serializer(), qoi0.a(ActionButton.g.class)), new f9("direct_offer", ActionButton.f.Companion.serializer(), qoi0.a(ActionButton.f.class)), new f9("do_nothing", x.INSTANCE.serializer(), qoi0.a(x.class)), new f9("order", e0.INSTANCE.serializer(), qoi0.a(e0.class)), new f9("share_route_button", l0.INSTANCE.serializer(), qoi0.a(l0.class)), new f9("select_payment_method", ActionButton.l.Companion.serializer(), qoi0.a(ActionButton.l.class)), new f9("close_modal_view_and_decline_order", q.INSTANCE.serializer(), qoi0.a(q.class)), new f9("close_modal_view_and_accept_order", ActionButton.c.Companion.serializer(), qoi0.a(ActionButton.c.class)), new f9("offer_substitution", ActionButton.i.Companion.serializer(), qoi0.a(ActionButton.i.class)), new f9("cancel_orders", ActionButton.b.Companion.serializer(), qoi0.a(ActionButton.b.class)));
    }
}
