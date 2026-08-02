package defpackage;

import com.yandex.go.taxi.order.ReorderDialog;

/* loaded from: classes14.dex */
public final /* synthetic */ class rzi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ReorderDialog b;

    public /* synthetic */ rzi0(ReorderDialog reorderDialog, int i) {
        this.a = i;
        this.b = reorderDialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ReorderDialog reorderDialog = this.b;
        switch (i) {
            case 0:
                ReorderDialog.setupHorizontalButtons$lambda$1(reorderDialog);
                break;
            default:
                ReorderDialog.setupVerticalButtons$lambda$1(reorderDialog);
                break;
        }
    }
}
