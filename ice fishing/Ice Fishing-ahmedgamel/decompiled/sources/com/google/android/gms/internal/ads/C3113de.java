package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.de, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3113de {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3862rb f30559a;

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f30560b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f30561c;

    /* JADX WARN: Can't wrap try/catch for region: R(18:0|1|(2:2|3)|(13:5|6|7|8|9|10|11|13|14|16|17|18|(3:20|21|22)(1:27))|39|6|7|8|9|10|11|13|14|16|17|18|(0)(0)|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:0|1|2|3|(13:5|6|7|8|9|10|11|13|14|16|17|18|(3:20|21|22)(1:27))|39|6|7|8|9|10|11|13|14|16|17|18|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0046, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0047, code lost:
    
        x2.i.d("", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003d, code lost:
    
        x2.i.d("", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0032, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0033, code lost:
    
        x2.i.d("", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0026, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0027, code lost:
    
        x2.i.d("", r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3113de(InterfaceC3862rb interfaceC3862rb) {
        Drawable drawable;
        Y2.a c9;
        this.f30559a = interfaceC3862rb;
        Uri uri = null;
        try {
            c9 = interfaceC3862rb.c();
        } catch (RemoteException e9) {
            x2.i.d("", e9);
        }
        if (c9 != null) {
            drawable = (Drawable) Y2.b.D0(c9);
            this.f30560b = drawable;
            uri = this.f30559a.f();
            this.f30561c = uri;
            this.f30559a.i();
            this.f30559a.o();
            this.f30559a.d();
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32872O4)).booleanValue()) {
                return;
            }
            try {
                this.f30559a.e();
                return;
            } catch (RemoteException unused) {
                return;
            }
        }
        drawable = null;
        this.f30560b = drawable;
        uri = this.f30559a.f();
        this.f30561c = uri;
        this.f30559a.i();
        this.f30559a.o();
        this.f30559a.d();
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32872O4)).booleanValue()) {
        }
    }
}
