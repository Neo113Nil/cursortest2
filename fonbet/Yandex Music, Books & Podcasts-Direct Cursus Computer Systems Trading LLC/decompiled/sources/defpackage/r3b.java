package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class r3b {
    public static final Object j = new Object();
    public static volatile r3b k;
    public final ReentrantReadWriteLock a;
    public final cz0 b;
    public volatile int c;
    public final Handler d;
    public final s70 e;
    public final q3b f;
    public final wvo g;
    public final int h;
    public final qm7 i;

    public r3b(cqc cqcVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        q3b q3bVar = (q3b) cqcVar.b;
        this.f = q3bVar;
        int i = cqcVar.a;
        this.h = i;
        this.i = (qm7) cqcVar.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new cz0(0);
        this.g = new wvo(21);
        s70 s70Var = new s70(this);
        this.e = s70Var;
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
        if (c() == 0) {
            try {
                q3bVar.a(new o3b(s70Var));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static r3b a() {
        r3b r3bVar;
        synchronized (j) {
            try {
                r3bVar = k;
                if (!(r3bVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return r3bVar;
    }

    public static boolean d() {
        return k != null;
    }

    public final int b(int i, CharSequence charSequence) {
        if (!(c() == 1)) {
            xq0.q("Not initialized yet");
            return 0;
        }
        o5g.w(charSequence, "charSequence cannot be null");
        vx6 vx6Var = (vx6) this.e.a;
        vx6Var.getClass();
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            kdt[] kdtVarArr = (kdt[]) spanned.getSpans(i, i + 1, kdt.class);
            if (kdtVarArr.length > 0) {
                return spanned.getSpanStart(kdtVarArr[0]);
            }
        }
        return ((c4b) vx6Var.J(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new c4b(i))).b;
    }

    public final int c() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void e() {
        if (!(this.h == 1)) {
            xq0.q("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (c() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            s70 s70Var = this.e;
            r3b r3bVar = (r3b) s70Var.b;
            try {
                r3bVar.f.a(new o3b(s70Var));
            } catch (Throwable th) {
                r3bVar.f(th);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new zs3(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a8 A[Catch: all -> 0x008b, TryCatch #1 {all -> 0x008b, blocks: (B:30:0x0063, B:33:0x0068, B:35:0x006c, B:37:0x0079, B:39:0x0098, B:41:0x00a2, B:43:0x00a5, B:45:0x00a8, B:47:0x00b8, B:48:0x00bb), top: B:29:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence g(int i, int i2, int i3, CharSequence charSequence) {
        Throwable th;
        CharSequence charSequence2;
        int i4;
        int i5;
        kdt[] kdtVarArr;
        if (!(c() == 1)) {
            xq0.q("Not initialized yet");
            return null;
        }
        if (i < 0) {
            xq0.x("start cannot be negative");
            return null;
        }
        if (i2 < 0) {
            xq0.x("end cannot be negative");
            return null;
        }
        o5g.u("start should be <= than end", i <= i2);
        flt fltVar = null;
        if (charSequence == null) {
            return null;
        }
        o5g.u("start should be < than charSequence length", i <= charSequence.length());
        o5g.u("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        boolean z = i3 == 1;
        vx6 vx6Var = (vx6) this.e.a;
        vx6Var.getClass();
        boolean z2 = charSequence instanceof f4r;
        if (z2) {
            ((f4r) charSequence).a();
        }
        try {
            if (!z2) {
                try {
                    if (!(charSequence instanceof Spannable)) {
                        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, kdt.class) <= i2) {
                            fltVar = new flt();
                            fltVar.a = false;
                            fltVar.b = new SpannableString(charSequence);
                        }
                        if (fltVar != null && (kdtVarArr = (kdt[]) fltVar.b.getSpans(i, i2, kdt.class)) != null && kdtVarArr.length > 0) {
                            for (kdt kdtVar : kdtVarArr) {
                                int spanStart = fltVar.b.getSpanStart(kdtVar);
                                int spanEnd = fltVar.b.getSpanEnd(kdtVar);
                                if (spanStart != i2) {
                                    fltVar.removeSpan(kdtVar);
                                }
                                i = Math.min(spanStart, i);
                                i2 = Math.max(spanEnd, i2);
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
                                flt fltVar2 = (flt) vx6Var.J(charSequence2, i4, i5, Integer.MAX_VALUE, z, new le3(fltVar, (wvo) vx6Var.b));
                                if (fltVar2 != null) {
                                    Spannable spannable = fltVar2.b;
                                    if (z2) {
                                        ((f4r) charSequence2).b();
                                    }
                                    return spannable;
                                }
                                if (!z2) {
                                    return charSequence2;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                th = th;
                                if (!z2) {
                                    throw th;
                                }
                                ((f4r) charSequence2).b();
                                throw th;
                            }
                        }
                        ((f4r) charSequence2).b();
                        return charSequence2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    charSequence2 = charSequence;
                    if (!z2) {
                    }
                }
            }
            fltVar = new flt((Spannable) charSequence);
            if (fltVar != null) {
                while (r1 < r3) {
                }
            }
            i4 = i;
            i5 = i2;
            if (i4 != i5) {
            }
            charSequence2 = charSequence;
            if (!z2) {
            }
            ((f4r) charSequence2).b();
            return charSequence2;
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
            th = th;
            if (!z2) {
            }
        }
    }

    public final void h(p3b p3bVar) {
        o5g.w(p3bVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c != 1 && this.c != 2) {
                this.b.add(p3bVar);
                this.a.writeLock().unlock();
            }
            this.d.post(new zs3(Arrays.asList(p3bVar), this.c, (Throwable) null));
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public final void i(EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        s70 s70Var = this.e;
        s70Var.getClass();
        Bundle bundle = editorInfo.extras;
        a3i a3iVar = (a3i) ((xdh) s70Var.c).a;
        int a = a3iVar.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a != 0 ? ((ByteBuffer) a3iVar.d).getInt(a + a3iVar.a) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
