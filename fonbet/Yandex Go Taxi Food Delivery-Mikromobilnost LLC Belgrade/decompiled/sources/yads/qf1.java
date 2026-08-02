package yads;

import android.content.Context;
import defpackage.tls;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class qf1 extends Lambda implements tls {
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf1(Context context, String str) {
        super(1);
        this.b = context;
        this.c = str;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return new pf1(this.b, this.c);
    }
}
