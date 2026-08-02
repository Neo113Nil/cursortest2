package defpackage;

/* loaded from: classes10.dex */
public final class wsu0 implements fk2 {
    public final String a;

    public /* synthetic */ wsu0(String str) {
        this.a = str;
    }

    public static final /* synthetic */ wsu0 a(String str) {
        return new wsu0(str);
    }

    public final /* synthetic */ String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wsu0) {
            return this.a.equals(((wsu0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.l(')', "StringAnnotation(value=", this.a);
    }
}
