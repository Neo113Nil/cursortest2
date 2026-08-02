package defpackage;

import android.widget.ImageView;

/* loaded from: classes10.dex */
public final /* synthetic */ class xtn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageView b;

    public /* synthetic */ xtn(ImageView imageView, int i) {
        this.a = i;
        this.b = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ImageView imageView = this.b;
        switch (i) {
            case 0:
                imageView.sendAccessibilityEvent(128);
                break;
            case 1:
                imageView.setAlpha(0.0f);
                break;
            case 2:
                imageView.setAlpha(1.0f);
                break;
            default:
                imageView.setVisibility(0);
                break;
        }
    }
}
