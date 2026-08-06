package defpackage;

/* loaded from: classes.dex */
public abstract class qo1 {
    public static int IHQe1A4L2xu(int i) {
        int statusBars;
        int i2 = 0;
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i & i3) != 0) {
                if (i3 == 1) {
                    statusBars = android.view.WindowInsets.Type.statusBars();
                } else if (i3 == 2) {
                    statusBars = android.view.WindowInsets.Type.navigationBars();
                } else if (i3 == 4) {
                    statusBars = android.view.WindowInsets.Type.captionBar();
                } else if (i3 == 8) {
                    statusBars = android.view.WindowInsets.Type.ime();
                } else if (i3 == 16) {
                    statusBars = android.view.WindowInsets.Type.systemGestures();
                } else if (i3 == 32) {
                    statusBars = android.view.WindowInsets.Type.mandatorySystemGestures();
                } else if (i3 == 64) {
                    statusBars = android.view.WindowInsets.Type.tappableElement();
                } else if (i3 == 128) {
                    statusBars = android.view.WindowInsets.Type.displayCutout();
                } else if (i3 == 512) {
                    statusBars = android.view.WindowInsets.Type.systemOverlays();
                }
                i2 |= statusBars;
            }
        }
        return i2;
    }
}
