package com.bumptech.glide.load.data;

import B1.z;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.internal.ads.C3112dq;
import java.io.InputStream;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class g implements f {

    /* renamed from: v, reason: collision with root package name */
    public static final C1.a f23578v = new C1.a(1);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f23579n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f23580u;

    public g() {
        this.f23579n = 0;
        this.f23580u = new HashMap();
    }

    @Override // com.bumptech.glide.load.data.f
    public void b() {
        switch (this.f23579n) {
            case 1:
            case 2:
                break;
            default:
                ((z) this.f23580u).b();
                break;
        }
    }

    public ParcelFileDescriptor d() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f23580u).rewind();
    }

    @Override // com.bumptech.glide.load.data.f
    public Object n() {
        switch (this.f23579n) {
            case 1:
                return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f23580u).rewind();
            case 2:
                return this.f23580u;
            default:
                z zVar = (z) this.f23580u;
                zVar.reset();
                return zVar;
        }
    }

    public g(InputStream inputStream, C3112dq c3112dq) {
        this.f23579n = 3;
        z zVar = new z(inputStream, c3112dq);
        this.f23580u = zVar;
        zVar.mark(5242880);
    }

    public g(ParcelFileDescriptor parcelFileDescriptor) {
        this.f23579n = 1;
        this.f23580u = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public g(Object obj) {
        this.f23579n = 2;
        this.f23580u = obj;
    }

    private final void a() {
    }

    private final void c() {
    }
}
