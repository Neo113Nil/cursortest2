package l;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import m.AbstractViewOnTouchListenerC0282u0;
import m.C0254g;
import m.C0256h;
import m.C0260j;
import m.C0264l;

/* renamed from: l.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0218b extends AbstractViewOnTouchListenerC0282u0 {
    public final /* synthetic */ int j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f3664k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0218b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f3664k = actionMenuItemView;
    }

    @Override // m.AbstractViewOnTouchListenerC0282u0
    public final InterfaceC0214C b() {
        C0254g c0254g;
        switch (this.j) {
            case 0:
                AbstractC0219c abstractC0219c = ((ActionMenuItemView) this.f3664k).f1748m;
                if (abstractC0219c == null || (c0254g = ((C0256h) abstractC0219c).f3948a.f3976u) == null) {
                    return null;
                }
                return c0254g.a();
            default:
                C0254g c0254g2 = ((C0260j) this.f3664k).f3957d.f3975t;
                if (c0254g2 == null) {
                    return null;
                }
                return c0254g2.a();
        }
    }

    @Override // m.AbstractViewOnTouchListenerC0282u0
    public final boolean c() {
        InterfaceC0214C b2;
        switch (this.j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f3664k;
                InterfaceC0228l interfaceC0228l = actionMenuItemView.f1746k;
                return interfaceC0228l != null && interfaceC0228l.b(actionMenuItemView.f1745h) && (b2 = b()) != null && b2.a();
            default:
                ((C0260j) this.f3664k).f3957d.o();
                return true;
        }
    }

    @Override // m.AbstractViewOnTouchListenerC0282u0
    public boolean d() {
        switch (this.j) {
            case 1:
                C0264l c0264l = ((C0260j) this.f3664k).f3957d;
                if (c0264l.f3977v != null) {
                    return false;
                }
                c0264l.c();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0218b(C0260j c0260j, C0260j c0260j2) {
        super(c0260j2);
        this.f3664k = c0260j;
    }
}
