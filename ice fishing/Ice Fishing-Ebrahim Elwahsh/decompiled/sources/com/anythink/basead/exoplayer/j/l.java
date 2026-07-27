package com.anythink.basead.exoplayer.j;

import com.anythink.basead.exoplayer.k.C0544a;
import com.anythink.basead.exoplayer.k.af;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class l implements b {

    /* renamed from: a, reason: collision with root package name */
    private static final int f8300a = 100;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f8301b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8302c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f8303d;

    /* renamed from: e, reason: collision with root package name */
    private final a[] f8304e;

    /* renamed from: f, reason: collision with root package name */
    private int f8305f;

    /* renamed from: g, reason: collision with root package name */
    private int f8306g;

    /* renamed from: h, reason: collision with root package name */
    private int f8307h;
    private a[] i;

    public l(byte b9) {
        this();
    }

    public final synchronized void a(int i) {
        boolean z8 = i < this.f8305f;
        this.f8305f = i;
        if (z8) {
            b();
        }
    }

    @Override // com.anythink.basead.exoplayer.j.b
    public final synchronized void b() {
        try {
            int i = 0;
            int max = Math.max(0, af.a(this.f8305f, this.f8302c) - this.f8306g);
            int i4 = this.f8307h;
            if (max >= i4) {
                return;
            }
            if (this.f8303d != null) {
                int i9 = i4 - 1;
                while (i <= i9) {
                    a[] aVarArr = this.i;
                    a aVar = aVarArr[i];
                    byte[] bArr = aVar.f8176a;
                    byte[] bArr2 = this.f8303d;
                    if (bArr == bArr2) {
                        i++;
                    } else {
                        a aVar2 = aVarArr[i9];
                        if (aVar2.f8176a != bArr2) {
                            i9--;
                        } else {
                            aVarArr[i] = aVar2;
                            aVarArr[i9] = aVar;
                            i9--;
                            i++;
                        }
                    }
                }
                max = Math.max(max, i);
                if (max >= this.f8307h) {
                    return;
                }
            }
            Arrays.fill(this.i, max, this.f8307h, (Object) null);
            this.f8307h = max;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.anythink.basead.exoplayer.j.b
    public final synchronized int c() {
        return this.f8306g * this.f8302c;
    }

    @Override // com.anythink.basead.exoplayer.j.b
    public final int d() {
        return this.f8302c;
    }

    public final synchronized void e() {
        if (this.f8301b) {
            a(0);
        }
    }

    private l() {
        C0544a.a(true);
        C0544a.a(true);
        this.f8301b = true;
        this.f8302c = com.anythink.basead.exoplayer.b.aX;
        this.f8307h = 0;
        this.i = new a[100];
        this.f8303d = null;
        this.f8304e = new a[1];
    }

    @Override // com.anythink.basead.exoplayer.j.b
    public final synchronized a a() {
        a aVar;
        try {
            this.f8306g++;
            int i = this.f8307h;
            if (i > 0) {
                a[] aVarArr = this.i;
                int i4 = i - 1;
                this.f8307h = i4;
                aVar = aVarArr[i4];
                aVarArr[i4] = null;
            } else {
                aVar = new a(new byte[this.f8302c]);
            }
        } catch (Throwable th) {
            throw th;
        }
        return aVar;
    }

    @Override // com.anythink.basead.exoplayer.j.b
    public final synchronized void a(a aVar) {
        a[] aVarArr = this.f8304e;
        aVarArr[0] = aVar;
        a(aVarArr);
    }

    @Override // com.anythink.basead.exoplayer.j.b
    public final synchronized void a(a[] aVarArr) {
        try {
            int i = this.f8307h;
            int length = aVarArr.length + i;
            a[] aVarArr2 = this.i;
            if (length >= aVarArr2.length) {
                this.i = (a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i + aVarArr.length));
            }
            for (a aVar : aVarArr) {
                byte[] bArr = aVar.f8176a;
                if (bArr != this.f8303d && bArr.length != this.f8302c) {
                    throw new IllegalArgumentException("Unexpected allocation: " + System.identityHashCode(aVar.f8176a) + ", " + System.identityHashCode(this.f8303d) + ", " + aVar.f8176a.length + ", " + this.f8302c);
                }
                a[] aVarArr3 = this.i;
                int i4 = this.f8307h;
                this.f8307h = i4 + 1;
                aVarArr3[i4] = aVar;
            }
            this.f8306g -= aVarArr.length;
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }
}
