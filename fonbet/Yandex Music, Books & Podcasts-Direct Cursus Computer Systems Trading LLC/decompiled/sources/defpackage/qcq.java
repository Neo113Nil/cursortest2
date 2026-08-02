package defpackage;

import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class qcq implements df5 {
    public final ezc a;

    /* JADX WARN: Multi-variable type inference failed */
    public qcq(Function0 function0) {
        this.a = (ezc) function0;
    }

    @Override // defpackage.df5, defpackage.cf5
    public final long b(hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(750794944);
        long j = ((dq0) oq5Var.j(eq0.a)).a.f;
        oq5Var.p(false);
        return j;
    }

    @Override // defpackage.cf5
    public final int c() {
        return R.drawable.ic_check_24;
    }

    @Override // defpackage.cf5
    public final String e() {
        return "dialog_action_mark_unread";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qcq) && this.a.equals(((qcq) obj).a);
    }

    @Override // defpackage.cf5
    public final int getText() {
        return R.string.menu_element_mark_all_as_unread;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SheetMarkUnReadAllActionUiData(action=" + this.a + ")";
    }
}
