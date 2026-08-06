package defpackage;

/* loaded from: classes.dex */
public final class ws {
    public static final java.lang.Object SH1y5HwkJhh = new java.lang.Object();
    public static volatile defpackage.ws ez2rX8ReCYw;
    public final defpackage.ad1 AARZUJiTa;
    public final int EXtogiMhuM;
    public final android.os.Handler F7NU4MC0GW;
    public final java.util.concurrent.locks.ReentrantReadWriteLock IHQe1A4L2xu;
    public final defpackage.ss adDC3e2L;
    public final defpackage.s6 oh6vYeIP;
    public volatile int r1MBDhnF;
    public final defpackage.sm riuEU0zW4;
    public final defpackage.vs xiZrDbcSW0;

    public ws(defpackage.xy xyVar) {
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.IHQe1A4L2xu = reentrantReadWriteLock;
        this.r1MBDhnF = 3;
        defpackage.vs vsVar = (defpackage.vs) xyVar.oh6vYeIP;
        this.xiZrDbcSW0 = vsVar;
        int i = xyVar.IHQe1A4L2xu;
        this.EXtogiMhuM = i;
        this.riuEU0zW4 = (defpackage.sm) xyVar.r1MBDhnF;
        this.F7NU4MC0GW = new android.os.Handler(android.os.Looper.getMainLooper());
        this.oh6vYeIP = new defpackage.s6();
        this.AARZUJiTa = new defpackage.ad1(27);
        defpackage.ss ssVar = new defpackage.ss(this);
        this.adDC3e2L = ssVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.r1MBDhnF = 0;
            } catch (java.lang.Throwable th) {
                this.IHQe1A4L2xu.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (oh6vYeIP() == 0) {
            try {
                vsVar.IHQe1A4L2xu(new defpackage.rs(ssVar));
            } catch (java.lang.Throwable th2) {
                F7NU4MC0GW(th2);
            }
        }
    }

    public static defpackage.ws IHQe1A4L2xu() {
        defpackage.ws wsVar;
        synchronized (SH1y5HwkJhh) {
            try {
                wsVar = ez2rX8ReCYw;
                if (!(wsVar != null)) {
                    throw new java.lang.IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return wsVar;
    }

    public final void F7NU4MC0GW(java.lang.Throwable th) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.IHQe1A4L2xu.writeLock().lock();
        try {
            this.r1MBDhnF = 2;
            arrayList.addAll(this.oh6vYeIP);
            this.oh6vYeIP.clear();
            this.IHQe1A4L2xu.writeLock().unlock();
            this.F7NU4MC0GW.post(new defpackage.us(arrayList, this.r1MBDhnF, th));
        } catch (java.lang.Throwable th2) {
            this.IHQe1A4L2xu.writeLock().unlock();
            throw th2;
        }
    }

    public final int oh6vYeIP() {
        this.IHQe1A4L2xu.readLock().lock();
        try {
            return this.r1MBDhnF;
        } finally {
            this.IHQe1A4L2xu.readLock().unlock();
        }
    }

    public final void r1MBDhnF() {
        if (!(this.EXtogiMhuM == 1)) {
            defpackage.db.AARZUJiTa("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (oh6vYeIP() == 1) {
            return;
        }
        this.IHQe1A4L2xu.writeLock().lock();
        try {
            if (this.r1MBDhnF == 0) {
                return;
            }
            this.r1MBDhnF = 0;
            this.IHQe1A4L2xu.writeLock().unlock();
            defpackage.ss ssVar = this.adDC3e2L;
            defpackage.ws wsVar = ssVar.IHQe1A4L2xu;
            try {
                wsVar.xiZrDbcSW0.IHQe1A4L2xu(new defpackage.rs(ssVar));
            } catch (java.lang.Throwable th) {
                wsVar.F7NU4MC0GW(th);
            }
        } finally {
            this.IHQe1A4L2xu.writeLock().unlock();
        }
    }
}
