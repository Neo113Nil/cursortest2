package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class hp implements mk {
    public final /* synthetic */ w90 OOA6hdeuvCS;

    public hp(EmojiCompatInitializer emojiCompatInitializer, w90 w90Var) {
        this.OOA6hdeuvCS = w90Var;
    }

    @Override // defpackage.mk
    public final void X1lG3V04pd(t90 t90Var) {
        (Build.VERSION.SDK_INT >= 28 ? of.GWasM1elztuh(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new lp(), 500L);
        this.OOA6hdeuvCS.EljAMC1QTz(this);
    }
}
