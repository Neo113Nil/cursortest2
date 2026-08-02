package defpackage;

import androidx.core.widget.ContentLoadingProgressBar;

/* loaded from: classes10.dex */
public final /* synthetic */ class yge implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContentLoadingProgressBar b;

    public /* synthetic */ yge(ContentLoadingProgressBar contentLoadingProgressBar, int i) {
        this.a = i;
        this.b = contentLoadingProgressBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ContentLoadingProgressBar contentLoadingProgressBar = this.b;
        switch (i) {
            case 0:
                contentLoadingProgressBar.lambda$new$0();
                break;
            case 1:
                contentLoadingProgressBar.lambda$new$1();
                break;
            case 2:
                contentLoadingProgressBar.showOnUiThread();
                break;
            default:
                contentLoadingProgressBar.hideOnUiThread();
                break;
        }
    }
}
