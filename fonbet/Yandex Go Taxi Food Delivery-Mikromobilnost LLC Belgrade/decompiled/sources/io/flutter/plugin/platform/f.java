package io.flutter.plugin.platform;

/* loaded from: classes4.dex */
public final class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                VirtualDisplayController$2 virtualDisplayController$2 = (VirtualDisplayController$2) obj;
                virtualDisplayController$2.val$embeddedView.postDelayed(virtualDisplayController$2.val$onNewSizeFrameAvailable, 128L);
                break;
            default:
                VirtualDisplayController$OneTimeOnDrawListener virtualDisplayController$OneTimeOnDrawListener = (VirtualDisplayController$OneTimeOnDrawListener) obj;
                virtualDisplayController$OneTimeOnDrawListener.mView.getViewTreeObserver().removeOnDrawListener(virtualDisplayController$OneTimeOnDrawListener);
                break;
        }
    }
}
