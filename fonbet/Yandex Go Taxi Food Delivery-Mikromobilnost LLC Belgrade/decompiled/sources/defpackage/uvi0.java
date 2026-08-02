package defpackage;

/* loaded from: classes5.dex */
public final class uvi0 extends ztz {
    public final String a;

    public uvi0(String str) {
        this.a = str;
    }

    @Override // defpackage.v4v
    public final String a() {
        return null;
    }

    @Override // defpackage.v4v
    public final Boolean b() {
        return Boolean.FALSE;
    }

    @Override // defpackage.v4v
    public final bfz0 c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvi0) || !jl40.l(this.a, ((uvi0) obj).a)) {
            return false;
        }
        Object obj2 = Boolean.FALSE;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return (Boolean.FALSE.hashCode() + (this.a.hashCode() * 961)) * 31;
    }

    public final String toString() {
        return "RemoteLottieModel(url=" + this.a + ", contentDescription=null, monochrome=" + Boolean.FALSE + ", tintColor=null)";
    }
}
