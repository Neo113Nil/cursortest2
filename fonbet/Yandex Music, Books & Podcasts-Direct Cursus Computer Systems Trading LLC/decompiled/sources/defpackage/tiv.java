package defpackage;

import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.o1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class tiv implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aqi b;

    public /* synthetic */ tiv(aqi aqiVar, int i) {
        this.a = i;
        this.b = aqiVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean a;
        switch (this.a) {
            case 0:
                break;
            case 1:
                this.b.setValue(Boolean.FALSE);
                break;
            case 2:
                zsv zsvVar = (zsv) this.b.getValue();
                zsvVar.getClass();
                if (!(zsvVar instanceof ysv)) {
                    if (!(zsvVar instanceof xsv)) {
                        b6e.s();
                        break;
                    } else {
                        wsv wsvVar = ((xsv) zsvVar).b;
                        qsv qsvVar = wsvVar instanceof qsv ? (qsv) wsvVar : null;
                        a = qsvVar != null ? qsvVar.c.a() : true;
                    }
                } else {
                    a = false;
                }
                break;
            case 3:
                break;
            case 4:
                this.b.setValue(Boolean.TRUE);
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                this.b.setValue(Boolean.TRUE);
                break;
            case 8:
                this.b.setValue(Boolean.TRUE);
                break;
            case 9:
                bzv bzvVar = (bzv) this.b.getValue();
                zyv zyvVar = bzvVar instanceof zyv ? (zyv) bzvVar : null;
                break;
            case 10:
                this.b.setValue(o1.a);
                break;
            default:
                this.b.setValue(o1.b);
                break;
        }
        return Unit.a;
    }
}
