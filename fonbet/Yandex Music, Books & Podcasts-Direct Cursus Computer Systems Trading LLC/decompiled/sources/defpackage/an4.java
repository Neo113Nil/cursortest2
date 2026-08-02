package defpackage;

import android.content.Context;
import java.io.File;
import ru.yandex.music.utils.Assertions;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class an4 implements oot {
    public final /* synthetic */ int a;
    public final Context b;

    public /* synthetic */ an4(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.oot
    public final boolean a(t0u t0uVar) {
        switch (this.a) {
            case 0:
                if (t0uVar.c < 295000) {
                }
                break;
            case 1:
                if (t0uVar.c < 287000) {
                }
                break;
            case 2:
                if (t0uVar.c < 270000) {
                }
                break;
            default:
                if (t0uVar.c < 230000) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.oot
    public final void b(uiq uiqVar, t0u t0uVar) {
        switch (this.a) {
            case 0:
                fmg.e.u(this.b);
                return;
            case 1:
                this.b.getSharedPreferences("Yandex_Music", 0).edit().putBoolean("onboarding", false).apply();
                return;
            case 2:
                try {
                    try {
                        File databasePath = this.b.getDatabasePath("search_history.db");
                        Assertions.assertTrue(x97.t(databasePath));
                        File[] listFiles = databasePath.getParentFile().listFiles(new cp6(4));
                        if (listFiles != null) {
                            for (File file : listFiles) {
                                Assertions.assertTrue(x97.t(file));
                            }
                        }
                    } catch (Exception e) {
                        Timber.e(e, "failed to purge old search history", new Object[0]);
                    }
                    return;
                } finally {
                    uiqVar.x();
                }
            default:
                new Thread(new zvh(18, this, uiqVar)).start();
                return;
        }
    }

    public void c(String str) {
        Context context = this.b;
        Assertions.assertTrue(x97.t(new File(context.getExternalCacheDir(), str)));
        Assertions.assertTrue(x97.t(new File(context.getCacheDir(), str)));
    }
}
