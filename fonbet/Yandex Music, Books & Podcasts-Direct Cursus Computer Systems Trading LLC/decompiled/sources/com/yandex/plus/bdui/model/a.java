package com.yandex.plus.bdui.model;

import com.yandex.plus.bdui.b0;
import com.yandex.plus.bdui.content.b;
import defpackage.btf;
import defpackage.e5b;
import defpackage.jyr;
import defpackage.lm4;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class a implements b0 {
    public final String a;
    public final Function2 b;
    public final lm4 c;
    public final jyr d;

    public a(String str, Function2 function2, lm4 lm4Var, e5b e5bVar) {
        e5bVar.getClass();
        this.a = str;
        this.b = function2;
        this.c = lm4Var;
        this.d = btf.b(new b(2, this, e5bVar));
    }

    @Override // com.yandex.plus.bdui.b0
    public final Map getSupportedFeatures() {
        return (Map) this.d.getValue();
    }
}
