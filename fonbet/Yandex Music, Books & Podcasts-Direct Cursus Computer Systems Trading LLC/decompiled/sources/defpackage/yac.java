package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public class yac {
    public static final int a(String str) {
        int S;
        char c = File.separatorChar;
        int S2 = StringsKt.S(str, c, 0, 4);
        if (S2 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c || (S = StringsKt.S(str, c, 2, 4)) < 0) {
                return 1;
            }
            int S3 = StringsKt.S(str, c, S + 1, 4);
            return S3 >= 0 ? S3 + 1 : str.length();
        }
        if (S2 > 0 && str.charAt(S2 - 1) == ':') {
            return S2 + 1;
        }
        if (S2 == -1 && StringsKt.O(str, ':')) {
            return str.length();
        }
        return 0;
    }

    public static final fac b(File file) {
        List list;
        String path = file.getPath();
        path.getClass();
        int a = a(path);
        String substring = path.substring(0, a);
        String substring2 = path.substring(a);
        if (substring2.length() == 0) {
            list = c5b.a;
        } else {
            List e0 = StringsKt.e0(substring2, new char[]{File.separatorChar}, 6);
            ArrayList arrayList = new ArrayList(v75.o(e0, 10));
            Iterator it = e0.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            list = arrayList;
        }
        return new fac(new File(substring), list);
    }
}
