package defpackage;

import com.yandex.go.taxi.main.ShortcutsMainScreen;
import java.util.function.Consumer;
import ru.yandex.taxi.multiexit.MultiexitModalView;
import ru.yandex.taxi.widget.modalview.ModalViewCoordinator$StackChangeType;

/* loaded from: classes14.dex */
public final /* synthetic */ class sq40 implements v030 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sq40(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.v030
    public final void a(u45 u45Var, u45 u45Var2, ModalViewCoordinator$StackChangeType modalViewCoordinator$StackChangeType) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                uq40 uq40Var = (uq40) obj2;
                qq40 qq40Var = (qq40) obj;
                if ((u45Var instanceof MultiexitModalView) && modalViewCoordinator$StackChangeType.a()) {
                    uq40Var.I = null;
                    uq40Var.J.cancel();
                    uq40Var.g.Lc(MultiexitModalView.class, null);
                    qq40Var.run();
                    break;
                }
                break;
            default:
                ShortcutsMainScreen.ensureMainModalView$lambda$0((ShortcutsMainScreen) obj2, (Consumer) obj, u45Var, u45Var2, modalViewCoordinator$StackChangeType);
                break;
        }
    }
}
