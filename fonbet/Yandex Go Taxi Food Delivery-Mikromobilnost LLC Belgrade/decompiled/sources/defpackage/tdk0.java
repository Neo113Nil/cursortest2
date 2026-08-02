package defpackage;

import com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.comment.RideCardCommentItemView;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.a;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.f;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.g;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final /* synthetic */ class tdk0 implements wls {
    public final /* synthetic */ int a;

    public /* synthetic */ tdk0(int i) {
        this.a = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        boolean l;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                l = jl40.l(((pdk0) obj).g, ((pdk0) obj2).g);
                break;
            case 1:
                w8i0 w8i0Var = ((pdk0) obj2).g;
                int i2 = f.V;
                ((f) obj).R.updateItemsDecoration(w8i0Var);
                return zy11Var;
            case 2:
                l = jl40.l(((pdk0) obj).f, ((pdk0) obj2).f);
                break;
            case 3:
                UiStateDrawableWrapper uiStateDrawableWrapper = ((pdk0) obj2).f;
                int i3 = f.V;
                ((f) obj).R.updateBackgroundOnSelect(uiStateDrawableWrapper);
                return zy11Var;
            case 4:
                return Boolean.valueOf(((pdk0) obj).e != ((pdk0) obj2).e);
            case 5:
                int i4 = ((pdk0) obj2).e;
                int i5 = f.V;
                ((f) obj).R.setRating(i4);
                return zy11Var;
            case 6:
                l = jl40.l(((pdk0) obj).c, ((pdk0) obj2).c);
                break;
            case 7:
                f fVar = (f) obj;
                CharSequence charSequence = ((pdk0) obj2).c;
                int i6 = f.V;
                fVar.R.setTitle(charSequence);
                fVar.R.updateHeader();
                return zy11Var;
            case 8:
                l = jl40.l(((pdk0) obj).d, ((pdk0) obj2).d);
                break;
            case 9:
                f fVar2 = (f) obj;
                CharSequence charSequence2 = ((pdk0) obj2).d;
                int i7 = f.V;
                fVar2.R.setSubtitle(charSequence2);
                fVar2.R.updateHeader();
                return zy11Var;
            case 10:
                l = jl40.l(((xdk0) obj).g, ((xdk0) obj2).g);
                break;
            case 11:
                g gVar = (g) obj;
                xdk0 xdk0Var = (xdk0) obj2;
                nqs0 nqs0Var = xdk0Var.g;
                akk0 akk0Var = xdk0Var.h;
                int i8 = g.U;
                RideCardCommentItemView rideCardCommentItemView = gVar.R;
                if (ijk0.a(nqs0Var) != null) {
                    rideCardCommentItemView.setClickListener(new kqe0(12, gVar, nqs0Var, akk0Var));
                } else {
                    rideCardCommentItemView.setClickListener(null);
                }
                return zy11Var;
            case 12:
                l = ((xdk0) obj).f.equals(((xdk0) obj2).f);
                break;
            case 13:
                kdc kdcVar = ((xdk0) obj2).f;
                int i9 = g.U;
                ((g) obj).R.renderBackground(kdcVar);
                return zy11Var;
            case 14:
                l = jl40.l(((xdk0) obj).c, ((xdk0) obj2).c);
                break;
            case 15:
                String str = ((xdk0) obj2).c;
                int i10 = g.U;
                ((g) obj).R.renderTitle(str);
                return zy11Var;
            case 16:
                l = jl40.l(((xdk0) obj).d, ((xdk0) obj2).d);
                break;
            case 17:
                String str2 = ((xdk0) obj2).d;
                int i11 = g.U;
                ((g) obj).R.renderHint(str2);
                return zy11Var;
            case 18:
                l = jl40.l(((xdk0) obj).e, ((xdk0) obj2).e);
                break;
            case 19:
                String str3 = ((xdk0) obj2).e;
                int i12 = g.U;
                ((g) obj).R.renderCommentText(str3);
                return zy11Var;
            case 20:
                l = jl40.l(((wik0) obj).c.a, ((wik0) obj2).c.a);
                break;
            case 21:
                l = jl40.l(((wik0) obj).c.d, ((wik0) obj2).c.d);
                break;
            case 22:
                wik0 wik0Var = (wik0) obj2;
                ((a) obj).R.setAction(wik0Var.c.d, wik0Var.f);
                return zy11Var;
            case 23:
                return Boolean.valueOf(((wik0) obj).c.e != ((wik0) obj2).c.e);
            case 24:
                ((a) obj).R.setSize(((wik0) obj2).c.e);
                return zy11Var;
            case 25:
                return Boolean.valueOf(((wik0) obj).e != ((wik0) obj2).e);
            case 26:
                ((a) obj).R.renderLoading(((wik0) obj2).e);
                return zy11Var;
            case 27:
                l = jl40.l(((wik0) obj).d, ((wik0) obj2).d);
                break;
            case 28:
                ((a) obj).R.setColor(((wik0) obj2).d);
                return zy11Var;
            default:
                ((a) obj).R.renderLead(((wik0) obj2).c.a);
                return zy11Var;
        }
        return Boolean.valueOf(!l);
    }
}
