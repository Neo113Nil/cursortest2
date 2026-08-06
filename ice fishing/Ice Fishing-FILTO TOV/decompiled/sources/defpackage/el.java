package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public interface el {
    default float AEn1Rrio(long j) {
        if (!b91.GWasM1elztuh(a91.Yi7zF1RB1(j), 4294967296L)) {
            v10.Yi7zF1RB1("Only Sp can convert to Px");
        }
        float[] fArr = ku.GWasM1elztuh;
        if (mOu10nynGul() < 1.03f) {
            return mOu10nynGul() * a91.X1lG3V04pd(j);
        }
        ju GWasM1elztuh = ku.GWasM1elztuh(mOu10nynGul());
        if (GWasM1elztuh != null) {
            return GWasM1elztuh.Yi7zF1RB1(a91.X1lG3V04pd(j));
        }
        return mOu10nynGul() * a91.X1lG3V04pd(j);
    }

    default long CMh55RymNfS(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float jivtDDk9H = jivtDDk9H(Float.intBitsToFloat((int) (j >> 32)));
        float jivtDDk9H2 = jivtDDk9H(Float.intBitsToFloat((int) (j & 4294967295L)));
        return (Float.floatToRawIntBits(jivtDDk9H) << 32) | (Float.floatToRawIntBits(jivtDDk9H2) & 4294967295L);
    }

    default float K0ReC6MK(int i) {
        return i / Yi7zF1RB1();
    }

    default float MItybXapHX(long j) {
        if (!b91.GWasM1elztuh(a91.Yi7zF1RB1(j), 4294967296L)) {
            v10.Yi7zF1RB1("Only Sp can convert to Px");
        }
        return jivtDDk9H(AEn1Rrio(j));
    }

    default long Mjvvu5DE(long j) {
        if (j != 9205357640488583168L) {
            return o30.xqGvceK5x(rASgSCrgZkT7(Float.intBitsToFloat((int) (j >> 32))), rASgSCrgZkT7(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default long NyNgffpi(float f) {
        return YmKjaVtbfp5Z(rASgSCrgZkT7(f));
    }

    float Yi7zF1RB1();

    default long YmKjaVtbfp5Z(float f) {
        float[] fArr = ku.GWasM1elztuh;
        if (mOu10nynGul() < 1.03f) {
            return o50.EXrPz3p7hFb(f / mOu10nynGul(), 4294967296L);
        }
        ju GWasM1elztuh = ku.GWasM1elztuh(mOu10nynGul());
        return o50.EXrPz3p7hFb(GWasM1elztuh != null ? GWasM1elztuh.GWasM1elztuh(f) : f / mOu10nynGul(), 4294967296L);
    }

    default float jivtDDk9H(float f) {
        return Yi7zF1RB1() * f;
    }

    float mOu10nynGul();

    default float rASgSCrgZkT7(float f) {
        return f / Yi7zF1RB1();
    }

    default int rezfBrjOrqK(float f) {
        float jivtDDk9H = jivtDDk9H(f);
        if (Float.isInfinite(jivtDDk9H)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(jivtDDk9H);
    }
}
