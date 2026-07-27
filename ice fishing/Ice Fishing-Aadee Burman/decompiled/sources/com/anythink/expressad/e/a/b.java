package com.anythink.expressad.e.a;

/* loaded from: classes.dex */
public abstract class b implements d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18310a = "AppletSchemeCallBack";

    public abstract void a();

    public abstract void a(int i, String str, String str2);

    public abstract void a(String str);

    @Override // com.anythink.expressad.e.a.d
    public final void b() {
        try {
            a();
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f17618a) {
                e9.getMessage();
            }
        }
    }

    @Override // com.anythink.expressad.e.a.d
    public final void c(int i, String str, String str2) {
        try {
            a(i, str, str2);
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f17618a) {
                e9.getMessage();
            }
        }
    }

    @Override // com.anythink.expressad.e.a.d
    public final void b(String str) {
        try {
            a(str);
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f17618a) {
                e9.getMessage();
            }
        }
    }

    @Override // com.anythink.expressad.e.a.d
    public final void b(int i, String str, String str2) {
        try {
            a(i, str, str2);
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f17618a) {
                e9.getMessage();
            }
        }
    }
}
