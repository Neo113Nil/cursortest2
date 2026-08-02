package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.u75;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class S7 {
    public final B7 a;
    public final List b;
    public final boolean c;

    public S7(B7 b7, ArrayList arrayList, boolean z) {
        this.a = b7;
        this.b = arrayList;
        this.c = z;
    }

    public final void a(Context context, String str, File file) {
        List list = this.b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File a = ((B7) it.next()).a(context, str);
            if (a.exists()) {
                try {
                    if (this.c) {
                        FileUtils.copyToNullable(a, file);
                    } else {
                        FileUtils.move(a, file);
                    }
                    String path = a.getPath();
                    String path2 = file.getPath();
                    for (String str2 : u75.h("-journal", "-shm", "-wal")) {
                        File file2 = new File(path + str2);
                        File file3 = new File(path2 + str2);
                        if (this.c) {
                            FileUtils.copyToNullable(file2, file3);
                        } else {
                            FileUtils.move(file2, file3);
                        }
                    }
                    return;
                } catch (Throwable unused) {
                    continue;
                }
            }
        }
    }

    public final String a(Context context, Q7 q7) {
        File parentFile;
        try {
            File a = this.a.a(context, q7.b());
            if (!a.exists() && (parentFile = a.getParentFile()) != null && (parentFile.exists() || parentFile.mkdirs())) {
                a(context, q7.a(), a);
            }
            return a.getPath();
        } catch (Throwable unused) {
            return q7.b();
        }
    }
}
