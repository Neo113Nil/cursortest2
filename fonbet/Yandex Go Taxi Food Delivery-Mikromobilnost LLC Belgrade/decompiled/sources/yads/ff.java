package yads;

import android.content.Context;
import defpackage.fp71;
import defpackage.sls;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class ff extends Lambda implements sls {
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff(Context context) {
        super(0);
        this.b = context;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return new fp71(this.b.getApplicationContext());
    }
}
