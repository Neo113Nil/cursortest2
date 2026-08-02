package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import timber.log.Timber;

/* loaded from: classes4.dex */
public abstract class ssg {
    public static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static final void a(int i, String str, String str2, Throwable th) {
        Timber.Tree tree;
        str2.getClass();
        if (str == null || (tree = Timber.INSTANCE.tag(str)) == null) {
            tree = Timber.INSTANCE;
        }
        tree.log(i, th, str2, new Object[0]);
        CopyOnWriteArrayList copyOnWriteArrayList = a;
        if (copyOnWriteArrayList.size() == 0) {
            return;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((Timber.Tree) it.next()).log(i, th, str2, new Object[0]);
        }
    }
}
