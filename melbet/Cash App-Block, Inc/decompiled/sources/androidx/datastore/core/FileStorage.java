package androidx.datastore.core;

import java.io.File;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class FileStorage {
    public static final LinkedHashSet activeFiles = new LinkedHashSet();
    public static final Object activeFilesLock = new Object();
    public final Function1 coordinatorProducer = AnonymousClass1.INSTANCE;
    public final Function0 produceFile;
    public final Serializer serializer;

    /* renamed from: androidx.datastore.core.FileStorage$1, reason: invalid class name */
    public final class AnonymousClass1 extends Lambda implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            File file = (File) obj;
            file.getClass();
            String absolutePath = file.getCanonicalFile().getAbsolutePath();
            absolutePath.getClass();
            return new SingleProcessCoordinator(absolutePath);
        }
    }

    public FileStorage(Serializer serializer, Function0 function0) {
        this.serializer = serializer;
        this.produceFile = function0;
    }
}
