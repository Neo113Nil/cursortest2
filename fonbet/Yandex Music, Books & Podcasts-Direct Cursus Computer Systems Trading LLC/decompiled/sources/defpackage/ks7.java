package defpackage;

import android.content.Context;
import android.os.Build;

/* loaded from: classes4.dex */
public final class ks7 extends ls7 {
    public ks7() {
        super("SYSTEM_DEFAULT", 2);
    }

    @Override // defpackage.ues
    public final dfs a(Context context) {
        int i;
        context.getClass();
        int i2 = Build.VERSION.SDK_INT;
        ues uesVar = ls7.a;
        if (i2 >= 29 && (i = context.getResources().getConfiguration().uiMode & 48) != 16 && i == 32) {
            uesVar = ls7.b;
        }
        return uesVar.a(context);
    }
}
