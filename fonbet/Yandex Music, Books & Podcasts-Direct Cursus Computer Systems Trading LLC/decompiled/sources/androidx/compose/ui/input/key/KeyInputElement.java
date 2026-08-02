package androidx.compose.ui.input.key;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.edi;
import defpackage.xaf;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/key/KeyInputElement;", "Ledi;", "Lxaf;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class KeyInputElement extends edi {
    public final Function1 a;
    public final Function1 b;

    public KeyInputElement(Function1 function1, Function1 function12) {
        this.a = function1;
        this.b = function12;
    }

    @Override // defpackage.edi
    public final xci e() {
        xaf xafVar = new xaf();
        xafVar.o = this.a;
        xafVar.p = this.b;
        return xafVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return this.a == keyInputElement.a && this.b == keyInputElement.b;
    }

    public final int hashCode() {
        Function1 function1 = this.a;
        int hashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1 function12 = this.b;
        return hashCode + (function12 != null ? function12.hashCode() : 0);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        xaf xafVar = (xaf) xciVar;
        xafVar.o = this.a;
        xafVar.p = this.b;
    }
}
