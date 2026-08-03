package q3;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f5757j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile i f5758k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f5759a;

    /* renamed from: b, reason: collision with root package name */
    public final s.g f5760b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f5761c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f5762d;

    /* renamed from: e, reason: collision with root package name */
    public final f f5763e;

    /* renamed from: f, reason: collision with root package name */
    public final h f5764f;

    /* renamed from: g, reason: collision with root package name */
    public final m6.i f5765g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5766h;

    /* renamed from: i, reason: collision with root package name */
    public final d f5767i;

    public i(r rVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f5759a = reentrantReadWriteLock;
        this.f5761c = 3;
        h hVar = rVar.f5787a;
        this.f5764f = hVar;
        int i10 = rVar.f5788b;
        this.f5766h = i10;
        this.f5767i = rVar.f5789c;
        this.f5762d = new Handler(Looper.getMainLooper());
        this.f5760b = new s.g(0);
        this.f5765g = new m6.i(13);
        f fVar = new f(this);
        this.f5763e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.f5761c = 0;
            } catch (Throwable th) {
                this.f5759a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                hVar.a(new e(fVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static i a() {
        i iVar;
        synchronized (f5757j) {
            try {
                iVar = f5758k;
                if (!(iVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return iVar;
    }

    public final int b() {
        this.f5759a.readLock().lock();
        try {
            return this.f5761c;
        } finally {
            this.f5759a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.f5766h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f5759a.writeLock().lock();
        try {
            if (this.f5761c == 0) {
                return;
            }
            this.f5761c = 0;
            this.f5759a.writeLock().unlock();
            f fVar = this.f5763e;
            i iVar = fVar.f5754a;
            try {
                iVar.f5764f.a(new e(fVar));
            } catch (Throwable th) {
                iVar.d(th);
            }
        } finally {
            this.f5759a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f5759a.writeLock().lock();
        try {
            this.f5761c = 2;
            arrayList.addAll(this.f5760b);
            this.f5760b.clear();
            this.f5759a.writeLock().unlock();
            this.f5762d.post(new e3.a(arrayList, this.f5761c, th));
        } catch (Throwable th2) {
            this.f5759a.writeLock().unlock();
            throw th2;
        }
    }
}
