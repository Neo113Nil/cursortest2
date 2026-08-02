package defpackage;

import com.yandex.go.taxi.order.ReorderDialog;
import com.yandex.go.taxi.order.models.api.objects.ReorderInfo;

/* loaded from: classes14.dex */
public final /* synthetic */ class qzi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ReorderDialog b;
    public final /* synthetic */ ReorderInfo.ReorderOption c;

    public /* synthetic */ qzi0(ReorderDialog reorderDialog, ReorderInfo.ReorderOption reorderOption, int i) {
        this.a = i;
        this.b = reorderDialog;
        this.c = reorderOption;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ReorderInfo.ReorderOption reorderOption = this.c;
        ReorderDialog reorderDialog = this.b;
        switch (i) {
            case 0:
                ReorderDialog.setupHorizontalButtons$lambda$0(reorderDialog, reorderOption);
                break;
            default:
                ReorderDialog.setupVerticalButtons$lambda$0(reorderDialog, reorderOption);
                break;
        }
    }
}
