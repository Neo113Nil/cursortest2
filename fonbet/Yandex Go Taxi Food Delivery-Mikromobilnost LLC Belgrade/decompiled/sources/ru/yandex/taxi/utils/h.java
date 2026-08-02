package ru.yandex.taxi.utils;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import defpackage.lr31;
import defpackage.nf5;
import defpackage.st0;
import defpackage.tls;
import defpackage.wls;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes6.dex */
public final class h {
    public final ViewGroup a;
    public final wls b;
    public final tls c;
    public final wls d;
    public final tls e;
    public final ArrayList f = new ArrayList();
    public final st0 g = new st0(new ViewGroupListDelegate$optionHelper$1(2, this, h.class, "offsetItemsOnInsert", "offsetItemsOnInsert(II)V", 0), new ViewGroupListDelegate$optionHelper$2(2, this, h.class, "offsetItemsOnRemove", "offsetItemsOnRemove(II)V", 0), new ViewGroupListDelegate$optionHelper$3(2, this, h.class, "offsetItemsOnMove", "offsetItemsOnMove(II)V", 0), new ViewGroupListDelegate$optionHelper$4(3, this, h.class, "itemChanged", "itemChanged(IILjava/lang/Object;)V", 0), new ViewGroupListDelegate$optionHelper$5(2, this, h.class, "itemMoved", "itemMoved(II)V", 0), new ViewGroupListDelegate$optionHelper$6(2, this, h.class, "itemRemoved", "itemRemoved(II)V", 0), new ViewGroupListDelegate$optionHelper$7(2, this, h.class, "itemInserted", "itemInserted(II)V", 0));
    public List h = EmptyList.a;

    public h(ViewGroup viewGroup, wls wlsVar, tls tlsVar, wls wlsVar2, tls tlsVar2) {
        this.a = viewGroup;
        this.b = wlsVar;
        this.c = tlsVar;
        this.d = wlsVar2;
        this.e = tlsVar2;
    }

    public final void a() {
        b(0, this.h.size());
        i iVar = (i) this.b.invoke(EmptyList.a, this.h);
        st0 st0Var = this.g;
        iVar.a((nf5) st0Var.A);
        st0Var.a();
    }

    public final void b(int i, int i2) {
        while (true) {
            i2--;
            if (-1 >= i2) {
                return;
            }
            int i3 = i + i2;
            ArrayList arrayList = this.f;
            lr31 lr31Var = (lr31) kotlin.collections.a.S(i3, arrayList);
            if (lr31Var == null) {
                return;
            }
            View view = lr31Var.a;
            arrayList.remove(i3);
            this.a.removeView(view);
            this.e.invoke(view);
        }
    }

    public final void c(List list) {
        List list2 = this.h;
        this.h = list;
        i iVar = (i) this.b.invoke(list2, list);
        st0 st0Var = this.g;
        iVar.a((nf5) st0Var.A);
        st0Var.a();
    }
}
