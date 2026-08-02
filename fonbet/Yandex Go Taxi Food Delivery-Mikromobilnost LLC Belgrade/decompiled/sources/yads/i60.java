package yads;

import android.content.Context;
import defpackage.mf71;
import defpackage.ne81;
import defpackage.sls;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class i60 extends Lambda implements sls {
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i60(Context context) {
        super(0);
        this.b = context;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return new ne81(mf71.d.a(this.b).a);
    }
}
