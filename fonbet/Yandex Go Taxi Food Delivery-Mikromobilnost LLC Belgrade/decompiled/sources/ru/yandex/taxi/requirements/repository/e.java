package ru.yandex.taxi.requirements.repository;

import defpackage.i3y;
import defpackage.lr40;
import defpackage.mdh;
import defpackage.on2;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wnt;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class e {
    public final tt2 a;
    public final wnt b;
    public final i3y c;

    public e(on2 on2Var, tt2 tt2Var, wnt wntVar) {
        this.a = tt2Var;
        this.b = wntVar;
        this.c = kotlin.a.a(new lr40(on2Var, 11));
    }

    public final Object a(String str, Continuation continuation) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new RequirementsServiceRepository$getRequirementDetails$2(str, this, null), continuation);
    }
}
