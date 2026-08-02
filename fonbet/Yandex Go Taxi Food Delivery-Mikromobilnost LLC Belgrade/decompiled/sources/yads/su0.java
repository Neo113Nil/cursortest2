package yads;

import android.content.Context;
import defpackage.a8a1;
import defpackage.dy61;
import defpackage.hka1;
import defpackage.mg81;
import defpackage.sls;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class su0 extends Lambda implements sls {
    public final /* synthetic */ mg81 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su0(mg81 mg81Var) {
        super(0);
        this.b = mg81Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        Context context = this.b.a;
        dy61 j = a8a1.j(hka1.a(context), context);
        j.a();
        return j;
    }
}
