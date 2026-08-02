package defpackage;

import android.content.Context;
import android.content.Intent;
import ru.yandex.music.settings.SettingsActivity;

/* loaded from: classes6.dex */
public final class cpp {
    public static final /* synthetic */ s9f[] a;

    static {
        qpi qpiVar = new qpi("scrollTargetBlock", "getScrollTargetBlock(Landroid/content/Intent;)Ljava/lang/String;");
        ern.a.getClass();
        a = new s9f[]{qpiVar, new qpi("scrollTargetOption", "getScrollTargetOption(Landroid/content/Intent;)Ljava/lang/String;")};
    }

    public static Intent a(Context context, msp mspVar) {
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) SettingsActivity.class);
        if (mspVar == null) {
            return intent;
        }
        boolean z = mspVar instanceof ksp;
        s9f[] s9fVarArr = a;
        if (z) {
            cpp cppVar = SettingsActivity.v0;
            String name = ((ksp) mspVar).name();
            cppVar.getClass();
            SettingsActivity.x0.setValue(intent, s9fVarArr[0], name);
            return intent;
        }
        if (!(mspVar instanceof lsp)) {
            b6e.s();
            return null;
        }
        cpp cppVar2 = SettingsActivity.v0;
        String name2 = ((lsp) mspVar).name();
        cppVar2.getClass();
        SettingsActivity.y0.setValue(intent, s9fVarArr[1], name2);
        return intent;
    }
}
