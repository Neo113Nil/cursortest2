package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes.dex */
public final class mjn implements FilenameFilter {
    public final /* synthetic */ String a;

    public mjn(String str) {
        this.a = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(this.a);
    }
}
