package com.yandex.plus.core.activity.result.internal;

import defpackage.b6e;
import defpackage.dzf;
import defpackage.kyf;
import defpackage.lyf;
import defpackage.uyf;

/* loaded from: classes4.dex */
public final class k implements uyf {
    public final /* synthetic */ m a;

    public k(m mVar) {
        this.a = mVar;
    }

    @Override // defpackage.uyf
    public final void Q(dzf dzfVar, kyf kyfVar) {
        int i = j.a[kyfVar.ordinal()];
        m mVar = this.a;
        switch (i) {
            case 1:
                mVar.k = lyf.c;
                break;
            case 2:
                mVar.k = lyf.d;
                break;
            case 3:
                mVar.k = lyf.e;
                break;
            case 4:
                mVar.k = lyf.d;
                break;
            case 5:
                mVar.k = lyf.c;
                break;
            case 6:
                mVar.k = lyf.a;
                dzfVar.getLifecycle().d(this);
                break;
            case 7:
                break;
            default:
                b6e.s();
                break;
        }
    }
}
