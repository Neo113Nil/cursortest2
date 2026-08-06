package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class so extends View {
    public final /* synthetic */ l6 OOA6hdeuvCS;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so(l6 l6Var, Context context) {
        super(context);
        this.OOA6hdeuvCS = l6Var;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        this.OOA6hdeuvCS.run();
    }
}
