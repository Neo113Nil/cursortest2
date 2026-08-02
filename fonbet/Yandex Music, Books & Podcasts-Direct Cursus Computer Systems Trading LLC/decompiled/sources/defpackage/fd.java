package defpackage;

import android.content.Intent;

/* loaded from: classes.dex */
public final class fd implements xjn, kzc {
    public String a;

    public /* synthetic */ fd(String str) {
        this.a = str;
    }

    @Override // defpackage.sjn
    public Object getValue(Object obj, s9f s9fVar) {
        Intent intent = (Intent) obj;
        intent.getClass();
        s9fVar.getClass();
        return intent.getStringExtra(this.a);
    }

    @Override // defpackage.kzc
    public void onFailure(Throwable th) {
        vq1.o0("MediaNtfMng", "custom command " + this.a + " produced an error: " + th.getMessage(), th);
    }

    @Override // defpackage.kzc
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
    }

    @Override // defpackage.xjn
    public void setValue(Object obj, s9f s9fVar, Object obj2) {
        Intent intent = (Intent) obj;
        intent.getClass();
        s9fVar.getClass();
        String str = this.a;
        if (obj2 == null) {
            intent.removeExtra(str);
        } else {
            intent.putExtra(str, (String) obj2);
        }
    }
}
