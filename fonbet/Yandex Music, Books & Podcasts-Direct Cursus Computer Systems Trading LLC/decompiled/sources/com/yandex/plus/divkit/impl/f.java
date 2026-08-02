package com.yandex.plus.divkit.impl;

import defpackage.ffg;
import defpackage.rar;

/* loaded from: classes4.dex */
public final /* synthetic */ class f implements ffg {
    public final /* synthetic */ int a;
    public final /* synthetic */ rar b;

    public /* synthetic */ f(rar rarVar, int i) {
        this.a = i;
        this.b = rarVar;
    }

    @Override // defpackage.ffg
    public final void cancel() {
        switch (this.a) {
            case 0:
                this.b.g(null);
                break;
            default:
                this.b.g(null);
                break;
        }
    }
}
