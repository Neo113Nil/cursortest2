package com.yandex.plus.bdui.action;

import com.yandex.plus.bdui.b0;
import defpackage.btf;
import defpackage.e5b;
import defpackage.hav;
import defpackage.jyr;
import defpackage.lm4;
import defpackage.pyc;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class b implements b0 {
    public final String a;
    public final Function2 b;
    public final lm4 c;
    public final pyc d;
    public final boolean e;
    public final jyr f;

    public b(String str, Function2 function2, lm4 lm4Var, pyc pycVar, e5b e5bVar, boolean z) {
        e5bVar.getClass();
        this.a = str;
        this.b = function2;
        this.c = lm4Var;
        this.d = pycVar;
        this.e = z;
        this.f = btf.b(new hav(29, this, e5bVar));
    }

    @Override // com.yandex.plus.bdui.b0
    public final Map getSupportedFeatures() {
        return (Map) this.f.getValue();
    }
}
