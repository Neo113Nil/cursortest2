package defpackage;

import android.content.Context;
import com.yandex.auth.LegacyAccountType;
import com.yandex.music.shared.network.api.retrofit.MusicBackendHttpException;
import com.yandex.music.shared.network.api.retrofit.MusicCommonHttpException;
import java.io.IOException;
import java.util.HashMap;
import ru.yandex.music.utils.Preconditions;
import timber.log.Timber;

/* loaded from: classes6.dex */
public abstract class pu2 implements fuo {
    public frt a;
    public z66 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public pu2(boolean z, boolean z2, boolean z3) {
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public static kqt c(ypt yptVar, int i) {
        return (i == 400 || i == 404) ? new kqt(yptVar, 5) : i == 401 ? new kqt(yptVar, 7) : new kqt(yptVar, 8);
    }

    @Override // defpackage.fuo
    public final kqt a(Context context, ypt yptVar) {
        kqt kqtVar;
        String str;
        this.a = (frt) sk3.I(frt.class);
        this.b = (z66) sk3.I(z66.class);
        boolean z = v3g.E(this.a).a.d;
        boolean z2 = v3g.E(this.a).h;
        if ((this.c || yptVar.Q(LegacyAccountType.STRING_LOGIN) != null) && !z) {
            kqtVar = new kqt(yptVar, 3);
        } else if (this.d && !z2) {
            kqtVar = new kqt(yptVar, 4);
        } else if (!this.e || ((z66) Preconditions.nonNull(this.b)).g()) {
            try {
                kqtVar = b(context, yptVar);
            } catch (MusicBackendHttpException e) {
                kqtVar = c(yptVar, e.a);
            } catch (MusicCommonHttpException e2) {
                kqtVar = c(yptVar, e2.a);
            } catch (IOException unused) {
                kqtVar = new kqt(yptVar, 2);
            } catch (IllegalArgumentException e3) {
                Timber.e(e3, "customValidation error", new Object[0]);
                kqtVar = new kqt(yptVar, 6);
            }
        } else {
            kqtVar = new kqt(yptVar, 2);
        }
        ypt yptVar2 = kqtVar.a;
        yxc E = v3g.E(this.a);
        HashMap hashMap = new HashMap();
        hashMap.put("url", yptVar2.m().toString());
        hashMap.put("template_url", yptVar2.getType().name());
        hashMap.put("has_subscription", Boolean.valueOf(E.h));
        switch (kqtVar.c) {
            case 1:
                str = "SUCCESS";
                break;
            case 2:
                str = "NO_CONNECTION";
                break;
            case 3:
                str = "NO_AUTH";
                break;
            case 4:
                str = "NO_SUBSCRIPTION";
                break;
            case 5:
                str = "NOT_FOUND";
                break;
            case 6:
                str = "INVALID_DATA";
                break;
            case 7:
                str = "USER_TOKEN_EXPIRED";
                break;
            case 8:
                str = "UNKNOWN_ERROR";
                break;
            default:
                throw null;
        }
        hashMap.put("status_code", str);
        lg3.e0("URL_schemePassed", hashMap);
        return kqtVar;
    }

    public abstract kqt b(Context context, ypt yptVar);
}
