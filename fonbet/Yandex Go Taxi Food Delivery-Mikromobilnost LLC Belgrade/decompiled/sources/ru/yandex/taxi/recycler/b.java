package ru.yandex.taxi.recycler;

import android.graphics.Rect;
import defpackage.cnt0;
import defpackage.oe7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import ru.yandex.taxi.recycler.SpannedGridLayoutManager;

/* loaded from: classes6.dex */
public final class b {
    public final SpannedGridLayoutManager a;
    public final SpannedGridLayoutManager.Orientation b;
    public final oe7 c = new oe7(8, this);
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashMap e = new LinkedHashMap();
    public final ArrayList f = new ArrayList();

    public b(SpannedGridLayoutManager spannedGridLayoutManager, SpannedGridLayoutManager.Orientation orientation) {
        this.a = spannedGridLayoutManager;
        this.b = orientation;
        d();
    }

    public static boolean c(Rect rect, Rect rect2) {
        return rect.right == rect2.left || rect.top == rect2.bottom || rect.left == rect2.right || rect.bottom == rect2.top;
    }

    public final Rect a(cnt0 cnt0Var) {
        Object obj;
        Iterator it = this.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Rect rect = (Rect) obj;
            int i = rect.left;
            int i2 = rect.top;
            if (rect.contains(new Rect(i, i2, cnt0Var.b + i, cnt0Var.c + i2))) {
                break;
            }
        }
        Rect rect2 = (Rect) obj;
        if (rect2 == null) {
            return null;
        }
        int i3 = rect2.left;
        int i4 = rect2.top;
        return new Rect(i3, i4, cnt0Var.b + i3, cnt0Var.c + i4);
    }

    public final int b() {
        SpannedGridLayoutManager.Orientation orientation = SpannedGridLayoutManager.Orientation.VERTICAL;
        SpannedGridLayoutManager.Orientation orientation2 = this.b;
        ArrayList arrayList = this.f;
        return orientation2 == orientation ? ((Rect) kotlin.collections.a.Z(arrayList)).top : ((Rect) kotlin.collections.a.Z(arrayList)).left;
    }

    public final void d() {
        this.d.clear();
        this.e.clear();
        ArrayList arrayList = this.f;
        arrayList.clear();
        SpannedGridLayoutManager.Orientation orientation = this.b;
        SpannedGridLayoutManager.Orientation orientation2 = SpannedGridLayoutManager.Orientation.VERTICAL;
        SpannedGridLayoutManager spannedGridLayoutManager = this.a;
        arrayList.add(orientation == orientation2 ? new Rect(0, 0, spannedGridLayoutManager.V, Integer.MAX_VALUE) : new Rect(0, 0, Integer.MAX_VALUE, spannedGridLayoutManager.V));
    }
}
