package com.yandex.plus.core.featureflags;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;
    public final /* synthetic */ String c;

    public /* synthetic */ d(s sVar, String str, int i) {
        this.a = i;
        this.b = sVar;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new l(this.b, this.c);
            case 1:
                return new o(this.b, this.c);
            case 2:
                return new p(this.b, this.c);
            case 3:
                return new n(this.b, this.c);
            case 4:
                return new m(this.b, this.c);
            case 5:
                return new l(this.b, this.c);
            case 6:
                return new o(this.b, this.c);
            case 7:
                return new p(this.b, this.c);
            case 8:
                return new n(this.b, this.c);
            default:
                return new m(this.b, this.c);
        }
    }
}
