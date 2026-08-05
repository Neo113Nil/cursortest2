package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class QhQjwNAr extends pu {
    public Intent Qr9iLBAD;
    public String jb9XjC4I;

    public static String b2ZJblxo(Context context, String str) {
        if (str == null) {
            return null;
        }
        String packageName = context.getPackageName();
        packageName.getClass();
        return ja0.KlHjfFWx(str, "${applicationId}", packageName);
    }

    @Override // defpackage.pu
    public final void P7K7Inc8(Context context, AttributeSet attributeSet) {
        super.P7K7Inc8(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, u00.qoPGr6Ce);
        obtainAttributes.getClass();
        String b2ZJblxo = b2ZJblxo(context, obtainAttributes.getString(4));
        Intent intent = this.Qr9iLBAD;
        if (intent == null) {
            intent = new Intent();
            this.Qr9iLBAD = intent;
        }
        intent.setPackage(b2ZJblxo);
        String string = obtainAttributes.getString(0);
        if (string != null) {
            if (string.charAt(0) == '.') {
                string = context.getPackageName() + string;
            }
            ComponentName componentName = new ComponentName(context, string);
            Intent intent2 = this.Qr9iLBAD;
            if (intent2 == null) {
                intent2 = new Intent();
                this.Qr9iLBAD = intent2;
            }
            intent2.setComponent(componentName);
        }
        String string2 = obtainAttributes.getString(1);
        Intent intent3 = this.Qr9iLBAD;
        if (intent3 == null) {
            intent3 = new Intent();
            this.Qr9iLBAD = intent3;
        }
        intent3.setAction(string2);
        String b2ZJblxo2 = b2ZJblxo(context, obtainAttributes.getString(2));
        if (b2ZJblxo2 != null) {
            Uri parse = Uri.parse(b2ZJblxo2);
            Intent intent4 = this.Qr9iLBAD;
            if (intent4 == null) {
                intent4 = new Intent();
                this.Qr9iLBAD = intent4;
            }
            intent4.setData(parse);
        }
        this.jb9XjC4I = b2ZJblxo(context, obtainAttributes.getString(3));
        obtainAttributes.recycle();
    }

    @Override // defpackage.pu
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof QhQjwNAr) && super.equals(obj)) {
            Intent intent = this.Qr9iLBAD;
            if ((intent != null ? intent.filterEquals(((QhQjwNAr) obj).Qr9iLBAD) : ((QhQjwNAr) obj).Qr9iLBAD == null) && fn.qoPGr6Ce(this.jb9XjC4I, ((QhQjwNAr) obj).jb9XjC4I)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.pu
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        Intent intent = this.Qr9iLBAD;
        int filterHashCode = (hashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
        String str = this.jb9XjC4I;
        return filterHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.pu
    public final String toString() {
        Intent intent = this.Qr9iLBAD;
        ComponentName component = intent != null ? intent.getComponent() : null;
        StringBuilder sb = new StringBuilder(super.toString());
        if (component != null) {
            sb.append(" class=");
            sb.append(component.getClassName());
        } else {
            Intent intent2 = this.Qr9iLBAD;
            String action = intent2 != null ? intent2.getAction() : null;
            if (action != null) {
                sb.append(" action=");
                sb.append(action);
            }
        }
        return sb.toString();
    }
}
