package V;

import a.AbstractC0078a;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import r.C0339g;

/* loaded from: classes.dex */
public final class j {
    public static final Object j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile j f1213k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f1214a;

    /* renamed from: b, reason: collision with root package name */
    public final C0339g f1215b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f1216c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f1217d;
    public final f e;

    /* renamed from: f, reason: collision with root package name */
    public final i f1218f;

    /* renamed from: g, reason: collision with root package name */
    public final S0.e f1219g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1220h;
    public final d i;

    public j(s sVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f1214a = reentrantReadWriteLock;
        this.f1216c = 3;
        i iVar = (i) sVar.f1211b;
        this.f1218f = iVar;
        int i = sVar.f1210a;
        this.f1220h = i;
        this.i = (d) sVar.f1212c;
        this.f1217d = new Handler(Looper.getMainLooper());
        this.f1215b = new C0339g();
        this.f1219g = new S0.e(10);
        f fVar = new f(this);
        this.e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f1216c = 0;
            } catch (Throwable th) {
                this.f1214a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                iVar.t(new e(fVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static j a() {
        j jVar;
        synchronized (j) {
            try {
                jVar = f1213k;
                if (!(jVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return jVar;
    }

    public final int b() {
        this.f1214a.readLock().lock();
        try {
            return this.f1216c;
        } finally {
            this.f1214a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.f1220h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f1214a.writeLock().lock();
        try {
            if (this.f1216c == 0) {
                return;
            }
            this.f1216c = 0;
            this.f1214a.writeLock().unlock();
            f fVar = this.e;
            j jVar = fVar.f1207a;
            try {
                jVar.f1218f.t(new e(fVar));
            } catch (Throwable th) {
                jVar.d(th);
            }
        } finally {
            this.f1214a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1214a.writeLock().lock();
        try {
            this.f1216c = 2;
            arrayList.addAll(this.f1215b);
            this.f1215b.clear();
            this.f1214a.writeLock().unlock();
            this.f1217d.post(new L.a(arrayList, this.f1216c, th));
        } catch (Throwable th2) {
            this.f1214a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009b A[Catch: all -> 0x007e, TryCatch #0 {all -> 0x007e, blocks: (B:67:0x0059, B:70:0x005e, B:72:0x0062, B:74:0x006f, B:29:0x008b, B:31:0x0095, B:33:0x0098, B:35:0x009b, B:37:0x00ab, B:39:0x00ae, B:44:0x00bd, B:47:0x00c4, B:49:0x00db, B:27:0x0081), top: B:66:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00db A[Catch: all -> 0x007e, TRY_LEAVE, TryCatch #0 {all -> 0x007e, blocks: (B:67:0x0059, B:70:0x005e, B:72:0x0062, B:74:0x006f, B:29:0x008b, B:31:0x0095, B:33:0x0098, B:35:0x009b, B:37:0x00ab, B:39:0x00ae, B:44:0x00bd, B:47:0x00c4, B:49:0x00db, B:27:0x0081), top: B:66:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence e(CharSequence charSequence, int i, int i2) {
        int i3;
        int i4;
        z zVar;
        x[] xVarArr;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        AbstractC0078a.e("start should be <= than end", i <= i2);
        z zVar2 = null;
        if (charSequence == null) {
            return null;
        }
        AbstractC0078a.e("start should be < than charSequence length", i <= charSequence.length());
        AbstractC0078a.e("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        M0.h hVar = this.e.f1208b;
        hVar.getClass();
        boolean z2 = charSequence instanceof v;
        if (z2) {
            ((v) charSequence).a();
        }
        if (!z2) {
            try {
                if (!(charSequence instanceof Spannable)) {
                    if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, x.class) <= i2) {
                        zVar2 = new z();
                        zVar2.f1256a = false;
                        zVar2.f1257b = new SpannableString(charSequence);
                    }
                    if (zVar2 != null && (xVarArr = (x[]) zVar2.f1257b.getSpans(i, i2, x.class)) != null && xVarArr.length > 0) {
                        for (x xVar : xVarArr) {
                            int spanStart = zVar2.f1257b.getSpanStart(xVar);
                            int spanEnd = zVar2.f1257b.getSpanEnd(xVar);
                            if (spanStart != i2) {
                                zVar2.removeSpan(xVar);
                            }
                            i = Math.min(spanStart, i);
                            i2 = Math.max(spanEnd, i2);
                        }
                    }
                    i3 = i;
                    i4 = i2;
                    if (i3 != i4 && i3 < charSequence.length()) {
                        zVar = (z) hVar.k(charSequence, i3, i4, Integer.MAX_VALUE, false, new F.i(zVar2, 4, (S0.e) hVar.f616b));
                        if (zVar != null) {
                            if (!z2) {
                                return charSequence;
                            }
                            return charSequence;
                        }
                        Spannable spannable = zVar.f1257b;
                        if (z2) {
                            ((v) charSequence).b();
                        }
                        return spannable;
                    }
                    return charSequence;
                }
            } finally {
                if (z2) {
                    ((v) charSequence).b();
                }
            }
        }
        zVar2 = new z((Spannable) charSequence);
        if (zVar2 != null) {
            while (r1 < r5) {
            }
        }
        i3 = i;
        i4 = i2;
        if (i3 != i4) {
            zVar = (z) hVar.k(charSequence, i3, i4, Integer.MAX_VALUE, false, new F.i(zVar2, 4, (S0.e) hVar.f616b));
            if (zVar != null) {
            }
        }
        return charSequence;
    }

    public final void f(h hVar) {
        AbstractC0078a.g(hVar, "initCallback cannot be null");
        this.f1214a.writeLock().lock();
        try {
            if (this.f1216c != 1 && this.f1216c != 2) {
                this.f1215b.add(hVar);
                this.f1214a.writeLock().unlock();
            }
            this.f1217d.post(new L.a(Arrays.asList(hVar), this.f1216c, (Throwable) null));
            this.f1214a.writeLock().unlock();
        } catch (Throwable th) {
            this.f1214a.writeLock().unlock();
            throw th;
        }
    }
}
