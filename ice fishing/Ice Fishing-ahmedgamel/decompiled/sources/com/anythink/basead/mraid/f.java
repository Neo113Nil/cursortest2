package com.anythink.basead.mraid;

/* loaded from: classes.dex */
public class f extends com.anythink.core.express.d.a {

    /* renamed from: a, reason: collision with root package name */
    private static f f10411a;

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
        if (f10411a == null) {
            synchronized (f.class) {
                try {
                    if (f10411a == null) {
                        f10411a = new f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f10411a;
    }
}
