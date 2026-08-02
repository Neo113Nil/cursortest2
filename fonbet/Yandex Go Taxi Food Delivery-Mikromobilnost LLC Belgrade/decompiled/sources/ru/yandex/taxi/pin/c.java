package ru.yandex.taxi.pin;

import android.content.Context;
import defpackage.b0c0;
import defpackage.b1c0;
import defpackage.c0c0;
import defpackage.e0c0;
import defpackage.f1h0;
import defpackage.g92;
import defpackage.me0;
import defpackage.mqg0;
import defpackage.p2c0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.xyg0;
import defpackage.xzb0;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.widget.map.PinSlot;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

/* loaded from: classes6.dex */
public final class c extends b1c0 {
    public final me0 a;
    public final AddressResolveRepository b;
    public final p2c0 c;
    public final SourceOnMapControl.a d;
    public final SourceOnMapControl.a e;
    public final SourceOnMapControl.a f;

    /* JADX WARN: Multi-variable type inference failed */
    public c(me0 me0Var, AddressResolveRepository addressResolveRepository, p2c0 p2c0Var) {
        this.a = me0Var;
        this.b = addressResolveRepository;
        this.c = p2c0Var;
        Context context = me0Var.a;
        String str = null;
        boolean z = false;
        this.d = new SourceOnMapControl.a(new c0c0(tje.y(xyg0.ic_pin_for_add_favorites_screen, context)), null, str, false, z, null, null, 2046);
        String str2 = null;
        boolean z2 = false;
        this.e = new SourceOnMapControl.a(e0c0.a, str, str2, z, z2, 0 == true ? 1 : 0, null, 2046);
        this.f = new SourceOnMapControl.a(new b0c0(tje.y(f1h0.ic_error_pin_24, context), context.getColor(mqg0.component_cinnaban_toxic)), str2, null, z2, false, 0 == true ? 1 : 0, null, 2046);
    }

    @Override // defpackage.b1c0
    public final tpr a(tpr tprVar) {
        return new m0(tprVar, this.b.b, new AddFavoritesPinV2DataRepository$positionFlow$1(this.c.a(), null));
    }

    @Override // defpackage.b1c0
    public final tpr b(tpr tprVar) {
        return new b(this.b.a, this);
    }

    @Override // defpackage.b1c0
    public final tpr c() {
        me0 me0Var = this.a;
        me0Var.getClass();
        xzb0 xzb0Var = PinSlot.Companion;
        Context context = me0Var.a;
        xzb0Var.getClass();
        return new g92(2, xzb0.b(context));
    }

    @Override // defpackage.b1c0
    public final tpr d() {
        return new g92(2, Boolean.TRUE);
    }
}
