package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ze {
    public static final Object eVhOlqcC = new Object();
    public static volatile ze k3x7lurq;
    public volatile int MdtA4re8;
    public final z0 NCTxEWno;
    public final ye P7K7Inc8;
    public final int Qr9iLBAD;
    public final ve VgvYg0wo;
    public final re b2ZJblxo;
    public final wa jb9XjC4I;
    public final ReentrantReadWriteLock qoPGr6Ce;
    public final Handler wxUZMvaN;

    public ze(vh vhVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.qoPGr6Ce = reentrantReadWriteLock;
        this.MdtA4re8 = 3;
        ye yeVar = (ye) vhVar.NCTxEWno;
        this.P7K7Inc8 = yeVar;
        int i = vhVar.qoPGr6Ce;
        this.Qr9iLBAD = i;
        this.jb9XjC4I = (wa) vhVar.MdtA4re8;
        this.wxUZMvaN = new Handler(Looper.getMainLooper());
        this.NCTxEWno = new z0();
        this.b2ZJblxo = new re(14);
        ve veVar = new ve(this);
        this.VgvYg0wo = veVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.MdtA4re8 = 0;
            } catch (Throwable th) {
                this.qoPGr6Ce.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (NCTxEWno() == 0) {
            try {
                yeVar.qoPGr6Ce(new ue(veVar));
            } catch (Throwable th2) {
                wxUZMvaN(th2);
            }
        }
    }

    public static ze qoPGr6Ce() {
        ze zeVar;
        synchronized (eVhOlqcC) {
            try {
                zeVar = k3x7lurq;
                if (!(zeVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return zeVar;
    }

    public final void MdtA4re8() {
        if (!(this.Qr9iLBAD == 1)) {
            m1.Ey6iv0m0("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (NCTxEWno() == 1) {
            return;
        }
        this.qoPGr6Ce.writeLock().lock();
        try {
            if (this.MdtA4re8 == 0) {
                return;
            }
            this.MdtA4re8 = 0;
            this.qoPGr6Ce.writeLock().unlock();
            ve veVar = this.VgvYg0wo;
            ze zeVar = veVar.qoPGr6Ce;
            try {
                zeVar.P7K7Inc8.qoPGr6Ce(new ue(veVar));
            } catch (Throwable th) {
                zeVar.wxUZMvaN(th);
            }
        } finally {
            this.qoPGr6Ce.writeLock().unlock();
        }
    }

    public final int NCTxEWno() {
        this.qoPGr6Ce.readLock().lock();
        try {
            return this.MdtA4re8;
        } finally {
            this.qoPGr6Ce.readLock().unlock();
        }
    }

    public final void P7K7Inc8(xe xeVar) {
        this.qoPGr6Ce.writeLock().lock();
        try {
            if (this.MdtA4re8 != 1 && this.MdtA4re8 != 2) {
                this.NCTxEWno.add(xeVar);
                this.qoPGr6Ce.writeLock().unlock();
            }
            this.wxUZMvaN.post(new g3(Arrays.asList(xeVar), this.MdtA4re8, (Throwable) null));
            this.qoPGr6Ce.writeLock().unlock();
        } catch (Throwable th) {
            this.qoPGr6Ce.writeLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0097 A[Catch: all -> 0x0079, TryCatch #3 {all -> 0x0079, blocks: (B:87:0x0051, B:90:0x0056, B:92:0x005a, B:94:0x0067, B:33:0x0086, B:35:0x0090, B:37:0x0093, B:39:0x0097, B:41:0x00a7, B:42:0x00aa), top: B:86:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence VgvYg0wo(CharSequence charSequence, int i, int i2) {
        CharSequence charSequence2;
        Throwable th;
        int i3;
        int i4;
        ue0[] ue0VarArr;
        boolean z = false;
        af0 af0Var = null;
        if (!(NCTxEWno() == 1)) {
            m1.Ey6iv0m0("Not initialized yet");
            return null;
        }
        if (i < 0) {
            m1.sjUBp5pO("start cannot be negative");
            return null;
        }
        if (i2 < 0) {
            m1.sjUBp5pO("end cannot be negative");
            return null;
        }
        if (!(i <= i2)) {
            m1.sjUBp5pO("start should be <= than end");
            return null;
        }
        if (charSequence == null) {
            return null;
        }
        if (!(i <= charSequence.length())) {
            m1.sjUBp5pO("start should be < than charSequence length");
            return null;
        }
        if (!(i2 <= charSequence.length())) {
            m1.sjUBp5pO("end should be < than charSequence length");
            return null;
        }
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        f0 f0Var = this.VgvYg0wo.NCTxEWno;
        f0Var.getClass();
        boolean z2 = charSequence instanceof z70;
        if (z2) {
            ((z70) charSequence).qoPGr6Ce();
        }
        try {
            if (!z2) {
                try {
                    if (!(charSequence instanceof Spannable)) {
                        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, ue0.class) <= i2) {
                            af0Var = new af0();
                            af0Var.NCTxEWno = false;
                            af0Var.MdtA4re8 = new SpannableString(charSequence);
                        }
                        if (af0Var != null && (ue0VarArr = (ue0[]) af0Var.MdtA4re8.getSpans(i, i2, ue0.class)) != null && ue0VarArr.length > 0) {
                            for (ue0 ue0Var : ue0VarArr) {
                                int spanStart = af0Var.MdtA4re8.getSpanStart(ue0Var);
                                int spanEnd = af0Var.MdtA4re8.getSpanEnd(ue0Var);
                                if (spanStart != i2) {
                                    af0Var.removeSpan(ue0Var);
                                }
                                i = Math.min(spanStart, i);
                                i2 = Math.max(spanEnd, i2);
                            }
                        }
                        i3 = i;
                        i4 = i2;
                        if (i3 != i4 || i3 >= charSequence.length()) {
                            charSequence2 = charSequence;
                            if (!z2) {
                                return charSequence2;
                            }
                        } else {
                            try {
                                charSequence2 = charSequence;
                            } catch (Throwable th2) {
                                charSequence2 = charSequence;
                                th = th2;
                                if (z2) {
                                }
                            }
                            try {
                                af0 af0Var2 = (af0) f0Var.euDDoUNr(charSequence2, i3, i4, Integer.MAX_VALUE, false, new mcXgUFR8(af0Var, (re) f0Var.MdtA4re8, 16, z));
                                if (af0Var2 != null) {
                                    Spannable spannable = af0Var2.MdtA4re8;
                                    if (z2) {
                                        ((z70) charSequence2).NCTxEWno();
                                    }
                                    return spannable;
                                }
                                if (!z2) {
                                    return charSequence2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                th = th;
                                if (z2) {
                                }
                            }
                        }
                        ((z70) charSequence2).NCTxEWno();
                        return charSequence2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    charSequence2 = charSequence;
                    if (z2) {
                    }
                }
            }
            af0Var = new af0((Spannable) charSequence);
            if (af0Var != null) {
                while (r5 < r2) {
                }
            }
            i3 = i;
            i4 = i2;
            if (i3 != i4) {
            }
            charSequence2 = charSequence;
            if (!z2) {
            }
            ((z70) charSequence2).NCTxEWno();
            return charSequence2;
        } catch (Throwable th5) {
            th = th5;
            charSequence2 = charSequence;
            th = th;
            if (z2) {
                throw th;
            }
            ((z70) charSequence2).NCTxEWno();
            throw th;
        }
    }

    public final void wxUZMvaN(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.qoPGr6Ce.writeLock().lock();
        try {
            this.MdtA4re8 = 2;
            arrayList.addAll(this.NCTxEWno);
            this.NCTxEWno.clear();
            this.qoPGr6Ce.writeLock().unlock();
            this.wxUZMvaN.post(new g3(arrayList, this.MdtA4re8, th));
        } catch (Throwable th2) {
            this.qoPGr6Ce.writeLock().unlock();
            throw th2;
        }
    }
}
