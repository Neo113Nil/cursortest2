package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class yxn extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ fvf s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yxn(fvf fvfVar, int i) {
        super(0);
        this.r = i;
        this.s = fvfVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long g;
        switch (this.r) {
            case 0:
                bvf j = this.s.j();
                int ordinal = j.p.ordinal();
                if (ordinal == 0) {
                    g = j.g() & 4294967295L;
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    g = j.g() >> 32;
                }
                return Float.valueOf(((int) g) * 0.05f);
            default:
                return this.s.j().p;
        }
    }
}
