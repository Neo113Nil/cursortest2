package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class n8j implements zlq {
    public final nsh a;
    public final CopyOnWriteArrayList b;
    public final CopyOnWriteArraySet c;
    public volatile String d;
    public volatile boolean e;
    public volatile int f;
    public volatile String g;
    public volatile String h;
    public String i;

    public n8j(List list, nsh nshVar) {
        list.getClass();
        this.a = nshVar;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(list);
        this.b = copyOnWriteArrayList;
        this.c = new CopyOnWriteArraySet();
        Object Y = CollectionsKt.Y(copyOnWriteArrayList);
        Y.getClass();
        this.d = (String) Y;
        this.e = copyOnWriteArrayList.size() == 1;
        this.g = (String) CollectionsKt.Q(copyOnWriteArrayList);
    }

    @Override // defpackage.zlq
    public final void a(lu2 lu2Var) {
        this.c.remove(lu2Var.a);
    }

    @Override // defpackage.zlq
    public final String b() {
        String str = this.i;
        if (str == null || !str.equals(this.g)) {
            this.i = this.g;
        }
        String str2 = this.h;
        String str3 = this.g;
        if (str2 == null) {
            str3.getClass();
            return str3;
        }
        StringBuilder k = dfi.k(str3);
        k.append(this.h);
        return k.toString();
    }

    @Override // defpackage.zlq
    public final void c(String str) {
        this.h = str;
    }

    @Override // defpackage.zlq
    public final void d(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Intrinsics.d(this.b, arrayList);
        this.b.clear();
        this.b.addAll(arrayList);
        String str = (String) CollectionsKt.Y(arrayList);
        if (!Intrinsics.d(this.d, str)) {
            this.d = str;
            this.f = 0;
        }
        if (arrayList.contains(this.g)) {
            return;
        }
        g();
    }

    @Override // defpackage.zlq
    public final boolean e() {
        if (!this.e) {
            this.c.add(this.g);
            nsh nshVar = this.a;
            String str = this.g;
            str.getClass();
            lu2 lu2Var = new lu2(str);
            c43 c43Var = (c43) nshVar.c;
            x97.y(c43Var.a, null, null, new a43(c43Var, lu2Var, null), 3);
        }
        return g();
    }

    @Override // defpackage.zlq
    public final int f() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!this.c.contains((String) next)) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() == 1 && Intrinsics.d(CollectionsKt.Q(arrayList), this.d) && this.f >= 3) {
            return 0;
        }
        return Math.min((arrayList.size() + 3) - this.f, this.b.size());
    }

    public final boolean g() {
        ArrayList arrayList = new ArrayList(this.b);
        Iterator it = arrayList.iterator();
        String str = null;
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                u75.n();
                throw null;
            }
            String str2 = (String) next;
            if (!this.c.contains(str2) && i < arrayList.size() - 1 && str == null) {
                str = str2;
            }
            i = i2;
        }
        if (str != null) {
            this.e = false;
            this.g = str;
            this.f = 0;
            return true;
        }
        this.e = true;
        this.f++;
        if (this.f >= 3) {
            return false;
        }
        this.g = this.d;
        return true;
    }
}
