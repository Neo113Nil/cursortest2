package com.yandex.plus.home.feature.webviews.internal.smart;

import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.yandex.plus.bdui.plus.content.controller.f b;

    public /* synthetic */ a(com.yandex.plus.bdui.plus.content.controller.f fVar, int i) {
        this.a = i;
        this.b = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return this.b.c();
            default:
                com.yandex.plus.bdui.plus.content.controller.f fVar = this.b;
                if (fVar != null) {
                    return fVar.c();
                }
                return null;
        }
    }
}
