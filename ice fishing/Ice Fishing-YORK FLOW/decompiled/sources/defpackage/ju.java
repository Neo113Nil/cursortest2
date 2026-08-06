package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ju {
    public static final java.lang.Object GE9mJIPrb8gP = new java.lang.Object();
    public static volatile defpackage.ju Ns0WNyEWdPsk;
    public final android.os.Handler JhCgjQRTAOCT;
    public final int P05cfTpS5W5L;
    public final defpackage.hu QiMR8OkAhezm;
    public final defpackage.fu WDYagTQQm9ns;
    public final java.util.concurrent.locks.ReentrantReadWriteLock ZpBGe2uQfcn8;
    public final defpackage.zn e6mdH7fiFuta;
    public volatile int fWTAfUmVKrZq;
    public final defpackage.x7 giKS3J6vZuNy;
    public final defpackage.iu oh71FJcDz6S2;

    public ju(defpackage.g00 g00Var) {
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.ZpBGe2uQfcn8 = reentrantReadWriteLock;
        this.fWTAfUmVKrZq = 3;
        defpackage.iu iuVar = (defpackage.iu) g00Var.giKS3J6vZuNy;
        this.oh71FJcDz6S2 = iuVar;
        int i = g00Var.ZpBGe2uQfcn8;
        this.P05cfTpS5W5L = i;
        this.e6mdH7fiFuta = (defpackage.zn) g00Var.fWTAfUmVKrZq;
        this.JhCgjQRTAOCT = new android.os.Handler(android.os.Looper.getMainLooper());
        this.giKS3J6vZuNy = new defpackage.x7();
        this.QiMR8OkAhezm = new defpackage.hu(0);
        defpackage.fu fuVar = new defpackage.fu(this);
        this.WDYagTQQm9ns = fuVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.fWTAfUmVKrZq = 0;
            } catch (java.lang.Throwable th) {
                this.ZpBGe2uQfcn8.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (fWTAfUmVKrZq() == 0) {
            try {
                iuVar.ZpBGe2uQfcn8(new defpackage.eu(fuVar));
            } catch (java.lang.Throwable th2) {
                oh71FJcDz6S2(th2);
            }
        }
    }

    public static boolean JhCgjQRTAOCT() {
        return Ns0WNyEWdPsk != null;
    }

    public static defpackage.ju ZpBGe2uQfcn8() {
        defpackage.ju juVar;
        synchronized (GE9mJIPrb8gP) {
            try {
                juVar = Ns0WNyEWdPsk;
                if (!(juVar != null)) {
                    throw new java.lang.IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return juVar;
    }

    public final void QiMR8OkAhezm(android.view.inputmethod.EditorInfo editorInfo) {
        if (fWTAfUmVKrZq() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new android.os.Bundle();
        }
        defpackage.fu fuVar = this.WDYagTQQm9ns;
        fuVar.getClass();
        android.os.Bundle bundle = editorInfo.extras;
        defpackage.kl0 kl0Var = (defpackage.kl0) fuVar.fWTAfUmVKrZq.WDYagTQQm9ns;
        int ZpBGe2uQfcn8 = kl0Var.ZpBGe2uQfcn8(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", ZpBGe2uQfcn8 != 0 ? ((java.nio.ByteBuffer) kl0Var.P05cfTpS5W5L).getInt(ZpBGe2uQfcn8 + kl0Var.WDYagTQQm9ns) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }

    public final void WDYagTQQm9ns() {
        if (!(this.P05cfTpS5W5L == 1)) {
            defpackage.h7.P05cfTpS5W5L("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (fWTAfUmVKrZq() == 1) {
            return;
        }
        this.ZpBGe2uQfcn8.writeLock().lock();
        try {
            if (this.fWTAfUmVKrZq == 0) {
                return;
            }
            this.fWTAfUmVKrZq = 0;
            this.ZpBGe2uQfcn8.writeLock().unlock();
            defpackage.fu fuVar = this.WDYagTQQm9ns;
            defpackage.ju juVar = fuVar.ZpBGe2uQfcn8;
            try {
                juVar.oh71FJcDz6S2.ZpBGe2uQfcn8(new defpackage.eu(fuVar));
            } catch (java.lang.Throwable th) {
                juVar.oh71FJcDz6S2(th);
            }
        } finally {
            this.ZpBGe2uQfcn8.writeLock().unlock();
        }
    }

    public final int fWTAfUmVKrZq() {
        this.ZpBGe2uQfcn8.readLock().lock();
        try {
            return this.fWTAfUmVKrZq;
        } finally {
            this.ZpBGe2uQfcn8.readLock().unlock();
        }
    }

    public final int giKS3J6vZuNy(java.lang.CharSequence charSequence, int i) {
        if (!(fWTAfUmVKrZq() == 1)) {
            defpackage.h7.P05cfTpS5W5L("Not initialized yet");
            return 0;
        }
        defpackage.w60.GE9mJIPrb8gP(charSequence, "charSequence cannot be null");
        defpackage.a7 a7Var = this.WDYagTQQm9ns.giKS3J6vZuNy;
        a7Var.getClass();
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof android.text.Spanned) {
            android.text.Spanned spanned = (android.text.Spanned) charSequence;
            defpackage.ar1[] ar1VarArr = (defpackage.ar1[]) spanned.getSpans(i, i + 1, defpackage.ar1.class);
            if (ar1VarArr.length > 0) {
                return spanned.getSpanStart(ar1VarArr[0]);
            }
        }
        return ((defpackage.qu) a7Var.XntWc4eZSQ8j(charSequence, java.lang.Math.max(0, i - 16), java.lang.Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new defpackage.qu(i))).oh71FJcDz6S2;
    }

    public final void oh71FJcDz6S2(java.lang.Throwable th) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.ZpBGe2uQfcn8.writeLock().lock();
        try {
            this.fWTAfUmVKrZq = 2;
            arrayList.addAll(this.giKS3J6vZuNy);
            this.giKS3J6vZuNy.clear();
            this.ZpBGe2uQfcn8.writeLock().unlock();
            this.JhCgjQRTAOCT.post(new defpackage.wc(arrayList, this.fWTAfUmVKrZq, th));
        } catch (java.lang.Throwable th2) {
            this.ZpBGe2uQfcn8.writeLock().unlock();
            throw th2;
        }
    }
}
