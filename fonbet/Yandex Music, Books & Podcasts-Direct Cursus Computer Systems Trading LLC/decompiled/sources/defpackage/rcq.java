package defpackage;

import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class rcq implements df5 {
    public final w2u a;

    public rcq(w2u w2uVar) {
        this.a = w2uVar;
    }

    @Override // defpackage.cf5
    public final int c() {
        return R.drawable.ic_track_24;
    }

    @Override // defpackage.cf5
    public final String e() {
        return "dialog_action_move_to_track";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rcq) && equals(((rcq) obj).a);
    }

    @Override // defpackage.cf5
    public final int getText() {
        return R.string.videoclip_bottomsheet_move_to_track;
    }

    public final int hashCode() {
        return hashCode();
    }

    public final String toString() {
        return "SheetMoveToTrackActionUiData(action=" + this.a + ")";
    }
}
