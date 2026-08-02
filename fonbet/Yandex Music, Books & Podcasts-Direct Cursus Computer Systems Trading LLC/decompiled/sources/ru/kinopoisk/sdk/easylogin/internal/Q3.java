package ru.kinopoisk.sdk.easylogin.internal;

import java.util.List;
import java.util.ListIterator;
import ru.kinopoisk.sdk.easylogin.R;

/* loaded from: classes5.dex */
public final class Q3 {
    public static androidx.fragment.app.o a(T t) {
        Object obj;
        int i = R.id.fragment_container;
        t.getClass();
        androidx.fragment.app.y supportFragmentManager = t.getSupportFragmentManager();
        supportFragmentManager.getClass();
        supportFragmentManager.getClass();
        List f = supportFragmentManager.c.f();
        f.getClass();
        ListIterator listIterator = f.listIterator(f.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            androidx.fragment.app.o oVar = (androidx.fragment.app.o) obj;
            if (oVar != null && oVar.getId() == i && oVar.isVisible()) {
                break;
            }
        }
        return (androidx.fragment.app.o) obj;
    }
}
