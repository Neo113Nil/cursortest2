package com.yandex.plus.home.feature.webviews.internal.stories;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class l implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ l(p pVar, int i) {
        this.a = i;
        this.b = pVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return p.y(this.b);
            case 1:
                return p.x(this.b);
            case 2:
                return p.A(this.b);
            case 3:
                return p.B(this.b);
            case 4:
                return this.b.u;
            default:
                p pVar = this.b;
                if (pVar.i) {
                    pVar.D();
                }
                return Unit.a;
        }
    }
}
