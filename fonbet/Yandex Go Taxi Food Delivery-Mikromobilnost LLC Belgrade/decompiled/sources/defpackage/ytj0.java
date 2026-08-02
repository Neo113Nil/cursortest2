package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes4.dex */
public final class ytj0 implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith("res_timestamp-");
    }
}
