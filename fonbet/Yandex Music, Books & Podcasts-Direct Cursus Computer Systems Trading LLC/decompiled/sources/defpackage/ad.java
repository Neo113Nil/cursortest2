package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Patterns;
import com.yandex.passport.api.n;
import com.yandex.passport.api.x1;
import com.yandex.passport.internal.account.f;
import ru.yandex.music.R;
import ru.yandex.music.utils.Assertions;

/* loaded from: classes5.dex */
public enum ad implements Parcelable {
    YANDEX(0, 0),
    MAIL_RU(1, R.string.social_mail_ru),
    VKONTAKTE(2, R.string.social_vkontakte),
    TWITTER(3, R.string.social_twitter),
    FACEBOOK(4, R.string.social_facebook),
    GOOGLE_PLUS(5, R.string.social_google_plus),
    ODNOKLASSNIKI(6, R.string.social_odnoklassniki),
    PDD(7, 0),
    PHONE(8, 0),
    UNAUTHORIZED(9, 0);

    public final boolean a;
    public final int b;
    public static final ad[] m = values();
    public static final Parcelable.Creator<ad> CREATOR = new l(2);

    ad(int i, int i2) {
        this.a = r2;
        this.b = i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0083, code lost:
    
        if (r4.equals("fb") == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ad a(f fVar) {
        x1 x1Var;
        Account account = fVar.l;
        char c = 0;
        String str = null;
        if (fVar.m == n.SOCIAL) {
            String str2 = fVar.n;
            if (str2 != null) {
                x1[] values = x1.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        x1Var = null;
                        break;
                    }
                    x1Var = values[i];
                    if (x1Var.a.equals(str2)) {
                        break;
                    }
                    i++;
                }
                if (x1Var == null) {
                    x1Var = x1.OTHER;
                }
            } else {
                x1Var = null;
            }
            if (x1Var != null) {
                str = x1Var.a;
            }
        }
        if (y7g.G(account.name)) {
            return UNAUTHORIZED;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case 3260:
                    break;
                case 3296:
                    if (str.equals("gg")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3493:
                    if (str.equals("mr")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3548:
                    if (str.equals("ok")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3715:
                    if (str.equals("tw")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3765:
                    if (str.equals("vk")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return FACEBOOK;
                case 1:
                    return GOOGLE_PLUS;
                case 2:
                    return MAIL_RU;
                case 3:
                    return ODNOKLASSNIKI;
                case 4:
                    return TWITTER;
                case 5:
                    return VKONTAKTE;
                default:
                    Assertions.fail("detectAccountType(): unexpected social provider code: ".concat(str));
                    break;
            }
        } else {
            if (account.name.contains("@")) {
                return PDD;
            }
            if (Patterns.PHONE.matcher(account.name).matches()) {
                return PHONE;
            }
        }
        return YANDEX;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
