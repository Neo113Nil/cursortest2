package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.inapp_calls.navigation.f;
import com.yandex.go.places.impl.navigation.organization.card.a;
import io.appmetrica.analytics.BuildConfig;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;

/* loaded from: classes13.dex */
public final class rwo0 extends h55 {
    public final /* synthetic */ int D;
    public final Object E;
    public final Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rwo0(dit0 dit0Var, Address address, int i, ModalViewOrigin modalViewOrigin, boolean z) {
        super(null);
        this.D = 8;
        this.E = (d83) dit0Var.a.get();
        this.F = new c83(new t621(address, i), SourcePicker.NONE, modalViewOrigin, z, new e83(3, this));
    }

    @Override // defpackage.h55
    public void G(Object obj) {
        switch (this.D) {
            case 2:
                String str = ((s640) obj).a;
                if (str == null) {
                    P();
                    break;
                } else {
                    D((m950) ((r3g) this.E).get(), new npu0((x3) new mpu0(str), "masstransit_order", (Float) null, false, HProv.PP_SAME_MEDIA), new j2f(this, 0));
                    break;
                }
        }
    }

    @Override // defpackage.h55
    public void J(Object obj) {
        int i = this.D;
        int i2 = 1;
        Object obj2 = this.F;
        Object obj3 = this.E;
        switch (i) {
            case 0:
                z7n0 z7n0Var = (z7n0) obj;
                PerformanceAnalytics$Type performanceAnalytics$Type = PerformanceAnalytics$Type.Loading;
                fva0.f((fva0) obj2, "ScootersStories", performanceAnalytics$Type, 0L, 4);
                A((m950) ((yvf0) obj3).get(), new npu0(new mpu0(z7n0Var.a), "discovery_scooters", (Float) null, z7n0Var.b, BuildConfig.API_LEVEL), new p4g0(this, 10));
                fva0.b((fva0) obj2, "ScootersStories", performanceAnalytics$Type, null, 4);
                break;
            case 1:
                A((a) obj3, (dm80) obj2, new r75(i2, this));
                break;
            case 3:
                A((pvm) obj3, (qvm) obj, new lhd(this, 2));
                break;
            case 4:
                A((f) obj3, (hkv) obj, new xkv(this, i2));
                break;
            case 5:
                A((xoy) obj3, (poy) obj, new mo30(9, this));
                break;
            case 6:
                A((vgc0) obj3, (ugc0) obj, new wgc0(this));
                break;
            case 7:
                A((op0) obj3, (mp0) obj, new m5s0(this));
                break;
            case 8:
                A((d83) obj3, (c83) obj2, new yio0(8, this));
                break;
            case 9:
                A((ru.yandex.taxi.communications.stories.domain.a) obj3, (npu0) obj, new yio0(13, this));
                break;
            case 10:
                A((m950) ((umt0) obj3).get(), (q5y0) obj, new u5y0(this));
                break;
            case 11:
                A((m950) ((yvf0) obj3).get(), (qvm) obj, new lhd(this, 5));
                break;
        }
    }

    public void P() {
        s640 s640Var = (s640) this.x;
        if (s640Var == null) {
            return;
        }
        String str = s640Var.d;
        String str2 = s640Var.c;
        vby vbyVar = xby.d;
        String valueOf = str2 != null ? Integer.valueOf(str2.length()) : "null";
        Object valueOf2 = str != null ? Integer.valueOf(str.length()) : "null";
        valueOf.toString();
        valueOf2.toString();
        vbyVar.getClass();
        A((m950) ((e840) this.F).get(), new d1z0(s640Var.b, str2, str, s640Var.e), new k2f(this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rwo0(vgc0 vgc0Var) {
        this(6, vgc0Var, qgc0.U3);
        this.D = 6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rwo0(int i, Object obj, Object obj2) {
        super(null);
        this.D = i;
        this.E = obj;
        this.F = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rwo0(pv01 pv01Var, s0g s0gVar) {
        super(null);
        this.D = 11;
        this.F = pv01Var;
        this.E = s0gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rwo0(a aVar, xl80 xl80Var) {
        super(null);
        this.D = 1;
        this.E = aVar;
        this.F = xl80Var;
    }
}
