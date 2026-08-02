package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class dr1 implements s8c {
    public final /* synthetic */ int a;
    public final Uri b;
    public final rwj c;

    public /* synthetic */ dr1(Uri uri, rwj rwjVar, int i) {
        this.a = i;
        this.b = uri;
        this.c = rwjVar;
    }

    @Override // defpackage.s8c
    public final Object a(Continuation continuation) {
        Integer intOrNull;
        Drawable drawable;
        int i = this.a;
        Uri uri = this.b;
        rwj rwjVar = this.c;
        boolean z = true;
        switch (i) {
            case 0:
                String X = CollectionsKt.X(CollectionsKt.L(uri.getPathSegments(), 1), "/", null, null, null, 62);
                return new r3r(new p3r(new ikn(fxf.T(rwjVar.a.getAssets().open(X))), new ji7(rwjVar.a, 4), new zq1(X)), k.b(MimeTypeMap.getSingleton(), X), bb7.c);
            default:
                String authority = uri.getAuthority();
                if (authority != null) {
                    if (StringsKt.U(authority)) {
                        authority = null;
                    }
                    if (authority != null) {
                        String str = (String) CollectionsKt.Z(uri.getPathSegments());
                        if (str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) {
                            xq0.q(k5r.k(uri, "Invalid android.resource URI: "));
                            return null;
                        }
                        int intValue = intOrNull.intValue();
                        Context context = rwjVar.a;
                        Resources resources = authority.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
                        TypedValue typedValue = new TypedValue();
                        resources.getValue(intValue, typedValue, true);
                        CharSequence charSequence = typedValue.string;
                        String b = k.b(MimeTypeMap.getSingleton(), charSequence.subSequence(StringsKt.W(charSequence, '/', 0, 6), charSequence.length()).toString());
                        if (!Intrinsics.d(b, "text/xml")) {
                            TypedValue typedValue2 = new TypedValue();
                            return new r3r(new p3r(new ikn(fxf.T(resources.openRawResource(intValue, typedValue2))), new ji7(context, 4), new x2o(authority, intValue, typedValue2.density)), b, bb7.c);
                        }
                        if (authority.equals(context.getPackageName())) {
                            drawable = y2x.w(context, intValue);
                            if (drawable == null) {
                                wb8.h(k5r.i(intValue, "Invalid resource ID: "));
                                return null;
                            }
                        } else {
                            XmlResourceParser xml = resources.getXml(intValue);
                            int next = xml.next();
                            while (next != 2 && next != 1) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found.");
                            }
                            Resources.Theme theme = context.getTheme();
                            ThreadLocal threadLocal = e3o.a;
                            drawable = resources.getDrawable(intValue, theme);
                            if (drawable == null) {
                                wb8.h(k5r.i(intValue, "Invalid resource ID: "));
                                return null;
                            }
                        }
                        if (!(drawable instanceof VectorDrawable) && !(drawable instanceof kzt)) {
                            z = false;
                        }
                        if (z) {
                            drawable = new BitmapDrawable(context.getResources(), lg3.M(drawable, rwjVar.b, rwjVar.d, rwjVar.e, rwjVar.f));
                        }
                        return new qpa(drawable, z, bb7.c);
                    }
                }
                xq0.q(k5r.k(uri, "Invalid android.resource URI: "));
                return null;
        }
    }
}
