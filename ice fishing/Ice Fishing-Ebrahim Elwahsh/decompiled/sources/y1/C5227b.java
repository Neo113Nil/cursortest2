package y1;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import s1.InterfaceC4992e;

/* renamed from: y1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5227b implements InterfaceC5244s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41823a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f41824b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f41825c;

    public /* synthetic */ C5227b(int i, Object obj, Object obj2) {
        this.f41823a = i;
        this.f41825c = obj;
        this.f41824b = obj2;
    }

    @Override // y1.InterfaceC5244s
    public final boolean a(Object obj) {
        switch (this.f41823a) {
            case 0:
                Uri uri = (Uri) obj;
                if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
                }
                break;
            case 1:
                break;
            case 2:
                Iterator it = ((ArrayList) this.f41825c).iterator();
                while (it.hasNext()) {
                    if (((InterfaceC5244s) it.next()).a(obj)) {
                        break;
                    }
                }
                break;
            case 3:
                break;
            default:
                Uri uri2 = (Uri) obj;
                if (!"android.resource".equals(uri2.getScheme()) || !((Context) this.f41825c).getPackageName().equals(uri2.getAuthority())) {
                }
                break;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, y1.g] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, y1.a] */
    @Override // y1.InterfaceC5244s
    public final C5243r b(Object obj, int i, int i4, s1.h hVar) {
        C5243r b9;
        Uri uri;
        switch (this.f41823a) {
            case 0:
                Uri uri2 = (Uri) obj;
                return new C5243r(new M1.d(uri2), this.f41824b.a((AssetManager) this.f41825c, uri2.toString().substring(22)));
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) hVar.c(D1.c.f680b);
                return new C5243r(new M1.d(num), new C5231f(theme, theme != null ? theme.getResources() : ((Context) this.f41825c).getResources(), this.f41824b, num.intValue()));
            case 2:
                ArrayList arrayList = (ArrayList) this.f41825c;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                InterfaceC4992e interfaceC4992e = null;
                for (int i9 = 0; i9 < size; i9++) {
                    InterfaceC5244s interfaceC5244s = (InterfaceC5244s) arrayList.get(i9);
                    if (interfaceC5244s.a(obj) && (b9 = interfaceC5244s.b(obj, i, i4, hVar)) != null) {
                        arrayList2.add(b9.f41859c);
                        interfaceC4992e = b9.f41857a;
                    }
                }
                if (arrayList2.isEmpty() || interfaceC4992e == null) {
                    return null;
                }
                return new C5243r(interfaceC4992e, new C5248w(arrayList2, (Y2.e) this.f41824b));
            case 3:
                Integer num2 = (Integer) obj;
                try {
                    uri = Uri.parse("android.resource://" + ((Resources) this.f41824b).getResourcePackageName(num2.intValue()) + '/' + num2);
                } catch (Resources.NotFoundException e6) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num2, e6);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((InterfaceC5244s) this.f41825c).b(uri, i, i4, hVar);
            default:
                Uri uri3 = (Uri) obj;
                List<String> pathSegments = uri3.getPathSegments();
                int size2 = pathSegments.size();
                InterfaceC5244s interfaceC5244s2 = (InterfaceC5244s) this.f41824b;
                C5243r c5243r = null;
                if (size2 == 1) {
                    try {
                        int parseInt = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (parseInt != 0) {
                            c5243r = interfaceC5244s2.b(Integer.valueOf(parseInt), i, i4, hVar);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri3);
                        }
                        return c5243r;
                    } catch (NumberFormatException e9) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return c5243r;
                        }
                        Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri3, e9);
                        return c5243r;
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
                Context context = (Context) this.f41825c;
                int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
                if (identifier != 0) {
                    return interfaceC5244s2.b(Integer.valueOf(identifier), i, i4, hVar);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri3);
                return null;
        }
    }

    public String toString() {
        switch (this.f41823a) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.f41825c).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public C5227b(Resources resources, InterfaceC5244s interfaceC5244s) {
        this.f41823a = 3;
        this.f41824b = resources;
        this.f41825c = interfaceC5244s;
    }

    public C5227b(Context context, InterfaceC5232g interfaceC5232g) {
        this.f41823a = 1;
        this.f41825c = context.getApplicationContext();
        this.f41824b = interfaceC5232g;
    }

    public C5227b(Context context, InterfaceC5244s interfaceC5244s) {
        this.f41823a = 4;
        this.f41825c = context.getApplicationContext();
        this.f41824b = interfaceC5244s;
    }
}
