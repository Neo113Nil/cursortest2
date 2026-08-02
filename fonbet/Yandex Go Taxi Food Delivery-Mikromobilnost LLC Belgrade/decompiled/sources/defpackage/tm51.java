package defpackage;

import com.yandex.go.payments_widgets.split.actions.dto.YbSplitOpenTypedURLAction;

/* loaded from: classes8.dex */
public final class tm51 implements dw {
    public final h3y a;

    public tm51(h3y h3yVar) {
        this.a = h3yVar;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        int i = sm51.a[((YbSplitOpenTypedURLAction) krVar).a.ordinal()];
        h3y h3yVar = this.a;
        if (i == 1) {
            ((mla0) h3yVar.get()).d();
            return;
        }
        if (i == 2) {
            ((mla0) h3yVar.get()).b();
            return;
        }
        if (i == 3) {
            ((mla0) h3yVar.get()).c();
        } else if (i == 4) {
            ((mla0) h3yVar.get()).a();
        } else {
            w511.b();
        }
    }
}
