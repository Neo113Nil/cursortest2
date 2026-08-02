package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.WindowManager;

/* loaded from: classes5.dex */
public final class mtc extends ContextWrapper {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mtc(Context context, int i) {
        super(context);
        this.a = i;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Context getApplicationContext() {
        switch (this.a) {
            case 1:
                return new mtc(super.getApplicationContext(), 1);
            default:
                return super.getApplicationContext();
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        switch (this.a) {
            case 1:
                str.getClass();
                Object systemService = super.getSystemService(str);
                return (!"window".equals(str) || systemService == null) ? systemService : new pno((WindowManager) systemService);
            default:
                return super.getSystemService(str);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "FragmentContextWrapper:[" + getBaseContext().toString() + "]";
            default:
                return super.toString();
        }
    }
}
