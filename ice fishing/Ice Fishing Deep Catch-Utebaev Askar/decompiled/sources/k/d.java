package k;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f137b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(File rootFile) {
        super(rootFile);
        Intrinsics.checkNotNullParameter(rootFile, "rootFile");
    }

    @Override // k.g
    public final File a() {
        if (this.f137b) {
            return null;
        }
        this.f137b = true;
        return this.f144a;
    }
}
