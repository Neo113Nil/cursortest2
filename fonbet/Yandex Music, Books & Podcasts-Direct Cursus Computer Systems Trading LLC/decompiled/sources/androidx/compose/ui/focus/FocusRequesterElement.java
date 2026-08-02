package androidx.compose.ui.focus;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.apc;
import defpackage.edi;
import defpackage.xci;
import defpackage.yoc;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusRequesterElement;", "Ledi;", "Lapc;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final /* data */ class FocusRequesterElement extends edi {
    public final yoc a;

    public FocusRequesterElement(yoc yocVar) {
        this.a = yocVar;
    }

    @Override // defpackage.edi
    public final xci e() {
        apc apcVar = new apc();
        apcVar.o = this.a;
        return apcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && Intrinsics.d(this.a, ((FocusRequesterElement) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        apc apcVar = (apc) xciVar;
        apcVar.o.a.l(apcVar);
        yoc yocVar = this.a;
        apcVar.o = yocVar;
        yocVar.a.d(apcVar);
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.a + ')';
    }
}
