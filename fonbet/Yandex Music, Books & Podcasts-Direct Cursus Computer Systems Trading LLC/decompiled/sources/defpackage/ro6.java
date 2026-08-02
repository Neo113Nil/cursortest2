package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.passport.common.ui.progress.i;
import com.yandex.passport.internal.ui.bouncer.roundabout.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class ro6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ro6(int i, int i2, Object obj, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
        this.d = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Resources.Theme theme;
        int i;
        switch (this.a) {
            case 0:
                Context context = (Context) this.d;
                ((Long) obj).getClass();
                context.getClass();
                TypedValue typedValue = new TypedValue();
                int i2 = this.b;
                if (i2 == 0) {
                    theme = context.getTheme();
                    theme.getClass();
                } else {
                    theme = new uf6(context, i2).getTheme();
                    theme.getClass();
                }
                theme.resolveAttribute(this.c, typedValue, true);
                return Integer.valueOf(typedValue.resourceId);
            case 1:
                m3m m3mVar = (m3m) this.d;
                j3m j3mVar = (j3m) obj;
                j3mVar.getClass();
                List list = j3mVar.b;
                int i3 = this.b;
                if (i3 < 0 || i3 >= list.size() || (i = this.c) < 0 || i >= list.size() || i3 == i) {
                    return j3mVar;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(i, (j1b) arrayList.remove(i3));
                return j3m.b(j3mVar, arrayList, m3mVar.a(arrayList), 1);
            case 2:
                i iVar = (i) this.d;
                Context context2 = (Context) obj;
                context2.getClass();
                LottieAnimationView lottieAnimationView = new LottieAnimationView(context2);
                lottieAnimationView.setRepeatCount(this.b);
                lottieAnimationView.setAnimation(this.c);
                lottieAnimationView.playAnimation();
                lottieAnimationView.addAnimatorListener(iVar);
                return lottieAnimationView;
            default:
                r rVar = (r) this.d;
                int intValue = ((Integer) obj).intValue();
                rVar.f = intValue;
                float f = this.b;
                int i4 = rVar.e;
                float f2 = i4;
                float f3 = f + f2;
                float paddingTop = intValue + f2 + (rVar.b() ? 0 : rVar.getPaddingTop());
                float f4 = this.c - f2;
                float bottom = rVar.getBottom();
                int paddingBottom = rVar.b() ? rVar.getPaddingBottom() + i4 : 0;
                float f5 = rVar.d;
                rVar.g = r.a(f3, paddingTop, f4, bottom - paddingBottom, f5, f5, !rVar.b());
                return Unit.a;
        }
    }

    public /* synthetic */ ro6(Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }
}
