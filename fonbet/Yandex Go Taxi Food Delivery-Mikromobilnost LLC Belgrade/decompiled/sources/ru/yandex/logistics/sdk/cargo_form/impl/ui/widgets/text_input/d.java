package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.text_input;

import defpackage.bvf0;
import defpackage.ike;
import defpackage.l8x;
import defpackage.p6s;
import defpackage.st2;
import defpackage.tje;
import defpackage.zhu0;
import defpackage.zpy0;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class d {
    public final p6s a;
    public final zhu0 b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final ike d;

    public d(st2 st2Var, p6s p6sVar, zhu0 zhu0Var) {
        this.a = p6sVar;
        this.b = zhu0Var;
        this.d = bvf0.a(st2Var.c);
    }

    public final void a(String str, String str2, zpy0 zpy0Var) {
        LinkedHashMap linkedHashMap = this.c;
        l8x l8xVar = (l8x) linkedHashMap.get(str);
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        linkedHashMap.put(str, tje.N(this.d, null, null, new TextInputStopWordsInteractor$checkStopWords$1(zpy0Var, this, str2, null), 3));
    }
}
