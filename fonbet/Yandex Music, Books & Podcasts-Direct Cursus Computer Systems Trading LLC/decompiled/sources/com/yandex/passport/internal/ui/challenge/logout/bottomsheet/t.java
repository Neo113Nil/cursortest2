package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import defpackage.an5;
import defpackage.dzf;
import defpackage.na8;
import defpackage.uyf;

/* loaded from: classes4.dex */
public final class t implements na8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dzf b;
    public final /* synthetic */ uyf c;

    public /* synthetic */ t(dzf dzfVar, uyf uyfVar, int i) {
        this.a = i;
        this.b = dzfVar;
        this.c = uyfVar;
    }

    @Override // defpackage.na8
    public final void a() {
        switch (this.a) {
            case 0:
                this.b.getLifecycle().d((s) this.c);
                break;
            case 1:
                this.b.getLifecycle().d((an5) this.c);
                break;
            default:
                this.b.getLifecycle().d((an5) this.c);
                break;
        }
    }
}
