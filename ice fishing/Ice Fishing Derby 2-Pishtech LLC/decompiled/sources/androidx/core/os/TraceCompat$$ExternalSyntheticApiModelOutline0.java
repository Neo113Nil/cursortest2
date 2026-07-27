package androidx.core.os;

import android.graphics.drawable.Icon;
import android.hardware.fingerprint.FingerprintManager;
import android.os.LocaleList;
import android.text.PrecomputedText;
import java.security.Signature;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class TraceCompat$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ Icon m(Object obj) {
        return (Icon) obj;
    }

    public static /* synthetic */ FingerprintManager.CryptoObject m(Signature signature) {
        return new FingerprintManager.CryptoObject(signature);
    }

    public static /* synthetic */ FingerprintManager.CryptoObject m(Cipher cipher) {
        return new FingerprintManager.CryptoObject(cipher);
    }

    public static /* synthetic */ FingerprintManager.CryptoObject m(Mac mac) {
        return new FingerprintManager.CryptoObject(mac);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ FingerprintManager m56m(Object obj) {
        return (FingerprintManager) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ LocaleList m59m(Object obj) {
        return (LocaleList) obj;
    }

    public static /* synthetic */ LocaleList m(Locale[] localeArr) {
        return new LocaleList(localeArr);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ PrecomputedText m60m(Object obj) {
        return (PrecomputedText) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Class m62m() {
        return FingerprintManager.class;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m68m() {
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ boolean m72m(Object obj) {
        return obj instanceof PrecomputedText;
    }
}
