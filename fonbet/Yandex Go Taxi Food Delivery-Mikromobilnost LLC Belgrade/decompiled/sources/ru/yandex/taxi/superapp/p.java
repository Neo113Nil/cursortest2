package ru.yandex.taxi.superapp;

import defpackage.fw4;
import defpackage.g7w0;
import defpackage.jqr;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import java.io.File;

/* loaded from: classes6.dex */
public final class p {
    public final fw4 a;
    public final File b;
    public final g7w0 c = new g7w0(2097152, 0);

    public p(tse tseVar, tt2 tt2Var, ru.yandex.taxi.h hVar, ru.yandex.taxi.am.m mVar, fw4 fw4Var) {
        this.a = fw4Var;
        this.b = new File(hVar.a.getFilesDir(), "ru.yandex.taxi.superapp.storage");
        jqr jqrVar = new jqr(new o(mVar.f), new SuperAppStorage$2(this, null), 3);
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        com.yandex.go.coroutines.b.h(tseVar, kotlinx.coroutines.flow.e.F(jqrVar, mdh.b));
    }
}
