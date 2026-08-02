package A1;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import u1.InterfaceC5066e;

/* renamed from: A1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0260b implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f45b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f46c;

    public /* synthetic */ C0260b(int i, Object obj, Object obj2) {
        this.f44a = i;
        this.f46c = obj;
        this.f45b = obj2;
    }

    @Override // A1.x
    public final boolean a(Object obj) {
        switch (this.f44a) {
            case 0:
                Uri uri = (Uri) obj;
                if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
                }
                break;
            case 1:
                break;
            case 2:
                Iterator it = ((ArrayList) this.f46c).iterator();
                while (it.hasNext()) {
                    if (((x) it.next()).a(obj)) {
                        break;
                    }
                }
                break;
            case 3:
                break;
            default:
                Uri uri2 = (Uri) obj;
                if (!"android.resource".equals(uri2.getScheme()) || !((Context) this.f46c).getPackageName().equals(uri2.getAuthority())) {
                }
                break;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [A1.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [A1.a, java.lang.Object] */
    @Override // A1.x
    public final w b(Object obj, int i, int i4, u1.h hVar) {
        w b9;
        Uri uri;
        switch (this.f44a) {
            case 0:
                Uri uri2 = (Uri) obj;
                return new w(new O1.d(uri2), this.f45b.q((AssetManager) this.f46c, uri2.toString().substring(22)));
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) hVar.c(F1.c.f969b);
                return new w(new O1.d(num), new C0267i(theme, theme != null ? theme.getResources() : ((Context) this.f46c).getResources(), this.f45b, num.intValue()));
            case 2:
                ArrayList arrayList = (ArrayList) this.f46c;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                InterfaceC5066e interfaceC5066e = null;
                for (int i6 = 0; i6 < size; i6++) {
                    x xVar = (x) arrayList.get(i6);
                    if (xVar.a(obj) && (b9 = xVar.b(obj, i, i4, hVar)) != null) {
                        arrayList2.add(b9.f92c);
                        interfaceC5066e = b9.f90a;
                    }
                }
                if (arrayList2.isEmpty() || interfaceC5066e == null) {
                    return null;
                }
                return new w(interfaceC5066e, new C(arrayList2, (b3.e) this.f45b));
            case 3:
                Integer num2 = (Integer) obj;
                try {
                    uri = Uri.parse("android.resource://" + ((Resources) this.f45b).getResourcePackageName(num2.intValue()) + '/' + num2);
                } catch (Resources.NotFoundException e9) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num2, e9);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((x) this.f46c).b(uri, i, i4, hVar);
            default:
                Uri uri3 = (Uri) obj;
                List<String> pathSegments = uri3.getPathSegments();
                int size2 = pathSegments.size();
                x xVar2 = (x) this.f45b;
                w wVar = null;
                if (size2 == 1) {
                    try {
                        int parseInt = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (parseInt != 0) {
                            wVar = xVar2.b(Integer.valueOf(parseInt), i, i4, hVar);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri3);
                        }
                        return wVar;
                    } catch (NumberFormatException e10) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return wVar;
                        }
                        Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri3, e10);
                        return wVar;
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
                Context context = (Context) this.f46c;
                int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
                if (identifier != 0) {
                    return xVar2.b(Integer.valueOf(identifier), i, i4, hVar);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri3);
                return null;
        }
    }

    public String toString() {
        switch (this.f44a) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.f46c).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public C0260b(Resources resources, x xVar) {
        this.f44a = 3;
        this.f45b = resources;
        this.f46c = xVar;
    }

    public C0260b(Context context, InterfaceC0268j interfaceC0268j) {
        this.f44a = 1;
        this.f46c = context.getApplicationContext();
        this.f45b = interfaceC0268j;
    }

    public C0260b(Context context, x xVar) {
        this.f44a = 4;
        this.f46c = context.getApplicationContext();
        this.f45b = xVar;
    }
}
