package m;

/* loaded from: classes.dex */
public final class A0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3790a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E0 f3791b;

    public /* synthetic */ A0(E0 e02, int i) {
        this.f3790a = i;
        this.f3791b = e02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3790a) {
            case 0:
                C0276r0 c0276r0 = this.f3791b.f3808c;
                if (c0276r0 != null) {
                    c0276r0.setListSelectionHidden(true);
                    c0276r0.requestLayout();
                    break;
                }
                break;
            default:
                E0 e02 = this.f3791b;
                C0276r0 c0276r02 = e02.f3808c;
                if (c0276r02 != null && c0276r02.isAttachedToWindow() && e02.f3808c.getCount() > e02.f3808c.getChildCount() && e02.f3808c.getChildCount() <= e02.f3815m) {
                    e02.f3828z.setInputMethodMode(2);
                    e02.c();
                    break;
                }
                break;
        }
    }
}
