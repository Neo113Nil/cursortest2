package yads;

import android.content.Context;
import defpackage.k471;
import defpackage.sls;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class c60 extends Lambda implements sls {
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c60(Context context) {
        super(0);
        this.b = context;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        k471 k471Var;
        Context context = this.b;
        k471 k471Var2 = k471.d;
        if (k471Var2 != null) {
            return k471Var2;
        }
        synchronized (k471.e) {
            k471Var = k471.d;
            if (k471Var == null) {
                k471Var = new k471(context.getApplicationContext());
                k471.d = k471Var;
            }
        }
        return k471Var;
    }
}
