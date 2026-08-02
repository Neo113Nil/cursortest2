package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class oif implements kd {
    public final /* synthetic */ Context a;

    public /* synthetic */ oif(Context context) {
        this.a = context;
    }

    @Override // defpackage.kd
    /* renamed from: b */
    public void mo33b(Object obj) {
        Throwable th = (Throwable) obj;
        if (th != null) {
            new lum(this.a).Q(th);
        }
    }
}
