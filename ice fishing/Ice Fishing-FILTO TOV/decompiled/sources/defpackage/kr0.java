package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class kr0 extends ay {
    private static final kr0 DEFAULT_INSTANCE;
    private static volatile ho0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private h30 strings_ = os0.encWxUiV2;

    static {
        kr0 kr0Var = new kr0();
        DEFAULT_INSTANCE = kr0Var;
        ay.JFJ3QoxA(kr0.class, kr0Var);
    }

    public static void E7jCp8Ls(kr0 kr0Var, Iterable iterable) {
        h30 h30Var = kr0Var.strings_;
        if (!((os0) h30Var).OOA6hdeuvCS) {
            os0 os0Var = (os0) h30Var;
            int i = os0Var.AvO7iQsrTN;
            kr0Var.strings_ = os0Var.X1lG3V04pd(i == 0 ? 10 : i * 2);
        }
        RandomAccess randomAccess = kr0Var.strings_;
        Charset charset = i30.GWasM1elztuh;
        if (iterable instanceof z80) {
            List xqGvceK5x = ((z80) iterable).xqGvceK5x();
            if (randomAccess != null) {
                o4.YmKjaVtbfp5Z();
                return;
            }
            ((os0) randomAccess).getClass();
            Iterator it = xqGvceK5x.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof c9) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                c9.X1lG3V04pd(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof yr0) {
            ((os0) randomAccess).addAll((Collection) iterable);
            return;
        }
        if ((randomAccess instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) randomAccess).ensureCapacity(((Collection) iterable).size() + ((os0) randomAccess).AvO7iQsrTN);
        }
        os0 os0Var2 = (os0) randomAccess;
        int i2 = os0Var2.AvO7iQsrTN;
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (os0Var2.AvO7iQsrTN - i2) + " is null.";
                for (int i3 = os0Var2.AvO7iQsrTN - 1; i3 >= i2; i3--) {
                    os0Var2.remove(i3);
                }
                throw new NullPointerException(str);
            }
            os0Var2.add(obj);
        }
    }

    public static kr0 XnEVoBF0td1l() {
        return DEFAULT_INSTANCE;
    }

    public static jr0 iwATDS1i01k() {
        return (jr0) ((yx) DEFAULT_INSTANCE.X1lG3V04pd(5));
    }

    @Override // defpackage.ay
    public final Object X1lG3V04pd(int i) {
        ho0 ho0Var;
        switch (mr0.YmKjaVtbfp5Z(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new us0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                return new kr0();
            case 4:
                return new jr0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                ho0 ho0Var2 = PARSER;
                if (ho0Var2 != null) {
                    return ho0Var2;
                }
                synchronized (kr0.class) {
                    try {
                        ho0Var = PARSER;
                        if (ho0Var == null) {
                            ho0Var = new zx();
                            PARSER = ho0Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return ho0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final h30 uFEq9NpZ() {
        return this.strings_;
    }
}
