package d;

import org.fortheloss.st.MainActivity;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1486g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ MainActivity f1487h;

    public /* synthetic */ e(MainActivity mainActivity, int i10) {
        this.f1486g = i10;
        this.f1487h = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1486g) {
            case 0:
                this.f1487h.invalidateOptionsMenu();
                break;
            default:
                o.f(this.f1487h);
                break;
        }
    }
}
