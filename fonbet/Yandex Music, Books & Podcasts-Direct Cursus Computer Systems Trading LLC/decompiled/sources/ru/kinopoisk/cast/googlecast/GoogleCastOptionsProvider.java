package ru.kinopoisk.cast.googlecast;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.b1x;
import defpackage.bnd;
import defpackage.c5b;
import defpackage.d94;
import defpackage.g74;
import defpackage.jj4;
import defpackage.k74;
import defpackage.lfj;
import defpackage.mnf;
import defpackage.nxv;
import defpackage.pd;
import defpackage.swj;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.di.EasyLoginSdkComponent;
import ru.kinopoisk.sdk.easylogin.internal.di.Injector;
import timber.log.Timber;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/kinopoisk/cast/googlecast/GoogleCastOptionsProvider;", "Lswj;", "<init>", "()V", "Landroid/content/Context;", "context", "Lk74;", "getCastOptions", "(Landroid/content/Context;)Lk74;", "", "Lb1x;", "getAdditionalSessionProviders", "(Landroid/content/Context;)Ljava/util/List;", "bnd", "android_cast_connectivitymobile_googlecast"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class GoogleCastOptionsProvider implements swj {
    @Override // defpackage.swj
    @NotNull
    public List<b1x> getAdditionalSessionProviders(@NotNull Context context) {
        context.getClass();
        return c5b.a;
    }

    @Override // defpackage.swj
    @NotNull
    public k74 getCastOptions(@NotNull Context context) {
        context.getClass();
        nxv nxvVar = pd.k;
        if (nxvVar != null) {
            nxvVar.invoke();
        }
        Injector injector = Injector.a;
        EasyLoginSdkComponent easyLoginSdkComponent = Injector.b;
        if (easyLoginSdkComponent == null) {
            xq0.x("applicationComponent is not initialized");
            return null;
        }
        String a = easyLoginSdkComponent.getGoogleCastSettingProvider().a();
        Timber.INSTANCE.tag("GoogleCastOptions").d("Build cast options with receiver id = %s", a);
        ArrayList arrayList = new ArrayList();
        Locale locale = Locale.getDefault();
        Pattern pattern = d94.a;
        locale.getLanguage();
        TextUtils.isEmpty(locale.getCountry());
        TextUtils.isEmpty(locale.getVariant());
        ArrayList arrayList2 = new ArrayList();
        mnf mnfVar = new mnf();
        mnfVar.a = false;
        mnfVar.c = true;
        new lfj().a();
        lfj lfjVar = new lfj();
        lfjVar.b = new bnd(context);
        g74 g74Var = new g74("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, lfjVar.a(), false, true);
        if (k74.s != null) {
            return new k74(a, arrayList, true, mnfVar, true, g74Var, true, 0.05000000074505806d, false, false, false, arrayList2, true, false, k74.q, k74.r);
        }
        jj4.j("use Optional.orNull() instead of Optional.or(null)");
        return null;
    }
}
