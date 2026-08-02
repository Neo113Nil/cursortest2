package defpackage;

import android.content.Context;
import com.ybsdk.feature.autotopup.internal.presentation.saver.c;

/* loaded from: classes3.dex */
public final class qy3 implements v7p {
    public final /* synthetic */ int a;
    public final gwf b;
    public final gwf c;

    public /* synthetic */ qy3(gwf gwfVar, gwf gwfVar2, int i) {
        this.a = i;
        this.b = gwfVar;
        this.c = gwfVar2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        gwf gwfVar = this.c;
        gwf gwfVar2 = this.b;
        switch (i) {
            case 0:
                return new py3((Context) gwfVar2.get(), (w530) gwfVar.get());
            case 1:
                return new i14((Context) gwfVar2.get(), (w530) gwfVar.get());
            default:
                return new c((Context) gwfVar2.get(), (w530) gwfVar.get());
        }
    }
}
