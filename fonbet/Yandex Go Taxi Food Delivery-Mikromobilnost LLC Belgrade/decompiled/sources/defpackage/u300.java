package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import ru.yandex.taxi.fragment.YandexTaxiFragment;
import ru.yandex.taxi.settings.activity.MenuButtonAttachStateChangeListener;

/* loaded from: classes9.dex */
public final class u300 extends dl40 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u300(int i, Object obj) {
        super(0);
        this.c = i;
        this.w = obj;
    }

    @Override // defpackage.dl40, defpackage.el40
    public final boolean satisfiesClickDelay() {
        hcs hcsVar;
        int i = this.c;
        Object obj = this.w;
        switch (i) {
            case 0:
                Fragment E = ((FragmentManager) obj).E(fjh0.fragment_host);
                if (!(E instanceof YandexTaxiFragment) || ((YandexTaxiFragment) E).satisfiesClickDelay()) {
                    break;
                }
                break;
            default:
                hcsVar = ((MenuButtonAttachStateChangeListener) obj).fragmentHostProvider;
                Fragment a = ((ics) hcsVar).a();
                if (!(a instanceof YandexTaxiFragment) || ((YandexTaxiFragment) a).satisfiesClickDelay()) {
                    break;
                }
                break;
        }
        return super.satisfiesClickDelay();
    }
}
