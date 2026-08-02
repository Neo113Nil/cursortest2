package app.cash.zipline.loader.internal.cache;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class FilesQueries$selectCacheSumBytes$2 extends FunctionReferenceImpl implements Function1 {
    public static final FilesQueries$selectCacheSumBytes$2 INSTANCE = new FilesQueries$selectCacheSumBytes$2(1, SelectCacheSumBytes.class, "<init>", "<init>(Ljava/lang/Long;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new SelectCacheSumBytes((Long) obj);
    }
}
