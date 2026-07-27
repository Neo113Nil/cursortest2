package androidx.preference;

import I.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.icecatchbiger.hookfrostmaster.R;
import o.g;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: l, reason: collision with root package name */
    public final CharSequence[] f1540l;

    /* renamed from: m, reason: collision with root package name */
    public final String f1541m;

    public ListPreference(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f407d, i2, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.f1540l = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        if (obtainStyledAttributes.getTextArray(3) == null) {
            obtainStyledAttributes.getTextArray(1);
        }
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (E.a.f290g == null) {
                E.a.f290g = new E.a(2);
            }
            this.f1548k = E.a.f290g;
            b();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.f409f, i2, 0);
        this.f1541m = g.p(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final CharSequence a() {
        E.a aVar = this.f1548k;
        if (aVar != null) {
            return aVar.l(this);
        }
        CharSequence a2 = super.a();
        String str = this.f1541m;
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
        this(context, attributeSet, g.o(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
