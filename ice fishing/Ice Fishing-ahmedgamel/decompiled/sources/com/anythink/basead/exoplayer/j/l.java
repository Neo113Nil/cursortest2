package com.anythink.basead.exoplayer.j;

import com.anythink.basead.exoplayer.k.af;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class l implements b {

    /* renamed from: a, reason: collision with root package name */
    private static final int f8929a = 100;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f8930b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8931c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f8932d;

    /* renamed from: e, reason: collision with root package name */
    private final a[] f8933e;

    /* renamed from: f, reason: collision with root package name */
    private int f8934f;

    /* renamed from: g, reason: collision with root package name */
    private int f8935g;

    /* renamed from: h, reason: collision with root package name */
    private int f8936h;
    private a[] i;

    public l(byte b9) {
        this();
    }

    public final synchronized void a(int i) {
        boolean z6 = i < this.f8934f;
        this.f8934f = i;
        if (z6) {
            b();
        }
    }

    @Override // com.anythink.basead.exoplayer.j.b
    public final synchronized void b() {
        try {
            int i = 0;
            int max = Math.max(0, af.a(this.f8934f, this.f8931c) - this.f8935g);
            int i4 = this.f8936h;
            if (max >= i4) {
                return;
            }
            if (this.f8932d != null) {
                int i6 = i4 - 1;
                while (i <= i6) {
                    a[] aVarArr = this.i;
                    a aVar = aVarArr[i];
                    byte[] bArr = aVar.f8805a;
                    byte[] bArr2 = this.f8932d;
                    if (bArr == bArr2) {
                        i++;
                    } else {
                        a aVar2 = aVarArr[i6];
                        if (aVar2.f8805a != bArr2) {
                            i6--;
                        } else {
                            aVarArr[i] = aVar2;
                            aVarArr[i6] = aVar;
                            i6--;
                            i++;
                        }
                    }
                }
                max = Math.max(max, i);
                if (max >= this.f8936h) {
                    return;
                }
            }
            Arrays.fill(this.i, max, this.f8936h, (Object) null);
            this.f8936h = max;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.anythink.basead.exoplayer.j.b
    public final synchronized int c() {
        return this.f8935g * this.f8931c;
    }

    @Override // com.anythink.basead.exoplayer.j.b
    public final int d() {
        return this.f8931c;
    }

    public final synchronized void e() {
        if (this.f8930b) {
            a(0);
        }
    }

    private l() {
        com.anythink.basead.exoplayer.k.a.a(true);
        com.anythink.basead.exoplayer.k.a.a(true);
        this.f8930b = true;
        this.f8931c = com.anythink.basead.exoplayer.b.aX;
        this.f8936h = 0;
        this.i = new a[100];
        this.f8932d = null;
        this.f8933e = new a[1];
    }

    @Override // com.anythink.basead.exoplayer.j.b
    public final synchronized a a() {
        a aVar;
        try {
            this.f8935g++;
            int i = this.f8936h;
            if (i > 0) {
                a[] aVarArr = this.i;
                int i4 = i - 1;
                this.f8936h = i4;
                aVar = aVarArr[i4];
                aVarArr[i4] = null;
            } else {
                aVar = new a(new byte[this.f8931c]);
            }
        } catch (Throwable th) {
            throw th;
        }
        return aVar;
    }

    @Override // com.anythink.basead.exoplayer.j.b
    public final synchronized void a(a aVar) {
        a[] aVarArr = this.f8933e;
        aVarArr[0] = aVar;
        a(aVarArr);
    }

    @Override // com.anythink.basead.exoplayer.j.b
    public final synchronized void a(a[] aVarArr) {
        try {
            int i = this.f8936h;
            int length = aVarArr.length + i;
            a[] aVarArr2 = this.i;
            if (length >= aVarArr2.length) {
                this.i = (a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i + aVarArr.length));
            }
            for (a aVar : aVarArr) {
                byte[] bArr = aVar.f8805a;
                if (bArr != this.f8932d && bArr.length != this.f8931c) {
                    throw new IllegalArgumentException("Unexpected allocation: " + System.identityHashCode(aVar.f8805a) + ", " + System.identityHashCode(this.f8932d) + ", " + aVar.f8805a.length + ", " + this.f8931c);
                }
                a[] aVarArr3 = this.i;
                int i4 = this.f8936h;
                this.f8936h = i4 + 1;
                aVarArr3[i4] = aVar;
            }
            this.f8935g -= aVarArr.length;
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }
}
