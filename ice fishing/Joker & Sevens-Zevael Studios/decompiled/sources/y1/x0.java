package y1;

import org.fortheloss.st.MainActivity;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class x0 extends a {

    /* renamed from: o, reason: collision with root package name */
    public final m0.l1 f8676o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8677p;

    public x0(MainActivity mainActivity) {
        super(mainActivity, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        f1.e eVar = new f1.e(4, this);
        addOnAttachStateChangeListener(eVar);
        x7.f fVar = new x7.f();
        bc.a0.p(this).f5045a.add(fVar);
        this.f8461k = new a0.l(this, eVar, fVar, 4);
        this.f8676o = m0.z.s(null);
    }

    @Override // y1.a
    public final void a(int i10, m0.r rVar) {
        rVar.Z(420213850);
        int i11 = (rVar.h(this) ? 4 : 2) | i10;
        if (rVar.P(i11 & 1, (i11 & 3) != 2)) {
            oc.e eVar = (oc.e) this.f8676o.getValue();
            if (eVar == null) {
                rVar.X(-1238798753);
            } else {
                rVar.X(98586082);
                eVar.invoke(rVar, 0);
            }
            rVar.q(false);
        } else {
            rVar.S();
        }
        m0.x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new a1.g(i10, 8, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return x0.class.getName();
    }

    @Override // y1.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f8677p;
    }

    public final void setContent(oc.e eVar) {
        this.f8677p = true;
        this.f8676o.setValue(eVar);
        if (isAttachedToWindow()) {
            if (this.f8460j == null && !isAttachedToWindow()) {
                throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
            c();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
