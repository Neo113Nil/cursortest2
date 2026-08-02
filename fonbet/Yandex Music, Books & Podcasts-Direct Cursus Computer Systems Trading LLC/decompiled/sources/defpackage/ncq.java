package defpackage;

import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class ncq implements df5 {
    public final ezc a;

    /* JADX WARN: Multi-variable type inference failed */
    public ncq(Function0 function0) {
        this.a = (ezc) function0;
    }

    @Override // defpackage.cf5
    public final int c() {
        return R.drawable.ic_check_24;
    }

    @Override // defpackage.cf5
    public final String e() {
        return "dialog_action_mark_read";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ncq) && this.a.equals(((ncq) obj).a);
    }

    @Override // defpackage.cf5
    public final int getText() {
        return R.string.menu_element_mark_all_as_read;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SheetMarkReadAllActionUiData(action=" + this.a + ")";
    }
}
