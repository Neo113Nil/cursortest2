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
import s1.InterfaceC4970e;

/* renamed from: y1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5207b implements InterfaceC5223r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41785a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f41786b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f41787c;

    public /* synthetic */ C5207b(int i, Object obj, Object obj2) {
        this.f41785a = i;
        this.f41787c = obj;
        this.f41786b = obj2;
    }

    @Override // y1.InterfaceC5223r
    public final boolean a(Object obj) {
        switch (this.f41785a) {
            case 0:
                Uri uri = (Uri) obj;
                if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
                }
                break;
            case 1:
                break;
            case 2:
                Iterator it = ((ArrayList) this.f41787c).iterator();
                while (it.hasNext()) {
                    if (((InterfaceC5223r) it.next()).a(obj)) {
                        break;
                    }
                }
                break;
            case 3:
                break;
            default:
                Uri uri2 = (Uri) obj;
                if (!"android.resource".equals(uri2.getScheme()) || !((Context) this.f41787c).getPackageName().equals(uri2.getAuthority())) {
                }
                break;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, y1.f] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, y1.a] */
    @Override // y1.InterfaceC5223r
    public final C5222q b(Object obj, int i, int i6, s1.h hVar) {
        C5222q b9;
        Uri uri;
        switch (this.f41785a) {
            case 0:
                Uri uri2 = (Uri) obj;
                return new C5222q(new M1.d(uri2), this.f41786b.a((AssetManager) this.f41787c, uri2.toString().substring(22)));
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) hVar.c(D1.c.f625b);
                return new C5222q(new M1.d(num), new C5210e(theme, theme != null ? theme.getResources() : ((Context) this.f41787c).getResources(), this.f41786b, num.intValue()));
            case 2:
                ArrayList arrayList = (ArrayList) this.f41787c;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                InterfaceC4970e interfaceC4970e = null;
                for (int i9 = 0; i9 < size; i9++) {
                    InterfaceC5223r interfaceC5223r = (InterfaceC5223r) arrayList.get(i9);
                    if (interfaceC5223r.a(obj) && (b9 = interfaceC5223r.b(obj, i, i6, hVar)) != null) {
                        arrayList2.add(b9.f41819c);
                        interfaceC4970e = b9.f41817a;
                    }
                }
                if (arrayList2.isEmpty() || interfaceC4970e == null) {
                    return null;
                }
                return new C5222q(interfaceC4970e, new C5227v(arrayList2, (Z2.e) this.f41786b));
            case 3:
                Integer num2 = (Integer) obj;
                try {
                    uri = Uri.parse("android.resource://" + ((Resources) this.f41786b).getResourcePackageName(num2.intValue()) + '/' + num2);
                } catch (Resources.NotFoundException e9) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num2, e9);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((InterfaceC5223r) this.f41787c).b(uri, i, i6, hVar);
            default:
                Uri uri3 = (Uri) obj;
                List<String> pathSegments = uri3.getPathSegments();
                int size2 = pathSegments.size();
                InterfaceC5223r interfaceC5223r2 = (InterfaceC5223r) this.f41786b;
                C5222q c5222q = null;
                if (size2 == 1) {
                    try {
                        int parseInt = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (parseInt != 0) {
                            c5222q = interfaceC5223r2.b(Integer.valueOf(parseInt), i, i6, hVar);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri3);
                        }
                        return c5222q;
                    } catch (NumberFormatException e10) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return c5222q;
                        }
                        Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri3, e10);
                        return c5222q;
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
                Context context = (Context) this.f41787c;
                int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
                if (identifier != 0) {
                    return interfaceC5223r2.b(Integer.valueOf(identifier), i, i6, hVar);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri3);
                return null;
        }
    }

    public String toString() {
        switch (this.f41785a) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.f41787c).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public C5207b(Resources resources, InterfaceC5223r interfaceC5223r) {
        this.f41785a = 3;
        this.f41786b = resources;
        this.f41787c = interfaceC5223r;
    }

    public C5207b(Context context, InterfaceC5211f interfaceC5211f) {
        this.f41785a = 1;
        this.f41787c = context.getApplicationContext();
        this.f41786b = interfaceC5211f;
    }

    public C5207b(Context context, InterfaceC5223r interfaceC5223r) {
        this.f41785a = 4;
        this.f41787c = context.getApplicationContext();
        this.f41786b = interfaceC5223r;
    }
}
