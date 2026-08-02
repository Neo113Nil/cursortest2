package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class nuf extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ puf s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nuf(puf pufVar, int i) {
        super(0);
        this.r = i;
        this.s = pufVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                puf pufVar = this.s;
                return Float.valueOf(pufVar.p.d() - pufVar.p.a());
            case 1:
                return Float.valueOf(this.s.p.e());
            default:
                return Float.valueOf(this.s.p.b());
        }
    }
}
