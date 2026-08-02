package defpackage;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes6.dex */
public final class g2c implements ypt {
    private static final long serialVersionUID = 1;
    public final String a;
    public final boolean b;
    public final boolean c;

    public g2c(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.ypt
    public final boolean O() {
        return true;
    }

    @Override // defpackage.ypt
    public final String Q(String str) {
        return null;
    }

    @Override // defpackage.ypt
    public final cqt T() {
        return new aqt(wjb.Link);
    }

    @Override // defpackage.ypt
    public final Map getParams() {
        return null;
    }

    @Override // defpackage.ypt
    public final euo getType() {
        return euo.D;
    }

    @Override // defpackage.ypt
    public final Uri m() {
        return Uri.parse(this.a);
    }
}
