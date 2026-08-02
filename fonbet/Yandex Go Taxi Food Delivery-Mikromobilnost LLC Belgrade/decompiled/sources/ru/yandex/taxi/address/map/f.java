package ru.yandex.taxi.address.map;

import android.content.Context;
import defpackage.b0c0;
import defpackage.b1c0;
import defpackage.e0c0;
import defpackage.g92;
import defpackage.i1c0;
import defpackage.kdc;
import defpackage.mqg0;
import defpackage.s8o;
import defpackage.tje;
import defpackage.tpr;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

/* loaded from: classes5.dex */
public final class f extends b1c0 {
    public final Context a;
    public final AddressResolveRepository b;
    public final kdc c;
    public final kdc d;
    public final SourceOnMapControl.a e;
    public final SourceOnMapControl.a f;
    public final SourceOnMapControl.a g;

    /* JADX WARN: Multi-variable type inference failed */
    public f(Context context, int i, int i2, AddressResolveRepository addressResolveRepository, kdc kdcVar, kdc kdcVar2) {
        this.a = context;
        this.b = addressResolveRepository;
        this.c = kdcVar;
        this.d = kdcVar2;
        String str = null;
        boolean z = false;
        this.e = new SourceOnMapControl.a(new b0c0(tje.y(i, context), s8o.m(kdcVar, context)), null, str, false, z, null, null, 2046);
        String str2 = null;
        boolean z2 = false;
        this.f = new SourceOnMapControl.a(e0c0.a, str, str2, z, z2, 0 == true ? 1 : 0, null, 2046);
        this.g = new SourceOnMapControl.a(new b0c0(tje.y(i2, context), context.getColor(mqg0.component_cinnaban_toxic)), str2, null, z2, false, 0 == true ? 1 : 0, null, 2046);
    }

    @Override // defpackage.b1c0
    public final tpr a(tpr tprVar) {
        return new m0(tprVar, this.b.b, new SimpleSelectorPinV2DataRepository$positionFlow$1(3, null));
    }

    @Override // defpackage.b1c0
    public final tpr b(tpr tprVar) {
        return new e(this.b.a, this);
    }

    @Override // defpackage.b1c0
    public final tpr c() {
        kdc kdcVar = this.d;
        Context context = this.a;
        return new g92(2, new i1c0(s8o.m(kdcVar, context), s8o.m(this.c, context)));
    }

    @Override // defpackage.b1c0
    public final tpr d() {
        return new g92(2, Boolean.TRUE);
    }
}
