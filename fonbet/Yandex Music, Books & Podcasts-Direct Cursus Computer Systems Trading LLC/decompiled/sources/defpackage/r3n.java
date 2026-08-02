package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class r3n {
    public static final jml e;
    public static final r3n f;
    public static final r3n g;
    public static final r3n h;
    public static final r3n i;
    public static final r3n j;
    public static final r3n k;
    public static final r3n l;
    public static final r3n m;
    public static final r3n n;
    public static final r3n o;
    public static final /* synthetic */ r3n[] p;
    public static final /* synthetic */ rdb q;
    public final String a;
    public final float b;
    public final boolean c;
    public final boolean d;

    static {
        r3n r3nVar = new r3n("SESSION_START", 0, "session_start", 0.0f, 12);
        f = r3nVar;
        r3n r3nVar2 = new r3n("SCREEN_SHOWN", 1, "screen_shown", 1.0f, 12);
        g = r3nVar2;
        r3n r3nVar3 = new r3n("OFFER_LOADING_START", 2, "offer_loading_start", 2.0f, 12);
        h = r3nVar3;
        r3n r3nVar4 = new r3n("OFFER_LOADING_FAILURE", 3, "offer_loading_failure", 3.0f, 8);
        i = r3nVar4;
        r3n r3nVar5 = new r3n("OFFER_LOADING_EMPTY", 4, "offer_loading_empty", 3.0f, 8);
        j = r3nVar5;
        r3n r3nVar6 = new r3n("OFFER_LOADING_SUCCESS", 5, "offer_loading_success", 3.0f, 12);
        k = r3nVar6;
        r3n r3nVar7 = new r3n("SCREEN_CLOSED", 6, "screen_closed", 4.0f, true, true);
        l = r3nVar7;
        r3n r3nVar8 = new r3n("SCREEN_CLOSED_PAYMENT_CANCEL", 7, "screen_closed_payment_cancel", 4.0f, true, true);
        m = r3nVar8;
        r3n r3nVar9 = new r3n("SCREEN_CLOSED_PAYMENT_FAILURE", 8, "screen_closed_payment_failure", 4.0f, true, true);
        n = r3nVar9;
        r3n r3nVar10 = new r3n("SCREEN_CLOSED_PAYMENT_SUCCESS", 9, "screen_closed_payment_success", 4.0f, true, true);
        o = r3nVar10;
        r3n[] r3nVarArr = {r3nVar, r3nVar2, r3nVar3, r3nVar4, r3nVar5, r3nVar6, r3nVar7, r3nVar8, r3nVar9, r3nVar10};
        p = r3nVarArr;
        q = new rdb(r3nVarArr);
        e = new jml();
    }

    public /* synthetic */ r3n(String str, int i2, String str2, float f2, int i3) {
        this(str, i2, str2, f2, (i3 & 4) == 0, false);
    }

    public static r3n valueOf(String str) {
        return (r3n) Enum.valueOf(r3n.class, str);
    }

    public static r3n[] values() {
        return (r3n[]) p.clone();
    }

    public r3n(String str, int i2, String str2, float f2, boolean z, boolean z2) {
        this.a = str2;
        this.b = f2;
        this.c = z;
        this.d = z2;
    }
}
