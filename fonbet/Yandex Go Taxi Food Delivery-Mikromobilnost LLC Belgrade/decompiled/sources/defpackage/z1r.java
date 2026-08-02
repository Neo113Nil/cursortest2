package defpackage;

import java.io.File;

/* loaded from: classes4.dex */
public final class z1r extends d2r {
    public boolean b;

    public z1r(File file) {
        super(file);
    }

    @Override // defpackage.d2r
    public final File a() {
        if (this.b) {
            return null;
        }
        this.b = true;
        return this.a;
    }
}
