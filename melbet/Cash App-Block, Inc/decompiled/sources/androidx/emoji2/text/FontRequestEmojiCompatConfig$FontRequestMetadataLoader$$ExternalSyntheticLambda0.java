package androidx.emoji2.text;

import android.content.Context;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.os.Trace;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.provider.FontsContractCompat;
import androidx.emoji2.text.FontRequestEmojiCompatConfig;
import androidx.room.TransactorKt;
import app.cash.trifle.Trifle;
import java.nio.MappedByteBuffer;
import nl.dionsegijn.konfetti.KonfettiView;

/* loaded from: classes3.dex */
public final /* synthetic */ class FontRequestEmojiCompatConfig$FontRequestMetadataLoader$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FontRequestEmojiCompatConfig.FontRequestMetadataLoader f$0;

    public /* synthetic */ FontRequestEmojiCompatConfig$FontRequestMetadataLoader$$ExternalSyntheticLambda0(FontRequestEmojiCompatConfig.FontRequestMetadataLoader fontRequestMetadataLoader, int i) {
        this.$r8$classId = i;
        this.f$0 = fontRequestMetadataLoader;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long min;
        int i = this.$r8$classId;
        FontRequestEmojiCompatConfig.FontRequestMetadataLoader fontRequestMetadataLoader = this.f$0;
        switch (i) {
            case 0:
                synchronized (fontRequestMetadataLoader.mLock) {
                    try {
                        if (fontRequestMetadataLoader.mCallback == null) {
                            return;
                        }
                        try {
                            FontsContractCompat.FontInfo retrieveFontInfo = fontRequestMetadataLoader.retrieveFontInfo();
                            int i2 = retrieveFontInfo.mResultCode;
                            if (i2 == 2) {
                                synchronized (fontRequestMetadataLoader.mLock) {
                                    try {
                                        KonfettiView.TimerIntegration timerIntegration = fontRequestMetadataLoader.mRetryPolicy;
                                        if (timerIntegration != null) {
                                            if (timerIntegration.previousTime == 0) {
                                                timerIntegration.previousTime = SystemClock.uptimeMillis();
                                                min = 0;
                                            } else {
                                                long uptimeMillis = SystemClock.uptimeMillis() - timerIntegration.previousTime;
                                                min = uptimeMillis > 600000 ? -1L : Math.min(Math.max(uptimeMillis, 1000L), 600000 - uptimeMillis);
                                            }
                                            if (min >= 0) {
                                                fontRequestMetadataLoader.scheduleRetry(retrieveFontInfo.mUri, min);
                                                return;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                            if (i2 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i2 + ")");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                Trifle trifle = fontRequestMetadataLoader.mFontProviderHelper;
                                Context context = fontRequestMetadataLoader.mContext;
                                trifle.getClass();
                                Typeface createFromFontInfo = TypefaceCompat.createFromFontInfo(context, new FontsContractCompat.FontInfo[]{retrieveFontInfo}, 0);
                                MappedByteBuffer mmap = TypefaceCompatUtil.mmap(fontRequestMetadataLoader.mContext, retrieveFontInfo.mUri);
                                if (mmap == null || createFromFontInfo == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    MetadataRepo metadataRepo = new MetadataRepo(createFromFontInfo, MetadataListReader.read(mmap));
                                    Trace.endSection();
                                    synchronized (fontRequestMetadataLoader.mLock) {
                                        try {
                                            TransactorKt transactorKt = fontRequestMetadataLoader.mCallback;
                                            if (transactorKt != null) {
                                                transactorKt.onLoaded(metadataRepo);
                                            }
                                        } finally {
                                        }
                                    }
                                    fontRequestMetadataLoader.cleanUp();
                                    return;
                                } finally {
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (fontRequestMetadataLoader.mLock) {
                                try {
                                    TransactorKt transactorKt2 = fontRequestMetadataLoader.mCallback;
                                    if (transactorKt2 != null) {
                                        transactorKt2.onFailed(th2);
                                    }
                                    fontRequestMetadataLoader.cleanUp();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            default:
                fontRequestMetadataLoader.loadInternal();
                return;
        }
    }
}
