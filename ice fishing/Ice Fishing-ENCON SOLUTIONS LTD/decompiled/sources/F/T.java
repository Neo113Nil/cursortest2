package F;

import java.io.File;

/* loaded from: classes.dex */
public final class T extends kotlin.jvm.internal.j implements t1.l {

    /* renamed from: e, reason: collision with root package name */
    public static final T f431e = new T(1);

    @Override // t1.l
    public final Object invoke(Object obj) {
        File it = (File) obj;
        kotlin.jvm.internal.i.e(it, "it");
        String absolutePath = it.getCanonicalFile().getAbsolutePath();
        kotlin.jvm.internal.i.d(absolutePath, "file.canonicalFile.absolutePath");
        return new j0(absolutePath);
    }
}
