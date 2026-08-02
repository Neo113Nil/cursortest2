package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class s6f extends uif implements Function0 {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s6f(int i, Object obj) {
        super(0);
        this.r = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return new yir();
            case 1:
                return new zir();
            case 2:
                return new mqt();
            case 3:
                return new nqt();
            case 4:
                return new oqt();
            case 5:
                return new rqt();
            case 6:
                return new sqt();
            case 7:
                return new tqt();
            case 8:
                return new tsf(0, 0);
            case 9:
                return new t8w();
            case 10:
                return new two(0);
            default:
                return saf.p();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s6f(int i, int i2) {
        super(i);
        this.r = i2;
    }
}
