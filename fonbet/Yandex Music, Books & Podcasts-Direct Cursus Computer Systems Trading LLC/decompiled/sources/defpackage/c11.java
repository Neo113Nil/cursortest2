package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class c11 {
    public ArrayList a;
    public int b;

    public c11(int i) {
        switch (i) {
            case 4:
                this.a = new ArrayList();
                this.b = 128;
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    public Long a() {
        ArrayList arrayList = this.a;
        boolean isEmpty = arrayList.isEmpty();
        int i = this.b;
        return isEmpty ? i > 0 ? 1L : null : (Long) arrayList.get(Math.min(i / 50, arrayList.size() - 1));
    }

    public boolean b() {
        return this.b < this.a.size();
    }

    public pjc c(kkp kkpVar) {
        int i = this.b;
        ArrayList arrayList = this.a;
        if (i < arrayList.size()) {
            return ((gp0) arrayList.get(i)).a(kkpVar, new c11(arrayList, i + 1));
        }
        xq0.q("Check failed.");
        return null;
    }

    public /* synthetic */ c11(ArrayList arrayList, int i) {
        this.a = arrayList;
        this.b = i;
    }
}
