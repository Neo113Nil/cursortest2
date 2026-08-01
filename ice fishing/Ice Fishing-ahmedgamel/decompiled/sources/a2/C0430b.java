package a2;

import android.content.Context;
import i2.InterfaceC4581a;
import u1.h;

/* renamed from: a2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0430b extends AbstractC0431c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4316a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4581a f4317b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4581a f4318c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4319d;

    public C0430b(Context context, InterfaceC4581a interfaceC4581a, InterfaceC4581a interfaceC4581a2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f4316a = context;
        if (interfaceC4581a == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f4317b = interfaceC4581a;
        if (interfaceC4581a2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f4318c = interfaceC4581a2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f4319d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0431c) {
            AbstractC0431c abstractC0431c = (AbstractC0431c) obj;
            if (this.f4316a.equals(((C0430b) abstractC0431c).f4316a)) {
                C0430b c0430b = (C0430b) abstractC0431c;
                if (this.f4317b.equals(c0430b.f4317b) && this.f4318c.equals(c0430b.f4318c) && this.f4319d.equals(c0430b.f4319d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f4316a.hashCode() ^ 1000003) * 1000003) ^ this.f4317b.hashCode()) * 1000003) ^ this.f4318c.hashCode()) * 1000003) ^ this.f4319d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f4316a);
        sb.append(", wallClock=");
        sb.append(this.f4317b);
        sb.append(", monotonicClock=");
        sb.append(this.f4318c);
        sb.append(", backendName=");
        return h.g(sb, this.f4319d, "}");
    }
}
