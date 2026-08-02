package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class vhr implements uhr {
    public final Context a;
    public final frt b;
    public final qe c;

    public vhr(Context context, frt frtVar, qe qeVar) {
        frtVar.getClass();
        this.a = context;
        this.b = frtVar;
        this.c = qeVar;
    }

    @Override // defpackage.uhr
    public final List a() {
        File parentFile;
        ssg.a(3, "StorageRootResolverImpl", "searching for available storages", null);
        ArrayList f = f();
        if (!f.isEmpty()) {
            return f;
        }
        ssg.a(3, "StorageRootResolverImpl", "Found no available storages on first attempt, attempting to reset storage info", null);
        synchronized (gos.i) {
            gos.j = false;
        }
        ArrayList f2 = f();
        if (!f2.isEmpty()) {
            ssg.a(3, "StorageRootResolverImpl", "Found available storages after resetting storage info, storages=" + CollectionsKt.Q(f2), null);
            return f2;
        }
        thr thrVar = thr.c;
        File d = d(thrVar);
        ssg.a(7, "StorageRootResolverImpl", "No available storages found, externalStorage is path=" + d + ", isDirectory=" + (d != null ? Boolean.valueOf(d.isDirectory()) : null) + ", isReadable=" + (d != null ? Boolean.valueOf(d.canRead()) : null) + ", isWritable=" + ((d == null || (parentFile = d.getParentFile()) == null) ? null : Boolean.valueOf(parentFile.canWrite())) + ", isFile=" + (d != null ? Boolean.valueOf(d.isFile()) : null), null);
        return t75.c(thrVar);
    }

    @Override // defpackage.uhr
    public final String b() {
        return this.b.c().a;
    }

    @Override // defpackage.uhr
    public final thr c() {
        Context context = this.c.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("Yandex_Music", 0);
        thr thrVar = thr.c;
        int i = sharedPreferences.getInt("save_path_position", 0);
        thr thrVar2 = (i == 1 || i == 2) ? thr.d : thrVar;
        thr thrVar3 = thr.d;
        if (thrVar2 == thrVar3) {
            File d = d(thrVar3);
            if (!(d != null ? d.exists() : false)) {
                context.getSharedPreferences("Yandex_Music", 0).edit().putInt("save_path_position", 0).apply();
                int i2 = context.getSharedPreferences("Yandex_Music", 0).getInt("save_path_position", 0);
                return (i2 == 1 || i2 == 2) ? thrVar3 : thrVar;
            }
        }
        return thrVar2;
    }

    @Override // defpackage.uhr
    public final File d(thr thrVar) {
        gos gosVar = gos.i;
        thrVar.getClass();
        int ordinal = thrVar.ordinal();
        Context context = this.a;
        if (ordinal != 0) {
            if (ordinal != 1) {
                b6e.s();
                return null;
            }
            File w = gosVar.w(context);
            if (w != null) {
                return new File(ouj.n(w.getAbsolutePath(), File.separator));
            }
            return null;
        }
        File u = gosVar.u(context);
        if (u != null) {
            return new File(ouj.n(u.getAbsolutePath(), File.separator));
        }
        File file = new File(ouj.n(context.getFilesDir().getAbsolutePath(), File.separator));
        ssg.a(7, "StorageRootResolverImpl", "primaryStorageRoot is null, fallback to internalFilesDir internalFilesDirPath=" + file + ", isDirectory=" + file.isDirectory() + ", isWritable=" + file.canWrite(), null);
        return file;
    }

    public final ArrayList f() {
        thr.a.getClass();
        List list = thr.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            File d = d((thr) obj);
            if (d != null ? d.exists() : false) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
