package defpackage;

import androidx.fragment.app.Fragment;
import ru.yandex.taxi.fragment.YandexTaxiFragment;
import ru.yandex.taxi.ui.FragmentBackground;

/* loaded from: classes10.dex */
public final class ybs {
    public static FragmentBackground a(Fragment fragment) {
        return fragment instanceof YandexTaxiFragment ? ((YandexTaxiFragment) fragment).getBackground() : FragmentBackground.BLANK;
    }
}
