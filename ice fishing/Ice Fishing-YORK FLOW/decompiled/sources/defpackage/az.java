package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class az {
    public static final int[] ZpBGe2uQfcn8 = new int[2];
    public static final android.graphics.Rect giKS3J6vZuNy = new android.graphics.Rect();

    public static final defpackage.s31 ZpBGe2uQfcn8(android.view.View view, defpackage.u uVar) {
        int[] iArr = ZpBGe2uQfcn8;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        uVar.getLocationInWindow(iArr);
        int i3 = iArr[0];
        float f = i2 - iArr[1];
        view.getFocusedRect(giKS3J6vZuNy);
        float f2 = (i - i3) + r1.left;
        return new defpackage.s31(f2, r1.top + f, r1.width() + f2, f + r1.top + r1.height());
    }

    public static final defpackage.wy giKS3J6vZuNy(int i) {
        if (i == 1) {
            return new defpackage.wy(2);
        }
        if (i == 2) {
            return new defpackage.wy(1);
        }
        if (i == 17) {
            return new defpackage.wy(3);
        }
        if (i == 33) {
            return new defpackage.wy(5);
        }
        if (i == 66) {
            return new defpackage.wy(4);
        }
        if (i != 130) {
            return null;
        }
        return new defpackage.wy(6);
    }
}
