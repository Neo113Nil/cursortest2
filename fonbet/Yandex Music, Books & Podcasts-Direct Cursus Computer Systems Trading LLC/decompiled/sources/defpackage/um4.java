package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class um4 {
    public final pgp a;
    public final ArrayList b = new ArrayList();

    public um4(pgp pgpVar) {
        this.a = pgpVar;
    }

    public final void a(um4 um4Var) {
        String l = um4Var.l();
        if (l.length() > 0) {
            i(l, um4Var.k());
        }
    }

    public final void b(String str, String str2) {
        str2.getClass();
        i(str.concat(" = ?"), t75.c(str2));
    }

    public final void c(String str, boolean z) {
        i(str.concat(" = ?"), t75.c(Integer.valueOf(z ? 1 : 0)));
    }

    public final void d(String str) {
        str.getClass();
        i("artist_id LIKE ? || '#|%' OR artist_id LIKE '%#|,' || ? || '#|%'", u75.h(str, str));
    }

    public final void e(String str, Collection collection) {
        collection.getClass();
        i(k5r.m(str, " IN (", CollectionsKt.X(collection, StringUtils.COMMA, null, null, new sm4(0), 30), ")"), collection);
    }

    public final void f(String str, String str2) {
        i(str.concat(" != ?"), t75.c(str2));
    }

    public final void g(String str, Collection collection) {
        collection.getClass();
        i(k5r.m(str, " NOT IN (", CollectionsKt.X(collection, StringUtils.COMMA, null, null, new sm4(3), 30), ")"), collection);
    }

    public final void h(String str, vhn vhnVar) {
        vhnVar.getClass();
        if (vhnVar instanceof uhn) {
            Collection collection = ((uhn) vhnVar).a;
            i(k5r.m(str, " IN (", CollectionsKt.X(collection, StringUtils.COMMA, null, null, new sm4(1), 30), ")"), collection);
        } else if (!(vhnVar instanceof thn)) {
            b6e.s();
        } else {
            Collection collection2 = ((thn) vhnVar).a;
            i(k5r.m(str, " NOT IN (", CollectionsKt.X(collection2, StringUtils.COMMA, null, null, new sm4(2), 30), ")"), collection2);
        }
    }

    public final void i(String str, Collection collection) {
        pgp pgpVar = pgp.c;
        ArrayList arrayList = this.b;
        pgp pgpVar2 = this.a;
        if (pgpVar2 == pgpVar && !arrayList.isEmpty()) {
            xq0.x("Cannot add clause with separator = Single");
        } else if (pgpVar2 != pgp.d || collection.isEmpty()) {
            arrayList.add(new tm4(str, collection));
        } else {
            xq0.x("Cannot add args with separator = Comma");
        }
    }

    public final Object[] j() {
        return k().toArray(new Object[0]);
    }

    public final ArrayList k() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            z75.t(arrayList, ((tm4) it.next()).b);
        }
        return arrayList;
    }

    public final String l() {
        String str;
        int ordinal = this.a.ordinal();
        ArrayList arrayList = this.b;
        if (ordinal == 0) {
            str = " AND ";
        } else if (ordinal == 1) {
            str = " OR ";
        } else {
            if (ordinal == 2) {
                tm4 tm4Var = (tm4) CollectionsKt.firstOrNull(arrayList);
                String str2 = tm4Var != null ? tm4Var.a : null;
                return str2 == null ? "" : str2;
            }
            if (ordinal != 3) {
                b6e.s();
                return null;
            }
            str = ", ";
        }
        return CollectionsKt.X(arrayList, str, null, null, new v5(19, this), 30);
    }
}
