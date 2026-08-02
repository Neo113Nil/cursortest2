package c2;

import android.content.Context;
import com.google.android.gms.internal.ads.Wv;
import k2.InterfaceC4642a;

/* renamed from: c2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0547b extends AbstractC0548c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5711a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4642a f5712b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4642a f5713c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5714d;

    public C0547b(Context context, InterfaceC4642a interfaceC4642a, InterfaceC4642a interfaceC4642a2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f5711a = context;
        if (interfaceC4642a == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f5712b = interfaceC4642a;
        if (interfaceC4642a2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f5713c = interfaceC4642a2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f5714d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0548c) {
            AbstractC0548c abstractC0548c = (AbstractC0548c) obj;
            if (this.f5711a.equals(((C0547b) abstractC0548c).f5711a)) {
                C0547b c0547b = (C0547b) abstractC0548c;
                if (this.f5712b.equals(c0547b.f5712b) && this.f5713c.equals(c0547b.f5713c) && this.f5714d.equals(c0547b.f5714d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f5711a.hashCode() ^ 1000003) * 1000003) ^ this.f5712b.hashCode()) * 1000003) ^ this.f5713c.hashCode()) * 1000003) ^ this.f5714d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f5711a);
        sb.append(", wallClock=");
        sb.append(this.f5712b);
        sb.append(", monotonicClock=");
        sb.append(this.f5713c);
        sb.append(", backendName=");
        return Wv.i(sb, this.f5714d, "}");
    }
}
