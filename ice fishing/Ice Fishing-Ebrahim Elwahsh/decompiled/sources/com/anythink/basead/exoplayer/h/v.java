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
    private static final int f7983a = -1;

    /* renamed from: b, reason: collision with root package name */
    private final s[] f7984b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<s> f7985c;

    /* renamed from: d, reason: collision with root package name */
    private final h f7986d;

    /* renamed from: e, reason: collision with root package name */
    private com.anythink.basead.exoplayer.ae f7987e;

    /* renamed from: f, reason: collision with root package name */
    private Object f7988f;

    /* renamed from: g, reason: collision with root package name */
    private int f7989g;

    /* renamed from: h, reason: collision with root package name */
    private a f7990h;

    public static final class a extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public static final int f7991a = 0;

        /* renamed from: b, reason: collision with root package name */
        public final int f7992b = 0;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.anythink.basead.exoplayer.h.v$a$a, reason: collision with other inner class name */
        public @interface InterfaceC0029a {
        }
    }

    private v(s... sVarArr) {
        this(new j(), sVarArr);
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.c
    public final void a(com.anythink.basead.exoplayer.h hVar, boolean z8) {
        super.a(hVar, z8);
        for (int i = 0; i < this.f7984b.length; i++) {
            a((v) Integer.valueOf(i), this.f7984b[i]);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.s
    public final void b() {
        a aVar = this.f7990h;
        if (aVar != null) {
            throw aVar;
        }
        super.b();
    }

    private v(h hVar, s... sVarArr) {
        this.f7984b = sVarArr;
        this.f7986d = hVar;
        this.f7985c = new ArrayList<>(Arrays.asList(sVarArr));
        this.f7989g = -1;
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final r a(s.a aVar, com.anythink.basead.exoplayer.j.b bVar) {
        int length = this.f7984b.length;
        r[] rVarArr = new r[length];
        for (int i = 0; i < length; i++) {
            rVarArr[i] = this.f7984b[i].a(aVar, bVar);
        }
        return new u(this.f7986d, rVarArr);
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void a(r rVar) {
        u uVar = (u) rVar;
        int i = 0;
        while (true) {
            s[] sVarArr = this.f7984b;
            if (i >= sVarArr.length) {
                return;
            }
            sVarArr[i].a(uVar.f7975a[i]);
            i++;
        }
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.c
    public final void a() {
        super.a();
        this.f7987e = null;
        this.f7988f = null;
        this.f7989g = -1;
        this.f7990h = null;
        this.f7985c.clear();
        Collections.addAll(this.f7985c, this.f7984b);
    }

    private void a(s sVar, com.anythink.basead.exoplayer.ae aeVar, Object obj) {
        a aVar;
        if (this.f7990h == null) {
            if (this.f7989g == -1) {
                this.f7989g = aeVar.c();
            } else if (aeVar.c() != this.f7989g) {
                aVar = new a();
                this.f7990h = aVar;
            }
            aVar = null;
            this.f7990h = aVar;
        }
        if (this.f7990h != null) {
            return;
        }
        this.f7985c.remove(sVar);
        if (sVar == this.f7984b[0]) {
            this.f7987e = aeVar;
            this.f7988f = obj;
        }
        if (this.f7985c.isEmpty()) {
            a(this.f7987e, this.f7988f);
        }
    }

    private a a(com.anythink.basead.exoplayer.ae aeVar) {
        if (this.f7989g == -1) {
            this.f7989g = aeVar.c();
            return null;
        }
        if (aeVar.c() != this.f7989g) {
            return new a();
        }
        return null;
    }

    @Override // com.anythink.basead.exoplayer.h.f
    public final /* synthetic */ void a(Integer num, s sVar, com.anythink.basead.exoplayer.ae aeVar, Object obj) {
        a aVar;
        if (this.f7990h == null) {
            if (this.f7989g == -1) {
                this.f7989g = aeVar.c();
            } else if (aeVar.c() != this.f7989g) {
                aVar = new a();
                this.f7990h = aVar;
            }
            aVar = null;
            this.f7990h = aVar;
        }
        if (this.f7990h == null) {
            this.f7985c.remove(sVar);
            if (sVar == this.f7984b[0]) {
                this.f7987e = aeVar;
                this.f7988f = obj;
            }
            if (this.f7985c.isEmpty()) {
                a(this.f7987e, this.f7988f);
            }
        }
    }
}
