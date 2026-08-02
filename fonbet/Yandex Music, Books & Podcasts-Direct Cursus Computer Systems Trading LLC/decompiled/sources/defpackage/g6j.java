package defpackage;

import android.widget.LinearLayout;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g6j implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ i6j b;

    public /* synthetic */ g6j(i6j i6jVar, int i) {
        this.a = i;
        this.b = i6jVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                f6j f6jVar = (f6j) obj;
                i6j i6jVar = this.b;
                ybf ybfVar = i6jVar.g;
                if (Intrinsics.d(f6jVar, f6j.a)) {
                    j6j j6jVar = (j6j) ybfVar.getValue();
                    if (j6jVar.l == null) {
                        j6jVar.l = Boolean.FALSE;
                    }
                    oxa oxaVar = i6jVar.h;
                    oxaVar.getClass();
                    ((LinearLayout) oxaVar.b).setVisibility(8);
                } else if (Intrinsics.d(f6jVar, f6j.b)) {
                    j6j j6jVar2 = (j6j) ybfVar.getValue();
                    if (j6jVar2.l == null) {
                        j6jVar2.l = Boolean.TRUE;
                    }
                    oxa oxaVar2 = i6jVar.h;
                    oxaVar2.getClass();
                    ((LinearLayout) oxaVar2.b).setVisibility(0);
                } else if (Intrinsics.d(f6jVar, f6j.c)) {
                    oxa oxaVar3 = i6jVar.h;
                    oxaVar3.getClass();
                    ((LinearLayout) oxaVar3.b).setVisibility(8);
                }
                break;
            default:
                this.b.getParentFragmentManager().e0(cxb.K(new Pair("nfc_fragment_bundle_key", (e6j) obj)), "nfc_fragment_request_key");
                break;
        }
        return Unit.a;
    }
}
