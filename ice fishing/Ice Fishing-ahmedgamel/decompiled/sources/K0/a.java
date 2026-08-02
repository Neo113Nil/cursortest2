package K0;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1595a = new a();

    public final File a(Context context) {
        kotlin.jvm.internal.h.e(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        kotlin.jvm.internal.h.d(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
