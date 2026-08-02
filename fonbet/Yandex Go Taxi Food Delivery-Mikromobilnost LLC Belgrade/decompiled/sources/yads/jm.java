package yads;

import android.content.Context;
import defpackage.in71;
import defpackage.qq71;
import defpackage.sls;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class jm extends Lambda implements sls {
    public final /* synthetic */ Context b;
    public final /* synthetic */ in71 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm(Context context, in71 in71Var) {
        super(0);
        this.b = context;
        this.c = in71Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return new qq71(this.b, this.c.B);
    }
}
