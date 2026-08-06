package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import com.combinations.level.experts.core.domain.model.Side;
import java.util.UUID;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class q extends h50 implements wu {
    public static final q A1EKNP6CxJ;
    public static final q AEn1Rrio;
    public static final q AvO7iQsrTN;
    public static final q E7jCp8Ls;
    public static final q EXrPz3p7hFb;
    public static final q JFJ3QoxA;
    public static final q M3K9sHhK;
    public static final q MZhzXH72;
    public static final q Mjvvu5DE;
    public static final q WIEu4Ya2g8;
    public static final q WRKkgoJXwDn;
    public static final q WdrkLMV3xh;
    public static final q XnEVoBF0td1l;
    public static final q Y6hRI1cF8;
    public static final q YZjbz8VdP5;
    public static final q YmKjaVtbfp5Z;
    public static final q arNh8D4Z5gB;
    public static final q cilMamHF;
    public static final q eUH21U3apd;
    public static final q encWxUiV2;
    public static final q iwATDS1i01k;
    public static final q jivtDDk9H;
    public static final q k8h8IjolWQ;
    public static final q lv06NcmrQ;
    public static final q mE4lRynR;
    public static final q mOu10nynGul;
    public static final q ozMwhSAI;
    public static final q pog2g9KITJA;
    public static final q rQPn8YBR;
    public static final q uFEq9NpZ;
    public final /* synthetic */ int EljAMC1QTz;

    static {
        int i = 0;
        AvO7iQsrTN = new q(i, 0);
        encWxUiV2 = new q(i, 1);
        mOu10nynGul = new q(i, 2);
        JFJ3QoxA = new q(i, 3);
        rQPn8YBR = new q(i, 4);
        E7jCp8Ls = new q(i, 5);
        XnEVoBF0td1l = new q(i, 6);
        uFEq9NpZ = new q(i, 7);
        iwATDS1i01k = new q(i, 8);
        WIEu4Ya2g8 = new q(i, 9);
        YmKjaVtbfp5Z = new q(i, 10);
        Mjvvu5DE = new q(i, 11);
        mE4lRynR = new q(i, 12);
        jivtDDk9H = new q(i, 13);
        Y6hRI1cF8 = new q(i, 14);
        cilMamHF = new q(i, 15);
        lv06NcmrQ = new q(i, 16);
        WdrkLMV3xh = new q(i, 17);
        WRKkgoJXwDn = new q(i, 18);
        arNh8D4Z5gB = new q(i, 19);
        pog2g9KITJA = new q(i, 20);
        M3K9sHhK = new q(i, 21);
        k8h8IjolWQ = new q(i, 22);
        EXrPz3p7hFb = new q(i, 23);
        ozMwhSAI = new q(i, 24);
        AEn1Rrio = new q(i, 25);
        YZjbz8VdP5 = new q(i, 26);
        eUH21U3apd = new q(i, 27);
        A1EKNP6CxJ = new q(i, 28);
        MZhzXH72 = new q(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i, int i2) {
        super(i);
        this.EljAMC1QTz = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wu
    public final Object GWasM1elztuh() {
        qq qqVar;
        gh lv06NcmrQ2;
        Choreographer choreographer;
        Object[] objArr = 0;
        switch (this.EljAMC1QTz) {
            case 0:
                r.GWasM1elztuh("LocalConfiguration");
                throw null;
            case 1:
                r.GWasM1elztuh("LocalContext");
                throw null;
            case 2:
                r.GWasM1elztuh("LocalImageVectorCache");
                throw null;
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                r.GWasM1elztuh("LocalResourceIdCache");
                throw null;
            case 4:
                r.GWasM1elztuh("LocalView");
                throw null;
            case 5:
                return UUID.randomUUID();
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                return Boolean.FALSE;
            case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                return "DEFAULT_TEST_TAG";
            case 8:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    pk pkVar = mm.GWasM1elztuh;
                    dz dzVar = cc0.GWasM1elztuh;
                    lv s1Var = new s1(2, objArr == true ? 1 : 0, 0);
                    Thread currentThread = Thread.currentThread();
                    b9xEq24R1 b9xeq24r1 = b9xEq24R1.arNh8D4Z5gB;
                    ih ihVar = (ih) dzVar.E7jCp8Ls(b9xeq24r1);
                    vp vpVar = vp.OOA6hdeuvCS;
                    if (ihVar == null) {
                        qqVar = d91.GWasM1elztuh();
                        lv06NcmrQ2 = o30.lv06NcmrQ(vpVar, n30.HFYAaqMd6(dzVar, qqVar), true);
                        pk pkVar2 = mm.GWasM1elztuh;
                        if (lv06NcmrQ2 != pkVar2 && lv06NcmrQ2.E7jCp8Ls(b9xeq24r1) == null) {
                            lv06NcmrQ2 = lv06NcmrQ2.mOu10nynGul(pkVar2);
                        }
                    } else {
                        qqVar = (qq) d91.GWasM1elztuh.get();
                        lv06NcmrQ2 = o30.lv06NcmrQ(vpVar, dzVar, true);
                        pk pkVar3 = mm.GWasM1elztuh;
                        if (lv06NcmrQ2 != pkVar3 && lv06NcmrQ2.E7jCp8Ls(b9xeq24r1) == null) {
                            lv06NcmrQ2 = lv06NcmrQ2.mOu10nynGul(pkVar3);
                        }
                    }
                    v6 v6Var = new v6(lv06NcmrQ2, currentThread, qqVar);
                    v6Var.rASgSCrgZkT7(sh.OOA6hdeuvCS, v6Var, s1Var);
                    qq qqVar2 = v6Var.rQPn8YBR;
                    if (qqVar2 != null) {
                        int i = qq.JFJ3QoxA;
                        qqVar2.XnEVoBF0td1l(false);
                    }
                    while (!Thread.interrupted()) {
                        try {
                            long YmKjaVtbfp5Z2 = qqVar2 != null ? qqVar2.YmKjaVtbfp5Z() : Long.MAX_VALUE;
                            if (v6Var.TpUsjqg3bxO() instanceof p00) {
                                LockSupport.parkNanos(v6Var, YmKjaVtbfp5Z2);
                            } else {
                                if (qqVar2 != null) {
                                    int i2 = qq.JFJ3QoxA;
                                    qqVar2.JFJ3QoxA(false);
                                }
                                Object pog2g9KITJA2 = p.pog2g9KITJA(v6Var.TpUsjqg3bxO());
                                uc ucVar = pog2g9KITJA2 instanceof uc ? (uc) pog2g9KITJA2 : null;
                                if (ucVar != null) {
                                    throw ucVar.GWasM1elztuh;
                                }
                                choreographer = (Choreographer) pog2g9KITJA2;
                            }
                        } catch (Throwable th) {
                            if (qqVar2 != null) {
                                int i3 = qq.JFJ3QoxA;
                                qqVar2.JFJ3QoxA(false);
                            }
                            throw th;
                        }
                    }
                    InterruptedException interruptedException = new InterruptedException();
                    v6Var.pog2g9KITJA(interruptedException);
                    throw interruptedException;
                }
                v1 v1Var = new v1(choreographer, qj.iwATDS1i01k(Looper.getMainLooper()));
                return n30.HFYAaqMd6(v1Var, v1Var.WIEu4Ya2g8);
            case 9:
            case 10:
                return null;
            case 11:
                kf.Yi7zF1RB1("LocalAutofillManager");
                throw null;
            case 12:
                kf.Yi7zF1RB1("LocalAutofillTree");
                throw null;
            case 13:
                kf.Yi7zF1RB1("LocalClipboard");
                throw null;
            case 14:
                kf.Yi7zF1RB1("LocalClipboardManager");
                throw null;
            case Side.ALL /* 15 */:
                return Boolean.TRUE;
            case 16:
                kf.Yi7zF1RB1("LocalDensity");
                throw null;
            case 17:
                kf.Yi7zF1RB1("LocalFocusManager");
                throw null;
            case 18:
                kf.Yi7zF1RB1("LocalFontFamilyResolver");
                throw null;
            case 19:
                kf.Yi7zF1RB1("LocalFontLoader");
                throw null;
            case 20:
                kf.Yi7zF1RB1("LocalGraphicsContext");
                throw null;
            case 21:
                kf.Yi7zF1RB1("LocalHapticFeedback");
                throw null;
            case 22:
                kf.Yi7zF1RB1("LocalInputManager");
                throw null;
            case 23:
                kf.Yi7zF1RB1("LocalLayoutDirection");
                throw null;
            case 24:
                return null;
            case 25:
                kf.Yi7zF1RB1("LocalProvidableLocaleList");
                throw null;
            case 26:
                return Boolean.FALSE;
            case 27:
            case 28:
                return null;
            default:
                kf.Yi7zF1RB1("LocalTextToolbar");
                throw null;
        }
    }
}
