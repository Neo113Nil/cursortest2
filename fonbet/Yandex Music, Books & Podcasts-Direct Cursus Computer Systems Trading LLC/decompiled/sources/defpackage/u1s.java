package defpackage;

import android.content.Context;
import android.view.View;

/* loaded from: classes3.dex */
public final class u1s implements ieu {
    public final Context a;

    public u1s(Context context) {
        this.a = context;
    }

    @Override // defpackage.ieu
    public final View a() {
        return new b2s(this.a);
    }
}
