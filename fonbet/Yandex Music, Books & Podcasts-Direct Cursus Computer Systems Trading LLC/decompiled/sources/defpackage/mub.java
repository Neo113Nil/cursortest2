package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class mub implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u6k b;

    public /* synthetic */ mub(u6k u6kVar, int i) {
        this.a = i;
        this.b = u6kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int h;
        switch (this.a) {
            case 0:
                h = this.b.h();
                break;
            case 1:
                h = this.b.h();
                break;
            default:
                return Boolean.valueOf(this.b.h() >= 0);
        }
        return Integer.valueOf(h);
    }
}
