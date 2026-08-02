package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import com.yandex.go.search.router.Origin;
import com.yandex.go.telemetry.experiment.TelemetryReportConfigExperiment;
import defpackage.qu;
import defpackage.sls;
import defpackage.yn5;
import kotlinx.serialization.json.b;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.communications.stories.domain.a;
import ru.yandex.taxi.delivery.ui.setuprequierements.c;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes5.dex */
public final class yn5 extends h55 {
    public final /* synthetic */ int D;
    public final Object E;
    public final Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn5(dit0 dit0Var, Address address, ModalViewOrigin modalViewOrigin, boolean z) {
        super(null);
        this.D = 8;
        this.E = (d83) dit0Var.a.get();
        this.F = new c83(new s80(address), SourcePicker.NONE, modalViewOrigin, z, new e83(4, this));
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        byx byxVar;
        int i;
        int i2 = this.D;
        int i3 = 3;
        int i4 = 9;
        int i5 = 4;
        Object obj2 = this.F;
        Object obj3 = this.E;
        switch (i2) {
            case 0:
                A((p2z0) obj3, (o2z0) obj, new bb0(this, 11));
                break;
            case 1:
                A((ypc) obj3, (wpc) obj, new zpc(this, 0));
                break;
            case 2:
                z((c) obj3, new abi(this));
                break;
            case 3:
                ngw ngwVar = (ngw) obj;
                cyx cyxVar = (cyx) obj3;
                PointType pointType = ngwVar.b;
                int[] iArr = ogw.a;
                int i6 = iArr[pointType.ordinal()];
                int i7 = 1;
                if (i6 == 1) {
                    byxVar = new byx(Screen.CHOOSE_A, new c430(Mode.NORMAL, (b) null, (un0) null));
                } else if (i6 != 2) {
                    w511.b();
                    break;
                } else {
                    byxVar = new byx(Screen.CHOOSE_B, new c430(Mode.NORMAL, (b) null, (un0) null));
                }
                cyxVar.b(byxVar);
                m950 m950Var = (m950) ((yvf0) obj2).get();
                int i8 = iArr[ngwVar.b.ordinal()];
                if (i8 == 1) {
                    i = kyh0.new_point_selection_screen_starting_point_title_statement;
                } else if (i8 != 2) {
                    w511.b();
                    break;
                } else {
                    i = kyh0.new_point_selection_screen_destination_point_title_statement;
                }
                E(m950Var, new m41(i, ngwVar.a, ngwVar.b, Origin.INTERCITY, ngwVar.d, ngwVar.c, true, true, null, null, null, 524032), new cyh(i7, this), hxx.a);
                break;
            case 4:
                A((com.yandex.go.business.impl.router.b) obj3, (vn51) obj, new mo30(i5, this));
                break;
            case 5:
                A((udc0) obj3, (dm80) obj, new r75(i3, this));
                break;
            case 6:
                A((i85) obj3, (mbe0) obj, new h85(2, this));
                break;
            case 7:
                A((pvm) obj3, (qvm) obj, new lhd(this, 3));
                break;
            case 8:
                A((d83) obj3, (c83) obj2, new yio0(i4, this));
                break;
            case 9:
                A((a) obj3, (npu0) obj, new sy60() { // from class: com.yandex.go.safety.center.main.c
                    @Override // defpackage.sy60
                    public final void a() {
                        yn5 yn5Var = yn5.this;
                        ((SafetyCenterMainView$3$1) ((sls) yn5Var.F)).invoke();
                        yn5Var.r(new qu(9));
                    }
                });
                break;
            case 10:
                if (!((TelemetryReportConfigExperiment) ((d6i) obj3).a.b()).b()) {
                    r(new qu(9));
                    break;
                } else {
                    A((m950) ((yvf0) obj2).get(), zy11.a, new yio0(20, this));
                    break;
                }
            default:
                A((gg41) obj3, (dg41) obj, new h331(this, i5));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yn5(int i, Object obj, Object obj2) {
        super(null);
        this.D = i;
        this.E = obj;
        this.F = obj2;
    }
}
