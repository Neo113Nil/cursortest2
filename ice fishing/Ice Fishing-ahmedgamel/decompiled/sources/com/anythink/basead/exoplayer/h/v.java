package com.anythink.basead.exoplayer.h;

import com.anythink.basead.exoplayer.h.s;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public final class v extends f<Integer> {

    /* renamed from: a, reason: collision with root package name */
    private static final int f7826a = -1;

    /* renamed from: b, reason: collision with root package name */
    private final s[] f7827b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<s> f7828c;

    /* renamed from: d, reason: collision with root package name */
    private final h f7829d;

    /* renamed from: e, reason: collision with root package name */
    private com.anythink.basead.exoplayer.ae f7830e;

    /* renamed from: f, reason: collision with root package name */
    private Object f7831f;

    /* renamed from: g, reason: collision with root package name */
    private int f7832g;

    /* renamed from: h, reason: collision with root package name */
    private a f7833h;

    public static final class a extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public static final int f7834a = 0;

        /* renamed from: b, reason: collision with root package name */
        public final int f7835b = 0;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.anythink.basead.exoplayer.h.v$a$a, reason: collision with other inner class name */
        public @interface InterfaceC0030a {
        }
    }

    private v(s... sVarArr) {
        this(new j(), sVarArr);
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.c
    public final void a(com.anythink.basead.exoplayer.h hVar, boolean z3) {
        super.a(hVar, z3);
        for (int i = 0; i < this.f7827b.length; i++) {
            a((v) Integer.valueOf(i), this.f7827b[i]);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.s
    public final void b() {
        a aVar = this.f7833h;
        if (aVar != null) {
            throw aVar;
        }
        super.b();
    }

    private v(h hVar, s... sVarArr) {
        this.f7827b = sVarArr;
        this.f7829d = hVar;
        this.f7828c = new ArrayList<>(Arrays.asList(sVarArr));
        this.f7832g = -1;
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final r a(s.a aVar, com.anythink.basead.exoplayer.j.b bVar) {
        int length = this.f7827b.length;
        r[] rVarArr = new r[length];
        for (int i = 0; i < length; i++) {
            rVarArr[i] = this.f7827b[i].a(aVar, bVar);
        }
        return new u(this.f7829d, rVarArr);
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void a(r rVar) {
        u uVar = (u) rVar;
        int i = 0;
        while (true) {
            s[] sVarArr = this.f7827b;
            if (i >= sVarArr.length) {
                return;
            }
            sVarArr[i].a(uVar.f7818a[i]);
            i++;
        }
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.c
    public final void a() {
        super.a();
        this.f7830e = null;
        this.f7831f = null;
        this.f7832g = -1;
        this.f7833h = null;
        this.f7828c.clear();
        Collections.addAll(this.f7828c, this.f7827b);
    }

    private void a(s sVar, com.anythink.basead.exoplayer.ae aeVar, Object obj) {
        a aVar;
        if (this.f7833h == null) {
            if (this.f7832g == -1) {
                this.f7832g = aeVar.c();
            } else if (aeVar.c() != this.f7832g) {
                aVar = new a();
                this.f7833h = aVar;
            }
            aVar = null;
            this.f7833h = aVar;
        }
        if (this.f7833h != null) {
            return;
        }
        this.f7828c.remove(sVar);
        if (sVar == this.f7827b[0]) {
            this.f7830e = aeVar;
            this.f7831f = obj;
        }
        if (this.f7828c.isEmpty()) {
            a(this.f7830e, this.f7831f);
        }
    }

    private a a(com.anythink.basead.exoplayer.ae aeVar) {
        if (this.f7832g == -1) {
            this.f7832g = aeVar.c();
            return null;
        }
        if (aeVar.c() != this.f7832g) {
            return new a();
        }
        return null;
    }

    @Override // com.anythink.basead.exoplayer.h.f
    public final /* synthetic */ void a(Integer num, s sVar, com.anythink.basead.exoplayer.ae aeVar, Object obj) {
        a aVar;
        if (this.f7833h == null) {
            if (this.f7832g == -1) {
                this.f7832g = aeVar.c();
            } else if (aeVar.c() != this.f7832g) {
                aVar = new a();
                this.f7833h = aVar;
            }
            aVar = null;
            this.f7833h = aVar;
        }
        if (this.f7833h == null) {
            this.f7828c.remove(sVar);
            if (sVar == this.f7827b[0]) {
                this.f7830e = aeVar;
                this.f7831f = obj;
            }
            if (this.f7828c.isEmpty()) {
                a(this.f7830e, this.f7831f);
            }
        }
    }
}
