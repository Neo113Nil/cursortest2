package kotlin.reflect;

import defpackage.tls;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class ParameterizedTypeImpl$getTypeName$1$1 extends FunctionReferenceImpl implements tls {
    public static final ParameterizedTypeImpl$getTypeName$1$1 b = new ParameterizedTypeImpl$getTypeName$1$1(1, 1, b.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return b.a((Type) obj);
    }
}
