package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class dyf extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ eyf s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dyf(eyf eyfVar, int i) {
        super(0);
        this.r = i;
        this.s = eyfVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                ((u8q) this.s.i.getValue()).l.l(nxi.c);
                return Unit.a;
            case 1:
                this.s.requireActivity().onBackPressed();
                return Unit.a;
            case 2:
                return this.s.requireActivity().getViewModelStore();
            case 3:
                return this.s.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return this.s.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
