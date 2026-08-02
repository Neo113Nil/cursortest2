package androidx.compose.animation;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.bs5;
import defpackage.d8t;
import defpackage.e9b;
import defpackage.edi;
import defpackage.s8b;
import defpackage.t7t;
import defpackage.vpb;
import defpackage.x8b;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/EnterExitTransitionElement;", "Ledi;", "Lx8b;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final /* data */ class EnterExitTransitionElement extends edi {
    public final d8t a;
    public final t7t b;
    public final t7t c;
    public final t7t d;
    public final e9b e;
    public final vpb f;
    public final s8b g;

    public EnterExitTransitionElement(d8t d8tVar, t7t t7tVar, t7t t7tVar2, t7t t7tVar3, e9b e9bVar, vpb vpbVar, s8b s8bVar) {
        this.a = d8tVar;
        this.b = t7tVar;
        this.c = t7tVar2;
        this.d = t7tVar3;
        this.e = e9bVar;
        this.f = vpbVar;
        this.g = s8bVar;
    }

    @Override // defpackage.edi
    public final xci e() {
        return new x8b(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        if (!Intrinsics.d(this.a, enterExitTransitionElement.a) || !Intrinsics.d(this.b, enterExitTransitionElement.b) || !Intrinsics.d(this.c, enterExitTransitionElement.c) || !Intrinsics.d(this.d, enterExitTransitionElement.d) || !this.e.equals(enterExitTransitionElement.e) || !Intrinsics.d(this.f, enterExitTransitionElement.f)) {
            return false;
        }
        Object obj2 = bs5.B0;
        return obj2.equals(obj2) && Intrinsics.d(this.g, enterExitTransitionElement.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        t7t t7tVar = this.b;
        int hashCode2 = (hashCode + (t7tVar == null ? 0 : t7tVar.hashCode())) * 31;
        t7t t7tVar2 = this.c;
        int hashCode3 = (hashCode2 + (t7tVar2 == null ? 0 : t7tVar2.hashCode())) * 31;
        t7t t7tVar3 = this.d;
        return this.g.hashCode() + ((bs5.B0.hashCode() + ((this.f.a.hashCode() + ((this.e.a.hashCode() + ((hashCode3 + (t7tVar3 != null ? t7tVar3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        x8b x8bVar = (x8b) xciVar;
        x8bVar.p = this.a;
        x8bVar.q = this.b;
        x8bVar.r = this.c;
        x8bVar.s = this.d;
        x8bVar.t = this.e;
        x8bVar.u = this.f;
        x8bVar.v = this.g;
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.a + ", sizeAnimation=" + this.b + ", offsetAnimation=" + this.c + ", slideAnimation=" + this.d + ", enter=" + this.e + ", exit=" + this.f + ", isEnabled=" + bs5.B0 + ", graphicsLayerBlock=" + this.g + ')';
    }
}
