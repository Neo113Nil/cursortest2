package D;

import java.io.File;

/* loaded from: classes.dex */
public final class V extends E0.j implements D0.l {

    /* renamed from: f, reason: collision with root package name */
    public static final V f144f = new V(1);

    @Override // D0.l
    public final Object i(Object obj) {
        File file = (File) obj;
        E0.i.e(file, "it");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        E0.i.d(absolutePath, "file.canonicalFile.absolutePath");
        return new l0(absolutePath);
    }
}
