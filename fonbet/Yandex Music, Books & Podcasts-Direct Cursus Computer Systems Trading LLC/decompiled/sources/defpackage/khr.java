package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.File;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class khr {
    public static final String c = "music" + File.separator;
    public final Context a;
    public xxq b = null;

    public khr(Context context) {
        this.a = context;
    }

    public final String a(thr thrVar) {
        gos gosVar = gos.i;
        int ordinal = thrVar.ordinal();
        Context context = this.a;
        if (ordinal != 0) {
            if (ordinal != 1) {
                b6e.u(this, "no value: ");
                return null;
            }
            File w = gosVar.w(context);
            if (w == null) {
                return null;
            }
            return w.getAbsolutePath() + File.separator;
        }
        File u = gosVar.u(context);
        if (u != null) {
            return u.getAbsolutePath() + File.separator;
        }
        Timber.wtf("storageRoot is null, fallback to internalFilesDir", new Object[0]);
        return context.getFilesDir().getAbsolutePath() + File.separator;
    }

    public final synchronized thr b() {
        thr thrVar;
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("Yandex_Music", 0);
        thrVar = thr.c;
        int i = sharedPreferences.getInt("save_path_position", 0);
        if (i == 1 || i == 2) {
            thrVar = thr.d;
        }
        return thrVar;
    }

    public final void c(thr thrVar) {
        String str;
        String a = a(thrVar);
        String str2 = null;
        if (a != null) {
            xxq xxqVar = this.b;
            String str3 = xxqVar != null ? xxqVar.a : null;
            StringBuilder sb = new StringBuilder("user_");
            if (str3 == null) {
                str3 = CommonUrlParts.Values.FALSE_INTEGER;
            }
            sb.append(str3);
            sb.append(File.separator);
            str = a.concat(sb.toString());
        } else {
            str = null;
        }
        if (str != null) {
            StringBuilder k = dfi.k(str);
            k.append(c);
            str2 = k.toString();
        }
        if (str2 != null) {
            File file = new File(str2);
            if (file.mkdirs() || file.isDirectory()) {
                return;
            }
            Timber.wtf("mkdirs failed - initFolders", new Object[0]);
        }
    }
}
