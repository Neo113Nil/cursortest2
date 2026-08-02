package androidx.compose.foundation;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.ai3;
import defpackage.d85;
import defpackage.dup;
import defpackage.edi;
import defpackage.eta;
import defpackage.met;
import defpackage.net;
import defpackage.vj2;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/BackgroundElement;", "Ledi;", "Lvj2;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class BackgroundElement extends edi {
    public final long a;
    public final ai3 b;
    public final float c;
    public final dup d;

    public BackgroundElement(long j, ai3 ai3Var, dup dupVar, int i) {
        j = (i & 1) != 0 ? d85.n : j;
        ai3Var = (i & 2) != 0 ? null : ai3Var;
        this.a = j;
        this.b = ai3Var;
        this.c = 1.0f;
        this.d = dupVar;
    }

    @Override // defpackage.edi
    public final xci e() {
        vj2 vj2Var = new vj2();
        vj2Var.o = this.a;
        vj2Var.p = this.b;
        vj2Var.q = this.c;
        vj2Var.r = this.d;
        vj2Var.s = 9205357640488583168L;
        return vj2Var;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && d85.c(this.a, backgroundElement.a) && Intrinsics.d(this.b, backgroundElement.b) && this.c == backgroundElement.c && Intrinsics.d(this.d, backgroundElement.d);
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        int hashCode = Long.hashCode(this.a) * 31;
        ai3 ai3Var = this.b;
        return this.d.hashCode() + eta.a((hashCode + (ai3Var != null ? ai3Var.hashCode() : 0)) * 31, this.c, 31);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        vj2 vj2Var = (vj2) xciVar;
        vj2Var.o = this.a;
        vj2Var.p = this.b;
        vj2Var.q = this.c;
        vj2Var.r = this.d;
    }
}
