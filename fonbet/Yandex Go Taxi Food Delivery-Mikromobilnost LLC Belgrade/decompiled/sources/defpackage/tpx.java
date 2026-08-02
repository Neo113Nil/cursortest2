package defpackage;

import android.content.Context;
import androidx.sqlite.db.framework.d;

/* loaded from: classes.dex */
public final /* synthetic */ class tpx implements kkw0 {
    public final /* synthetic */ Context a;

    public /* synthetic */ tpx(Context context) {
        this.a = context;
    }

    @Override // defpackage.kkw0
    public lkw0 a(vnh vnhVar) {
        String str = (String) vnhVar.d;
        jkw0 jkw0Var = (jkw0) vnhVar.e;
        new xfs();
        if (str != null && str.length() != 0) {
            return new d(this.a, str, jkw0Var, true, true);
        }
        ny61.g("Must set a non-null database name to a configuration that uses the no backup directory.");
        return null;
    }
}
