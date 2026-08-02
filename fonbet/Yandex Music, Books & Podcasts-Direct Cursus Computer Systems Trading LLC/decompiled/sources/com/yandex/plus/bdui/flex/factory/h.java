package com.yandex.plus.bdui.flex.factory;

import com.yandex.plus.bdui.s;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ s c;

    public /* synthetic */ h(Function2 function2, s sVar, int i) {
        this.a = i;
        this.b = function2;
        this.c = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.yandex.plus.bdui.m mVar = (com.yandex.plus.bdui.m) obj;
        switch (this.a) {
            case 0:
                mVar.getClass();
                break;
            case 1:
                mVar.getClass();
                break;
            default:
                mVar.getClass();
                break;
        }
        return (com.yandex.plus.bdui.ui.a) this.b.invoke(this.c, mVar);
    }
}
