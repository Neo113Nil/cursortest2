package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class b6u implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y8u b;

    public /* synthetic */ b6u(y8u y8uVar, int i) {
        this.a = i;
        this.b = y8uVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.j();
                break;
            case 1:
                this.b.u();
                break;
            case 2:
                this.b.k();
                break;
            case 3:
                this.b.x();
                break;
            case 4:
                this.b.r();
                break;
            case 5:
                this.b.m();
                break;
            default:
                this.b.u();
                break;
        }
        return Boolean.TRUE;
    }
}
