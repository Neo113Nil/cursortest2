package defpackage;

import com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardPickupCodeView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.progress_bar.RideCardProgressBarItemView;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.a;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.q;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.s;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.t;

/* loaded from: classes14.dex */
public final /* synthetic */ class xik0 implements wls {
    public final /* synthetic */ int a;

    public /* synthetic */ xik0(int i) {
        this.a = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        boolean l;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                l = jl40.l(((wik0) obj).c.b, ((wik0) obj2).c.b);
                break;
            case 1:
                ((a) obj).R.renderBody(((wik0) obj2).c.b);
                return zy11Var;
            case 2:
                l = jl40.l(((wik0) obj).c.c, ((wik0) obj2).c.c);
                break;
            case 3:
                wik0 wik0Var = (wik0) obj2;
                ((a) obj).R.a(wik0Var.c.c, wik0Var.f);
                return zy11Var;
            case 4:
                l = jl40.l(((klk0) obj).e, ((klk0) obj2).e);
                break;
            case 5:
                klk0 klk0Var = (klk0) obj2;
                ((q) obj).R.a(klk0Var.e, klk0Var.i);
                return zy11Var;
            case 6:
                l = jl40.l(((klk0) obj).f, ((klk0) obj2).f);
                break;
            case 7:
                klk0 klk0Var2 = (klk0) obj2;
                ((q) obj).R.setAction(klk0Var2.f, klk0Var2.i);
                return zy11Var;
            case 8:
                return Boolean.valueOf(((klk0) obj).g != ((klk0) obj2).g);
            case 9:
                ((q) obj).R.renderLoading(((klk0) obj2).g);
                return zy11Var;
            case 10:
                l = jl40.l(((klk0) obj).h, ((klk0) obj2).h);
                break;
            case 11:
                ((q) obj).R.setColor(((klk0) obj2).h);
                return zy11Var;
            case 12:
                l = ((klk0) obj).c.equals(((klk0) obj2).c);
                break;
            case 13:
                jlk0 jlk0Var = ((klk0) obj2).c;
                int i2 = q.U;
                ((q) obj).d0(jlk0Var);
                return zy11Var;
            case 14:
                l = jl40.l(((klk0) obj).d, ((klk0) obj2).d);
                break;
            case 15:
                ((q) obj).R.renderBody(((klk0) obj2).d);
                return zy11Var;
            case 16:
                l = jl40.l(((tlk0) obj).e, ((tlk0) obj2).e);
                break;
            case 17:
                CharSequence charSequence = ((tlk0) obj2).e;
                int i3 = s.U;
                ((s) obj).R.renderText(charSequence);
                return zy11Var;
            case 18:
                l = jl40.l(((tlk0) obj).f, ((tlk0) obj2).f);
                break;
            case 19:
                CharSequence charSequence2 = ((tlk0) obj2).f;
                int i4 = s.U;
                ((s) obj).R.renderCode(charSequence2);
                return zy11Var;
            case 20:
                l = jl40.l(((tlk0) obj).d, ((tlk0) obj2).d);
                break;
            case 21:
                String str = ((tlk0) obj2).d;
                int i5 = s.U;
                ((s) obj).R.setContentDescription(str);
                return zy11Var;
            case 22:
                l = jl40.l(((tlk0) obj).c, ((tlk0) obj2).c);
                break;
            case 23:
                s sVar = (s) obj;
                tlk0 tlk0Var = (tlk0) obj2;
                nqs0 nqs0Var = tlk0Var.c;
                akk0 akk0Var = tlk0Var.h;
                int i6 = s.U;
                ibk0 a = ijk0.a(nqs0Var);
                RideCardPickupCodeView rideCardPickupCodeView = sVar.R;
                if (a != null) {
                    rideCardPickupCodeView.setClickListener(new kqe0(15, sVar, nqs0Var, akk0Var));
                } else {
                    rideCardPickupCodeView.setClickListener(null);
                }
                return zy11Var;
            case 24:
                l = jl40.l(((amk0) obj).c.d, ((amk0) obj2).c.d);
                break;
            case 25:
                t tVar = (t) obj;
                amk0 amk0Var = (amk0) obj2;
                tVar.R.getSlotItem().setAction(amk0Var.c.d, new bmk0(tVar, amk0Var.e, 1));
                return zy11Var;
            case 26:
                l = jl40.l(((amk0) obj).d, ((amk0) obj2).d);
                break;
            case 27:
                zlk0 zlk0Var = ((amk0) obj2).d;
                RideCardProgressBarItemView rideCardProgressBarItemView = ((t) obj).R;
                if (zlk0Var != null) {
                    rideCardProgressBarItemView.setProgressBar(zlk0Var);
                }
                return zy11Var;
            case 28:
                l = jl40.l(((amk0) obj).c.a, ((amk0) obj2).c.a);
                break;
            default:
                ((t) obj).R.getSlotItem().renderLead(((amk0) obj2).c.a);
                return zy11Var;
        }
        return Boolean.valueOf(!l);
    }
}
