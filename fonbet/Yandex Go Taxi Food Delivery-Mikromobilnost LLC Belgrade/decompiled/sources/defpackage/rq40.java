package defpackage;

import java.util.function.BiConsumer;
import ru.yandex.taxi.preorder.CameraAnimationUpdateType;

/* loaded from: classes6.dex */
public final /* synthetic */ class rq40 implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ uq40 b;

    public /* synthetic */ rq40(uq40 uq40Var, int i) {
        this.a = i;
        this.b = uq40Var;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i = this.a;
        uq40 uq40Var = this.b;
        Boolean bool = (Boolean) obj;
        CameraAnimationUpdateType cameraAnimationUpdateType = (CameraAnimationUpdateType) obj2;
        switch (i) {
            case 0:
                uq40Var.z.b(cameraAnimationUpdateType);
                if (bool.booleanValue()) {
                    uq40Var.E.a = null;
                    break;
                }
                break;
            default:
                uq40Var.z.b(cameraAnimationUpdateType);
                if (bool.booleanValue()) {
                    uq40Var.z.g();
                    uq40Var.E.a = null;
                    if (uq40Var.k.c().b() != null) {
                        uq40Var.y.b();
                        break;
                    }
                }
                break;
        }
    }
}
