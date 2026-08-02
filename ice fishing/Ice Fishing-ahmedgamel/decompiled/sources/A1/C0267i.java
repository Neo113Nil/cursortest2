package A1;

import android.content.res.Resources;
import java.io.IOException;

/* renamed from: A1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0267i implements com.bumptech.glide.load.data.d {

    /* renamed from: n, reason: collision with root package name */
    public final Resources.Theme f61n;

    /* renamed from: u, reason: collision with root package name */
    public final Resources f62u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f63v;

    /* renamed from: w, reason: collision with root package name */
    public final int f64w;

    /* renamed from: x, reason: collision with root package name */
    public Object f65x;

    public C0267i(Resources.Theme theme, Resources resources, InterfaceC0268j interfaceC0268j, int i) {
        this.f61n = theme;
        this.f62u = resources;
        this.f63v = interfaceC0268j;
        this.f64w = i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [A1.j, java.lang.Object] */
    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        return this.f63v.a();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [A1.j, java.lang.Object] */
    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        Object obj = this.f65x;
        if (obj != null) {
            try {
                this.f63v.d(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final int d() {
        return 1;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [A1.j, java.lang.Object] */
    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.j jVar, com.bumptech.glide.load.data.c cVar) {
        try {
            Object b9 = this.f63v.b(this.f62u, this.f64w, this.f61n);
            this.f65x = b9;
            cVar.f(b9);
        } catch (Resources.NotFoundException e9) {
            cVar.c(e9);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }
}
