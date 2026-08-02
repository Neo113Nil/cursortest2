package defpackage;

import android.view.View;
import com.yandex.go.mainscreen.superapp.api.sidepager.MainSidePagerSidePage;
import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.SuperAppMainScreenFlexModalView;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class v1w0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ SuperAppMainScreenFlexModalView b;

    public /* synthetic */ v1w0(SuperAppMainScreenFlexModalView superAppMainScreenFlexModalView, int i) {
        this.a = i;
        this.b = superAppMainScreenFlexModalView;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        SuperAppMainScreenFlexModalView superAppMainScreenFlexModalView = this.b;
        switch (i) {
            case 0:
                superAppMainScreenFlexModalView.applySidePagerState((MainSidePagerSidePage) obj);
                break;
            default:
                superAppMainScreenFlexModalView.onRecyclerViewAttached((View) obj);
                break;
        }
        return zy11Var;
    }
}
