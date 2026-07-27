package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.sb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3893sb {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3839rb f33975a;

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f33976b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f33977c;

    /* renamed from: d, reason: collision with root package name */
    public final double f33978d;

    /* renamed from: e, reason: collision with root package name */
    public final int f33979e;

    /* renamed from: f, reason: collision with root package name */
    public final int f33980f;

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|1|(2:2|3)|(15:5|6|7|8|9|10|11|12|13|14|15|16|17|18|19)|34|6|7|8|9|10|11|12|13|14|15|16|17|18|19) */
    /* JADX WARN: Can't wrap try/catch for region: R(20:0|1|2|3|(15:5|6|7|8|9|10|11|12|13|14|15|16|17|18|19)|34|6|7|8|9|10|11|12|13|14|15|16|17|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        v2.i.d("", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        v2.i.d("", r1);
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0033, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0034, code lost:
    
        v2.i.d("", r4);
        r1 = 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0026, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0027, code lost:
    
        v2.i.d("", r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3893sb(InterfaceC3839rb interfaceC3839rb) {
        Drawable drawable;
        W2.a c9;
        this.f33975a = interfaceC3839rb;
        Uri uri = null;
        try {
            c9 = interfaceC3839rb.c();
        } catch (RemoteException e9) {
            v2.i.d("", e9);
        }
        if (c9 != null) {
            drawable = (Drawable) W2.b.F0(c9);
            this.f33976b = drawable;
            uri = this.f33975a.f();
            this.f33977c = uri;
            double d2 = this.f33975a.i();
            this.f33978d = d2;
            int i = -1;
            int i6 = this.f33975a.o();
            this.f33979e = i6;
            i = this.f33975a.d();
            this.f33980f = i;
        }
        drawable = null;
        this.f33976b = drawable;
        uri = this.f33975a.f();
        this.f33977c = uri;
        double d22 = this.f33975a.i();
        this.f33978d = d22;
        int i9 = -1;
        int i62 = this.f33975a.o();
        this.f33979e = i62;
        i9 = this.f33975a.d();
        this.f33980f = i9;
    }
}
