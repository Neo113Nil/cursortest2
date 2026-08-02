package defpackage;

import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.player.ui.debug.model.CurrentStreamType;
import ru.yandex.video.m3.player.ui.debug.model.CurrentVideoType;

/* loaded from: classes6.dex */
public final class wb6 {
    public final String a;
    public final CurrentStreamType b;
    public final CurrentVideoType c;

    public wb6(String str, CurrentStreamType currentStreamType, CurrentVideoType currentVideoType) {
        this.a = str;
        this.b = currentStreamType;
        this.c = currentVideoType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb6)) {
            return false;
        }
        wb6 wb6Var = (wb6) obj;
        return Intrinsics.d(this.a, wb6Var.a) && this.b == wb6Var.b && this.c == wb6Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        CurrentStreamType currentStreamType = this.b;
        int hashCode2 = (hashCode + (currentStreamType == null ? 0 : currentStreamType.hashCode())) * 31;
        CurrentVideoType currentVideoType = this.c;
        return hashCode2 + (currentVideoType != null ? currentVideoType.hashCode() : 0);
    }

    public final String toString() {
        return "ContentData(contentId=" + this.a + ", streamType=" + this.b + ", videoType=" + this.c + ')';
    }
}
