package androidx.emoji2.text;

import L3.F;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f4771j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile j f4772k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f4773a;

    /* renamed from: b, reason: collision with root package name */
    public final s.c f4774b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f4775c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f4776d;

    /* renamed from: e, reason: collision with root package name */
    public final f f4777e;

    /* renamed from: f, reason: collision with root package name */
    public final i f4778f;

    /* renamed from: g, reason: collision with root package name */
    public final M2.i f4779g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4780h;
    public final d i;

    public j(q qVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f4773a = reentrantReadWriteLock;
        this.f4775c = 3;
        i iVar = (i) qVar.f4769b;
        this.f4778f = iVar;
        int i = qVar.f4768a;
        this.f4780h = i;
        this.i = (d) qVar.f4770c;
        this.f4776d = new Handler(Looper.getMainLooper());
        this.f4774b = new s.c(0);
        this.f4779g = new M2.i(12);
        f fVar = new f(this);
        this.f4777e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f4775c = 0;
            } catch (Throwable th) {
                this.f4773a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                iVar.a(new e(fVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static j a() {
        j jVar;
        synchronized (f4771j) {
            try {
                jVar = f4772k;
                if (!(jVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return jVar;
    }

    public final int b() {
        this.f4773a.readLock().lock();
        try {
            return this.f4775c;
        } finally {
            this.f4773a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.f4780h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f4773a.writeLock().lock();
        try {
            if (this.f4775c == 0) {
                return;
            }
            this.f4775c = 0;
            this.f4773a.writeLock().unlock();
            f fVar = this.f4777e;
            j jVar = fVar.f4765a;
            try {
                jVar.f4778f.a(new e(fVar));
            } catch (Throwable th) {
                jVar.d(th);
            }
        } finally {
            this.f4773a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f4773a.writeLock().lock();
        try {
            this.f4775c = 2;
            arrayList.addAll(this.f4774b);
            this.f4774b.clear();
            this.f4773a.writeLock().unlock();
            this.f4776d.post(new L.a(arrayList, this.f4775c, th));
        } catch (Throwable th2) {
            this.f4773a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x009f A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:28:0x005a, B:31:0x005f, B:33:0x0063, B:35:0x0070, B:37:0x008f, B:39:0x0099, B:41:0x009c, B:43:0x009f, B:45:0x00af, B:46:0x00b2), top: B:27:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence e(CharSequence charSequence, int i, int i6) {
        Throwable th;
        CharSequence charSequence2;
        int i9;
        int i10;
        v[] vVarArr;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i6 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        F.d("start should be <= than end", i <= i6);
        x xVar = null;
        if (charSequence == null) {
            return null;
        }
        F.d("start should be < than charSequence length", i <= charSequence.length());
        F.d("end should be < than charSequence length", i6 <= charSequence.length());
        if (charSequence.length() == 0 || i == i6) {
            return charSequence;
        }
        Z2.e eVar = this.f4777e.f4766b;
        eVar.getClass();
        boolean z3 = charSequence instanceof t;
        if (z3) {
            ((t) charSequence).a();
        }
        try {
            if (!z3) {
                try {
                    if (!(charSequence instanceof Spannable)) {
                        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i6 + 1, v.class) <= i6) {
                            xVar = new x();
                            xVar.f4811n = false;
                            xVar.f4812u = new SpannableString(charSequence);
                        }
                        if (xVar != null && (vVarArr = (v[]) xVar.f4812u.getSpans(i, i6, v.class)) != null && vVarArr.length > 0) {
                            for (v vVar : vVarArr) {
                                int spanStart = xVar.f4812u.getSpanStart(vVar);
                                int spanEnd = xVar.f4812u.getSpanEnd(vVar);
                                if (spanStart != i6) {
                                    xVar.removeSpan(vVar);
                                }
                                i = Math.min(spanStart, i);
                                i6 = Math.max(spanEnd, i6);
                            }
                        }
                        i9 = i;
                        i10 = i6;
                        if (i9 != i10 || i9 >= charSequence.length()) {
                            charSequence2 = charSequence;
                            if (!z3) {
                                return charSequence2;
                            }
                        } else {
                            try {
                                charSequence2 = charSequence;
                                try {
                                    x xVar2 = (x) eVar.C(charSequence2, i9, i10, Integer.MAX_VALUE, false, new S0.l(6, xVar, (M2.i) eVar.f4170u));
                                    if (xVar2 != null) {
                                        Spannable spannable = xVar2.f4812u;
                                        if (z3) {
                                            ((t) charSequence2).b();
                                        }
                                        return spannable;
                                    }
                                    if (!z3) {
                                        return charSequence2;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    th = th;
                                    if (z3) {
                                    }
                                }
                            } catch (Throwable th3) {
                                charSequence2 = charSequence;
                                th = th3;
                                if (z3) {
                                }
                            }
                        }
                        ((t) charSequence2).b();
                        return charSequence2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    charSequence2 = charSequence;
                    if (z3) {
                        throw th;
                    }
                    ((t) charSequence2).b();
                    throw th;
                }
            }
            xVar = new x((Spannable) charSequence);
            if (xVar != null) {
                while (r1 < r5) {
                }
            }
            i9 = i;
            i10 = i6;
            if (i9 != i10) {
            }
            charSequence2 = charSequence;
            if (!z3) {
            }
            ((t) charSequence2).b();
            return charSequence2;
        } catch (Throwable th5) {
            th = th5;
            charSequence2 = charSequence;
            th = th;
            if (z3) {
            }
        }
    }

    public final void f(h hVar) {
        F.f(hVar, "initCallback cannot be null");
        this.f4773a.writeLock().lock();
        try {
            if (this.f4775c != 1 && this.f4775c != 2) {
                this.f4774b.add(hVar);
                this.f4773a.writeLock().unlock();
            }
            this.f4776d.post(new L.a(Arrays.asList(hVar), this.f4775c, (Throwable) null));
            this.f4773a.writeLock().unlock();
        } catch (Throwable th) {
            this.f4773a.writeLock().unlock();
            throw th;
        }
    }
}
