package defpackage;

import com.yandex.go.chargers.order.active.q;
import com.yandex.go.scooters.offers.v2.components.bottom.domain.booking.g;
import com.yandex.go.scooters.parking.api.ParkingButtonAction;
import com.yandex.go.superapp.print_animation_text.PrintAnimationTextView;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ui.b;
import com.yandex.mapkit.directions.driving.Event;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.surge.dialog.TextBlockView;

/* loaded from: classes13.dex */
public final class z5 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z5(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        Object obj;
        boolean z;
        tls tlsVar;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((tls) obj3).invoke((m5) obj2);
                break;
            case 1:
                ((tls) obj3).invoke(new db01(((lt) obj2).e));
                break;
            case 2:
                ((tls) obj3).invoke(((m5f) obj2).a);
                break;
            case 3:
                ((tls) obj3).invoke(((p5f) obj2).a);
                break;
            case 4:
                ((tls) obj3).invoke(((o5f) obj2).a);
                break;
            case 5:
                ((tls) obj3).invoke(((n5f) obj2).a);
                break;
            case 6:
                ((tls) obj3).invoke(new pr5(((tq5) obj2).a));
                break;
            case 7:
                q qVar = (q) obj3;
                vca vcaVar = ((yca) obj2).e;
                List list = (List) qVar.J.getValue();
                if ((vcaVar instanceof tca) && list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (jl40.l(((oma) obj).a, ((tca) vcaVar).a)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    oma omaVar = (oma) obj;
                    if (omaVar != null) {
                        md6 md6Var = qVar.H;
                        CharSequence charSequence = omaVar.c;
                        String str = omaVar.b;
                        CharSequence charSequence2 = omaVar.d;
                        vk9 vk9Var = (vk9) md6Var.c;
                        vk9Var.A(vk9Var.J.a(vk9Var.E), new uma(charSequence, charSequence2, str), sy60.Q2);
                        break;
                    }
                }
                break;
            case 8:
                evd evdVar = (evd) obj2;
                ((tls) obj3).invoke(new avd(evdVar.a, true ^ evdVar.e));
                break;
            case 9:
                ((tls) obj3).invoke(((pte) obj2).c);
                break;
            case 10:
                jus0 jus0Var = (jus0) obj2;
                ((bms) obj3).invoke(jus0Var.a, jus0Var.b.toString(), jus0Var.c.toString(), jus0Var.d.toString());
                break;
            case 11:
                c31 c31Var = (c31) obj2;
                ((tls) obj3).invoke(new m21(c31Var.h, c31Var.i));
                break;
            case 12:
                ((tls) obj3).invoke(new vxo((nxo) obj2));
                break;
            case 13:
                tls tlsVar2 = (tls) obj3;
                wzu wzuVar = (wzu) obj2;
                tlsVar2.invoke(new ce31(wzuVar));
                tlsVar2.invoke(new od31(b.b(wzuVar)));
                break;
            case 14:
                tls tlsVar3 = (tls) obj3;
                a0v a0vVar = (a0v) obj2;
                tlsVar3.invoke(new ce31(a0vVar));
                tlsVar3.invoke(new od31(b.b(a0vVar)));
                break;
            case 15:
                tls tlsVar4 = (tls) obj3;
                yzu yzuVar = (yzu) obj2;
                tlsVar4.invoke(new ce31(yzuVar));
                tlsVar4.invoke(new od31(b.b(yzuVar)));
                break;
            case 16:
                ((tls) obj3).invoke((dae) obj2);
                break;
            case 17:
                ((tls) obj3).invoke(obj2);
                break;
            case 18:
                ((tls) obj3).invoke(((dl2) obj2).a);
                break;
            case 19:
                PrintAnimationTextView printAnimationTextView = (PrintAnimationTextView) obj3;
                z = printAnimationTextView.isAnimationPaused;
                if (!z) {
                    printAnimationTextView.planAnimationIteration((x2f0) obj2);
                    break;
                }
                break;
            case 20:
                ((tls) obj3).invoke((String) obj2);
                break;
            case 21:
                vrn0 vrn0Var = (vrn0) obj2;
                ((tls) obj3).invoke(new nrn0(vrn0Var.a, vrn0Var.e, vrn0Var.d));
                break;
            case 22:
                ((tls) obj3).invoke(new wbo0((ParkingButtonAction) ((eco0) obj2).b.c));
                break;
            case 23:
                ((j18) obj3).resumeWith(Boolean.valueOf(((g) obj2).c.c() != null));
                break;
            case 24:
                ((tls) obj3).invoke(new ksr0(((jrr0) obj2).a));
                break;
            case 25:
                ((tls) obj3).invoke((tyx0) obj2);
                break;
            case 26:
                tlsVar = ((TextBlockView) obj3).onBlockClickListener;
                tlsVar.invoke((kky0) obj2);
                break;
            case 27:
                ((tls) obj3).invoke(new ac01((q8v0) obj2));
                break;
            case 28:
                ((tls) obj3).invoke((h711) obj2);
                break;
            default:
                ((blm) obj3).invoke((Event) obj2);
                break;
        }
        return zy11Var;
    }
}
