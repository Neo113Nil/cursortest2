package defpackage;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes10.dex */
public class y40 extends x40 {
    @Override // defpackage.x40
    public final Intent a(Context context, Object obj) {
        return new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType((String) obj);
    }

    @Override // defpackage.x40
    public final /* bridge */ /* synthetic */ w40 b(Context context, Object obj) {
        return null;
    }

    @Override // defpackage.x40
    public final Object c(int i, Intent intent) {
        if (i != -1) {
            intent = null;
        }
        if (intent != null) {
            return intent.getData();
        }
        return null;
    }
}
