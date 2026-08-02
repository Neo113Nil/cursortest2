package com.anythink.core.common.h;

import com.anythink.core.common.h.bz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    protected List<c> f14758a;

    /* renamed from: b, reason: collision with root package name */
    protected c f14759b;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f14760c;

    public final c a() {
        List<c> list = this.f14758a;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.f14758a.get(0);
    }

    public final c b() {
        List<c> list = this.f14758a;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.f14758a.get(r0.size() - 1);
    }

    public final boolean c() {
        return this.f14760c;
    }

    public final int d() {
        List<c> list = this.f14758a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final c e() {
        return this.f14759b;
    }

    public final List<bz.a> f() {
        List<c> list = this.f14758a;
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<c> it = this.f14758a.iterator();
        while (it.hasNext()) {
            bv unitGroupInfo = it.next().e().getUnitGroupInfo();
            arrayList.add(new bz.a(unitGroupInfo, unitGroupInfo.R()));
        }
        return arrayList;
    }
}
