package I0;

import android.os.Build;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class c implements d {

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f1253c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f1254a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1255b;

    public c(String str, String str2) {
        this.f1254a = str;
        this.f1255b = str2;
        f1253c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f1251a;
        String str = this.f1255b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        return ("eng".equals(str2) || "userdebug".equals(str2)) && hashSet.contains(str.concat(":dev"));
    }
}
