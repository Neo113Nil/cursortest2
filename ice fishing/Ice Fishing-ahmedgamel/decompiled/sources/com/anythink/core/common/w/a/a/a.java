package com.anythink.core.common.w.a.a;

import com.anythink.core.common.h.ai;
import com.anythink.core.common.h.aj;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.w.a.a;
import java.util.List;

/* loaded from: classes.dex */
public class a implements com.anythink.core.common.w.a.b.c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17768a = "a";

    /* renamed from: b, reason: collision with root package name */
    private ai f17769b;

    @Override // com.anythink.core.common.w.a.b.c
    public final void a(ai aiVar) {
        this.f17769b = aiVar;
    }

    @Override // com.anythink.core.common.w.a.b.b
    public final void b() {
        this.f17769b = null;
    }

    @Override // com.anythink.core.common.w.a.b.c
    public final ai a() {
        return this.f17769b;
    }

    @Override // com.anythink.core.common.w.a.b.c
    public final aj a(bv bvVar) {
        ai aiVar = this.f17769b;
        if (aiVar == null || bvVar == null) {
            return null;
        }
        List<aj> d9 = aiVar.d();
        List<aj> f2 = this.f17769b.f();
        aj a9 = a(bvVar.z(), d9);
        return (a9 == null && this.f17769b.b()) ? a(bvVar.z(), f2) : a9;
    }

    private static aj a(String str, List<aj> list) {
        if (list != null && !list.isEmpty()) {
            for (aj ajVar : list) {
                if (str.equals(ajVar.c())) {
                    if (ajVar.d() != a.C0103a.f17767b || System.currentTimeMillis() <= ajVar.a()) {
                        return ajVar;
                    }
                    return null;
                }
            }
        }
        return null;
    }
}
