package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class r1 implements defpackage.iu {
    public final android.content.Context ZpBGe2uQfcn8;

    public r1(android.content.Context context, int i) {
        switch (i) {
            case 1:
                this.ZpBGe2uQfcn8 = context.getApplicationContext();
                break;
            case 2:
                this.ZpBGe2uQfcn8 = context;
                break;
            default:
                this.ZpBGe2uQfcn8 = context.getApplicationContext();
                break;
        }
    }

    @Override // defpackage.iu
    public void ZpBGe2uQfcn8(defpackage.ma0 ma0Var) {
        defpackage.uj ujVar = new defpackage.uj("EmojiCompatInitializer");
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(0, 1, 15L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingDeque(), ujVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new defpackage.c4(this, ma0Var, threadPoolExecutor, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public android.graphics.Typeface giKS3J6vZuNy(defpackage.b51 b51Var) {
        int i;
        java.lang.String str;
        int i2;
        if (!(b51Var instanceof defpackage.b51)) {
            return null;
        }
        android.content.Context context = this.ZpBGe2uQfcn8;
        android.graphics.Typeface T1fB7bDYiVJQ = defpackage.h0.T1fB7bDYiVJQ(b51Var, context);
        java.util.List list = b51Var.giKS3J6vZuNy.ZpBGe2uQfcn8;
        int i3 = android.os.Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            java.lang.ThreadLocal threadLocal = defpackage.uq1.ZpBGe2uQfcn8;
            if (T1fB7bDYiVJQ == null) {
                return null;
            }
            if (!list.isEmpty()) {
                java.lang.ThreadLocal threadLocal2 = defpackage.uq1.ZpBGe2uQfcn8;
                android.graphics.Paint paint = (android.graphics.Paint) threadLocal2.get();
                if (paint == null) {
                    paint = new android.graphics.Paint();
                    threadLocal2.set(paint);
                }
                paint.setFontVariationSettings(null);
                paint.setTypeface(T1fB7bDYiVJQ);
                defpackage.lp giKS3J6vZuNy = defpackage.i61.giKS3J6vZuNy(context);
                if (i3 >= 31) {
                    i2 = context.getResources().getConfiguration().fontWeightAdjustment;
                    if (i2 != Integer.MAX_VALUE) {
                        i = context.getResources().getConfiguration().fontWeightAdjustment;
                        if (i != 0) {
                            str = defpackage.ci0.ZpBGe2uQfcn8(list, null, new defpackage.lp0(8, giKS3J6vZuNy), 31);
                        } else {
                            if (list.size() > 0) {
                                list.get(0).getClass();
                                defpackage.p81.ZpBGe2uQfcn8();
                                return null;
                            }
                            float gUjdnLbkVAaA = defpackage.j80.gUjdnLbkVAaA(i + 400.0f, 1.0f, 1000.0f);
                            str = (list.isEmpty() ? "" : "".concat(",")) + "'wght' " + gUjdnLbkVAaA;
                        }
                        paint.setFontVariationSettings(str);
                        return paint.getTypeface();
                    }
                }
                i = 0;
                if (i != 0) {
                }
                paint.setFontVariationSettings(str);
                return paint.getTypeface();
            }
        }
        return T1fB7bDYiVJQ;
    }
}
