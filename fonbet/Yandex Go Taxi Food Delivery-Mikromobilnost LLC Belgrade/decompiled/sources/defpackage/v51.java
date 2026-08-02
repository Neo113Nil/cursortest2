package defpackage;

import com.yandex.go.address.search.common.presenter.b;
import com.yandex.go.navigator.main_screen.MainModalAddressShortcutsInteractor$offerDestinationZeroSuggestBySourcePointChangeFlow$2$1$invokeSuspend$$inlined$suspendCallbackApi$2;
import java.util.ArrayList;
import java.util.function.Consumer;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes12.dex */
public final class v51 implements Consumer {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ v51(mf1 mf1Var, fs5 fs5Var) {
        this.a = 9;
        this.b = fs5Var;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    ((w51) obj2).sh(th);
                    break;
                }
                break;
            case 1:
                ((j1) obj2).invoke(obj);
                break;
            case 2:
                ((i61) obj2).F5((pv0) obj);
                break;
            case 3:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj2;
                Consumer consumer = (Consumer) ref$ObjectRef.element;
                ref$ObjectRef.element = null;
                if (consumer != null) {
                    consumer.accept(obj);
                    break;
                }
                break;
            case 4:
                ((MainModalAddressShortcutsInteractor$offerDestinationZeroSuggestBySourcePointChangeFlow$2$1$invokeSuspend$$inlined$suspendCallbackApi$2) obj2).invoke(null);
                break;
            case 5:
                ((j1) obj2).invoke(obj);
                break;
            case 6:
                ((oav0) obj2).invoke(obj);
                break;
            case 7:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    ((b) obj2).sh(th2);
                    break;
                }
                break;
            case 8:
                ((u7f0) obj2).onProductDetailsResponse((ns5) obj, new ArrayList());
                break;
            case 9:
                ((fs5) obj2).c((ns5) obj);
                break;
            default:
                ((fs5) obj2).a((ns5) obj);
                break;
        }
    }

    public /* synthetic */ v51(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
