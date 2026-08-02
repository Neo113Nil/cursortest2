package yads;

import android.content.Context;
import defpackage.a081;
import defpackage.cl71;
import defpackage.h971;
import defpackage.ka81;
import defpackage.ny61;
import defpackage.sls;
import defpackage.vfa1;
import defpackage.zq71;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class v50 extends Lambda implements sls {
    public final /* synthetic */ h971 b;
    public final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v50(Context context, h971 h971Var) {
        super(0);
        this.b = h971Var;
        this.c = context;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        a081 a081Var = (a081) this.b.b.getValue();
        Context context = this.c;
        if (cl71.a == null) {
            synchronized (cl71.b) {
                if (cl71.a == null) {
                    cl71.a = vfa1.a(context);
                }
            }
        }
        zq71 zq71Var = cl71.a;
        if (zq71Var != null) {
            return new ka81(a081Var, zq71Var);
        }
        ny61.g("Required value was null.");
        return null;
    }
}
