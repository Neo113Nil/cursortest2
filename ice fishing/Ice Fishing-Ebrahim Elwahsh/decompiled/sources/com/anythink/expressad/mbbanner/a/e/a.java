package com.anythink.expressad.mbbanner.a.e;

import android.os.Handler;
import android.os.Looper;
import com.anythink.expressad.foundation.d.e;
import com.anythink.expressad.foundation.e.c;
import java.util.Objects;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20116a = "a";

    /* renamed from: b, reason: collision with root package name */
    private final Handler f20117b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private boolean f20118c;

    public final void b(final com.anythink.expressad.mbbanner.a.c.b bVar, final c cVar) {
        Objects.toString(cVar);
        this.f20117b.post(new Runnable() { // from class: com.anythink.expressad.mbbanner.a.e.a.4
            @Override // java.lang.Runnable
            public final void run() {
                if (bVar != null) {
                    cVar.a(a.this.f20118c);
                    bVar.b();
                }
            }
        });
    }

    private void a(boolean z8) {
        this.f20118c = z8;
    }

    private boolean a() {
        return this.f20118c;
    }

    private void a(final com.anythink.expressad.mbbanner.a.c.b bVar, final e eVar, final String str) {
        this.f20117b.post(new Runnable() { // from class: com.anythink.expressad.mbbanner.a.e.a.1
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.expressad.mbbanner.a.c.b bVar2 = bVar;
                if (bVar2 != null) {
                    e eVar2 = eVar;
                    boolean unused = a.this.f20118c;
                    bVar2.a(eVar2);
                }
            }
        });
    }

    public final void a(final com.anythink.expressad.mbbanner.a.c.b bVar, final c cVar) {
        this.f20117b.post(new Runnable() { // from class: com.anythink.expressad.mbbanner.a.e.a.2
            @Override // java.lang.Runnable
            public final void run() {
                if (bVar != null) {
                    cVar.a(a.this.f20118c);
                    bVar.a(cVar);
                }
            }
        });
    }

    public final void a(final com.anythink.expressad.mbbanner.a.c.b bVar, final String str) {
        this.f20117b.post(new Runnable() { // from class: com.anythink.expressad.mbbanner.a.e.a.3
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.expressad.mbbanner.a.c.b bVar2 = bVar;
                if (bVar2 != null) {
                    boolean unused = a.this.f20118c;
                    bVar2.a();
                }
            }
        });
    }
}
