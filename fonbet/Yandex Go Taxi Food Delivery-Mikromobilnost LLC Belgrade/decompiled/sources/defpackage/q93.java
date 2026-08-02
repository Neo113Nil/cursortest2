package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import coil.graphics.DataSource;
import coil.graphics.c;
import java.io.InputStream;
import java.util.List;
import kotlin.collections.a;
import kotlin.coroutines.Continuation;
import org.webrtc.MediaStreamTrack;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes10.dex */
public final class q93 implements rwq {
    public final /* synthetic */ int a;
    public final Uri b;
    public final qg70 c;

    public /* synthetic */ q93(Uri uri, qg70 qg70Var, int i) {
        this.a = i;
        this.b = uri;
        this.c = qg70Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c9  */
    @Override // defpackage.rwq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        InputStream openInputStream;
        List<String> pathSegments;
        int size;
        Bundle bundle;
        Integer l;
        Drawable drawable;
        int i = this.a;
        Uri uri = this.b;
        qg70 qg70Var = this.c;
        boolean z = true;
        switch (i) {
            case 0:
                String X = a.X(a.J(uri.getPathSegments(), 1), "/", null, null, null, 62);
                return new pjt0(c.b(new jci0(vng.H(qg70Var.a.getAssets().open(X))), qg70Var.a, new g93(X)), m.b(MimeTypeMap.getSingleton(), X), DataSource.DISK);
            case 1:
                ContentResolver contentResolver = qg70Var.a.getContentResolver();
                if (jl40.l(uri.getAuthority(), "com.android.contacts") && jl40.l(uri.getLastPathSegment(), "display_photo")) {
                    AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                    openInputStream = openAssetFileDescriptor != null ? openAssetFileDescriptor.createInputStream() : null;
                    if (openInputStream == null) {
                        xfo.g(g8e.m(uri, "Unable to find a contact photo associated with '", "'."));
                        return null;
                    }
                } else if (jl40.l(uri.getAuthority(), "media") && (size = (pathSegments = uri.getPathSegments()).size()) >= 3 && jl40.l(pathSegments.get(size - 3), MediaStreamTrack.AUDIO_TRACK_KIND) && jl40.l(pathSegments.get(size - 2), "albums")) {
                    wis0 wis0Var = qg70Var.d;
                    jh91 jh91Var = wis0Var.a;
                    lkj lkjVar = jh91Var instanceof lkj ? (lkj) jh91Var : null;
                    if (lkjVar != null) {
                        int i2 = lkjVar.a;
                        jh91 jh91Var2 = wis0Var.b;
                        lkj lkjVar2 = jh91Var2 instanceof lkj ? (lkj) jh91Var2 : null;
                        if (lkjVar2 != null) {
                            int i3 = lkjVar2.a;
                            bundle = new Bundle(1);
                            bundle.putParcelable("android.content.extra.SIZE", new Point(i2, i3));
                            AssetFileDescriptor openTypedAssetFile = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
                            openInputStream = openTypedAssetFile == null ? openTypedAssetFile.createInputStream() : null;
                            if (openInputStream == null) {
                                xfo.g(g8e.m(uri, "Unable to find a music thumbnail associated with '", "'."));
                                return null;
                            }
                        }
                    }
                    bundle = null;
                    AssetFileDescriptor openTypedAssetFile2 = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
                    if (openTypedAssetFile2 == null) {
                    }
                    if (openInputStream == null) {
                    }
                } else {
                    openInputStream = contentResolver.openInputStream(uri);
                    if (openInputStream == null) {
                        xfo.g(g8e.m(uri, "Unable to open '", "'."));
                        return null;
                    }
                }
                return new pjt0(c.b(new jci0(vng.H(openInputStream)), qg70Var.a, new zge(uri)), contentResolver.getType(uri), DataSource.DISK);
            default:
                String authority = uri.getAuthority();
                if (authority != null) {
                    if (evu0.J(authority)) {
                        authority = null;
                    }
                    if (authority != null) {
                        String str = (String) a.b0(uri.getPathSegments());
                        if (str == null || (l = bvu0.l(10, str)) == null) {
                            ny61.r(unr0.n(uri, "Invalid android.resource URI: "));
                            return null;
                        }
                        int intValue = l.intValue();
                        Context context = qg70Var.a;
                        Resources resources = authority.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
                        TypedValue typedValue = new TypedValue();
                        resources.getValue(intValue, typedValue, true);
                        CharSequence charSequence = typedValue.string;
                        String b = m.b(MimeTypeMap.getSingleton(), charSequence.subSequence(evu0.K(charSequence, '/', 0, 6), charSequence.length()).toString());
                        if (!jl40.l(b, "text/xml")) {
                            TypedValue typedValue2 = new TypedValue();
                            return new pjt0(c.b(new jci0(vng.H(resources.openRawResource(intValue, typedValue2))), context, new muj0(authority, intValue, typedValue2.density)), b, DataSource.DISK);
                        }
                        if (authority.equals(context.getPackageName())) {
                            drawable = nga1.d(intValue, context);
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
                            ThreadLocal threadLocal = wuj0.a;
                            drawable = resources.getDrawable(intValue, theme);
                            if (drawable == null) {
                                xfo.g(oyr.i(intValue, "Invalid resource ID: "));
                                return null;
                            }
                        }
                        if (!(drawable instanceof VectorDrawable) && !(drawable instanceof VectorDrawableCompat)) {
                            z = false;
                        }
                        if (z) {
                            drawable = new BitmapDrawable(context.getResources(), nm91.a(drawable, qg70Var.b, qg70Var.d, qg70Var.e, qg70Var.f));
                        }
                        return new mbm(drawable, z, DataSource.DISK);
                    }
                }
                ny61.r(unr0.n(uri, "Invalid android.resource URI: "));
                return null;
        }
    }
}
