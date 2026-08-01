package t3;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import y3.InterfaceC5240h;
import y3.i;

/* renamed from: t3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5039b extends S0.f {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f40861n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f40862u;

    public /* synthetic */ C5039b(int i, Object obj) {
        this.f40861n = i;
        this.f40862u = obj;
    }

    @Override // S0.f
    public final void p(int i) {
        switch (this.f40861n) {
            case 0:
                break;
            default:
                i iVar = (i) this.f40862u;
                iVar.f41922d = true;
                InterfaceC5240h interfaceC5240h = (InterfaceC5240h) iVar.f41923e.get();
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
        switch (this.f40861n) {
            case 0:
                Chip chip = (Chip) this.f40862u;
                f fVar = chip.f35929x;
                chip.setText(fVar.f40909i1 ? fVar.f40896X : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z3) {
                    i iVar = (i) this.f40862u;
                    iVar.f41922d = true;
                    InterfaceC5240h interfaceC5240h = (InterfaceC5240h) iVar.f41923e.get();
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
