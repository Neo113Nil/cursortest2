package androidx.compose.ui.draw;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.edi;
import defpackage.mpa;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawWithContentElement;", "Ledi;", "Lmpa;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final /* data */ class DrawWithContentElement extends edi {
    public final Function1 a;

    public DrawWithContentElement(Function1 function1) {
        this.a = function1;
    }

    @Override // defpackage.edi
    public final xci e() {
        mpa mpaVar = new mpa();
        mpaVar.o = this.a;
        return mpaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && Intrinsics.d(this.a, ((DrawWithContentElement) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        ((mpa) xciVar).o = this.a;
    }

    public final String toString() {
        return "DrawWithContentElement(onDraw=" + this.a + ')';
    }
}
