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
import java.util.Objects;

/* loaded from: classes10.dex */
public final class s93 implements q430 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public s93(Context context, clj cljVar) {
        this.a = 1;
        this.b = context.getApplicationContext();
        this.c = cljVar;
    }

    @Override // defpackage.q430
    public final p430 a(Object obj, int i, int i2, mg70 mg70Var) {
        mzq mzqVar;
        p430 a;
        Uri uri;
        int i3 = this.a;
        p430 p430Var = null;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i3) {
            case 0:
                Uri uri2 = (Uri) obj;
                String substring = uri2.toString().substring(22);
                lp60 lp60Var = new lp60(uri2);
                AssetManager assetManager = (AssetManager) obj2;
                switch (((r93) obj3).a) {
                    case 0:
                        mzqVar = new mzq(assetManager, substring, 0);
                        break;
                    default:
                        mzqVar = new mzq(assetManager, substring, 1);
                        break;
                }
                return new p430(lp60Var, mzqVar);
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) mg70Var.c(utj0.b);
                return new p430(new lp60(num), new dlj(theme, theme != null ? theme.getResources() : ((Context) obj2).getResources(), (clj) obj3, num.intValue()));
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                khx khxVar = null;
                for (int i4 = 0; i4 < size; i4++) {
                    q430 q430Var = (q430) arrayList.get(i4);
                    if (q430Var.b(obj) && (a = q430Var.a(obj, i, i2, mg70Var)) != null) {
                        khxVar = a.a;
                        arrayList2.add(a.c);
                    }
                }
                if (arrayList2.isEmpty() || khxVar == null) {
                    return null;
                }
                return new p430(khxVar, new rl40(arrayList2, (l6e0) obj3));
            case 3:
                Integer num2 = (Integer) obj;
                Resources resources = (Resources) obj3;
                try {
                    uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num2.intValue()) + '/' + resources.getResourceTypeName(num2.intValue()) + '/' + resources.getResourceEntryName(num2.intValue()));
                } catch (Resources.NotFoundException unused) {
                    Log.isLoggable("ResourceLoader", 5);
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((q430) obj2).a(uri, i, i2, mg70Var);
            default:
                Uri uri3 = (Uri) obj;
                q430 q430Var2 = (q430) obj3;
                List<String> pathSegments = uri3.getPathSegments();
                if (pathSegments.size() == 1) {
                    try {
                        int parseInt = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (parseInt != 0) {
                            p430Var = q430Var2.a(Integer.valueOf(parseInt), i, i2, mg70Var);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            uri3.toString();
                        }
                        return p430Var;
                    } catch (NumberFormatException unused2) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return p430Var;
                        }
                        Objects.toString(uri3);
                        return p430Var;
                    }
                }
                if (pathSegments.size() != 2) {
                    if (!Log.isLoggable("ResourceUriLoader", 5)) {
                        return null;
                    }
                    uri3.toString();
                    return null;
                }
                List<String> pathSegments2 = uri3.getPathSegments();
                Context context = (Context) obj2;
                int identifier = context.getResources().getIdentifier(pathSegments2.get(1), pathSegments2.get(0), context.getPackageName());
                if (identifier != 0) {
                    return q430Var2.a(Integer.valueOf(identifier), i, i2, mg70Var);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                uri3.toString();
                return null;
        }
    }

    @Override // defpackage.q430
    public final boolean b(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Uri uri = (Uri) obj;
                if ("file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0))) {
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                Iterator it = ((ArrayList) obj2).iterator();
                while (it.hasNext()) {
                    if (((q430) it.next()).b(obj)) {
                        break;
                    }
                }
                break;
            case 3:
                break;
            default:
                Uri uri2 = (Uri) obj;
                if ("android.resource".equals(uri2.getScheme()) && ((Context) obj2).getPackageName().equals(uri2.getAuthority())) {
                    break;
                }
                break;
        }
        return true;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.b).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public s93(Resources resources, q430 q430Var) {
        this.a = 3;
        this.c = resources;
        this.b = q430Var;
    }

    public /* synthetic */ s93(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public s93(Context context, q430 q430Var) {
        this.a = 4;
        this.b = context.getApplicationContext();
        this.c = q430Var;
    }
}
