package com.gamericefishpro.space.r5;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public List j;
    public boolean k;

    public final void a(View view) {
        if (this.j.size() <= 0) {
            this.d = -1;
        } else {
            ((m0) this.j.get(0)).getClass();
            throw null;
        }
    }

    public final View b(com.gamericefishpro.space.bb.a aVar) {
        List list = this.j;
        if (list == null) {
            View viewF = aVar.f(this.d);
            this.d += this.e;
            return viewF;
        }
        if (list.size() <= 0) {
            return null;
        }
        ((m0) this.j.get(0)).getClass();
        throw null;
    }
}
