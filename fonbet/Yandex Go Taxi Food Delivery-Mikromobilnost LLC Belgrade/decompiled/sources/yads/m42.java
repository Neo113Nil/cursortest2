package yads;

import android.content.Context;
import defpackage.qu71;
import defpackage.sls;
import defpackage.vfa1;
import defpackage.yy71;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class m42 extends Lambda implements sls {
    public final /* synthetic */ qu71 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m42(qu71 qu71Var) {
        super(0);
        this.b = qu71Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        yy71 yy71Var;
        Context context = this.b.a;
        yy71 yy71Var2 = vfa1.a;
        if (yy71Var2 != null) {
            return yy71Var2;
        }
        synchronized (vfa1.b) {
            yy71 yy71Var3 = vfa1.a;
            if (yy71Var3 != null) {
                return yy71Var3;
            }
            try {
                yy71Var = vfa1.b(context);
                vfa1.a = yy71Var;
            } catch (Throwable th) {
                th.toString();
                yy71Var = null;
            }
            return yy71Var;
        }
    }
}
