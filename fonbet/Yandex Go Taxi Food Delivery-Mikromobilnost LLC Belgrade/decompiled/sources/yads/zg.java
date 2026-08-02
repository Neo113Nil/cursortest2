package yads;

import android.app.ActivityManager;
import defpackage.sls;
import defpackage.z371;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class zg extends Lambda implements sls {
    public final /* synthetic */ z371 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg(z371 z371Var) {
        super(0);
        this.b = z371Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        try {
            Object systemService = this.b.a.getSystemService("activity");
            if (systemService instanceof ActivityManager) {
                return (ActivityManager) systemService;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
