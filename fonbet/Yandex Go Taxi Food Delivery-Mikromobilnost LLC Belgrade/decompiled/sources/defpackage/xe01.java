package defpackage;

import com.ybsdk.feature.transactions.impl.ui.screens.feed.TransactionsFeedFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class xe01 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ TransactionsFeedFragment b;

    public /* synthetic */ xe01(TransactionsFeedFragment transactionsFeedFragment, int i) {
        this.a = i;
        this.b = transactionsFeedFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 lastItemScrollListener_delegate$lambda$4$lambda$3;
        int updateTopPaddings$lambda$17;
        e7n adapter_delegate$lambda$2;
        gsx lastItemScrollListener_delegate$lambda$4;
        zy11 adapter_delegate$lambda$2$lambda$1;
        int i = this.a;
        TransactionsFeedFragment transactionsFeedFragment = this.b;
        switch (i) {
            case 0:
                lastItemScrollListener_delegate$lambda$4$lambda$3 = TransactionsFeedFragment.lastItemScrollListener_delegate$lambda$4$lambda$3(transactionsFeedFragment);
                return lastItemScrollListener_delegate$lambda$4$lambda$3;
            case 1:
                updateTopPaddings$lambda$17 = TransactionsFeedFragment.updateTopPaddings$lambda$17(transactionsFeedFragment);
                return Integer.valueOf(updateTopPaddings$lambda$17);
            case 2:
                adapter_delegate$lambda$2 = TransactionsFeedFragment.adapter_delegate$lambda$2(transactionsFeedFragment);
                return adapter_delegate$lambda$2;
            case 3:
                lastItemScrollListener_delegate$lambda$4 = TransactionsFeedFragment.lastItemScrollListener_delegate$lambda$4(transactionsFeedFragment);
                return lastItemScrollListener_delegate$lambda$4;
            default:
                adapter_delegate$lambda$2$lambda$1 = TransactionsFeedFragment.adapter_delegate$lambda$2$lambda$1(transactionsFeedFragment);
                return adapter_delegate$lambda$2$lambda$1;
        }
    }
}
