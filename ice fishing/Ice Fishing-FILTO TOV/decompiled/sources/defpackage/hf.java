package defpackage;

import android.graphics.PathMeasure;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class hf extends h50 implements wu {
    public static final hf AvO7iQsrTN;
    public static final hf E7jCp8Ls;
    public static final hf JFJ3QoxA;
    public static final hf WIEu4Ya2g8;
    public static final hf XnEVoBF0td1l;
    public static final hf encWxUiV2;
    public static final hf iwATDS1i01k;
    public static final hf mOu10nynGul;
    public static final hf rQPn8YBR;
    public static final hf uFEq9NpZ;
    public final /* synthetic */ int EljAMC1QTz;

    static {
        int i = 0;
        AvO7iQsrTN = new hf(i, 0);
        encWxUiV2 = new hf(i, 1);
        mOu10nynGul = new hf(i, 2);
        JFJ3QoxA = new hf(i, 3);
        rQPn8YBR = new hf(i, 4);
        E7jCp8Ls = new hf(i, 5);
        XnEVoBF0td1l = new hf(i, 6);
        uFEq9NpZ = new hf(i, 7);
        iwATDS1i01k = new hf(i, 8);
        WIEu4Ya2g8 = new hf(i, 9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hf(int i, int i2) {
        super(i);
        this.EljAMC1QTz = i2;
    }

    @Override // defpackage.wu
    public final Object GWasM1elztuh() {
        switch (this.EljAMC1QTz) {
            case 0:
                kf.Yi7zF1RB1("LocalUriHandler");
                throw null;
            case 1:
                kf.Yi7zF1RB1("LocalViewConfiguration");
                throw null;
            case 2:
                kf.Yi7zF1RB1("LocalWindowInfo");
                throw null;
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                return Boolean.TRUE;
            case 4:
                return Boolean.FALSE;
            case 5:
                return Boolean.FALSE;
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                return new g60(3);
            case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                return new i1(new PathMeasure());
            case 8:
                return null;
            default:
                return kc1.GWasM1elztuh;
        }
    }
}
