package defpackage;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class ng1 extends mg1 {
    public e20 Y6hRI1cF8;
    public e20 jivtDDk9H;
    public e20 mE4lRynR;

    public ng1(wg1 wg1Var, WindowInsets windowInsets) {
        super(wg1Var, windowInsets);
        this.mE4lRynR = null;
        this.jivtDDk9H = null;
        this.Y6hRI1cF8 = null;
    }

    @Override // defpackage.sg1
    public e20 E7jCp8Ls() {
        Insets systemGestureInsets;
        if (this.mE4lRynR == null) {
            systemGestureInsets = this.X1lG3V04pd.getSystemGestureInsets();
            this.mE4lRynR = e20.X1lG3V04pd(systemGestureInsets);
        }
        return this.mE4lRynR;
    }

    @Override // defpackage.sg1
    public e20 JFJ3QoxA() {
        Insets mandatorySystemGestureInsets;
        if (this.jivtDDk9H == null) {
            mandatorySystemGestureInsets = this.X1lG3V04pd.getMandatorySystemGestureInsets();
            this.jivtDDk9H = e20.X1lG3V04pd(mandatorySystemGestureInsets);
        }
        return this.jivtDDk9H;
    }

    @Override // defpackage.kg1, defpackage.sg1
    public wg1 YmKjaVtbfp5Z(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.X1lG3V04pd.inset(i, i2, i3, i4);
        return wg1.X1lG3V04pd(inset, null);
    }

    @Override // defpackage.sg1
    public e20 uFEq9NpZ() {
        Insets tappableElementInsets;
        if (this.Y6hRI1cF8 == null) {
            tappableElementInsets = this.X1lG3V04pd.getTappableElementInsets();
            this.Y6hRI1cF8 = e20.X1lG3V04pd(tappableElementInsets);
        }
        return this.Y6hRI1cF8;
    }

    @Override // defpackage.lg1, defpackage.sg1
    public void WdrkLMV3xh(e20 e20Var) {
    }
}
