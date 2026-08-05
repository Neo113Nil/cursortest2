package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class n extends ej0 {
    public final /* synthetic */ s OxcuoDLp;
    public final /* synthetic */ int lDXGDhIF;
    public final /* synthetic */ WeakReference sjUBp5pO;
    public final /* synthetic */ int ygLcUYwZ;

    public n(s sVar, int i, int i2, WeakReference weakReference) {
        this.OxcuoDLp = sVar;
        this.ygLcUYwZ = i;
        this.lDXGDhIF = i2;
        this.sjUBp5pO = weakReference;
    }

    @Override // defpackage.ej0
    public final void eIA6dogk(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.ygLcUYwZ) != -1) {
            typeface = r.qoPGr6Ce(typeface, i, (this.lDXGDhIF & 2) != 0);
        }
        s sVar = this.OxcuoDLp;
        if (sVar.OnDfzHZD) {
            sVar.ow5vqvCr = typeface;
            TextView textView = (TextView) this.sjUBp5pO.get();
            if (textView != null) {
                boolean isAttachedToWindow = textView.isAttachedToWindow();
                int i2 = sVar.eVhOlqcC;
                if (isAttachedToWindow) {
                    textView.post(new o(textView, typeface, i2));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }

    @Override // defpackage.ej0
    public final void ytu5o6f4(int i) {
    }
}
