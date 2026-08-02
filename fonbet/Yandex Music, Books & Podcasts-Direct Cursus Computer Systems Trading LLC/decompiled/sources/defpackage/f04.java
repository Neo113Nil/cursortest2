package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class f04 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ pjc[] s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f04(pjc[] pjcVarArr, int i) {
        super(0);
        this.r = i;
        this.s = pjcVarArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return new Integer[this.s.length];
            default:
                return new Integer[this.s.length];
        }
    }
}
