package ru.yandex.taxi.settings.main;

import defpackage.c600;
import defpackage.d600;
import defpackage.e600;
import defpackage.tls;
import defpackage.w511;
import defpackage.z500;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.settings.main.data.PaymentMenuItemAppearance;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class NativeMenuPresenter$startSubscriptions$17 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        e600 e600Var = (e600) obj;
        z500 z500Var = (z500) ((f) this.receiver).Dg();
        if (e600Var instanceof c600) {
            z500Var.l6(PaymentMenuItemAppearance.HIDDEN);
        } else {
            if (!(e600Var instanceof d600)) {
                w511.b();
                return null;
            }
            d600 d600Var = (d600) e600Var;
            z500Var.l6(d600Var.a ? PaymentMenuItemAppearance.ENABLED : PaymentMenuItemAppearance.DISABLED);
            if (d600Var.b) {
                z500Var.b1(d600Var.f);
            } else {
                z500Var.Vb();
            }
            z500Var.pd(d600Var.c);
            z500Var.w3(d600Var.d);
            z500Var.S2(d600Var.e);
        }
        return zy11.a;
    }
}
