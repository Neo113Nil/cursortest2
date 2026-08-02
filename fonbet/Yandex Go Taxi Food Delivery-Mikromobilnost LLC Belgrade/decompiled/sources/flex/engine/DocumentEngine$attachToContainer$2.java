package flex.engine;

import android.view.ViewGroup;
import defpackage.cnr0;
import defpackage.e3m;
import defpackage.fyl;
import defpackage.g2m;
import defpackage.gfe;
import defpackage.i3y;
import defpackage.k1m;
import defpackage.oju0;
import defpackage.pjm0;
import defpackage.qoi0;
import defpackage.s7s0;
import defpackage.sls;
import defpackage.tjr;
import defpackage.unr0;
import defpackage.xzl;
import defpackage.ywl;
import defpackage.zjr;
import defpackage.zy11;
import flex.logger.FlexLogLevel;
import flex.trim.memory.MemoryPriority;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class DocumentEngine$attachToContainer$2 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        StackTraceElement stackTraceElement;
        String str;
        cnr0 cnr0Var;
        k1m k1mVar;
        a aVar = (a) this.receiver;
        oju0 oju0Var = aVar.Z;
        if (!aVar.j0 && !aVar.C.a.a()) {
            xzl b = ((e3m) oju0Var.a).b();
            ywl ywlVar = b != null ? b.a : null;
            if (((ywlVar == null || (cnr0Var = ywlVar.c) == null || (k1mVar = (k1m) cnr0Var.b(qoi0.a(k1m.class))) == null) ? null : k1mVar.b()) == MemoryPriority.LOW) {
                zjr zjrVar = aVar.N;
                i3y a = kotlin.a.a(fyl.a);
                s7s0 s7s0Var = zjrVar.c.a;
                boolean booleanValue = Boolean.FALSE.booleanValue();
                tjr tjrVar = tjr.d;
                if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                    String fileName = stackTraceElement.getFileName();
                    if (fileName == null) {
                        fileName = "No file info";
                    }
                    String methodName = stackTraceElement.getMethodName();
                    int lineNumber = stackTraceElement.getLineNumber();
                    Integer valueOf = lineNumber > 0 ? Integer.valueOf(lineNumber) : null;
                    if (valueOf == null || (str = valueOf.toString()) == null) {
                        str = "No line info";
                    }
                    tjrVar = new tjr(fileName, methodName, str);
                }
                zjrVar.d(FlexLogLevel.INFO, "Handling trim memory", a, EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
                ViewGroup viewGroup = aVar.l0;
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                pjm0 pjm0Var = aVar.e0;
                if (pjm0Var != null) {
                    pjm0Var.ensureDestroyedView();
                }
                gfe gfeVar = aVar.f0;
                if (gfeVar != null) {
                    gfeVar.ensureDestroyedView();
                }
                aVar.k0 = true;
                oju0Var.b(g2m.a);
            }
        }
        return zy11.a;
    }
}
