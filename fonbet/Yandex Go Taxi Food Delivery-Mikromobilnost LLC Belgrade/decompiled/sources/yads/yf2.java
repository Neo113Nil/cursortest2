package yads;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ls81;
import defpackage.sls;
import defpackage.vez0;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
/* loaded from: classes7.dex */
public final class yf2 {
    public static final ls81 Companion;
    public static final i3y b;
    public static final yf2 c;
    public static final yf2 d;
    public static final /* synthetic */ yf2[] e;

    static {
        yf2 yf2Var = new yf2("SUCCESS", 0);
        c = yf2Var;
        yf2 yf2Var2 = new yf2("ERROR", 1);
        d = yf2Var2;
        e = new yf2[]{yf2Var, yf2Var2};
        Companion = new ls81();
        b = a.b(LazyThreadSafetyMode.PUBLICATION, new sls() { // from class: yads.wf2
            @Override // defpackage.sls
            public final Object invoke() {
                return vez0.g("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationResultStatus", yf2.values(), new String[]{"success", "error"}, new Annotation[][]{null, null});
            }
        });
    }

    public static yf2 valueOf(String str) {
        return (yf2) Enum.valueOf(yf2.class, str);
    }

    public static yf2[] values() {
        return (yf2[]) e.clone();
    }
}
