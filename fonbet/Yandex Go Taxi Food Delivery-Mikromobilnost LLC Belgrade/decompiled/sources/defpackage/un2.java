package defpackage;

import android.os.Build;
import java.util.HashSet;

/* loaded from: classes10.dex */
public class un2 {
    public static final HashSet d = new HashSet();
    public final String a;
    public final String b;
    public final /* synthetic */ int c;

    public un2(String str, String str2, int i) {
        this.c = i;
        this.a = str;
        this.b = str2;
        d.add(this);
    }

    public boolean a() {
        HashSet hashSet = tn2.a;
        String str = this.b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (!"eng".equals(str2) && !"userdebug".equals(str2)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":dev");
        return hashSet.contains(sb.toString());
    }
}
