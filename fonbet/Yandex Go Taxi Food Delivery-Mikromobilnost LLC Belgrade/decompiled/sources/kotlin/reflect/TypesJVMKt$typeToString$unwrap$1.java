package kotlin.reflect;

import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class TypesJVMKt$typeToString$unwrap$1 extends FunctionReferenceImpl implements tls {
    public static final TypesJVMKt$typeToString$unwrap$1 b = new TypesJVMKt$typeToString$unwrap$1(1, 0, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((Class) obj).getComponentType();
    }
}
