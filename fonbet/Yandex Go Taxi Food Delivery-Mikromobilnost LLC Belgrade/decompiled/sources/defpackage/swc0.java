package defpackage;

import android.content.Context;

/* loaded from: classes4.dex */
public abstract class swc0 {
    private final rs10 createArgsCodec;

    public swc0(rs10 rs10Var) {
        this.createArgsCodec = rs10Var;
    }

    public abstract qwc0 create(Context context, int i, Object obj);

    public final rs10 getCreateArgsCodec() {
        return this.createArgsCodec;
    }
}
