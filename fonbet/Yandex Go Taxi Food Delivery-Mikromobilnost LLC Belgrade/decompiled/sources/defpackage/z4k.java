package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.suggest.impl.view.FullscreenSuperappSuggestModalView;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class z4k implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z4k(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Iterator it = ((List) obj).iterator();
                while (true) {
                    boolean z2 = false;
                    while (it.hasNext()) {
                        if (((Boolean) ((wls) it.next()).invoke(view, motionEvent)).booleanValue() || z2) {
                            z2 = true;
                        }
                    }
                    return z2;
                    break;
                }
            default:
                z = FullscreenSuperappSuggestModalView.setupFloatingInputField$lambda$1$1((GoFrameLayout) obj, view, motionEvent);
                return z;
        }
    }
}
