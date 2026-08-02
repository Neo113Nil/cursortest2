package defpackage;

import com.ybsdk.feature.autotopup.internal.presentation.instruction.AutoTopupInstructionFragment;
import com.ybsdk.feature.autotopup.internal.presentation.saver.AutoTopupRegularFragment;
import com.ybsdk.feature.autotopup.internal.presentation.saver.RoundingFragment;
import com.ybsdk.feature.autotopup.internal.presentation.setup.v1.AutoTopupSetupFragment;

/* loaded from: classes3.dex */
public final class zv3 implements v7p {
    public final /* synthetic */ int a;
    public final n3w b;
    public final gwf c;

    public /* synthetic */ zv3(n3w n3wVar, gwf gwfVar, int i) {
        this.a = i;
        this.b = n3wVar;
        this.c = gwfVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        gwf gwfVar = this.c;
        n3w n3wVar = this.b;
        switch (i) {
            case 0:
                return new AutoTopupInstructionFragment((cw3) n3wVar.a, (uk11) gwfVar.get());
            case 1:
                return new AutoTopupRegularFragment((fy3) n3wVar.a, (uk11) gwfVar.get());
            case 2:
                return new AutoTopupSetupFragment((q14) n3wVar.a, (uk11) gwfVar.get());
            default:
                return new RoundingFragment((gzk0) n3wVar.a, (uk11) gwfVar.get());
        }
    }
}
