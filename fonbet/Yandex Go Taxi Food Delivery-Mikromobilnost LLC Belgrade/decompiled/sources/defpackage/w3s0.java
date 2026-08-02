package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.shortcuts.ui.shortcutview.ShortcutsView;

/* loaded from: classes6.dex */
public final /* synthetic */ class w3s0 implements jms {
    public final /* synthetic */ ShortcutsView a;

    public w3s0(ShortcutsView shortcutsView) {
        this.a = shortcutsView;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof w3s0) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.a, ShortcutsView.class, "unitSizeToPixels", "unitSizeToPixels(F)I", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
