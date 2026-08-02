package defpackage;

import java.io.File;
import java.io.FileFilter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class neo implements FileFilter {
    public final /* synthetic */ int a;
    public final /* synthetic */ oeo b;

    public /* synthetic */ neo(oeo oeoVar, int i) {
        this.a = i;
        this.b = oeoVar;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        boolean d;
        switch (this.a) {
            case 0:
                d = Intrinsics.d(file.getName(), this.b.c.getName());
                break;
            default:
                d = Intrinsics.d(file.getName(), this.b.c.getName());
                break;
        }
        return !d;
    }
}
