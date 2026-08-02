package defpackage;

import com.yandex.go.flex.common.api.FeedSdkTheme;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes6.dex */
public final class ro30 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo30 b;

    public /* synthetic */ ro30(bo30 bo30Var, int i) {
        this.a = i;
        this.b = bo30Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        FeedSdkTheme feedSdkTheme;
        Object b;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        bo30 bo30Var = this.b;
        switch (i) {
            case 0:
                pvy0 pvy0Var = (pvy0) ((xvf0) ((s14) bo30Var).m).get();
                int i2 = arq.a[((ThemeType) obj).ordinal()];
                if (i2 == 1) {
                    feedSdkTheme = FeedSdkTheme.DARK;
                } else {
                    if (i2 != 2) {
                        w511.b();
                        return null;
                    }
                    feedSdkTheme = FeedSdkTheme.LIGHT;
                }
                pvy0Var.a(feedSdkTheme.getId());
                return zy11Var;
            default:
                return (((Boolean) obj).booleanValue() && (b = ((s14) bo30Var).a().b(continuation)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? b : zy11Var;
        }
    }
}
