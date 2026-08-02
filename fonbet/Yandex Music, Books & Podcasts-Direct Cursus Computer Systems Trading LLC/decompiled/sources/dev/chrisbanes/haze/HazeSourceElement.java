package dev.chrisbanes.haze;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.cib;
import defpackage.edi;
import defpackage.eta;
import defpackage.ftd;
import defpackage.m8;
import defpackage.ntd;
import defpackage.s2r;
import defpackage.xci;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldev/chrisbanes/haze/HazeSourceElement;", "Ledi;", "Lntd;", "haze_release"}, k = 1, mv = {2, 1, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final /* data */ class HazeSourceElement extends edi {
    public final cib a;

    public HazeSourceElement(cib cibVar) {
        this.a = cibVar;
    }

    @Override // defpackage.edi
    public final xci e() {
        return new ntd(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HazeSourceElement) && this.a.equals(((HazeSourceElement) obj).a) && Float.compare(0.0f, 0.0f) == 0;
    }

    public final int hashCode() {
        return eta.a(this.a.hashCode() * 31, 0.0f, 31);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        ntd ntdVar = (ntd) xciVar;
        ntdVar.getClass();
        m8 m8Var = ((s2r) ntdVar.p.b).q().c;
        ftd ftdVar = ntdVar.o;
        boolean contains = m8Var.contains(ftdVar);
        if (contains) {
            cib cibVar = ntdVar.p;
            cibVar.getClass();
            ftdVar.getClass();
            ((s2r) cibVar.b).remove(ftdVar);
        }
        cib cibVar2 = this.a;
        ntdVar.p = cibVar2;
        if (contains) {
            ftdVar.getClass();
            ((s2r) cibVar2.b).add(ftdVar);
        }
        ftdVar.c.h(0.0f);
    }

    public final String toString() {
        return "HazeSourceElement(state=" + this.a + ", zIndex=0.0, key=null)";
    }
}
