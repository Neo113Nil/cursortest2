package com.plaid.internal;

import android.content.Context;
import java.io.File;
import kotlin.Deprecated;
import kotlin.io.FilesKt__FileReadWriteKt;

@Deprecated
/* loaded from: classes5.dex */
public final class H5 {
    public static final a b = new a();
    public static volatile H5 c;
    public final Context a;

    public static final class a {
    }

    public H5(Context context) {
        context.getClass();
        this.a = context.getApplicationContext();
    }

    public final void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        File filesDir = this.a.getFilesDir();
        filesDir.getClass();
        if (!filesDir.exists()) {
            filesDir.mkdirs();
        }
        File file = new File(filesDir, str);
        if (file.exists()) {
            file.delete();
            file.createNewFile();
        } else {
            file.createNewFile();
        }
        FilesKt__FileReadWriteKt.writeText$default(file, str2);
    }

    public final void a() {
        File file = new File(this.a.getFilesDir().toString(), "plaid_link_state");
        if (file.exists()) {
            file.delete();
        }
    }
}
