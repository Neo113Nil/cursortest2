package com.bugsnag.android.internal.dag;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import androidx.emoji2.text.ConcurrencyHelpers$$ExternalSyntheticLambda1;
import androidx.emoji2.text.EmojiCompat;
import androidx.room.TransactorKt;
import androidx.work.impl.Processor$$ExternalSyntheticLambda1;
import coil3.size.DimensionKt;
import com.google.android.gms.common.internal.zzae;
import com.squareup.cash.CashApp;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ContextModule implements EmojiCompat.MetadataRepoLoader {
    public final Context ctx;

    public ContextModule(Context context, int i) {
        switch (i) {
            case 4:
                zzae.checkNotNull(context);
                Context applicationContext = context.getApplicationContext();
                zzae.checkNotNull(applicationContext);
                this.ctx = applicationContext;
                break;
            default:
                this.ctx = context.getApplicationContext();
                break;
        }
    }

    public ApplicationInfo getApplicationInfo(int i, String str) {
        return this.ctx.getPackageManager().getApplicationInfo(str, i);
    }

    public PackageInfo getPackageInfo(int i, String str) {
        return this.ctx.getPackageManager().getPackageInfo(str, i);
    }

    public boolean isCallerInstantApp() {
        int callingUid = Binder.getCallingUid();
        int myUid = Process.myUid();
        Context context = this.ctx;
        if (callingUid == myUid) {
            return DimensionKt.isInstantApp(context);
        }
        String nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (nameForUid != null) {
            return context.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }

    @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
    public void load(TransactorKt transactorKt) {
        ConcurrencyHelpers$$ExternalSyntheticLambda1 concurrencyHelpers$$ExternalSyntheticLambda1 = new ConcurrencyHelpers$$ExternalSyntheticLambda1("EmojiCompatInitializer", 0);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), concurrencyHelpers$$ExternalSyntheticLambda1);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Processor$$ExternalSyntheticLambda1(1, this, transactorKt, threadPoolExecutor));
    }

    public ContextModule(CashApp cashApp) {
        this.ctx = cashApp.getApplicationContext() != null ? cashApp.getApplicationContext() : cashApp;
    }

    public /* synthetic */ ContextModule(Context context, byte b) {
        this.ctx = context;
    }
}
