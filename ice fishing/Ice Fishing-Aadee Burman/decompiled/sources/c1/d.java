package c1;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5513a;

    /* renamed from: b, reason: collision with root package name */
    public final char f5514b;

    /* renamed from: c, reason: collision with root package name */
    public final double f5515c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5516d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5517e;

    public d(ArrayList arrayList, char c9, double d2, String str, String str2) {
        this.f5513a = arrayList;
        this.f5514b = c9;
        this.f5515c = d2;
        this.f5516d = str;
        this.f5517e = str2;
    }

    public static int a(char c9, String str, String str2) {
        return str2.hashCode() + u1.h.k(c9 * 31, 31, str);
    }

    public final int hashCode() {
        return a(this.f5514b, this.f5517e, this.f5516d);
    }
}
