package androidx.compose.ui.input.rotary;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.d5;
import defpackage.edi;
import defpackage.hfo;
import defpackage.xci;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/rotary/RotaryInputElement;", "Ledi;", "Lhfo;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final /* data */ class RotaryInputElement extends edi {
    @Override // defpackage.edi
    public final xci e() {
        d5 d5Var = d5.B;
        hfo hfoVar = new hfo();
        hfoVar.o = d5Var;
        return hfoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        Object obj2 = d5.B;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return d5.B.hashCode() * 31;
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        ((hfo) xciVar).o = d5.B;
    }

    public final String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + d5.B + ", onPreRotaryScrollEvent=null)";
    }
}
