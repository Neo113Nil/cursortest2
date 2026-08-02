package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class maq implements n7q {
    public uqw a;

    @Override // defpackage.n7q
    public final noh a() {
        return moh.a;
    }

    @Override // defpackage.n7q
    public final boolean d() {
        return false;
    }

    @Override // defpackage.n7q
    public final long e() {
        return 0L;
    }

    @Override // defpackage.n7q
    public final h4q f() {
        return h4q.b;
    }

    /* renamed from: h */
    public abstract faq b();

    public abstract int i();

    public abstract List j();

    public abstract f5q k();

    public final uqw l() {
        uqw uqwVar = this.a;
        if (uqwVar != null) {
            return uqwVar;
        }
        Intrinsics.j("signature");
        throw null;
    }
}
