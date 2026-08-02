package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.core.data.common.y;
import com.yandex.plus.core.imageloader.b;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.product.ProductView;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.product.d;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.product.e;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.item.c;
import com.yandex.plus.ui.core.theme.a;
import java.util.HashSet;
import java.util.List;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class nkf extends k8g {
    public final /* synthetic */ int e = 3;
    public final Object f;
    public final Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nkf(a aVar, b bVar) {
        super(c.p);
        aVar.getClass();
        bVar.getClass();
        this.f = aVar;
        this.g = bVar;
    }

    @Override // defpackage.qon
    public final void j(opn opnVar, int i) {
        switch (this.e) {
            case 0:
                w((pkf) opnVar, i);
                break;
            case 1:
                x((vkf) opnVar, i);
                break;
            case 2:
                Object u = u(i);
                u.getClass();
                d dVar = ((e) opnVar).u;
                dVar.c((com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.product.c) u);
                dVar.a.setVisibility(0);
                break;
            default:
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.item.b bVar = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.item.b) opnVar;
                Object u2 = u(i);
                u2.getClass();
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.item.a aVar = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.item.a) u2;
                f fVar = bVar.u;
                s9f[] s9fVarArr = com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.item.b.z;
                ((TextView) fVar.g(s9fVarArr[0])).setText(aVar.a);
                nkf nkfVar = bVar.y;
                a aVar2 = (a) nkfVar.f;
                Context context = bVar.a.getContext();
                context.getClass();
                y yVar = aVar.b;
                ((com.yandex.plus.coil.b) ((b) nkfVar.g)).b(u.r(context, aVar2) ? yVar.b : yVar.a).i((ImageView) bVar.v.g(s9fVarArr[1]));
                ((TextView) bVar.w.g(s9fVarArr[2])).setText(aVar.c);
                r1.F((TextView) bVar.x.g(s9fVarArr[3]), aVar.d);
                break;
        }
    }

    @Override // defpackage.qon
    public void k(opn opnVar, int i, List list) {
        switch (this.e) {
            case 0:
                pkf pkfVar = (pkf) opnVar;
                list.getClass();
                if (!list.isEmpty()) {
                    boolean z = ((nfn) u(i)).b;
                    mmo mmoVar = (mmo) this.f;
                    mmoVar.getClass();
                    okf okfVar = pkfVar.v;
                    okfVar.setBorderActivated(z);
                    HashSet hashSet = (HashSet) mmoVar.b;
                    if (!z) {
                        hashSet.remove(okfVar);
                        break;
                    } else {
                        hashSet.add(okfVar);
                        break;
                    }
                } else {
                    w(pkfVar, i);
                    break;
                }
            case 1:
                vkf vkfVar = (vkf) opnVar;
                list.getClass();
                if (!list.isEmpty()) {
                    boolean z2 = ((ufn) u(i)).b;
                    mmo mmoVar2 = (mmo) this.f;
                    mmoVar2.getClass();
                    ukf ukfVar = vkfVar.v;
                    ukfVar.setBorderActivated(z2);
                    HashSet hashSet2 = (HashSet) mmoVar2.b;
                    if (!z2) {
                        hashSet2.remove(ukfVar);
                        break;
                    } else {
                        hashSet2.add(ukfVar);
                        break;
                    }
                } else {
                    x(vkfVar, i);
                    break;
                }
            default:
                super.k(opnVar, i, list);
                break;
        }
    }

    @Override // defpackage.qon
    public final opn m(ViewGroup viewGroup, int i) {
        int i2 = this.e;
        Object obj = this.g;
        switch (i2) {
            case 0:
                Context context = viewGroup.getContext();
                context.getClass();
                return new pkf(context, (qec) obj);
            case 1:
                Context context2 = viewGroup.getContext();
                context2.getClass();
                return new vkf(context2, (cib) obj);
            case 2:
                Context context3 = viewGroup.getContext();
                context3.getClass();
                ProductView productView = new ProductView(context3, null, 0, 6, null);
                productView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return new e(this, productView);
            default:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pay_sdk_item_closing_offer, viewGroup, false);
                inflate.getClass();
                return new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.item.b(this, inflate);
        }
    }

    public void w(pkf pkfVar, int i) {
        nfn nfnVar = (nfn) u(i);
        nfnVar.getClass();
        mmo mmoVar = (mmo) this.f;
        mmoVar.getClass();
        cgr cgrVar = nfnVar.a;
        okf okfVar = pkfVar.v;
        okfVar.setName(cgrVar.b);
        jcv jcvVar = cgrVar.d;
        okfVar.setSpecialImage(jcvVar != null ? jcvVar.getPathForSize(wct.s()) : null);
        okfVar.setNotificationDot(cgrVar.f);
        okfVar.setOnTouchListener(new m2e(1, pkfVar, cgrVar));
        okfVar.setPosition(pkfVar.b());
        boolean z = nfnVar.b;
        okfVar.setBorderActivated(z);
        HashSet hashSet = (HashSet) mmoVar.b;
        if (z) {
            hashSet.add(okfVar);
        } else {
            hashSet.remove(okfVar);
        }
    }

    public void x(vkf vkfVar, int i) {
        ufn ufnVar = (ufn) u(i);
        ufnVar.getClass();
        mmo mmoVar = (mmo) this.f;
        mmoVar.getClass();
        xgn xgnVar = ufnVar.a;
        ukf ukfVar = vkfVar.v;
        ukfVar.setName(xgnVar.a);
        ukfVar.setOnTouchListener(new m2e(2, vkfVar, xgnVar));
        ukfVar.setPosition(vkfVar.b());
        boolean z = ufnVar.b;
        ukfVar.setBorderActivated(z);
        HashSet hashSet = (HashSet) mmoVar.b;
        if (z) {
            hashSet.add(ukfVar);
        } else {
            hashSet.remove(ukfVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nkf(fkn fknVar, b bVar) {
        super(com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.product.a.r);
        bVar.getClass();
        this.f = fknVar;
        this.g = bVar;
    }

    public nkf(mmo mmoVar, cib cibVar) {
        super(new l8f(3));
        this.f = mmoVar;
        this.g = cibVar;
    }

    public nkf(mmo mmoVar, qec qecVar) {
        super(new l8f(2));
        this.f = mmoVar;
        this.g = qecVar;
    }
}
