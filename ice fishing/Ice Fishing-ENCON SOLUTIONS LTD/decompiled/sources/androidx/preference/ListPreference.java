package androidx.preference;

import M.a;
import R1.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.watchfacestudio.spraktum.R;
import m0.j;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: h, reason: collision with root package name */
    public final CharSequence[] f2505h;

    /* renamed from: i, reason: collision with root package name */
    public final String f2506i;

    public ListPreference(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1074d, i2, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.f2505h = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        if (obtainStyledAttributes.getTextArray(3) == null) {
            obtainStyledAttributes.getTextArray(1);
        }
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (j.f8181d == null) {
                j.f8181d = new j(7, false);
            }
            this.f2513g = j.f8181d;
            b();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.f1076f, i2, 0);
        this.f2506i = d.r(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final CharSequence a() {
        j jVar = this.f2513g;
        if (jVar != null) {
            return jVar.n(this);
        }
        CharSequence a2 = super.a();
        String str = this.f2506i;
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
        this(context, attributeSet, d.o(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
