package app.cash.zipline.internal.bridge;

import app.cash.zipline.ZiplineApiMismatchException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class ThrowableSerializer$knownTypeConstructor$1 extends FunctionReferenceImpl implements Function1 {
    public static final ThrowableSerializer$knownTypeConstructor$1 INSTANCE = new ThrowableSerializer$knownTypeConstructor$1(1, ZiplineApiMismatchException.class, "<init>", "<init>(Ljava/lang/String;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        return new ZiplineApiMismatchException(str);
    }
}
