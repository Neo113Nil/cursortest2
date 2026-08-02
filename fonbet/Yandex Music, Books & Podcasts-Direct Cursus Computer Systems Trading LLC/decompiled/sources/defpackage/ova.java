package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ova implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ qva b;

    public /* synthetic */ ova(qva qvaVar, int i) {
        this.a = i;
        this.b = qvaVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                bva bvaVar = (bva) obj;
                boolean z = bvaVar instanceof ava;
                qva qvaVar = this.b;
                if (!z) {
                    if (!(bvaVar instanceof zua)) {
                        if (!Intrinsics.d(bvaVar, yua.a)) {
                            b6e.s();
                            break;
                        } else {
                            qvaVar.dismissAllowingStateLoss();
                        }
                    } else {
                        qvaVar.y().M(((zua) bvaVar).a);
                    }
                } else {
                    if (qvaVar.y().J() != null) {
                        Context requireContext = qvaVar.requireContext();
                        requireContext.getClass();
                        String str = ((ava) bvaVar).a;
                        str.getClass();
                        w1g.y(requireContext, str, true);
                    }
                    qvaVar.y().M(((ava) bvaVar).b);
                }
                break;
            default:
                ewa ewaVar = (ewa) obj;
                boolean d = Intrinsics.d(ewaVar, cwa.a);
                qva qvaVar2 = this.b;
                if (!d) {
                    if (!Intrinsics.d(ewaVar, dwa.a)) {
                        if (!Intrinsics.d(ewaVar, bwa.a)) {
                            b6e.s();
                            break;
                        } else {
                            qvaVar2.z().G();
                        }
                    } else {
                        qvaVar2.z().M();
                    }
                } else {
                    qvaVar2.z().H();
                }
                break;
        }
        return null;
    }
}
