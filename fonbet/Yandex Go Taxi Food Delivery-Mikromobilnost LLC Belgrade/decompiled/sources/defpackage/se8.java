package defpackage;

import com.yandex.payment.sdk.ui.view.ChallengerInputView;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class se8 {
    public final zuj0 a;
    public final j5z b;

    public se8(zuj0 zuj0Var, j5z j5zVar) {
        this.a = zuj0Var;
        this.b = j5zVar;
    }

    public static String a(String str) {
        int length = str.length();
        if (length >= 8) {
            str = str.substring(length - 8, length);
        }
        return b64.k("(••••)(\\d)", cvu0.v(str, "*", ChallengerInputView.DEFAULT_SMS_HINT, false), "$1 $2");
    }

    public final String b(int i, int i2) {
        boolean l = jl40.l(qje.E(this.b.c().getLanguage()), qje.E(i5z.d.a.getLanguage()));
        zuj0 zuj0Var = this.a;
        return l ? ((avj0) zuj0Var).h(i) : ((avj0) zuj0Var).h(i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final String c(String str) {
        if (evu0.J(str)) {
            g8e.C("Missing card system", jst.e);
            return "";
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        int hashCode = upperCase.hashCode();
        zuj0 zuj0Var = this.a;
        switch (hashCode) {
            case -2048371625:
                if (upperCase.equals("DINERSCLUBCARTEBLANCHE")) {
                    return ((avj0) zuj0Var).h(kyh0.card_type_dinners_club);
                }
                return str;
            case -1776311499:
                if (upperCase.equals("UZCARD")) {
                    return ((avj0) zuj0Var).h(kyh0.card_type_uzcard);
                }
                return str;
            case -1553624974:
                if (upperCase.equals("MASTERCARD")) {
                    return ((avj0) zuj0Var).h(kyh0.card_type_mastercard);
                }
                return str;
            case -799687047:
                if (upperCase.equals("DISCOVERCARD")) {
                    return ((avj0) zuj0Var).h(kyh0.card_type_discover);
                }
                return str;
            case 73257:
                if (upperCase.equals("JCB")) {
                    return ((avj0) zuj0Var).h(kyh0.card_type_jcb);
                }
                return str;
            case 76342:
                if (upperCase.equals("MIR")) {
                    return b(kyh0.card_type_mir_ru, kyh0.card_type_mir_eng);
                }
                return str;
            case 2583784:
                if (upperCase.equals("TROY")) {
                    return ((avj0) zuj0Var).h(kyh0.card_type_troy);
                }
                return str;
            case 2634817:
                if (upperCase.equals("VISA")) {
                    return ((avj0) zuj0Var).h(kyh0.card_type_visa);
                }
                return str;
            case 232055600:
                if (upperCase.equals("AMERICANEXPRESS")) {
                    return ((avj0) zuj0Var).h(kyh0.card_type_american_express);
                }
                return str;
            case 486122361:
                if (upperCase.equals("UNIONPAY")) {
                    return ((avj0) zuj0Var).h(kyh0.card_type_unionpay);
                }
                return str;
            case 493599233:
                if (upperCase.equals("BELKART")) {
                    return b(kyh0.card_type_belkart_ru, kyh0.card_type_belkart_eng);
                }
                return str;
            case 910441480:
                if (upperCase.equals("DINACARD")) {
                    return ((avj0) zuj0Var).h(kyh0.card_type_dinacard);
                }
                return str;
            case 1336157951:
                if (upperCase.equals("HUMOCARD")) {
                    return ((avj0) zuj0Var).h(kyh0.card_type_humo);
                }
                return str;
            case 1545480463:
                if (upperCase.equals("MAESTRO")) {
                    return ((avj0) zuj0Var).h(kyh0.card_type_maestro);
                }
                return str;
            case 2047660103:
                if (upperCase.equals("ELCART")) {
                    return b(kyh0.card_type_elcart_ru, kyh0.card_type_elcart_eng);
                }
                return str;
            default:
                return str;
        }
    }
}
