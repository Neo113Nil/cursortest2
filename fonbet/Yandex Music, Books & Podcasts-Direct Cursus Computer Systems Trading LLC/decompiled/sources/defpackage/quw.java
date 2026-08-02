package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class quw extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ zuw s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ quw(zuw zuwVar, int i) {
        super(0);
        this.r = i;
        this.s = zuwVar;
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
