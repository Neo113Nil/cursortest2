package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* loaded from: classes10.dex */
public final class utu0 implements q430 {
    public final /* synthetic */ int a;
    public final q430 b;

    public /* synthetic */ utu0(q430 q430Var, int i) {
        this.a = i;
        this.b = q430Var;
    }

    @Override // defpackage.q430
    public final p430 a(Object obj, int i, int i2, mg70 mg70Var) {
        Uri fromFile;
        int i3 = this.a;
        q430 q430Var = this.b;
        switch (i3) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    fromFile = null;
                } else if (str.charAt(0) == '/') {
                    fromFile = Uri.fromFile(new File(str));
                } else {
                    Uri parse = Uri.parse(str);
                    fromFile = parse.getScheme() == null ? Uri.fromFile(new File(str)) : parse;
                }
                if (fromFile == null || !q430Var.b(fromFile)) {
                    return null;
                }
                return q430Var.a(fromFile, i, i2, mg70Var);
            default:
                return q430Var.a(new cit((URL) obj), i, i2, mg70Var);
        }
    }

    @Override // defpackage.q430
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}
