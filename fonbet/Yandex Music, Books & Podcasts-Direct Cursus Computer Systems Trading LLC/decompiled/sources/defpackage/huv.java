package defpackage;

import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class huv {
    public final Integer a;
    public final Integer b;

    public huv(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof huv)) {
            return false;
        }
        huv huvVar = (huv) obj;
        return Intrinsics.d(this.a, huvVar.a) && Intrinsics.d(this.b, huvVar.b);
    }

    public final int hashCode() {
        int a = f1d.a(R.drawable.ic_arrow_android_back_24, f1d.a(R.drawable.ic_sound_on_24, f1d.a(R.drawable.ic_sound_off_24, f1d.a(R.drawable.ic_medium_like_unactive_20, f1d.a(R.drawable.ic_medium_like_active_20, Integer.hashCode(R.drawable.ic_search_24) * 31, 31), 31), 31), 31), 31);
        Integer num = this.a;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.b;
        return (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder l = dfi.l("WizardDrawableResources(searchIconRes=", R.drawable.ic_search_24, R.drawable.ic_medium_like_active_20, ", likeIconActiveRes=", ", likeIconUnActiveRes=");
        hrg.w(R.drawable.ic_medium_like_unactive_20, R.drawable.ic_sound_off_24, ", soundOffRes=", ", soundOnRes=", l);
        hrg.w(R.drawable.ic_sound_on_24, R.drawable.ic_arrow_android_back_24, ", customBackIconRes=", ", onboardingImageRes=", l);
        l.append(this.a);
        l.append(", skipDialogImageRes=");
        l.append(this.b);
        l.append(", customExplicitIconRes=null)");
        return l.toString();
    }
}
