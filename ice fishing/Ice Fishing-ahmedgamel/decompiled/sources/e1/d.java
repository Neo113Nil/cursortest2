package e1;

import java.util.ArrayList;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f37231a;

    /* renamed from: b, reason: collision with root package name */
    public final char f37232b;

    /* renamed from: c, reason: collision with root package name */
    public final double f37233c;

    /* renamed from: d, reason: collision with root package name */
    public final String f37234d;

    /* renamed from: e, reason: collision with root package name */
    public final String f37235e;

    public d(ArrayList arrayList, char c9, double d9, String str, String str2) {
        this.f37231a = arrayList;
        this.f37232b = c9;
        this.f37233c = d9;
        this.f37234d = str;
        this.f37235e = str2;
    }

    public static int a(char c9, String str, String str2) {
        return str2.hashCode() + AbstractC5128c.a(c9 * 31, 31, str);
    }

    public final int hashCode() {
        return a(this.f37232b, this.f37235e, this.f37234d);
    }
}
