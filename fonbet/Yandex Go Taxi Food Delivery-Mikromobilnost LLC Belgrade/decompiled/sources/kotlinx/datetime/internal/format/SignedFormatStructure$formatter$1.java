package kotlinx.datetime.internal.format;

import defpackage.aw21;
import defpackage.cvw;
import defpackage.jl40;
import defpackage.tls;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class SignedFormatStructure$formatter$1 extends FunctionReferenceImpl implements tls {
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignedFormatStructure$formatter$1(e eVar) {
        super(1, 0, cvw.class, "checkIfAllNegative", "formatter$checkIfAllNegative(Lkotlinx/datetime/internal/format/SignedFormatStructure;Ljava/lang/Object;)Z");
        this.this$0 = eVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Iterator it = this.this$0.b.iterator();
        boolean z = false;
        boolean z2 = false;
        while (true) {
            if (!it.hasNext()) {
                z = z2;
                break;
            }
            if (!jl40.l(((kotlinx.datetime.format.f) it.next()).a.a.get(obj), Boolean.TRUE)) {
                aw21 aw21Var = (aw21) obj;
                Integer e = aw21Var.e();
                if ((e != null ? e.intValue() : 0) == 0) {
                    Integer D = aw21Var.D();
                    if ((D != null ? D.intValue() : 0) == 0) {
                        Integer q = aw21Var.q();
                        if ((q != null ? q.intValue() : 0) != 0) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                z2 = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
