package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.yandex.music.profile.ProfileActivity;

/* loaded from: classes6.dex */
public final class stm implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ stm(ProfileActivity profileActivity, int i) {
        this.a = i;
        this.b = profileActivity;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                if (((lug) obj) == lug.a) {
                    this.b.getSharedPreferences("Yandex_Music", 0).edit().putBoolean("onboarding", true).apply();
                }
                break;
            default:
                this.b.getSharedPreferences("Yandex_Music", 0).edit().putBoolean("onboarding", true).apply();
                break;
        }
        return Unit.a;
    }
}
