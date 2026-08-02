package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class qqo extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ sqo s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qqo(sqo sqoVar, int i) {
        super(0);
        this.r = i;
        this.s = sqoVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return ((p77) ((rsd) qld.y(this.s)).a().b(p77.class)).c();
            case 1:
                ((u8q) this.s.h.getValue()).K();
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
