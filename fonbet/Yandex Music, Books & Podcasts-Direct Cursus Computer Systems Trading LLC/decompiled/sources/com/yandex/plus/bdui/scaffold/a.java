package com.yandex.plus.bdui.scaffold;

import com.yandex.passport.internal.ui.bouncer.p;
import com.yandex.plus.bdui.b0;
import com.yandex.plus.bdui.flex.ui.content.f;
import com.yandex.plus.bdui.plus.c;
import defpackage.btf;
import defpackage.e5b;
import defpackage.jyr;
import defpackage.lm4;
import java.util.Map;

/* loaded from: classes4.dex */
public final class a implements b0 {
    public final p a;
    public final lm4 b;
    public final c c;
    public final jyr d;

    public a(p pVar, lm4 lm4Var, c cVar, e5b e5bVar) {
        e5bVar.getClass();
        this.a = pVar;
        this.b = lm4Var;
        this.c = cVar;
        this.d = btf.b(new f(this, e5bVar));
    }

    @Override // com.yandex.plus.bdui.b0
    public final Map getSupportedFeatures() {
        return (Map) this.d.getValue();
    }
}
