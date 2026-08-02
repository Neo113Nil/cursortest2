package com.yandex.plus.bdui.content;

import com.yandex.plus.bdui.b0;
import defpackage.btf;
import defpackage.jyr;
import defpackage.lm4;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class c implements b0 {
    public final String a;
    public final Function2 b;
    public final lm4 c;
    public final Function2 d;
    public final jyr e;

    public c(String str, Function2 function2, lm4 lm4Var, Function2 function22, Map map) {
        map.getClass();
        this.a = str;
        this.b = function2;
        this.c = lm4Var;
        this.d = function22;
        this.e = btf.b(new b(0, this, map));
    }

    @Override // com.yandex.plus.bdui.b0
    public final Map getSupportedFeatures() {
        return (Map) this.e.getValue();
    }
}
