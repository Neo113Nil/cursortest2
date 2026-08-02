package m;

/* renamed from: m.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4736y0 implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39337n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ B0 f39338u;

    public /* synthetic */ RunnableC4736y0(B0 b02, int i) {
        this.f39337n = i;
        this.f39338u = b02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39337n) {
            case 0:
                C4719p0 c4719p0 = this.f39338u.f39056v;
                if (c4719p0 != null) {
                    c4719p0.setListSelectionHidden(true);
                    c4719p0.requestLayout();
                    break;
                }
                break;
            default:
                B0 b02 = this.f39338u;
                C4719p0 c4719p02 = b02.f39056v;
                if (c4719p02 != null && c4719p02.isAttachedToWindow() && b02.f39056v.getCount() > b02.f39056v.getChildCount() && b02.f39056v.getChildCount() <= b02.f39041F) {
                    b02.f39053S.setInputMethodMode(2);
                    b02.show();
                    break;
                }
                break;
        }
    }
}
