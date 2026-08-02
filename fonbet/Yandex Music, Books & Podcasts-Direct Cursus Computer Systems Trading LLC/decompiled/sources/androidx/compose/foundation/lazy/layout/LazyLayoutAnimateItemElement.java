package androidx.compose.foundation.lazy.layout;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.b9r;
import defpackage.ctf;
import defpackage.edi;
import defpackage.xci;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;", "Ledi;", "Lctf;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final /* data */ class LazyLayoutAnimateItemElement extends edi {
    public final b9r a;
    public final b9r b;
    public final b9r c;

    public LazyLayoutAnimateItemElement(b9r b9rVar, b9r b9rVar2, b9r b9rVar3) {
        this.a = b9rVar;
        this.b = b9rVar2;
        this.c = b9rVar3;
    }

    @Override // defpackage.edi
    public final xci e() {
        ctf ctfVar = new ctf();
        ctfVar.o = this.a;
        ctfVar.p = this.b;
        ctfVar.q = this.c;
        return ctfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutAnimateItemElement)) {
            return false;
        }
        LazyLayoutAnimateItemElement lazyLayoutAnimateItemElement = (LazyLayoutAnimateItemElement) obj;
        return this.a.equals(lazyLayoutAnimateItemElement.a) && this.b.equals(lazyLayoutAnimateItemElement.b) && this.c.equals(lazyLayoutAnimateItemElement.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        ctf ctfVar = (ctf) xciVar;
        ctfVar.o = this.a;
        ctfVar.p = this.b;
        ctfVar.q = this.c;
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.a + ", placementSpec=" + this.b + ", fadeOutSpec=" + this.c + ')';
    }
}
