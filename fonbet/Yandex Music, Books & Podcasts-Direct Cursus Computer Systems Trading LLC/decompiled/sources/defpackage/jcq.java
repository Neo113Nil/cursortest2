package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class jcq implements ef5 {
    public final boolean a;
    public final Function0 b;
    public final String c;
    public final int d;

    public jcq(Function0 function0, boolean z) {
        function0.getClass();
        this.a = z;
        this.b = function0;
        this.c = z ? "dialog_action_remove_dislike" : "dialog_action_dislike";
        this.d = z ? R.string.accessibility_uncheck_action : R.string.accessibility_check_action;
    }

    @Override // defpackage.ef5, defpackage.cf5
    public final long b(hq5 hq5Var) {
        long j;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(-391577216);
        if (this.a) {
            oq5Var.Z(1651419524);
            j = ((dq0) oq5Var.j(eq0.a)).a.g;
        } else {
            oq5Var.Z(1651420489);
            j = ((dq0) oq5Var.j(eq0.a)).b.b;
        }
        oq5Var.p(false);
        oq5Var.p(false);
        return j;
    }

    @Override // defpackage.cf5
    public final int c() {
        return R.drawable.ic_dislike_24;
    }

    @Override // defpackage.cf5
    public final Integer d() {
        return Integer.valueOf(this.d);
    }

    @Override // defpackage.cf5
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcq)) {
            return false;
        }
        jcq jcqVar = (jcq) obj;
        return this.a == jcqVar.a && Intrinsics.d(this.b, jcqVar.b);
    }

    @Override // defpackage.cf5
    public final int getText() {
        return R.string.menu_element_dislike;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SheetDislikeActionUiData(isDisliked=" + this.a + ", action=" + this.b + ")";
    }
}
