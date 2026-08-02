package defpackage;

import android.view.ViewTreeObserver;
import com.yandex.passport.internal.widget.KeyboardDetectorLayout;
import com.yandex.passport.legacy.f;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class oqj implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ oqj(Function0 function0) {
        this.b = (uif) function0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((Boolean) ((uif) obj).invoke()).booleanValue();
            default:
                KeyboardDetectorLayout keyboardDetectorLayout = (KeyboardDetectorLayout) obj;
                int i2 = KeyboardDetectorLayout.d;
                int height = keyboardDetectorLayout.getRootView().getHeight() - keyboardDetectorLayout.getMeasuredHeight();
                int b = f.b(keyboardDetectorLayout.getContext(), keyboardDetectorLayout.getResources().getConfiguration().orientation == 2 ? 140 : 200);
                boolean z = keyboardDetectorLayout.a != height;
                boolean z2 = height > b;
                keyboardDetectorLayout.c = z2;
                keyboardDetectorLayout.a = height;
                if (z) {
                    keyboardDetectorLayout.c = z2;
                    Iterator it = keyboardDetectorLayout.b.iterator();
                    while (it.hasNext()) {
                        ((Function1) it.next()).invoke(Boolean.valueOf(z2));
                    }
                }
                if (z) {
                    keyboardDetectorLayout.requestLayout();
                }
                return !z;
        }
    }
}
