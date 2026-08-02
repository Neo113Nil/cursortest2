package androidx.compose.ui.semantics;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.edi;
import defpackage.o5b;
import defpackage.xci;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/semantics/EmptySemanticsElement;", "Ledi;", "Lo5b;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final class EmptySemanticsElement extends edi {
    public final o5b a;

    public EmptySemanticsElement(o5b o5bVar) {
        this.a = o5bVar;
    }

    @Override // defpackage.edi
    public final xci e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // defpackage.edi
    public final /* bridge */ /* synthetic */ void j(xci xciVar) {
    }
}
