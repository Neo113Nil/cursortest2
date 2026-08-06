package io.appmetrica.analytics.impl;

import android.content.Context;
import i1.AbstractC0253j;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class Z6 {

    /* renamed from: a, reason: collision with root package name */
    public final I6 f5474a;

    /* renamed from: b, reason: collision with root package name */
    public final List f5475b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5476c;

    public Z6(I6 i6, ArrayList arrayList, boolean z2) {
        this.f5474a = i6;
        this.f5475b = arrayList;
        this.f5476c = z2;
    }

    public final String a(Context context, X6 x6) {
        File parentFile;
        try {
            File a2 = this.f5474a.a(context, x6.b());
            if (!a2.exists() && (parentFile = a2.getParentFile()) != null && (parentFile.exists() || parentFile.mkdirs())) {
                a(context, x6.a(), a2);
            }
            return a2.getPath();
        } catch (Throwable unused) {
            return x6.b();
        }
    }

    public final void a(Context context, String str, File file) {
        List list = this.f5475b;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                File a2 = ((I6) it.next()).a(context, str);
                if (a2.exists()) {
                    try {
                        if (this.f5476c) {
                            FileUtils.copyToNullable(a2, file);
                        } else {
                            FileUtils.move(a2, file);
                        }
                        String path = a2.getPath();
                        String path2 = file.getPath();
                        for (String str2 : AbstractC0253j.B("-journal", "-shm", "-wal")) {
                            File file2 = new File(path + str2);
                            File file3 = new File(path2 + str2);
                            if (this.f5476c) {
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
    }
}
