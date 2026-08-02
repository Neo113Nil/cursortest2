package androidx.compose.ui.focus;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.edi;
import defpackage.koc;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusChangedElement;", "Ledi;", "Lkoc;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final /* data */ class FocusChangedElement extends edi {
    public final Function1 a;

    public FocusChangedElement(Function1 function1) {
        this.a = function1;
    }

    @Override // defpackage.edi
    public final xci e() {
        koc kocVar = new koc();
        kocVar.o = this.a;
        return kocVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && Intrinsics.d(this.a, ((FocusChangedElement) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        ((koc) xciVar).o = this.a;
    }

    public final String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.a + ')';
    }
}
