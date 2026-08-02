package yads;

import android.content.Context;
import defpackage.m771;
import defpackage.r191;
import defpackage.sls;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class vf extends Lambda implements sls {
    public final /* synthetic */ m771 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ r191 d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf(m771 m771Var, Context context, r191 r191Var, String str) {
        super(0);
        this.b = m771Var;
        this.c = context;
        this.d = r191Var;
        this.e = str;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        m771 m771Var = this.b;
        m771Var.a.a(this.c);
        r191 r191Var = this.d;
        String str = this.e;
        if (r191Var.a.a()) {
            try {
                r191Var.b.w(str);
            } catch (Throwable unused) {
            }
        }
        return this.d.b.r(this.e);
    }
}
