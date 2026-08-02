package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class vcq implements df5 {
    public final boolean a;
    public final Function0 b;
    public final int c;
    public final int d;
    public final String e;
    public final int f;

    public vcq(Function0 function0, boolean z) {
        function0.getClass();
        this.a = z;
        this.b = function0;
        this.c = z ? R.drawable.ic_like_active_24 : R.drawable.ic_like_unactive_24;
        this.d = z ? R.string.menu_element_dislike_podcast : R.string.menu_element_like_podcast_from_episode;
        this.e = z ? "dialog_action_unsubscribe" : "dialog_action_subscribe";
        this.f = z ? R.string.accessibility_uncheck_action : R.string.accessibility_check_action;
    }

    @Override // defpackage.df5, defpackage.cf5
    public final long b(hq5 hq5Var) {
        long j;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(620961728);
        if (this.a) {
            oq5Var.Z(-256231420);
            j = ((dq0) oq5Var.j(eq0.a)).a.g;
        } else {
            oq5Var.Z(-256230457);
            j = ((dq0) oq5Var.j(eq0.a)).b.a;
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
    public final Integer d() {
        return Integer.valueOf(this.f);
    }

    @Override // defpackage.cf5
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vcq)) {
            return false;
        }
        vcq vcqVar = (vcq) obj;
        return this.a == vcqVar.a && Intrinsics.d(this.b, vcqVar.b);
    }

    @Override // defpackage.cf5
    public final int getText() {
        return this.d;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SheetPodcastSubscribeActionUiData(isSubscribed=" + this.a + ", action=" + this.b + ")";
    }
}
