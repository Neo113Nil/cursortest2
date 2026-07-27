package y1;

import android.content.res.Resources;
import java.io.IOException;

/* renamed from: y1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5210e implements com.bumptech.glide.load.data.d {

    /* renamed from: n, reason: collision with root package name */
    public final Resources.Theme f41792n;

    /* renamed from: u, reason: collision with root package name */
    public final Resources f41793u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f41794v;

    /* renamed from: w, reason: collision with root package name */
    public final int f41795w;

    /* renamed from: x, reason: collision with root package name */
    public Object f41796x;

    public C5210e(Resources.Theme theme, Resources resources, InterfaceC5211f interfaceC5211f, int i) {
        this.f41792n = theme;
        this.f41793u = resources;
        this.f41794v = interfaceC5211f;
        this.f41795w = i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, y1.f] */
    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        return this.f41794v.a();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, y1.f] */
    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        Object obj = this.f41796x;
        if (obj != null) {
            try {
                this.f41794v.d(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final int d() {
        return 1;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, y1.f] */
    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.j jVar, com.bumptech.glide.load.data.c cVar) {
        try {
            Object b9 = this.f41794v.b(this.f41793u, this.f41795w, this.f41792n);
            this.f41796x = b9;
            cVar.f(b9);
        } catch (Resources.NotFoundException e9) {
            cVar.c(e9);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }
}
