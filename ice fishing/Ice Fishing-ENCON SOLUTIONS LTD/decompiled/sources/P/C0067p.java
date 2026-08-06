package P;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: P.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0067p extends L.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1365b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0067p(w wVar, int i2) {
        super(wVar);
        this.f1365b = i2;
    }

    @Override // L.b
    public final int b(View view) {
        switch (this.f1365b) {
            case 0:
                x xVar = (x) view.getLayoutParams();
                ((w) this.f1058a).getClass();
                return view.getRight() + ((x) view.getLayoutParams()).f1379a.right + ((ViewGroup.MarginLayoutParams) xVar).rightMargin;
            default:
                x xVar2 = (x) view.getLayoutParams();
                ((w) this.f1058a).getClass();
                return view.getBottom() + ((x) view.getLayoutParams()).f1379a.bottom + ((ViewGroup.MarginLayoutParams) xVar2).bottomMargin;
        }
    }

    @Override // L.b
    public final int c(View view) {
        switch (this.f1365b) {
            case 0:
                x xVar = (x) view.getLayoutParams();
                ((w) this.f1058a).getClass();
                return (view.getLeft() - ((x) view.getLayoutParams()).f1379a.left) - ((ViewGroup.MarginLayoutParams) xVar).leftMargin;
            default:
                x xVar2 = (x) view.getLayoutParams();
                ((w) this.f1058a).getClass();
                return (view.getTop() - ((x) view.getLayoutParams()).f1379a.top) - ((ViewGroup.MarginLayoutParams) xVar2).topMargin;
        }
    }

    @Override // L.b
    public final int d() {
        switch (this.f1365b) {
            case 0:
                w wVar = (w) this.f1058a;
                return wVar.f1377f - wVar.t();
            default:
                w wVar2 = (w) this.f1058a;
                return wVar2.f1378g - wVar2.r();
        }
    }

    @Override // L.b
    public final int e() {
        switch (this.f1365b) {
            case 0:
                return ((w) this.f1058a).s();
            default:
                return ((w) this.f1058a).u();
        }
    }

    @Override // L.b
    public final int f() {
        switch (this.f1365b) {
            case 0:
                w wVar = (w) this.f1058a;
                return (wVar.f1377f - wVar.s()) - wVar.t();
            default:
                w wVar2 = (w) this.f1058a;
                return (wVar2.f1378g - wVar2.u()) - wVar2.r();
        }
    }
}
