package com.yandex.plus.core.network.api;

import defpackage.foj;
import defpackage.gs3;
import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public final class a implements gs3 {
    public final /* synthetic */ int a;
    public final Type b;

    public /* synthetic */ a(int i, Type type) {
        this.a = i;
        this.b = type;
    }

    @Override // defpackage.gs3
    public final Type s() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                Type type = this.b;
                type.getClass();
                return type;
        }
    }

    @Override // defpackage.gs3
    public final Object z(foj fojVar) {
        switch (this.a) {
            case 0:
                return new c(fojVar, 0);
            default:
                return new c(fojVar, 1);
        }
    }
}
