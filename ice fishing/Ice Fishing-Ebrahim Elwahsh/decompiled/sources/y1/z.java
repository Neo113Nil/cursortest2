package y1;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* loaded from: classes.dex */
public final class z implements InterfaceC5244s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41879a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5244s f41880b;

    public /* synthetic */ z(InterfaceC5244s interfaceC5244s, int i) {
        this.f41879a = i;
        this.f41880b = interfaceC5244s;
    }

    @Override // y1.InterfaceC5244s
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        switch (this.f41879a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // y1.InterfaceC5244s
    public final C5243r b(Object obj, int i, int i4, s1.h hVar) {
        Uri fromFile;
        switch (this.f41879a) {
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
                InterfaceC5244s interfaceC5244s = this.f41880b;
                if (interfaceC5244s.a(fromFile)) {
                    return interfaceC5244s.b(fromFile, i, i4, hVar);
                }
                return null;
            default:
                return this.f41880b.b(new C5234i((URL) obj), i, i4, hVar);
        }
    }
}
