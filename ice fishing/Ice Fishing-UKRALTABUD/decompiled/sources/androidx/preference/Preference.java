package androidx.preference;

import E.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.icedrifter.arcticquest.R;
import o.g;

/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* renamed from: f, reason: collision with root package name */
    public final Context f1534f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1535g;

    /* renamed from: h, reason: collision with root package name */
    public final CharSequence f1536h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f1537i;

    /* renamed from: j, reason: collision with root package name */
    public final String f1538j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f1539k;

    /* renamed from: l, reason: collision with root package name */
    public a f1540l;

    public Preference(Context context, AttributeSet attributeSet, int i2) {
        this.f1535g = Integer.MAX_VALUE;
        this.f1534f = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I.a.f401f, i2, 0);
        obtainStyledAttributes.getResourceId(23, obtainStyledAttributes.getResourceId(0, 0));
        String string = obtainStyledAttributes.getString(26);
        this.f1538j = string == null ? obtainStyledAttributes.getString(6) : string;
        CharSequence text = obtainStyledAttributes.getText(34);
        this.f1536h = text == null ? obtainStyledAttributes.getText(4) : text;
        CharSequence text2 = obtainStyledAttributes.getText(33);
        this.f1537i = text2 == null ? obtainStyledAttributes.getText(7) : text2;
        this.f1535g = obtainStyledAttributes.getInt(28, obtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        if (obtainStyledAttributes.getString(22) == null) {
            obtainStyledAttributes.getString(13);
        }
        obtainStyledAttributes.getResourceId(27, obtainStyledAttributes.getResourceId(3, R.layout.preference));
        obtainStyledAttributes.getResourceId(35, obtainStyledAttributes.getResourceId(9, 0));
        obtainStyledAttributes.getBoolean(21, obtainStyledAttributes.getBoolean(2, true));
        boolean z2 = obtainStyledAttributes.getBoolean(30, obtainStyledAttributes.getBoolean(5, true));
        obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(1, true));
        g.s(obtainStyledAttributes, 19, 10);
        obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, z2));
        obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, z2));
        if (obtainStyledAttributes.hasValue(18)) {
            this.f1539k = c(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.f1539k = c(obtainStyledAttributes, 11);
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
        a aVar = this.f1540l;
        return aVar != null ? aVar.l(this) : this.f1537i;
    }

    public void b() {
    }

    public Object c(TypedArray typedArray, int i2) {
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i2 = preference2.f1535g;
        int i3 = this.f1535g;
        if (i3 != i2) {
            return i3 - i2;
        }
        CharSequence charSequence = preference2.f1536h;
        CharSequence charSequence2 = this.f1536h;
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
        CharSequence charSequence = this.f1536h;
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
        this(context, attributeSet, g.r(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }
}
