package ru.yandex.taxi.summary.solid.repository;

import com.yandex.go.pin.repository.MainPinStyleRepositoryImpl$sourceV2StyleFlow$$inlined$flatMapLatest$1;
import com.yandex.go.pin.repository.o;
import com.yandex.go.summary.branding_pin.h;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.a0c0;
import defpackage.b0c0;
import defpackage.b1c0;
import defpackage.e0c0;
import defpackage.evu0;
import defpackage.lkv0;
import defpackage.lub0;
import defpackage.mdh;
import defpackage.p2c0;
import defpackage.r0c0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.uze0;
import defpackage.w511;
import defpackage.ybo;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.main.map.i;

/* loaded from: classes6.dex */
public final class f extends b1c0 {
    public final com.yandex.go.route.interactor.c a;
    public final i b;
    public final AddressResolveRepository c;
    public final r0c0 d;
    public final uze0 e;
    public final tt2 f;
    public final com.yandex.go.summary.branding_pin.i g;
    public final o h;
    public final ru.yandex.taxi.widget.utils.e i;
    public final p2c0 j;
    public final b0c0 k;

    public f(com.yandex.go.route.interactor.c cVar, i iVar, AddressResolveRepository addressResolveRepository, r0c0 r0c0Var, uze0 uze0Var, tt2 tt2Var, com.yandex.go.summary.branding_pin.i iVar2, o oVar, ru.yandex.taxi.widget.utils.e eVar, p2c0 p2c0Var) {
        this.a = cVar;
        this.b = iVar;
        this.c = addressResolveRepository;
        this.d = r0c0Var;
        this.e = uze0Var;
        this.f = tt2Var;
        this.g = iVar2;
        this.h = oVar;
        this.i = eVar;
        this.j = p2c0Var;
        this.k = r0c0Var.d();
    }

    public static final Object e(f fVar, AddressResolveRepository.State state, boolean z, ybo yboVar, lub0 lub0Var, SummaryPinV2DataRepository$stateInternalFlow$$inlined$combine$1$3 summaryPinV2DataRepository$stateInternalFlow$$inlined$combine$1$3) {
        String str;
        fVar.getClass();
        int i = lkv0.a[state.ordinal()];
        boolean z2 = true;
        if (i != 1 && i != 2) {
            if (i == 3) {
                return fVar.k;
            }
            if (i != 4 && i != 5) {
                w511.b();
                return null;
            }
            if (!yboVar.c && ((str = lub0Var.a) == null || evu0.J(str))) {
                z2 = false;
            }
            if (z && z2) {
                fVar.f.getClass();
                sjh sjhVar = uyj.a;
                return tje.k0(mdh.b, new SummaryPinV2DataRepository$pinStateWithIcon$2(fVar, lub0Var, null), summaryPinV2DataRepository$stateInternalFlow$$inlined$combine$1$3);
            }
            if (z) {
                Integer num = new Integer(yboVar.a);
                return num.intValue() <= 0 ? a0c0.c : new a0c0(String.valueOf(num.intValue()), num);
            }
        }
        return e0c0.a;
    }

    @Override // defpackage.b1c0
    public final tpr a(tpr tprVar) {
        return new m0(tprVar, this.c.b, new SummaryPinV2DataRepository$positionFlow$1(this.j.a(), null));
    }

    @Override // defpackage.b1c0
    public final tpr b(tpr tprVar) {
        return kotlinx.coroutines.flow.e.X(new m0(f(), this.b.a(), new SummaryPinV2DataRepository$stateFlow$1(3, null)), new SummaryPinV2DataRepository$stateFlow$$inlined$flatMapLatest$1(null, this));
    }

    @Override // defpackage.b1c0
    public final tpr c() {
        o oVar = this.h;
        return kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(oVar.c(), new MainPinStyleRepositoryImpl$sourceV2StyleFlow$$inlined$flatMapLatest$1(oVar, null)));
    }

    @Override // defpackage.b1c0
    public final tpr d() {
        return this.b.a();
    }

    public final tpr f() {
        com.yandex.go.summary.branding_pin.i iVar = this.g;
        tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.t(new h(((k) iVar.a).j.b(), iVar)));
        this.f.getClass();
        return kotlinx.coroutines.flow.e.F(t, uyj.a);
    }
}
