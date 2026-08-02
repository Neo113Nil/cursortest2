package com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.plus.pay.ui.common.api.ui.view.ProgressView;
import defpackage.b6e;
import defpackage.ezc;
import defpackage.k32;
import defpackage.k8g;
import defpackage.n8g;
import defpackage.opn;
import defpackage.s9f;
import defpackage.syc;
import defpackage.t75;
import defpackage.v75;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class n extends k8g {
    public final /* synthetic */ int e = 1;
    public final com.yandex.plus.ui.core.theme.a f;
    public final com.yandex.plus.core.imageloader.b g;
    public final Function1 h;
    public final syc i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(com.yandex.plus.ui.core.theme.a aVar, com.yandex.plus.core.imageloader.b bVar, Function1 function1, Function1 function12) {
        super(k.r);
        aVar.getClass();
        bVar.getClass();
        this.f = aVar;
        this.g = bVar;
        this.i = (ezc) function1;
        this.h = function12;
    }

    @Override // defpackage.qon
    public int f(int i) {
        switch (this.e) {
            case 1:
                com.yandex.plus.pay.ui.core.mobile.view.payment.methods.adapter.d dVar = (com.yandex.plus.pay.ui.core.mobile.view.payment.methods.adapter.d) u(i);
                if (dVar instanceof com.yandex.plus.pay.ui.core.mobile.view.payment.methods.adapter.c) {
                    return R.layout.pay_sdk_item_plus_points;
                }
                if (dVar instanceof com.yandex.plus.pay.ui.core.mobile.view.payment.methods.adapter.b) {
                    return R.layout.pay_sdk_item_payment_method;
                }
                b6e.s();
                return 0;
            default:
                return super.f(i);
        }
    }

    @Override // defpackage.qon
    public final void j(opn opnVar, int i) {
        switch (this.e) {
            case 0:
                Object u = u(i);
                u.getClass();
                e eVar = (e) u;
                com.yandex.plus.pay.ui.core.mobile.view.payment.methods.d dVar = ((m) opnVar).u;
                String str = eVar.a;
                dVar.getClass();
                str.getClass();
                com.yandex.plus.bdui.plus.content.controller.f fVar = dVar.b;
                s9f[] s9fVarArr = com.yandex.plus.pay.ui.core.mobile.view.payment.methods.d.g;
                ((TextView) fVar.g(s9fVarArr[1])).setText(str);
                List list = eVar.b;
                list.getClass();
                ((ProgressView) dVar.a.g(s9fVarArr[0])).setVisibility(8);
                ((RecyclerView) dVar.c.g(s9fVarArr[2])).setVisibility(0);
                n nVar = dVar.e;
                n8g b = t75.b();
                List list2 = list;
                ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new com.yandex.plus.pay.ui.core.mobile.view.payment.methods.adapter.b((com.yandex.plus.pay.ui.core.mobile.view.payment.methods.c) it.next()));
                }
                b.addAll(arrayList);
                nVar.v(t75.a(b));
                List list3 = eVar.c;
                list3.getClass();
                ((RecyclerView) dVar.d.g(com.yandex.plus.pay.ui.core.mobile.view.payment.methods.d.g[3])).setVisibility(0);
                dVar.f.v(list3);
                break;
            default:
                com.yandex.plus.pay.ui.core.mobile.view.payment.methods.adapter.f fVar2 = (com.yandex.plus.pay.ui.core.mobile.view.payment.methods.adapter.f) opnVar;
                Object u2 = u(fVar2.c());
                u2.getClass();
                fVar2.t((com.yandex.plus.pay.ui.core.mobile.view.payment.methods.adapter.d) u2, i != c() - 1);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [ezc, kotlin.jvm.functions.Function1] */
    @Override // defpackage.qon
    public final opn m(ViewGroup viewGroup, int i) {
        int i2 = this.e;
        syc sycVar = this.i;
        switch (i2) {
            case 0:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pay_sdk_item_payment_methods_group, viewGroup, false);
                inflate.getClass();
                Function1 function1 = this.h;
                return new m(inflate, this.f, this.g, (ezc) sycVar, function1);
            default:
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
                if (i == R.layout.pay_sdk_item_plus_points) {
                    inflate2.getClass();
                    return new com.yandex.plus.pay.ui.core.mobile.view.payment.methods.adapter.g(inflate2, this.h);
                }
                if (i != R.layout.pay_sdk_item_payment_method) {
                    xq0.k(i, "Unexpected view type: ");
                    return null;
                }
                inflate2.getClass();
                return new com.yandex.plus.pay.ui.core.mobile.view.payment.methods.adapter.a(inflate2, this.f, this.g, (k32) sycVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.yandex.plus.ui.core.theme.a aVar, com.yandex.plus.core.imageloader.b bVar, k32 k32Var, Function1 function1) {
        super(com.yandex.plus.pay.ui.core.mobile.view.payment.methods.adapter.e.p);
        aVar.getClass();
        bVar.getClass();
        this.f = aVar;
        this.g = bVar;
        this.i = k32Var;
        this.h = function1;
    }
}
