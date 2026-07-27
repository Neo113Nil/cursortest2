package kotlin.text;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class CatchingFishMVPOkHttpMVP {
    public static volatile CatchingFishMVPOkHttpMVP CatchingFishCloudMessaging;
    public static final Object CatchingFishFragmentHandler = new Object();
    public volatile int CatchingFishCoroutine;
    public final CatchingFishMVIDatabinding CatchingFishDaggerWebsocket;
    public final CatchingFishRoomDatabaseMVI CatchingFishLayout;
    public final ReentrantReadWriteLock CatchingFishParcelableFAB;
    public final Handler CatchingFishReduxKtor;
    public final CatchingFishRoomStateFlow CatchingFishSnackbar;
    public final int CatchingFishViewModelFAB;
    public final CatchingFishGradleMVVM CatchingFishViewModelScope;
    public final CatchingFishViewModelRealm CatchingFishWorkManager;

    public CatchingFishMVPOkHttpMVP(CatchingFishRoomRealmMVI catchingFishRoomRealmMVI) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.CatchingFishParcelableFAB = reentrantReadWriteLock;
        this.CatchingFishCoroutine = 3;
        CatchingFishViewModelRealm catchingFishViewModelRealm = (CatchingFishViewModelRealm) catchingFishRoomRealmMVI.CatchingFishSnackbar;
        this.CatchingFishWorkManager = catchingFishViewModelRealm;
        int i = catchingFishRoomRealmMVI.CatchingFishParcelableFAB;
        this.CatchingFishViewModelFAB = i;
        this.CatchingFishLayout = (CatchingFishRoomDatabaseMVI) catchingFishRoomRealmMVI.CatchingFishCoroutine;
        this.CatchingFishReduxKtor = new Handler(Looper.getMainLooper());
        this.CatchingFishSnackbar = new CatchingFishRoomStateFlow(0);
        this.CatchingFishViewModelScope = new CatchingFishGradleMVVM(18);
        CatchingFishMVIDatabinding catchingFishMVIDatabinding = new CatchingFishMVIDatabinding(this);
        this.CatchingFishDaggerWebsocket = catchingFishMVIDatabinding;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.CatchingFishCoroutine = 0;
            } catch (Throwable th) {
                this.CatchingFishParcelableFAB.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (CatchingFishSnackbar() == 0) {
            try {
                catchingFishViewModelRealm.CatchingFishParcelableFAB(new CatchingFishHandlerPayPal(catchingFishMVIDatabinding));
            } catch (Throwable th2) {
                CatchingFishReduxKtor(th2);
            }
        }
    }

    public static CatchingFishMVPOkHttpMVP CatchingFishParcelableFAB() {
        CatchingFishMVPOkHttpMVP catchingFishMVPOkHttpMVP;
        synchronized (CatchingFishFragmentHandler) {
            try {
                catchingFishMVPOkHttpMVP = CatchingFishCloudMessaging;
                if (!(catchingFishMVPOkHttpMVP != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return catchingFishMVPOkHttpMVP;
    }

    public final void CatchingFishCoroutine() {
        if (!(this.CatchingFishViewModelFAB == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (CatchingFishSnackbar() == 1) {
            return;
        }
        this.CatchingFishParcelableFAB.writeLock().lock();
        try {
            if (this.CatchingFishCoroutine == 0) {
                return;
            }
            this.CatchingFishCoroutine = 0;
            this.CatchingFishParcelableFAB.writeLock().unlock();
            CatchingFishMVIDatabinding catchingFishMVIDatabinding = this.CatchingFishDaggerWebsocket;
            CatchingFishMVPOkHttpMVP catchingFishMVPOkHttpMVP = catchingFishMVIDatabinding.CatchingFishParcelableFAB;
            try {
                catchingFishMVPOkHttpMVP.CatchingFishWorkManager.CatchingFishParcelableFAB(new CatchingFishHandlerPayPal(catchingFishMVIDatabinding));
            } catch (Throwable th) {
                catchingFishMVPOkHttpMVP.CatchingFishReduxKtor(th);
            }
        } finally {
            this.CatchingFishParcelableFAB.writeLock().unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x009f A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:28:0x005a, B:31:0x005f, B:33:0x0063, B:35:0x0070, B:37:0x008f, B:39:0x0099, B:41:0x009c, B:43:0x009f, B:45:0x00af, B:46:0x00b2), top: B:27:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence CatchingFishDaggerWebsocket(CharSequence charSequence, int i, int i2) {
        Throwable th;
        CharSequence charSequence2;
        int i3;
        int i4;
        CatchingFishDaggerRealm[] catchingFishDaggerRealmArr;
        if (!(CatchingFishSnackbar() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        CatchingFishHiltMVPToast.CatchingFishReduxKtor("start should be <= than end", i <= i2);
        CatchingFishGlideViewPager catchingFishGlideViewPager = null;
        if (charSequence == null) {
            return null;
        }
        CatchingFishHiltMVPToast.CatchingFishReduxKtor("start should be < than charSequence length", i <= charSequence.length());
        CatchingFishHiltMVPToast.CatchingFishReduxKtor("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = this.CatchingFishDaggerWebsocket.CatchingFishSnackbar;
        catchingFishAsyncTaskDagger.getClass();
        boolean z = charSequence instanceof CatchingFishCustomViewJUnit;
        if (z) {
            ((CatchingFishCustomViewJUnit) charSequence).CatchingFishParcelableFAB();
        }
        try {
            if (!z) {
                try {
                    if (!(charSequence instanceof Spannable)) {
                        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, CatchingFishDaggerRealm.class) <= i2) {
                            catchingFishGlideViewPager = new CatchingFishGlideViewPager();
                            catchingFishGlideViewPager.CatchingFishReduxKtor = false;
                            catchingFishGlideViewPager.CatchingFishDaggerWebsocket = new SpannableString(charSequence);
                        }
                        if (catchingFishGlideViewPager != null && (catchingFishDaggerRealmArr = (CatchingFishDaggerRealm[]) catchingFishGlideViewPager.CatchingFishDaggerWebsocket.getSpans(i, i2, CatchingFishDaggerRealm.class)) != null && catchingFishDaggerRealmArr.length > 0) {
                            for (CatchingFishDaggerRealm catchingFishDaggerRealm : catchingFishDaggerRealmArr) {
                                int spanStart = catchingFishGlideViewPager.CatchingFishDaggerWebsocket.getSpanStart(catchingFishDaggerRealm);
                                int spanEnd = catchingFishGlideViewPager.CatchingFishDaggerWebsocket.getSpanEnd(catchingFishDaggerRealm);
                                if (spanStart != i2) {
                                    catchingFishGlideViewPager.removeSpan(catchingFishDaggerRealm);
                                }
                                i = Math.min(spanStart, i);
                                i2 = Math.max(spanEnd, i2);
                            }
                        }
                        i3 = i;
                        i4 = i2;
                        if (i3 != i4 || i3 >= charSequence.length()) {
                            charSequence2 = charSequence;
                            if (!z) {
                                return charSequence2;
                            }
                        } else {
                            try {
                                charSequence2 = charSequence;
                            } catch (Throwable th2) {
                                charSequence2 = charSequence;
                                th = th2;
                                if (z) {
                                }
                            }
                            try {
                                CatchingFishGlideViewPager catchingFishGlideViewPager2 = (CatchingFishGlideViewPager) catchingFishAsyncTaskDagger.CatchingFishJUnitRealm(charSequence2, i3, i4, Integer.MAX_VALUE, false, new CatchingFishBundleGlide(19, catchingFishGlideViewPager, (CatchingFishGradleMVVM) catchingFishAsyncTaskDagger.CatchingFishDaggerWebsocket));
                                if (catchingFishGlideViewPager2 != null) {
                                    Spannable spannable = catchingFishGlideViewPager2.CatchingFishDaggerWebsocket;
                                    if (z) {
                                        ((CatchingFishCustomViewJUnit) charSequence2).CatchingFishSnackbar();
                                    }
                                    return spannable;
                                }
                                if (!z) {
                                    return charSequence2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                th = th;
                                if (z) {
                                }
                            }
                        }
                        ((CatchingFishCustomViewJUnit) charSequence2).CatchingFishSnackbar();
                        return charSequence2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    charSequence2 = charSequence;
                    if (z) {
                        throw th;
                    }
                    ((CatchingFishCustomViewJUnit) charSequence2).CatchingFishSnackbar();
                    throw th;
                }
            }
            catchingFishGlideViewPager = new CatchingFishGlideViewPager((Spannable) charSequence);
            if (catchingFishGlideViewPager != null) {
                while (r1 < r5) {
                }
            }
            i3 = i;
            i4 = i2;
            if (i3 != i4) {
            }
            charSequence2 = charSequence;
            if (!z) {
            }
            ((CatchingFishCustomViewJUnit) charSequence2).CatchingFishSnackbar();
            return charSequence2;
        } catch (Throwable th5) {
            th = th5;
            charSequence2 = charSequence;
            th = th;
            if (z) {
            }
        }
    }

    public final void CatchingFishReduxKtor(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.CatchingFishParcelableFAB.writeLock().lock();
        try {
            this.CatchingFishCoroutine = 2;
            arrayList.addAll(this.CatchingFishSnackbar);
            this.CatchingFishSnackbar.clear();
            this.CatchingFishParcelableFAB.writeLock().unlock();
            this.CatchingFishReduxKtor.post(new CatchingFishServiceEspresso(arrayList, this.CatchingFishCoroutine, th));
        } catch (Throwable th2) {
            this.CatchingFishParcelableFAB.writeLock().unlock();
            throw th2;
        }
    }

    public final int CatchingFishSnackbar() {
        this.CatchingFishParcelableFAB.readLock().lock();
        try {
            return this.CatchingFishCoroutine;
        } finally {
            this.CatchingFishParcelableFAB.readLock().unlock();
        }
    }

    public final void CatchingFishWorkManager(CatchingFishAdMobFirebase catchingFishAdMobFirebase) {
        CatchingFishHiltMVPToast.CatchingFishWorkManager(catchingFishAdMobFirebase, "initCallback cannot be null");
        this.CatchingFishParcelableFAB.writeLock().lock();
        try {
            if (this.CatchingFishCoroutine != 1 && this.CatchingFishCoroutine != 2) {
                this.CatchingFishSnackbar.add(catchingFishAdMobFirebase);
                this.CatchingFishParcelableFAB.writeLock().unlock();
            }
            this.CatchingFishReduxKtor.post(new CatchingFishServiceEspresso(Arrays.asList(catchingFishAdMobFirebase), this.CatchingFishCoroutine, (Throwable) null));
            this.CatchingFishParcelableFAB.writeLock().unlock();
        } catch (Throwable th) {
            this.CatchingFishParcelableFAB.writeLock().unlock();
            throw th;
        }
    }
}
