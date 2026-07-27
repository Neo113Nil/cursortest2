package com.anythink.basead.exoplayer.k;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private String[] f8414a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f8415b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8416c;

    private l(String... strArr) {
        this.f8414a = strArr;
    }

    private void a(String... strArr) {
        a.b(!this.f8415b, "Cannot set libraries after loading");
        this.f8414a = strArr;
    }

    private boolean a() {
        if (this.f8415b) {
            return this.f8416c;
        }
        this.f8415b = true;
        try {
            for (String str : this.f8414a) {
                System.loadLibrary(str);
            }
            this.f8416c = true;
        } catch (UnsatisfiedLinkError unused) {
        }
        return this.f8416c;
    }
}
