package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class q1c {
    public static final q1c A;
    public static final q1c B;
    public static final q1c C;
    public static final q1c D;
    public static final /* synthetic */ q1c[] E;
    public static final q1c a;
    public static final q1c b;
    public static final q1c c;
    public static final q1c d;
    public static final q1c e;
    public static final q1c f;
    public static final q1c g;
    public static final q1c h;
    public static final q1c i;
    public static final q1c j;
    public static final q1c k;
    public static final q1c l;
    public static final q1c m;
    public static final q1c n;
    public static final q1c o;
    public static final q1c p;
    public static final q1c q;
    public static final q1c r;
    public static final q1c s;
    public static final q1c t;
    public static final q1c u;
    public static final q1c v;
    public static final q1c w;
    public static final q1c x;
    public static final q1c y;
    public static final q1c z;

    static {
        q1c q1cVar = new q1c("unknown", 0);
        a = q1cVar;
        q1c q1cVar2 = new q1c("internal_error", 1);
        b = q1cVar2;
        q1c q1cVar3 = new q1c("authorization", 2);
        c = q1cVar3;
        q1c q1cVar4 = new q1c("authorization_expired_token", 3);
        d = q1cVar4;
        q1c q1cVar5 = new q1c("network", 4);
        e = q1cVar5;
        q1c q1cVar6 = new q1c("fail_3ds", 5);
        f = q1cVar6;
        q1c q1cVar7 = new q1c("expired_card", 6);
        g = q1cVar7;
        q1c q1cVar8 = new q1c("invalid_processing_request", 7);
        h = q1cVar8;
        q1c q1cVar9 = new q1c("limit_exceeded", 8);
        i = q1cVar9;
        q1c q1cVar10 = new q1c("not_enough_funds", 9);
        j = q1cVar10;
        q1c q1cVar11 = new q1c("payment_authorization_reject", 10);
        k = q1cVar11;
        q1c q1cVar12 = new q1c("payment_cancelled", 11);
        l = q1cVar12;
        q1c q1cVar13 = new q1c("payment_gateway_technical_error", 12);
        m = q1cVar13;
        q1c q1cVar14 = new q1c("payment_timeout", 13);
        n = q1cVar14;
        q1c q1cVar15 = new q1c("promocode_already_used", 14);
        o = q1cVar15;
        q1c q1cVar16 = new q1c("restricted_card", 15);
        p = q1cVar16;
        q1c q1cVar17 = new q1c("transaction_not_permitted", 16);
        q = q1cVar17;
        q1c q1cVar18 = new q1c("user_cancelled", 17);
        r = q1cVar18;
        q1c q1cVar19 = new q1c("card_validation_invalid_argument", 18);
        s = q1cVar19;
        q1c q1cVar20 = new q1c("apple_pay", 19);
        q1c q1cVar21 = new q1c("google_pay", 20);
        t = q1cVar21;
        q1c q1cVar22 = new q1c("too_many_cards", 21);
        u = q1cVar22;
        q1c q1cVar23 = new q1c("no_email", 22);
        v = q1cVar23;
        q1c q1cVar24 = new q1c("passport_account_not_authorized", 23);
        w = q1cVar24;
        q1c q1cVar25 = new q1c("failed_challenge_no_tries_left", 24);
        x = q1cVar25;
        q1c q1cVar26 = new q1c("failed_challenge_unknown", 25);
        y = q1cVar26;
        q1c q1cVar27 = new q1c("need_to_unbind_sbp_token", 26);
        z = q1cVar27;
        q1c q1cVar28 = new q1c("sbp_token_duplicate", 27);
        A = q1cVar28;
        q1c q1cVar29 = new q1c("undefined_challenge", 28);
        B = q1cVar29;
        q1c q1cVar30 = new q1c("warning", 29);
        C = q1cVar30;
        q1c q1cVar31 = new q1c("payment_failed_but_new_attempt_allowed", 30);
        D = q1cVar31;
        E = new q1c[]{q1cVar, q1cVar2, q1cVar3, q1cVar4, q1cVar5, q1cVar6, q1cVar7, q1cVar8, q1cVar9, q1cVar10, q1cVar11, q1cVar12, q1cVar13, q1cVar14, q1cVar15, q1cVar16, q1cVar17, q1cVar18, q1cVar19, q1cVar20, q1cVar21, q1cVar22, q1cVar23, q1cVar24, q1cVar25, q1cVar26, q1cVar27, q1cVar28, q1cVar29, q1cVar30, q1cVar31};
    }

    public static q1c valueOf(String str) {
        return (q1c) Enum.valueOf(q1c.class, str);
    }

    public static q1c[] values() {
        return (q1c[]) E.clone();
    }
}
