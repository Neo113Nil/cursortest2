package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes3.dex */
public final class h4j implements m7i {
    public final jyr a = l18.b.b(hag.I(j14.class), true);

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.m7i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(uvn uvnVar, boolean z, Continuation continuation) {
        g4j g4jVar;
        int i;
        rj6 rj6Var;
        String str;
        if (continuation instanceof g4j) {
            g4jVar = (g4j) continuation;
            int i2 = g4jVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g4jVar.l = i2 - Integer.MIN_VALUE;
                Object obj = g4jVar.j;
                nm6 nm6Var = nm6.a;
                i = g4jVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    j14 j14Var = (j14) this.a.getValue();
                    g4jVar.l = 1;
                    obj = j14Var.a(uvnVar, z, g4jVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (rj6Var instanceof pj6) {
                        return rj6Var;
                    }
                    b6e.s();
                    return null;
                }
                ArrayList arrayList = ((r14) ((qj6) rj6Var).a).a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (obj2 instanceof e6i) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    e6i e6iVar = (e6i) it.next();
                    e6iVar.getClass();
                    String str2 = e6iVar.a;
                    String str3 = e6iVar.b;
                    String str4 = e6iVar.c;
                    u9b u9bVar = e6iVar.d;
                    d85 d85Var = null;
                    String e = u9bVar != null ? u9bVar.e(wct.s(), WebPath$Storage.AVATARS) : null;
                    if (e == null) {
                        e = "";
                    }
                    if (u9bVar != null && (str = u9bVar.b) != null) {
                        d85Var = pd.T(str);
                    }
                    arrayList3.add(new b8i(new d6i(str2, str3, str4, e, d85Var)));
                }
                return new qj6(arrayList3);
            }
        }
        g4jVar = new g4j(this, (cg6) continuation);
        Object obj3 = g4jVar.j;
        nm6 nm6Var2 = nm6.a;
        i = g4jVar.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj3;
        if (rj6Var instanceof qj6) {
        }
    }
}
