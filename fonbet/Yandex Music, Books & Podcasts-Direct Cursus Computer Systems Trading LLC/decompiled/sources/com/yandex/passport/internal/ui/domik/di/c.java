package com.yandex.passport.internal.ui.domik.di;

import com.yandex.passport.internal.properties.l;
import defpackage.a4g;
import defpackage.rzm;

/* loaded from: classes4.dex */
public final class c implements rzm {
    public final /* synthetic */ int a;
    public final b b;

    public /* synthetic */ c(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return this.b.b;
            default:
                l lVar = this.b.a;
                a4g.t(lVar);
                return lVar;
        }
    }
}
