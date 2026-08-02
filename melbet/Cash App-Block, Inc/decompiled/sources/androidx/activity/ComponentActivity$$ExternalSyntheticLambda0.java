package androidx.activity;

/* loaded from: classes.dex */
public final /* synthetic */ class ComponentActivity$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ComponentActivity f$0;

    public /* synthetic */ ComponentActivity$$ExternalSyntheticLambda0(ComponentActivity componentActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = componentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        ComponentActivity componentActivity = this.f$0;
        switch (i) {
            case 0:
                int i2 = ComponentActivity.$r8$clinit;
                componentActivity.invalidateMenu();
                break;
            default:
                ComponentActivity.$r8$lambda$vCwjfXDiSGcirCy4I008VOiJ_lw(componentActivity);
                break;
        }
    }
}
