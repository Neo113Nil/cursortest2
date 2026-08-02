package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class spb extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ tpb s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ spb(tpb tpbVar, int i) {
        super(0);
        this.r = i;
        this.s = tpbVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return this.s.requireActivity().getViewModelStore();
            case 1:
                return this.s.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return this.s.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
