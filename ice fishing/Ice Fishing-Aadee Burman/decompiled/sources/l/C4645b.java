package l;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import m.AbstractViewOnTouchListenerC4711s0;
import m.C4687g;
import m.C4689h;
import m.C4693j;
import m.C4695k;

/* renamed from: l.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4645b extends AbstractViewOnTouchListenerC4711s0 {

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ int f38756C = 0;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ View f38757D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4645b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f38757D = actionMenuItemView;
    }

    @Override // m.AbstractViewOnTouchListenerC4711s0
    public final InterfaceC4641C b() {
        C4687g c4687g;
        switch (this.f38756C) {
            case 0:
                AbstractC4646c abstractC4646c = ((ActionMenuItemView) this.f38757D).f4478F;
                if (abstractC4646c == null || (c4687g = ((C4689h) abstractC4646c).f39151a.f39168M) == null) {
                    return null;
                }
                return c4687g.a();
            default:
                C4687g c4687g2 = ((C4693j) this.f38757D).f39154w.f39167L;
                if (c4687g2 == null) {
                    return null;
                }
                return c4687g2.a();
        }
    }

    @Override // m.AbstractViewOnTouchListenerC4711s0
    public final boolean c() {
        InterfaceC4641C b9;
        switch (this.f38756C) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f38757D;
                l lVar = actionMenuItemView.f4476D;
                return lVar != null && lVar.a(actionMenuItemView.f4473A) && (b9 = b()) != null && b9.a();
            default:
                ((C4693j) this.f38757D).f39154w.l();
                return true;
        }
    }

    @Override // m.AbstractViewOnTouchListenerC4711s0
    public boolean d() {
        switch (this.f38756C) {
            case 1:
                C4695k c4695k = ((C4693j) this.f38757D).f39154w;
                if (c4695k.f39169N != null) {
                    return false;
                }
                c4695k.f();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4645b(C4693j c4693j, C4693j c4693j2) {
        super(c4693j2);
        this.f38757D = c4693j;
    }
}
