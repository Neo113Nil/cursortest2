package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class fr1 implements kci {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public fr1(Context context, i48 i48Var) {
        this.a = 1;
        this.c = context.getApplicationContext();
        this.b = i48Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [er1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [i48, java.lang.Object] */
    @Override // defpackage.kci
    public final jci a(Object obj, int i, int i2, pwj pwjVar) {
        jci a;
        Uri uri;
        switch (this.a) {
            case 0:
                Uri uri2 = (Uri) obj;
                return new jci(new vhj(uri2), this.b.K((AssetManager) this.c, uri2.toString().substring(22)));
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) pwjVar.c(q2o.b);
                return new jci(new vhj(num), new h48(theme, theme != null ? theme.getResources() : ((Context) this.c).getResources(), this.b, num.intValue()));
            case 2:
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                daf dafVar = null;
                for (int i3 = 0; i3 < size; i3++) {
                    kci kciVar = (kci) arrayList.get(i3);
                    if (kciVar.b(obj) && (a = kciVar.a(obj, i, i2, pwjVar)) != null) {
                        dafVar = a.a;
                        arrayList2.add(a.c);
                    }
                }
                if (arrayList2.isEmpty() || dafVar == null) {
                    return null;
                }
                return new jci(dafVar, new lgi(arrayList2, (chm) this.b));
            case 3:
                Integer num2 = (Integer) obj;
                Resources resources = (Resources) this.b;
                try {
                    uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num2.intValue()) + '/' + resources.getResourceTypeName(num2.intValue()) + '/' + resources.getResourceEntryName(num2.intValue()));
                } catch (Resources.NotFoundException e) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num2, e);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((kci) this.c).a(uri, i, i2, pwjVar);
            default:
                Uri uri3 = (Uri) obj;
                kci kciVar2 = (kci) this.b;
                List<String> pathSegments = uri3.getPathSegments();
                jci jciVar = null;
                if (pathSegments.size() == 1) {
                    try {
                        int parseInt = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (parseInt != 0) {
                            jciVar = kciVar2.a(Integer.valueOf(parseInt), i, i2, pwjVar);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri3);
                        }
                        return jciVar;
                    } catch (NumberFormatException e2) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return jciVar;
                        }
                        Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri3, e2);
                        return jciVar;
                    }
                }
                if (pathSegments.size() != 2) {
                    if (!Log.isLoggable("ResourceUriLoader", 5)) {
                        return null;
                    }
                    Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri3);
                    return null;
                }
                List<String> pathSegments2 = uri3.getPathSegments();
                String str = pathSegments2.get(0);
                String str2 = pathSegments2.get(1);
                Context context = (Context) this.c;
                int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
                if (identifier != 0) {
                    return kciVar2.a(Integer.valueOf(identifier), i, i2, pwjVar);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri3);
                return null;
        }
    }

    @Override // defpackage.kci
    public final boolean b(Object obj) {
        switch (this.a) {
            case 0:
                Uri uri = (Uri) obj;
                return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
            case 1:
                return true;
            case 2:
                Iterator it = ((ArrayList) this.c).iterator();
                while (it.hasNext()) {
                    if (((kci) it.next()).b(obj)) {
                        return true;
                    }
                }
                return false;
            case 3:
                return true;
            default:
                Uri uri2 = (Uri) obj;
                return "android.resource".equals(uri2.getScheme()) && ((Context) this.c).getPackageName().equals(uri2.getAuthority());
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.c).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public fr1(Resources resources, kci kciVar) {
        this.a = 3;
        this.b = resources;
        this.c = kciVar;
    }

    public /* synthetic */ fr1(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public fr1(Context context, kci kciVar) {
        this.a = 4;
        this.c = context.getApplicationContext();
        this.b = kciVar;
    }
}
