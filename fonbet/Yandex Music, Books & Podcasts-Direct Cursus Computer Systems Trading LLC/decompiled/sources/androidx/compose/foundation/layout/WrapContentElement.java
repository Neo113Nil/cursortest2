package androidx.compose.foundation.layout;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.edi;
import defpackage.k48;
import defpackage.k5r;
import defpackage.r5w;
import defpackage.uif;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement;", "Ledi;", "Lr5w;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class WrapContentElement extends edi {
    public final k48 a;
    public final boolean b;
    public final uif c;
    public final Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(k48 k48Var, boolean z, Function2 function2, Object obj) {
        this.a = k48Var;
        this.b = z;
        this.c = (uif) function2;
        this.d = obj;
    }

    @Override // defpackage.edi
    public final xci e() {
        r5w r5wVar = new r5w();
        r5wVar.o = this.a;
        r5wVar.p = this.b;
        r5wVar.q = this.c;
        return r5wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.a == wrapContentElement.a && this.b == wrapContentElement.b && Intrinsics.d(this.d, wrapContentElement.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.e(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        r5w r5wVar = (r5w) xciVar;
        r5wVar.o = this.a;
        r5wVar.p = this.b;
        r5wVar.q = this.c;
    }
}
