package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.HashSet;

/* loaded from: classes6.dex */
public final class goi extends wjq {
    @Override // defpackage.wjq, defpackage.ndq
    public final pjc b(Context context) {
        context.getClass();
        return new em((u21) super.b(context), 4);
    }

    @Override // defpackage.ndq
    public final Intent c(Context context) {
        context.getClass();
        r20 r20Var = new r20(1);
        return new Intent("android.intent.action.VIEW", ((b8p) r20Var.a(((a8p) r20Var.d).b.concat("?auto_recognition=true"), true)).m());
    }

    @Override // defpackage.wjq
    public final HashSet d() {
        return wjq.e;
    }
}
