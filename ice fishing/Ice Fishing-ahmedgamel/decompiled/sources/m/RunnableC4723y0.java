package m;

/* renamed from: m.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4723y0 implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39268n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ B0 f39269u;

    public /* synthetic */ RunnableC4723y0(B0 b02, int i) {
        this.f39268n = i;
        this.f39269u = b02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39268n) {
            case 0:
                C4706p0 c4706p0 = this.f39269u.f38988v;
                if (c4706p0 != null) {
                    c4706p0.setListSelectionHidden(true);
                    c4706p0.requestLayout();
                    break;
                }
                break;
            default:
                B0 b02 = this.f39269u;
                C4706p0 c4706p02 = b02.f38988v;
                if (c4706p02 != null && c4706p02.isAttachedToWindow() && b02.f38988v.getCount() > b02.f38988v.getChildCount() && b02.f38988v.getChildCount() <= b02.f38973F) {
                    b02.f38985S.setInputMethodMode(2);
                    b02.show();
                    break;
                }
                break;
        }
    }
}
