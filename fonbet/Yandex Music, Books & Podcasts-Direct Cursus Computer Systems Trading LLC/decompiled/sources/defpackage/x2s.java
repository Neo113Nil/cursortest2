package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class x2s implements rrf {
    public final String a;
    public final String b;
    public final o2s c;
    public final boolean d;
    public final float e;
    public final eyq f;
    public final wn5 g;

    public x2s(String str, String str2, o2s o2sVar, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = o2sVar;
        this.d = z;
        this.e = 16;
        this.f = new eyq(22, this);
        this.g = new wn5(new f5r(6, this), -1468949656, true);
    }

    @Override // defpackage.rrf
    public final Function0 a() {
        return this.f;
    }

    @Override // defpackage.rrf
    public final cma b() {
        return new cma(this.e);
    }

    @Override // defpackage.rrf
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.rrf
    public final String getType() {
        return this.b;
    }

    @Override // defpackage.rrf
    public final Function2 getUi() {
        return this.g;
    }
}
