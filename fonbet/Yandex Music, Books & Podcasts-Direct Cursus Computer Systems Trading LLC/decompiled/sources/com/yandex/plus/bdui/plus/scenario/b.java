package com.yandex.plus.bdui.plus.scenario;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ b(m mVar, int i) {
        this.a = i;
        this.b = mVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                com.yandex.plus.bdui.plus.auth.b bVar = (com.yandex.plus.bdui.plus.auth.b) this.b.m.get();
                if (bVar != null) {
                    long j = bVar.a;
                    Long valueOf = Long.valueOf(j);
                    if (j > 0) {
                        return valueOf;
                    }
                }
                return null;
            case 1:
                com.yandex.plus.bdui.plus.auth.b bVar2 = (com.yandex.plus.bdui.plus.auth.b) this.b.m.get();
                if (bVar2 != null) {
                    return Long.valueOf(bVar2.a);
                }
                return null;
            default:
                return this.b.w;
        }
    }
}
