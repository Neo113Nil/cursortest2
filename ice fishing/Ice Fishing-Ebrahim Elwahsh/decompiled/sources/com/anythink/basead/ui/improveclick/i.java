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
    private static volatile i f11345e;

    /* renamed from: d, reason: collision with root package name */
    private final String f11349d = "i";

    /* renamed from: a, reason: collision with root package name */
    Object f11346a = new Object();

    /* renamed from: f, reason: collision with root package name */
    private boolean f11350f = true;

    /* renamed from: g, reason: collision with root package name */
    private final int f11351g = 148;

    /* renamed from: h, reason: collision with root package name */
    private final int f11352h = 50;
    private int i = 0;

    /* renamed from: j, reason: collision with root package name */
    private int f11353j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f11354k = 0;

    /* renamed from: l, reason: collision with root package name */
    private int f11355l = 0;

    /* renamed from: m, reason: collision with root package name */
    private float f11356m = 0.0f;

    /* renamed from: n, reason: collision with root package name */
    private float f11357n = 0.0f;

    /* renamed from: o, reason: collision with root package name */
    private float f11358o = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    com.anythink.basead.d.d f11348c = new com.anythink.basead.d.d() { // from class: com.anythink.basead.ui.improveclick.i.1
        @Override // com.anythink.basead.d.d
        public final boolean a(SensorEvent sensorEvent) {
            float f6;
            float f9;
            float f10;
            synchronized (i.this.f11346a) {
                if (sensorEvent != null) {
                    try {
                        float[] fArr = sensorEvent.values;
                        if (fArr != null && fArr.length >= 3) {
                            f6 = -fArr[0];
                            f9 = -fArr[1];
                            f10 = -fArr[2];
                            if (!(i.this.f11356m != 0.0f && i.this.f11357n == 0.0f && i.this.f11358o == 0.0f) && Math.abs(f6 - i.this.f11356m) + Math.abs(f9 - i.this.f11357n) + Math.abs(f10 - i.this.f11358o) < 0.5d) {
                                return false;
                            }
                            i.this.f11356m = f6;
                            i.this.f11357n = f9;
                            i.this.f11358o = f10;
                            if (!i.this.f11350f) {
                                String unused = i.this.f11349d;
                                return false;
                            }
                            ArrayList arrayList = new ArrayList();
                            for (b bVar : i.this.f11347b) {
                                arrayList.add(i.this.new a(bVar.a(), bVar));
                            }
                            Collections.sort(arrayList);
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                a aVar = (a) it.next();
                                if (aVar.f11361b.b().a(sensorEvent)) {
                                    String unused2 = i.this.f11349d;
                                    aVar.f11361b.hashCode();
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
                f6 = 0.0f;
                f9 = 0.0f;
                if (i.this.f11356m != 0.0f) {
                }
                return false;
            }
        }
    };

    /* renamed from: b, reason: collision with root package name */
    List<b> f11347b = new ArrayList();

    public class a implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        public int f11360a;

        /* renamed from: b, reason: collision with root package name */
        public b f11361b;

        public a(int i, b bVar) {
            this.f11360a = i;
            this.f11361b = bVar;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            if (obj instanceof a) {
                return this.f11360a - ((a) obj).f11360a;
            }
            return 0;
        }
    }

    public interface b {
        int a();

        ShakeNativeBorderThumbView.a b();
    }

    public static /* synthetic */ boolean f(i iVar) {
        iVar.f11350f = false;
        return false;
    }

    public final int d() {
        if (this.f11355l == 0) {
            this.f11355l = m.k(t.b().g());
        }
        return this.f11355l;
    }

    public static i a() {
        if (f11345e == null) {
            synchronized (i.class) {
                try {
                    if (f11345e == null) {
                        f11345e = new i();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f11345e;
    }

    public final void b(b bVar) {
        synchronized (this.f11346a) {
            try {
                this.f11347b.remove(bVar);
                bVar.hashCode();
                this.f11347b.size();
                if (this.f11347b.size() == 0) {
                    com.anythink.core.express.c.a.a().b(this.f11348c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int c() {
        if (this.f11354k == 0) {
            this.f11354k = m.j(t.b().g());
        }
        return this.f11354k;
    }

    public final void a(b bVar) {
        synchronized (this.f11346a) {
            try {
                if (this.f11347b.contains(bVar)) {
                    return;
                }
                this.f11347b.add(bVar);
                bVar.hashCode();
                this.f11347b.size();
                if (this.f11347b.size() == 1) {
                    this.f11350f = true;
                    com.anythink.core.express.c.a.a().a(this.f11348c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f11346a) {
            this.f11350f = true;
        }
    }

    public final int b(Context context) {
        if (this.f11353j == 0) {
            this.f11353j = q.a(context, 50.0f);
        }
        return this.f11353j;
    }

    public final int a(Context context) {
        if (this.i == 0) {
            this.i = q.a(context, 148.0f);
        }
        return this.i;
    }
}
