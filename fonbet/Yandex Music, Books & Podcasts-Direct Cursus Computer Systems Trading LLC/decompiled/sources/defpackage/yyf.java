package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes4.dex */
public final class yyf implements yn7 {
    public static final yyf a = new yyf();
    public static volatile boolean b;

    static {
        new Handler(Looper.getMainLooper()).post(new jq(1));
        b = true;
    }

    @Override // defpackage.yn7
    public final void onStart(dzf dzfVar) {
        dzfVar.getClass();
        dzfVar.getClass();
        b = true;
    }

    @Override // defpackage.yn7
    public final void onStop(dzf dzfVar) {
        b = false;
    }
}
