package defpackage;

import android.os.Handler;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class p7l extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ xdh s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p7l(xdh xdhVar, int i) {
        super(0);
        this.r = i;
        this.s = xdhVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.r;
        xdh xdhVar = this.s;
        switch (i) {
            case 0:
                Handler handler = (Handler) ((jyr) xdhVar.b).getValue();
                int i2 = csd.a;
                return new bsd(handler, "YP:ExoThread", false).g;
            default:
                return new Handler(((xrb) xdhVar.a).t);
        }
    }
}
