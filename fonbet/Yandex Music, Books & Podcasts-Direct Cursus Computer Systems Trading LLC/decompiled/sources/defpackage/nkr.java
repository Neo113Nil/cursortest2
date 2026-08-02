package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* loaded from: classes.dex */
public final class nkr implements kci {
    public final /* synthetic */ int a;
    public final kci b;

    public /* synthetic */ nkr(kci kciVar, int i) {
        this.a = i;
        this.b = kciVar;
    }

    @Override // defpackage.kci
    public final jci a(Object obj, int i, int i2, pwj pwjVar) {
        Uri fromFile;
        switch (this.a) {
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
                if (fromFile == null) {
                    return null;
                }
                kci kciVar = this.b;
                if (kciVar.b(fromFile)) {
                    return kciVar.a(fromFile, i, i2, pwjVar);
                }
                return null;
            default:
                return this.b.a(new old((URL) obj), i, i2, pwjVar);
        }
    }

    @Override // defpackage.kci
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
