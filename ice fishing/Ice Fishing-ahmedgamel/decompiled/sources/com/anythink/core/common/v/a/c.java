package com.anythink.core.common.v.a;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.anythink.core.common.v.a.f;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f16562a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f16563b = 2;

    /* renamed from: c, reason: collision with root package name */
    private final f f16564c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<View, b> f16565d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<View, d<b>> f16566e;

    /* renamed from: f, reason: collision with root package name */
    private final f.b f16567f;

    /* renamed from: g, reason: collision with root package name */
    private f.d f16568g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(int i) {
        this(r0, r1, r2, r3);
        WeakHashMap weakHashMap = new WeakHashMap();
        WeakHashMap weakHashMap2 = new WeakHashMap();
        f.b bVar = new f.b(i);
        f fVar = new f(i);
        new Handler(Looper.getMainLooper());
    }

    @Deprecated
    private f.d c() {
        return this.f16568g;
    }

    public final void b() {
        a();
        this.f16564c.b();
        this.f16568g = null;
    }

    public final void a(View view, b bVar) {
        if (this.f16565d.get(view) == bVar) {
            return;
        }
        a(view);
        if (bVar.isImpressionRecorded()) {
            return;
        }
        this.f16565d.put(view, bVar);
        f fVar = this.f16564c;
        int impressionMinPercentageViewed = bVar.getImpressionMinPercentageViewed();
        fVar.a(view, view, impressionMinPercentageViewed, impressionMinPercentageViewed, bVar.getImpressionMinVisiblePx());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(int i, int i6) {
        this(r0, r1, r2, r3);
        WeakHashMap weakHashMap = new WeakHashMap();
        WeakHashMap weakHashMap2 = new WeakHashMap();
        f.b bVar = new f.b(i);
        f fVar = new f(i6, i);
        new Handler(Looper.getMainLooper());
    }

    private void b(View view) {
        this.f16566e.remove(view);
    }

    private c(Map<View, b> map, Map<View, d<b>> map2, f.b bVar, f fVar) {
        this.f16565d = map;
        this.f16566e = map2;
        this.f16567f = bVar;
        this.f16564c = fVar;
        f.d dVar = new f.d() { // from class: com.anythink.core.common.v.a.c.1
            @Override // com.anythink.core.common.v.a.f.d
            public final void a(List<View> list) {
                for (View view : list) {
                    b bVar2 = (b) c.this.f16565d.get(view);
                    if (bVar2 == null) {
                        c.this.a(view);
                    } else {
                        bVar2.recordImpression(view);
                        bVar2.setImpressionRecorded();
                    }
                }
            }
        };
        this.f16568g = dVar;
        fVar.a(dVar);
    }

    public final void a(View view) {
        this.f16565d.remove(view);
        b(view);
        this.f16564c.a(view);
    }

    public final void a() {
        this.f16565d.clear();
        this.f16566e.clear();
        this.f16564c.a();
    }
}
