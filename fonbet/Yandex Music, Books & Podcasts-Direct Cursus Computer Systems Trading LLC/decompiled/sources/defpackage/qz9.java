package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class qz9 {
    public final m0a a;

    public qz9(m0a m0aVar) {
        this.a = m0aVar;
    }

    public static pz9 a(dp8 dp8Var, String str, xzb xzbVar) {
        pz9 a;
        if (dp8Var instanceof pz9) {
            pz9 pz9Var = (pz9) dp8Var;
            if (Intrinsics.d(pz9Var.t, str)) {
                return pz9Var;
            }
            return null;
        }
        if (dp8Var instanceof s09) {
            s09 s09Var = (s09) dp8Var;
            for (k79 k79Var : qwp.x(s09Var.u, s09Var.s, xzbVar)) {
                pz9 a2 = a(k79Var.a.d(), str, k79Var.b);
                if (a2 != null) {
                    return a2;
                }
            }
            return null;
        }
        if (dp8Var instanceof jt8) {
            jt8 jt8Var = (jt8) dp8Var;
            for (k79 k79Var2 : qwp.x(jt8Var.B, jt8Var.z, xzbVar)) {
                pz9 a3 = a(k79Var2.a.d(), str, k79Var2.b);
                if (a3 != null) {
                    return a3;
                }
            }
            return null;
        }
        if (dp8Var instanceof w19) {
            Iterable iterable = ((w19) dp8Var).y;
            if (iterable == null) {
                iterable = c5b.a;
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                pz9 a4 = a(((jc8) it.next()).d(), str, xzbVar);
                if (a4 != null) {
                    return a4;
                }
            }
            return null;
        }
        if (dp8Var instanceof eb9) {
            eb9 eb9Var = (eb9) dp8Var;
            for (k79 k79Var3 : qwp.x(eb9Var.t, eb9Var.r, xzbVar)) {
                pz9 a5 = a(k79Var3.a.d(), str, k79Var3.b);
                if (a5 != null) {
                    return a5;
                }
            }
            return null;
        }
        if (dp8Var instanceof vo9) {
            Iterator it2 = ((vo9) dp8Var).q.iterator();
            while (it2.hasNext()) {
                pz9 a6 = a(((ro9) it2.next()).a.d(), str, xzbVar);
                if (a6 != null) {
                    return a6;
                }
            }
            return null;
        }
        if (dp8Var instanceof yu8) {
            List list = ((yu8) dp8Var).q;
            if (list == null) {
                return null;
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                pz9 a7 = a(((jc8) it3.next()).d(), str, xzbVar);
                if (a7 != null) {
                    return a7;
                }
            }
            return null;
        }
        if (!(dp8Var instanceof dm9)) {
            return null;
        }
        Iterator it4 = ((dm9) dp8Var).I.iterator();
        while (it4.hasNext()) {
            jc8 jc8Var = ((cm9) it4.next()).c;
            if (jc8Var != null && (a = a(jc8Var.d(), str, xzbVar)) != null) {
                return a;
            }
        }
        return null;
    }

    public final boolean b(gc8 gc8Var, String str, String str2, xzb xzbVar) {
        pz9 pz9Var;
        rv8 divData = gc8Var.getDivData();
        if (divData == null) {
            return false;
        }
        Iterator it = divData.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                pz9Var = null;
                break;
            }
            pz9Var = a(((qv8) it.next()).a.d(), str, xzbVar);
            if (pz9Var != null) {
                break;
            }
        }
        if (pz9Var == null) {
            return false;
        }
        Set entrySet = this.a.a.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entrySet) {
            Map.Entry entry = (Map.Entry) obj;
            if (Intrinsics.d(entry.getValue(), pz9Var) || Intrinsics.d(((pz9) entry.getValue()).t, pz9Var.t)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            af9 playerView = ((l0a) ((Map.Entry) it2.next()).getKey()).getPlayerView();
            se9 attachedPlayer = playerView != null ? playerView.getAttachedPlayer() : null;
            if (attachedPlayer != null) {
                arrayList2.add(attachedPlayer);
            }
        }
        se9 se9Var = (se9) CollectionsKt.firstOrNull(arrayList2);
        if (se9Var == null) {
            return false;
        }
        if (str2.equals("start")) {
            se9Var.d();
            return true;
        }
        if (!str2.equals("pause")) {
            return false;
        }
        se9Var.b();
        return true;
    }
}
