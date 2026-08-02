package com.anythink.core.common.f;

import android.content.Context;
import com.anythink.core.common.e.e;
import com.anythink.core.common.e.n;
import com.anythink.core.common.h.be;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    n f13956a;

    /* renamed from: b, reason: collision with root package name */
    protected int f13957b;

    public a(Context context) {
        this.f13956a = n.a(e.a(context));
    }

    public final void a(String str, int i, int i4) {
        this.f13956a.a(this.f13957b, str, i, i4);
    }

    public final void a(String str, long j6) {
        this.f13956a.a(this.f13957b, str, j6);
    }

    public final void a(String str, String str2) {
        this.f13956a.a(str, this.f13957b, str2);
    }

    private List<be> a() {
        return this.f13956a.a(this.f13957b);
    }

    public final List<be> a(List<String> list) {
        return this.f13956a.a(list, this.f13957b);
    }
}
