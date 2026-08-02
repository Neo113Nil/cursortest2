package defpackage;

import com.ybsdk.core.utils.ColorModel;

/* loaded from: classes3.dex */
public abstract class wbb0 {
    public static final edb0 a(edb0 edb0Var) {
        if (edb0Var instanceof ddb0) {
            return edb0Var;
        }
        if (edb0Var instanceof adb0) {
            adb0 adb0Var = (adb0) edb0Var;
            ColorModel.Attr attr = l9b0.m;
            return new adb0(attr, adb0Var.b, adb0Var.c, attr);
        }
        if (edb0Var instanceof bdb0) {
            return new bdb0(l9b0.m, ((bdb0) edb0Var).b);
        }
        w511.b();
        return null;
    }
}
