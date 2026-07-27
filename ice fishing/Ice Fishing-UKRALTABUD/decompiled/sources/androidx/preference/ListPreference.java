package androidx.preference;

import I.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.icedrifter.arcticquest.R;
import o.g;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: m, reason: collision with root package name */
    public final CharSequence[] f1532m;

    /* renamed from: n, reason: collision with root package name */
    public final String f1533n;

    public ListPreference(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f399d, i2, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.f1532m = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        if (obtainStyledAttributes.getTextArray(3) == null) {
            obtainStyledAttributes.getTextArray(1);
        }
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (E.a.f289h == null) {
                E.a.f289h = new E.a(2);
            }
            this.f1540l = E.a.f289h;
            b();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.f401f, i2, 0);
        this.f1533n = g.s(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final CharSequence a() {
        E.a aVar = this.f1540l;
        if (aVar != null) {
            return aVar.l(this);
        }
        CharSequence a2 = super.a();
        String str = this.f1533n;
        if (str == null) {
            return a2;
        }
        String format = String.format(str, "");
        if (TextUtils.equals(format, a2)) {
            return a2;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i2) {
        return typedArray.getString(i2);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.r(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
