package x5;

import android.content.Context;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8360a;

    /* renamed from: b, reason: collision with root package name */
    public final f6.a f8361b;

    /* renamed from: c, reason: collision with root package name */
    public final f6.a f8362c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8363d;

    public b(Context context, f6.a aVar, f6.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f8360a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f8361b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f8362c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f8363d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            b bVar = (b) ((c) obj);
            if (this.f8360a.equals(bVar.f8360a) && this.f8361b.equals(bVar.f8361b) && this.f8362c.equals(bVar.f8362c) && this.f8363d.equals(bVar.f8363d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f8360a.hashCode() ^ 1000003) * 1000003) ^ this.f8361b.hashCode()) * 1000003) ^ this.f8362c.hashCode()) * 1000003) ^ this.f8363d.hashCode();
    }

    public final String toString() {
        return "CreationContext{applicationContext=" + this.f8360a + ", wallClock=" + this.f8361b + ", monotonicClock=" + this.f8362c + ", backendName=" + this.f8363d + "}";
    }
}
