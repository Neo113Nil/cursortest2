package androidx.compose.ui.layout;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.dpf;
import defpackage.edi;
import defpackage.pyc;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutElement;", "Ledi;", "Ldpf;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final /* data */ class LayoutElement extends edi {
    public final pyc a;

    public LayoutElement(pyc pycVar) {
        this.a = pycVar;
    }

    @Override // defpackage.edi
    public final xci e() {
        dpf dpfVar = new dpf();
        dpfVar.o = this.a;
        return dpfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && Intrinsics.d(this.a, ((LayoutElement) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        ((dpf) xciVar).o = this.a;
    }

    public final String toString() {
        return "LayoutElement(measure=" + this.a + ')';
    }
}
