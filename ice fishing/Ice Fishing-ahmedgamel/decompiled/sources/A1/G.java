package A1;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* loaded from: classes.dex */
public final class G implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31a;

    /* renamed from: b, reason: collision with root package name */
    public final x f32b;

    public /* synthetic */ G(x xVar, int i) {
        this.f31a = i;
        this.f32b = xVar;
    }

    @Override // A1.x
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        switch (this.f31a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // A1.x
    public final w b(Object obj, int i, int i4, u1.h hVar) {
        Uri fromFile;
        switch (this.f31a) {
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
                x xVar = this.f32b;
                if (xVar.a(fromFile)) {
                    return xVar.b(fromFile, i, i4, hVar);
                }
                return null;
            default:
                return this.f32b.b(new m((URL) obj), i, i4, hVar);
        }
    }
}
