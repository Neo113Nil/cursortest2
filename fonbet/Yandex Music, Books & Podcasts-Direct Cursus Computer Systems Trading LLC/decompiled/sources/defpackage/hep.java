package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class hep extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ iep s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hep(iep iepVar, int i) {
        super(0);
        this.r = i;
        this.s = iepVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return (wof) this.s.d.a;
            case 1:
                return (wof) this.s.d.a;
            default:
                return (cds) this.s.d.b;
        }
    }
}
