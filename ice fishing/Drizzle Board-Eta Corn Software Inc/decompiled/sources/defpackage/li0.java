package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class li0 extends ki0 {
    public li0(wi0 wi0Var, WindowInsets windowInsets) {
        super(wi0Var, windowInsets);
    }

    @Override // defpackage.si0
    public gd b2ZJblxo() {
        DisplayCutout displayCutout;
        displayCutout = this.MdtA4re8.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new gd(displayCutout);
    }

    @Override // defpackage.ji0, defpackage.si0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li0)) {
            return false;
        }
        li0 li0Var = (li0) obj;
        return Objects.equals(this.MdtA4re8, li0Var.MdtA4re8) && Objects.equals(this.b2ZJblxo, li0Var.b2ZJblxo) && ji0.VhgXwMj9(this.Qr9iLBAD, li0Var.Qr9iLBAD);
    }

    @Override // defpackage.si0
    public int hashCode() {
        return this.MdtA4re8.hashCode();
    }

    @Override // defpackage.si0
    public wi0 qoPGr6Ce() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.MdtA4re8.consumeDisplayCutout();
        return wi0.VgvYg0wo(consumeDisplayCutout, null);
    }
}
