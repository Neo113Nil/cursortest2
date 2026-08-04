package k;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f144a;

    public g(File root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.f144a = root;
    }

    public abstract File a();
}
