package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class muw extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ vuw s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ muw(vuw vuwVar, int i) {
        super(0);
        this.r = i;
        this.s = vuwVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return this.s.a();
            default:
                jfu viewModelStore = this.s.getViewModelStore();
                viewModelStore.getClass();
                return viewModelStore;
        }
    }
}
