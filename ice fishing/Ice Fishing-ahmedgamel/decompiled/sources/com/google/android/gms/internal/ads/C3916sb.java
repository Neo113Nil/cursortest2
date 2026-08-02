package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.sb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3916sb {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3862rb f34741a;

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f34742b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f34743c;

    /* renamed from: d, reason: collision with root package name */
    public final double f34744d;

    /* renamed from: e, reason: collision with root package name */
    public final int f34745e;

    /* renamed from: f, reason: collision with root package name */
    public final int f34746f;

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|1|(2:2|3)|(15:5|6|7|8|9|10|11|12|13|14|15|16|17|18|19)|34|6|7|8|9|10|11|12|13|14|15|16|17|18|19) */
    /* JADX WARN: Can't wrap try/catch for region: R(20:0|1|2|3|(15:5|6|7|8|9|10|11|12|13|14|15|16|17|18|19)|34|6|7|8|9|10|11|12|13|14|15|16|17|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        x2.i.d("", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        x2.i.d("", r1);
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0033, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0034, code lost:
    
        x2.i.d("", r4);
        r1 = 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0026, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0027, code lost:
    
        x2.i.d("", r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3916sb(InterfaceC3862rb interfaceC3862rb) {
        Drawable drawable;
        Y2.a c9;
        this.f34741a = interfaceC3862rb;
        Uri uri = null;
        try {
            c9 = interfaceC3862rb.c();
        } catch (RemoteException e9) {
            x2.i.d("", e9);
        }
        if (c9 != null) {
            drawable = (Drawable) Y2.b.D0(c9);
            this.f34742b = drawable;
            uri = this.f34741a.f();
            this.f34743c = uri;
            double d9 = this.f34741a.i();
            this.f34744d = d9;
            int i = -1;
            int i4 = this.f34741a.o();
            this.f34745e = i4;
            i = this.f34741a.d();
            this.f34746f = i;
        }
        drawable = null;
        this.f34742b = drawable;
        uri = this.f34741a.f();
        this.f34743c = uri;
        double d92 = this.f34741a.i();
        this.f34744d = d92;
        int i6 = -1;
        int i42 = this.f34741a.o();
        this.f34745e = i42;
        i6 = this.f34741a.d();
        this.f34746f = i6;
    }
}
