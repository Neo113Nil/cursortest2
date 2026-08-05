package defpackage;

import android.graphics.Path;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class k00 implements z9, x50, k9 {
    public static k00 MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ k00(int i) {
        this.NCTxEWno = i;
    }

    public static Path NCTxEWno(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    public static i90 qoPGr6Ce(String str) {
        Object obj;
        str.getClass();
        bg bgVar = i90.P7K7Inc8;
        bgVar.getClass();
        ow5vqvCr ow5vqvcr = new ow5vqvCr(0, bgVar);
        while (true) {
            if (!ow5vqvcr.hasNext()) {
                obj = null;
                break;
            }
            obj = ow5vqvcr.next();
            if (((i90) obj).NCTxEWno.equals(str)) {
                break;
            }
        }
        i90 i90Var = (i90) obj;
        return i90Var == null ? i90.wxUZMvaN : i90Var;
    }

    public boolean MdtA4re8(CharSequence charSequence) {
        return false;
    }

    public String toString() {
        switch (this.NCTxEWno) {
            case 7:
                return "SharingStarted.Eagerly";
            case 8:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.x50
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // defpackage.x50
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}
