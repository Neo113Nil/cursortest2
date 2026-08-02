package com.yandex.plus.core.featureflags;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ a(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new f(new a(this.b, 2));
            case 1:
                return new e(new a(this.b, 3));
            case 2:
                return this.b.d;
            default:
                return this.b.e;
        }
    }
}
