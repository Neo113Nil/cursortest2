package com.yandex.passport.internal.push;

import android.os.Handler;
import android.os.Looper;
import android.security.keystore.KeyGenParameterSpec;
import android.webkit.CookieManager;
import com.yandex.passport.internal.social.esia.EsiaBindActivity;
import com.yandex.passport.internal.ui.account_upgrade.AccountUpgraderActivity;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.LogoutBottomSheetActivity;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.o1;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesHelperActivity;
import com.yandex.passport.internal.widget.ErrorView;
import defpackage.cxb;
import defpackage.ern;
import defpackage.ich;
import defpackage.jj4;
import defpackage.kac;
import defpackage.mvg;
import defpackage.qy0;
import defpackage.szf;
import defpackage.tkr;
import defpackage.u6k;
import defpackage.uah;
import defpackage.xq0;
import defpackage.y0q;
import defpackage.ydr;
import defpackage.zic;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import javax.crypto.KeyGenerator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class w0 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ w0(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ydr.a(null);
            case 1:
                return ydr.a(null);
            case 2:
                KeyGenParameterSpec keyGenParameterSpec = ich.a;
                if (keyGenParameterSpec.getKeySize() != 256) {
                    jj4.g(keyGenParameterSpec.getKeySize(), "invalid key size, want 256 bits got ", " bits");
                    return null;
                }
                if (!Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
                    kac.l(Arrays.toString(keyGenParameterSpec.getBlockModes()), "invalid block mode, want GCM got ");
                    return null;
                }
                if (keyGenParameterSpec.getPurposes() != 3) {
                    kac.c(keyGenParameterSpec.getPurposes(), "invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got ");
                    return null;
                }
                if (!Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
                    kac.l(Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()), "invalid padding mode, want NoPadding got ");
                    return null;
                }
                if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
                    xq0.x("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
                    return null;
                }
                String keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                if (!keyStore.containsAlias(keystoreAlias)) {
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    keyGenerator.init(keyGenParameterSpec);
                    keyGenerator.generateKey();
                }
                return keyGenParameterSpec.getKeystoreAlias();
            case 3:
                int i = EsiaBindActivity.h;
                return CookieManager.getInstance();
            case 4:
                int i2 = AccountUpgraderActivity.f;
                return com.yandex.passport.internal.di.a.a().getViewModelsFactory();
            case 5:
                int i3 = AuthSdkActivity.l;
                return com.yandex.passport.internal.di.a.a();
            case 6:
                return "BouncerMasterChooser_" + UUID.randomUUID();
            case 7:
                return "BouncerChallenge_" + UUID.randomUUID();
            case 8:
                return new u6k(-1);
            case 9:
                return szf.g0(Boolean.FALSE);
            case 10:
                return szf.g0(ern.a(com.yandex.passport.internal.ui.bouncer.sloth.f.class).f() + '-' + UUID.randomUUID());
            case 11:
                int i4 = LogoutBottomSheetActivity.k;
                return com.yandex.passport.internal.ui.challenge.logout.bottomsheet.q0.r;
            case 12:
                return szf.g0(o1.a);
            case 13:
                return Unit.a;
            case 14:
                return cxb.J();
            case 15:
                return szf.g0("");
            case 16:
                int i5 = GlobalRouterActivity.i;
                return new com.yandex.passport.internal.ui.router.m();
            case 17:
                int i6 = ManagingPlusDevicesHelperActivity.g;
                return new Handler(Looper.getMainLooper());
            case 18:
                return szf.g0(Boolean.FALSE);
            case 19:
                return new ArrayList();
            case 20:
                return y0q.b(0, 0, null, 7);
            case 21:
                ?? r0 = com.yandex.passport.internal.util.m.a;
                ArrayList arrayList = new ArrayList(r0.size());
                for (Map.Entry entry : r0.entrySet()) {
                    arrayList.add(new Pair(Pattern.compile("(.*\\.)?".concat(String.format(kotlin.text.c.r((String) entry.getKey(), ".", "\\.", false), Arrays.copyOf(new Object[]{".*"}, 1)))), entry.getValue()));
                }
                return uah.n(arrayList);
            case 22:
                return Pattern.compile("^https://yandex\\.(ru|com|com\\.tr|by|kz|ua)/legal/.*");
            case 23:
                int i7 = ErrorView.p;
                return Unit.a;
            case 24:
                return CookieManager.getInstance();
            case 25:
                return com.yandex.passport.common.url.b.Companion.serializer();
            case 26:
                return new qy0(tkr.a, 0);
            case 27:
                return com.yandex.passport.common.url.b.Companion.serializer();
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new qy0(mvg.a, 0);
            default:
                return new qy0(zic.a, 0);
        }
    }
}
