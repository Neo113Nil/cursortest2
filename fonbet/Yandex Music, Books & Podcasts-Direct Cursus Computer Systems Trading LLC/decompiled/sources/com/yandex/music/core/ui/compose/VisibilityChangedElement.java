package com.yandex.music.core.ui.compose;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.edi;
import defpackage.eta;
import defpackage.pyc;
import defpackage.qiu;
import defpackage.tlm;
import defpackage.xci;
import defpackage.ynn;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/yandex/music/core/ui/compose/VisibilityChangedElement;", "T", "Ledi;", "Lqiu;", "shared-core-ui-compose-utils"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
final /* data */ class VisibilityChangedElement<T> extends edi {
    public final pyc a;
    public final float b;
    public final Function0 c;
    public final long d;
    public final ynn e;
    public final Object f;

    public VisibilityChangedElement(float f, long j, pyc pycVar, ynn ynnVar, Object obj, Function0 function0) {
        pycVar.getClass();
        this.a = pycVar;
        this.b = f;
        this.c = function0;
        this.d = j;
        this.e = ynnVar;
        this.f = obj;
    }

    @Override // defpackage.edi
    public final xci e() {
        return new qiu(this.b, this.d, this.a, this.e, this.f, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibilityChangedElement)) {
            return false;
        }
        VisibilityChangedElement visibilityChangedElement = (VisibilityChangedElement) obj;
        return Intrinsics.d(this.a, visibilityChangedElement.a) && Float.compare(this.b, visibilityChangedElement.b) == 0 && this.c.equals(visibilityChangedElement.c) && this.d == visibilityChangedElement.d && Intrinsics.d(this.e, visibilityChangedElement.e) && Intrinsics.d(this.f, visibilityChangedElement.f);
    }

    public final int hashCode() {
        int c = tlm.c(this.d, (this.c.hashCode() + eta.a(this.a.hashCode() * 31, this.b, 31)) * 31, 31);
        ynn ynnVar = this.e;
        int hashCode = (c + (ynnVar == null ? 0 : ynnVar.hashCode())) * 31;
        Object obj = this.f;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        qiu qiuVar = (qiu) xciVar;
        qiuVar.getClass();
        pyc pycVar = this.a;
        pycVar.getClass();
        qiuVar.p = pycVar;
        Object obj = qiuVar.o;
        Object obj2 = this.f;
        if (Intrinsics.d(obj, obj2)) {
            return;
        }
        qiuVar.L0();
        qiuVar.o = obj2;
        qiuVar.K0();
    }

    public final String toString() {
        return "VisibilityChangedElement(onVisible=" + this.a + ", showFraction=" + this.b + ", scale=" + this.c + ", showDelay=" + this.d + ", screenBounds=" + this.e + ", analyticsPayload=" + this.f + ")";
    }
}
