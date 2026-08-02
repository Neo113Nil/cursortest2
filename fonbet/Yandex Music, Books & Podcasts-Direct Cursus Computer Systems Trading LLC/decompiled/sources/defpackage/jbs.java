package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class jbs extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ lbs s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jbs(lbs lbsVar, int i) {
        super(0);
        this.r = i;
        this.s = lbsVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return Boolean.valueOf(this.s.a.e() > 0.0f);
            default:
                lbs lbsVar = this.s;
                return Boolean.valueOf(lbsVar.a.e() < lbsVar.b.e());
        }
    }
}
