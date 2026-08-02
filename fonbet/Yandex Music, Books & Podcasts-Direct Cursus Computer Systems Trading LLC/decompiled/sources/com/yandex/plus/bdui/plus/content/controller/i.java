package com.yandex.plus.bdui.plus.content.controller;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class i implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ i(l lVar, int i) {
        this.a = i;
        this.b = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                r rVar = this.b.o;
                if (rVar != null) {
                    return rVar.a;
                }
                return null;
            default:
                return new com.yandex.plus.divkit.impl.m((com.yandex.plus.log.api.b) this.b.c.e);
        }
    }
}
