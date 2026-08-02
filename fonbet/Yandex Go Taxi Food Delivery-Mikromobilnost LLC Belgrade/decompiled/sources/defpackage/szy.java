package defpackage;

import com.google.android.material.loadingindicator.LoadingIndicator;

/* loaded from: classes11.dex */
public final class szy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LoadingIndicator b;

    public /* synthetic */ szy(LoadingIndicator loadingIndicator, int i) {
        this.a = i;
        this.b = loadingIndicator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        LoadingIndicator loadingIndicator = this.b;
        switch (i) {
            case 0:
                loadingIndicator.internalShow();
                break;
            default:
                loadingIndicator.internalHide();
                loadingIndicator.lastShowStartTime = -1L;
                break;
        }
    }
}
