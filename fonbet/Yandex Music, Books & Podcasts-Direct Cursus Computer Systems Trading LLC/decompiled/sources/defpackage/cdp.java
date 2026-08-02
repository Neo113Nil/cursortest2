package defpackage;

import android.content.Context;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class cdp extends y9g {
    public final Context C;
    public final bdp D;

    public cdp(Context context) {
        super(context, null, R.attr.listPopupWindowStyle, 0);
        this.C = context;
        this.D = new bdp(this);
    }

    @Override // defpackage.y9g, defpackage.keq
    public final void f() {
        if (this.c == null) {
            super.f();
            nra nraVar = this.c;
            if (nraVar != null) {
                nraVar.setChoiceMode(1);
            }
        }
        super.f();
    }
}
