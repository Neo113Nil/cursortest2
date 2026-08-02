package app.cash.zipline.loader.internal.cache;

import java.io.Serializable;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class FilesQueries$selectOldestReady$2 extends FunctionReferenceImpl implements Function7 {
    public static final FilesQueries$selectOldestReady$2 INSTANCE = new FilesQueries$selectOldestReady$2(7, Files.class, "<init>", "<init>(JLjava/lang/String;Ljava/lang/String;Lapp/cash/zipline/loader/internal/cache/FileState;JJLjava/lang/Long;)V", 0);

    @Override // kotlin.jvm.functions.Function7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
        String str = (String) obj2;
        FileState fileState = (FileState) obj4;
        str.getClass();
        fileState.getClass();
        return new Files(((Number) obj).longValue(), str, (String) obj3, fileState, ((Number) obj5).longValue(), ((Number) obj6).longValue(), (Long) serializable);
    }
}
