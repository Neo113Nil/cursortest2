package defpackage;

import com.ybsdk.feature.transactions.impl.ui.screens.list.TransactionsFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class qf01 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ TransactionsFragment b;

    public /* synthetic */ qf01(TransactionsFragment transactionsFragment, int i) {
        this.a = i;
        this.b = transactionsFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        e7n adapter_delegate$lambda$1;
        gsx lastItemScrollListener_delegate$lambda$3;
        zy11 lastItemScrollListener_delegate$lambda$3$lambda$2;
        int i = this.a;
        TransactionsFragment transactionsFragment = this.b;
        switch (i) {
            case 0:
                adapter_delegate$lambda$1 = TransactionsFragment.adapter_delegate$lambda$1(transactionsFragment);
                return adapter_delegate$lambda$1;
            case 1:
                lastItemScrollListener_delegate$lambda$3 = TransactionsFragment.lastItemScrollListener_delegate$lambda$3(transactionsFragment);
                return lastItemScrollListener_delegate$lambda$3;
            default:
                lastItemScrollListener_delegate$lambda$3$lambda$2 = TransactionsFragment.lastItemScrollListener_delegate$lambda$3$lambda$2(transactionsFragment);
                return lastItemScrollListener_delegate$lambda$3$lambda$2;
        }
    }
}
