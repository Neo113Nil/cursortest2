package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import r2.C4906k;
import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.ads.y8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4220y8 {

    /* renamed from: a, reason: collision with root package name */
    public final int f35895a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35896b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35897c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f35898d;

    /* renamed from: e, reason: collision with root package name */
    public final I1.a f35899e;

    /* renamed from: f, reason: collision with root package name */
    public final C3944t2 f35900f;

    /* renamed from: n, reason: collision with root package name */
    public int f35907n;

    /* renamed from: g, reason: collision with root package name */
    public final Object f35901g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f35902h = new ArrayList();
    public final ArrayList i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f35903j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public int f35904k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f35905l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f35906m = 0;

    /* renamed from: o, reason: collision with root package name */
    public String f35908o = "";

    /* renamed from: p, reason: collision with root package name */
    public String f35909p = "";

    /* renamed from: q, reason: collision with root package name */
    public String f35910q = "";

    public C4220y8(int i, int i4, int i6, int i9, int i10, int i11, int i12, boolean z6) {
        this.f35895a = i;
        this.f35896b = i4;
        this.f35897c = i6;
        this.f35898d = z6;
        this.f35899e = new I1.a(i9, 6);
        C3944t2 c3944t2 = new C3944t2();
        c3944t2.f34977n = i10;
        i11 = (i11 > 64 || i11 < 0) ? 64 : i11;
        if (i12 <= 0) {
            c3944t2.f34978u = 1;
        } else {
            c3944t2.f34978u = i12;
        }
        c3944t2.f34979v = new H8(i11);
        this.f35900f = c3944t2;
    }

    public static final String d(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            sb.append((String) arrayList.get(i));
            sb.append(' ');
            i++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        return sb2.length() < 100 ? sb2 : sb2.substring(0, 100);
    }

    public final void a(String str, boolean z6, float f2, float f9, float f10, float f11) {
        c(str, z6, f2, f9, f10, f11);
        synchronized (this.f35901g) {
            try {
                if (this.f35906m < 0) {
                    int i = w2.z.f41712b;
                    x2.i.a("ActivityContent: negative number of WebViews.");
                }
                b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f35901g) {
            try {
                int i = this.f35904k;
                int i4 = this.f35905l;
                boolean z6 = this.f35898d;
                int i6 = this.f35896b;
                if (!z6) {
                    i6 = (i4 * i6) + (i * this.f35895a);
                }
                if (i6 > this.f35907n) {
                    this.f35907n = i6;
                    C4906k c4906k = C4906k.f40186C;
                    if (!c4906k.f40196h.g().l()) {
                        I1.a aVar = this.f35899e;
                        this.f35908o = aVar.q(this.f35902h);
                        this.f35909p = aVar.q(this.i);
                    }
                    if (!c4906k.f40196h.g().m()) {
                        this.f35910q = this.f35900f.a(this.i, this.f35903j);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str, boolean z6, float f2, float f9, float f10, float f11) {
        if (str != null) {
            if (str.length() < this.f35897c) {
                return;
            }
            synchronized (this.f35901g) {
                try {
                    this.f35902h.add(str);
                    this.f35904k += str.length();
                    if (z6) {
                        this.i.add(str);
                        this.f35903j.add(new E8(f2, f9, f10, f11, r10.size() - 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4220y8)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((C4220y8) obj).f35908o;
        return str != null && str.equals(this.f35908o);
    }

    public final int hashCode() {
        return this.f35908o.hashCode();
    }

    public final String toString() {
        ArrayList arrayList = this.f35902h;
        int i = this.f35905l;
        int i4 = this.f35907n;
        int i6 = this.f35904k;
        String d9 = d(arrayList);
        String d10 = d(this.i);
        String str = this.f35908o;
        String str2 = this.f35909p;
        String str3 = this.f35910q;
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(i4).length();
        int length3 = String.valueOf(i6).length();
        int length4 = String.valueOf(d9).length();
        int length5 = String.valueOf(d10).length();
        int length6 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 32 + length2 + 14 + length3 + 8 + length4 + 14 + length5 + 12 + length6 + 20 + String.valueOf(str2).length() + 32 + String.valueOf(str3).length());
        AbstractC5128c.g(sb, "ActivityContent fetchId: ", i, " score:", i4);
        sb.append(" total_length:");
        sb.append(i6);
        sb.append("\n text: ");
        sb.append(d9);
        AbstractC5128c.h(sb, "\n viewableText", d10, "\n signture: ", str);
        return com.IceFishing.LiveIceFishing.k.r(sb, "\n viewableSignture: ", str2, "\n viewableSignatureForVertical: ", str3);
    }
}
