package androidx.compose.foundation.text.modifiers;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.a95;
import defpackage.edi;
import defpackage.f1d;
import defpackage.ges;
import defpackage.h4a;
import defpackage.iep;
import defpackage.k5r;
import defpackage.mdp;
import defpackage.mn0;
import defpackage.ods;
import defpackage.ppc;
import defpackage.t9s;
import defpackage.tlm;
import defpackage.xci;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;", "Ledi;", "Lmdp;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final /* data */ class SelectableTextAnnotatedStringElement extends edi {
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
    public final iep k;
    public final a95 l;

    public SelectableTextAnnotatedStringElement(mn0 mn0Var, ges gesVar, ppc ppcVar, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function12, iep iepVar, a95 a95Var) {
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
        this.k = iepVar;
        this.l = a95Var;
    }

    @Override // defpackage.edi
    public final xci e() {
        return new mdp(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        return Intrinsics.d(this.l, selectableTextAnnotatedStringElement.l) && Intrinsics.d(this.a, selectableTextAnnotatedStringElement.a) && Intrinsics.d(this.b, selectableTextAnnotatedStringElement.b) && Intrinsics.d(this.i, selectableTextAnnotatedStringElement.i) && Intrinsics.d(this.c, selectableTextAnnotatedStringElement.c) && this.d == selectableTextAnnotatedStringElement.d && this.e == selectableTextAnnotatedStringElement.e && this.f == selectableTextAnnotatedStringElement.f && this.g == selectableTextAnnotatedStringElement.g && this.h == selectableTextAnnotatedStringElement.h && this.j == selectableTextAnnotatedStringElement.j && Intrinsics.d(this.k, selectableTextAnnotatedStringElement.k);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + tlm.d(this.b, this.a.hashCode() * 31, 31)) * 31;
        Function1 function1 = this.d;
        int e = (((k5r.e(f1d.a(this.e, (hashCode + (function1 != null ? function1.hashCode() : 0)) * 31, 31), 31, this.f) + this.g) * 31) + this.h) * 31;
        List list = this.i;
        int hashCode2 = (e + (list != null ? list.hashCode() : 0)) * 31;
        Function1 function12 = this.j;
        int hashCode3 = (hashCode2 + (function12 != null ? function12.hashCode() : 0)) * 31;
        iep iepVar = this.k;
        int hashCode4 = (hashCode3 + (iepVar != null ? iepVar.hashCode() : 0)) * 961;
        a95 a95Var = this.l;
        return hashCode4 + (a95Var != null ? a95Var.hashCode() : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r4.a.b(r1.a) != false) goto L10;
     */
    @Override // defpackage.edi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(xci xciVar) {
        boolean z;
        mdp mdpVar = (mdp) xciVar;
        t9s t9sVar = mdpVar.r;
        a95 a95Var = t9sVar.z;
        a95 a95Var2 = this.l;
        boolean d = Intrinsics.d(a95Var2, a95Var);
        t9sVar.z = a95Var2;
        ges gesVar = this.b;
        if (d) {
            ges gesVar2 = t9sVar.p;
            if (gesVar == gesVar2) {
                gesVar.getClass();
            }
            z = false;
            boolean X0 = t9sVar.X0(this.a);
            boolean W0 = mdpVar.r.W0(gesVar, this.i, this.h, this.g, this.f, this.c, this.e);
            Function1 function1 = this.d;
            Function1 function12 = this.j;
            iep iepVar = this.k;
            t9sVar.S0(z, X0, W0, t9sVar.V0(function1, function12, iepVar, null));
            mdpVar.q = iepVar;
            h4a.z(mdpVar);
        }
        z = true;
        boolean X02 = t9sVar.X0(this.a);
        boolean W02 = mdpVar.r.W0(gesVar, this.i, this.h, this.g, this.f, this.c, this.e);
        Function1 function13 = this.d;
        Function1 function122 = this.j;
        iep iepVar2 = this.k;
        t9sVar.S0(z, X02, W02, t9sVar.V0(function13, function122, iepVar2, null));
        mdpVar.q = iepVar2;
        h4a.z(mdpVar);
    }

    public final String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + ((Object) this.a) + ", style=" + this.b + ", fontFamilyResolver=" + this.c + ", onTextLayout=" + this.d + ", overflow=" + ((Object) ods.a(this.e)) + ", softWrap=" + this.f + ", maxLines=" + this.g + ", minLines=" + this.h + ", placeholders=" + this.i + ", onPlaceholderLayout=" + this.j + ", selectionController=" + this.k + ", color=" + this.l + ", autoSize=null)";
    }
}
