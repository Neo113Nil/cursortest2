package com.yandex.passport.internal.ui.sloth.screen;

import com.yandex.passport.internal.ui.sloth.j;
import com.yandex.passport.sloth.ui.dependencies.q;
import com.yandex.passport.sloth.ui.e1;
import defpackage.rzm;
import defpackage.toe;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class d implements rzm {
    public final /* synthetic */ int a;
    public final b b;
    public final toe c;

    public /* synthetic */ d(b bVar, toe toeVar, int i) {
        this.a = i;
        this.b = bVar;
        this.c = toeVar;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                Map map = (Map) this.c.a;
                this.b.getClass();
                map.getClass();
                return new j(map);
            default:
                final Function1 function1 = (Function1) this.c.a;
                this.b.getClass();
                function1.getClass();
                return new q() { // from class: com.yandex.passport.internal.ui.sloth.screen.a
                    @Override // com.yandex.passport.sloth.ui.dependencies.q
                    public final void a(e1 e1Var) {
                        Function1.this.invoke(e1Var);
                    }
                };
        }
    }
}
