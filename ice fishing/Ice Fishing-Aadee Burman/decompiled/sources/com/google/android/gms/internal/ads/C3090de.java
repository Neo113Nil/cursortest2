package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.de, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3090de {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3839rb f29786a;

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f29787b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f29788c;

    /* JADX WARN: Can't wrap try/catch for region: R(18:0|1|(2:2|3)|(13:5|6|7|8|9|10|11|13|14|16|17|18|(3:20|21|22)(1:27))|39|6|7|8|9|10|11|13|14|16|17|18|(0)(0)|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:0|1|2|3|(13:5|6|7|8|9|10|11|13|14|16|17|18|(3:20|21|22)(1:27))|39|6|7|8|9|10|11|13|14|16|17|18|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0046, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0047, code lost:
    
        v2.i.d("", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003d, code lost:
    
        v2.i.d("", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0032, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0033, code lost:
    
        v2.i.d("", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0026, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0027, code lost:
    
        v2.i.d("", r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3090de(InterfaceC3839rb interfaceC3839rb) {
        Drawable drawable;
        W2.a c9;
        this.f29786a = interfaceC3839rb;
        Uri uri = null;
        try {
            c9 = interfaceC3839rb.c();
        } catch (RemoteException e9) {
            v2.i.d("", e9);
        }
        if (c9 != null) {
            drawable = (Drawable) W2.b.F0(c9);
            this.f29787b = drawable;
            uri = this.f29786a.f();
            this.f29788c = uri;
            this.f29786a.i();
            this.f29786a.o();
            this.f29786a.d();
            if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32093O4)).booleanValue()) {
                return;
            }
            try {
                this.f29786a.e();
                return;
            } catch (RemoteException unused) {
                return;
            }
        }
        drawable = null;
        this.f29787b = drawable;
        uri = this.f29786a.f();
        this.f29788c = uri;
        this.f29786a.i();
        this.f29786a.o();
        this.f29786a.d();
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32093O4)).booleanValue()) {
        }
    }
}
