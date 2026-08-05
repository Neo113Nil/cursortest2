package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class wh implements Callable {
    public final /* synthetic */ Context MdtA4re8;
    public final /* synthetic */ String NCTxEWno;
    public final /* synthetic */ Object VgvYg0wo;
    public final /* synthetic */ int qoPGr6Ce;
    public final /* synthetic */ int wxUZMvaN;

    public /* synthetic */ wh(String str, Context context, Object obj, int i, int i2) {
        this.qoPGr6Ce = i2;
        this.NCTxEWno = str;
        this.MdtA4re8 = context;
        this.VgvYg0wo = obj;
        this.wxUZMvaN = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.qoPGr6Ce;
        int i2 = this.wxUZMvaN;
        Object obj = this.VgvYg0wo;
        Context context = this.MdtA4re8;
        String str = this.NCTxEWno;
        switch (i) {
            case 0:
                Object[] objArr = {(th) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return zh.NCTxEWno(str, context, Collections.unmodifiableList(arrayList), i2);
            default:
                try {
                    return zh.NCTxEWno(str, context, (ArrayList) obj, i2);
                } catch (Throwable unused) {
                    return new yh(-3);
                }
        }
    }
}
