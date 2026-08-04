package com.gamericefishpro.space.m6;

import android.text.TextUtils;
import com.gamericefishpro.space.l6.q;
import com.gamericefishpro.space.l6.s;
import com.gamericefishpro.space.l6.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends com.gamericefishpro.space.hj.c {
    public static final String j = q.d("WorkContinuationImpl");
    public final o c;
    public final String d;
    public final List e;
    public final ArrayList f;
    public final ArrayList g = new ArrayList();
    public boolean h;
    public com.gamericefishpro.space.u6.c i;

    public k(o oVar, String str, List list) {
        this.c = oVar;
        this.d = str;
        this.e = list;
        this.f = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            String string = ((s) list.get(i)).a.toString();
            Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
            this.f.add(string);
            this.g.add(string);
        }
    }

    public static HashSet e0(k kVar) {
        HashSet hashSet = new HashSet();
        kVar.getClass();
        return hashSet;
    }

    public final w d0() {
        if (this.h) {
            q.c().e(j, "Already enqueued work ids (" + TextUtils.join(", ", this.f) + ")");
        } else {
            com.gamericefishpro.space.v6.c cVar = new com.gamericefishpro.space.v6.c(this);
            this.c.d.a(cVar);
            this.i = cVar.e;
        }
        return this.i;
    }
}
