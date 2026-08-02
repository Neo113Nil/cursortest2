package defpackage;

import androidx.compose.ui.platform.AbstractComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import androidx.view.d;
import androidx.view.fragment.b;
import com.yandex.bricks.Brick;
import com.yandex.go.taxi.order.feed.ui.TaxiOrderFlexView;
import java.util.Iterator;
import ru.yandex.taxi.plus.purchase.PlusPurchaseView;
import ru.yandex.taxi.stories.presentation.story.StoryModalView;

/* loaded from: classes2.dex */
public final /* synthetic */ class wj6 implements q {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wj6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Brick brick = (Brick) obj;
                if (event == Lifecycle.Event.ON_DESTROY) {
                    brick.onActivityDestroy();
                    break;
                }
                break;
            case 1:
                ((wls) obj).invoke(peyVar, event);
                break;
            case 2:
                b bVar = (b) obj;
                if (event == Lifecycle.Event.ON_DESTROY) {
                    Fragment fragment = (Fragment) peyVar;
                    Object obj2 = null;
                    for (Object obj3 : (Iterable) bVar.b().f.a.getValue()) {
                        if (jl40.l(((androidx.view.b) obj3).y, fragment.getTag())) {
                            obj2 = obj3;
                        }
                    }
                    androidx.view.b bVar2 = (androidx.view.b) obj2;
                    if (bVar2 != null) {
                        if (b.n()) {
                            bVar2.toString();
                            peyVar.toString();
                        }
                        bVar.b().b(bVar2);
                        break;
                    }
                }
                break;
            case 3:
                d dVar = (d) obj;
                dVar.q = event.a();
                if (dVar.c != null) {
                    Iterator<E> it = dVar.g.iterator();
                    while (it.hasNext()) {
                        androidx.view.b bVar3 = (androidx.view.b) it.next();
                        bVar3.getClass();
                        bVar3.w = event.a();
                        bVar3.c();
                    }
                    break;
                }
                break;
            case 4:
                PlusPurchaseView.lifecycleObserver$lambda$0((PlusPurchaseView) obj, peyVar, event);
                break;
            case 5:
                ((tcp0) obj).b.g(event);
                break;
            case 6:
                ins0 ins0Var = (ins0) obj;
                if (event == Lifecycle.Event.ON_DESTROY) {
                    ins0Var.h();
                    break;
                }
                break;
            case 7:
                StoryModalView.lifecycleObserver$lambda$0((StoryModalView) obj, peyVar, event);
                break;
            case 8:
                TaxiOrderFlexView.lifecycleListener$lambda$0((TaxiOrderFlexView) obj, peyVar, event);
                break;
            default:
                AbstractComposeView abstractComposeView = (AbstractComposeView) obj;
                if (event == Lifecycle.Event.ON_DESTROY) {
                    abstractComposeView.disposeComposition();
                    break;
                }
                break;
        }
    }
}
