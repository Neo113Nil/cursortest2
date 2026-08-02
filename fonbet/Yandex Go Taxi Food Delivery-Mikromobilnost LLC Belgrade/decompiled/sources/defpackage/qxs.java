package defpackage;

import com.google.protobuf.WireFormat$FieldType;

/* loaded from: classes11.dex */
public final class qxs implements Comparable {
    public final fqw a;
    public final int b;
    public final WireFormat$FieldType c;
    public final boolean w;
    public final boolean x;

    public qxs(fqw fqwVar, int i, WireFormat$FieldType wireFormat$FieldType, boolean z, boolean z2) {
        this.a = fqwVar;
        this.b = i;
        this.c = wireFormat$FieldType;
        this.w = z;
        this.x = z2;
    }

    public final fqw a() {
        return this.a;
    }

    public final WireFormat$FieldType b() {
        return this.c;
    }

    public final int c() {
        return this.b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.b - ((qxs) obj).b;
    }

    public final boolean d() {
        return this.x;
    }

    public final boolean e() {
        return this.w;
    }
}
