package com.knotapi.knot.utilities;

/* loaded from: classes4.dex */
public final /* synthetic */ class LoaderView$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LoaderView f$0;

    public /* synthetic */ LoaderView$$ExternalSyntheticLambda0(LoaderView loaderView, int i) {
        this.$r8$classId = i;
        this.f$0 = loaderView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        LoaderView loaderView = this.f$0;
        switch (i) {
            case 0:
                loaderView.lambda$hide$2();
                break;
            default:
                loaderView.lambda$show$1();
                break;
        }
    }
}
