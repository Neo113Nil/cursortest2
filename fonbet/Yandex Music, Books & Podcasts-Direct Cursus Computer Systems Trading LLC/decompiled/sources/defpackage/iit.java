package defpackage;

import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class iit extends xe implements ddq {
    public final qbq c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public iit(tqs tqsVar, cf cfVar) {
        super(new xb5(tqsVar, new jsg(R.drawable.ic_dislike_24, 5), r4, new jsg(R.drawable.ic_dislike_24, 5), Integer.valueOf(R.string.dialog_action_description_undislike), cfVar, Integer.valueOf(R.attr.iconLike), null, new jsg(R.string.accessibility_uncheck_action, 15), 3840), r0);
        dh dhVar = dh.q;
        cfVar.getClass();
        jsg jsgVar = new jsg(R.string.menu_element_dislike, 15);
        this.c = pbq.a;
    }

    @Override // defpackage.sbb
    public final qbq getOrder() {
        return this.c;
    }
}
