package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class gp {
    public static final Object JFJ3QoxA = new Object();
    public static volatile gp rQPn8YBR;
    public final k61 AvO7iQsrTN;
    public final fp EljAMC1QTz;
    public final ReentrantReadWriteLock GWasM1elztuh;
    public final dp OOA6hdeuvCS;
    public volatile int X1lG3V04pd;
    public final c5 Yi7zF1RB1;
    public final int encWxUiV2;
    public final hk mOu10nynGul;
    public final Handler xqGvceK5x;

    public gp(iu iuVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.GWasM1elztuh = reentrantReadWriteLock;
        this.X1lG3V04pd = 3;
        fp fpVar = iuVar.GWasM1elztuh;
        this.EljAMC1QTz = fpVar;
        int i = iuVar.Yi7zF1RB1;
        this.encWxUiV2 = i;
        this.mOu10nynGul = iuVar.X1lG3V04pd;
        this.xqGvceK5x = new Handler(Looper.getMainLooper());
        this.Yi7zF1RB1 = new c5();
        this.AvO7iQsrTN = new k61(28);
        dp dpVar = new dp(this);
        this.OOA6hdeuvCS = dpVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.X1lG3V04pd = 0;
            } catch (Throwable th) {
                this.GWasM1elztuh.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (Yi7zF1RB1() == 0) {
            try {
                fpVar.GWasM1elztuh(new cp(dpVar));
            } catch (Throwable th2) {
                xqGvceK5x(th2);
            }
        }
    }

    public static gp GWasM1elztuh() {
        gp gpVar;
        synchronized (JFJ3QoxA) {
            try {
                gpVar = rQPn8YBR;
                if (!(gpVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return gpVar;
    }

    public final void X1lG3V04pd() {
        if (!(this.encWxUiV2 == 1)) {
            o4.jivtDDk9H("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (Yi7zF1RB1() == 1) {
            return;
        }
        this.GWasM1elztuh.writeLock().lock();
        try {
            if (this.X1lG3V04pd == 0) {
                return;
            }
            this.X1lG3V04pd = 0;
            this.GWasM1elztuh.writeLock().unlock();
            dp dpVar = this.OOA6hdeuvCS;
            gp gpVar = dpVar.GWasM1elztuh;
            try {
                gpVar.EljAMC1QTz.GWasM1elztuh(new cp(dpVar));
            } catch (Throwable th) {
                gpVar.xqGvceK5x(th);
            }
        } finally {
            this.GWasM1elztuh.writeLock().unlock();
        }
    }

    public final int Yi7zF1RB1() {
        this.GWasM1elztuh.readLock().lock();
        try {
            return this.X1lG3V04pd;
        } finally {
            this.GWasM1elztuh.readLock().unlock();
        }
    }

    public final void xqGvceK5x(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.GWasM1elztuh.writeLock().lock();
        try {
            this.X1lG3V04pd = 2;
            arrayList.addAll(this.Yi7zF1RB1);
            this.Yi7zF1RB1.clear();
            this.GWasM1elztuh.writeLock().unlock();
            this.xqGvceK5x.post(new ep(arrayList, this.X1lG3V04pd, th));
        } catch (Throwable th2) {
            this.GWasM1elztuh.writeLock().unlock();
            throw th2;
        }
    }
}
