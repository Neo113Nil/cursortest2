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
    public static final int f17349a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f17350b = 2;

    /* renamed from: c, reason: collision with root package name */
    private final f f17351c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<View, b> f17352d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<View, d<b>> f17353e;

    /* renamed from: f, reason: collision with root package name */
    private final f.b f17354f;

    /* renamed from: g, reason: collision with root package name */
    private f.d f17355g;

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
        return this.f17355g;
    }

    public final void b() {
        a();
        this.f17351c.b();
        this.f17355g = null;
    }

    public final void a(View view, b bVar) {
        if (this.f17352d.get(view) == bVar) {
            return;
        }
        a(view);
        if (bVar.isImpressionRecorded()) {
            return;
        }
        this.f17352d.put(view, bVar);
        f fVar = this.f17351c;
        int impressionMinPercentageViewed = bVar.getImpressionMinPercentageViewed();
        fVar.a(view, view, impressionMinPercentageViewed, impressionMinPercentageViewed, bVar.getImpressionMinVisiblePx());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(int i, int i4) {
        this(r0, r1, r2, r3);
        WeakHashMap weakHashMap = new WeakHashMap();
        WeakHashMap weakHashMap2 = new WeakHashMap();
        f.b bVar = new f.b(i);
        f fVar = new f(i4, i);
        new Handler(Looper.getMainLooper());
    }

    private void b(View view) {
        this.f17353e.remove(view);
    }

    private c(Map<View, b> map, Map<View, d<b>> map2, f.b bVar, f fVar) {
        this.f17352d = map;
        this.f17353e = map2;
        this.f17354f = bVar;
        this.f17351c = fVar;
        f.d dVar = new f.d() { // from class: com.anythink.core.common.v.a.c.1
            @Override // com.anythink.core.common.v.a.f.d
            public final void a(List<View> list) {
                for (View view : list) {
                    b bVar2 = (b) c.this.f17352d.get(view);
                    if (bVar2 == null) {
                        c.this.a(view);
                    } else {
                        bVar2.recordImpression(view);
                        bVar2.setImpressionRecorded();
                    }
                }
            }
        };
        this.f17355g = dVar;
        fVar.a(dVar);
    }

    public final void a(View view) {
        this.f17352d.remove(view);
        b(view);
        this.f17351c.a(view);
    }

    public final void a() {
        this.f17352d.clear();
        this.f17353e.clear();
        this.f17351c.a();
    }
}
