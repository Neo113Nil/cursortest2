package t3;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import y3.InterfaceC5240h;
import y3.i;

/* renamed from: t3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5039b extends S0.f {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f40858n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f40859u;

    public /* synthetic */ C5039b(int i, Object obj) {
        this.f40858n = i;
        this.f40859u = obj;
    }

    @Override // S0.f
    public final void p(int i) {
        switch (this.f40858n) {
            case 0:
                break;
            default:
                i iVar = (i) this.f40859u;
                iVar.f41919d = true;
                InterfaceC5240h interfaceC5240h = (InterfaceC5240h) iVar.f41920e.get();
                if (interfaceC5240h != null) {
                    f fVar = (f) interfaceC5240h;
                    fVar.u();
                    fVar.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // S0.f
    public final void q(Typeface typeface, boolean z3) {
        switch (this.f40858n) {
            case 0:
                Chip chip = (Chip) this.f40859u;
                f fVar = chip.f35929x;
                chip.setText(fVar.f40906i1 ? fVar.f40893X : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z3) {
                    i iVar = (i) this.f40859u;
                    iVar.f41919d = true;
                    InterfaceC5240h interfaceC5240h = (InterfaceC5240h) iVar.f41920e.get();
                    if (interfaceC5240h != null) {
                        f fVar2 = (f) interfaceC5240h;
                        fVar2.u();
                        fVar2.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }

    private final void z(int i) {
    }
}
