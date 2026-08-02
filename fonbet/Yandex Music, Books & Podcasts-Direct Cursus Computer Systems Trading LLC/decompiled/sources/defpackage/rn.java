package defpackage;

import android.view.View;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class rn implements ogu {
    public final pgu a;
    public final lkk b;
    public final feu c;
    public final xy0 d = new xy0(0);

    public rn(pgu pguVar, lkk lkkVar, feu feuVar) {
        this.a = pguVar;
        this.b = lkkVar;
        this.c = feuVar;
    }

    @Override // defpackage.ogu
    public final View a(String str) {
        qn qnVar;
        synchronized (this.d) {
            Object obj = this.d.get(str);
            if (obj == null) {
                throw new NoSuchElementException("Factory is not registered");
            }
            qnVar = (qn) obj;
        }
        return qnVar.a();
    }

    @Override // defpackage.ogu
    public final void b(String str, ieu ieuVar, int i) {
        synchronized (this.d) {
            if (this.d.containsKey(str)) {
                return;
            }
            this.d.put(str, new qn(str, this.a, this.b, ieuVar, this.c, i));
        }
    }
}
