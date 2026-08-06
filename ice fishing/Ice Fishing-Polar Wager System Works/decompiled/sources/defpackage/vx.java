package defpackage;

/* loaded from: classes.dex */
public abstract class vx {
    public static final int[] IHQe1A4L2xu = new int[2];
    public static final android.graphics.Rect oh6vYeIP = new android.graphics.Rect();

    public static final defpackage.kz0 IHQe1A4L2xu(android.view.View view, defpackage.v0 v0Var) {
        int[] iArr = IHQe1A4L2xu;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        v0Var.getLocationInWindow(iArr);
        int i3 = iArr[0];
        float f = i2 - iArr[1];
        view.getFocusedRect(oh6vYeIP);
        float f2 = (i - i3) + r1.left;
        return new defpackage.kz0(f2, r1.top + f, r1.width() + f2, f + r1.top + r1.height());
    }

    public static final defpackage.sx oh6vYeIP(int i) {
        if (i == 1) {
            return new defpackage.sx(2);
        }
        if (i == 2) {
            return new defpackage.sx(1);
        }
        if (i == 17) {
            return new defpackage.sx(3);
        }
        if (i == 33) {
            return new defpackage.sx(5);
        }
        if (i == 66) {
            return new defpackage.sx(4);
        }
        if (i != 130) {
            return null;
        }
        return new defpackage.sx(6);
    }
}
