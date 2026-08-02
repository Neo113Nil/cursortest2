package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class tbq implements df5 {
    public final Function0 a;

    public tbq(Function0 function0) {
        function0.getClass();
        this.a = function0;
    }

    @Override // defpackage.cf5
    public final int c() {
        return R.drawable.ic_add_to_queue_24;
    }

    @Override // defpackage.cf5
    public final String e() {
        return "dialog_action_add_to_queue";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tbq) && Intrinsics.d(this.a, ((tbq) obj).a);
    }

    @Override // defpackage.cf5
    public final int getText() {
        return R.string.menu_element_add_to_queue;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SheetAddToQueueActionUiData(action=" + this.a + ")";
    }
}
