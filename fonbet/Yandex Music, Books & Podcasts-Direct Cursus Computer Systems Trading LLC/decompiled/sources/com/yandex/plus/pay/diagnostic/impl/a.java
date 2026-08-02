package com.yandex.plus.pay.diagnostic.impl;

import defpackage.bck;
import defpackage.x3f;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bck b;

    public /* synthetic */ a(bck bckVar, b bVar) {
        this.a = 1;
        this.b = bckVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new f(this.b, 0);
            case 1:
                return new e(this.b, x3f.d);
            case 2:
                return new d(this.b);
            case 3:
                return new f(this.b, 1);
            default:
                return new c(this.b);
        }
    }

    public /* synthetic */ a(bck bckVar, int i) {
        this.a = i;
        this.b = bckVar;
    }
}
