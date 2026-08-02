package defpackage;

import android.content.Context;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes14.dex */
public final class wx7 {
    public final Context a;
    public final pav b;
    public final j1 c;
    public final rk6 d;

    public wx7(Context context, pav pavVar, j1 j1Var, rk6 rk6Var) {
        this.a = context;
        this.b = pavVar;
        this.c = j1Var;
        this.d = rk6Var;
    }

    public final void a(ListItemComponent listItemComponent, yw7 yw7Var) {
        listItemComponent.setTitle(yw7Var.getTitle());
        listItemComponent.setSubtitle(yw7Var.m());
        nac nacVar = (nac) this.b.a(listItemComponent.getLeadImageView());
        nacVar.a();
        nacVar.c(yw7Var.c());
    }
}
