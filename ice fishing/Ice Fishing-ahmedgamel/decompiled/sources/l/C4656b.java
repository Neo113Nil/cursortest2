package l;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import m.AbstractViewOnTouchListenerC4724s0;
import m.C4700g;
import m.C4702h;
import m.C4706j;
import m.C4708k;

/* renamed from: l.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4656b extends AbstractViewOnTouchListenerC4724s0 {

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ int f38683C = 0;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ View f38684D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4656b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f38684D = actionMenuItemView;
    }

    @Override // m.AbstractViewOnTouchListenerC4724s0
    public final InterfaceC4652C b() {
        C4700g c4700g;
        switch (this.f38683C) {
            case 0:
                AbstractC4657c abstractC4657c = ((ActionMenuItemView) this.f38684D).f4446F;
                if (abstractC4657c == null || (c4700g = ((C4702h) abstractC4657c).f39220a.f39237M) == null) {
                    return null;
                }
                return c4700g.a();
            default:
                C4700g c4700g2 = ((C4706j) this.f38684D).f39223w.f39236L;
                if (c4700g2 == null) {
                    return null;
                }
                return c4700g2.a();
        }
    }

    @Override // m.AbstractViewOnTouchListenerC4724s0
    public final boolean c() {
        InterfaceC4652C b9;
        switch (this.f38683C) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f38684D;
                l lVar = actionMenuItemView.f4444D;
                return lVar != null && lVar.a(actionMenuItemView.f4441A) && (b9 = b()) != null && b9.a();
            default:
                ((C4706j) this.f38684D).f39223w.l();
                return true;
        }
    }

    @Override // m.AbstractViewOnTouchListenerC4724s0
    public boolean d() {
        switch (this.f38683C) {
            case 1:
                C4708k c4708k = ((C4706j) this.f38684D).f39223w;
                if (c4708k.f39238N != null) {
                    return false;
                }
                c4708k.f();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4656b(C4706j c4706j, C4706j c4706j2) {
        super(c4706j2);
        this.f38684D = c4706j;
    }
}
