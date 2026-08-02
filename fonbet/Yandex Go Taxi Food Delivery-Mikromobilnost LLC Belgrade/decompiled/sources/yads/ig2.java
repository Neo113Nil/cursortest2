package yads;

import defpackage.fd71;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.sls;
import defpackage.vez0;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
/* loaded from: classes7.dex */
public final class ig2 {
    public static final fd71 Companion;
    public static final i3y c;
    public static final /* synthetic */ ig2[] d;
    public static final /* synthetic */ k4o e;
    public final String b;

    static {
        ig2[] ig2VarArr = {new ig2(0, "INTERSTITIAL", "interstitial"), new ig2(1, "REWARDED", "rewarded"), new ig2(2, "APP_OPEN", "appopen")};
        d = ig2VarArr;
        e = a.a(ig2VarArr);
        Companion = new fd71();
        c = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new sls() { // from class: yads.gg2
            @Override // defpackage.sls
            public final Object invoke() {
                return vez0.g("com.monetization.ads.core.configuration.model.PreloadFormat", ig2.values(), new String[]{"interstitial", "rewarded", "appopen"}, new Annotation[][]{null, null, null});
            }
        });
    }

    public ig2(int i, String str, String str2) {
        this.b = str2;
    }

    public static ig2 valueOf(String str) {
        return (ig2) Enum.valueOf(ig2.class, str);
    }

    public static ig2[] values() {
        return (ig2[]) d.clone();
    }
}
