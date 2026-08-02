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
    private static final int f8612a = -1;

    /* renamed from: b, reason: collision with root package name */
    private final s[] f8613b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<s> f8614c;

    /* renamed from: d, reason: collision with root package name */
    private final h f8615d;

    /* renamed from: e, reason: collision with root package name */
    private com.anythink.basead.exoplayer.ae f8616e;

    /* renamed from: f, reason: collision with root package name */
    private Object f8617f;

    /* renamed from: g, reason: collision with root package name */
    private int f8618g;

    /* renamed from: h, reason: collision with root package name */
    private a f8619h;

    public static final class a extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public static final int f8620a = 0;

        /* renamed from: b, reason: collision with root package name */
        public final int f8621b = 0;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.anythink.basead.exoplayer.h.v$a$a, reason: collision with other inner class name */
        public @interface InterfaceC0030a {
        }
    }

    private v(s... sVarArr) {
        this(new j(), sVarArr);
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.c
    public final void a(com.anythink.basead.exoplayer.h hVar, boolean z6) {
        super.a(hVar, z6);
        for (int i = 0; i < this.f8613b.length; i++) {
            a((v) Integer.valueOf(i), this.f8613b[i]);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.s
    public final void b() {
        a aVar = this.f8619h;
        if (aVar != null) {
            throw aVar;
        }
        super.b();
    }

    private v(h hVar, s... sVarArr) {
        this.f8613b = sVarArr;
        this.f8615d = hVar;
        this.f8614c = new ArrayList<>(Arrays.asList(sVarArr));
        this.f8618g = -1;
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final r a(s.a aVar, com.anythink.basead.exoplayer.j.b bVar) {
        int length = this.f8613b.length;
        r[] rVarArr = new r[length];
        for (int i = 0; i < length; i++) {
            rVarArr[i] = this.f8613b[i].a(aVar, bVar);
        }
        return new u(this.f8615d, rVarArr);
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void a(r rVar) {
        u uVar = (u) rVar;
        int i = 0;
        while (true) {
            s[] sVarArr = this.f8613b;
            if (i >= sVarArr.length) {
                return;
            }
            sVarArr[i].a(uVar.f8604a[i]);
            i++;
        }
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.c
    public final void a() {
        super.a();
        this.f8616e = null;
        this.f8617f = null;
        this.f8618g = -1;
        this.f8619h = null;
        this.f8614c.clear();
        Collections.addAll(this.f8614c, this.f8613b);
    }

    private void a(s sVar, com.anythink.basead.exoplayer.ae aeVar, Object obj) {
        a aVar;
        if (this.f8619h == null) {
            if (this.f8618g == -1) {
                this.f8618g = aeVar.c();
            } else if (aeVar.c() != this.f8618g) {
                aVar = new a();
                this.f8619h = aVar;
            }
            aVar = null;
            this.f8619h = aVar;
        }
        if (this.f8619h != null) {
            return;
        }
        this.f8614c.remove(sVar);
        if (sVar == this.f8613b[0]) {
            this.f8616e = aeVar;
            this.f8617f = obj;
        }
        if (this.f8614c.isEmpty()) {
            a(this.f8616e, this.f8617f);
        }
    }

    private a a(com.anythink.basead.exoplayer.ae aeVar) {
        if (this.f8618g == -1) {
            this.f8618g = aeVar.c();
            return null;
        }
        if (aeVar.c() != this.f8618g) {
            return new a();
        }
        return null;
    }

    @Override // com.anythink.basead.exoplayer.h.f
    public final /* synthetic */ void a(Integer num, s sVar, com.anythink.basead.exoplayer.ae aeVar, Object obj) {
        a aVar;
        if (this.f8619h == null) {
            if (this.f8618g == -1) {
                this.f8618g = aeVar.c();
            } else if (aeVar.c() != this.f8618g) {
                aVar = new a();
                this.f8619h = aVar;
            }
            aVar = null;
            this.f8619h = aVar;
        }
        if (this.f8619h == null) {
            this.f8614c.remove(sVar);
            if (sVar == this.f8613b[0]) {
                this.f8616e = aeVar;
                this.f8617f = obj;
            }
            if (this.f8614c.isEmpty()) {
                a(this.f8616e, this.f8617f);
            }
        }
    }
}
