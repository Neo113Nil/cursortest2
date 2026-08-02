package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class tcq implements df5 {
    public final Function0 a;

    public tcq(Function0 function0) {
        function0.getClass();
        this.a = function0;
    }

    @Override // defpackage.cf5
    public final int c() {
        return R.drawable.ic_play_next_24;
    }

    @Override // defpackage.cf5
    public final String e() {
        return "dialog_action_play_next";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tcq) && Intrinsics.d(this.a, ((tcq) obj).a);
    }

    @Override // defpackage.cf5
    public final int getText() {
        return R.string.menu_element_play_next;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SheetPlayNextActionUiData(action=" + this.a + ")";
    }
}
