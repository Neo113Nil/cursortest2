package yads;

import android.content.Context;
import defpackage.sls;
import defpackage.wn81;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class j60 extends Lambda implements sls {
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j60(Context context) {
        super(0);
        this.b = context;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return new wn81(this.b);
    }
}
