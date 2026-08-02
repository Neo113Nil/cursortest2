package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.arch.core.executor.ArchTaskExecutor$$ExternalSyntheticLambda0;
import androidx.core.app.NavUtils;
import androidx.profileinstaller.ProfileInstaller;
import androidx.room.TransactionExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class AppCompatDelegate$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Context f$0;

    public /* synthetic */ AppCompatDelegate$$ExternalSyntheticLambda0(Context context, int i) {
        this.$r8$classId = i;
        this.f$0 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Context context = this.f$0;
        switch (i) {
            case 0:
                if (Build.VERSION.SDK_INT >= 33) {
                    TransactionExecutor transactionExecutor = AppCompatDelegate.sSerialExecutorForLocalesStorage;
                    ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (AppCompatDelegate.getApplicationLocales().isEmpty()) {
                            String readLocales = NavUtils.readLocales(context);
                            Object systemService = context.getSystemService("locale");
                            if (systemService != null) {
                                AppCompatDelegate.Api33Impl.localeManagerSetApplicationLocales(systemService, AppCompatDelegate.Api24Impl.localeListForLanguageTags(readLocales));
                            }
                        }
                        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                AppCompatDelegate.sIsFrameworkSyncChecked = true;
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new AppCompatDelegate$$ExternalSyntheticLambda0(context, 2));
                break;
            default:
                ProfileInstaller.writeProfile(context, new ArchTaskExecutor$$ExternalSyntheticLambda0(1), ProfileInstaller.EMPTY_DIAGNOSTICS, false);
                break;
        }
    }
}
