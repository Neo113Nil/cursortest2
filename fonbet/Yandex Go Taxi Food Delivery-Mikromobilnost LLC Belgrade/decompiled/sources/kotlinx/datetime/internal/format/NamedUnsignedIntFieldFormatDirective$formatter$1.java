package kotlinx.datetime.internal.format;

import defpackage.b64;
import defpackage.e421;
import defpackage.oyr;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class NamedUnsignedIntFieldFormatDirective$formatter$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        b bVar = (b) this.receiver;
        e421 e421Var = bVar.a;
        int intValue = ((Number) e421Var.a.b(obj)).intValue();
        String str = (String) kotlin.collections.a.S(intValue - e421Var.b, bVar.b);
        return str == null ? oyr.t(b64.t(intValue, "The value ", " of "), e421Var.d, " does not have a corresponding string representation") : str;
    }
}
