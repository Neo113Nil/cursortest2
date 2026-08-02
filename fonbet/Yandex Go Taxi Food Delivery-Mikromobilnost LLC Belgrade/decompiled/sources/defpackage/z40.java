package defpackage;

import android.content.Context;
import android.content.Intent;
import kotlin.collections.EmptyList;

/* loaded from: classes10.dex */
public class z40 extends x40 {
    @Override // defpackage.x40
    public final Intent a(Context context, Object obj) {
        return new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType((String) obj).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
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
        return intent != null ? ela1.e(intent) : EmptyList.a;
    }
}
