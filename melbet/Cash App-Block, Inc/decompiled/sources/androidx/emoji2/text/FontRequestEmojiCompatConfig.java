package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.collection.ArraySet;
import androidx.core.provider.FontRequest;
import androidx.core.provider.FontsContractCompat;
import androidx.cursoradapter.widget.CursorAdapter;
import androidx.emoji2.text.EmojiCompat;
import androidx.room.TransactorKt;
import app.cash.trifle.Trifle;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import nl.dionsegijn.konfetti.KonfettiView;

/* loaded from: classes.dex */
public final class FontRequestEmojiCompatConfig {
    public static final Trifle DEFAULT_FONTS_CONTRACT = new Trifle(5);
    public final DefaultGlyphChecker mGlyphChecker;
    public ArraySet mInitCallbacks;
    public int mMetadataLoadStrategy;
    public final EmojiCompat.MetadataRepoLoader mMetadataLoader;
    public boolean mReplaceAll;

    public final class FontRequestMetadataLoader implements EmojiCompat.MetadataRepoLoader {
        public TransactorKt mCallback;
        public final Context mContext;
        public ThreadPoolExecutor mExecutor;
        public final Trifle mFontProviderHelper;
        public final Object mLock = new Object();
        public Handler mMainHandler;
        public FontRequestEmojiCompatConfig$FontRequestMetadataLoader$$ExternalSyntheticLambda0 mMainHandlerLoadCallback;
        public ThreadPoolExecutor mMyThreadPoolExecutor;
        public CursorAdapter.ChangeObserver mObserver;
        public final FontRequest mRequest;
        public KonfettiView.TimerIntegration mRetryPolicy;

        public FontRequestMetadataLoader(Context context, FontRequest fontRequest) {
            TransactorKt.checkNotNull(context, "Context cannot be null");
            this.mContext = context.getApplicationContext();
            this.mRequest = fontRequest;
            this.mFontProviderHelper = FontRequestEmojiCompatConfig.DEFAULT_FONTS_CONTRACT;
        }

        public final void cleanUp() {
            synchronized (this.mLock) {
                try {
                    this.mCallback = null;
                    CursorAdapter.ChangeObserver changeObserver = this.mObserver;
                    if (changeObserver != null) {
                        Trifle trifle = this.mFontProviderHelper;
                        Context context = this.mContext;
                        trifle.getClass();
                        context.getContentResolver().unregisterContentObserver(changeObserver);
                        this.mObserver = null;
                    }
                    Handler handler = this.mMainHandler;
                    if (handler != null) {
                        handler.removeCallbacks(this.mMainHandlerLoadCallback);
                    }
                    this.mMainHandler = null;
                    ThreadPoolExecutor threadPoolExecutor = this.mMyThreadPoolExecutor;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.mExecutor = null;
                    this.mMyThreadPoolExecutor = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        public final void load(TransactorKt transactorKt) {
            synchronized (this.mLock) {
                this.mCallback = transactorKt;
            }
            loadInternal();
        }

        public final void loadInternal() {
            synchronized (this.mLock) {
                try {
                    if (this.mCallback == null) {
                        return;
                    }
                    int i = 0;
                    if (this.mExecutor == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ConcurrencyHelpers$$ExternalSyntheticLambda1("emojiCompat", 0));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.mMyThreadPoolExecutor = threadPoolExecutor;
                        this.mExecutor = threadPoolExecutor;
                    }
                    this.mExecutor.execute(new FontRequestEmojiCompatConfig$FontRequestMetadataLoader$$ExternalSyntheticLambda0(this, i));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final FontsContractCompat.FontInfo retrieveFontInfo() {
            try {
                Trifle trifle = this.mFontProviderHelper;
                Context context = this.mContext;
                FontRequest fontRequest = this.mRequest;
                trifle.getClass();
                FontsContractCompat.FontFamilyResult fetchFonts = FontsContractCompat.fetchFonts(context, fontRequest);
                if (fetchFonts.getStatusCode() != 0) {
                    throw new RuntimeException("fetchFonts failed (" + fetchFonts.getStatusCode() + ")");
                }
                FontsContractCompat.FontInfo[] fonts = fetchFonts.getFonts();
                if (fonts != null && fonts.length != 0) {
                    return fonts[0];
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1("fetchFonts failed (empty result)");
                return null;
            } catch (PackageManager.NameNotFoundException e) {
                OptionalProvider$$ExternalSyntheticLambda0.m("provider not found", (Throwable) e);
                return null;
            }
        }

        public final void scheduleRetry(Uri uri, long j) {
            synchronized (this.mLock) {
                try {
                    Handler handler = this.mMainHandler;
                    if (handler == null) {
                        handler = Handler.createAsync(Looper.getMainLooper());
                        this.mMainHandler = handler;
                    }
                    int i = 1;
                    if (this.mObserver == null) {
                        CursorAdapter.ChangeObserver changeObserver = new CursorAdapter.ChangeObserver(this, handler, 1);
                        this.mObserver = changeObserver;
                        Trifle trifle = this.mFontProviderHelper;
                        Context context = this.mContext;
                        trifle.getClass();
                        context.getContentResolver().registerContentObserver(uri, false, changeObserver);
                    }
                    if (this.mMainHandlerLoadCallback == null) {
                        this.mMainHandlerLoadCallback = new FontRequestEmojiCompatConfig$FontRequestMetadataLoader$$ExternalSyntheticLambda0(this, i);
                    }
                    handler.postDelayed(this.mMainHandlerLoadCallback, j);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public FontRequestEmojiCompatConfig(EmojiCompat.MetadataRepoLoader metadataRepoLoader) {
        this.mMetadataLoadStrategy = 0;
        this.mGlyphChecker = new DefaultGlyphChecker();
        this.mMetadataLoader = metadataRepoLoader;
    }

    public FontRequestEmojiCompatConfig(Context context, FontRequest fontRequest) {
        this(new FontRequestMetadataLoader(context, fontRequest));
    }
}
