package defpackage;

import com.ybsdk.feature.autotopup.internal.network.dto.rounding.a;

/* loaded from: classes3.dex */
public final class wri0 implements v7p {
    public final /* synthetic */ int a;
    public final gwf b;

    public /* synthetic */ wri0(gwf gwfVar, int i) {
        this.a = i;
        this.b = gwfVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        gwf gwfVar = this.b;
        switch (i) {
            case 0:
                return new gdb0((w530) gwfVar.get());
            default:
                return new a((w530) gwfVar.get());
        }
    }
}
