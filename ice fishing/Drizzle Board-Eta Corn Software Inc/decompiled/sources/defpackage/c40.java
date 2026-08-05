package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class c40 extends ra {
    @Override // defpackage.ra
    public final void amk52bBQ(d70 d70Var, float f, float f2) {
        float f3 = f2 * f;
        d70Var.wxUZMvaN(f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        z60 z60Var = new z60(0.0f, 0.0f, f4, f4);
        z60Var.P7K7Inc8 = 180.0f;
        z60Var.b2ZJblxo = 90.0f;
        d70Var.P7K7Inc8.add(z60Var);
        x60 x60Var = new x60(z60Var);
        d70Var.qoPGr6Ce(180.0f);
        d70Var.b2ZJblxo.add(x60Var);
        d70Var.wxUZMvaN = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        d70Var.NCTxEWno = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        d70Var.MdtA4re8 = (f6 * ((float) Math.sin(Math.toRadians(270.0d)))) + f5;
    }
}
