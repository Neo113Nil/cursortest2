package yads;

import android.content.Context;
import defpackage.df81;
import defpackage.h971;
import defpackage.hg71;
import defpackage.sls;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class u50 extends Lambda implements sls {
    public final /* synthetic */ Context b;
    public final /* synthetic */ h971 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u50(Context context, h971 h971Var) {
        super(0);
        this.b = context;
        this.c = h971Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return new df81(this.b, (hg71) this.c.c.getValue());
    }
}
