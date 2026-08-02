package com.bumptech.glide.load.data;

import D1.z;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.internal.ads.C2964aq;
import java.io.InputStream;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class g implements f {

    /* renamed from: v, reason: collision with root package name */
    public static final E1.a f24209v = new E1.a(1);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f24210n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f24211u;

    public g() {
        this.f24210n = 0;
        this.f24211u = new HashMap();
    }

    @Override // com.bumptech.glide.load.data.f
    public Object a() {
        switch (this.f24210n) {
            case 1:
                return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f24211u).rewind();
            case 2:
                return this.f24211u;
            default:
                z zVar = (z) this.f24211u;
                zVar.reset();
                return zVar;
        }
    }

    @Override // com.bumptech.glide.load.data.f
    public void b() {
        switch (this.f24210n) {
            case 1:
            case 2:
                break;
            default:
                ((z) this.f24211u).b();
                break;
        }
    }

    public ParcelFileDescriptor e() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f24211u).rewind();
    }

    public g(InputStream inputStream, C2964aq c2964aq) {
        this.f24210n = 3;
        z zVar = new z(inputStream, c2964aq);
        this.f24211u = zVar;
        zVar.mark(5242880);
    }

    public g(ParcelFileDescriptor parcelFileDescriptor) {
        this.f24210n = 1;
        this.f24211u = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public g(Object obj) {
        this.f24210n = 2;
        this.f24211u = obj;
    }

    private final void c() {
    }

    private final void d() {
    }
}
