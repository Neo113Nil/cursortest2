package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class ycq implements df5 {
    public final Function0 a;

    public ycq(Function0 function0) {
        function0.getClass();
        this.a = function0;
    }

    @Override // defpackage.cf5
    public final int c() {
        return R.drawable.ic_share_new_24;
    }

    @Override // defpackage.cf5
    public final String e() {
        return "dialog_action_share";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ycq) && Intrinsics.d(this.a, ((ycq) obj).a);
    }

    @Override // defpackage.cf5
    public final int getText() {
        return R.string.menu_element_share;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SheetShareActionUiData(action=" + this.a + ")";
    }
}
