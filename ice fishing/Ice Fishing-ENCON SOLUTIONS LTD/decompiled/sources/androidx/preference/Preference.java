package androidx.preference;

import M.a;
import R1.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.watchfacestudio.spraktum.R;
import m0.j;

/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2507a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2508b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f2509c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f2510d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2511e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2512f;

    /* renamed from: g, reason: collision with root package name */
    public j f2513g;

    public Preference(Context context, AttributeSet attributeSet, int i2) {
        this.f2508b = Integer.MAX_VALUE;
        this.f2507a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1076f, i2, 0);
        obtainStyledAttributes.getResourceId(23, obtainStyledAttributes.getResourceId(0, 0));
        String string = obtainStyledAttributes.getString(26);
        this.f2511e = string == null ? obtainStyledAttributes.getString(6) : string;
        CharSequence text = obtainStyledAttributes.getText(34);
        this.f2509c = text == null ? obtainStyledAttributes.getText(4) : text;
        CharSequence text2 = obtainStyledAttributes.getText(33);
        this.f2510d = text2 == null ? obtainStyledAttributes.getText(7) : text2;
        this.f2508b = obtainStyledAttributes.getInt(28, obtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        if (obtainStyledAttributes.getString(22) == null) {
            obtainStyledAttributes.getString(13);
        }
        obtainStyledAttributes.getResourceId(27, obtainStyledAttributes.getResourceId(3, R.layout.preference));
        obtainStyledAttributes.getResourceId(35, obtainStyledAttributes.getResourceId(9, 0));
        obtainStyledAttributes.getBoolean(21, obtainStyledAttributes.getBoolean(2, true));
        boolean z2 = obtainStyledAttributes.getBoolean(30, obtainStyledAttributes.getBoolean(5, true));
        obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(1, true));
        d.r(obtainStyledAttributes, 19, 10);
        obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, z2));
        obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, z2));
        if (obtainStyledAttributes.hasValue(18)) {
            this.f2512f = c(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.f2512f = c(obtainStyledAttributes, 11);
        }
        obtainStyledAttributes.getBoolean(31, obtainStyledAttributes.getBoolean(12, true));
        if (obtainStyledAttributes.hasValue(32)) {
            obtainStyledAttributes.getBoolean(32, obtainStyledAttributes.getBoolean(14, true));
        }
        obtainStyledAttributes.getBoolean(24, obtainStyledAttributes.getBoolean(15, false));
        obtainStyledAttributes.getBoolean(25, obtainStyledAttributes.getBoolean(25, true));
        obtainStyledAttributes.getBoolean(20, obtainStyledAttributes.getBoolean(20, false));
        obtainStyledAttributes.recycle();
    }

    public CharSequence a() {
        j jVar = this.f2513g;
        return jVar != null ? jVar.n(this) : this.f2510d;
    }

    public void b() {
    }

    public Object c(TypedArray typedArray, int i2) {
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i2 = preference2.f2508b;
        int i3 = this.f2508b;
        if (i3 != i2) {
            return i3 - i2;
        }
        CharSequence charSequence = preference2.f2509c;
        CharSequence charSequence2 = this.f2509c;
        if (charSequence2 == charSequence) {
            return 0;
        }
        if (charSequence2 == null) {
            return 1;
        }
        if (charSequence == null) {
            return -1;
        }
        return charSequence2.toString().compareToIgnoreCase(charSequence.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f2509c;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence a2 = a();
        if (!TextUtils.isEmpty(a2)) {
            sb.append(a2);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.o(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }
}
