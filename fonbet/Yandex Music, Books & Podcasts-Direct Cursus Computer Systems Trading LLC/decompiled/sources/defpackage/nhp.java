package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class nhp implements mhp, fr3 {
    public final mhp a;
    public final String b;
    public final Set c;

    public nhp(mhp mhpVar) {
        mhpVar.getClass();
        this.a = mhpVar;
        this.b = mhpVar.i() + '?';
        this.c = gld.J(mhpVar);
    }

    @Override // defpackage.mhp
    public final ivf a() {
        return this.a.a();
    }

    @Override // defpackage.fr3
    public final Set b() {
        return this.c;
    }

    @Override // defpackage.mhp
    public final boolean c() {
        return true;
    }

    @Override // defpackage.mhp
    public final int d(String str) {
        str.getClass();
        return this.a.d(str);
    }

    @Override // defpackage.mhp
    public final int e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nhp) {
            return Intrinsics.d(this.a, ((nhp) obj).a);
        }
        return false;
    }

    @Override // defpackage.mhp
    public final String f(int i) {
        return this.a.f(i);
    }

    @Override // defpackage.mhp
    public final List g(int i) {
        return this.a.g(i);
    }

    @Override // defpackage.mhp
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // defpackage.mhp
    public final mhp h(int i) {
        return this.a.h(i);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // defpackage.mhp
    public final String i() {
        return this.b;
    }

    @Override // defpackage.mhp
    public final boolean isInline() {
        return this.a.isInline();
    }

    @Override // defpackage.mhp
    public final boolean j(int i) {
        return this.a.j(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}
