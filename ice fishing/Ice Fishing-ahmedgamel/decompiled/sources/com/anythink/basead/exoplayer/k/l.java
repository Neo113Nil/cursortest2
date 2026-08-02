package com.anythink.basead.exoplayer.k;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private String[] f9200a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9201b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9202c;

    private l(String... strArr) {
        this.f9200a = strArr;
    }

    private void a(String... strArr) {
        a.b(!this.f9201b, "Cannot set libraries after loading");
        this.f9200a = strArr;
    }

    private boolean a() {
        if (this.f9201b) {
            return this.f9202c;
        }
        this.f9201b = true;
        try {
            for (String str : this.f9200a) {
                System.loadLibrary(str);
            }
            this.f9202c = true;
        } catch (UnsatisfiedLinkError unused) {
        }
        return this.f9202c;
    }
}
