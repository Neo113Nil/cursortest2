package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class w5 implements defpackage.vz {
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ android.content.Context xiZrDbcSW0;

    public /* synthetic */ w5(android.content.Context context, int i) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = context;
    }

    @Override // defpackage.vz
    public final java.lang.Object IHQe1A4L2xu() {
        int i = this.adDC3e2L;
        android.content.Context context = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                return new java.io.File(context.getApplicationContext().getFilesDir(), "datastore/".concat("settings".concat(".preferences_pb")));
            default:
                return defpackage.a70.AARZUJiTa(context);
        }
    }
}
