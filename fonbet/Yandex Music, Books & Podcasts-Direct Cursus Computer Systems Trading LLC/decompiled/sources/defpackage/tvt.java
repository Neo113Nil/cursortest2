package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.yandex.plus.home.dailyquests.feature.internal.utils.e;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class tvt implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ View b;
    public final /* synthetic */ Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ tvt(View view, Function1 function1) {
        this.b = view;
        this.c = (uif) function1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.a) {
            case 0:
                ?? r0 = (uif) this.c;
                View view = this.b;
                view.getClass();
                int visibility = view.getVisibility();
                ViewParent parent = view.getParent();
                parent.getClass();
                int visibility2 = ((ViewGroup) parent).getVisibility();
                Object tag = view.getTag();
                Pair pair = tag instanceof Pair ? (Pair) tag : null;
                if (pair == null) {
                    pair = new Pair(null, null);
                }
                Integer num = (Integer) pair.a;
                Integer num2 = (Integer) pair.b;
                if (num == null || num.intValue() != visibility || num2 == null || visibility2 != num2.intValue()) {
                    view.setTag(new Pair(Integer.valueOf(visibility), Integer.valueOf(visibility2)));
                    r0.invoke(view);
                    break;
                }
                break;
            default:
                ((e) this.c).c(this.b);
                break;
        }
    }

    public /* synthetic */ tvt(e eVar, View view) {
        this.c = eVar;
        this.b = view;
    }
}
