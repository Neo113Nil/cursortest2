package com.gamericefishpro.space.s4;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.n9.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final Object j = new Object();
    public static volatile k k;
    public final ReentrantReadWriteLock a;
    public final com.gamericefishpro.space.t.f b;
    public volatile int c;
    public final Handler d;
    public final e e;
    public final j f;
    public final z g;
    public final int h;
    public final c i;

    public k(r rVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        j jVar = (j) rVar.b;
        this.f = jVar;
        int i = rVar.a;
        this.h = i;
        this.i = (c) rVar.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new com.gamericefishpro.space.t.f(0);
        this.g = new z(25);
        e eVar = new e(this);
        this.e = eVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                jVar.b(new d(eVar));
            } catch (Throwable th2) {
                e(th2);
            }
        }
    }

    public static k a() {
        k kVar;
        synchronized (j) {
            try {
                kVar = k;
                if (!(kVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVar;
    }

    public static boolean c() {
        return k != null;
    }

    public final int b() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void d() {
        if (!(this.h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                this.a.writeLock().unlock();
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            e eVar = this.e;
            k kVar = eVar.a;
            try {
                kVar.f.b(new d(eVar));
            } catch (Throwable th) {
                kVar.e(th);
            }
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void e(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new i(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a5 A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:35:0x0060, B:38:0x0065, B:40:0x0069, B:42:0x0076, B:49:0x0095, B:51:0x009f, B:53:0x00a2, B:55:0x00a5, B:57:0x00b5, B:58:0x00b8), top: B:92:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b5 A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:35:0x0060, B:38:0x0065, B:40:0x0069, B:42:0x0076, B:49:0x0095, B:51:0x009f, B:53:0x00a2, B:55:0x00a5, B:57:0x00b5, B:58:0x00b8), top: B:92:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:83:0x0103  */
    /* JADX WARN: Code duplicated, block: B:99:? A[SYNTHETIC] */
    public final CharSequence f(int i, int i2, int i3, CharSequence charSequence) throws Throwable {
        Throwable th;
        CharSequence charSequence2;
        int i4;
        int i5;
        w[] wVarArr;
        int spanStart;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        a4.n("start should be <= than end", i <= i2);
        y yVar = null;
        if (charSequence == null) {
            return null;
        }
        a4.n("start should be < than charSequence length", i <= charSequence.length());
        a4.n("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        boolean z = i3 == 1;
        com.gamericefishpro.space.r5.b bVar = this.e.b;
        bVar.getClass();
        boolean z2 = charSequence instanceof u;
        if (z2) {
            ((u) charSequence).a();
        }
        if (z2) {
            yVar = new y((Spannable) charSequence);
            if (yVar != null) {
                for (w wVar : wVarArr) {
                    spanStart = yVar.e.getSpanStart(wVar);
                    int spanEnd = yVar.e.getSpanEnd(wVar);
                    if (spanStart != i2) {
                        yVar.removeSpan(wVar);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd, i2);
                }
            }
            i4 = i;
            i5 = i2;
            if (i4 != i5) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            }
            ((u) charSequence2).b();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    yVar = new y((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((u) charSequence2).b();
                    throw th;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, w.class) <= i2) {
                yVar = new y();
                yVar.d = false;
                yVar.e = new SpannableString(charSequence);
            }
            if (yVar != null && (wVarArr = (w[]) yVar.e.getSpans(i, i2, w.class)) != null && wVarArr.length > 0) {
                while (i < r3) {
                    spanStart = yVar.e.getSpanStart(wVar);
                    int spanEnd2 = yVar.e.getSpanEnd(wVar);
                    if (spanStart != i2) {
                        yVar.removeSpan(wVar);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd2, i2);
                }
            }
            i4 = i;
            i5 = i2;
            if (i4 != i5 || i4 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                try {
                    y yVar2 = (y) bVar.o(charSequence2, i4, i5, Integer.MAX_VALUE, z, new com.gamericefishpro.space.u6.l(yVar, (z) bVar.e));
                    if (yVar2 != null) {
                        Spannable spannable = yVar2.e;
                        if (z2) {
                            ((u) charSequence2).b();
                        }
                        return spannable;
                    }
                    if (!z2) {
                        return charSequence2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((u) charSequence2).b();
                    throw th;
                }
            }
            ((u) charSequence2).b();
            return charSequence2;
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z2) {
            throw th;
        }
        ((u) charSequence2).b();
        throw th;
    }

    public final void g(h hVar) {
        a4.p(hVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new i(Arrays.asList(hVar), this.c, (Throwable) null));
            } else {
                this.b.add(hVar);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }
}
