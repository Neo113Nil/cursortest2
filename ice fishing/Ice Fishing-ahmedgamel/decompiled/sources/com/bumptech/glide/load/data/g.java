package com.bumptech.glide.load.data;

import B1.A;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.internal.ads.C2941aq;
import java.io.InputStream;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class g implements f {

    /* renamed from: v, reason: collision with root package name */
    public static final C1.a f23422v = new C1.a(1);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f23423n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f23424u;

    public g() {
        this.f23423n = 0;
        this.f23424u = new HashMap();
    }

    @Override // com.bumptech.glide.load.data.f
    public Object a() {
        switch (this.f23423n) {
            case 1:
                return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f23424u).rewind();
            case 2:
                return this.f23424u;
            default:
                A a9 = (A) this.f23424u;
                a9.reset();
                return a9;
        }
    }

    @Override // com.bumptech.glide.load.data.f
    public void b() {
        switch (this.f23423n) {
            case 1:
            case 2:
                break;
            default:
                ((A) this.f23424u).b();
                break;
        }
    }

    public ParcelFileDescriptor e() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f23424u).rewind();
    }

    public g(InputStream inputStream, C2941aq c2941aq) {
        this.f23423n = 3;
        A a9 = new A(inputStream, c2941aq);
        this.f23424u = a9;
        a9.mark(5242880);
    }

    public g(ParcelFileDescriptor parcelFileDescriptor) {
        this.f23423n = 1;
        this.f23424u = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public g(Object obj) {
        this.f23423n = 2;
        this.f23424u = obj;
    }

    private final void c() {
    }

    private final void d() {
    }
}
