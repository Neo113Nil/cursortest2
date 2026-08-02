package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.w4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4108w4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35563a = 2;

    /* renamed from: b, reason: collision with root package name */
    public boolean f35564b;

    /* renamed from: c, reason: collision with root package name */
    public int f35565c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f35566d;

    /* renamed from: e, reason: collision with root package name */
    public int f35567e;

    /* renamed from: f, reason: collision with root package name */
    public Object f35568f;

    public C4108w4(C3589mO c3589mO) {
        this.f35568f = c3589mO;
    }

    public void a() {
        this.f35567e = this.f35564b ? ((androidx.emoji2.text.g) this.f35568f).g() : ((androidx.emoji2.text.g) this.f35568f).k();
    }

    public void b(int i, View view) {
        if (this.f35564b) {
            int b9 = ((androidx.emoji2.text.g) this.f35568f).b(view);
            androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f35568f;
            this.f35567e = (Integer.MIN_VALUE == gVar.f4736a ? 0 : gVar.l() - gVar.f4736a) + b9;
        } else {
            this.f35567e = ((androidx.emoji2.text.g) this.f35568f).e(view);
        }
        this.f35565c = i;
    }

    public void c(int i, View view) {
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f35568f;
        int l9 = Integer.MIN_VALUE == gVar.f4736a ? 0 : gVar.l() - gVar.f4736a;
        if (l9 >= 0) {
            b(i, view);
            return;
        }
        this.f35565c = i;
        if (!this.f35564b) {
            int e9 = ((androidx.emoji2.text.g) this.f35568f).e(view);
            int k9 = e9 - ((androidx.emoji2.text.g) this.f35568f).k();
            this.f35567e = e9;
            if (k9 > 0) {
                int g9 = (((androidx.emoji2.text.g) this.f35568f).g() - Math.min(0, (((androidx.emoji2.text.g) this.f35568f).g() - l9) - ((androidx.emoji2.text.g) this.f35568f).b(view))) - (((androidx.emoji2.text.g) this.f35568f).c(view) + e9);
                if (g9 < 0) {
                    this.f35567e -= Math.min(k9, -g9);
                    return;
                }
                return;
            }
            return;
        }
        int g10 = (((androidx.emoji2.text.g) this.f35568f).g() - l9) - ((androidx.emoji2.text.g) this.f35568f).b(view);
        this.f35567e = ((androidx.emoji2.text.g) this.f35568f).g() - g10;
        if (g10 > 0) {
            int c9 = this.f35567e - ((androidx.emoji2.text.g) this.f35568f).c(view);
            int k10 = ((androidx.emoji2.text.g) this.f35568f).k();
            int min = c9 - (Math.min(((androidx.emoji2.text.g) this.f35568f).e(view) - k10, 0) + k10);
            if (min < 0) {
                this.f35567e = Math.min(g10, -min) + this.f35567e;
            }
        }
    }

    public void d() {
        this.f35565c = -1;
        this.f35567e = Integer.MIN_VALUE;
        this.f35564b = false;
        this.f35566d = false;
    }

    public void e() {
        this.f35564b = false;
        this.f35566d = false;
    }

    public void f(int i) {
        this.f35564b = 1 == ((this.f35564b ? 1 : 0) | i);
        this.f35565c += i;
    }

    public void g(int i) {
        AbstractC2792Sd.H(!this.f35564b);
        boolean z6 = i == this.f35565c;
        this.f35564b = z6;
        if (z6) {
            this.f35567e = 3;
            this.f35566d = false;
        }
    }

    public void h(byte[] bArr, int i, int i4) {
        if (this.f35564b) {
            int i6 = i4 - i;
            byte[] bArr2 = (byte[]) this.f35568f;
            int length = bArr2.length;
            int i9 = this.f35567e + i6;
            if (length < i9) {
                this.f35568f = Arrays.copyOf(bArr2, i9 + i9);
            }
            System.arraycopy(bArr, i, (byte[]) this.f35568f, this.f35567e, i6);
            this.f35567e += i6;
        }
    }

    public boolean i(int i) {
        if (!this.f35564b) {
            return false;
        }
        this.f35567e -= i;
        this.f35564b = false;
        this.f35566d = true;
        return true;
    }

    public String toString() {
        switch (this.f35563a) {
            case 2:
                return "AnchorInfo{mPosition=" + this.f35565c + ", mCoordinate=" + this.f35567e + ", mLayoutFromEnd=" + this.f35564b + ", mValid=" + this.f35566d + '}';
            default:
                return super.toString();
        }
    }

    public C4108w4(int i) {
        this.f35565c = i;
        byte[] bArr = new byte[com.anythink.expressad.video.module.a.a.f22519V];
        this.f35568f = bArr;
        bArr[2] = 1;
    }

    public C4108w4() {
        d();
    }
}
