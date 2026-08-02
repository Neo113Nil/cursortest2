package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.EditorInfo;
import androidx.camera.video.Recorder;
import androidx.collection.ArraySet;
import androidx.collection.internal.Lock;
import androidx.room.Room;
import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.appsflyer.internal.AFd1lSDK$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda8;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class EmojiCompat {
    public static final Object INSTANCE_LOCK = new Object();
    public static volatile EmojiCompat sInstance;
    public final DefaultGlyphChecker mGlyphChecker;
    public final CompatInternal mHelper;
    public final ArraySet mInitCallbacks;
    public final ReentrantReadWriteLock mInitLock;
    public volatile int mLoadState;
    public final int mMetadataLoadStrategy;
    public final MetadataRepoLoader mMetadataLoader;
    public final boolean mReplaceAll;
    public final Lock mSpanFactory;

    public final class CompatInternal {
        public final EmojiCompat mEmojiCompat;
        public volatile MetadataRepo mMetadataRepo;
        public volatile Recorder.AnonymousClass3 mProcessor;

        /* renamed from: androidx.emoji2.text.EmojiCompat$CompatInternal$1, reason: invalid class name */
        public final class AnonymousClass1 extends TransactorKt {
            public AnonymousClass1() {
            }

            @Override // androidx.room.TransactorKt
            public final void onFailed(Throwable th) {
                CompatInternal.this.mEmojiCompat.onMetadataLoadFailed(th);
            }

            @Override // androidx.room.TransactorKt
            public final void onLoaded(MetadataRepo metadataRepo) {
                CompatInternal compatInternal = CompatInternal.this;
                compatInternal.mMetadataRepo = metadataRepo;
                MetadataRepo metadataRepo2 = compatInternal.mMetadataRepo;
                EmojiCompat emojiCompat = compatInternal.mEmojiCompat;
                compatInternal.mProcessor = new Recorder.AnonymousClass3(metadataRepo2, emojiCompat.mSpanFactory, emojiCompat.mGlyphChecker, EmojiExclusions.getEmojiExclusions());
                EmojiCompat emojiCompat2 = compatInternal.mEmojiCompat;
                ArraySet arraySet = emojiCompat2.mInitCallbacks;
                ArrayList arrayList = new ArrayList(arraySet._size);
                emojiCompat2.mInitLock.writeLock().lock();
                try {
                    emojiCompat2.mLoadState = 1;
                    arrayList.addAll(arraySet);
                    arraySet.clear();
                    emojiCompat2.mInitLock.writeLock().unlock();
                    for (int i = 0; i < arrayList.size(); i++) {
                        InitWithExecutor initWithExecutor = (InitWithExecutor) arrayList.get(i);
                        initWithExecutor.mExecutor.execute(new AFd1lSDK$$ExternalSyntheticLambda0(initWithExecutor, 4));
                    }
                } catch (Throwable th) {
                    emojiCompat2.mInitLock.writeLock().unlock();
                    throw th;
                }
            }
        }

        public CompatInternal(EmojiCompat emojiCompat) {
            this.mEmojiCompat = emojiCompat;
        }
    }

    public final class InitWithExecutor {
        public final ConcurrencyHelpers$$ExternalSyntheticLambda0 mExecutor;
        public final Room mInitCallback;

        public InitWithExecutor(ConcurrencyHelpers$$ExternalSyntheticLambda0 concurrencyHelpers$$ExternalSyntheticLambda0, Room room) {
            this.mInitCallback = room;
            this.mExecutor = concurrencyHelpers$$ExternalSyntheticLambda0;
        }
    }

    public interface MetadataRepoLoader {
        void load(TransactorKt transactorKt);
    }

    public EmojiCompat(FontRequestEmojiCompatConfig fontRequestEmojiCompatConfig) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mInitLock = reentrantReadWriteLock;
        this.mLoadState = 3;
        this.mReplaceAll = fontRequestEmojiCompatConfig.mReplaceAll;
        MetadataRepoLoader metadataRepoLoader = fontRequestEmojiCompatConfig.mMetadataLoader;
        this.mMetadataLoader = metadataRepoLoader;
        int i = fontRequestEmojiCompatConfig.mMetadataLoadStrategy;
        this.mMetadataLoadStrategy = i;
        this.mGlyphChecker = fontRequestEmojiCompatConfig.mGlyphChecker;
        ArraySet arraySet = new ArraySet(0);
        this.mInitCallbacks = arraySet;
        this.mSpanFactory = new Lock(4);
        ArraySet arraySet2 = fontRequestEmojiCompatConfig.mInitCallbacks;
        if (arraySet2 != null && !arraySet2.isEmpty()) {
            arraySet.addAll(fontRequestEmojiCompatConfig.mInitCallbacks);
        }
        CompatInternal compatInternal = new CompatInternal(this);
        this.mHelper = compatInternal;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.mLoadState = 0;
            } catch (Throwable th) {
                this.mInitLock.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (getLoadState() == 0) {
            try {
                metadataRepoLoader.load(compatInternal.new AnonymousClass1());
            } catch (Throwable th2) {
                onMetadataLoadFailed(th2);
            }
        }
    }

    public static EmojiCompat get() {
        EmojiCompat emojiCompat;
        synchronized (INSTANCE_LOCK) {
            emojiCompat = sInstance;
            TransactorKt.checkState("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", emojiCompat != null);
        }
        return emojiCompat;
    }

    public static void init(FontRequestEmojiCompatConfig fontRequestEmojiCompatConfig) {
        if (sInstance == null) {
            synchronized (INSTANCE_LOCK) {
                try {
                    if (sInstance == null) {
                        sInstance = new EmojiCompat(fontRequestEmojiCompatConfig);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static boolean isConfigured() {
        return sInstance != null;
    }

    public final int getEmojiStart(int i, CharSequence charSequence) {
        TransactorKt.checkState("Not initialized yet", isInitialized());
        TransactorKt.checkNotNull(charSequence, "charSequence cannot be null");
        return this.mHelper.mProcessor.getEmojiStart(i, charSequence);
    }

    public final int getLoadState() {
        this.mInitLock.readLock().lock();
        try {
            return this.mLoadState;
        } finally {
            this.mInitLock.readLock().unlock();
        }
    }

    public final boolean isInitialized() {
        return getLoadState() == 1;
    }

    public final void load() {
        TransactorKt.checkState("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", this.mMetadataLoadStrategy == 1);
        if (isInitialized()) {
            return;
        }
        this.mInitLock.writeLock().lock();
        try {
            if (this.mLoadState == 0) {
                return;
            }
            this.mLoadState = 0;
            this.mInitLock.writeLock().unlock();
            CompatInternal compatInternal = this.mHelper;
            EmojiCompat emojiCompat = compatInternal.mEmojiCompat;
            try {
                emojiCompat.mMetadataLoader.load(compatInternal.new AnonymousClass1());
            } catch (Throwable th) {
                emojiCompat.onMetadataLoadFailed(th);
            }
        } finally {
            this.mInitLock.writeLock().unlock();
        }
    }

    public final void onMetadataLoadFailed(Throwable th) {
        ArraySet arraySet = this.mInitCallbacks;
        ArrayList arrayList = new ArrayList(arraySet._size);
        this.mInitLock.writeLock().lock();
        try {
            this.mLoadState = 2;
            arrayList.addAll(arraySet);
            arraySet.clear();
            this.mInitLock.writeLock().unlock();
            for (int i = 0; i < arrayList.size(); i++) {
                InitWithExecutor initWithExecutor = (InitWithExecutor) arrayList.get(i);
                initWithExecutor.mExecutor.execute(new MainActivity$$ExternalSyntheticLambda8(5, initWithExecutor, th));
            }
        } catch (Throwable th2) {
            this.mInitLock.writeLock().unlock();
            throw th2;
        }
    }

    public final CharSequence process(int i, int i2, int i3, CharSequence charSequence) {
        TransactorKt.checkState("Not initialized yet", isInitialized());
        if (i < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("start cannot be negative");
            return null;
        }
        if (i2 < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("end cannot be negative");
            return null;
        }
        boolean z = false;
        TransactorKt.checkArgument("start should be <= than end", i <= i2);
        if (charSequence == null) {
            return null;
        }
        TransactorKt.checkArgument("start should be < than charSequence length", i <= charSequence.length());
        TransactorKt.checkArgument("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        if (i3 == 1) {
            z = true;
        } else if (i3 != 2) {
            z = this.mReplaceAll;
        }
        return this.mHelper.mProcessor.process(charSequence, i, i2, z);
    }

    public final void registerInitCallback(Room room) {
        Handler createAsync = Handler.createAsync(Looper.getMainLooper());
        Objects.requireNonNull(createAsync);
        ConcurrencyHelpers$$ExternalSyntheticLambda0 concurrencyHelpers$$ExternalSyntheticLambda0 = new ConcurrencyHelpers$$ExternalSyntheticLambda0(createAsync, 0);
        TransactorKt.checkNotNull(room, "initCallback cannot be null");
        InitWithExecutor initWithExecutor = new InitWithExecutor(concurrencyHelpers$$ExternalSyntheticLambda0, room);
        this.mInitLock.writeLock().lock();
        try {
            if (this.mLoadState == 1) {
                concurrencyHelpers$$ExternalSyntheticLambda0.execute(new AFd1lSDK$$ExternalSyntheticLambda0(initWithExecutor, 4));
            } else if (this.mLoadState == 2) {
                concurrencyHelpers$$ExternalSyntheticLambda0.execute(new MainActivity$$ExternalSyntheticLambda8(5, initWithExecutor, new IllegalStateException("Initialization failed prior to registering this callback, please add an initialization callback to the EmojiCompat.Config instead to see the cause.")));
            } else {
                this.mInitCallbacks.add(initWithExecutor);
            }
            this.mInitLock.writeLock().unlock();
        } catch (Throwable th) {
            this.mInitLock.writeLock().unlock();
            throw th;
        }
    }

    public final void updateEditorInfo(EditorInfo editorInfo) {
        if (!isInitialized() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        CompatInternal compatInternal = this.mHelper;
        compatInternal.getClass();
        editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", compatInternal.mMetadataRepo.getMetadataVersion());
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", compatInternal.mEmojiCompat.mReplaceAll);
    }
}
