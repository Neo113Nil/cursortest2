package defpackage;

import android.content.Context;
import android.view.SubMenu;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class jv extends yr {
    public final Class DK9slbsy;
    public final int lwWCatUu;

    public jv(Context context, Class cls, int i) {
        super(context);
        this.DK9slbsy = cls;
        this.lwWCatUu = i;
    }

    @Override // defpackage.yr, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.DK9slbsy.getSimpleName().concat(" does not support submenus"));
    }

    @Override // defpackage.yr
    public final cs qoPGr6Ce(int i, int i2, int i3, CharSequence charSequence) {
        int size = this.P7K7Inc8.size() + 1;
        int i4 = this.lwWCatUu;
        if (size <= i4) {
            FySoLYna();
            cs qoPGr6Ce = super.qoPGr6Ce(i, i2, i3, charSequence);
            RXQxj5Oe();
            return qoPGr6Ce;
        }
        String simpleName = this.DK9slbsy.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + i4 + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }
}
