package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class eaq extends maq {
    public final baq b;
    public final daq c;
    public final daq d;
    public final List e;

    public eaq(baq baqVar, daq daqVar) {
        this.b = baqVar;
        this.c = daqVar;
        this.d = daqVar;
        this.e = t75.c(daqVar);
    }

    @Override // defpackage.n7q
    public final mwk b() {
        return this.d;
    }

    @Override // defpackage.n7q
    public final b3l c() {
        return a3l.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eaq)) {
            return false;
        }
        eaq eaqVar = (eaq) obj;
        if (!this.b.equals(eaqVar.b) || !this.c.equals(eaqVar.c)) {
            return false;
        }
        a3l a3lVar = a3l.a;
        return a3lVar.equals(a3lVar);
    }

    @Override // defpackage.n7q
    public final u3q g() {
        return this.b;
    }

    @Override // defpackage.maq
    /* renamed from: h */
    public final faq b() {
        return this.d;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31) + 1915220355;
    }

    @Override // defpackage.maq
    public final int i() {
        return 0;
    }

    @Override // defpackage.maq
    public final List j() {
        return this.e;
    }

    @Override // defpackage.maq
    public final f5q k() {
        return this.b;
    }

    public final String toString() {
        return "SharedYnisonGenerativeState(playbackEntity=" + this.b + ", playable=" + this.c + ", playableChangeReason=" + a3l.a + ")";
    }
}
