package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes3.dex */
public final class vf6 extends uf6 {
    public final jyr g;

    public vf6(Context context, int i) {
        super(context, i);
        this.g = btf.b(new k5(27, this));
    }

    @Override // defpackage.uf6, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return (Resources) this.g.getValue();
    }
}
