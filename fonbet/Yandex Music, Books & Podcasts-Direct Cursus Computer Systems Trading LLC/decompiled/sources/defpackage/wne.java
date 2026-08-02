package defpackage;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class wne implements na7 {
    public final z98 a;

    public wne(z98 z98Var) {
        this.a = z98Var;
    }

    @Override // defpackage.na7
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.na7
    public final oa7 b(Object obj) {
        return new g8c((InputStream) obj, this.a);
    }
}
