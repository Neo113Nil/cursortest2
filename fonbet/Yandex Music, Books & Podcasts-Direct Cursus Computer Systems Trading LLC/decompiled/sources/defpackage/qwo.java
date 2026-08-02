package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class qwo implements vzj {
    public final int a;
    public final List b;
    public Float c = null;
    public Float d = null;
    public cwo e = null;
    public cwo f = null;

    public qwo(ArrayList arrayList, int i) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // defpackage.vzj
    public final boolean U() {
        return this.b.contains(this);
    }
}
