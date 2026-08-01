package com.anythink.basead.exoplayer.j;

import com.anythink.basead.exoplayer.k.af;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class l implements b {

    /* renamed from: a, reason: collision with root package name */
    private static final int f8143a = 100;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f8144b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8145c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f8146d;

    /* renamed from: e, reason: collision with root package name */
    private final a[] f8147e;

    /* renamed from: f, reason: collision with root package name */
    private int f8148f;

    /* renamed from: g, reason: collision with root package name */
    private int f8149g;

    /* renamed from: h, reason: collision with root package name */
    private int f8150h;
    private a[] i;

    public l(byte b9) {
        this();
    }

    public final synchronized void a(int i) {
        boolean z3 = i < this.f8148f;
        this.f8148f = i;
        if (z3) {
            b();
        }
    }

    @Override // com.anythink.basead.exoplayer.j.b
    public final synchronized void b() {
        try {
            int i = 0;
            int max = Math.max(0, af.a(this.f8148f, this.f8145c) - this.f8149g);
            int i6 = this.f8150h;
            if (max >= i6) {
                return;
            }
            if (this.f8146d != null) {
                int i9 = i6 - 1;
                while (i <= i9) {
                    a[] aVarArr = this.i;
                    a aVar = aVarArr[i];
                    byte[] bArr = aVar.f8019a;
                    byte[] bArr2 = this.f8146d;
                    if (bArr == bArr2) {
                        i++;
                    } else {
                        a aVar2 = aVarArr[i9];
                        if (aVar2.f8019a != bArr2) {
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
                if (max >= this.f8150h) {
                    return;
                }
            }
            Arrays.fill(this.i, max, this.f8150h, (Object) null);
            this.f8150h = max;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.anythink.basead.exoplayer.j.b
    public final synchronized int c() {
        return this.f8149g * this.f8145c;
    }

    @Override // com.anythink.basead.exoplayer.j.b
    public final int d() {
        return this.f8145c;
    }

    public final synchronized void e() {
        if (this.f8144b) {
            a(0);
        }
    }

    private l() {
        com.anythink.basead.exoplayer.k.a.a(true);
        com.anythink.basead.exoplayer.k.a.a(true);
        this.f8144b = true;
        this.f8145c = com.anythink.basead.exoplayer.b.aX;
        this.f8150h = 0;
        this.i = new a[100];
        this.f8146d = null;
        this.f8147e = new a[1];
    }

    @Override // com.anythink.basead.exoplayer.j.b
    public final synchronized a a() {
        a aVar;
        try {
            this.f8149g++;
            int i = this.f8150h;
            if (i > 0) {
                a[] aVarArr = this.i;
                int i6 = i - 1;
                this.f8150h = i6;
                aVar = aVarArr[i6];
                aVarArr[i6] = null;
            } else {
                aVar = new a(new byte[this.f8145c]);
            }
        } catch (Throwable th) {
            throw th;
        }
        return aVar;
    }

    @Override // com.anythink.basead.exoplayer.j.b
    public final synchronized void a(a aVar) {
        a[] aVarArr = this.f8147e;
        aVarArr[0] = aVar;
        a(aVarArr);
    }

    @Override // com.anythink.basead.exoplayer.j.b
    public final synchronized void a(a[] aVarArr) {
        try {
            int i = this.f8150h;
            int length = aVarArr.length + i;
            a[] aVarArr2 = this.i;
            if (length >= aVarArr2.length) {
                this.i = (a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i + aVarArr.length));
            }
            for (a aVar : aVarArr) {
                byte[] bArr = aVar.f8019a;
                if (bArr != this.f8146d && bArr.length != this.f8145c) {
                    throw new IllegalArgumentException("Unexpected allocation: " + System.identityHashCode(aVar.f8019a) + ", " + System.identityHashCode(this.f8146d) + ", " + aVar.f8019a.length + ", " + this.f8145c);
                }
                a[] aVarArr3 = this.i;
                int i6 = this.f8150h;
                this.f8150h = i6 + 1;
                aVarArr3[i6] = aVar;
            }
            this.f8149g -= aVarArr.length;
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }
}
