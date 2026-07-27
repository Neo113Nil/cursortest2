package l;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import m.AbstractViewOnTouchListenerC4759s0;
import m.C4735g;
import m.C4737h;
import m.C4741j;
import m.C4743k;

/* renamed from: l.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4674b extends AbstractViewOnTouchListenerC4759s0 {

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ int f38900C = 0;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ View f38901D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4674b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f38901D = actionMenuItemView;
    }

    @Override // m.AbstractViewOnTouchListenerC4759s0
    public final InterfaceC4670B b() {
        C4735g c4735g;
        switch (this.f38900C) {
            case 0:
                AbstractC4675c abstractC4675c = ((ActionMenuItemView) this.f38901D).f4593F;
                if (abstractC4675c == null || (c4735g = ((C4737h) abstractC4675c).f39422a.f39439M) == null) {
                    return null;
                }
                return c4735g.a();
            default:
                C4735g c4735g2 = ((C4741j) this.f38901D).f39425w.f39438L;
                if (c4735g2 == null) {
                    return null;
                }
                return c4735g2.a();
        }
    }

    @Override // m.AbstractViewOnTouchListenerC4759s0
    public final boolean c() {
        InterfaceC4670B b9;
        switch (this.f38900C) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f38901D;
                k kVar = actionMenuItemView.f4591D;
                return kVar != null && kVar.a(actionMenuItemView.f4588A) && (b9 = b()) != null && b9.a();
            default:
                ((C4741j) this.f38901D).f39425w.l();
                return true;
        }
    }

    @Override // m.AbstractViewOnTouchListenerC4759s0
    public boolean d() {
        switch (this.f38900C) {
            case 1:
                C4743k c4743k = ((C4741j) this.f38901D).f39425w;
                if (c4743k.f39440N != null) {
                    return false;
                }
                c4743k.f();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4674b(C4741j c4741j, C4741j c4741j2) {
        super(c4741j2);
        this.f38901D = c4741j;
    }
}
