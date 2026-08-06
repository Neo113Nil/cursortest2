package defpackage;

/* loaded from: classes.dex */
public final class mp1 extends android.database.ContentObserver {
    public final /* synthetic */ defpackage.x9 IHQe1A4L2xu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp1(defpackage.x9 x9Var, android.os.Handler handler) {
        super(handler);
        this.IHQe1A4L2xu = x9Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, android.net.Uri uri) {
        this.IHQe1A4L2xu.riuEU0zW4(defpackage.ok1.IHQe1A4L2xu);
    }
}
