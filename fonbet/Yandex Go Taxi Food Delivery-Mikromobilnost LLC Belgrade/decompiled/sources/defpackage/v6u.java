package defpackage;

import android.content.Context;
import com.yandex.go.flex.common.actions.dto.HapticAction;
import ru.yandex.taxi.HapticController$Effect;

/* loaded from: classes.dex */
public final class v6u implements dw {
    public final Context a;

    public v6u(Context context) {
        this.a = context;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        HapticAction hapticAction = (HapticAction) krVar;
        if (u6u.a[hapticAction.a.ordinal()] != 1) {
            w511.b();
            return;
        }
        qke.E(this.a, HapticController$Effect.CLICK_LIGHT, hapticAction.b, 8);
    }
}
