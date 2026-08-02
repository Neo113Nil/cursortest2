package androidx.compose.foundation.text.modifiers;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.a95;
import defpackage.edi;
import defpackage.f1d;
import defpackage.ges;
import defpackage.k5r;
import defpackage.mn0;
import defpackage.ppc;
import defpackage.t9s;
import defpackage.tlm;
import defpackage.xci;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "Ledi;", "Lt9s;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final class TextAnnotatedStringElement extends edi {
    public final mn0 a;
    public final ges b;
    public final ppc c;
    public final Function1 d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;
    public final List i;
    public final Function1 j;
    public final a95 k;
    public final Function1 l;

    public TextAnnotatedStringElement(mn0 mn0Var, ges gesVar, ppc ppcVar, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function12, a95 a95Var, Function1 function13) {
        this.a = mn0Var;
        this.b = gesVar;
        this.c = ppcVar;
        this.d = function1;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.i = list;
        this.j = function12;
        this.k = a95Var;
        this.l = function13;
    }

    @Override // defpackage.edi
    public final xci e() {
        return new t9s(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, null, this.k, this.l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return Intrinsics.d(this.k, textAnnotatedStringElement.k) && Intrinsics.d(this.a, textAnnotatedStringElement.a) && Intrinsics.d(this.b, textAnnotatedStringElement.b) && Intrinsics.d(this.i, textAnnotatedStringElement.i) && Intrinsics.d(this.c, textAnnotatedStringElement.c) && this.d == textAnnotatedStringElement.d && this.l == textAnnotatedStringElement.l && this.e == textAnnotatedStringElement.e && this.f == textAnnotatedStringElement.f && this.g == textAnnotatedStringElement.g && this.h == textAnnotatedStringElement.h && this.j == textAnnotatedStringElement.j;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + tlm.d(this.b, this.a.hashCode() * 31, 31)) * 31;
        Function1 function1 = this.d;
        int e = (((k5r.e(f1d.a(this.e, (hashCode + (function1 != null ? function1.hashCode() : 0)) * 31, 31), 31, this.f) + this.g) * 31) + this.h) * 31;
        List list = this.i;
        int hashCode2 = (e + (list != null ? list.hashCode() : 0)) * 31;
        Function1 function12 = this.j;
        int hashCode3 = (hashCode2 + (function12 != null ? function12.hashCode() : 0)) * 961;
        a95 a95Var = this.k;
        int hashCode4 = (hashCode3 + (a95Var != null ? a95Var.hashCode() : 0)) * 31;
        Function1 function13 = this.l;
        return hashCode4 + (function13 != null ? function13.hashCode() : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r1.a.b(r10.a) != false) goto L10;
     */
    @Override // defpackage.edi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(xci xciVar) {
        boolean z;
        t9s t9sVar = (t9s) xciVar;
        a95 a95Var = t9sVar.z;
        a95 a95Var2 = this.k;
        boolean d = Intrinsics.d(a95Var2, a95Var);
        t9sVar.z = a95Var2;
        if (d) {
            ges gesVar = t9sVar.p;
            ges gesVar2 = this.b;
            if (gesVar2 == gesVar) {
                gesVar2.getClass();
            }
            z = false;
            t9sVar.S0(z, t9sVar.X0(this.a), t9sVar.W0(this.b, this.i, this.h, this.g, this.f, this.c, this.e), t9sVar.V0(this.d, this.j, null, this.l));
        }
        z = true;
        t9sVar.S0(z, t9sVar.X0(this.a), t9sVar.W0(this.b, this.i, this.h, this.g, this.f, this.c, this.e), t9sVar.V0(this.d, this.j, null, this.l));
    }
}
