package defpackage;

import defpackage.shs;
import java.util.List;
import java.util.function.BiConsumer;
import ru.yandex.taxi.banners.presentation.fullscreen.FullScreenBannerPage;
import ru.yandex.taxi.preorder.CameraAnimationUpdateType;
import ru.yandex.taxi.preorder.source.SourcePointFragment;

/* loaded from: classes10.dex */
public final /* synthetic */ class th5 implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ th5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        boolean z;
        eht0 eht0Var;
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((wls) obj3).invoke(obj, obj2);
                break;
            case 1:
                ((uh5) obj3).invoke(obj, obj2);
                break;
            case 2:
                ((j9a) obj3).invoke(obj, obj2);
                break;
            case 3:
                ((mjf) obj3).invoke(obj, obj2);
                break;
            case 4:
                ((rb0) obj3).invoke(obj, obj2);
                break;
            case 5:
                ((mjf) obj3).invoke(obj, obj2);
                break;
            case 6:
                ((loj) obj3).invoke(obj, obj2);
                break;
            case 7:
                whs whsVar = (whs) obj3;
                int intValue = ((Integer) obj).intValue();
                FullScreenBannerPage fullScreenBannerPage = (FullScreenBannerPage) obj2;
                List list = whsVar.c.l;
                z = whsVar.k.isRtl;
                if (z) {
                    intValue = (whsVar.b() - 1) - intValue;
                }
                fullScreenBannerPage.setData((shs.a) list.get(intValue));
                break;
            case 8:
                ((ziy) obj3).a(((Integer) obj).intValue(), ((Integer) obj2).intValue());
                break;
            case 9:
                ((s0v) obj3).invoke(obj, obj2);
                break;
            case 10:
                ((gxm) obj3).invoke(obj, obj2);
                break;
            case 11:
                ((arm0) obj3).invoke(obj, obj2);
                break;
            case 12:
                eht0Var = ((SourcePointFragment) obj3).presenter;
                eht0Var.S.b((CameraAnimationUpdateType) obj2);
                break;
            default:
                ((l131) obj3).invoke(obj, obj2);
                break;
        }
    }
}
