package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.y8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4197y8 {

    /* renamed from: a, reason: collision with root package name */
    public final int f35109a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35110b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35111c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f35112d;

    /* renamed from: e, reason: collision with root package name */
    public final G1.a f35113e;

    /* renamed from: f, reason: collision with root package name */
    public final C3921t2 f35114f;

    /* renamed from: n, reason: collision with root package name */
    public int f35121n;

    /* renamed from: g, reason: collision with root package name */
    public final Object f35115g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f35116h = new ArrayList();
    public final ArrayList i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f35117j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public int f35118k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f35119l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f35120m = 0;

    /* renamed from: o, reason: collision with root package name */
    public String f35122o = "";

    /* renamed from: p, reason: collision with root package name */
    public String f35123p = "";

    /* renamed from: q, reason: collision with root package name */
    public String f35124q = "";

    public C4197y8(int i, int i6, int i9, int i10, int i11, int i12, int i13, boolean z3) {
        this.f35109a = i;
        this.f35110b = i6;
        this.f35111c = i9;
        this.f35112d = z3;
        this.f35113e = new G1.a(i10, 6);
        C3921t2 c3921t2 = new C3921t2();
        c3921t2.f34191n = i11;
        i12 = (i12 > 64 || i12 < 0) ? 64 : i12;
        if (i13 <= 0) {
            c3921t2.f34192u = 1;
        } else {
            c3921t2.f34192u = i13;
        }
        c3921t2.f34193v = new H8(i12);
        this.f35114f = c3921t2;
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

    public final void a(String str, boolean z3, float f3, float f9, float f10, float f11) {
        c(str, z3, f3, f9, f10, f11);
        synchronized (this.f35115g) {
            try {
                if (this.f35120m < 0) {
                    int i = u2.z.f41322b;
                    v2.i.a("ActivityContent: negative number of WebViews.");
                }
                b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f35115g) {
            try {
                int i = this.f35118k;
                int i6 = this.f35119l;
                boolean z3 = this.f35112d;
                int i9 = this.f35110b;
                if (!z3) {
                    i9 = (i6 * i9) + (i * this.f35109a);
                }
                if (i9 > this.f35121n) {
                    this.f35121n = i9;
                    C4835j c4835j = C4835j.f39733C;
                    if (!c4835j.f39743h.g().l()) {
                        G1.a aVar = this.f35113e;
                        this.f35122o = aVar.q(this.f35116h);
                        this.f35123p = aVar.q(this.i);
                    }
                    if (!c4835j.f39743h.g().m()) {
                        this.f35124q = this.f35114f.a(this.i, this.f35117j);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str, boolean z3, float f3, float f9, float f10, float f11) {
        if (str != null) {
            if (str.length() < this.f35111c) {
                return;
            }
            synchronized (this.f35115g) {
                try {
                    this.f35116h.add(str);
                    this.f35118k += str.length();
                    if (z3) {
                        this.i.add(str);
                        this.f35117j.add(new E8(f3, f9, f10, f11, r10.size() - 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4197y8)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((C4197y8) obj).f35122o;
        return str != null && str.equals(this.f35122o);
    }

    public final int hashCode() {
        return this.f35122o.hashCode();
    }

    public final String toString() {
        ArrayList arrayList = this.f35116h;
        int i = this.f35119l;
        int i6 = this.f35121n;
        int i9 = this.f35118k;
        String d2 = d(arrayList);
        String d9 = d(this.i);
        String str = this.f35122o;
        String str2 = this.f35123p;
        String str3 = this.f35124q;
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(i6).length();
        int length3 = String.valueOf(i9).length();
        int length4 = String.valueOf(d2).length();
        int length5 = String.valueOf(d9).length();
        int length6 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 32 + length2 + 14 + length3 + 8 + length4 + 14 + length5 + 12 + length6 + 20 + String.valueOf(str2).length() + 32 + String.valueOf(str3).length());
        u1.h.h(sb, "ActivityContent fetchId: ", i, " score:", i6);
        sb.append(" total_length:");
        sb.append(i9);
        sb.append("\n text: ");
        sb.append(d2);
        u1.h.i(sb, "\n viewableText", d9, "\n signture: ", str);
        return com.anythink.basead.exoplayer.f.f.o(sb, "\n viewableSignture: ", str2, "\n viewableSignatureForVertical: ", str3);
    }
}
