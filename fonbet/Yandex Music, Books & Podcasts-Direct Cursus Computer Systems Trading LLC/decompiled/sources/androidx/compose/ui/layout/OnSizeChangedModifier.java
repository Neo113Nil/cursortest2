package androidx.compose.ui.layout;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.edi;
import defpackage.sqj;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnSizeChangedModifier;", "Ledi;", "Lsqj;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class OnSizeChangedModifier extends edi {
    public final Function1 a;

    public OnSizeChangedModifier(Function1 function1) {
        this.a = function1;
    }

    @Override // defpackage.edi
    public final xci e() {
        sqj sqjVar = new sqj();
        sqjVar.o = this.a;
        long j = Integer.MIN_VALUE;
        sqjVar.p = (j & 4294967295L) | (j << 32);
        return sqjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnSizeChangedModifier) {
            return this.a == ((OnSizeChangedModifier) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        sqj sqjVar = (sqj) xciVar;
        sqjVar.o = this.a;
        long j = Integer.MIN_VALUE;
        sqjVar.p = (j & 4294967295L) | (j << 32);
    }
}
