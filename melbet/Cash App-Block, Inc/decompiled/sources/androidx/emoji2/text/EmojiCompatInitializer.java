package androidx.emoji2.text;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.startup.AppInitializer;
import androidx.startup.Initializer;
import com.bugsnag.android.internal.dag.ContextModule;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements Initializer {

    public final class LoadEmojiCompatRunnable implements Runnable {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ LoadEmojiCompatRunnable(int i) {
            this.$r8$classId = i;
        }

        private final void run$com$google$common$util$concurrent$InterruptibleTask$DoNothingRunnable() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            switch (this.$r8$classId) {
                case 0:
                    try {
                        Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                        if (EmojiCompat.isConfigured()) {
                            EmojiCompat.get().load();
                        }
                        return;
                    } finally {
                        Trace.endSection();
                    }
                default:
                    return;
            }
        }
    }

    @Override // androidx.startup.Initializer
    public final Object create(Context context) {
        Object obj;
        FontRequestEmojiCompatConfig fontRequestEmojiCompatConfig = new FontRequestEmojiCompatConfig(new ContextModule(context, 1));
        fontRequestEmojiCompatConfig.mMetadataLoadStrategy = 1;
        EmojiCompat.init(fontRequestEmojiCompatConfig);
        AppInitializer appInitializer = AppInitializer.getInstance(context);
        appInitializer.getClass();
        synchronized (AppInitializer.sLock) {
            try {
                obj = appInitializer.mInitialized.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = appInitializer.doInitialize(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        final Lifecycle lifecycle = ((LifecycleOwner) obj).getLifecycle();
        lifecycle.addObserver(new DefaultLifecycleObserver(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onResume(LifecycleOwner lifecycleOwner) {
                Handler.createAsync(Looper.getMainLooper()).postDelayed(new LoadEmojiCompatRunnable(0), 500L);
                lifecycle.removeObserver(this);
            }
        });
        return Boolean.TRUE;
    }

    @Override // androidx.startup.Initializer
    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
