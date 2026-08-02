package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class pem implements gfu {
    public final /* synthetic */ int a;

    public /* synthetic */ pem(int i, Function0 function0) {
        this.a = i;
    }

    @Override // defpackage.gfu
    public final bfu b(Class cls) {
        switch (this.a) {
            case 0:
                return new uem();
            case 1:
                return new zm4();
            case 2:
                return new pqp();
            case 3:
                return new nxr();
            default:
                return new zqj();
        }
    }
}
