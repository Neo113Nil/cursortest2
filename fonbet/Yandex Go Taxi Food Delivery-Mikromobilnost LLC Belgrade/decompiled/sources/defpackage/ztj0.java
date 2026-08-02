package defpackage;

import android.os.Build;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class ztj0 {
    public static final /* synthetic */ int a = 0;

    static {
        String[] strArr = Build.SUPPORTED_ABIS;
    }

    public static void a(String str, HashSet hashSet) {
        File file = new File(str);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            File file2 = new File(file, (String) it.next());
            if (file2.exists()) {
                file2.delete();
            }
        }
        String[] list = file.list(new ytj0());
        if (list == null) {
            return;
        }
        for (String str2 : list) {
            new File(file, str2).delete();
        }
    }
}
