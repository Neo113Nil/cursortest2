package f0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;

/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0136a extends w {

    /* renamed from: k, reason: collision with root package name */
    public Intent f2899k;

    /* renamed from: l, reason: collision with root package name */
    public String f2900l;

    public static String f(Context context, String str) {
        if (str == null) {
            return null;
        }
        String packageName = context.getPackageName();
        D1.i.d(packageName, "context.packageName");
        return K1.l.f0(str, "${applicationId}", packageName);
    }

    @Override // f0.w
    public final void e(Context context, AttributeSet attributeSet) {
        super.e(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, P.f2896a);
        D1.i.d(obtainAttributes, "context.resources.obtain…leable.ActivityNavigator)");
        String f2 = f(context, obtainAttributes.getString(4));
        if (this.f2899k == null) {
            this.f2899k = new Intent();
        }
        Intent intent = this.f2899k;
        D1.i.b(intent);
        intent.setPackage(f2);
        String string = obtainAttributes.getString(0);
        if (string != null) {
            if (string.charAt(0) == '.') {
                string = context.getPackageName() + string;
            }
            ComponentName componentName = new ComponentName(context, string);
            if (this.f2899k == null) {
                this.f2899k = new Intent();
            }
            Intent intent2 = this.f2899k;
            D1.i.b(intent2);
            intent2.setComponent(componentName);
        }
        String string2 = obtainAttributes.getString(1);
        if (this.f2899k == null) {
            this.f2899k = new Intent();
        }
        Intent intent3 = this.f2899k;
        D1.i.b(intent3);
        intent3.setAction(string2);
        String f3 = f(context, obtainAttributes.getString(2));
        if (f3 != null) {
            Uri parse = Uri.parse(f3);
            if (this.f2899k == null) {
                this.f2899k = new Intent();
            }
            Intent intent4 = this.f2899k;
            D1.i.b(intent4);
            intent4.setData(parse);
        }
        this.f2900l = f(context, obtainAttributes.getString(3));
        obtainAttributes.recycle();
    }

    @Override // f0.w
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0136a)) {
            return false;
        }
        if (super.equals(obj)) {
            Intent intent = this.f2899k;
            if ((intent != null ? intent.filterEquals(((C0136a) obj).f2899k) : ((C0136a) obj).f2899k == null) && D1.i.a(this.f2900l, ((C0136a) obj).f2900l)) {
                return true;
            }
        }
        return false;
    }

    @Override // f0.w
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        Intent intent = this.f2899k;
        int filterHashCode = (hashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
        String str = this.f2900l;
        return filterHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // f0.w
    public final String toString() {
        Intent intent = this.f2899k;
        ComponentName component = intent != null ? intent.getComponent() : null;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (component != null) {
            sb.append(" class=");
            sb.append(component.getClassName());
        } else {
            Intent intent2 = this.f2899k;
            String action = intent2 != null ? intent2.getAction() : null;
            if (action != null) {
                sb.append(" action=");
                sb.append(action);
            }
        }
        String sb2 = sb.toString();
        D1.i.d(sb2, "sb.toString()");
        return sb2;
    }
}
