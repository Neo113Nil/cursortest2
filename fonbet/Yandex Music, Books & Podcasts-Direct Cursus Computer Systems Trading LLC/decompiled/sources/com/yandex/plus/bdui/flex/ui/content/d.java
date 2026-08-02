package com.yandex.plus.bdui.flex.ui.content;

import android.view.ViewGroup;
import com.yandex.plus.bdui.plus.checkout.i;
import com.yandex.plus.divkit.impl.p;
import com.yandex.plus.divkit.impl.r;
import defpackage.ee6;
import defpackage.jso;
import defpackage.pyc;
import defpackage.t5a;
import java.util.LinkedHashSet;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements pyc {
    public final /* synthetic */ int a;

    public /* synthetic */ d() {
        this.a = 2;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                ee6 ee6Var = (ee6) obj;
                com.yandex.plus.bdui.content.a aVar = (com.yandex.plus.bdui.content.a) obj2;
                com.yandex.plus.bdui.shared.b bVar = (com.yandex.plus.bdui.shared.b) obj3;
                ee6Var.getClass();
                aVar.getClass();
                bVar.getClass();
                t5a t5aVar = ee6Var.b;
                return new com.yandex.plus.bdui.content.d(t5aVar != null ? com.yandex.plus.bdui.flex.utils.b.i(t5aVar) : null, aVar, bVar, ee6Var.e);
            case 1:
                jso jsoVar = (jso) obj;
                com.yandex.plus.bdui.plus.scaffold.a aVar2 = (com.yandex.plus.bdui.plus.scaffold.a) obj2;
                com.yandex.plus.bdui.shared.b bVar2 = (com.yandex.plus.bdui.shared.b) obj3;
                jsoVar.getClass();
                aVar2.getClass();
                bVar2.getClass();
                t5a t5aVar2 = jsoVar.b;
                return new com.yandex.plus.bdui.scaffold.b(t5aVar2 != null ? com.yandex.plus.bdui.flex.utils.b.i(t5aVar2) : null, aVar2, bVar2, jsoVar.e);
            default:
                ViewGroup viewGroup = (ViewGroup) obj;
                p pVar = (p) obj3;
                viewGroup.getClass();
                ((r) obj2).getClass();
                pVar.getClass();
                com.yandex.plus.core.insets.d dVar = new com.yandex.plus.core.insets.d(0);
                i iVar = new i(0, pVar);
                com.yandex.plus.core.insets.a aVar3 = new com.yandex.plus.core.insets.a();
                aVar3.b = new LinkedHashSet(2);
                aVar3.d();
                aVar3.c();
                dVar.b.put(iVar, aVar3);
                dVar.b(viewGroup);
                return Unit.a;
        }
    }

    public /* synthetic */ d(com.yandex.plus.bdui.flex.utils.b bVar, int i) {
        this.a = i;
    }
}
