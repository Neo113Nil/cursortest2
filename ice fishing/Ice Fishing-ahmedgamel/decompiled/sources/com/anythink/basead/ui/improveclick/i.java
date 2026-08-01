package com.anythink.basead.ui.improveclick;

import android.content.Context;
import android.hardware.SensorEvent;
import com.anythink.basead.ui.ShakeNativeBorderThumbView;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.m;
import com.anythink.core.common.v.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class i {

    /* renamed from: e, reason: collision with root package name */
    private static volatile i f11188e;

    /* renamed from: d, reason: collision with root package name */
    private final String f11192d = "i";

    /* renamed from: a, reason: collision with root package name */
    Object f11189a = new Object();

    /* renamed from: f, reason: collision with root package name */
    private boolean f11193f = true;

    /* renamed from: g, reason: collision with root package name */
    private final int f11194g = 148;

    /* renamed from: h, reason: collision with root package name */
    private final int f11195h = 50;
    private int i = 0;

    /* renamed from: j, reason: collision with root package name */
    private int f11196j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f11197k = 0;

    /* renamed from: l, reason: collision with root package name */
    private int f11198l = 0;

    /* renamed from: m, reason: collision with root package name */
    private float f11199m = 0.0f;

    /* renamed from: n, reason: collision with root package name */
    private float f11200n = 0.0f;

    /* renamed from: o, reason: collision with root package name */
    private float f11201o = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    com.anythink.basead.d.d f11191c = new com.anythink.basead.d.d() { // from class: com.anythink.basead.ui.improveclick.i.1
        @Override // com.anythink.basead.d.d
        public final boolean a(SensorEvent sensorEvent) {
            float f3;
            float f9;
            float f10;
            synchronized (i.this.f11189a) {
                if (sensorEvent != null) {
                    try {
                        float[] fArr = sensorEvent.values;
                        if (fArr != null && fArr.length >= 3) {
                            f3 = -fArr[0];
                            f9 = -fArr[1];
                            f10 = -fArr[2];
                            if (!(i.this.f11199m != 0.0f && i.this.f11200n == 0.0f && i.this.f11201o == 0.0f) && Math.abs(f3 - i.this.f11199m) + Math.abs(f9 - i.this.f11200n) + Math.abs(f10 - i.this.f11201o) < 0.5d) {
                                return false;
                            }
                            i.this.f11199m = f3;
                            i.this.f11200n = f9;
                            i.this.f11201o = f10;
                            if (!i.this.f11193f) {
                                String unused = i.this.f11192d;
                                return false;
                            }
                            ArrayList arrayList = new ArrayList();
                            for (b bVar : i.this.f11190b) {
                                arrayList.add(i.this.new a(bVar.a(), bVar));
                            }
                            Collections.sort(arrayList);
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                a aVar = (a) it.next();
                                if (aVar.f11204b.b().a(sensorEvent)) {
                                    String unused2 = i.this.f11192d;
                                    aVar.f11204b.hashCode();
                                    i.f(i.this);
                                    return true;
                                }
                            }
                            return false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                f10 = 0.0f;
                f3 = 0.0f;
                f9 = 0.0f;
                if (i.this.f11199m != 0.0f) {
                }
                return false;
            }
        }
    };

    /* renamed from: b, reason: collision with root package name */
    List<b> f11190b = new ArrayList();

    public class a implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        public int f11203a;

        /* renamed from: b, reason: collision with root package name */
        public b f11204b;

        public a(int i, b bVar) {
            this.f11203a = i;
            this.f11204b = bVar;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            if (obj instanceof a) {
                return this.f11203a - ((a) obj).f11203a;
            }
            return 0;
        }
    }

    public interface b {
        int a();

        ShakeNativeBorderThumbView.a b();
    }

    public static /* synthetic */ boolean f(i iVar) {
        iVar.f11193f = false;
        return false;
    }

    public final int d() {
        if (this.f11198l == 0) {
            this.f11198l = m.k(t.b().g());
        }
        return this.f11198l;
    }

    public static i a() {
        if (f11188e == null) {
            synchronized (i.class) {
                try {
                    if (f11188e == null) {
                        f11188e = new i();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f11188e;
    }

    public final void b(b bVar) {
        synchronized (this.f11189a) {
            try {
                this.f11190b.remove(bVar);
                bVar.hashCode();
                this.f11190b.size();
                if (this.f11190b.size() == 0) {
                    com.anythink.core.express.c.a.a().b(this.f11191c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int c() {
        if (this.f11197k == 0) {
            this.f11197k = m.j(t.b().g());
        }
        return this.f11197k;
    }

    public final void a(b bVar) {
        synchronized (this.f11189a) {
            try {
                if (this.f11190b.contains(bVar)) {
                    return;
                }
                this.f11190b.add(bVar);
                bVar.hashCode();
                this.f11190b.size();
                if (this.f11190b.size() == 1) {
                    this.f11193f = true;
                    com.anythink.core.express.c.a.a().a(this.f11191c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f11189a) {
            this.f11193f = true;
        }
    }

    public final int b(Context context) {
        if (this.f11196j == 0) {
            this.f11196j = q.a(context, 50.0f);
        }
        return this.f11196j;
    }

    public final int a(Context context) {
        if (this.i == 0) {
            this.i = q.a(context, 148.0f);
        }
        return this.i;
    }
}
