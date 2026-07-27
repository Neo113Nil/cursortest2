package com.anythink.basead.mraid;

/* loaded from: classes.dex */
public class f extends com.anythink.core.express.d.a {

    /* renamed from: a, reason: collision with root package name */
    private static f f9782a;

    private f() {
    }

    @Override // com.anythink.core.express.d.b
    public final void a(Object obj, String str) {
    }

    @Override // com.anythink.core.express.d.b
    public final void b(Object obj, String str) {
    }

    @Override // com.anythink.core.express.d.b
    public final void a(Object obj, String str, String str2) {
    }

    public static f a() {
        if (f9782a == null) {
            synchronized (f.class) {
                try {
                    if (f9782a == null) {
                        f9782a = new f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f9782a;
    }
}
