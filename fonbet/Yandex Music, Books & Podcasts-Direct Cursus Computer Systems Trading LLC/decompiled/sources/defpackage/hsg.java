package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class hsg extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ String s;
    public final /* synthetic */ String t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hsg(int i, Object obj, String str, String str2) {
        super(0);
        this.r = i;
        this.s = str;
        this.t = str2;
        this.u = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return "[" + this.s + "][" + this.t + "] " + this.u;
            default:
                return "[" + this.s + "][" + this.t + "] " + this.u;
        }
    }
}
