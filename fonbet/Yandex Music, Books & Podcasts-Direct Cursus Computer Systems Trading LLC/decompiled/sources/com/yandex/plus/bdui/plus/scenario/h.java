package com.yandex.plus.bdui.plus.scenario;

import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;
    public final /* synthetic */ e c;

    public /* synthetic */ h(m mVar, e eVar, int i) {
        this.a = i;
        this.b = mVar;
        this.c = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.yandex.plus.bdui.query.e eVar = (com.yandex.plus.bdui.query.e) obj;
        switch (this.a) {
            case 0:
                eVar.getClass();
                return this.b.a(((Boolean) this.c.invoke()).booleanValue());
            default:
                eVar.getClass();
                return this.b.a(((Boolean) this.c.invoke()).booleanValue());
        }
    }
}
