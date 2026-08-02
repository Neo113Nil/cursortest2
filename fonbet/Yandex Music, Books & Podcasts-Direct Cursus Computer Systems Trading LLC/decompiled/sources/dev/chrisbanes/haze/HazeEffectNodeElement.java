package dev.chrisbanes.haze;

import android.os.Build;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.c5b;
import defpackage.cib;
import defpackage.d85;
import defpackage.e5b;
import defpackage.edi;
import defpackage.g83;
import defpackage.gtd;
import defpackage.htd;
import defpackage.ktd;
import defpackage.qtd;
import defpackage.std;
import defpackage.xci;
import defpackage.zvo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldev/chrisbanes/haze/HazeEffectNodeElement;", "Ledi;", "Lhtd;", "haze_release"}, k = 1, mv = {2, 1, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
final /* data */ class HazeEffectNodeElement extends edi {
    public final cib a;
    public final qtd b;
    public final g83 c;

    public HazeEffectNodeElement(cib cibVar, qtd qtdVar, g83 g83Var) {
        this.a = cibVar;
        this.b = qtdVar;
        this.c = g83Var;
    }

    @Override // defpackage.edi
    public final xci e() {
        htd htdVar = new htd();
        htdVar.o = this.a;
        htdVar.p = this.c;
        htdVar.q = 0;
        float f = gtd.a;
        htdVar.r = Build.VERSION.SDK_INT >= 32;
        htdVar.s = ktd.a;
        htdVar.t = qtd.f;
        htdVar.u = this.b;
        htdVar.v = 9205357640488583168L;
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        htdVar.w = e5bVar;
        htdVar.y = 9205357640488583168L;
        htdVar.z = 9205357640488583168L;
        htdVar.A = 0L;
        htdVar.B = Float.NaN;
        htdVar.C = -1.0f;
        htdVar.E = d85.n;
        c5b c5bVar = c5b.a;
        htdVar.F = c5bVar;
        htdVar.G = std.d;
        htdVar.H = 1.0f;
        htdVar.I = c5bVar;
        htdVar.J = new zvo(htdVar);
        return htdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HazeEffectNodeElement)) {
            return false;
        }
        HazeEffectNodeElement hazeEffectNodeElement = (HazeEffectNodeElement) obj;
        return this.a.equals(hazeEffectNodeElement.a) && this.b.equals(hazeEffectNodeElement.b) && this.c.equals(hazeEffectNodeElement.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        htd htdVar = (htd) xciVar;
        htdVar.getClass();
        htdVar.o = this.a;
        qtd qtdVar = htdVar.u;
        qtd qtdVar2 = this.b;
        if (!Intrinsics.d(qtdVar, qtdVar2)) {
            htdVar.T0(htdVar.u, qtdVar2);
            htdVar.u = qtdVar2;
        }
        htdVar.p = this.c;
        htdVar.J();
    }

    public final String toString() {
        return "HazeEffectNodeElement(state=" + this.a + ", style=" + this.b + ", block=" + this.c + ")";
    }
}
