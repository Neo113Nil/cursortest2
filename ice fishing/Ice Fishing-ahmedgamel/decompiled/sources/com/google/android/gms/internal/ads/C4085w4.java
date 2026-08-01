package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.w4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4085w4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34794a = 2;

    /* renamed from: b, reason: collision with root package name */
    public boolean f34795b;

    /* renamed from: c, reason: collision with root package name */
    public int f34796c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f34797d;

    /* renamed from: e, reason: collision with root package name */
    public int f34798e;

    /* renamed from: f, reason: collision with root package name */
    public Object f34799f;

    public C4085w4(C3566mO c3566mO) {
        this.f34799f = c3566mO;
    }

    public void a() {
        this.f34798e = this.f34795b ? ((androidx.emoji2.text.g) this.f34799f).g() : ((androidx.emoji2.text.g) this.f34799f).k();
    }

    public void b(int i, View view) {
        if (this.f34795b) {
            int b9 = ((androidx.emoji2.text.g) this.f34799f).b(view);
            androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f34799f;
            this.f34798e = (Integer.MIN_VALUE == gVar.f4768a ? 0 : gVar.l() - gVar.f4768a) + b9;
        } else {
            this.f34798e = ((androidx.emoji2.text.g) this.f34799f).e(view);
        }
        this.f34796c = i;
    }

    public void c(int i, View view) {
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f34799f;
        int l9 = Integer.MIN_VALUE == gVar.f4768a ? 0 : gVar.l() - gVar.f4768a;
        if (l9 >= 0) {
            b(i, view);
            return;
        }
        this.f34796c = i;
        if (!this.f34795b) {
            int e9 = ((androidx.emoji2.text.g) this.f34799f).e(view);
            int k9 = e9 - ((androidx.emoji2.text.g) this.f34799f).k();
            this.f34798e = e9;
            if (k9 > 0) {
                int g4 = (((androidx.emoji2.text.g) this.f34799f).g() - Math.min(0, (((androidx.emoji2.text.g) this.f34799f).g() - l9) - ((androidx.emoji2.text.g) this.f34799f).b(view))) - (((androidx.emoji2.text.g) this.f34799f).c(view) + e9);
                if (g4 < 0) {
                    this.f34798e -= Math.min(k9, -g4);
                    return;
                }
                return;
            }
            return;
        }
        int g9 = (((androidx.emoji2.text.g) this.f34799f).g() - l9) - ((androidx.emoji2.text.g) this.f34799f).b(view);
        this.f34798e = ((androidx.emoji2.text.g) this.f34799f).g() - g9;
        if (g9 > 0) {
            int c9 = this.f34798e - ((androidx.emoji2.text.g) this.f34799f).c(view);
            int k10 = ((androidx.emoji2.text.g) this.f34799f).k();
            int min = c9 - (Math.min(((androidx.emoji2.text.g) this.f34799f).e(view) - k10, 0) + k10);
            if (min < 0) {
                this.f34798e = Math.min(g9, -min) + this.f34798e;
            }
        }
    }

    public void d() {
        this.f34796c = -1;
        this.f34798e = Integer.MIN_VALUE;
        this.f34795b = false;
        this.f34797d = false;
    }

    public void e() {
        this.f34795b = false;
        this.f34797d = false;
    }

    public void f(int i) {
        this.f34795b = 1 == ((this.f34795b ? 1 : 0) | i);
        this.f34796c += i;
    }

    public void g(int i) {
        AbstractC2772Sd.H(!this.f34795b);
        boolean z3 = i == this.f34796c;
        this.f34795b = z3;
        if (z3) {
            this.f34798e = 3;
            this.f34797d = false;
        }
    }

    public void h(byte[] bArr, int i, int i6) {
        if (this.f34795b) {
            int i9 = i6 - i;
            byte[] bArr2 = (byte[]) this.f34799f;
            int length = bArr2.length;
            int i10 = this.f34798e + i9;
            if (length < i10) {
                this.f34799f = Arrays.copyOf(bArr2, i10 + i10);
            }
            System.arraycopy(bArr, i, (byte[]) this.f34799f, this.f34798e, i9);
            this.f34798e += i9;
        }
    }

    public boolean i(int i) {
        if (!this.f34795b) {
            return false;
        }
        this.f34798e -= i;
        this.f34795b = false;
        this.f34797d = true;
        return true;
    }

    public String toString() {
        switch (this.f34794a) {
            case 2:
                return "AnchorInfo{mPosition=" + this.f34796c + ", mCoordinate=" + this.f34798e + ", mLayoutFromEnd=" + this.f34795b + ", mValid=" + this.f34797d + '}';
            default:
                return super.toString();
        }
    }

    public C4085w4(int i) {
        this.f34796c = i;
        byte[] bArr = new byte[com.anythink.expressad.video.module.a.a.f21732V];
        this.f34799f = bArr;
        bArr[2] = 1;
    }

    public C4085w4() {
        d();
    }
}
