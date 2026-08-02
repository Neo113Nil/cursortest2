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
    private static volatile i f11974e;

    /* renamed from: d, reason: collision with root package name */
    private final String f11978d = "i";

    /* renamed from: a, reason: collision with root package name */
    Object f11975a = new Object();

    /* renamed from: f, reason: collision with root package name */
    private boolean f11979f = true;

    /* renamed from: g, reason: collision with root package name */
    private final int f11980g = 148;

    /* renamed from: h, reason: collision with root package name */
    private final int f11981h = 50;
    private int i = 0;

    /* renamed from: j, reason: collision with root package name */
    private int f11982j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f11983k = 0;

    /* renamed from: l, reason: collision with root package name */
    private int f11984l = 0;

    /* renamed from: m, reason: collision with root package name */
    private float f11985m = 0.0f;

    /* renamed from: n, reason: collision with root package name */
    private float f11986n = 0.0f;

    /* renamed from: o, reason: collision with root package name */
    private float f11987o = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    com.anythink.basead.d.d f11977c = new com.anythink.basead.d.d() { // from class: com.anythink.basead.ui.improveclick.i.1
        @Override // com.anythink.basead.d.d
        public final boolean a(SensorEvent sensorEvent) {
            float f2;
            float f9;
            float f10;
            synchronized (i.this.f11975a) {
                if (sensorEvent != null) {
                    try {
                        float[] fArr = sensorEvent.values;
                        if (fArr != null && fArr.length >= 3) {
                            f2 = -fArr[0];
                            f9 = -fArr[1];
                            f10 = -fArr[2];
                            if (!(i.this.f11985m != 0.0f && i.this.f11986n == 0.0f && i.this.f11987o == 0.0f) && Math.abs(f2 - i.this.f11985m) + Math.abs(f9 - i.this.f11986n) + Math.abs(f10 - i.this.f11987o) < 0.5d) {
                                return false;
                            }
                            i.this.f11985m = f2;
                            i.this.f11986n = f9;
                            i.this.f11987o = f10;
                            if (!i.this.f11979f) {
                                String unused = i.this.f11978d;
                                return false;
                            }
                            ArrayList arrayList = new ArrayList();
                            for (b bVar : i.this.f11976b) {
                                arrayList.add(i.this.new a(bVar.a(), bVar));
                            }
                            Collections.sort(arrayList);
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                a aVar = (a) it.next();
                                if (aVar.f11990b.b().a(sensorEvent)) {
                                    String unused2 = i.this.f11978d;
                                    aVar.f11990b.hashCode();
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
                f2 = 0.0f;
                f9 = 0.0f;
                if (i.this.f11985m != 0.0f) {
                }
                return false;
            }
        }
    };

    /* renamed from: b, reason: collision with root package name */
    List<b> f11976b = new ArrayList();

    public class a implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        public int f11989a;

        /* renamed from: b, reason: collision with root package name */
        public b f11990b;

        public a(int i, b bVar) {
            this.f11989a = i;
            this.f11990b = bVar;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            if (obj instanceof a) {
                return this.f11989a - ((a) obj).f11989a;
            }
            return 0;
        }
    }

    public interface b {
        int a();

        ShakeNativeBorderThumbView.a b();
    }

    public static /* synthetic */ boolean f(i iVar) {
        iVar.f11979f = false;
        return false;
    }

    public final int d() {
        if (this.f11984l == 0) {
            this.f11984l = m.k(t.b().g());
        }
        return this.f11984l;
    }

    public static i a() {
        if (f11974e == null) {
            synchronized (i.class) {
                try {
                    if (f11974e == null) {
                        f11974e = new i();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f11974e;
    }

    public final void b(b bVar) {
        synchronized (this.f11975a) {
            try {
                this.f11976b.remove(bVar);
                bVar.hashCode();
                this.f11976b.size();
                if (this.f11976b.size() == 0) {
                    com.anythink.core.express.c.a.a().b(this.f11977c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int c() {
        if (this.f11983k == 0) {
            this.f11983k = m.j(t.b().g());
        }
        return this.f11983k;
    }

    public final void a(b bVar) {
        synchronized (this.f11975a) {
            try {
                if (this.f11976b.contains(bVar)) {
                    return;
                }
                this.f11976b.add(bVar);
                bVar.hashCode();
                this.f11976b.size();
                if (this.f11976b.size() == 1) {
                    this.f11979f = true;
                    com.anythink.core.express.c.a.a().a(this.f11977c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f11975a) {
            this.f11979f = true;
        }
    }

    public final int b(Context context) {
        if (this.f11982j == 0) {
            this.f11982j = q.a(context, 50.0f);
        }
        return this.f11982j;
    }

    public final int a(Context context) {
        if (this.i == 0) {
            this.i = q.a(context, 148.0f);
        }
        return this.i;
    }
}
