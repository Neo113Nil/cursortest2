package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class a5f implements mhp {
    public final jyr a;

    public a5f(Function0 function0) {
        this.a = btf.b(function0);
    }

    @Override // defpackage.mhp
    public final ivf a() {
        return b().a();
    }

    public final mhp b() {
        return (mhp) this.a.getValue();
    }

    @Override // defpackage.mhp
    public final boolean c() {
        return false;
    }

    @Override // defpackage.mhp
    public final int d(String str) {
        str.getClass();
        return b().d(str);
    }

    @Override // defpackage.mhp
    public final int e() {
        return b().e();
    }

    @Override // defpackage.mhp
    public final String f(int i) {
        return b().f(i);
    }

    @Override // defpackage.mhp
    public final List g(int i) {
        return b().g(i);
    }

    @Override // defpackage.mhp
    public final List getAnnotations() {
        return c5b.a;
    }

    @Override // defpackage.mhp
    public final mhp h(int i) {
        return b().h(i);
    }

    @Override // defpackage.mhp
    public final String i() {
        return b().i();
    }

    @Override // defpackage.mhp
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.mhp
    public final boolean j(int i) {
        return b().j(i);
    }
}
