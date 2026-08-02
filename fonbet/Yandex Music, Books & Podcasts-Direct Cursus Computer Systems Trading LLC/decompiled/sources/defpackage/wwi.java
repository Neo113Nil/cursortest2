package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class wwi {
    public TreeSet a;
    public final /* synthetic */ int b;

    public /* synthetic */ wwi(int i) {
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f A[Catch: all -> 0x000f, TryCatch #1 {all -> 0x000f, all -> 0x0024, blocks: (B:35:0x0004, B:37:0x0008, B:8:0x002b, B:10:0x002f, B:15:0x0035, B:16:0x0037, B:18:0x003b, B:20:0x0049, B:23:0x005d, B:26:0x005a, B:4:0x0011, B:7:0x0029, B:33:0x0025, B:30:0x001f), top: B:34:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b A[Catch: all -> 0x000f, TryCatch #1 {all -> 0x000f, all -> 0x0024, blocks: (B:35:0x0004, B:37:0x0008, B:8:0x002b, B:10:0x002f, B:15:0x0035, B:16:0x0037, B:18:0x003b, B:20:0x0049, B:23:0x005d, B:26:0x005a, B:4:0x0011, B:7:0x0029, B:33:0x0025, B:30:0x001f), top: B:34:0x0004 }] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(boolean z) {
        TreeSet treeSet;
        TreeSet treeSet2;
        TreeSet f;
        if (!z) {
            try {
                treeSet = this.a;
            } catch (Throwable th) {
                bp6.a(xwi.class, th);
            } finally {
            }
            if (treeSet != null) {
                if (treeSet.isEmpty()) {
                }
                treeSet2 = this.a;
                if (treeSet2 != null || treeSet2.isEmpty()) {
                    switch (this.b) {
                        case 3:
                            if (j3c.b().getApplicationInfo().targetSdkVersion >= 30) {
                                ArrayList arrayList = xwi.a;
                                Log.w(bp6.a.contains(xwi.class) ? null : "xwi", "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
                                break;
                            }
                            break;
                    }
                }
            }
        }
        xwi xwiVar = xwi.d;
        if (!bp6.a.contains(xwi.class)) {
            f = xwiVar.f(this);
            this.a = f;
            treeSet2 = this.a;
            if (treeSet2 != null) {
            }
            switch (this.b) {
            }
        }
        f = null;
        this.a = f;
        treeSet2 = this.a;
        if (treeSet2 != null) {
        }
        switch (this.b) {
        }
    }

    public final String b() {
        switch (this.b) {
            case 0:
                return "com.facebook.arstudio.player";
            case 1:
                return "com.facebook.lite";
            case 2:
                return "com.instagram.android";
            case 3:
                return "com.facebook.katana";
            case 4:
                return "com.facebook.orca";
            default:
                return "com.facebook.wakizashi";
        }
    }

    public final void c() {
    }
}
