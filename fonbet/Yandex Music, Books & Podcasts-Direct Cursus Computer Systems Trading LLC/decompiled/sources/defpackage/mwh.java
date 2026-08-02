package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class mwh implements ewh {
    public final gch a;
    public int d;
    public boolean e;
    public final ArrayList c = new ArrayList();
    public final Object b = new Object();

    public mwh(wvh wvhVar, boolean z) {
        this.a = new gch(wvhVar, z);
    }

    @Override // defpackage.ewh
    public final sis a() {
        return this.a.o;
    }

    @Override // defpackage.ewh
    public final Object getUid() {
        return this.b;
    }
}
