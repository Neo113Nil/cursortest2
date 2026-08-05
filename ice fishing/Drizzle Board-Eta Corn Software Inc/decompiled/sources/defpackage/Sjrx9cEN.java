package defpackage;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class Sjrx9cEN implements Runnable {
    public final /* synthetic */ ActionBarOverlayLayout MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ Sjrx9cEN(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.NCTxEWno = i;
        this.MdtA4re8 = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.NCTxEWno;
        ActionBarOverlayLayout actionBarOverlayLayout = this.MdtA4re8;
        switch (i) {
            case 0:
                actionBarOverlayLayout.Qr9iLBAD();
                actionBarOverlayLayout.gjV1z5T1 = actionBarOverlayLayout.VgvYg0wo.animate().translationY(0.0f).setListener(actionBarOverlayLayout.WYNAV5pd);
                break;
            default:
                actionBarOverlayLayout.Qr9iLBAD();
                actionBarOverlayLayout.gjV1z5T1 = actionBarOverlayLayout.VgvYg0wo.animate().translationY(-actionBarOverlayLayout.VgvYg0wo.getHeight()).setListener(actionBarOverlayLayout.WYNAV5pd);
                break;
        }
    }
}
