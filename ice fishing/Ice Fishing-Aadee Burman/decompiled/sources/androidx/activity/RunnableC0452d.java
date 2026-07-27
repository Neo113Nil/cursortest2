package androidx.activity;

/* renamed from: androidx.activity.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0452d implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4441n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p f4442u;

    public /* synthetic */ RunnableC0452d(p pVar, int i) {
        this.f4441n = i;
        this.f4442u = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4441n) {
            case 0:
                this.f4442u.invalidateMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e9) {
                    if (!kotlin.jvm.internal.h.a(e9.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e9;
                    }
                    return;
                } catch (NullPointerException e10) {
                    if (!kotlin.jvm.internal.h.a(e10.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e10;
                    }
                    return;
                }
        }
    }
}
