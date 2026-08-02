package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* loaded from: classes3.dex */
public final class cj3 implements Runnable {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public final Object d;

    public cj3(gzf gzfVar, kyf kyfVar) {
        this.a = 3;
        gzfVar.getClass();
        kyfVar.getClass();
        this.c = gzfVar;
        this.d = kyfVar;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // java.lang.Runnable
    public final void run() {
        Object mceVar;
        switch (this.a) {
            case 0:
                ((dj3) this.d).b((om3) this.c, this.b);
                break;
            case 1:
                String str = (String) this.c;
                try {
                    byte[] decode = Base64.decode(c.v(str, "data:", false) ? str.substring(StringsKt.S(str, ',', 0, 6) + 1) : str, 0);
                    if (c.v(str, "data:image/svg", false)) {
                        mceVar = new nce(y5g.Z(new ByteArrayInputStream(decode)));
                    } else {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        mceVar = new lce(BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
                    }
                } catch (Exception e) {
                    mceVar = new mce(e);
                }
                if (!this.b) {
                    d51.l.p(new qs6(7, this, mceVar));
                    break;
                } else {
                    ((uif) this.d).invoke(mceVar);
                    break;
                }
            case 2:
                ((owe) this.d).s.F((kwe) this.c, this.b);
                break;
            default:
                if (!this.b) {
                    ((gzf) this.c).g((kyf) this.d);
                    this.b = true;
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cj3(String str, boolean z, Function1 function1) {
        this.a = 1;
        this.c = str;
        this.b = z;
        this.d = (uif) function1;
    }

    public /* synthetic */ cj3(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.d = obj;
        this.c = obj2;
        this.b = z;
    }
}
