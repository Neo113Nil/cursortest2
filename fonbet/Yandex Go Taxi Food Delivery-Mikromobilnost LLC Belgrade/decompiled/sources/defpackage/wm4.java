package defpackage;

import android.content.res.Resources;

/* loaded from: classes15.dex */
public abstract class wm4 extends cn4 {
    public final int c;

    public wm4(int i, int i2, int i3) {
        super(i2, i3);
        this.c = i;
    }

    @Override // defpackage.cn4
    public final String a(Resources resources) {
        return resources.getString(d());
    }

    public int d() {
        return this.c;
    }
}
