package y1;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* loaded from: classes.dex */
public final class y implements InterfaceC5223r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41839a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5223r f41840b;

    public /* synthetic */ y(InterfaceC5223r interfaceC5223r, int i) {
        this.f41839a = i;
        this.f41840b = interfaceC5223r;
    }

    @Override // y1.InterfaceC5223r
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        switch (this.f41839a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // y1.InterfaceC5223r
    public final C5222q b(Object obj, int i, int i6, s1.h hVar) {
        Uri fromFile;
        switch (this.f41839a) {
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
                InterfaceC5223r interfaceC5223r = this.f41840b;
                if (interfaceC5223r.a(fromFile)) {
                    return interfaceC5223r.b(fromFile, i, i6, hVar);
                }
                return null;
            default:
                return this.f41840b.b(new C5213h((URL) obj), i, i6, hVar);
        }
    }
}
