package ru.yandex.taxi.widget.map;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class b {
    public final a a;
    public final a b;

    public b(a aVar, a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    public final a a() {
        return this.a;
    }

    public final a b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && this.b.equals(bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ButtonsTrail(acceptButton=" + this.a + ", declineButton=" + this.b + Extension.C_BRAKE;
    }
}
