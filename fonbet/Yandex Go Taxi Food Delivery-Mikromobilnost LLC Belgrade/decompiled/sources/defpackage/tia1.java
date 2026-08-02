package defpackage;

import com.yandex.xplat.common.YSError;
import com.yandex.xplat.payment.sdk.ExternalConvertibleError;
import com.yandex.xplat.payment.sdk.ExternalErrorKind;
import com.yandex.xplat.payment.sdk.ExternalErrorTrigger;
import java.util.regex.Matcher;
import yads.aa2;

/* loaded from: classes11.dex */
public abstract class tia1 {
    public static h0n a(int i, w971 w971Var, dl81 dl81Var) {
        h0n a = h0n.a(w971Var, dl81Var);
        while (true) {
            int i2 = a.a;
            if (i2 == i) {
                return a;
            }
            nba1.e();
            long j = a.b + 8;
            if (j > 2147483647L) {
                throw aa2.a("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
            w971Var.b((int) j);
            a = h0n.a(w971Var, dl81Var);
        }
    }

    public static boolean b(w971 w971Var) {
        dl81 dl81Var = new dl81(8);
        int i = h0n.a(w971Var, dl81Var).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        w971Var.I(dl81Var.a, 0, 4, false);
        dl81Var.m(0);
        int a = dl81Var.a();
        if (a == 1463899717) {
            return true;
        }
        nba1.c("WavHeaderReader", "Unsupported form type: " + a);
        return false;
    }

    public static final ExternalErrorKind c(whj whjVar) {
        String str = whjVar.c;
        String str2 = whjVar.a;
        if (str2.equals("authorization_reject")) {
            return ExternalErrorKind.payment_authorization_reject;
        }
        if (str2.equals("expired_card")) {
            return ExternalErrorKind.expired_card;
        }
        if (str2.equals("not_enough_funds")) {
            return ExternalErrorKind.not_enough_funds;
        }
        if (str2.equals("fail_3ds") || (str2.equals("error") && jl40.l(whjVar.b, "technical_error") && jl40.l(whjVar.d, "failed"))) {
            return ExternalErrorKind.fail_3ds;
        }
        if (str2.equals("invalid_processing_request")) {
            return ExternalErrorKind.invalid_processing_request;
        }
        if (str2.equals("limit_exceeded")) {
            return ExternalErrorKind.limit_exceeded;
        }
        if (str2.equals("payment_timeout")) {
            return ExternalErrorKind.payment_timeout;
        }
        if (str2.equals("promocode_already_used")) {
            return ExternalErrorKind.promocode_already_used;
        }
        if (str2.equals("restricted_card")) {
            return ExternalErrorKind.restricted_card;
        }
        if (str2.equals("payment_gateway_technical_error")) {
            return ExternalErrorKind.payment_gateway_technical_error;
        }
        if (str2.equals("transaction_not_permitted")) {
            return ExternalErrorKind.transaction_not_permitted;
        }
        if (str2.equals("user_cancelled")) {
            return ExternalErrorKind.user_cancelled;
        }
        if (str2.equals("operation_cancelled")) {
            return ExternalErrorKind.payment_cancelled;
        }
        if (str2.equals("need_to_unbind_sbp_token")) {
            return ExternalErrorKind.need_to_unbind_sbp_token;
        }
        if (str2.equals("bindgin_sbp_token_duplicate")) {
            return ExternalErrorKind.sbp_token_duplicate;
        }
        if (str2.equals("too_many_cards") || (str != null && str.equals("too_many_cards"))) {
            return ExternalErrorKind.too_many_cards;
        }
        if (str2.equals("failed")) {
            if (jl40.l(str, "verification failed, wrong_guess")) {
                return ExternalErrorKind.failed_challenge_no_tries_left;
            }
            if (str != null ? cvu0.x(str, "verification failed", false) : false) {
                return ExternalErrorKind.failed_challenge_unknown;
            }
        }
        return ExternalErrorKind.unknown;
    }

    public static final boolean d(YSError ySError) {
        return ((ExternalErrorKind) (ySError instanceof ExternalConvertibleError ? ((ExternalConvertibleError) ySError).a() : new q4g(ExternalErrorKind.unknown, ExternalErrorTrigger.internal_sdk, (Object) null, (Object) null, ySError.getMessage(), 18)).b) == ExternalErrorKind.passport_account_not_authorized;
    }

    public static final t610 e(v610 v610Var) {
        u3x u3xVar = ovc0.a;
        Matcher matcher = v610Var.a.a;
        u3xVar.getClass();
        int start = matcher.start("paramName");
        d6w d6wVar = new d6w(start, matcher.end("paramName") - 1, 1);
        if (start >= 0) {
            return new t610(matcher.group("paramName"), d6wVar);
        }
        return null;
    }

    public static bh f() {
        if (bh.d == null) {
            bh.d = new bh();
        }
        return bh.d;
    }
}
