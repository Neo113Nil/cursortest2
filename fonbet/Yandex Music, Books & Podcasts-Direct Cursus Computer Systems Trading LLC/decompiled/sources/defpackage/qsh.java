package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class qsh implements Function0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ jyr b;
    public final /* synthetic */ Context c;

    public /* synthetic */ qsh(jyr jyrVar, Context context) {
        this.b = jyrVar;
        this.c = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new lc0(this.c, this.b);
            default:
                return ((iqg) this.b.getValue()).a(this.c);
        }
    }

    public /* synthetic */ qsh(Context context, jyr jyrVar) {
        this.c = context;
        this.b = jyrVar;
    }
}
