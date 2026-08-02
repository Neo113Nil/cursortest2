package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class tqf extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Context s;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tqf(Context context, String str, int i) {
        super(0);
        this.r = i;
        this.s = context;
        this.t = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return datastore_release.a(this.s, this.t);
            default:
                return emm.a(this.s, this.t);
        }
    }
}
