package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ydv extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ zdv s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ydv(zdv zdvVar, int i) {
        super(0);
        this.r = i;
        this.s = zdvVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return ((p77) ((rsd) qld.y(this.s)).a().b(p77.class)).c();
            case 1:
                return this.s.requireActivity().getViewModelStore();
            case 2:
                return this.s.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return this.s.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
