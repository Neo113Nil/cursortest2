package defpackage;

import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class adq implements df5 {
    public final boolean a;
    public final ezc b;
    public final int c;
    public final int d;
    public final String e;

    /* JADX WARN: Multi-variable type inference failed */
    public adq(Function0 function0, boolean z) {
        this.a = z;
        this.b = (ezc) function0;
        this.c = z ? R.drawable.ic_like_active_24 : R.drawable.ic_like_unactive_24;
        this.d = z ? R.string.pre_save_unsubscribe_actions : R.string.pre_save_subscribe_actions;
        this.e = z ? "dialog_action_unsubscribe" : "dialog_action_subscribe";
    }

    @Override // defpackage.df5, defpackage.cf5
    public final long b(hq5 hq5Var) {
        long j;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(1924488672);
        if (this.a) {
            oq5Var.Z(-1697288668);
            j = ((dq0) oq5Var.j(eq0.a)).a.g;
        } else {
            oq5Var.Z(-1697287703);
            j = ((dq0) oq5Var.j(eq0.a)).b.b;
        }
        oq5Var.p(false);
        oq5Var.p(false);
        return j;
    }

    @Override // defpackage.cf5
    public final int c() {
        return this.c;
    }

    @Override // defpackage.cf5
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adq)) {
            return false;
        }
        adq adqVar = (adq) obj;
        return this.a == adqVar.a && this.b.equals(adqVar.b);
    }

    @Override // defpackage.cf5
    public final int getText() {
        return this.d;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SheetSubscribeActionUiData(isSubscribed=" + this.a + ", action=" + this.b + ")";
    }
}
