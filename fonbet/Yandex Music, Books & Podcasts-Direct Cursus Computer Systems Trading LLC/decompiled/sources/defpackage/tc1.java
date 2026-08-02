package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class tc1 implements lci, i48 {
    public final Context a;

    public tc1(Context context, int i) {
        context.getClass();
        switch (i) {
            case 3:
                this.a = context;
                break;
            default:
                this.a = context;
                break;
        }
    }

    @Override // defpackage.i48
    public Class a() {
        return AssetFileDescriptor.class;
    }

    public String b(int i) {
        String string = this.a.getString(i);
        string.getClass();
        return string;
    }

    public String c(int i, Object[] objArr) {
        String string = this.a.getString(i, Arrays.copyOf(objArr, objArr.length));
        string.getClass();
        return string;
    }

    @Override // defpackage.i48
    public void l(Object obj) {
        ((AssetFileDescriptor) obj).close();
    }

    @Override // defpackage.i48
    public Object m(int i, Resources.Theme theme, Resources resources) {
        return resources.openRawResourceFd(i);
    }

    @Override // defpackage.lci
    public kci y(kkp kkpVar) {
        return new fr1(this.a, this);
    }

    public /* synthetic */ tc1(Context context, byte b) {
        this.a = context;
    }
}
