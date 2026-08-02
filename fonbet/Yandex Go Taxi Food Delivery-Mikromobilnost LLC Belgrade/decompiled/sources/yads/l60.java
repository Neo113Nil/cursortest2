package yads;

import android.content.Context;
import defpackage.h971;
import defpackage.ko61;
import defpackage.sls;
import defpackage.wn81;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class l60 extends Lambda implements sls {
    public final /* synthetic */ Context b;
    public final /* synthetic */ h971 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l60(Context context, h971 h971Var) {
        super(0);
        this.b = context;
        this.c = h971Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return new ko61(this.b, (wn81) this.c.y.getValue());
    }
}
