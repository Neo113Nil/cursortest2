package androidx.emoji2.text;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements defpackage.t50 {
    @Override // defpackage.t50
    public final java.util.List IHQe1A4L2xu() {
        return java.util.Collections.singletonList(androidx.lifecycle.ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.t50
    public final java.lang.Object oh6vYeIP(android.content.Context context) {
        java.lang.Object obj;
        defpackage.xy xyVar = new defpackage.xy(new defpackage.a6(context));
        xyVar.IHQe1A4L2xu = 1;
        if (defpackage.ws.ez2rX8ReCYw == null) {
            synchronized (defpackage.ws.SH1y5HwkJhh) {
                try {
                    if (defpackage.ws.ez2rX8ReCYw == null) {
                        defpackage.ws.ez2rX8ReCYw = new defpackage.ws(xyVar);
                    }
                } finally {
                }
            }
        }
        defpackage.v5 AARZUJiTa = defpackage.v5.AARZUJiTa(context);
        AARZUJiTa.getClass();
        synchronized (defpackage.v5.xiZrDbcSW0) {
            try {
                obj = ((java.util.HashMap) AARZUJiTa.oh6vYeIP).get(androidx.lifecycle.ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = AARZUJiTa.F7NU4MC0GW(androidx.lifecycle.ProcessLifecycleInitializer.class, new java.util.HashSet());
                }
            } finally {
            }
        }
        defpackage.xd0 EXtogiMhuM = ((defpackage.ud0) obj).EXtogiMhuM();
        EXtogiMhuM.IHQe1A4L2xu(new defpackage.xs(this, EXtogiMhuM));
        return java.lang.Boolean.TRUE;
    }
}
