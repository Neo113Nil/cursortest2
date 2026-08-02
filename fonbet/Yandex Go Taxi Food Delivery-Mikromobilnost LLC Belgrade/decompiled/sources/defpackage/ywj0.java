package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.os.Process;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.yx_platform_api.RestartActivity;

/* loaded from: classes7.dex */
public final class ywj0 {
    public static void a(Context context, Intent... intentArr) {
        Intent intent = (Intent) j73.D(intentArr);
        if (intent != null) {
            intent.addFlags(268468224);
        }
        Intent intent2 = new Intent(context, (Class<?>) RestartActivity.class);
        intent2.addFlags(SelfTester_JCP.IMITA);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        j73.Z(intentArr, arrayList);
        intent2.putParcelableArrayListExtra("restart_intents", arrayList);
        intent2.putExtra("main_process_id", Process.myPid());
        context.startActivity(intent2);
    }
}
