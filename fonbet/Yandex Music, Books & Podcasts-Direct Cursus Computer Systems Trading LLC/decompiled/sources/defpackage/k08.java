package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class k08 {
    public static String a;
    public static final ArrayList b = new ArrayList();
    public static j08 c = new j08();

    public static final void a(String str) {
        a = str;
        ArrayList arrayList = b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((r08) it.next()).getClass();
            t08.c = str;
        }
        arrayList.clear();
        c = null;
    }
}
