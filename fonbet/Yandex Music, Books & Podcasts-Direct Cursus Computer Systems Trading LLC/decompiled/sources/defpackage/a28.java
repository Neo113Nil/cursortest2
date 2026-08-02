package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.i;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.yandex.music.main.MainScreenActivity;

/* loaded from: classes4.dex */
public abstract class a28 {
    public static final HashSet a = new HashSet();

    public static boolean a(Context context) {
        y supportFragmentManager;
        List list = null;
        Activity R = context != null ? vq2.R(context) : null;
        jb6 jb6Var = R instanceof jb6 ? (jb6) R : null;
        if (jb6Var != null && ((MainScreenActivity) jb6Var).E0) {
            CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
            return true;
        }
        if (!a.isEmpty()) {
            CopyOnWriteArrayList copyOnWriteArrayList2 = ssg.a;
            return true;
        }
        t tVar = R instanceof t ? (t) R : null;
        if (tVar != null && (supportFragmentManager = tVar.getSupportFragmentManager()) != null) {
            list = supportFragmentManager.c.f();
        }
        if (list == null) {
            return false;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((o) it.next()) instanceof i) {
                CopyOnWriteArrayList copyOnWriteArrayList3 = ssg.a;
                return true;
            }
        }
        return false;
    }

    public static void b(i iVar) {
        String canonicalName = iVar.getClass().getCanonicalName();
        if (canonicalName == null) {
            return;
        }
        a.add(canonicalName);
    }

    public static void c(i iVar) {
        String canonicalName = iVar.getClass().getCanonicalName();
        if (canonicalName == null) {
            return;
        }
        a.remove(canonicalName);
    }
}
