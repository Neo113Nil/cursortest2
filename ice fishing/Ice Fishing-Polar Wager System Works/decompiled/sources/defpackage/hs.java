package defpackage;

/* loaded from: classes.dex */
public final class hs extends android.view.View {
    public final /* synthetic */ defpackage.z7 adDC3e2L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs(defpackage.z7 z7Var, android.content.Context context) {
        super(context);
        this.adDC3e2L = z7Var;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        configuration.getClass();
        this.adDC3e2L.run();
    }
}
