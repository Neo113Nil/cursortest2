package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class kw1 {
    public static int ZpBGe2uQfcn8(int i) {
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
                }
                i2 |= statusBars;
            }
        }
        return i2;
    }
}
