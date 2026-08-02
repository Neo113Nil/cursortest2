package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.activity.AndroidComponentRepository$Component;

/* loaded from: classes.dex */
public final class s2i implements z320 {
    public final y72 a;

    public s2i(y72 y72Var) {
        this.a = y72Var;
    }

    @Override // defpackage.z320
    public final PendingIntent a(Context context, String str) {
        Intent action = new Intent(context, (Class<?>) this.a.a(AndroidComponentRepository$Component.MAIN_ACTIVITY)).addFlags(SelfTester_JCP.IMITA).setAction("android.intent.action.VIEW");
        Bundle bundle = new Bundle();
        bundle.putString("ru.yandex.taxi.activity.MainActivity.DELIVERY_MESSENGER_TO_DISPLAY", str);
        action.putExtras(bundle);
        return PendingIntent.getActivity(context, 0, action, 201326592);
    }
}
