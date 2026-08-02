package com.yandex.plus.bdui.flex.factory;

import com.yandex.plus.bdui.s;
import defpackage.c76;
import defpackage.t9f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ s c;
    public final /* synthetic */ c76 d;

    public /* synthetic */ b(Function2 function2, s sVar, c76 c76Var, int i) {
        this.a = i;
        this.b = function2;
        this.c = sVar;
        this.d = c76Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new com.yandex.passport.data.network.a(new b(this.b, this.c, this.d, 1));
            case 1:
                return (t9f) this.b.invoke(this.c, this.d);
            case 2:
                return new com.yandex.plus.bdui.flex.content.b(new b(this.b, this.c, this.d, 3));
            default:
                return (t9f) this.b.invoke(this.c, this.d);
        }
    }
}
