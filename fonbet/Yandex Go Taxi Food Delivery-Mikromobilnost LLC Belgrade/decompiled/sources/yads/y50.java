package yads;

import android.content.Context;
import defpackage.h971;
import defpackage.me0;
import defpackage.qw71;
import defpackage.sls;
import defpackage.y781;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class y50 extends Lambda implements sls {
    public final /* synthetic */ Context b;
    public final /* synthetic */ h971 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y50(Context context, h971 h971Var) {
        super(0);
        this.b = context;
        this.c = h971Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return new y781(this.b, (qw71) this.c.e.getValue(), new me0(this.b, (byte) 0));
    }
}
