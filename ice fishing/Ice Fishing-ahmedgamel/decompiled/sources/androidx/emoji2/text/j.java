package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import com.google.android.gms.internal.ads.C3067cm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f4739j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile j f4740k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f4741a;

    /* renamed from: b, reason: collision with root package name */
    public final s.c f4742b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f4743c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f4744d;

    /* renamed from: e, reason: collision with root package name */
    public final f f4745e;

    /* renamed from: f, reason: collision with root package name */
    public final i f4746f;

    /* renamed from: g, reason: collision with root package name */
    public final c4.e f4747g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4748h;
    public final d i;

    public j(q qVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f4741a = reentrantReadWriteLock;
        this.f4743c = 3;
        i iVar = (i) qVar.f4737b;
        this.f4746f = iVar;
        int i = qVar.f4736a;
        this.f4748h = i;
        this.i = (d) qVar.f4738c;
        this.f4744d = new Handler(Looper.getMainLooper());
        this.f4742b = new s.c(0);
        this.f4747g = new c4.e();
        f fVar = new f(this);
        this.f4745e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f4743c = 0;
            } catch (Throwable th) {
                this.f4741a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                iVar.c(new e(fVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static j a() {
        j jVar;
        synchronized (f4739j) {
            try {
                jVar = f4740k;
                if (!(jVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return jVar;
    }

    public final int b() {
        this.f4741a.readLock().lock();
        try {
            return this.f4743c;
        } finally {
            this.f4741a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.f4748h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f4741a.writeLock().lock();
        try {
            if (this.f4743c == 0) {
                return;
            }
            this.f4743c = 0;
            this.f4741a.writeLock().unlock();
            f fVar = this.f4745e;
            j jVar = fVar.f4733a;
            try {
                jVar.f4746f.c(new e(fVar));
            } catch (Throwable th) {
                jVar.d(th);
            }
        } finally {
            this.f4741a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f4741a.writeLock().lock();
        try {
            this.f4743c = 2;
            arrayList.addAll(this.f4742b);
            this.f4742b.clear();
            this.f4741a.writeLock().unlock();
            this.f4744d.post(new L.a(arrayList, this.f4743c, th));
        } catch (Throwable th2) {
            this.f4741a.writeLock().unlock();
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
    public final CharSequence e(CharSequence charSequence, int i, int i4) {
        Throwable th;
        CharSequence charSequence2;
        int i6;
        int i9;
        v[] vVarArr;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        A8.b.c("start should be <= than end", i <= i4);
        x xVar = null;
        if (charSequence == null) {
            return null;
        }
        A8.b.c("start should be < than charSequence length", i <= charSequence.length());
        A8.b.c("end should be < than charSequence length", i4 <= charSequence.length());
        if (charSequence.length() == 0 || i == i4) {
            return charSequence;
        }
        b3.e eVar = this.f4745e.f4734b;
        eVar.getClass();
        boolean z6 = charSequence instanceof t;
        if (z6) {
            ((t) charSequence).a();
        }
        try {
            if (!z6) {
                try {
                    if (!(charSequence instanceof Spannable)) {
                        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i4 + 1, v.class) <= i4) {
                            xVar = new x();
                            xVar.f4779n = false;
                            xVar.f4780u = new SpannableString(charSequence);
                        }
                        if (xVar != null && (vVarArr = (v[]) xVar.f4780u.getSpans(i, i4, v.class)) != null && vVarArr.length > 0) {
                            for (v vVar : vVarArr) {
                                int spanStart = xVar.f4780u.getSpanStart(vVar);
                                int spanEnd = xVar.f4780u.getSpanEnd(vVar);
                                if (spanStart != i4) {
                                    xVar.removeSpan(vVar);
                                }
                                i = Math.min(spanStart, i);
                                i4 = Math.max(spanEnd, i4);
                            }
                        }
                        i6 = i;
                        i9 = i4;
                        if (i6 != i9 || i6 >= charSequence.length()) {
                            charSequence2 = charSequence;
                            if (!z6) {
                                return charSequence2;
                            }
                        } else {
                            try {
                                charSequence2 = charSequence;
                                try {
                                    x xVar2 = (x) eVar.C(charSequence2, i6, i9, Integer.MAX_VALUE, false, new C3067cm(6, xVar, (c4.e) eVar.f5557u));
                                    if (xVar2 != null) {
                                        Spannable spannable = xVar2.f4780u;
                                        if (z6) {
                                            ((t) charSequence2).b();
                                        }
                                        return spannable;
                                    }
                                    if (!z6) {
                                        return charSequence2;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    th = th;
                                    if (z6) {
                                    }
                                }
                            } catch (Throwable th3) {
                                charSequence2 = charSequence;
                                th = th3;
                                if (z6) {
                                }
                            }
                        }
                        ((t) charSequence2).b();
                        return charSequence2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    charSequence2 = charSequence;
                    if (z6) {
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
            i6 = i;
            i9 = i4;
            if (i6 != i9) {
            }
            charSequence2 = charSequence;
            if (!z6) {
            }
            ((t) charSequence2).b();
            return charSequence2;
        } catch (Throwable th5) {
            th = th5;
            charSequence2 = charSequence;
            th = th;
            if (z6) {
            }
        }
    }

    public final void f(h hVar) {
        A8.b.e(hVar, "initCallback cannot be null");
        this.f4741a.writeLock().lock();
        try {
            if (this.f4743c != 1 && this.f4743c != 2) {
                this.f4742b.add(hVar);
                this.f4741a.writeLock().unlock();
            }
            this.f4744d.post(new L.a(Arrays.asList(hVar), this.f4743c, (Throwable) null));
            this.f4741a.writeLock().unlock();
        } catch (Throwable th) {
            this.f4741a.writeLock().unlock();
            throw th;
        }
    }
}
