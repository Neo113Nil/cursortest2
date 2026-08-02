package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.List;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class a7w implements a9h {
    public final jyr a = l18.b.b(hag.I(iw2.class), true);

    @Override // defpackage.a9h
    public final boolean a() {
        if (!super.a()) {
            return false;
        }
        ((iw2) this.a.getValue()).getClass();
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        Boolean a = ((kw2) ((byb) qdcVar.C(I)).b(kw2.class)).a().a("isXiaomiEnable");
        return a != null ? a.booleanValue() : true;
    }

    @Override // defpackage.a9h
    public final String b() {
        return "Xiaomi";
    }

    @Override // defpackage.a9h
    public final Intent c(Context context) {
        Intent intent = new Intent();
        intent.setPackage("com.miui.powerkeeper");
        intent.setComponent(new ComponentName("com.miui.powerkeeper", "com.miui.powerkeeper.ui.HiddenAppsConfigActivity"));
        intent.putExtra("package_name", context.getPackageName());
        intent.putExtra("package_label", context.getString(R.string.app_name_full));
        intent.addFlags(268435456);
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        queryIntentActivities.getClass();
        if (queryIntentActivities.isEmpty()) {
            return null;
        }
        return intent;
    }
}
